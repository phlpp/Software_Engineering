package org.xtext.nordakademie.evaluation.tests

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.xtext.nordakademie.evaluation.EvaluationInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import javax.inject.Inject
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.junit4.util.ParseHelper
import org.xtext.nordakademie.evaluation.evaluation.Survey
import org.junit.Test
import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage

@RunWith(XtextRunner)
@InjectWith(EvaluationInjectorProvider)

class ValidationTest {
	
	@Inject extension ParseHelper<Survey> 
	@Inject extension ValidationTestHelper 
	
	@Test
	def void testSurvey() {
		'survey EShop 
			"Bewertung E-Shop" "Sehr geehrte Damen und Herren,
			vielen Dank für Ihren Besuch. 
			Indem Sie die 5-10 minütige Umfrage ausfüllen helfen Sie uns, 
			die besten Ergebnisse zu erzielen."

			page Seite1 (
				freetext Frage1 "Was war der Hauptgrund, 
            	weshalb Sie unseren E-Shop besucht haben?" 

			forwarding to ->Seite2 )'
			.parse.assertNoErrors
	}
}
	