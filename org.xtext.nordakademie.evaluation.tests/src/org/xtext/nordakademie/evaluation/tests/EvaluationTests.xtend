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
	
// Positivtest: Enthält sämtliche Fragetypen
	@Test
	def void testSurveyComplete() {
		'survey Testname 
			"Testtitel der Survey" 
			"Testbegrüßung der Survey"

			page Testseite1 (
				freetext Testfrage "Testfrage der Testseite1"
				forwarding to -> Testseite2
			)
			
			page Testseite2 (
				rating Testrating "Testrating der Testseite2" 10
				forwarding to -> Testseite3
			)

			page Testseite3 (
				select Testselection "Testselection der Testseite3"
				(Testbullet1 "Testbullet") 
				forwarding to -> Testseite4
			)

			page Testseite4 (
				chart Testchart "Testchart der Testseite4"
				(Testbullet1 "Testbullet1" Testbullet2 "Testbullet2") x (Testbullet3 "Testbullet3" Testbullet4 "Testbullet4")
			)
		'
			.parse.assertNoErrors
	}
	
// Negativtest: Nicht vorhandene Folgeseite	(Testseite5)
	@Test
	def void testSurveyWithNonExistingFollowingPage() {
		'survey Testname 
			"Testtitel der Survey" 
			"Testbegrüßung der Survey"

			page Testseite1 (
				freetext Testfrage "Testfrage der Testseite1"
				forwarding to -> Testseite2
			)
			
			page Testseite2 (
				rating Testrating "Testrating der Testseite2" 10
				forwarding to -> Testseite3
			)

			page Testseite3 (
				select Testselection "Testselection der Testseite3"
				(Testbullet1 "Testbullet") 
				forwarding to -> Testseite5
			)

			page Testseite4 (
				chart Testchart "Testchart der Testseite4"
				(Testbullet1 "Testbullet1" Testbullet2 "Testbullet2") x (Testbullet3 "Testbullet3" Testbullet4 "Testbullet4")
			)
		'
			.parse.assertError(EvaluationPackage.Literals.PAGE, null)
	}
}
	