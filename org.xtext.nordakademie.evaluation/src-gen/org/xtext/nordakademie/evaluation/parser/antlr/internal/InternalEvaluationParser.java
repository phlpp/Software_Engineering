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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'page'", "'('", "')'", "'freetext'", "'select'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
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

                if ( ((LA4_0>=15 && LA4_0<=16)) ) {
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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:260:1: ruleQuestion returns [EObject current=null] : (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_Freetext_0 = null;

        EObject this_Selection_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:263:28: ( (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:264:1: (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:264:1: (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:291:1: entryRuleFreetext returns [EObject current=null] : iv_ruleFreetext= ruleFreetext EOF ;
    public final EObject entryRuleFreetext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetext = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:292:2: (iv_ruleFreetext= ruleFreetext EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:293:2: iv_ruleFreetext= ruleFreetext EOF
            {
             newCompositeNode(grammarAccess.getFreetextRule()); 
            pushFollow(FOLLOW_ruleFreetext_in_entryRuleFreetext540);
            iv_ruleFreetext=ruleFreetext();

            state._fsp--;

             current =iv_ruleFreetext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreetext550); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:300:1: ruleFreetext returns [EObject current=null] : (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFreetext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_question_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:303:28: ( (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:304:1: (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:304:1: (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:304:3: otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleFreetext587); 

                	newLeafNode(otherlv_0, grammarAccess.getFreetextAccess().getFreetextKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:308:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:309:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:309:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:310:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFreetext604); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:326:2: ( (lv_question_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:327:1: (lv_question_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:327:1: (lv_question_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:328:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFreetext626); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:352:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:353:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:354:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_ruleSelection_in_entryRuleSelection667);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelection677); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:361:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' ) ;
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
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:364:28: ( (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:365:1: (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:365:1: (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:365:3: otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSelection714); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:369:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:370:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:370:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:371:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelection731); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:387:2: ( (lv_question_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:388:1: (lv_question_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:388:1: (lv_question_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:389:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSelection753); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSelection770); 

                	newLeafNode(otherlv_3, grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:409:1: ( (lv_choices_4_0= ruleChoice ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:410:1: (lv_choices_4_0= ruleChoice )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:410:1: (lv_choices_4_0= ruleChoice )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:411:3: lv_choices_4_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectionAccess().getChoicesChoiceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleSelection791);
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSelection804); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:439:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:440:2: (iv_ruleChoice= ruleChoice EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:441:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice840);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice850); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:448:1: ruleChoice returns [EObject current=null] : ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_freetext_0_0=null;
        Token lv_name_1_0=null;
        Token lv_bulletPoint_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:451:28: ( ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:452:1: ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:452:1: ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:452:2: ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:452:2: ( (lv_freetext_0_0= 'freetext' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:453:1: (lv_freetext_0_0= 'freetext' )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:453:1: (lv_freetext_0_0= 'freetext' )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:454:3: lv_freetext_0_0= 'freetext'
                    {
                    lv_freetext_0_0=(Token)match(input,15,FOLLOW_15_in_ruleChoice893); 

                            newLeafNode(lv_freetext_0_0, grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "freetext", true, "freetext");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:467:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:468:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:468:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:469:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoice924); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:485:2: ( (lv_bulletPoint_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:486:1: (lv_bulletPoint_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:486:1: (lv_bulletPoint_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:487:3: lv_bulletPoint_2_0= RULE_STRING
            {
            lv_bulletPoint_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoice946); 

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
    public static final BitSet FOLLOW_13_in_rulePage351 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePage372 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_rulePage385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_ruleQuestion478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_ruleQuestion505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_entryRuleFreetext540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreetext550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFreetext587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFreetext604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFreetext626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelection677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSelection714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelection731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSelection753 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSelection770 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleSelection791 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_14_in_ruleSelection804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleChoice893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoice924 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoice946 = new BitSet(new long[]{0x0000000000000002L});

}