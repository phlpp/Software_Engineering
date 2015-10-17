package org.xtext.nordakademie.evaluation.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.nordakademie.evaluation.services.EvaluationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvaluationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'text'", "'select'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
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
    public String getGrammarFileName() { return "../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g"; }


     
     	private EvaluationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EvaluationGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSurvey"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:60:1: entryRuleSurvey : ruleSurvey EOF ;
    public final void entryRuleSurvey() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:61:1: ( ruleSurvey EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:62:1: ruleSurvey EOF
            {
             before(grammarAccess.getSurveyRule()); 
            pushFollow(FOLLOW_ruleSurvey_in_entryRuleSurvey61);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getSurveyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurvey68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:69:1: ruleSurvey : ( ( rule__Survey__Group__0 ) ) ;
    public final void ruleSurvey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:73:2: ( ( ( rule__Survey__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:74:1: ( ( rule__Survey__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:74:1: ( ( rule__Survey__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:75:1: ( rule__Survey__Group__0 )
            {
             before(grammarAccess.getSurveyAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:76:1: ( rule__Survey__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:76:2: rule__Survey__Group__0
            {
            pushFollow(FOLLOW_rule__Survey__Group__0_in_ruleSurvey94);
            rule__Survey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:88:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:89:1: ( ruleQuestion EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:90:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion121);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:97:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:101:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:102:1: ( ( rule__Question__Alternatives ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:102:1: ( ( rule__Question__Alternatives ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:103:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:104:1: ( rule__Question__Alternatives )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:104:2: rule__Question__Alternatives
            {
            pushFollow(FOLLOW_rule__Question__Alternatives_in_ruleQuestion154);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleFreetextQuestion"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:116:1: entryRuleFreetextQuestion : ruleFreetextQuestion EOF ;
    public final void entryRuleFreetextQuestion() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:117:1: ( ruleFreetextQuestion EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:118:1: ruleFreetextQuestion EOF
            {
             before(grammarAccess.getFreetextQuestionRule()); 
            pushFollow(FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion181);
            ruleFreetextQuestion();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreetextQuestion188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFreetextQuestion"


    // $ANTLR start "ruleFreetextQuestion"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:125:1: ruleFreetextQuestion : ( ( rule__FreetextQuestion__Group__0 ) ) ;
    public final void ruleFreetextQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:129:2: ( ( ( rule__FreetextQuestion__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:130:1: ( ( rule__FreetextQuestion__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:130:1: ( ( rule__FreetextQuestion__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:131:1: ( rule__FreetextQuestion__Group__0 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:132:1: ( rule__FreetextQuestion__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:132:2: rule__FreetextQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__FreetextQuestion__Group__0_in_ruleFreetextQuestion214);
            rule__FreetextQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFreetextQuestion"


    // $ANTLR start "entryRuleSelection"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:144:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:145:1: ( ruleSelection EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:146:1: ruleSelection EOF
            {
             before(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_ruleSelection_in_entryRuleSelection241);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelection248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:153:1: ruleSelection : ( ( rule__Selection__Group__0 ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:157:2: ( ( ( rule__Selection__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:158:1: ( ( rule__Selection__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:158:1: ( ( rule__Selection__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:159:1: ( rule__Selection__Group__0 )
            {
             before(grammarAccess.getSelectionAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:160:1: ( rule__Selection__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:160:2: rule__Selection__Group__0
            {
            pushFollow(FOLLOW_rule__Selection__Group__0_in_ruleSelection274);
            rule__Selection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleChoice"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:172:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:173:1: ( ruleChoice EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:174:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice301);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:181:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:185:2: ( ( ( rule__Choice__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:186:1: ( ( rule__Choice__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:186:1: ( ( rule__Choice__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:187:1: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:188:1: ( rule__Choice__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:188:2: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_rule__Choice__Group__0_in_ruleChoice334);
            rule__Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "rule__Question__Alternatives"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:200:1: rule__Question__Alternatives : ( ( ruleFreetextQuestion ) | ( ruleSelection ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:204:1: ( ( ruleFreetextQuestion ) | ( ruleSelection ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:205:1: ( ruleFreetextQuestion )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:205:1: ( ruleFreetextQuestion )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:206:1: ruleFreetextQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getFreetextQuestionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFreetextQuestion_in_rule__Question__Alternatives370);
                    ruleFreetextQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFreetextQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:211:6: ( ruleSelection )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:211:6: ( ruleSelection )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:212:1: ruleSelection
                    {
                     before(grammarAccess.getQuestionAccess().getSelectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSelection_in_rule__Question__Alternatives387);
                    ruleSelection();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getSelectionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__Survey__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:224:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:228:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:229:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0417);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0420);
            rule__Survey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__0"


    // $ANTLR start "rule__Survey__Group__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:236:1: rule__Survey__Group__0__Impl : ( 'survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:240:1: ( ( 'survey' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:241:1: ( 'survey' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:241:1: ( 'survey' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:242:1: 'survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Survey__Group__0__Impl448); 
             after(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__0__Impl"


    // $ANTLR start "rule__Survey__Group__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:255:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:259:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:260:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1479);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1482);
            rule__Survey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__1"


    // $ANTLR start "rule__Survey__Group__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:267:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__NameAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:271:1: ( ( ( rule__Survey__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:272:1: ( ( rule__Survey__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:272:1: ( ( rule__Survey__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:273:1: ( rule__Survey__NameAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:274:1: ( rule__Survey__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:274:2: rule__Survey__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl509);
            rule__Survey__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__1__Impl"


    // $ANTLR start "rule__Survey__Group__2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:284:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:288:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:289:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2539);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2542);
            rule__Survey__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__2"


    // $ANTLR start "rule__Survey__Group__2__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:296:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__TitleAssignment_2 ) ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:300:1: ( ( ( rule__Survey__TitleAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:301:1: ( ( rule__Survey__TitleAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:301:1: ( ( rule__Survey__TitleAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:302:1: ( rule__Survey__TitleAssignment_2 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:303:1: ( rule__Survey__TitleAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:303:2: rule__Survey__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl569);
            rule__Survey__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__2__Impl"


    // $ANTLR start "rule__Survey__Group__3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:313:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:317:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:318:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3599);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3602);
            rule__Survey__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__3"


    // $ANTLR start "rule__Survey__Group__3__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:325:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__GreetingAssignment_3 )? ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:329:1: ( ( ( rule__Survey__GreetingAssignment_3 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:330:1: ( ( rule__Survey__GreetingAssignment_3 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:330:1: ( ( rule__Survey__GreetingAssignment_3 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:331:1: ( rule__Survey__GreetingAssignment_3 )?
            {
             before(grammarAccess.getSurveyAccess().getGreetingAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:332:1: ( rule__Survey__GreetingAssignment_3 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:332:2: rule__Survey__GreetingAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Survey__GreetingAssignment_3_in_rule__Survey__Group__3__Impl629);
                    rule__Survey__GreetingAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSurveyAccess().getGreetingAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__3__Impl"


    // $ANTLR start "rule__Survey__Group__4"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:342:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl rule__Survey__Group__5 ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:346:1: ( rule__Survey__Group__4__Impl rule__Survey__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:347:2: rule__Survey__Group__4__Impl rule__Survey__Group__5
            {
            pushFollow(FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4660);
            rule__Survey__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4663);
            rule__Survey__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__4"


    // $ANTLR start "rule__Survey__Group__4__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:354:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__DurationAssignment_4 )? ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:358:1: ( ( ( rule__Survey__DurationAssignment_4 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:359:1: ( ( rule__Survey__DurationAssignment_4 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:359:1: ( ( rule__Survey__DurationAssignment_4 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:360:1: ( rule__Survey__DurationAssignment_4 )?
            {
             before(grammarAccess.getSurveyAccess().getDurationAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:361:1: ( rule__Survey__DurationAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:361:2: rule__Survey__DurationAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Survey__DurationAssignment_4_in_rule__Survey__Group__4__Impl690);
                    rule__Survey__DurationAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSurveyAccess().getDurationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__4__Impl"


    // $ANTLR start "rule__Survey__Group__5"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:371:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:375:1: ( rule__Survey__Group__5__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:376:2: rule__Survey__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5721);
            rule__Survey__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__5"


    // $ANTLR start "rule__Survey__Group__5__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:382:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__QuestionsAssignment_5 )* ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:386:1: ( ( ( rule__Survey__QuestionsAssignment_5 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:387:1: ( ( rule__Survey__QuestionsAssignment_5 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:387:1: ( ( rule__Survey__QuestionsAssignment_5 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:388:1: ( rule__Survey__QuestionsAssignment_5 )*
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_5()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:389:1: ( rule__Survey__QuestionsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=13)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:389:2: rule__Survey__QuestionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Survey__QuestionsAssignment_5_in_rule__Survey__Group__5__Impl748);
            	    rule__Survey__QuestionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getQuestionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__5__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:411:1: rule__FreetextQuestion__Group__0 : rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1 ;
    public final void rule__FreetextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:415:1: ( rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:416:2: rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__FreetextQuestion__Group__0__Impl_in_rule__FreetextQuestion__Group__0791);
            rule__FreetextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FreetextQuestion__Group__1_in_rule__FreetextQuestion__Group__0794);
            rule__FreetextQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__0"


    // $ANTLR start "rule__FreetextQuestion__Group__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:423:1: rule__FreetextQuestion__Group__0__Impl : ( 'text' ) ;
    public final void rule__FreetextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:427:1: ( ( 'text' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:428:1: ( 'text' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:428:1: ( 'text' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:429:1: 'text'
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__FreetextQuestion__Group__0__Impl822); 
             after(grammarAccess.getFreetextQuestionAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__0__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:442:1: rule__FreetextQuestion__Group__1 : rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2 ;
    public final void rule__FreetextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:446:1: ( rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:447:2: rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__FreetextQuestion__Group__1__Impl_in_rule__FreetextQuestion__Group__1853);
            rule__FreetextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FreetextQuestion__Group__2_in_rule__FreetextQuestion__Group__1856);
            rule__FreetextQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__1"


    // $ANTLR start "rule__FreetextQuestion__Group__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:454:1: rule__FreetextQuestion__Group__1__Impl : ( ( rule__FreetextQuestion__NameAssignment_1 ) ) ;
    public final void rule__FreetextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:458:1: ( ( ( rule__FreetextQuestion__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:459:1: ( ( rule__FreetextQuestion__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:459:1: ( ( rule__FreetextQuestion__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:460:1: ( rule__FreetextQuestion__NameAssignment_1 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:461:1: ( rule__FreetextQuestion__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:461:2: rule__FreetextQuestion__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FreetextQuestion__NameAssignment_1_in_rule__FreetextQuestion__Group__1__Impl883);
            rule__FreetextQuestion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__1__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group__2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:471:1: rule__FreetextQuestion__Group__2 : rule__FreetextQuestion__Group__2__Impl ;
    public final void rule__FreetextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:475:1: ( rule__FreetextQuestion__Group__2__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:476:2: rule__FreetextQuestion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FreetextQuestion__Group__2__Impl_in_rule__FreetextQuestion__Group__2913);
            rule__FreetextQuestion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__2"


    // $ANTLR start "rule__FreetextQuestion__Group__2__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:482:1: rule__FreetextQuestion__Group__2__Impl : ( ( rule__FreetextQuestion__TextAssignment_2 ) ) ;
    public final void rule__FreetextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:486:1: ( ( ( rule__FreetextQuestion__TextAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:487:1: ( ( rule__FreetextQuestion__TextAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:487:1: ( ( rule__FreetextQuestion__TextAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:488:1: ( rule__FreetextQuestion__TextAssignment_2 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:489:1: ( rule__FreetextQuestion__TextAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:489:2: rule__FreetextQuestion__TextAssignment_2
            {
            pushFollow(FOLLOW_rule__FreetextQuestion__TextAssignment_2_in_rule__FreetextQuestion__Group__2__Impl940);
            rule__FreetextQuestion__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__2__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:505:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:509:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:510:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__0976);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__0979);
            rule__Selection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0"


    // $ANTLR start "rule__Selection__Group__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:517:1: rule__Selection__Group__0__Impl : ( 'select' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:521:1: ( ( 'select' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:522:1: ( 'select' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:522:1: ( 'select' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:523:1: 'select'
            {
             before(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Selection__Group__0__Impl1007); 
             after(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0__Impl"


    // $ANTLR start "rule__Selection__Group__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:536:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:540:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:541:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__11038);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__11041);
            rule__Selection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1"


    // $ANTLR start "rule__Selection__Group__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:548:1: rule__Selection__Group__1__Impl : ( ( rule__Selection__NameAssignment_1 ) ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:552:1: ( ( ( rule__Selection__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:553:1: ( ( rule__Selection__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:553:1: ( ( rule__Selection__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:554:1: ( rule__Selection__NameAssignment_1 )
            {
             before(grammarAccess.getSelectionAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:555:1: ( rule__Selection__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:555:2: rule__Selection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl1068);
            rule__Selection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1__Impl"


    // $ANTLR start "rule__Selection__Group__2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:565:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:569:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:570:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__21098);
            rule__Selection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__21101);
            rule__Selection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__2"


    // $ANTLR start "rule__Selection__Group__2__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:577:1: rule__Selection__Group__2__Impl : ( ( rule__Selection__TextAssignment_2 ) ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:581:1: ( ( ( rule__Selection__TextAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:582:1: ( ( rule__Selection__TextAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:582:1: ( ( rule__Selection__TextAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:583:1: ( rule__Selection__TextAssignment_2 )
            {
             before(grammarAccess.getSelectionAccess().getTextAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:584:1: ( rule__Selection__TextAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:584:2: rule__Selection__TextAssignment_2
            {
            pushFollow(FOLLOW_rule__Selection__TextAssignment_2_in_rule__Selection__Group__2__Impl1128);
            rule__Selection__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__2__Impl"


    // $ANTLR start "rule__Selection__Group__3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:594:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:598:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:599:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__31158);
            rule__Selection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__31161);
            rule__Selection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__3"


    // $ANTLR start "rule__Selection__Group__3__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:606:1: rule__Selection__Group__3__Impl : ( '(' ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:610:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:611:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:611:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:612:1: '('
            {
             before(grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Selection__Group__3__Impl1189); 
             after(grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__3__Impl"


    // $ANTLR start "rule__Selection__Group__4"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:625:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:629:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:630:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
            {
            pushFollow(FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__41220);
            rule__Selection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__41223);
            rule__Selection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__4"


    // $ANTLR start "rule__Selection__Group__4__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:637:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__ChoicesAssignment_4 )* ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:641:1: ( ( ( rule__Selection__ChoicesAssignment_4 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:642:1: ( ( rule__Selection__ChoicesAssignment_4 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:642:1: ( ( rule__Selection__ChoicesAssignment_4 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:643:1: ( rule__Selection__ChoicesAssignment_4 )*
            {
             before(grammarAccess.getSelectionAccess().getChoicesAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:644:1: ( rule__Selection__ChoicesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:644:2: rule__Selection__ChoicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Selection__ChoicesAssignment_4_in_rule__Selection__Group__4__Impl1250);
            	    rule__Selection__ChoicesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getChoicesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__4__Impl"


    // $ANTLR start "rule__Selection__Group__5"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:654:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:658:1: ( rule__Selection__Group__5__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:659:2: rule__Selection__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__51281);
            rule__Selection__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__5"


    // $ANTLR start "rule__Selection__Group__5__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:665:1: rule__Selection__Group__5__Impl : ( ')' ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:669:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:670:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:670:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:671:1: ')'
            {
             before(grammarAccess.getSelectionAccess().getRightParenthesisKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Selection__Group__5__Impl1309); 
             after(grammarAccess.getSelectionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__5__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:696:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:700:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:701:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__01352);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__01355);
            rule__Choice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:708:1: rule__Choice__Group__0__Impl : ( ( rule__Choice__NameAssignment_0 ) ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:712:1: ( ( ( rule__Choice__NameAssignment_0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:713:1: ( ( rule__Choice__NameAssignment_0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:713:1: ( ( rule__Choice__NameAssignment_0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:714:1: ( rule__Choice__NameAssignment_0 )
            {
             before(grammarAccess.getChoiceAccess().getNameAssignment_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:715:1: ( rule__Choice__NameAssignment_0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:715:2: rule__Choice__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Choice__NameAssignment_0_in_rule__Choice__Group__0__Impl1382);
            rule__Choice__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:725:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:729:1: ( rule__Choice__Group__1__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:730:2: rule__Choice__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__11412);
            rule__Choice__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:736:1: rule__Choice__Group__1__Impl : ( ( rule__Choice__TextAssignment_1 ) ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:740:1: ( ( ( rule__Choice__TextAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:741:1: ( ( rule__Choice__TextAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:741:1: ( ( rule__Choice__TextAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:742:1: ( rule__Choice__TextAssignment_1 )
            {
             before(grammarAccess.getChoiceAccess().getTextAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:743:1: ( rule__Choice__TextAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:743:2: rule__Choice__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Choice__TextAssignment_1_in_rule__Choice__Group__1__Impl1439);
            rule__Choice__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Survey__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:758:1: rule__Survey__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Survey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:762:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:763:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:763:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:764:1: RULE_ID
            {
             before(grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_11478); 
             after(grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__NameAssignment_1"


    // $ANTLR start "rule__Survey__TitleAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:773:1: rule__Survey__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Survey__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:777:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:778:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:778:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:779:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_21509); 
             after(grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__TitleAssignment_2"


    // $ANTLR start "rule__Survey__GreetingAssignment_3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:788:1: rule__Survey__GreetingAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Survey__GreetingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:792:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:793:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:793:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:794:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getGreetingSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__GreetingAssignment_31540); 
             after(grammarAccess.getSurveyAccess().getGreetingSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__GreetingAssignment_3"


    // $ANTLR start "rule__Survey__DurationAssignment_4"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:803:1: rule__Survey__DurationAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Survey__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:807:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:808:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:808:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:809:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getDurationSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__DurationAssignment_41571); 
             after(grammarAccess.getSurveyAccess().getDurationSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__DurationAssignment_4"


    // $ANTLR start "rule__Survey__QuestionsAssignment_5"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:818:1: rule__Survey__QuestionsAssignment_5 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:822:1: ( ( ruleQuestion ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:823:1: ( ruleQuestion )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:823:1: ( ruleQuestion )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:824:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_51602);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__QuestionsAssignment_5"


    // $ANTLR start "rule__FreetextQuestion__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:833:1: rule__FreetextQuestion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FreetextQuestion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:837:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:838:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:838:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:839:1: RULE_ID
            {
             before(grammarAccess.getFreetextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FreetextQuestion__NameAssignment_11633); 
             after(grammarAccess.getFreetextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__NameAssignment_1"


    // $ANTLR start "rule__FreetextQuestion__TextAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:848:1: rule__FreetextQuestion__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FreetextQuestion__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:852:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:853:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:853:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:854:1: RULE_STRING
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FreetextQuestion__TextAssignment_21664); 
             after(grammarAccess.getFreetextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__TextAssignment_2"


    // $ANTLR start "rule__Selection__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:863:1: rule__Selection__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:867:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:868:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:868:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:869:1: RULE_ID
            {
             before(grammarAccess.getSelectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_11695); 
             after(grammarAccess.getSelectionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__NameAssignment_1"


    // $ANTLR start "rule__Selection__TextAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:878:1: rule__Selection__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Selection__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:882:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:883:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:883:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:884:1: RULE_STRING
            {
             before(grammarAccess.getSelectionAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Selection__TextAssignment_21726); 
             after(grammarAccess.getSelectionAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__TextAssignment_2"


    // $ANTLR start "rule__Selection__ChoicesAssignment_4"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:893:1: rule__Selection__ChoicesAssignment_4 : ( ruleChoice ) ;
    public final void rule__Selection__ChoicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:897:1: ( ( ruleChoice ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:898:1: ( ruleChoice )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:898:1: ( ruleChoice )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:899:1: ruleChoice
            {
             before(grammarAccess.getSelectionAccess().getChoicesChoiceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleChoice_in_rule__Selection__ChoicesAssignment_41757);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getChoicesChoiceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__ChoicesAssignment_4"


    // $ANTLR start "rule__Choice__NameAssignment_0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:908:1: rule__Choice__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Choice__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:912:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:913:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:913:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:914:1: RULE_ID
            {
             before(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_01788); 
             after(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__NameAssignment_0"


    // $ANTLR start "rule__Choice__TextAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:923:1: rule__Choice__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Choice__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:927:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:928:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:928:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:929:1: RULE_STRING
            {
             before(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Choice__TextAssignment_11819); 
             after(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__TextAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0_in_ruleSurvey94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreetextQuestion188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreetextQuestion__Group__0_in_ruleFreetextQuestion214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelection248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0_in_ruleSelection274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0_in_ruleChoice334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetextQuestion_in_rule__Question__Alternatives370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_rule__Question__Alternatives387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1479 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2539 = new BitSet(new long[]{0x0000000000003020L});
    public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3599 = new BitSet(new long[]{0x0000000000003020L});
    public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__GreetingAssignment_3_in_rule__Survey__Group__3__Impl629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4660 = new BitSet(new long[]{0x0000000000003020L});
    public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__DurationAssignment_4_in_rule__Survey__Group__4__Impl690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_5_in_rule__Survey__Group__5__Impl748 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__FreetextQuestion__Group__0__Impl_in_rule__FreetextQuestion__Group__0791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FreetextQuestion__Group__1_in_rule__FreetextQuestion__Group__0794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FreetextQuestion__Group__0__Impl822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreetextQuestion__Group__1__Impl_in_rule__FreetextQuestion__Group__1853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FreetextQuestion__Group__2_in_rule__FreetextQuestion__Group__1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreetextQuestion__NameAssignment_1_in_rule__FreetextQuestion__Group__1__Impl883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreetextQuestion__Group__2__Impl_in_rule__FreetextQuestion__Group__2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreetextQuestion__TextAssignment_2_in_rule__FreetextQuestion__Group__2__Impl940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__0976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__0979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Selection__Group__0__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__11038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__11041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__21098 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__21101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__TextAssignment_2_in_rule__Selection__Group__2__Impl1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__31158 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__31161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Selection__Group__3__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__41220 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__41223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__ChoicesAssignment_4_in_rule__Selection__Group__4__Impl1250 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__51281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Selection__Group__5__Impl1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__01352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__01355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__NameAssignment_0_in_rule__Choice__Group__0__Impl1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__TextAssignment_1_in_rule__Choice__Group__1__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_11478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_21509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__GreetingAssignment_31540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__DurationAssignment_41571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_51602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FreetextQuestion__NameAssignment_11633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FreetextQuestion__TextAssignment_21664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Selection__TextAssignment_21726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__Selection__ChoicesAssignment_41757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_01788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Choice__TextAssignment_11819 = new BitSet(new long[]{0x0000000000000002L});

}