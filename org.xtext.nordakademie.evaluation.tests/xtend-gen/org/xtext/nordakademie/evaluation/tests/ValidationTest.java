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
  private ParseHelper<Survey> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testSurveyComplete() {
    try {
      Survey _parse = this._parseHelper.parse("survey Testname \r\n\t\t\t\"Testtitel der Survey\" \r\n\t\t\t\"Testbegrüßung der Survey\"\r\n\r\n\t\t\tpage Testseite1 (\r\n\t\t\t\tfreetext Testfrage \"Testfrage der Testseite1\"\r\n\t\t\t\tforwarding to -> Testseite2\r\n\t\t\t)\r\n\t\t\t\r\n\t\t\tpage Testseite2 (\r\n\t\t\t\trating Testrating \"Testrating der Testseite2\" 10\r\n\t\t\t\tforwarding to -> Testseite3\r\n\t\t\t)\r\n\r\n\t\t\tpage Testseite3 (\r\n\t\t\t\tselect Testselection \"Testselection der Testseite3\"\r\n\t\t\t\t(Testbullet1 \"Testbullet\") \r\n\t\t\t\tforwarding to -> Testseite4\r\n\t\t\t)\r\n\r\n\t\t\tpage Testseite4 (\r\n\t\t\t\tchart Testchart \"Testchart der Testseite4\"\r\n\t\t\t\t(Testbullet1 \"Testbullet1\" Testbullet2 \"Testbullet2\") x (Testbullet3 \"Testbullet3\" Testbullet4 \"Testbullet4\")\r\n\t\t\t)\r\n\t\t");
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSurveyWithNonExistingFollowingPage() {
    try {
      Survey _parse = this._parseHelper.parse("survey Testname \r\n\t\t\t\"Testtitel der Survey\" \r\n\t\t\t\"Testbegrüßung der Survey\"\r\n\r\n\t\t\tpage Testseite1 (\r\n\t\t\t\tfreetext Testfrage \"Testfrage der Testseite1\"\r\n\t\t\t\tforwarding to -> Testseite2\r\n\t\t\t)\r\n\t\t\t\r\n\t\t\tpage Testseite2 (\r\n\t\t\t\trating Testrating \"Testrating der Testseite2\" 10\r\n\t\t\t\tforwarding to -> Testseite3\r\n\t\t\t)\r\n\r\n\t\t\tpage Testseite3 (\r\n\t\t\t\tselect Testselection \"Testselection der Testseite3\"\r\n\t\t\t\t(Testbullet1 \"Testbullet\") \r\n\t\t\t\tforwarding to -> Testseite5\r\n\t\t\t)\r\n\r\n\t\t\tpage Testseite4 (\r\n\t\t\t\tchart Testchart \"Testchart der Testseite4\"\r\n\t\t\t\t(Testbullet1 \"Testbullet1\" Testbullet2 \"Testbullet2\") x (Testbullet3 \"Testbullet3\" Testbullet4 \"Testbullet4\")\r\n\t\t\t)\r\n\t\t");
      this._validationTestHelper.assertError(_parse, EvaluationPackage.Literals.PAGE, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
