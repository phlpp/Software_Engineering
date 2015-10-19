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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvaluationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'page'", "'('", "')'", "'freetext'", "'select'", "'chart'", "'x'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEvaluationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvaluationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvaluationParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g"; }



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



    // $ANTLR start "entryRuleSurvey"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:67:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:68:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:69:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FOLLOW_ruleSurvey_in_entryRuleSurvey75);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurvey85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_greeting_3_0= RULE_STRING ) )? ( (lv_duration_4_0= RULE_STRING ) )? ( (lv_pages_5_0= rulePage ) )* ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        Token lv_greeting_3_0=null;
        Token lv_duration_4_0=null;
        EObject lv_pages_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:79:28: ( (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_greeting_3_0= RULE_STRING ) )? ( (lv_duration_4_0= RULE_STRING ) )? ( (lv_pages_5_0= rulePage ) )* ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:80:1: (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_greeting_3_0= RULE_STRING ) )? ( (lv_duration_4_0= RULE_STRING ) )? ( (lv_pages_5_0= rulePage ) )* )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:80:1: (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_greeting_3_0= RULE_STRING ) )? ( (lv_duration_4_0= RULE_STRING ) )? ( (lv_pages_5_0= rulePage ) )* )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:80:3: otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_greeting_3_0= RULE_STRING ) )? ( (lv_duration_4_0= RULE_STRING ) )? ( (lv_pages_5_0= rulePage ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSurvey122); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getSurveyKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSurvey139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSurveyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:102:2: ( (lv_title_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:103:1: (lv_title_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:103:1: (lv_title_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:104:3: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSurvey161); 

            			newLeafNode(lv_title_2_0, grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSurveyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:120:2: ( (lv_greeting_3_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:121:1: (lv_greeting_3_0= RULE_STRING )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:121:1: (lv_greeting_3_0= RULE_STRING )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:122:3: lv_greeting_3_0= RULE_STRING
                    {
                    lv_greeting_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSurvey183); 

                    			newLeafNode(lv_greeting_3_0, grammarAccess.getSurveyAccess().getGreetingSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSurveyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"greeting",
                            		lv_greeting_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:138:3: ( (lv_duration_4_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:139:1: (lv_duration_4_0= RULE_STRING )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:139:1: (lv_duration_4_0= RULE_STRING )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:140:3: lv_duration_4_0= RULE_STRING
                    {
                    lv_duration_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSurvey206); 

                    			newLeafNode(lv_duration_4_0, grammarAccess.getSurveyAccess().getDurationSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSurveyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duration",
                            		lv_duration_4_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:156:3: ( (lv_pages_5_0= rulePage ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:157:1: (lv_pages_5_0= rulePage )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:157:1: (lv_pages_5_0= rulePage )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:158:3: lv_pages_5_0= rulePage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePage_in_ruleSurvey233);
            	    lv_pages_5_0=rulePage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_5_0, 
            	            		"Page");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRulePage"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:182:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:183:2: (iv_rulePage= rulePage EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:184:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage270);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage280); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:191:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= ')' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:194:28: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= ')' ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:195:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= ')' )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:195:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= ')' )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:195:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePage317); 

                	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:199:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:200:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:200:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:201:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage334); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePage351); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:221:1: ( (lv_questions_3_0= ruleQuestion ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:222:1: (lv_questions_3_0= ruleQuestion )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:222:1: (lv_questions_3_0= ruleQuestion )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:223:3: lv_questions_3_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_rulePage372);
            	    lv_questions_3_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_3_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePage385); 

                	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:251:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:252:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:253:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion421);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion431); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:260:1: ruleQuestion returns [EObject current=null] : (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection | this_Chart_2= ruleChart ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_Freetext_0 = null;

        EObject this_Selection_1 = null;

        EObject this_Chart_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:263:28: ( (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection | this_Chart_2= ruleChart ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:264:1: (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection | this_Chart_2= ruleChart )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:264:1: (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection | this_Chart_2= ruleChart )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:265:5: this_Freetext_0= ruleFreetext
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getFreetextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFreetext_in_ruleQuestion478);
                    this_Freetext_0=ruleFreetext();

                    state._fsp--;

                     
                            current = this_Freetext_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:275:5: this_Selection_1= ruleSelection
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSelectionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSelection_in_ruleQuestion505);
                    this_Selection_1=ruleSelection();

                    state._fsp--;

                     
                            current = this_Selection_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:285:5: this_Chart_2= ruleChart
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getChartParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleChart_in_ruleQuestion532);
                    this_Chart_2=ruleChart();

                    state._fsp--;

                     
                            current = this_Chart_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleFreetext"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:301:1: entryRuleFreetext returns [EObject current=null] : iv_ruleFreetext= ruleFreetext EOF ;
    public final EObject entryRuleFreetext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetext = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:302:2: (iv_ruleFreetext= ruleFreetext EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:303:2: iv_ruleFreetext= ruleFreetext EOF
            {
             newCompositeNode(grammarAccess.getFreetextRule()); 
            pushFollow(FOLLOW_ruleFreetext_in_entryRuleFreetext567);
            iv_ruleFreetext=ruleFreetext();

            state._fsp--;

             current =iv_ruleFreetext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreetext577); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFreetext"


    // $ANTLR start "ruleFreetext"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:310:1: ruleFreetext returns [EObject current=null] : (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFreetext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_question_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:313:28: ( (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:314:1: (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:314:1: (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:314:3: otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleFreetext614); 

                	newLeafNode(otherlv_0, grammarAccess.getFreetextAccess().getFreetextKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:318:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:319:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:319:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:320:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFreetext631); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFreetextAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreetextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:336:2: ( (lv_question_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:337:1: (lv_question_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:337:1: (lv_question_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:338:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFreetext653); 

            			newLeafNode(lv_question_2_0, grammarAccess.getFreetextAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreetextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFreetext"


    // $ANTLR start "entryRuleSelection"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:362:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:363:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:364:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_ruleSelection_in_entryRuleSelection694);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelection704); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:371:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_question_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_choices_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:374:28: ( (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:375:1: (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:375:1: (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:375:3: otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSelection741); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:379:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:380:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:380:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:381:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelection758); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSelectionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:397:2: ( (lv_question_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:398:1: (lv_question_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:398:1: (lv_question_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:399:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSelection780); 

            			newLeafNode(lv_question_2_0, grammarAccess.getSelectionAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSelection797); 

                	newLeafNode(otherlv_3, grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:419:1: ( (lv_choices_4_0= ruleChoice ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:420:1: (lv_choices_4_0= ruleChoice )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:420:1: (lv_choices_4_0= ruleChoice )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:421:3: lv_choices_4_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectionAccess().getChoicesChoiceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleSelection818);
            	    lv_choices_4_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choices",
            	            		lv_choices_4_0, 
            	            		"Choice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSelection831); 

                	newLeafNode(otherlv_5, grammarAccess.getSelectionAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleChoice"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:449:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:450:2: (iv_ruleChoice= ruleChoice EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:451:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice867);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice877); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:458:1: ruleChoice returns [EObject current=null] : ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_freetext_0_0=null;
        Token lv_name_1_0=null;
        Token lv_bulletPoint_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:461:28: ( ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:462:1: ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:462:1: ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:462:2: ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:462:2: ( (lv_freetext_0_0= 'freetext' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:463:1: (lv_freetext_0_0= 'freetext' )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:463:1: (lv_freetext_0_0= 'freetext' )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:464:3: lv_freetext_0_0= 'freetext'
                    {
                    lv_freetext_0_0=(Token)match(input,15,FOLLOW_15_in_ruleChoice920); 

                            newLeafNode(lv_freetext_0_0, grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "freetext", true, "freetext");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:477:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:478:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:478:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:479:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoice951); 

            			newLeafNode(lv_name_1_0, grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:495:2: ( (lv_bulletPoint_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:496:1: (lv_bulletPoint_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:496:1: (lv_bulletPoint_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:497:3: lv_bulletPoint_2_0= RULE_STRING
            {
            lv_bulletPoint_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoice973); 

            			newLeafNode(lv_bulletPoint_2_0, grammarAccess.getChoiceAccess().getBulletPointSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"bulletPoint",
                    		lv_bulletPoint_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleChart"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:521:1: entryRuleChart returns [EObject current=null] : iv_ruleChart= ruleChart EOF ;
    public final EObject entryRuleChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChart = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:522:2: (iv_ruleChart= ruleChart EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:523:2: iv_ruleChart= ruleChart EOF
            {
             newCompositeNode(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_ruleChart_in_entryRuleChart1014);
            iv_ruleChart=ruleChart();

            state._fsp--;

             current =iv_ruleChart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChart1024); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChart"


    // $ANTLR start "ruleChart"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:530:1: ruleChart returns [EObject current=null] : (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' otherlv_6= 'x' otherlv_7= '(' ( (lv_graduations_8_0= ruleGraduation ) )* otherlv_9= ')' ) ;
    public final EObject ruleChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_question_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_choices_4_0 = null;

        EObject lv_graduations_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:533:28: ( (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' otherlv_6= 'x' otherlv_7= '(' ( (lv_graduations_8_0= ruleGraduation ) )* otherlv_9= ')' ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:534:1: (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' otherlv_6= 'x' otherlv_7= '(' ( (lv_graduations_8_0= ruleGraduation ) )* otherlv_9= ')' )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:534:1: (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' otherlv_6= 'x' otherlv_7= '(' ( (lv_graduations_8_0= ruleGraduation ) )* otherlv_9= ')' )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:534:3: otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' otherlv_6= 'x' otherlv_7= '(' ( (lv_graduations_8_0= ruleGraduation ) )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleChart1061); 

                	newLeafNode(otherlv_0, grammarAccess.getChartAccess().getChartKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:538:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:539:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:539:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:540:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChart1078); 

            			newLeafNode(lv_name_1_0, grammarAccess.getChartAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:556:2: ( (lv_question_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:557:1: (lv_question_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:557:1: (lv_question_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:558:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChart1100); 

            			newLeafNode(lv_question_2_0, grammarAccess.getChartAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleChart1117); 

                	newLeafNode(otherlv_3, grammarAccess.getChartAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:578:1: ( (lv_choices_4_0= ruleChoice ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:579:1: (lv_choices_4_0= ruleChoice )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:579:1: (lv_choices_4_0= ruleChoice )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:580:3: lv_choices_4_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChartAccess().getChoicesChoiceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleChart1138);
            	    lv_choices_4_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choices",
            	            		lv_choices_4_0, 
            	            		"Choice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleChart1151); 

                	newLeafNode(otherlv_5, grammarAccess.getChartAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleChart1163); 

                	newLeafNode(otherlv_6, grammarAccess.getChartAccess().getXKeyword_6());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleChart1175); 

                	newLeafNode(otherlv_7, grammarAccess.getChartAccess().getLeftParenthesisKeyword_7());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:608:1: ( (lv_graduations_8_0= ruleGraduation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:609:1: (lv_graduations_8_0= ruleGraduation )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:609:1: (lv_graduations_8_0= ruleGraduation )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:610:3: lv_graduations_8_0= ruleGraduation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChartAccess().getGraduationsGraduationParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGraduation_in_ruleChart1196);
            	    lv_graduations_8_0=ruleGraduation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"graduations",
            	            		lv_graduations_8_0, 
            	            		"Graduation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleChart1209); 

                	newLeafNode(otherlv_9, grammarAccess.getChartAccess().getRightParenthesisKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChart"


    // $ANTLR start "entryRuleGraduation"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:638:1: entryRuleGraduation returns [EObject current=null] : iv_ruleGraduation= ruleGraduation EOF ;
    public final EObject entryRuleGraduation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraduation = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:639:2: (iv_ruleGraduation= ruleGraduation EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:640:2: iv_ruleGraduation= ruleGraduation EOF
            {
             newCompositeNode(grammarAccess.getGraduationRule()); 
            pushFollow(FOLLOW_ruleGraduation_in_entryRuleGraduation1245);
            iv_ruleGraduation=ruleGraduation();

            state._fsp--;

             current =iv_ruleGraduation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraduation1255); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraduation"


    // $ANTLR start "ruleGraduation"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:647:1: ruleGraduation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_statement_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGraduation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_statement_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:650:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_statement_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:651:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_statement_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:651:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_statement_1_0= RULE_STRING ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:651:2: ( (lv_name_0_0= RULE_ID ) )? ( (lv_statement_1_0= RULE_STRING ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:651:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:652:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:652:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:653:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGraduation1297); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getGraduationAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGraduationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:669:3: ( (lv_statement_1_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:670:1: (lv_statement_1_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:670:1: (lv_statement_1_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:671:3: lv_statement_1_0= RULE_STRING
            {
            lv_statement_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGraduation1320); 

            			newLeafNode(lv_statement_1_0, grammarAccess.getGraduationAccess().getStatementSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGraduationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"statement",
                    		lv_statement_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraduation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSurvey122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSurvey139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSurvey161 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSurvey183 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSurvey206 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePage_in_ruleSurvey233 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePage317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage334 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage351 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePage372 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_14_in_rulePage385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_ruleQuestion478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_ruleQuestion505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_ruleQuestion532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_entryRuleFreetext567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreetext577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFreetext614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFreetext631 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFreetext653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelection704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSelection741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelection758 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSelection780 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSelection797 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleSelection818 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_14_in_ruleSelection831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleChoice920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoice951 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoice973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_entryRuleChart1014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChart1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleChart1061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChart1078 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChart1100 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChart1117 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleChart1138 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_14_in_ruleChart1151 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleChart1163 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChart1175 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_ruleGraduation_in_ruleChart1196 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_14_in_ruleChart1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraduation_in_entryRuleGraduation1245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraduation1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGraduation1297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGraduation1320 = new BitSet(new long[]{0x0000000000000002L});

}