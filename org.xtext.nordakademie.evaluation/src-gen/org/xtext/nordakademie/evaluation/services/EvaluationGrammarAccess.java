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
		private final Assignment cPagesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPagesPageParserRuleCall_4_0 = (RuleCall)cPagesAssignment_4.eContents().get(0);
		
		//Survey:
		//	"survey" name=ID title=STRING greeting=STRING? //total time estimated for survey: tbd
		//	//(duration=STRING)?
		//	pages+=Page*;
		@Override public ParserRule getRule() { return rule; }

		//"survey" name=ID title=STRING greeting=STRING? //total time estimated for survey: tbd
		////(duration=STRING)?
		//pages+=Page*
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

		////total time estimated for survey: tbd
		////(duration=STRING)?
		//pages+=Page*
		public Assignment getPagesAssignment_4() { return cPagesAssignment_4; }

		//Page
		public RuleCall getPagesPageParserRuleCall_4_0() { return cPagesPageParserRuleCall_4_0; }
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
		private final Assignment cForwardingAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final Keyword cForwardingForwardingToKeyword_4_0_0 = (Keyword)cForwardingAssignment_4_0.eContents().get(0);
		private final Assignment cFollowingPageAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cFollowingPagePageCrossReference_4_1_0 = (CrossReference)cFollowingPageAssignment_4_1.eContents().get(0);
		private final RuleCall cFollowingPagePageIDTerminalRuleCall_4_1_0_1 = (RuleCall)cFollowingPagePageCrossReference_4_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Page:
		//	"page" name=ID "(" question=Question //referred page
		//	(forwarding?="forwarding to ->" followingPage=[Page])? ")";
		@Override public ParserRule getRule() { return rule; }

		//"page" name=ID "(" question=Question //referred page
		//(forwarding?="forwarding to ->" followingPage=[Page])? ")"
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

		//(forwarding?="forwarding to ->" followingPage=[Page])?
		public Group getGroup_4() { return cGroup_4; }

		//forwarding?="forwarding to ->"
		public Assignment getForwardingAssignment_4_0() { return cForwardingAssignment_4_0; }

		//"forwarding to ->"
		public Keyword getForwardingForwardingToKeyword_4_0_0() { return cForwardingForwardingToKeyword_4_0_0; }

		//followingPage=[Page]
		public Assignment getFollowingPageAssignment_4_1() { return cFollowingPageAssignment_4_1; }

		//[Page]
		public CrossReference getFollowingPagePageCrossReference_4_1_0() { return cFollowingPagePageCrossReference_4_1_0; }

		//ID
		public RuleCall getFollowingPagePageIDTerminalRuleCall_4_1_0_1() { return cFollowingPagePageIDTerminalRuleCall_4_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Question");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFreetextParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRatingParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cChoiceParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		////	| Calendar:tbd
		//Question:
		//	Freetext | Rating | Choice;
		@Override public ParserRule getRule() { return rule; }

		//Freetext | Rating | Choice
		public Alternatives getAlternatives() { return cAlternatives; }

		//Freetext
		public RuleCall getFreetextParserRuleCall_0() { return cFreetextParserRuleCall_0; }

		//Rating
		public RuleCall getRatingParserRuleCall_1() { return cRatingParserRuleCall_1; }

		//Choice
		public RuleCall getChoiceParserRuleCall_2() { return cChoiceParserRuleCall_2; }
	}

	public class FreetextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Freetext");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFreetextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cQuestionTextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQuestionTextSTRINGTerminalRuleCall_2_0 = (RuleCall)cQuestionTextAssignment_2.eContents().get(0);
		private final Assignment cHelpTextAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cHelpTextSTRINGTerminalRuleCall_3_0 = (RuleCall)cHelpTextAssignment_3.eContents().get(0);
		
		//Freetext:
		//	"freetext" name=ID questionText=STRING helpText=STRING?;
		@Override public ParserRule getRule() { return rule; }

		//"freetext" name=ID questionText=STRING helpText=STRING?
		public Group getGroup() { return cGroup; }

		//"freetext"
		public Keyword getFreetextKeyword_0() { return cFreetextKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//questionText=STRING
		public Assignment getQuestionTextAssignment_2() { return cQuestionTextAssignment_2; }

		//STRING
		public RuleCall getQuestionTextSTRINGTerminalRuleCall_2_0() { return cQuestionTextSTRINGTerminalRuleCall_2_0; }

		//helpText=STRING?
		public Assignment getHelpTextAssignment_3() { return cHelpTextAssignment_3; }

		//STRING
		public RuleCall getHelpTextSTRINGTerminalRuleCall_3_0() { return cHelpTextSTRINGTerminalRuleCall_3_0; }
	}

	public class RatingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rating");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRatingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cQuestionTextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQuestionTextSTRINGTerminalRuleCall_2_0 = (RuleCall)cQuestionTextAssignment_2.eContents().get(0);
		private final Assignment cHelpTextAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cHelpTextSTRINGTerminalRuleCall_3_0 = (RuleCall)cHelpTextAssignment_3.eContents().get(0);
		private final Assignment cRatingQuantityAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRatingQuantityINTTerminalRuleCall_4_0 = (RuleCall)cRatingQuantityAssignment_4.eContents().get(0);
		
		//Rating:
		//	"rating" name=ID questionText=STRING helpText=STRING? ratingQuantity=INT;
		@Override public ParserRule getRule() { return rule; }

		//"rating" name=ID questionText=STRING helpText=STRING? ratingQuantity=INT
		public Group getGroup() { return cGroup; }

		//"rating"
		public Keyword getRatingKeyword_0() { return cRatingKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//questionText=STRING
		public Assignment getQuestionTextAssignment_2() { return cQuestionTextAssignment_2; }

		//STRING
		public RuleCall getQuestionTextSTRINGTerminalRuleCall_2_0() { return cQuestionTextSTRINGTerminalRuleCall_2_0; }

		//helpText=STRING?
		public Assignment getHelpTextAssignment_3() { return cHelpTextAssignment_3; }

		//STRING
		public RuleCall getHelpTextSTRINGTerminalRuleCall_3_0() { return cHelpTextSTRINGTerminalRuleCall_3_0; }

		//ratingQuantity=INT
		public Assignment getRatingQuantityAssignment_4() { return cRatingQuantityAssignment_4; }

		//INT
		public RuleCall getRatingQuantityINTTerminalRuleCall_4_0() { return cRatingQuantityINTTerminalRuleCall_4_0; }
	}

	public class ChoiceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Choice");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSelectionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cChartParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Choice:
		//	Selection | Chart;
		@Override public ParserRule getRule() { return rule; }

		//Selection | Chart
		public Alternatives getAlternatives() { return cAlternatives; }

		//Selection
		public RuleCall getSelectionParserRuleCall_0() { return cSelectionParserRuleCall_0; }

		//Chart
		public RuleCall getChartParserRuleCall_1() { return cChartParserRuleCall_1; }
	}

	public class SelectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Selection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSelectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cQuestionTextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQuestionTextSTRINGTerminalRuleCall_2_0 = (RuleCall)cQuestionTextAssignment_2.eContents().get(0);
		private final Assignment cHelpTextAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cHelpTextSTRINGTerminalRuleCall_3_0 = (RuleCall)cHelpTextAssignment_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBulletsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBulletsBulletParserRuleCall_5_0 = (RuleCall)cBulletsAssignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Selection:
		//	"select" name=ID questionText=STRING helpText=STRING? "(" bullets+=Bullet* ")";
		@Override public ParserRule getRule() { return rule; }

		//"select" name=ID questionText=STRING helpText=STRING? "(" bullets+=Bullet* ")"
		public Group getGroup() { return cGroup; }

		//"select"
		public Keyword getSelectKeyword_0() { return cSelectKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//questionText=STRING
		public Assignment getQuestionTextAssignment_2() { return cQuestionTextAssignment_2; }

		//STRING
		public RuleCall getQuestionTextSTRINGTerminalRuleCall_2_0() { return cQuestionTextSTRINGTerminalRuleCall_2_0; }

		//helpText=STRING?
		public Assignment getHelpTextAssignment_3() { return cHelpTextAssignment_3; }

		//STRING
		public RuleCall getHelpTextSTRINGTerminalRuleCall_3_0() { return cHelpTextSTRINGTerminalRuleCall_3_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }

		//bullets+=Bullet*
		public Assignment getBulletsAssignment_5() { return cBulletsAssignment_5; }

		//Bullet
		public RuleCall getBulletsBulletParserRuleCall_5_0() { return cBulletsBulletParserRuleCall_5_0; }

		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
	}

	public class ChartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Chart");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChartKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cQuestionTextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQuestionTextSTRINGTerminalRuleCall_2_0 = (RuleCall)cQuestionTextAssignment_2.eContents().get(0);
		private final Assignment cHelpTextAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cHelpTextSTRINGTerminalRuleCall_3_0 = (RuleCall)cHelpTextAssignment_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBulletsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBulletsBulletParserRuleCall_5_0 = (RuleCall)cBulletsAssignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cXKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cLeftParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cGraduationsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cGraduationsGraduationParserRuleCall_9_0 = (RuleCall)cGraduationsAssignment_9.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Chart: //chart with bullets and graduations for each
		//	"chart" name=ID questionText=STRING helpText=STRING? "(" bullets+=Bullet* ")" "x" "(" graduations+=Graduation* ")";
		@Override public ParserRule getRule() { return rule; }

		////chart with bullets and graduations for each
		//"chart" name=ID questionText=STRING helpText=STRING? "(" bullets+=Bullet* ")" "x" "(" graduations+=Graduation* ")"
		public Group getGroup() { return cGroup; }

		////chart with bullets and graduations for each
		//"chart"
		public Keyword getChartKeyword_0() { return cChartKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//questionText=STRING
		public Assignment getQuestionTextAssignment_2() { return cQuestionTextAssignment_2; }

		//STRING
		public RuleCall getQuestionTextSTRINGTerminalRuleCall_2_0() { return cQuestionTextSTRINGTerminalRuleCall_2_0; }

		//helpText=STRING?
		public Assignment getHelpTextAssignment_3() { return cHelpTextAssignment_3; }

		//STRING
		public RuleCall getHelpTextSTRINGTerminalRuleCall_3_0() { return cHelpTextSTRINGTerminalRuleCall_3_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }

		//bullets+=Bullet*
		public Assignment getBulletsAssignment_5() { return cBulletsAssignment_5; }

		//Bullet
		public RuleCall getBulletsBulletParserRuleCall_5_0() { return cBulletsBulletParserRuleCall_5_0; }

		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }

		//"x"
		public Keyword getXKeyword_7() { return cXKeyword_7; }

		//"("
		public Keyword getLeftParenthesisKeyword_8() { return cLeftParenthesisKeyword_8; }

		//graduations+=Graduation*
		public Assignment getGraduationsAssignment_9() { return cGraduationsAssignment_9; }

		//Graduation
		public RuleCall getGraduationsGraduationParserRuleCall_9_0() { return cGraduationsGraduationParserRuleCall_9_0; }

		//")"
		public Keyword getRightParenthesisKeyword_10() { return cRightParenthesisKeyword_10; }
	}

	public class BulletElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Bullet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFreetextAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFreetextFreetextKeyword_0_0 = (Keyword)cFreetextAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cBulletTextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBulletTextSTRINGTerminalRuleCall_2_0 = (RuleCall)cBulletTextAssignment_2.eContents().get(0);
		
		//Bullet:
		//	freetext?="freetext"? name=ID bulletText=STRING;
		@Override public ParserRule getRule() { return rule; }

		//freetext?="freetext"? name=ID bulletText=STRING
		public Group getGroup() { return cGroup; }

		//freetext?="freetext"?
		public Assignment getFreetextAssignment_0() { return cFreetextAssignment_0; }

		//"freetext"
		public Keyword getFreetextFreetextKeyword_0_0() { return cFreetextFreetextKeyword_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//bulletText=STRING
		public Assignment getBulletTextAssignment_2() { return cBulletTextAssignment_2; }

		//STRING
		public RuleCall getBulletTextSTRINGTerminalRuleCall_2_0() { return cBulletTextSTRINGTerminalRuleCall_2_0; }
	}

	public class GraduationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Graduation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cGraduationTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cGraduationTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cGraduationTextAssignment_1.eContents().get(0);
		
		////Calendar:tbd
		////	'calendar' name=ID question=STRING
		////;
		//Graduation:
		//	name=ID? graduationText=STRING;
		@Override public ParserRule getRule() { return rule; }

		//name=ID? graduationText=STRING
		public Group getGroup() { return cGroup; }

		//name=ID?
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//graduationText=STRING
		public Assignment getGraduationTextAssignment_1() { return cGraduationTextAssignment_1; }

		//STRING
		public RuleCall getGraduationTextSTRINGTerminalRuleCall_1_0() { return cGraduationTextSTRINGTerminalRuleCall_1_0; }
	}
	
	
	private final SurveyElements pSurvey;
	private final PageElements pPage;
	private final QuestionElements pQuestion;
	private final FreetextElements pFreetext;
	private final RatingElements pRating;
	private final ChoiceElements pChoice;
	private final SelectionElements pSelection;
	private final ChartElements pChart;
	private final BulletElements pBullet;
	private final GraduationElements pGraduation;
	
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
		this.pRating = new RatingElements();
		this.pChoice = new ChoiceElements();
		this.pSelection = new SelectionElements();
		this.pChart = new ChartElements();
		this.pBullet = new BulletElements();
		this.pGraduation = new GraduationElements();
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
	//	//(duration=STRING)?
	//	pages+=Page*;
	public SurveyElements getSurveyAccess() {
		return pSurvey;
	}
	
	public ParserRule getSurveyRule() {
		return getSurveyAccess().getRule();
	}

	//Page:
	//	"page" name=ID "(" question=Question //referred page
	//	(forwarding?="forwarding to ->" followingPage=[Page])? ")";
	public PageElements getPageAccess() {
		return pPage;
	}
	
	public ParserRule getPageRule() {
		return getPageAccess().getRule();
	}

	////	| Calendar:tbd
	//Question:
	//	Freetext | Rating | Choice;
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}

	//Freetext:
	//	"freetext" name=ID questionText=STRING helpText=STRING?;
	public FreetextElements getFreetextAccess() {
		return pFreetext;
	}
	
	public ParserRule getFreetextRule() {
		return getFreetextAccess().getRule();
	}

	//Rating:
	//	"rating" name=ID questionText=STRING helpText=STRING? ratingQuantity=INT;
	public RatingElements getRatingAccess() {
		return pRating;
	}
	
	public ParserRule getRatingRule() {
		return getRatingAccess().getRule();
	}

	//Choice:
	//	Selection | Chart;
	public ChoiceElements getChoiceAccess() {
		return pChoice;
	}
	
	public ParserRule getChoiceRule() {
		return getChoiceAccess().getRule();
	}

	//Selection:
	//	"select" name=ID questionText=STRING helpText=STRING? "(" bullets+=Bullet* ")";
	public SelectionElements getSelectionAccess() {
		return pSelection;
	}
	
	public ParserRule getSelectionRule() {
		return getSelectionAccess().getRule();
	}

	//Chart: //chart with bullets and graduations for each
	//	"chart" name=ID questionText=STRING helpText=STRING? "(" bullets+=Bullet* ")" "x" "(" graduations+=Graduation* ")";
	public ChartElements getChartAccess() {
		return pChart;
	}
	
	public ParserRule getChartRule() {
		return getChartAccess().getRule();
	}

	//Bullet:
	//	freetext?="freetext"? name=ID bulletText=STRING;
	public BulletElements getBulletAccess() {
		return pBullet;
	}
	
	public ParserRule getBulletRule() {
		return getBulletAccess().getRule();
	}

	////Calendar:tbd
	////	'calendar' name=ID question=STRING
	////;
	//Graduation:
	//	name=ID? graduationText=STRING;
	public GraduationElements getGraduationAccess() {
		return pGraduation;
	}
	
	public ParserRule getGraduationRule() {
		return getGraduationAccess().getRule();
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
