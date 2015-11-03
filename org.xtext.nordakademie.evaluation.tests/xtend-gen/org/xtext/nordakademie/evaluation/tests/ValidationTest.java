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
  public void testSurveyWithPageQuestion() {
    try {
      Survey _parse = this._parseHelper.parse("survey Testname \r\n\t\t\t\"Testtitel der Survey\" \r\n\t\t\t\"Testbegrüßung der Survey\"\r\n\r\n\t\t\tpage Testseite (\r\n\t\t\t\tfreetext Testfrage \"Testfrage der Seite\"\r\n\t\t\t)");
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSurveyWithoutPageQuestion() {
    try {
      Survey _parse = this._parseHelper.parse("survey Testname \r\n\t\t\t\"Testtitel der Survey\" \r\n\t\t\t\"Testbegrüßung der Survey\"\r\n\t\t\t");
      this._validationTestHelper.assertError(_parse, EvaluationPackage.Literals.PAGE, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
