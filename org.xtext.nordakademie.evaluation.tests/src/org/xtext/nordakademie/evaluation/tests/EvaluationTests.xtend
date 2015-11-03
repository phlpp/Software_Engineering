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
	def void testSurveyWithPageQuestion() {
		'survey Testname 
			"Testtitel der Survey" 
			"Testbegrüßung der Survey"

			page Testseite (
				freetext Testfrage "Testfrage der Seite"
			)'
			.parse.assertNoErrors
	}
	
	@Test
	def void testSurveyWithoutPageQuestion() {
		'survey Testname 
			"Testtitel der Survey" 
			"Testbegrüßung der Survey"
			'
			.parse.assertError(EvaluationPackage.Literals.PAGE, null)
	}
}
	