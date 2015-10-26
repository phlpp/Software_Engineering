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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'page'", "'('", "'-next->'", "')'", "'freetext'", "'select'", "'chart'", "'x'", "'rating'"
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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:191:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '-next->' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ')' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_question_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:194:28: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '-next->' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ')' ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:195:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '-next->' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ')' )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:195:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '-next->' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ')' )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:195:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '-next->' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ')'
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
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:221:1: ( (lv_question_3_0= ruleQuestion ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:222:1: (lv_question_3_0= ruleQuestion )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:222:1: (lv_question_3_0= ruleQuestion )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:223:3: lv_question_3_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getPageAccess().getQuestionQuestionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQuestion_in_rulePage372);
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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:239:2: (otherlv_4= '-next->' ( (otherlv_5= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:239:4: otherlv_4= '-next->' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePage385); 

                        	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getNextKeyword_4_0());
                        
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:243:1: ( (otherlv_5= RULE_ID ) )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:244:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:244:1: (otherlv_5= RULE_ID )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:245:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPageRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage405); 

                    		newLeafNode(otherlv_5, grammarAccess.getPageAccess().getNextPageCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulePage419); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:268:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:269:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:270:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion455);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion465); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:277:1: ruleQuestion returns [EObject current=null] : (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection | this_Chart_2= ruleChart | this_Rating_3= ruleRating ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_Freetext_0 = null;

        EObject this_Selection_1 = null;

        EObject this_Chart_2 = null;

        EObject this_Rating_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:280:28: ( (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection | this_Chart_2= ruleChart | this_Rating_3= ruleRating ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:281:1: (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection | this_Chart_2= ruleChart | this_Rating_3= ruleRating )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:281:1: (this_Freetext_0= ruleFreetext | this_Selection_1= ruleSelection | this_Chart_2= ruleChart | this_Rating_3= ruleRating )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:282:5: this_Freetext_0= ruleFreetext
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getFreetextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFreetext_in_ruleQuestion512);
                    this_Freetext_0=ruleFreetext();

                    state._fsp--;

                     
                            current = this_Freetext_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:292:5: this_Selection_1= ruleSelection
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSelectionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSelection_in_ruleQuestion539);
                    this_Selection_1=ruleSelection();

                    state._fsp--;

                     
                            current = this_Selection_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:302:5: this_Chart_2= ruleChart
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getChartParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleChart_in_ruleQuestion566);
                    this_Chart_2=ruleChart();

                    state._fsp--;

                     
                            current = this_Chart_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:312:5: this_Rating_3= ruleRating
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRatingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRating_in_ruleQuestion593);
                    this_Rating_3=ruleRating();

                    state._fsp--;

                     
                            current = this_Rating_3; 
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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:328:1: entryRuleFreetext returns [EObject current=null] : iv_ruleFreetext= ruleFreetext EOF ;
    public final EObject entryRuleFreetext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetext = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:329:2: (iv_ruleFreetext= ruleFreetext EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:330:2: iv_ruleFreetext= ruleFreetext EOF
            {
             newCompositeNode(grammarAccess.getFreetextRule()); 
            pushFollow(FOLLOW_ruleFreetext_in_entryRuleFreetext628);
            iv_ruleFreetext=ruleFreetext();

            state._fsp--;

             current =iv_ruleFreetext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreetext638); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:337:1: ruleFreetext returns [EObject current=null] : (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFreetext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_question_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:340:28: ( (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:341:1: (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:341:1: (otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:341:3: otherlv_0= 'freetext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleFreetext675); 

                	newLeafNode(otherlv_0, grammarAccess.getFreetextAccess().getFreetextKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:345:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:346:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:346:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:347:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFreetext692); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:363:2: ( (lv_question_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:364:1: (lv_question_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:364:1: (lv_question_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:365:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFreetext714); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:389:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:390:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:391:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_ruleSelection_in_entryRuleSelection755);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelection765); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:398:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' ) ;
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
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:401:28: ( (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:402:1: (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:402:1: (otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:402:3: otherlv_0= 'select' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSelection802); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:406:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:407:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:407:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:408:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelection819); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:424:2: ( (lv_question_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:425:1: (lv_question_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:425:1: (lv_question_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:426:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSelection841); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSelection858); 

                	newLeafNode(otherlv_3, grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:446:1: ( (lv_choices_4_0= ruleChoice ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:447:1: (lv_choices_4_0= ruleChoice )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:447:1: (lv_choices_4_0= ruleChoice )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:448:3: lv_choices_4_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectionAccess().getChoicesChoiceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleSelection879);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleSelection892); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:476:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:477:2: (iv_ruleChoice= ruleChoice EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:478:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice928);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice938); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:485:1: ruleChoice returns [EObject current=null] : ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_freetext_0_0=null;
        Token lv_name_1_0=null;
        Token lv_bulletPoint_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:488:28: ( ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:489:1: ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:489:1: ( ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:489:2: ( (lv_freetext_0_0= 'freetext' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_bulletPoint_2_0= RULE_STRING ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:489:2: ( (lv_freetext_0_0= 'freetext' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:490:1: (lv_freetext_0_0= 'freetext' )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:490:1: (lv_freetext_0_0= 'freetext' )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:491:3: lv_freetext_0_0= 'freetext'
                    {
                    lv_freetext_0_0=(Token)match(input,16,FOLLOW_16_in_ruleChoice981); 

                            newLeafNode(lv_freetext_0_0, grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "freetext", true, "freetext");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:504:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:505:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:505:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:506:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoice1012); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:522:2: ( (lv_bulletPoint_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:523:1: (lv_bulletPoint_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:523:1: (lv_bulletPoint_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:524:3: lv_bulletPoint_2_0= RULE_STRING
            {
            lv_bulletPoint_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoice1034); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:548:1: entryRuleChart returns [EObject current=null] : iv_ruleChart= ruleChart EOF ;
    public final EObject entryRuleChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChart = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:549:2: (iv_ruleChart= ruleChart EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:550:2: iv_ruleChart= ruleChart EOF
            {
             newCompositeNode(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_ruleChart_in_entryRuleChart1075);
            iv_ruleChart=ruleChart();

            state._fsp--;

             current =iv_ruleChart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChart1085); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:557:1: ruleChart returns [EObject current=null] : (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' otherlv_6= 'x' otherlv_7= '(' ( (lv_graduations_8_0= ruleGraduation ) )* otherlv_9= ')' ) ;
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
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:560:28: ( (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' otherlv_6= 'x' otherlv_7= '(' ( (lv_graduations_8_0= ruleGraduation ) )* otherlv_9= ')' ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:561:1: (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' otherlv_6= 'x' otherlv_7= '(' ( (lv_graduations_8_0= ruleGraduation ) )* otherlv_9= ')' )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:561:1: (otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' otherlv_6= 'x' otherlv_7= '(' ( (lv_graduations_8_0= ruleGraduation ) )* otherlv_9= ')' )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:561:3: otherlv_0= 'chart' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_choices_4_0= ruleChoice ) )* otherlv_5= ')' otherlv_6= 'x' otherlv_7= '(' ( (lv_graduations_8_0= ruleGraduation ) )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleChart1122); 

                	newLeafNode(otherlv_0, grammarAccess.getChartAccess().getChartKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:565:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:566:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:566:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:567:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChart1139); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:583:2: ( (lv_question_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:584:1: (lv_question_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:584:1: (lv_question_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:585:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChart1161); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleChart1178); 

                	newLeafNode(otherlv_3, grammarAccess.getChartAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:605:1: ( (lv_choices_4_0= ruleChoice ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:606:1: (lv_choices_4_0= ruleChoice )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:606:1: (lv_choices_4_0= ruleChoice )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:607:3: lv_choices_4_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChartAccess().getChoicesChoiceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleChart1199);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleChart1212); 

                	newLeafNode(otherlv_5, grammarAccess.getChartAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleChart1224); 

                	newLeafNode(otherlv_6, grammarAccess.getChartAccess().getXKeyword_6());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleChart1236); 

                	newLeafNode(otherlv_7, grammarAccess.getChartAccess().getLeftParenthesisKeyword_7());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:635:1: ( (lv_graduations_8_0= ruleGraduation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:636:1: (lv_graduations_8_0= ruleGraduation )
            	    {
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:636:1: (lv_graduations_8_0= ruleGraduation )
            	    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:637:3: lv_graduations_8_0= ruleGraduation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChartAccess().getGraduationsGraduationParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGraduation_in_ruleChart1257);
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

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleChart1270); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:665:1: entryRuleGraduation returns [EObject current=null] : iv_ruleGraduation= ruleGraduation EOF ;
    public final EObject entryRuleGraduation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraduation = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:666:2: (iv_ruleGraduation= ruleGraduation EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:667:2: iv_ruleGraduation= ruleGraduation EOF
            {
             newCompositeNode(grammarAccess.getGraduationRule()); 
            pushFollow(FOLLOW_ruleGraduation_in_entryRuleGraduation1306);
            iv_ruleGraduation=ruleGraduation();

            state._fsp--;

             current =iv_ruleGraduation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraduation1316); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:674:1: ruleGraduation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_statement_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGraduation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_statement_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:677:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_statement_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:678:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_statement_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:678:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_statement_1_0= RULE_STRING ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:678:2: ( (lv_name_0_0= RULE_ID ) )? ( (lv_statement_1_0= RULE_STRING ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:678:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:679:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:679:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:680:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGraduation1358); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:696:3: ( (lv_statement_1_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:697:1: (lv_statement_1_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:697:1: (lv_statement_1_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:698:3: lv_statement_1_0= RULE_STRING
            {
            lv_statement_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGraduation1381); 

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


    // $ANTLR start "entryRuleRating"
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:722:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:723:2: (iv_ruleRating= ruleRating EOF )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:724:2: iv_ruleRating= ruleRating EOF
            {
             newCompositeNode(grammarAccess.getRatingRule()); 
            pushFollow(FOLLOW_ruleRating_in_entryRuleRating1422);
            iv_ruleRating=ruleRating();

            state._fsp--;

             current =iv_ruleRating; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRating1432); 

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
    // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:731:1: ruleRating returns [EObject current=null] : (otherlv_0= 'rating' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) ( (lv_ratingQuantity_3_0= RULE_INT ) ) ) ;
    public final EObject ruleRating() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_question_2_0=null;
        Token lv_ratingQuantity_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:734:28: ( (otherlv_0= 'rating' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) ( (lv_ratingQuantity_3_0= RULE_INT ) ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:735:1: (otherlv_0= 'rating' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) ( (lv_ratingQuantity_3_0= RULE_INT ) ) )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:735:1: (otherlv_0= 'rating' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) ( (lv_ratingQuantity_3_0= RULE_INT ) ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:735:3: otherlv_0= 'rating' ( (lv_name_1_0= RULE_ID ) ) ( (lv_question_2_0= RULE_STRING ) ) ( (lv_ratingQuantity_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRating1469); 

                	newLeafNode(otherlv_0, grammarAccess.getRatingAccess().getRatingKeyword_0());
                
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:739:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:740:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:740:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:741:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRating1486); 

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

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:757:2: ( (lv_question_2_0= RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:758:1: (lv_question_2_0= RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:758:1: (lv_question_2_0= RULE_STRING )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:759:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRating1508); 

            			newLeafNode(lv_question_2_0, grammarAccess.getRatingAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:775:2: ( (lv_ratingQuantity_3_0= RULE_INT ) )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:776:1: (lv_ratingQuantity_3_0= RULE_INT )
            {
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:776:1: (lv_ratingQuantity_3_0= RULE_INT )
            // ../org.xtext.nordakademie.evaluation/src-gen/org/xtext/nordakademie/evaluation/parser/antlr/internal/InternalEvaluation.g:777:3: lv_ratingQuantity_3_0= RULE_INT
            {
            lv_ratingQuantity_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRating1530); 

            			newLeafNode(lv_ratingQuantity_3_0, grammarAccess.getRatingAccess().getRatingQuantityINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ratingQuantity",
                    		lv_ratingQuantity_3_0, 
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
    public static final BitSet FOLLOW_13_in_rulePage351 = new BitSet(new long[]{0x0000000000170000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePage372 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_rulePage385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage405 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_ruleQuestion512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_ruleQuestion539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_ruleQuestion566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRating_in_ruleQuestion593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_entryRuleFreetext628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreetext638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFreetext675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFreetext692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFreetext714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelection765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSelection802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelection819 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSelection841 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSelection858 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleSelection879 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_15_in_ruleSelection892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleChoice981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoice1012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoice1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_entryRuleChart1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChart1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleChart1122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChart1139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChart1161 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChart1178 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleChart1199 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_15_in_ruleChart1212 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleChart1224 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChart1236 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_ruleGraduation_in_ruleChart1257 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_15_in_ruleChart1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraduation_in_entryRuleGraduation1306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraduation1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGraduation1358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGraduation1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRating_in_entryRuleRating1422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRating1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRating1469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRating1486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRating1508 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRating1530 = new BitSet(new long[]{0x0000000000000002L});

}