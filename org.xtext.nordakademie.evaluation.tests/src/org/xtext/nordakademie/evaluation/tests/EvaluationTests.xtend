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
	
	@Inject extension ParseHelper<Survey> parseHelper
	@Inject extension ValidationTestHelper validationTestHelper
	
// Positivtest: Enthält sämtliche Fragetypen
	@Test
	def void testSurveyComplete() {
		'survey Testname 
			"Testtitel der Umfrage" 
			"Testbegrüßung der Umfrage"

			page Testseite1 (
				freetext Testfrage "Testfrage der Testseite1"
				forwarding to -> Testseite2
			)
			
			page Testseite2 (
				rating Testbewertung "Testfrage der Testseite2" 10
				forwarding to -> Testseite3
			)

			page Testseite3 (
				select Testauswahl "Testfrage der Testseite3"
				(Testauswahlfeld1 "Testauswahlfeld") 
				forwarding to -> Testseite4
			)

			page Testseite4 (
				chart Testtabelle "Testfrage der Testseite4"
				(Testauswahlfeld1 "Testauswahlfeld1" Testauswahlfeld2 "Testauswahlfeld2") x (Gewichtung1 "Gewichtung1" Gewichtung2 "Gewichtung2")
				forwarding to -> Seite5
			)

			page Seite5 (
				select oneChoice TestEntscheidung "Testfrage der Testseite5" 
				(Alternative1 "M" Alternative2 "W")
			)
		'
			.parse.assertNoErrors
	}
	
// Negativtest: Nicht vorhandene Seite
	@Test
	def void testSurveyWithoutPage(){
		val model = 'survey Test "..."
                 
			'
			val survey = parseHelper.parse(model)
			validationTestHelper.assertError(survey, EvaluationPackage.Literals.SURVEY, null)
	}
	
// Negativtest: Nicht vorhandene Frage
	@Test
	def void testPageWithoutQuestion(){
		val model = 'survey Test "..."
                 page Seite1 ( )
			'
			val survey = parseHelper.parse(model)
			validationTestHelper.assertError(survey, EvaluationPackage.Literals.PAGE, null)
	}	
// Negativtest: leere Frage
	@Test
	def void testEmptyQuestion(){
		val model = 'survey Test "..."
                 page Seite1 ("")
			'
			val survey = parseHelper.parse(model)
			validationTestHelper.assertError(survey, EvaluationPackage.Literals.PAGE, null)
	}

// Negativtest: Aufzählungspunkte ohne Text
	@Test
	def void testEmptyBulletPoints(){
		val model = 'survey Test "..."
                 page Seite1 (
				select Frage1 "..." (Alt1 "" )
				)
			'
			val survey = parseHelper.parse(model)
			validationTestHelper.assertError(survey, EvaluationPackage.Literals.BULLET, null)
	}		
	
// Negativtest: gleiche Aufzählungspunkte
	@Test
	def void testDoubleBulletPoints(){
		val model = 'survey Test "..."
                 page Seite1 (
				select Frage1 "..." (Alt1 "Amazon" Alt2 "Amazon" )
				)
			'
			val survey = parseHelper.parse(model)
			validationTestHelper.assertError(survey, EvaluationPackage.Literals.BULLET, null)
	}

// Negativtest: gleiche Aufzählungspunkte, gleiche Bewertungen
	@Test
	def void testDoubleBulletPointsDoubleGraduations(){
		val model = 'survey Test "..."
                 page Seite1 (
				chart Frage1 "..." (Alt1 "." Alt2 ".") x ("-" "-")
				)
			'
			val survey = parseHelper.parse(model)
			validationTestHelper.assertError(survey, EvaluationPackage.Literals.BULLET, null)
			validationTestHelper.assertError(survey, EvaluationPackage.Literals.GRADUATION, null)
	}

// Negativtest: gleiche Seiten
	@Test
	def void testDoublePages(){
		val model = 'survey Test "..."
					page Seite1 (
					freetext Frage2 "..."
					)
					page Seite1 (
					freetext Frage2 "..."
					)
			'
			val survey = parseHelper.parse(model)
			validationTestHelper.assertError(survey, EvaluationPackage.Literals.PAGE, null)
			
	}

// Negativtest: nicht existierende FolgeSeite
	@Test
	def void testNonExistingFollowingPage(){
		val model = 'survey Test "..."
                 page Seite1 (
				select Frage1 "..." (Alt1 "Amazon" Alt2 "Emazon" )
				forwarding to -> Seite2)
			'
			val survey = parseHelper.parse(model)
			validationTestHelper.assertError(survey, EvaluationPackage.Literals.PAGE, null)
	}

// Negativtest: Bewertungsstufe >10
	@Test
	def void testRatingQuantity(){
		val model = 'survey Test "..."
				page Seite1 (
                 rating Frage5 "Wie ist Ihre Gesamtzufriedenheit?" 	11
				)
				'
			val survey = parseHelper.parse(model)
			validationTestHelper.assertWarning(survey, EvaluationPackage.Literals.QUESTION, null)
	}



		
}
	