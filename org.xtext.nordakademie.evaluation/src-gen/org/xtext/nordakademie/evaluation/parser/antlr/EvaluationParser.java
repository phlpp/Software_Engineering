/*
 * generated by Xtext
 */
package org.xtext.nordakademie.evaluation.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.nordakademie.evaluation.services.EvaluationGrammarAccess;

public class EvaluationParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private EvaluationGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.nordakademie.evaluation.parser.antlr.internal.InternalEvaluationParser createParser(XtextTokenStream stream) {
		return new org.xtext.nordakademie.evaluation.parser.antlr.internal.InternalEvaluationParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Survey";
	}
	
	public EvaluationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EvaluationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
