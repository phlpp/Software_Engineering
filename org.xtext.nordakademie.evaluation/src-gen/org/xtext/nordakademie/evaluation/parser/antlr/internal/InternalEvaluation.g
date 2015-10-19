/*
 * generated by Xtext
 */
grammar InternalEvaluation;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.nordakademie.evaluation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.nordakademie.evaluation.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.nordakademie.evaluation.services.EvaluationGrammarAccess;

}

@parser::members {

 	private EvaluationGrammarAccess grammarAccess;
 	
    public InternalEvaluationParser(TokenStream input, EvaluationGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Survey";	
   	}
   	
   	@Override
   	protected EvaluationGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSurvey
entryRuleSurvey returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSurveyRule()); }
	 iv_ruleSurvey=ruleSurvey 
	 { $current=$iv_ruleSurvey.current; } 
	 EOF 
;

// Rule Survey
ruleSurvey returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='survey' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getSurveyKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSurveyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_title_2_0=RULE_STRING
		{
			newLeafNode(lv_title_2_0, grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSurveyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_2_0, 
        		"STRING");
	    }

)
)(
(
		lv_greeting_3_0=RULE_STRING
		{
			newLeafNode(lv_greeting_3_0, grammarAccess.getSurveyAccess().getGreetingSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSurveyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"greeting",
        		lv_greeting_3_0, 
        		"STRING");
	    }

)
)?(
(
		lv_duration_4_0=RULE_STRING
		{
			newLeafNode(lv_duration_4_0, grammarAccess.getSurveyAccess().getDurationSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSurveyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"duration",
        		lv_duration_4_0, 
        		"STRING");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_5_0()); 
	    }
		lv_pages_5_0=rulePage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSurveyRule());
	        }
       		add(
       			$current, 
       			"pages",
        		lv_pages_5_0, 
        		"Page");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRulePage
entryRulePage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPageRule()); }
	 iv_rulePage=rulePage 
	 { $current=$iv_rulePage.current; } 
	 EOF 
;

// Rule Page
rulePage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='page' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
	    }
		lv_questions_3_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_3_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getRightParenthesisKeyword_4());
    }
)
;





// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getFreetextParserRuleCall_0()); 
    }
    this_Freetext_0=ruleFreetext
    { 
        $current = $this_Freetext_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getSelectionParserRuleCall_1()); 
    }
    this_Selection_1=ruleSelection
    { 
        $current = $this_Selection_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getChartParserRuleCall_2()); 
    }
    this_Chart_2=ruleChart
    { 
        $current = $this_Chart_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleFreetext
entryRuleFreetext returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFreetextRule()); }
	 iv_ruleFreetext=ruleFreetext 
	 { $current=$iv_ruleFreetext.current; } 
	 EOF 
;

// Rule Freetext
ruleFreetext returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='freetext' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFreetextAccess().getFreetextKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFreetextAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFreetextRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_question_2_0=RULE_STRING
		{
			newLeafNode(lv_question_2_0, grammarAccess.getFreetextAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFreetextRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"question",
        		lv_question_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleSelection
entryRuleSelection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSelectionRule()); }
	 iv_ruleSelection=ruleSelection 
	 { $current=$iv_ruleSelection.current; } 
	 EOF 
;

// Rule Selection
ruleSelection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='select' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSelectionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSelectionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_question_2_0=RULE_STRING
		{
			newLeafNode(lv_question_2_0, grammarAccess.getSelectionAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSelectionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"question",
        		lv_question_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSelectionAccess().getChoicesChoiceParserRuleCall_4_0()); 
	    }
		lv_choices_4_0=ruleChoice		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSelectionRule());
	        }
       		add(
       			$current, 
       			"choices",
        		lv_choices_4_0, 
        		"Choice");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSelectionAccess().getRightParenthesisKeyword_5());
    }
)
;





// Entry rule entryRuleChoice
entryRuleChoice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getChoiceRule()); }
	 iv_ruleChoice=ruleChoice 
	 { $current=$iv_ruleChoice.current; } 
	 EOF 
;

// Rule Choice
ruleChoice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_freetext_0_0=	'freetext' 
    {
        newLeafNode(lv_freetext_0_0, grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceRule());
	        }
       		setWithLastConsumed($current, "freetext", true, "freetext");
	    }

)
)?(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_bulletPoint_2_0=RULE_STRING
		{
			newLeafNode(lv_bulletPoint_2_0, grammarAccess.getChoiceAccess().getBulletPointSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"bulletPoint",
        		lv_bulletPoint_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleChart
entryRuleChart returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getChartRule()); }
	 iv_ruleChart=ruleChart 
	 { $current=$iv_ruleChart.current; } 
	 EOF 
;

// Rule Chart
ruleChart returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='chart' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getChartAccess().getChartKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getChartAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChartRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_question_2_0=RULE_STRING
		{
			newLeafNode(lv_question_2_0, grammarAccess.getChartAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChartRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"question",
        		lv_question_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getChartAccess().getLeftParenthesisKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getChartAccess().getChoicesChoiceParserRuleCall_4_0()); 
	    }
		lv_choices_4_0=ruleChoice		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getChartRule());
	        }
       		add(
       			$current, 
       			"choices",
        		lv_choices_4_0, 
        		"Choice");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getChartAccess().getRightParenthesisKeyword_5());
    }
	otherlv_6='x' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getChartAccess().getXKeyword_6());
    }
	otherlv_7='(' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getChartAccess().getLeftParenthesisKeyword_7());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getChartAccess().getGraduationsGraduationParserRuleCall_8_0()); 
	    }
		lv_graduations_8_0=ruleGraduation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getChartRule());
	        }
       		add(
       			$current, 
       			"graduations",
        		lv_graduations_8_0, 
        		"Graduation");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_9=')' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getChartAccess().getRightParenthesisKeyword_9());
    }
)
;





// Entry rule entryRuleGraduation
entryRuleGraduation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGraduationRule()); }
	 iv_ruleGraduation=ruleGraduation 
	 { $current=$iv_ruleGraduation.current; } 
	 EOF 
;

// Rule Graduation
ruleGraduation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getGraduationAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGraduationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)?(
(
		lv_statement_1_0=RULE_STRING
		{
			newLeafNode(lv_statement_1_0, grammarAccess.getGraduationAccess().getStatementSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGraduationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"statement",
        		lv_statement_1_0, 
        		"STRING");
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


