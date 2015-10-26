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
«««				next page if existing (Nullpointer if not existing)
				«IF page.next.name.isNullOrEmpty»
					<form action="«page.name + '.html'»" method="post">
						«select(page.question)»		
	   				<button type="submit" value="submit">submit</button>
						<button type="reset" value="reset">reset</button>
					</form>					
						 
				«ELSE»
					<form action="«page.next.name + '.html'»" method="post">
						«select(page.question)»		
	   				<button type="submit" value="submit">submit</button>
						<button type="reset" value="reset">reset</button>
					</form>								
				«ENDIF»

			</body>
		</html>	
	'''

	// Dispatch methods make a set of overloaded methods polymorphic
	def dispatch select(Freetext question) '''
		<p>
				<label>«question.question»</label><br>
				<input type="text" name="«question.name»">
				
		</p>
	'''

	def dispatch select(Selection question) '''
		<p>
			<label>«question.question»</label><br>
			«FOR choice : question.choices»
				<input type="checkbox" name="«question.name»" value="«choice.name»"/>«choice.bulletPoint»
				«IF choice.freetext»
					&nbsp;<input type="text" name="«choice.name»">
				«ENDIF»					
				<br>
			«ENDFOR»	
		</p>		
	'''

	def dispatch select(Chart question) '''
		<p>
			<label>«question.question»</label><br>
			<style> table, td, th { border: 1px solid black; } </style>
			
			
			<table> 
		«««				first row with graduation statements
				<tr> 
					<th>&nbsp;</th>
		«FOR graduation : question.graduations»
		<th>«graduation.statement»</th>
		«ENDFOR»
		</tr> 
		«««				rows with choices and radio buttons
				«FOR choice : question.choices»
			<tr>
			<td>«choice.bulletPoint»</td>
			 «FOR graduation : question.graduations»
			 	<td><input type="radio" name="«choice.bulletPoint»" value=«graduation.statement»></td> 	
			 «ENDFOR»
			 </tr>
				«ENDFOR»
			</table> 			
		</p>	
	'''

	def dispatch select(Rating question) '''
		<p>
			<label>«question.question»</label><br>
«««			loop for quantity of possible ratings
			«FOR ratingValue: 1..question.ratingQuantity»
			<input type="radio" name="«question.name»"  value=«ratingValue»  class="star"/>
			«ENDFOR»
		</p>
	'''		
}
