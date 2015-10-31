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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'page'", "'('", "'forwarding to ->'", "')'", "'freetext'", "'rating'", "'select'", "'chart'", "'x'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_greeting_3_0= RULE_STRING ) )? ( (lv_pages_4_0= rulePage ) )* ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        Token lv_greeting_3_0=null;
        EObject lv_pages_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:79:28: ( (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_greeting_3_0= RULE_STRING ) )? ( (lv_pages_4_0= rulePage ) )* ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:80:1: (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_greeting_3_0= RULE_STRING ) )? ( (lv_pages_4_0= rulePage ) )* )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:80:1: (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_greeting_3_0= RULE_STRING ) )? ( (lv_pages_4_0= rulePage ) )* )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:80:3: otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_greeting_3_0= RULE_STRING ) )? ( (lv_pages_4_0= rulePage ) )*
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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:138:3: ( (lv_pages_4_0= rulePage ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:139:1: (lv_pages_4_0= rulePage )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:139:1: (lv_pages_4_0= rulePage )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:140:3: lv_pages_4_0= rulePage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePage_in_ruleSurvey210);
            	    lv_pages_4_0=rulePage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_4_0, 
            	            		"Page");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:164:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:165:2: (iv_rulePage= rulePage EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:166:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage247);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage257); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:173:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_question_3_0= ruleQuestion ) ) ( ( (lv_forwarding_4_0= 'forwarding to ->' ) ) ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ')' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_forwarding_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_question_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:176:28: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_question_3_0= ruleQuestion ) ) ( ( (lv_forwarding_4_0= 'forwarding to ->' ) ) ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ')' ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:177:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_question_3_0= ruleQuestion ) ) ( ( (lv_forwarding_4_0= 'forwarding to ->' ) ) ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ')' )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:177:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_question_3_0= ruleQuestion ) ) ( ( (lv_forwarding_4_0= 'forwarding to ->' ) ) ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ')' )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:177:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_question_3_0= ruleQuestion ) ) ( ( (lv_forwarding_4_0= 'forwarding to ->' ) ) ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePage294); 

                	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:181:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:182:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:182:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:183:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage311); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePage328); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:203:1: ( (lv_question_3_0= ruleQuestion ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:204:1: (lv_question_3_0= ruleQuestion )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:204:1: (lv_question_3_0= ruleQuestion )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:205:3: lv_question_3_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getPageAccess().getQuestionQuestionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQuestion_in_rulePage349);
            lv_question_3_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPageRule());
            	        }
                   		set(
                   			current, 
                   			"question",
                    		lv_question_3_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:221:2: ( ( (lv_forwarding_4_0= 'forwarding to ->' ) ) ( (otherlv_5= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:221:3: ( (lv_forwarding_4_0= 'forwarding to ->' ) ) ( (otherlv_5= RULE_ID ) )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:221:3: ( (lv_forwarding_4_0= 'forwarding to ->' ) )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:222:1: (lv_forwarding_4_0= 'forwarding to ->' )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:222:1: (lv_forwarding_4_0= 'forwarding to ->' )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:223:3: lv_forwarding_4_0= 'forwarding to ->'
                    {
                    lv_forwarding_4_0=(Token)match(input,14,FOLLOW_14_in_rulePage368); 

                            newLeafNode(lv_forwarding_4_0, grammarAccess.getPageAccess().getForwardingForwardingToKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPageRule());
                    	        }
                           		setWithLastConsumed(current, "forwarding", true, "forwarding to ->");
                    	    

                    }


                    }

                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:236:2: ( (otherlv_5= RULE_ID ) )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:237:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:237:1: (otherlv_5= RULE_ID )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:238:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPageRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage401); 

                    		newLeafNode(otherlv_5, grammarAccess.getPageAccess().getFollowingPagePageCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulePage415); 

                	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getRightParenthesisKeyword_5());
                

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:261:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:262:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:263:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion451);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion461); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:270:1: ruleQuestion returns [EObject current=null] : (this_Freetext_0= ruleFreetext | this_Rating_1= ruleRating | this_Choice_2= ruleChoice ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_Freetext_0 = null;

        EObject this_Rating_1 = null;

        EObject this_Choice_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:273:28: ( (this_Freetext_0= ruleFreetext | this_Rating_1= ruleRating | this_Choice_2= ruleChoice ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:274:1: (this_Freetext_0= ruleFreetext | this_Rating_1= ruleRating | this_Choice_2= ruleChoice )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:274:1: (this_Freetext_0= ruleFreetext | this_Rating_1= ruleRating | this_Choice_2= ruleChoice )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:275:5: this_Freetext_0= ruleFreetext
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getFreetextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFreetext_in_ruleQuestion508);
                    this_Freetext_0=ruleFreetext();

                    state._fsp--;

                     
                            current = this_Freetext_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:285:5: this_Rating_1= ruleRating
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRatingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRating_in_ruleQuestion535);
                    this_Rating_1=ruleRating();

                    state._fsp--;

                     
                            current = this_Rating_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:295:5: this_Choice_2= ruleChoice
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getChoiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleChoice_in_ruleQuestion562);
                    this_Choice_2=ruleChoice();

                    state._fsp--;

                     
                            current = this_Choice_2; 
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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:311:1: entryRuleFreetext returns [EObject current=null] : iv_ruleFreetext= ruleFreetext EOF ;
    public final EObject entryRuleFreetext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetext = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:312:2: (iv_ruleFreetext= ruleFreetext EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:313:2: iv_ruleFreetext= ruleFreetext EOF
            {
             newCompositeNode(grammarAccess.getFreetextRule()); 
            pushFollow(FOLLOW_ruleFreetext_in_entryRuleFreetext597);
            iv_ruleFreetext=ruleFreetext();

            state._fsp--;

             current =iv_ruleFreetext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreetext607); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:320:1: ruleFreetext returns [EObject current=null] : (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleFreetext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_questionText_2_0=null;
        Token lv_helpText_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:323:28: ( (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:324:1: (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:324:1: (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:324:3: otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleFreetext644); 

                	newLeafNode(otherlv_0, grammarAccess.getFreetextAccess().getFreetextKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:328:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:329:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:329:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:330:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFreetext661); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:346:2: ( (lv_questionText_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:347:1: (lv_questionText_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:347:1: (lv_questionText_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:348:3: lv_questionText_2_0= RULE_STRING
            {
            lv_questionText_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFreetext683); 

            			newLeafNode(lv_questionText_2_0, grammarAccess.getFreetextAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreetextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"questionText",
                    		lv_questionText_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:364:2: ( (lv_helpText_3_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:365:1: (lv_helpText_3_0= RULE_STRING )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:365:1: (lv_helpText_3_0= RULE_STRING )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:366:3: lv_helpText_3_0= RULE_STRING
                    {
                    lv_helpText_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFreetext705); 

                    			newLeafNode(lv_helpText_3_0, grammarAccess.getFreetextAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFreetextRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"helpText",
                            		lv_helpText_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleRating"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:390:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:391:2: (iv_ruleRating= ruleRating EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:392:2: iv_ruleRating= ruleRating EOF
            {
             newCompositeNode(grammarAccess.getRatingRule()); 
            pushFollow(FOLLOW_ruleRating_in_entryRuleRating747);
            iv_ruleRating=ruleRating();

            state._fsp--;

             current =iv_ruleRating; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRating757); 

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
    // $ANTLR end "entryRuleRating"


    // $ANTLR start "ruleRating"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:399:1: ruleRating returns [EObject current=null] : (otherlv_0= 'rating' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? ( (lv_ratingQuantity_4_0= RULE_INT ) ) ) ;
    public final EObject ruleRating() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_questionText_2_0=null;
        Token lv_helpText_3_0=null;
        Token lv_ratingQuantity_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:402:28: ( (otherlv_0= 'rating' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? ( (lv_ratingQuantity_4_0= RULE_INT ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:403:1: (otherlv_0= 'rating' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? ( (lv_ratingQuantity_4_0= RULE_INT ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:403:1: (otherlv_0= 'rating' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? ( (lv_ratingQuantity_4_0= RULE_INT ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:403:3: otherlv_0= 'rating' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? ( (lv_ratingQuantity_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleRating794); 

                	newLeafNode(otherlv_0, grammarAccess.getRatingAccess().getRatingKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:407:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:408:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:408:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:409:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRating811); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRatingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:425:2: ( (lv_questionText_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:426:1: (lv_questionText_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:426:1: (lv_questionText_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:427:3: lv_questionText_2_0= RULE_STRING
            {
            lv_questionText_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRating833); 

            			newLeafNode(lv_questionText_2_0, grammarAccess.getRatingAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"questionText",
                    		lv_questionText_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:443:2: ( (lv_helpText_3_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:444:1: (lv_helpText_3_0= RULE_STRING )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:444:1: (lv_helpText_3_0= RULE_STRING )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:445:3: lv_helpText_3_0= RULE_STRING
                    {
                    lv_helpText_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRating855); 

                    			newLeafNode(lv_helpText_3_0, grammarAccess.getRatingAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRatingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"helpText",
                            		lv_helpText_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:461:3: ( (lv_ratingQuantity_4_0= RULE_INT ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:462:1: (lv_ratingQuantity_4_0= RULE_INT )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:462:1: (lv_ratingQuantity_4_0= RULE_INT )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:463:3: lv_ratingQuantity_4_0= RULE_INT
            {
            lv_ratingQuantity_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRating878); 

            			newLeafNode(lv_ratingQuantity_4_0, grammarAccess.getRatingAccess().getRatingQuantityINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ratingQuantity",
                    		lv_ratingQuantity_4_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleRating"


    // $ANTLR start "entryRuleChoice"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:487:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:488:2: (iv_ruleChoice= ruleChoice EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:489:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice919);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice929); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:496:1: ruleChoice returns [EObject current=null] : (this_Selection_0= ruleSelection | this_Chart_1= ruleChart ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        EObject this_Selection_0 = null;

        EObject this_Chart_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:499:28: ( (this_Selection_0= ruleSelection | this_Chart_1= ruleChart ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:500:1: (this_Selection_0= ruleSelection | this_Chart_1= ruleChart )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:500:1: (this_Selection_0= ruleSelection | this_Chart_1= ruleChart )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:501:5: this_Selection_0= ruleSelection
                    {
                     
                            newCompositeNode(grammarAccess.getChoiceAccess().getSelectionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelection_in_ruleChoice976);
                    this_Selection_0=ruleSelection();

                    state._fsp--;

                     
                            current = this_Selection_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:511:5: this_Chart_1= ruleChart
                    {
                     
                            newCompositeNode(grammarAccess.getChoiceAccess().getChartParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChart_in_ruleChoice1003);
                    this_Chart_1=ruleChart();

                    state._fsp--;

                     
                            current = this_Chart_1; 
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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleSelection"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:527:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:528:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:529:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_ruleSelection_in_entryRuleSelection1038);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelection1048); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:536:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? otherlv_4= '(' ( (lv_bullets_5_0= ruleBullet ) )* otherlv_6= ')' ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_questionText_2_0=null;
        Token lv_helpText_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_bullets_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:539:28: ( (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? otherlv_4= '(' ( (lv_bullets_5_0= ruleBullet ) )* otherlv_6= ')' ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:540:1: (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? otherlv_4= '(' ( (lv_bullets_5_0= ruleBullet ) )* otherlv_6= ')' )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:540:1: (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? otherlv_4= '(' ( (lv_bullets_5_0= ruleBullet ) )* otherlv_6= ')' )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:540:3: otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? otherlv_4= '(' ( (lv_bullets_5_0= ruleBullet ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSelection1085); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:544:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:545:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:545:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:546:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelection1102); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:562:2: ( (lv_questionText_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:563:1: (lv_questionText_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:563:1: (lv_questionText_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:564:3: lv_questionText_2_0= RULE_STRING
            {
            lv_questionText_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSelection1124); 

            			newLeafNode(lv_questionText_2_0, grammarAccess.getSelectionAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"questionText",
                    		lv_questionText_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:580:2: ( (lv_helpText_3_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:581:1: (lv_helpText_3_0= RULE_STRING )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:581:1: (lv_helpText_3_0= RULE_STRING )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:582:3: lv_helpText_3_0= RULE_STRING
                    {
                    lv_helpText_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSelection1146); 

                    			newLeafNode(lv_helpText_3_0, grammarAccess.getSelectionAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"helpText",
                            		lv_helpText_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSelection1164); 

                	newLeafNode(otherlv_4, grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_4());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:602:1: ( (lv_bullets_5_0= ruleBullet ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:603:1: (lv_bullets_5_0= ruleBullet )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:603:1: (lv_bullets_5_0= ruleBullet )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:604:3: lv_bullets_5_0= ruleBullet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectionAccess().getBulletsBulletParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBullet_in_ruleSelection1185);
            	    lv_bullets_5_0=ruleBullet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bullets",
            	            		lv_bullets_5_0, 
            	            		"Bullet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSelection1198); 

                	newLeafNode(otherlv_6, grammarAccess.getSelectionAccess().getRightParenthesisKeyword_6());
                

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


    // $ANTLR start "entryRuleChart"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:632:1: entryRuleChart returns [EObject current=null] : iv_ruleChart= ruleChart EOF ;
    public final EObject entryRuleChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChart = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:633:2: (iv_ruleChart= ruleChart EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:634:2: iv_ruleChart= ruleChart EOF
            {
             newCompositeNode(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_ruleChart_in_entryRuleChart1234);
            iv_ruleChart=ruleChart();

            state._fsp--;

             current =iv_ruleChart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChart1244); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:641:1: ruleChart returns [EObject current=null] : (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? otherlv_4= '(' ( (lv_bullets_5_0= ruleBullet ) )* otherlv_6= ')' otherlv_7= 'x' otherlv_8= '(' ( (lv_graduations_9_0= ruleGraduation ) )* otherlv_10= ')' ) ;
    public final EObject ruleChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_questionText_2_0=null;
        Token lv_helpText_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_bullets_5_0 = null;

        EObject lv_graduations_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:644:28: ( (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? otherlv_4= '(' ( (lv_bullets_5_0= ruleBullet ) )* otherlv_6= ')' otherlv_7= 'x' otherlv_8= '(' ( (lv_graduations_9_0= ruleGraduation ) )* otherlv_10= ')' ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:645:1: (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? otherlv_4= '(' ( (lv_bullets_5_0= ruleBullet ) )* otherlv_6= ')' otherlv_7= 'x' otherlv_8= '(' ( (lv_graduations_9_0= ruleGraduation ) )* otherlv_10= ')' )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:645:1: (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? otherlv_4= '(' ( (lv_bullets_5_0= ruleBullet ) )* otherlv_6= ')' otherlv_7= 'x' otherlv_8= '(' ( (lv_graduations_9_0= ruleGraduation ) )* otherlv_10= ')' )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:645:3: otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionText_2_0= RULE_STRING ) ) ( (lv_helpText_3_0= RULE_STRING ) )? otherlv_4= '(' ( (lv_bullets_5_0= ruleBullet ) )* otherlv_6= ')' otherlv_7= 'x' otherlv_8= '(' ( (lv_graduations_9_0= ruleGraduation ) )* otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleChart1281); 

                	newLeafNode(otherlv_0, grammarAccess.getChartAccess().getChartKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:649:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:650:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:650:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:651:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChart1298); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:667:2: ( (lv_questionText_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:668:1: (lv_questionText_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:668:1: (lv_questionText_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:669:3: lv_questionText_2_0= RULE_STRING
            {
            lv_questionText_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChart1320); 

            			newLeafNode(lv_questionText_2_0, grammarAccess.getChartAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"questionText",
                    		lv_questionText_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:685:2: ( (lv_helpText_3_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:686:1: (lv_helpText_3_0= RULE_STRING )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:686:1: (lv_helpText_3_0= RULE_STRING )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:687:3: lv_helpText_3_0= RULE_STRING
                    {
                    lv_helpText_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChart1342); 

                    			newLeafNode(lv_helpText_3_0, grammarAccess.getChartAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChartRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"helpText",
                            		lv_helpText_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleChart1360); 

                	newLeafNode(otherlv_4, grammarAccess.getChartAccess().getLeftParenthesisKeyword_4());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:707:1: ( (lv_bullets_5_0= ruleBullet ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:708:1: (lv_bullets_5_0= ruleBullet )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:708:1: (lv_bullets_5_0= ruleBullet )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:709:3: lv_bullets_5_0= ruleBullet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChartAccess().getBulletsBulletParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBullet_in_ruleChart1381);
            	    lv_bullets_5_0=ruleBullet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bullets",
            	            		lv_bullets_5_0, 
            	            		"Bullet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleChart1394); 

                	newLeafNode(otherlv_6, grammarAccess.getChartAccess().getRightParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleChart1406); 

                	newLeafNode(otherlv_7, grammarAccess.getChartAccess().getXKeyword_7());
                
            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleChart1418); 

                	newLeafNode(otherlv_8, grammarAccess.getChartAccess().getLeftParenthesisKeyword_8());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:737:1: ( (lv_graduations_9_0= ruleGraduation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:738:1: (lv_graduations_9_0= ruleGraduation )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:738:1: (lv_graduations_9_0= ruleGraduation )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:739:3: lv_graduations_9_0= ruleGraduation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChartAccess().getGraduationsGraduationParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGraduation_in_ruleChart1439);
            	    lv_graduations_9_0=ruleGraduation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"graduations",
            	            		lv_graduations_9_0, 
            	            		"Graduation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleChart1452); 

                	newLeafNode(otherlv_10, grammarAccess.getChartAccess().getRightParenthesisKeyword_10());
                

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


    // $ANTLR start "entryRuleBullet"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:767:1: entryRuleBullet returns [EObject current=null] : iv_ruleBullet= ruleBullet EOF ;
    public final EObject entryRuleBullet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBullet = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:768:2: (iv_ruleBullet= ruleBullet EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:769:2: iv_ruleBullet= ruleBullet EOF
            {
             newCompositeNode(grammarAccess.getBulletRule()); 
            pushFollow(FOLLOW_ruleBullet_in_entryRuleBullet1488);
            iv_ruleBullet=ruleBullet();

            state._fsp--;

             current =iv_ruleBullet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBullet1498); 

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
    // $ANTLR end "entryRuleBullet"


    // $ANTLR start "ruleBullet"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:776:1: ruleBullet returns [EObject current=null] : ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletText_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleBullet() throws RecognitionException {
        EObject current = null;

        Token lv_freetext_0_0=null;
        Token lv_name_1_0=null;
        Token lv_bulletText_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:779:28: ( ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletText_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:780:1: ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletText_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:780:1: ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletText_2_0= RULE_STRING ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:780:2: ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletText_2_0= RULE_STRING ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:780:2: ( (lv_freetext_0_0= 'freetext' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:781:1: (lv_freetext_0_0= 'freetext' )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:781:1: (lv_freetext_0_0= 'freetext' )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:782:3: lv_freetext_0_0= 'freetext'
                    {
                    lv_freetext_0_0=(Token)match(input,16,FOLLOW_16_in_ruleBullet1541); 

                            newLeafNode(lv_freetext_0_0, grammarAccess.getBulletAccess().getFreetextFreetextKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBulletRule());
                    	        }
                           		setWithLastConsumed(current, "freetext", true, "freetext");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:795:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:796:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:796:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:797:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBullet1572); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBulletAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBulletRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:813:2: ( (lv_bulletText_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:814:1: (lv_bulletText_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:814:1: (lv_bulletText_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:815:3: lv_bulletText_2_0= RULE_STRING
            {
            lv_bulletText_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBullet1594); 

            			newLeafNode(lv_bulletText_2_0, grammarAccess.getBulletAccess().getBulletTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBulletRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"bulletText",
                    		lv_bulletText_2_0, 
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
    // $ANTLR end "ruleBullet"


    // $ANTLR start "entryRuleGraduation"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:839:1: entryRuleGraduation returns [EObject current=null] : iv_ruleGraduation= ruleGraduation EOF ;
    public final EObject entryRuleGraduation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraduation = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:840:2: (iv_ruleGraduation= ruleGraduation EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:841:2: iv_ruleGraduation= ruleGraduation EOF
            {
             newCompositeNode(grammarAccess.getGraduationRule()); 
            pushFollow(FOLLOW_ruleGraduation_in_entryRuleGraduation1635);
            iv_ruleGraduation=ruleGraduation();

            state._fsp--;

             current =iv_ruleGraduation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraduation1645); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:848:1: ruleGraduation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_graduationText_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGraduation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_graduationText_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:851:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_graduationText_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:852:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_graduationText_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:852:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_graduationText_1_0= RULE_STRING ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:852:2: ( (lv_name_0_0= RULE_ID ) )? ( (lv_graduationText_1_0= RULE_STRING ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:852:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:853:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:853:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:854:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGraduation1687); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:870:3: ( (lv_graduationText_1_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:871:1: (lv_graduationText_1_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:871:1: (lv_graduationText_1_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:872:3: lv_graduationText_1_0= RULE_STRING
            {
            lv_graduationText_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGraduation1710); 

            			newLeafNode(lv_graduationText_1_0, grammarAccess.getGraduationAccess().getGraduationTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGraduationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"graduationText",
                    		lv_graduationText_1_0, 
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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSurvey183 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePage_in_ruleSurvey210 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePage294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage311 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage328 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePage349 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_rulePage368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage401 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_ruleQuestion508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRating_in_ruleQuestion535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleQuestion562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_entryRuleFreetext597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreetext607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFreetext644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFreetext661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFreetext683 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFreetext705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRating_in_entryRuleRating747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRating757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRating794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRating811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRating833 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRating855 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRating878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_ruleChoice976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_ruleChoice1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelection1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSelection1085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelection1102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSelection1124 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSelection1146 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSelection1164 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_ruleBullet_in_ruleSelection1185 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_15_in_ruleSelection1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_entryRuleChart1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChart1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleChart1281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChart1298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChart1320 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChart1342 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChart1360 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_ruleBullet_in_ruleChart1381 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_15_in_ruleChart1394 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleChart1406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChart1418 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_ruleGraduation_in_ruleChart1439 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_15_in_ruleChart1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBullet_in_entryRuleBullet1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBullet1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBullet1541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBullet1572 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBullet1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraduation_in_entryRuleGraduation1635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraduation1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGraduation1687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGraduation1710 = new BitSet(new long[]{0x0000000000000002L});

}