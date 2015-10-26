/*
 * generated by Xtext
 */
package org.xtext.nordakademie.evaluation.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class EvaluationGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SurveyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Survey");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSurveyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTitleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTitleSTRINGTerminalRuleCall_2_0 = (RuleCall)cTitleAssignment_2.eContents().get(0);
		private final Assignment cGreetingAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGreetingSTRINGTerminalRuleCall_3_0 = (RuleCall)cGreetingAssignment_3.eContents().get(0);
		private final Assignment cDurationAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDurationSTRINGTerminalRuleCall_4_0 = (RuleCall)cDurationAssignment_4.eContents().get(0);
		private final Assignment cPagesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPagesPageParserRuleCall_5_0 = (RuleCall)cPagesAssignment_5.eContents().get(0);
		
		//Survey:
		//	"survey" name=ID title=STRING greeting=STRING? //total time estimated for survey: tbd
		//	duration=STRING? pages+=Page*;
		@Override public ParserRule getRule() { return rule; }

		//"survey" name=ID title=STRING greeting=STRING? //total time estimated for survey: tbd
		//duration=STRING? pages+=Page*
		public Group getGroup() { return cGroup; }

		//"survey"
		public Keyword getSurveyKeyword_0() { return cSurveyKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//title=STRING
		public Assignment getTitleAssignment_2() { return cTitleAssignment_2; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_2_0() { return cTitleSTRINGTerminalRuleCall_2_0; }

		//greeting=STRING?
		public Assignment getGreetingAssignment_3() { return cGreetingAssignment_3; }

		//STRING
		public RuleCall getGreetingSTRINGTerminalRuleCall_3_0() { return cGreetingSTRINGTerminalRuleCall_3_0; }

		//duration=STRING?
		public Assignment getDurationAssignment_4() { return cDurationAssignment_4; }

		//STRING
		public RuleCall getDurationSTRINGTerminalRuleCall_4_0() { return cDurationSTRINGTerminalRuleCall_4_0; }

		//pages+=Page*
		public Assignment getPagesAssignment_5() { return cPagesAssignment_5; }

		//Page
		public RuleCall getPagesPageParserRuleCall_5_0() { return cPagesPageParserRuleCall_5_0; }
	}

	public class PageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Page");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cQuestionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cQuestionQuestionParserRuleCall_3_0 = (RuleCall)cQuestionAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cNextKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cNextAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cNextPageCrossReference_4_1_0 = (CrossReference)cNextAssignment_4_1.eContents().get(0);
		private final RuleCall cNextPageIDTerminalRuleCall_4_1_0_1 = (RuleCall)cNextPageCrossReference_4_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Page:
		//	"page" name=ID "(" question=Question //referred page
		//	("-next->" next=[Page])? ")";
		@Override public ParserRule getRule() { return rule; }

		//"page" name=ID "(" question=Question //referred page
		//("-next->" next=[Page])? ")"
		public Group getGroup() { return cGroup; }

		//"page"
		public Keyword getPageKeyword_0() { return cPageKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//question=Question
		public Assignment getQuestionAssignment_3() { return cQuestionAssignment_3; }

		//Question
		public RuleCall getQuestionQuestionParserRuleCall_3_0() { return cQuestionQuestionParserRuleCall_3_0; }

		//("-next->" next=[Page])?
		public Group getGroup_4() { return cGroup_4; }

		//"-next->"
		public Keyword getNextKeyword_4_0() { return cNextKeyword_4_0; }

		//next=[Page]
		public Assignment getNextAssignment_4_1() { return cNextAssignment_4_1; }

		//[Page]
		public CrossReference getNextPageCrossReference_4_1_0() { return cNextPageCrossReference_4_1_0; }

		//ID
		public RuleCall getNextPageIDTerminalRuleCall_4_1_0_1() { return cNextPageIDTerminalRuleCall_4_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Question");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFreetextParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSelectionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cChartParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cRatingParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		////	| Calendar
		//Question:
		//	Freetext | Selection | Chart | Rating;
		@Override public ParserRule getRule() { return rule; }

		//Freetext | Selection | Chart | Rating
		public Alternatives getAlternatives() { return cAlternatives; }

		//Freetext
		public RuleCall getFreetextParserRuleCall_0() { return cFreetextParserRuleCall_0; }

		//Selection
		public RuleCall getSelectionParserRuleCall_1() { return cSelectionParserRuleCall_1; }

		//Chart
		public RuleCall getChartParserRuleCall_2() { return cChartParserRuleCall_2; }

		//Rating
		public RuleCall getRatingParserRuleCall_3() { return cRatingParserRuleCall_3; }
	}

	public class FreetextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Freetext");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFreetextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cQuestionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQuestionSTRINGTerminalRuleCall_2_0 = (RuleCall)cQuestionAssignment_2.eContents().get(0);
		
		//Freetext:
		//	"freetext" name=ID question=STRING;
		@Override public ParserRule getRule() { return rule; }

		//"freetext" name=ID question=STRING
		public Group getGroup() { return cGroup; }

		//"freetext"
		public Keyword getFreetextKeyword_0() { return cFreetextKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//question=STRING
		public Assignment getQuestionAssignment_2() { return cQuestionAssignment_2; }

		//STRING
		public RuleCall getQuestionSTRINGTerminalRuleCall_2_0() { return cQuestionSTRINGTerminalRuleCall_2_0; }
	}

	public class SelectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Selection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSelectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cQuestionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQuestionSTRINGTerminalRuleCall_2_0 = (RuleCall)cQuestionAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cChoicesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cChoicesChoiceParserRuleCall_4_0 = (RuleCall)cChoicesAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Selection:
		//	"select" name=ID question=STRING "(" choices+=Choice* ")";
		@Override public ParserRule getRule() { return rule; }

		//"select" name=ID question=STRING "(" choices+=Choice* ")"
		public Group getGroup() { return cGroup; }

		//"select"
		public Keyword getSelectKeyword_0() { return cSelectKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//question=STRING
		public Assignment getQuestionAssignment_2() { return cQuestionAssignment_2; }

		//STRING
		public RuleCall getQuestionSTRINGTerminalRuleCall_2_0() { return cQuestionSTRINGTerminalRuleCall_2_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//choices+=Choice*
		public Assignment getChoicesAssignment_4() { return cChoicesAssignment_4; }

		//Choice
		public RuleCall getChoicesChoiceParserRuleCall_4_0() { return cChoicesChoiceParserRuleCall_4_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class ChoiceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Choice");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFreetextAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFreetextFreetextKeyword_0_0 = (Keyword)cFreetextAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cBulletPointAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBulletPointSTRINGTerminalRuleCall_2_0 = (RuleCall)cBulletPointAssignment_2.eContents().get(0);
		
		//Choice:
		//	freetext?="freetext"? name=ID bulletPoint=STRING;
		@Override public ParserRule getRule() { return rule; }

		//freetext?="freetext"? name=ID bulletPoint=STRING
		public Group getGroup() { return cGroup; }

		//freetext?="freetext"?
		public Assignment getFreetextAssignment_0() { return cFreetextAssignment_0; }

		//"freetext"
		public Keyword getFreetextFreetextKeyword_0_0() { return cFreetextFreetextKeyword_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//bulletPoint=STRING
		public Assignment getBulletPointAssignment_2() { return cBulletPointAssignment_2; }

		//STRING
		public RuleCall getBulletPointSTRINGTerminalRuleCall_2_0() { return cBulletPointSTRINGTerminalRuleCall_2_0; }
	}

	public class ChartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Chart");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChartKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cQuestionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQuestionSTRINGTerminalRuleCall_2_0 = (RuleCall)cQuestionAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cChoicesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cChoicesChoiceParserRuleCall_4_0 = (RuleCall)cChoicesAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cXKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cGraduationsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cGraduationsGraduationParserRuleCall_8_0 = (RuleCall)cGraduationsAssignment_8.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Chart: //chart with choices and graduations for each
		//	"chart" name=ID question=STRING "(" choices+=Choice* ")" "x" "(" graduations+=Graduation* ")";
		@Override public ParserRule getRule() { return rule; }

		////chart with choices and graduations for each
		//"chart" name=ID question=STRING "(" choices+=Choice* ")" "x" "(" graduations+=Graduation* ")"
		public Group getGroup() { return cGroup; }

		////chart with choices and graduations for each
		//"chart"
		public Keyword getChartKeyword_0() { return cChartKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//question=STRING
		public Assignment getQuestionAssignment_2() { return cQuestionAssignment_2; }

		//STRING
		public RuleCall getQuestionSTRINGTerminalRuleCall_2_0() { return cQuestionSTRINGTerminalRuleCall_2_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//choices+=Choice*
		public Assignment getChoicesAssignment_4() { return cChoicesAssignment_4; }

		//Choice
		public RuleCall getChoicesChoiceParserRuleCall_4_0() { return cChoicesChoiceParserRuleCall_4_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }

		//"x"
		public Keyword getXKeyword_6() { return cXKeyword_6; }

		//"("
		public Keyword getLeftParenthesisKeyword_7() { return cLeftParenthesisKeyword_7; }

		//graduations+=Graduation*
		public Assignment getGraduationsAssignment_8() { return cGraduationsAssignment_8; }

		//Graduation
		public RuleCall getGraduationsGraduationParserRuleCall_8_0() { return cGraduationsGraduationParserRuleCall_8_0; }

		//")"
		public Keyword getRightParenthesisKeyword_9() { return cRightParenthesisKeyword_9; }
	}

	public class GraduationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Graduation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cStatementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStatementSTRINGTerminalRuleCall_1_0 = (RuleCall)cStatementAssignment_1.eContents().get(0);
		
		//Graduation:
		//	name=ID? statement=STRING;
		@Override public ParserRule getRule() { return rule; }

		//name=ID? statement=STRING
		public Group getGroup() { return cGroup; }

		//name=ID?
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//statement=STRING
		public Assignment getStatementAssignment_1() { return cStatementAssignment_1; }

		//STRING
		public RuleCall getStatementSTRINGTerminalRuleCall_1_0() { return cStatementSTRINGTerminalRuleCall_1_0; }
	}

	public class RatingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rating");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRatingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cQuestionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQuestionSTRINGTerminalRuleCall_2_0 = (RuleCall)cQuestionAssignment_2.eContents().get(0);
		private final Assignment cRatingQuantityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRatingQuantityINTTerminalRuleCall_3_0 = (RuleCall)cRatingQuantityAssignment_3.eContents().get(0);
		
		////Calendar:
		////	'calendar' name=ID question=STRING
		////;
		//Rating:
		//	"rating" name=ID question=STRING ratingQuantity=INT;
		@Override public ParserRule getRule() { return rule; }

		//"rating" name=ID question=STRING ratingQuantity=INT
		public Group getGroup() { return cGroup; }

		//"rating"
		public Keyword getRatingKeyword_0() { return cRatingKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//question=STRING
		public Assignment getQuestionAssignment_2() { return cQuestionAssignment_2; }

		//STRING
		public RuleCall getQuestionSTRINGTerminalRuleCall_2_0() { return cQuestionSTRINGTerminalRuleCall_2_0; }

		//ratingQuantity=INT
		public Assignment getRatingQuantityAssignment_3() { return cRatingQuantityAssignment_3; }

		//INT
		public RuleCall getRatingQuantityINTTerminalRuleCall_3_0() { return cRatingQuantityINTTerminalRuleCall_3_0; }
	}
	
	
	private final SurveyElements pSurvey;
	private final PageElements pPage;
	private final QuestionElements pQuestion;
	private final FreetextElements pFreetext;
	private final SelectionElements pSelection;
	private final ChoiceElements pChoice;
	private final ChartElements pChart;
	private final GraduationElements pGraduation;
	private final RatingElements pRating;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EvaluationGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSurvey = new SurveyElements();
		this.pPage = new PageElements();
		this.pQuestion = new QuestionElements();
		this.pFreetext = new FreetextElements();
		this.pSelection = new SelectionElements();
		this.pChoice = new ChoiceElements();
		this.pChart = new ChartElements();
		this.pGraduation = new GraduationElements();
		this.pRating = new RatingElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.nordakademie.evaluation.Evaluation".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Survey:
	//	"survey" name=ID title=STRING greeting=STRING? //total time estimated for survey: tbd
	//	duration=STRING? pages+=Page*;
	public SurveyElements getSurveyAccess() {
		return pSurvey;
	}
	
	public ParserRule getSurveyRule() {
		return getSurveyAccess().getRule();
	}

	//Page:
	//	"page" name=ID "(" question=Question //referred page
	//	("-next->" next=[Page])? ")";
	public PageElements getPageAccess() {
		return pPage;
	}
	
	public ParserRule getPageRule() {
		return getPageAccess().getRule();
	}

	////	| Calendar
	//Question:
	//	Freetext | Selection | Chart | Rating;
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}

	//Freetext:
	//	"freetext" name=ID question=STRING;
	public FreetextElements getFreetextAccess() {
		return pFreetext;
	}
	
	public ParserRule getFreetextRule() {
		return getFreetextAccess().getRule();
	}

	//Selection:
	//	"select" name=ID question=STRING "(" choices+=Choice* ")";
	public SelectionElements getSelectionAccess() {
		return pSelection;
	}
	
	public ParserRule getSelectionRule() {
		return getSelectionAccess().getRule();
	}

	//Choice:
	//	freetext?="freetext"? name=ID bulletPoint=STRING;
	public ChoiceElements getChoiceAccess() {
		return pChoice;
	}
	
	public ParserRule getChoiceRule() {
		return getChoiceAccess().getRule();
	}

	//Chart: //chart with choices and graduations for each
	//	"chart" name=ID question=STRING "(" choices+=Choice* ")" "x" "(" graduations+=Graduation* ")";
	public ChartElements getChartAccess() {
		return pChart;
	}
	
	public ParserRule getChartRule() {
		return getChartAccess().getRule();
	}

	//Graduation:
	//	name=ID? statement=STRING;
	public GraduationElements getGraduationAccess() {
		return pGraduation;
	}
	
	public ParserRule getGraduationRule() {
		return getGraduationAccess().getRule();
	}

	////Calendar:
	////	'calendar' name=ID question=STRING
	////;
	//Rating:
	//	"rating" name=ID question=STRING ratingQuantity=INT;
	public RatingElements getRatingAccess() {
		return pRating;
	}
	
	public ParserRule getRatingRule() {
		return getRatingAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
