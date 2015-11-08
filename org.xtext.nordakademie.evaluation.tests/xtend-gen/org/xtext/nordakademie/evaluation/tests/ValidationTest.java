package org.xtext.nordakademie.evaluation.tests;

import javax.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.nordakademie.evaluation.EvaluationInjectorProvider;
import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage;
import org.xtext.nordakademie.evaluation.evaluation.Survey;

@RunWith(XtextRunner.class)
@InjectWith(EvaluationInjectorProvider.class)
@SuppressWarnings("all")
public class ValidationTest {
  @Inject
  @Extension
  private ParseHelper<Survey> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper validationTestHelper;
  
  @Test
  public void testSurveyComplete() {
    try {
      Survey _parse = this.parseHelper.parse("survey Testname \r\n\t\t\t\"Testtitel der Umfrage\" \r\n\t\t\t\"Testbegrüßung der Umfrage\"\r\n\r\n\t\t\tpage Testseite1 (\r\n\t\t\t\tfreetext Testfrage \"Testfrage der Testseite1\"\r\n\t\t\t\tforwarding to -> Testseite2\r\n\t\t\t)\r\n\t\t\t\r\n\t\t\tpage Testseite2 (\r\n\t\t\t\trating Testbewertung \"Testfrage der Testseite2\" 10\r\n\t\t\t\tforwarding to -> Testseite3\r\n\t\t\t)\r\n\r\n\t\t\tpage Testseite3 (\r\n\t\t\t\tselect Testauswahl \"Testfrage der Testseite3\"\r\n\t\t\t\t(Testauswahlfeld1 \"Testauswahlfeld\") \r\n\t\t\t\tforwarding to -> Testseite4\r\n\t\t\t)\r\n\r\n\t\t\tpage Testseite4 (\r\n\t\t\t\tchart Testtabelle \"Testfrage der Testseite4\"\r\n\t\t\t\t(Testauswahlfeld1 \"Testauswahlfeld1\" Testauswahlfeld2 \"Testauswahlfeld2\") x (Gewichtung1 \"Gewichtung1\" Gewichtung2 \"Gewichtung2\")\r\n\t\t\t\tforwarding to -> Seite5\r\n\t\t\t)\r\n\r\n\t\t\tpage Seite5 (\r\n\t\t\t\tselect oneChoice TestEntscheidung \"Testfrage der Testseite5\" \r\n\t\t\t\t(Alternative1 \"M\" Alternative2 \"W\")\r\n\t\t\t)\r\n\t\t");
      this.validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSurveyWithoutPage() {
    try {
      final String model = "survey Test \"...\"\r\n                 \r\n\t\t\t";
      final Survey survey = this.parseHelper.parse(model);
      this.validationTestHelper.assertError(survey, EvaluationPackage.Literals.SURVEY, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPageWithoutQuestion() {
    try {
      final String model = "survey Test \"...\"\r\n                 page Seite1 ( )\r\n\t\t\t";
      final Survey survey = this.parseHelper.parse(model);
      this.validationTestHelper.assertError(survey, EvaluationPackage.Literals.PAGE, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEmptyQuestion() {
    try {
      final String model = "survey Test \"...\"\r\n                 page Seite1 (\"\")\r\n\t\t\t";
      final Survey survey = this.parseHelper.parse(model);
      this.validationTestHelper.assertError(survey, EvaluationPackage.Literals.PAGE, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEmptyBulletPoints() {
    try {
      final String model = "survey Test \"...\"\r\n                 page Seite1 (\r\n\t\t\t\tselect Frage1 \"...\" (Alt1 \"\" )\r\n\t\t\t\t)\r\n\t\t\t";
      final Survey survey = this.parseHelper.parse(model);
      this.validationTestHelper.assertError(survey, EvaluationPackage.Literals.BULLET, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDoubleBulletPoints() {
    try {
      final String model = "survey Test \"...\"\r\n                 page Seite1 (\r\n\t\t\t\tselect Frage1 \"...\" (Alt1 \"Amazon\" Alt2 \"Amazon\" )\r\n\t\t\t\t)\r\n\t\t\t";
      final Survey survey = this.parseHelper.parse(model);
      this.validationTestHelper.assertError(survey, EvaluationPackage.Literals.BULLET, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDoubleBulletPointsDoubleGraduations() {
    try {
      final String model = "survey Test \"...\"\r\n                 page Seite1 (\r\n\t\t\t\tchart Frage1 \"...\" (Alt1 \".\" Alt2 \".\") x (\"-\" \"-\")\r\n\t\t\t\t)\r\n\t\t\t";
      final Survey survey = this.parseHelper.parse(model);
      this.validationTestHelper.assertError(survey, EvaluationPackage.Literals.BULLET, null);
      this.validationTestHelper.assertError(survey, EvaluationPackage.Literals.GRADUATION, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDoublePages() {
    try {
      final String model = "survey Test \"...\"\r\n\t\t\t\t\tpage Seite1 (\r\n\t\t\t\t\tfreetext Frage2 \"...\"\r\n\t\t\t\t\t)\r\n\t\t\t\t\tpage Seite1 (\r\n\t\t\t\t\tfreetext Frage2 \"...\"\r\n\t\t\t\t\t)\r\n\t\t\t";
      final Survey survey = this.parseHelper.parse(model);
      this.validationTestHelper.assertError(survey, EvaluationPackage.Literals.PAGE, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNonExistingFollowingPage() {
    try {
      final String model = "survey Test \"...\"\r\n                 page Seite1 (\r\n\t\t\t\tselect Frage1 \"...\" (Alt1 \"Amazon\" Alt2 \"Emazon\" )\r\n\t\t\t\tforwarding to -> Seite2)\r\n\t\t\t";
      final Survey survey = this.parseHelper.parse(model);
      this.validationTestHelper.assertError(survey, EvaluationPackage.Literals.PAGE, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRatingQuantity() {
    try {
      final String model = "survey Test \"...\"\r\n\t\t\t\tpage Seite1 (\r\n                 rating Frage5 \"Wie ist Ihre Gesamtzufriedenheit?\" \t11\r\n\t\t\t\t)\r\n\t\t\t\t";
      final Survey survey = this.parseHelper.parse(model);
      this.validationTestHelper.assertWarning(survey, EvaluationPackage.Literals.QUESTION, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
