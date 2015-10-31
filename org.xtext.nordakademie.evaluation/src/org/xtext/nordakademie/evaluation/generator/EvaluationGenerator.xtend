/*
 * generated by Xtext
 */
package org.xtext.nordakademie.evaluation.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.nordakademie.evaluation.evaluation.Survey
import org.xtext.nordakademie.evaluation.evaluation.Selection
import org.xtext.nordakademie.evaluation.evaluation.Freetext
import org.xtext.nordakademie.evaluation.evaluation.Page
import org.xtext.nordakademie.evaluation.evaluation.Chart
import org.xtext.nordakademie.evaluation.evaluation.Rating
import org.xtext.nordakademie.evaluation.evaluation.Question

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EvaluationGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		// first element of ecore-tree (survey)
		val survey = resource.contents.head as Survey
		// multiple pages
		for (page : survey.pages) {
			fsa.generateFile(page.name + '.html', toHtml(survey, page))
		}
	}

	def toHtml(Survey survey, Page page) '''
		
		<html>
			<head>
				<title>«survey.title»</title>
			</head>
			<body>
				<h1>«survey.title»</h1>
				<p>«survey.greeting»</p>
				«««next page if existing
				«IF page.forwarding»
					<form action="«page.followingPage.name + '.html'»" method="post">
					«««one question per page
						«select(page.question)»		
	   				<button type="submit" value="submit">submit</button>
						<button type="reset" value="reset">reset</button>
					</form>															 
				«ELSE»
					<form action="«page.name + '.html'»" method="post">
						«select(page.question)»		
	   				<button type="submit" value="submit">submit</button>
						<button type="reset" value="reset">reset</button>
					</form>								
				«ENDIF»

			</body>
		</html>	
	'''

	//	Dispatch methods make a set of overloaded methods polymorphic
	def dispatch select(Freetext question) '''
		<p>
			<label>«question.questionText»</label><br>
			«helptext(question)»
			<input type="text" name="«question.name»">
		</p>
	'''

	def dispatch select(Selection question) '''
		<p>
			<label>«question.questionText»</label><br>
			«helptext(question)»			
			«FOR bullet : question.bullets»
				<input type="checkbox" name="«question.name»" value="«bullet.name»"/>«bullet.bulletText»
				«IF bullet.freetext»
					&nbsp;<input type="text" name="«bullet.name»">
				«ENDIF»					
				<br>
			«ENDFOR»	
		</p>		
	'''

	def dispatch select(Chart question) '''
		<p>
			<label>«question.questionText»</label><br>
			«helptext(question)»			
			<style> table, td, th { border: 1px solid black; } </style>
			<table> 
			«««first row with graduation statements
			<tr> 
				<th>&nbsp;</th>
				«FOR graduation : question.graduations»
					<th>«graduation.graduationText»</th>
				«ENDFOR»
			</tr> 
			«««rows with bullets (choices) and radio buttons
			«FOR bullet : question.bullets»
			<tr>
				<td>«bullet.bulletText»</td>
			 	«FOR graduation : question.graduations»
			 		<td><input type="radio" name="«bullet.bulletText»" value=«graduation.graduationText»></td> 	
			 	«ENDFOR»
			 </tr>
			«ENDFOR»
			</table> 			
		</p>	
	'''

	def dispatch select(Rating question) '''
		<p>
			<label>«question.questionText»</label><br>
			«helptext(question)»			
			«««loop for quantity of possible ratings
			«FOR ratingValue: 1..question.ratingQuantity»
				«ratingValue»<input type="radio" name="«question.name»"  value=«ratingValue»"/>&nbsp;&nbsp;
			«ENDFOR»
		</p>
	'''	
	
	def helptext(Question question) '''
		«IF !question.helpText.nullOrEmpty»
			«question.helpText»<br>
		«ENDIF»
	'''	
}
