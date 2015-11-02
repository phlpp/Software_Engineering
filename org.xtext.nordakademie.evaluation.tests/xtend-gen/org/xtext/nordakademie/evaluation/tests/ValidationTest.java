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
  public void testSurvey() {
    try {
      Survey _parse = this._parseHelper.parse("survey EShop \r\n\t\t\t\"Bewertung E-Shop\" \"Sehr geehrte Damen und Herren,\r\n\t\t\tvielen Dank für Ihren Besuch. \r\n\t\t\tIndem Sie die 5-10 minütige Umfrage ausfüllen helfen Sie uns, \r\n\t\t\tdie besten Ergebnisse zu erzielen.\"\r\n\r\n\t\t\tpage Seite1 (\r\n\t\t\t\tfreetext Frage1 \"Was war der Hauptgrund, \r\n            \tweshalb Sie unseren E-Shop besucht haben?\" \r\n\r\n\t\t\tforwarding to ->Seite2 )");
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
