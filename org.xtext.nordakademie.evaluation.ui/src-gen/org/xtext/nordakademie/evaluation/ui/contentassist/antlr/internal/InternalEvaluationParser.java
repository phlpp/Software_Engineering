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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'page'", "'('", "')'", "'freetext'", "'select'", "'chart'", "'x'", "'rating'", "'forwarding to ->'"
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


    // $ANTLR start "entryRulePage"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:88:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:89:1: ( rulePage EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:90:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage121);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage128); 

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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:97:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:101:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:102:1: ( ( rule__Page__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:102:1: ( ( rule__Page__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:103:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:104:1: ( rule__Page__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:104:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulePage154);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:116:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:117:1: ( ruleQuestion EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:118:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion181);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion188); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:125:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:129:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:130:1: ( ( rule__Question__Alternatives ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:130:1: ( ( rule__Question__Alternatives ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:131:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:132:1: ( rule__Question__Alternatives )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:132:2: rule__Question__Alternatives
            {
            pushFollow(FOLLOW_rule__Question__Alternatives_in_ruleQuestion214);
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


    // $ANTLR start "entryRuleFreetext"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:144:1: entryRuleFreetext : ruleFreetext EOF ;
    public final void entryRuleFreetext() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:145:1: ( ruleFreetext EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:146:1: ruleFreetext EOF
            {
             before(grammarAccess.getFreetextRule()); 
            pushFollow(FOLLOW_ruleFreetext_in_entryRuleFreetext241);
            ruleFreetext();

            state._fsp--;

             after(grammarAccess.getFreetextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreetext248); 

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
    // $ANTLR end "entryRuleFreetext"


    // $ANTLR start "ruleFreetext"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:153:1: ruleFreetext : ( ( rule__Freetext__Group__0 ) ) ;
    public final void ruleFreetext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:157:2: ( ( ( rule__Freetext__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:158:1: ( ( rule__Freetext__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:158:1: ( ( rule__Freetext__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:159:1: ( rule__Freetext__Group__0 )
            {
             before(grammarAccess.getFreetextAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:160:1: ( rule__Freetext__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:160:2: rule__Freetext__Group__0
            {
            pushFollow(FOLLOW_rule__Freetext__Group__0_in_ruleFreetext274);
            rule__Freetext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFreetextAccess().getGroup()); 

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
    // $ANTLR end "ruleFreetext"


    // $ANTLR start "entryRuleSelection"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:172:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:173:1: ( ruleSelection EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:174:1: ruleSelection EOF
            {
             before(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_ruleSelection_in_entryRuleSelection301);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelection308); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:181:1: ruleSelection : ( ( rule__Selection__Group__0 ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:185:2: ( ( ( rule__Selection__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:186:1: ( ( rule__Selection__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:186:1: ( ( rule__Selection__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:187:1: ( rule__Selection__Group__0 )
            {
             before(grammarAccess.getSelectionAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:188:1: ( rule__Selection__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:188:2: rule__Selection__Group__0
            {
            pushFollow(FOLLOW_rule__Selection__Group__0_in_ruleSelection334);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:200:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:201:1: ( ruleChoice EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:202:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice361);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice368); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:209:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:213:2: ( ( ( rule__Choice__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:214:1: ( ( rule__Choice__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:214:1: ( ( rule__Choice__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:215:1: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:216:1: ( rule__Choice__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:216:2: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_rule__Choice__Group__0_in_ruleChoice394);
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


    // $ANTLR start "entryRuleChart"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:228:1: entryRuleChart : ruleChart EOF ;
    public final void entryRuleChart() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:229:1: ( ruleChart EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:230:1: ruleChart EOF
            {
             before(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_ruleChart_in_entryRuleChart421);
            ruleChart();

            state._fsp--;

             after(grammarAccess.getChartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChart428); 

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
    // $ANTLR end "entryRuleChart"


    // $ANTLR start "ruleChart"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:237:1: ruleChart : ( ( rule__Chart__Group__0 ) ) ;
    public final void ruleChart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:241:2: ( ( ( rule__Chart__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:242:1: ( ( rule__Chart__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:242:1: ( ( rule__Chart__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:243:1: ( rule__Chart__Group__0 )
            {
             before(grammarAccess.getChartAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:244:1: ( rule__Chart__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:244:2: rule__Chart__Group__0
            {
            pushFollow(FOLLOW_rule__Chart__Group__0_in_ruleChart454);
            rule__Chart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getGroup()); 

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
    // $ANTLR end "ruleChart"


    // $ANTLR start "entryRuleGraduation"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:256:1: entryRuleGraduation : ruleGraduation EOF ;
    public final void entryRuleGraduation() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:257:1: ( ruleGraduation EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:258:1: ruleGraduation EOF
            {
             before(grammarAccess.getGraduationRule()); 
            pushFollow(FOLLOW_ruleGraduation_in_entryRuleGraduation481);
            ruleGraduation();

            state._fsp--;

             after(grammarAccess.getGraduationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraduation488); 

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
    // $ANTLR end "entryRuleGraduation"


    // $ANTLR start "ruleGraduation"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:265:1: ruleGraduation : ( ( rule__Graduation__Group__0 ) ) ;
    public final void ruleGraduation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:269:2: ( ( ( rule__Graduation__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:270:1: ( ( rule__Graduation__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:270:1: ( ( rule__Graduation__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:271:1: ( rule__Graduation__Group__0 )
            {
             before(grammarAccess.getGraduationAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:272:1: ( rule__Graduation__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:272:2: rule__Graduation__Group__0
            {
            pushFollow(FOLLOW_rule__Graduation__Group__0_in_ruleGraduation514);
            rule__Graduation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraduationAccess().getGroup()); 

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
    // $ANTLR end "ruleGraduation"


    // $ANTLR start "entryRuleRating"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:284:1: entryRuleRating : ruleRating EOF ;
    public final void entryRuleRating() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:285:1: ( ruleRating EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:286:1: ruleRating EOF
            {
             before(grammarAccess.getRatingRule()); 
            pushFollow(FOLLOW_ruleRating_in_entryRuleRating541);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRatingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRating548); 

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
    // $ANTLR end "entryRuleRating"


    // $ANTLR start "ruleRating"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:293:1: ruleRating : ( ( rule__Rating__Group__0 ) ) ;
    public final void ruleRating() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:297:2: ( ( ( rule__Rating__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:298:1: ( ( rule__Rating__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:298:1: ( ( rule__Rating__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:299:1: ( rule__Rating__Group__0 )
            {
             before(grammarAccess.getRatingAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:300:1: ( rule__Rating__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:300:2: rule__Rating__Group__0
            {
            pushFollow(FOLLOW_rule__Rating__Group__0_in_ruleRating574);
            rule__Rating__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getGroup()); 

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
    // $ANTLR end "ruleRating"


    // $ANTLR start "rule__Question__Alternatives"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:312:1: rule__Question__Alternatives : ( ( ruleFreetext ) | ( ruleSelection ) | ( ruleChart ) | ( ruleRating ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:316:1: ( ( ruleFreetext ) | ( ruleSelection ) | ( ruleChart ) | ( ruleRating ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:317:1: ( ruleFreetext )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:317:1: ( ruleFreetext )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:318:1: ruleFreetext
                    {
                     before(grammarAccess.getQuestionAccess().getFreetextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFreetext_in_rule__Question__Alternatives610);
                    ruleFreetext();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFreetextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:323:6: ( ruleSelection )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:323:6: ( ruleSelection )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:324:1: ruleSelection
                    {
                     before(grammarAccess.getQuestionAccess().getSelectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSelection_in_rule__Question__Alternatives627);
                    ruleSelection();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getSelectionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:329:6: ( ruleChart )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:329:6: ( ruleChart )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:330:1: ruleChart
                    {
                     before(grammarAccess.getQuestionAccess().getChartParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleChart_in_rule__Question__Alternatives644);
                    ruleChart();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getChartParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:335:6: ( ruleRating )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:335:6: ( ruleRating )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:336:1: ruleRating
                    {
                     before(grammarAccess.getQuestionAccess().getRatingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRating_in_rule__Question__Alternatives661);
                    ruleRating();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getRatingParserRuleCall_3()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:348:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:352:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:353:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0691);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0694);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:360:1: rule__Survey__Group__0__Impl : ( 'survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:364:1: ( ( 'survey' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:365:1: ( 'survey' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:365:1: ( 'survey' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:366:1: 'survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Survey__Group__0__Impl722); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:379:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:383:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:384:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1753);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1756);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:391:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__NameAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:395:1: ( ( ( rule__Survey__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:396:1: ( ( rule__Survey__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:396:1: ( ( rule__Survey__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:397:1: ( rule__Survey__NameAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:398:1: ( rule__Survey__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:398:2: rule__Survey__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl783);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:408:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:412:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:413:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2813);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2816);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:420:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__TitleAssignment_2 ) ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:424:1: ( ( ( rule__Survey__TitleAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:425:1: ( ( rule__Survey__TitleAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:425:1: ( ( rule__Survey__TitleAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:426:1: ( rule__Survey__TitleAssignment_2 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:427:1: ( rule__Survey__TitleAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:427:2: rule__Survey__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl843);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:437:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:441:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:442:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3873);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3876);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:449:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__GreetingAssignment_3 )? ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:453:1: ( ( ( rule__Survey__GreetingAssignment_3 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:454:1: ( ( rule__Survey__GreetingAssignment_3 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:454:1: ( ( rule__Survey__GreetingAssignment_3 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:455:1: ( rule__Survey__GreetingAssignment_3 )?
            {
             before(grammarAccess.getSurveyAccess().getGreetingAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:456:1: ( rule__Survey__GreetingAssignment_3 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:456:2: rule__Survey__GreetingAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Survey__GreetingAssignment_3_in_rule__Survey__Group__3__Impl903);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:466:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:470:1: ( rule__Survey__Group__4__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:471:2: rule__Survey__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4934);
            rule__Survey__Group__4__Impl();

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:477:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__PagesAssignment_4 )* ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:481:1: ( ( ( rule__Survey__PagesAssignment_4 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:482:1: ( ( rule__Survey__PagesAssignment_4 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:482:1: ( ( rule__Survey__PagesAssignment_4 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:483:1: ( rule__Survey__PagesAssignment_4 )*
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:484:1: ( rule__Survey__PagesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:484:2: rule__Survey__PagesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Survey__PagesAssignment_4_in_rule__Survey__Group__4__Impl961);
            	    rule__Survey__PagesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getPagesAssignment_4()); 

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


    // $ANTLR start "rule__Page__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:504:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:508:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:509:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__01002);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__01005);
            rule__Page__Group__1();

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
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:516:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:520:1: ( ( 'page' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:521:1: ( 'page' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:521:1: ( 'page' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:522:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Page__Group__0__Impl1033); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

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
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:535:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:539:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:540:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__11064);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__11067);
            rule__Page__Group__2();

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
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:547:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:551:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:552:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:552:1: ( ( rule__Page__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:553:1: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:554:1: ( rule__Page__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:554:2: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl1094);
            rule__Page__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:564:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:568:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:569:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21124);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21127);
            rule__Page__Group__3();

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
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:576:1: rule__Page__Group__2__Impl : ( '(' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:580:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:581:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:581:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:582:1: '('
            {
             before(grammarAccess.getPageAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Page__Group__2__Impl1155); 
             after(grammarAccess.getPageAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:595:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:599:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:600:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31186);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31189);
            rule__Page__Group__4();

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
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:607:1: rule__Page__Group__3__Impl : ( ( rule__Page__QuestionAssignment_3 ) ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:611:1: ( ( ( rule__Page__QuestionAssignment_3 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:612:1: ( ( rule__Page__QuestionAssignment_3 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:612:1: ( ( rule__Page__QuestionAssignment_3 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:613:1: ( rule__Page__QuestionAssignment_3 )
            {
             before(grammarAccess.getPageAccess().getQuestionAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:614:1: ( rule__Page__QuestionAssignment_3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:614:2: rule__Page__QuestionAssignment_3
            {
            pushFollow(FOLLOW_rule__Page__QuestionAssignment_3_in_rule__Page__Group__3__Impl1216);
            rule__Page__QuestionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getQuestionAssignment_3()); 

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
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:624:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:628:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:629:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41246);
            rule__Page__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41249);
            rule__Page__Group__5();

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
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:636:1: rule__Page__Group__4__Impl : ( ( rule__Page__Group_4__0 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:640:1: ( ( ( rule__Page__Group_4__0 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:641:1: ( ( rule__Page__Group_4__0 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:641:1: ( ( rule__Page__Group_4__0 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:642:1: ( rule__Page__Group_4__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:643:1: ( rule__Page__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:643:2: rule__Page__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_4__0_in_rule__Page__Group__4__Impl1276);
                    rule__Page__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:653:1: rule__Page__Group__5 : rule__Page__Group__5__Impl ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:657:1: ( rule__Page__Group__5__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:658:2: rule__Page__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51307);
            rule__Page__Group__5__Impl();

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
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:664:1: rule__Page__Group__5__Impl : ( ')' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:668:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:669:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:669:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:670:1: ')'
            {
             before(grammarAccess.getPageAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Page__Group__5__Impl1335); 
             after(grammarAccess.getPageAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__Page__Group_4__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:695:1: rule__Page__Group_4__0 : rule__Page__Group_4__0__Impl rule__Page__Group_4__1 ;
    public final void rule__Page__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:699:1: ( rule__Page__Group_4__0__Impl rule__Page__Group_4__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:700:2: rule__Page__Group_4__0__Impl rule__Page__Group_4__1
            {
            pushFollow(FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__01378);
            rule__Page__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__01381);
            rule__Page__Group_4__1();

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
    // $ANTLR end "rule__Page__Group_4__0"


    // $ANTLR start "rule__Page__Group_4__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:707:1: rule__Page__Group_4__0__Impl : ( ( rule__Page__ForwardingAssignment_4_0 ) ) ;
    public final void rule__Page__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:711:1: ( ( ( rule__Page__ForwardingAssignment_4_0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:712:1: ( ( rule__Page__ForwardingAssignment_4_0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:712:1: ( ( rule__Page__ForwardingAssignment_4_0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:713:1: ( rule__Page__ForwardingAssignment_4_0 )
            {
             before(grammarAccess.getPageAccess().getForwardingAssignment_4_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:714:1: ( rule__Page__ForwardingAssignment_4_0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:714:2: rule__Page__ForwardingAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Page__ForwardingAssignment_4_0_in_rule__Page__Group_4__0__Impl1408);
            rule__Page__ForwardingAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getForwardingAssignment_4_0()); 

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
    // $ANTLR end "rule__Page__Group_4__0__Impl"


    // $ANTLR start "rule__Page__Group_4__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:724:1: rule__Page__Group_4__1 : rule__Page__Group_4__1__Impl ;
    public final void rule__Page__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:728:1: ( rule__Page__Group_4__1__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:729:2: rule__Page__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__11438);
            rule__Page__Group_4__1__Impl();

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
    // $ANTLR end "rule__Page__Group_4__1"


    // $ANTLR start "rule__Page__Group_4__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:735:1: rule__Page__Group_4__1__Impl : ( ( rule__Page__FollowingPageAssignment_4_1 ) ) ;
    public final void rule__Page__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:739:1: ( ( ( rule__Page__FollowingPageAssignment_4_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:740:1: ( ( rule__Page__FollowingPageAssignment_4_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:740:1: ( ( rule__Page__FollowingPageAssignment_4_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:741:1: ( rule__Page__FollowingPageAssignment_4_1 )
            {
             before(grammarAccess.getPageAccess().getFollowingPageAssignment_4_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:742:1: ( rule__Page__FollowingPageAssignment_4_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:742:2: rule__Page__FollowingPageAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Page__FollowingPageAssignment_4_1_in_rule__Page__Group_4__1__Impl1465);
            rule__Page__FollowingPageAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getFollowingPageAssignment_4_1()); 

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
    // $ANTLR end "rule__Page__Group_4__1__Impl"


    // $ANTLR start "rule__Freetext__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:756:1: rule__Freetext__Group__0 : rule__Freetext__Group__0__Impl rule__Freetext__Group__1 ;
    public final void rule__Freetext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:760:1: ( rule__Freetext__Group__0__Impl rule__Freetext__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:761:2: rule__Freetext__Group__0__Impl rule__Freetext__Group__1
            {
            pushFollow(FOLLOW_rule__Freetext__Group__0__Impl_in_rule__Freetext__Group__01499);
            rule__Freetext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Freetext__Group__1_in_rule__Freetext__Group__01502);
            rule__Freetext__Group__1();

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
    // $ANTLR end "rule__Freetext__Group__0"


    // $ANTLR start "rule__Freetext__Group__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:768:1: rule__Freetext__Group__0__Impl : ( 'freetext' ) ;
    public final void rule__Freetext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:772:1: ( ( 'freetext' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:773:1: ( 'freetext' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:773:1: ( 'freetext' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:774:1: 'freetext'
            {
             before(grammarAccess.getFreetextAccess().getFreetextKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Freetext__Group__0__Impl1530); 
             after(grammarAccess.getFreetextAccess().getFreetextKeyword_0()); 

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
    // $ANTLR end "rule__Freetext__Group__0__Impl"


    // $ANTLR start "rule__Freetext__Group__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:787:1: rule__Freetext__Group__1 : rule__Freetext__Group__1__Impl rule__Freetext__Group__2 ;
    public final void rule__Freetext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:791:1: ( rule__Freetext__Group__1__Impl rule__Freetext__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:792:2: rule__Freetext__Group__1__Impl rule__Freetext__Group__2
            {
            pushFollow(FOLLOW_rule__Freetext__Group__1__Impl_in_rule__Freetext__Group__11561);
            rule__Freetext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Freetext__Group__2_in_rule__Freetext__Group__11564);
            rule__Freetext__Group__2();

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
    // $ANTLR end "rule__Freetext__Group__1"


    // $ANTLR start "rule__Freetext__Group__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:799:1: rule__Freetext__Group__1__Impl : ( ( rule__Freetext__NameAssignment_1 ) ) ;
    public final void rule__Freetext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:803:1: ( ( ( rule__Freetext__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:804:1: ( ( rule__Freetext__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:804:1: ( ( rule__Freetext__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:805:1: ( rule__Freetext__NameAssignment_1 )
            {
             before(grammarAccess.getFreetextAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:806:1: ( rule__Freetext__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:806:2: rule__Freetext__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Freetext__NameAssignment_1_in_rule__Freetext__Group__1__Impl1591);
            rule__Freetext__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFreetextAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Freetext__Group__1__Impl"


    // $ANTLR start "rule__Freetext__Group__2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:816:1: rule__Freetext__Group__2 : rule__Freetext__Group__2__Impl ;
    public final void rule__Freetext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:820:1: ( rule__Freetext__Group__2__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:821:2: rule__Freetext__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Freetext__Group__2__Impl_in_rule__Freetext__Group__21621);
            rule__Freetext__Group__2__Impl();

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
    // $ANTLR end "rule__Freetext__Group__2"


    // $ANTLR start "rule__Freetext__Group__2__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:827:1: rule__Freetext__Group__2__Impl : ( ( rule__Freetext__QuestionAssignment_2 ) ) ;
    public final void rule__Freetext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:831:1: ( ( ( rule__Freetext__QuestionAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:832:1: ( ( rule__Freetext__QuestionAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:832:1: ( ( rule__Freetext__QuestionAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:833:1: ( rule__Freetext__QuestionAssignment_2 )
            {
             before(grammarAccess.getFreetextAccess().getQuestionAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:834:1: ( rule__Freetext__QuestionAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:834:2: rule__Freetext__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Freetext__QuestionAssignment_2_in_rule__Freetext__Group__2__Impl1648);
            rule__Freetext__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFreetextAccess().getQuestionAssignment_2()); 

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
    // $ANTLR end "rule__Freetext__Group__2__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:850:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:854:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:855:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__01684);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__01687);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:862:1: rule__Selection__Group__0__Impl : ( 'select' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:866:1: ( ( 'select' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:867:1: ( 'select' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:867:1: ( 'select' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:868:1: 'select'
            {
             before(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Selection__Group__0__Impl1715); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:881:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:885:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:886:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__11746);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__11749);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:893:1: rule__Selection__Group__1__Impl : ( ( rule__Selection__NameAssignment_1 ) ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:897:1: ( ( ( rule__Selection__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:898:1: ( ( rule__Selection__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:898:1: ( ( rule__Selection__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:899:1: ( rule__Selection__NameAssignment_1 )
            {
             before(grammarAccess.getSelectionAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:900:1: ( rule__Selection__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:900:2: rule__Selection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl1776);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:910:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:914:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:915:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__21806);
            rule__Selection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__21809);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:922:1: rule__Selection__Group__2__Impl : ( ( rule__Selection__QuestionAssignment_2 ) ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:926:1: ( ( ( rule__Selection__QuestionAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:927:1: ( ( rule__Selection__QuestionAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:927:1: ( ( rule__Selection__QuestionAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:928:1: ( rule__Selection__QuestionAssignment_2 )
            {
             before(grammarAccess.getSelectionAccess().getQuestionAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:929:1: ( rule__Selection__QuestionAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:929:2: rule__Selection__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Selection__QuestionAssignment_2_in_rule__Selection__Group__2__Impl1836);
            rule__Selection__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getQuestionAssignment_2()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:939:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:943:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:944:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__31866);
            rule__Selection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__31869);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:951:1: rule__Selection__Group__3__Impl : ( '(' ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:955:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:956:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:956:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:957:1: '('
            {
             before(grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Selection__Group__3__Impl1897); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:970:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:974:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:975:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
            {
            pushFollow(FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__41928);
            rule__Selection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__41931);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:982:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__ChoicesAssignment_4 )* ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:986:1: ( ( ( rule__Selection__ChoicesAssignment_4 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:987:1: ( ( rule__Selection__ChoicesAssignment_4 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:987:1: ( ( rule__Selection__ChoicesAssignment_4 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:988:1: ( rule__Selection__ChoicesAssignment_4 )*
            {
             before(grammarAccess.getSelectionAccess().getChoicesAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:989:1: ( rule__Selection__ChoicesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:989:2: rule__Selection__ChoicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Selection__ChoicesAssignment_4_in_rule__Selection__Group__4__Impl1958);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:999:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1003:1: ( rule__Selection__Group__5__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1004:2: rule__Selection__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__51989);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1010:1: rule__Selection__Group__5__Impl : ( ')' ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1014:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1015:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1015:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1016:1: ')'
            {
             before(grammarAccess.getSelectionAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Selection__Group__5__Impl2017); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1041:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1045:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1046:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__02060);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__02063);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1053:1: rule__Choice__Group__0__Impl : ( ( rule__Choice__FreetextAssignment_0 )? ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1057:1: ( ( ( rule__Choice__FreetextAssignment_0 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1058:1: ( ( rule__Choice__FreetextAssignment_0 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1058:1: ( ( rule__Choice__FreetextAssignment_0 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1059:1: ( rule__Choice__FreetextAssignment_0 )?
            {
             before(grammarAccess.getChoiceAccess().getFreetextAssignment_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1060:1: ( rule__Choice__FreetextAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1060:2: rule__Choice__FreetextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Choice__FreetextAssignment_0_in_rule__Choice__Group__0__Impl2090);
                    rule__Choice__FreetextAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceAccess().getFreetextAssignment_0()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1070:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1074:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1075:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__12121);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__12124);
            rule__Choice__Group__2();

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1082:1: rule__Choice__Group__1__Impl : ( ( rule__Choice__NameAssignment_1 ) ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1086:1: ( ( ( rule__Choice__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1087:1: ( ( rule__Choice__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1087:1: ( ( rule__Choice__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1088:1: ( rule__Choice__NameAssignment_1 )
            {
             before(grammarAccess.getChoiceAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1089:1: ( rule__Choice__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1089:2: rule__Choice__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Choice__NameAssignment_1_in_rule__Choice__Group__1__Impl2151);
            rule__Choice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Choice__Group__2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1099:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1103:1: ( rule__Choice__Group__2__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1104:2: rule__Choice__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__22181);
            rule__Choice__Group__2__Impl();

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
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1110:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__BulletPointAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1114:1: ( ( ( rule__Choice__BulletPointAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1115:1: ( ( rule__Choice__BulletPointAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1115:1: ( ( rule__Choice__BulletPointAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1116:1: ( rule__Choice__BulletPointAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getBulletPointAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1117:1: ( rule__Choice__BulletPointAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1117:2: rule__Choice__BulletPointAssignment_2
            {
            pushFollow(FOLLOW_rule__Choice__BulletPointAssignment_2_in_rule__Choice__Group__2__Impl2208);
            rule__Choice__BulletPointAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getBulletPointAssignment_2()); 

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
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Chart__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1133:1: rule__Chart__Group__0 : rule__Chart__Group__0__Impl rule__Chart__Group__1 ;
    public final void rule__Chart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1137:1: ( rule__Chart__Group__0__Impl rule__Chart__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1138:2: rule__Chart__Group__0__Impl rule__Chart__Group__1
            {
            pushFollow(FOLLOW_rule__Chart__Group__0__Impl_in_rule__Chart__Group__02244);
            rule__Chart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__1_in_rule__Chart__Group__02247);
            rule__Chart__Group__1();

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
    // $ANTLR end "rule__Chart__Group__0"


    // $ANTLR start "rule__Chart__Group__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1145:1: rule__Chart__Group__0__Impl : ( 'chart' ) ;
    public final void rule__Chart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1149:1: ( ( 'chart' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1150:1: ( 'chart' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1150:1: ( 'chart' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1151:1: 'chart'
            {
             before(grammarAccess.getChartAccess().getChartKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Chart__Group__0__Impl2275); 
             after(grammarAccess.getChartAccess().getChartKeyword_0()); 

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
    // $ANTLR end "rule__Chart__Group__0__Impl"


    // $ANTLR start "rule__Chart__Group__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1164:1: rule__Chart__Group__1 : rule__Chart__Group__1__Impl rule__Chart__Group__2 ;
    public final void rule__Chart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1168:1: ( rule__Chart__Group__1__Impl rule__Chart__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1169:2: rule__Chart__Group__1__Impl rule__Chart__Group__2
            {
            pushFollow(FOLLOW_rule__Chart__Group__1__Impl_in_rule__Chart__Group__12306);
            rule__Chart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__2_in_rule__Chart__Group__12309);
            rule__Chart__Group__2();

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
    // $ANTLR end "rule__Chart__Group__1"


    // $ANTLR start "rule__Chart__Group__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1176:1: rule__Chart__Group__1__Impl : ( ( rule__Chart__NameAssignment_1 ) ) ;
    public final void rule__Chart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1180:1: ( ( ( rule__Chart__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1181:1: ( ( rule__Chart__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1181:1: ( ( rule__Chart__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1182:1: ( rule__Chart__NameAssignment_1 )
            {
             before(grammarAccess.getChartAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1183:1: ( rule__Chart__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1183:2: rule__Chart__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Chart__NameAssignment_1_in_rule__Chart__Group__1__Impl2336);
            rule__Chart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Chart__Group__1__Impl"


    // $ANTLR start "rule__Chart__Group__2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1193:1: rule__Chart__Group__2 : rule__Chart__Group__2__Impl rule__Chart__Group__3 ;
    public final void rule__Chart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1197:1: ( rule__Chart__Group__2__Impl rule__Chart__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1198:2: rule__Chart__Group__2__Impl rule__Chart__Group__3
            {
            pushFollow(FOLLOW_rule__Chart__Group__2__Impl_in_rule__Chart__Group__22366);
            rule__Chart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__3_in_rule__Chart__Group__22369);
            rule__Chart__Group__3();

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
    // $ANTLR end "rule__Chart__Group__2"


    // $ANTLR start "rule__Chart__Group__2__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1205:1: rule__Chart__Group__2__Impl : ( ( rule__Chart__QuestionAssignment_2 ) ) ;
    public final void rule__Chart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1209:1: ( ( ( rule__Chart__QuestionAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1210:1: ( ( rule__Chart__QuestionAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1210:1: ( ( rule__Chart__QuestionAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1211:1: ( rule__Chart__QuestionAssignment_2 )
            {
             before(grammarAccess.getChartAccess().getQuestionAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1212:1: ( rule__Chart__QuestionAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1212:2: rule__Chart__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Chart__QuestionAssignment_2_in_rule__Chart__Group__2__Impl2396);
            rule__Chart__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getQuestionAssignment_2()); 

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
    // $ANTLR end "rule__Chart__Group__2__Impl"


    // $ANTLR start "rule__Chart__Group__3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1222:1: rule__Chart__Group__3 : rule__Chart__Group__3__Impl rule__Chart__Group__4 ;
    public final void rule__Chart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1226:1: ( rule__Chart__Group__3__Impl rule__Chart__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1227:2: rule__Chart__Group__3__Impl rule__Chart__Group__4
            {
            pushFollow(FOLLOW_rule__Chart__Group__3__Impl_in_rule__Chart__Group__32426);
            rule__Chart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__4_in_rule__Chart__Group__32429);
            rule__Chart__Group__4();

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
    // $ANTLR end "rule__Chart__Group__3"


    // $ANTLR start "rule__Chart__Group__3__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1234:1: rule__Chart__Group__3__Impl : ( '(' ) ;
    public final void rule__Chart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1238:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1239:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1239:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1240:1: '('
            {
             before(grammarAccess.getChartAccess().getLeftParenthesisKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Chart__Group__3__Impl2457); 
             after(grammarAccess.getChartAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Chart__Group__3__Impl"


    // $ANTLR start "rule__Chart__Group__4"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1253:1: rule__Chart__Group__4 : rule__Chart__Group__4__Impl rule__Chart__Group__5 ;
    public final void rule__Chart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1257:1: ( rule__Chart__Group__4__Impl rule__Chart__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1258:2: rule__Chart__Group__4__Impl rule__Chart__Group__5
            {
            pushFollow(FOLLOW_rule__Chart__Group__4__Impl_in_rule__Chart__Group__42488);
            rule__Chart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__5_in_rule__Chart__Group__42491);
            rule__Chart__Group__5();

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
    // $ANTLR end "rule__Chart__Group__4"


    // $ANTLR start "rule__Chart__Group__4__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1265:1: rule__Chart__Group__4__Impl : ( ( rule__Chart__ChoicesAssignment_4 )* ) ;
    public final void rule__Chart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1269:1: ( ( ( rule__Chart__ChoicesAssignment_4 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1270:1: ( ( rule__Chart__ChoicesAssignment_4 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1270:1: ( ( rule__Chart__ChoicesAssignment_4 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1271:1: ( rule__Chart__ChoicesAssignment_4 )*
            {
             before(grammarAccess.getChartAccess().getChoicesAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1272:1: ( rule__Chart__ChoicesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1272:2: rule__Chart__ChoicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Chart__ChoicesAssignment_4_in_rule__Chart__Group__4__Impl2518);
            	    rule__Chart__ChoicesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getChartAccess().getChoicesAssignment_4()); 

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
    // $ANTLR end "rule__Chart__Group__4__Impl"


    // $ANTLR start "rule__Chart__Group__5"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1282:1: rule__Chart__Group__5 : rule__Chart__Group__5__Impl rule__Chart__Group__6 ;
    public final void rule__Chart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1286:1: ( rule__Chart__Group__5__Impl rule__Chart__Group__6 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1287:2: rule__Chart__Group__5__Impl rule__Chart__Group__6
            {
            pushFollow(FOLLOW_rule__Chart__Group__5__Impl_in_rule__Chart__Group__52549);
            rule__Chart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__6_in_rule__Chart__Group__52552);
            rule__Chart__Group__6();

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
    // $ANTLR end "rule__Chart__Group__5"


    // $ANTLR start "rule__Chart__Group__5__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1294:1: rule__Chart__Group__5__Impl : ( ')' ) ;
    public final void rule__Chart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1298:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1299:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1299:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1300:1: ')'
            {
             before(grammarAccess.getChartAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Chart__Group__5__Impl2580); 
             after(grammarAccess.getChartAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Chart__Group__5__Impl"


    // $ANTLR start "rule__Chart__Group__6"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1313:1: rule__Chart__Group__6 : rule__Chart__Group__6__Impl rule__Chart__Group__7 ;
    public final void rule__Chart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1317:1: ( rule__Chart__Group__6__Impl rule__Chart__Group__7 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1318:2: rule__Chart__Group__6__Impl rule__Chart__Group__7
            {
            pushFollow(FOLLOW_rule__Chart__Group__6__Impl_in_rule__Chart__Group__62611);
            rule__Chart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__7_in_rule__Chart__Group__62614);
            rule__Chart__Group__7();

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
    // $ANTLR end "rule__Chart__Group__6"


    // $ANTLR start "rule__Chart__Group__6__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1325:1: rule__Chart__Group__6__Impl : ( 'x' ) ;
    public final void rule__Chart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1329:1: ( ( 'x' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1330:1: ( 'x' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1330:1: ( 'x' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1331:1: 'x'
            {
             before(grammarAccess.getChartAccess().getXKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Chart__Group__6__Impl2642); 
             after(grammarAccess.getChartAccess().getXKeyword_6()); 

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
    // $ANTLR end "rule__Chart__Group__6__Impl"


    // $ANTLR start "rule__Chart__Group__7"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1344:1: rule__Chart__Group__7 : rule__Chart__Group__7__Impl rule__Chart__Group__8 ;
    public final void rule__Chart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1348:1: ( rule__Chart__Group__7__Impl rule__Chart__Group__8 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1349:2: rule__Chart__Group__7__Impl rule__Chart__Group__8
            {
            pushFollow(FOLLOW_rule__Chart__Group__7__Impl_in_rule__Chart__Group__72673);
            rule__Chart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__8_in_rule__Chart__Group__72676);
            rule__Chart__Group__8();

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
    // $ANTLR end "rule__Chart__Group__7"


    // $ANTLR start "rule__Chart__Group__7__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1356:1: rule__Chart__Group__7__Impl : ( '(' ) ;
    public final void rule__Chart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1360:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1361:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1361:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1362:1: '('
            {
             before(grammarAccess.getChartAccess().getLeftParenthesisKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__Chart__Group__7__Impl2704); 
             after(grammarAccess.getChartAccess().getLeftParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Chart__Group__7__Impl"


    // $ANTLR start "rule__Chart__Group__8"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1375:1: rule__Chart__Group__8 : rule__Chart__Group__8__Impl rule__Chart__Group__9 ;
    public final void rule__Chart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1379:1: ( rule__Chart__Group__8__Impl rule__Chart__Group__9 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1380:2: rule__Chart__Group__8__Impl rule__Chart__Group__9
            {
            pushFollow(FOLLOW_rule__Chart__Group__8__Impl_in_rule__Chart__Group__82735);
            rule__Chart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__9_in_rule__Chart__Group__82738);
            rule__Chart__Group__9();

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
    // $ANTLR end "rule__Chart__Group__8"


    // $ANTLR start "rule__Chart__Group__8__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1387:1: rule__Chart__Group__8__Impl : ( ( rule__Chart__GraduationsAssignment_8 )* ) ;
    public final void rule__Chart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1391:1: ( ( ( rule__Chart__GraduationsAssignment_8 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1392:1: ( ( rule__Chart__GraduationsAssignment_8 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1392:1: ( ( rule__Chart__GraduationsAssignment_8 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1393:1: ( rule__Chart__GraduationsAssignment_8 )*
            {
             before(grammarAccess.getChartAccess().getGraduationsAssignment_8()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1394:1: ( rule__Chart__GraduationsAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1394:2: rule__Chart__GraduationsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Chart__GraduationsAssignment_8_in_rule__Chart__Group__8__Impl2765);
            	    rule__Chart__GraduationsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getChartAccess().getGraduationsAssignment_8()); 

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
    // $ANTLR end "rule__Chart__Group__8__Impl"


    // $ANTLR start "rule__Chart__Group__9"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1404:1: rule__Chart__Group__9 : rule__Chart__Group__9__Impl ;
    public final void rule__Chart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1408:1: ( rule__Chart__Group__9__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1409:2: rule__Chart__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Chart__Group__9__Impl_in_rule__Chart__Group__92796);
            rule__Chart__Group__9__Impl();

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
    // $ANTLR end "rule__Chart__Group__9"


    // $ANTLR start "rule__Chart__Group__9__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1415:1: rule__Chart__Group__9__Impl : ( ')' ) ;
    public final void rule__Chart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1419:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1420:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1420:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1421:1: ')'
            {
             before(grammarAccess.getChartAccess().getRightParenthesisKeyword_9()); 
            match(input,14,FOLLOW_14_in_rule__Chart__Group__9__Impl2824); 
             after(grammarAccess.getChartAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__Chart__Group__9__Impl"


    // $ANTLR start "rule__Graduation__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1454:1: rule__Graduation__Group__0 : rule__Graduation__Group__0__Impl rule__Graduation__Group__1 ;
    public final void rule__Graduation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1458:1: ( rule__Graduation__Group__0__Impl rule__Graduation__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1459:2: rule__Graduation__Group__0__Impl rule__Graduation__Group__1
            {
            pushFollow(FOLLOW_rule__Graduation__Group__0__Impl_in_rule__Graduation__Group__02875);
            rule__Graduation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Graduation__Group__1_in_rule__Graduation__Group__02878);
            rule__Graduation__Group__1();

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
    // $ANTLR end "rule__Graduation__Group__0"


    // $ANTLR start "rule__Graduation__Group__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1466:1: rule__Graduation__Group__0__Impl : ( ( rule__Graduation__NameAssignment_0 )? ) ;
    public final void rule__Graduation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1470:1: ( ( ( rule__Graduation__NameAssignment_0 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1471:1: ( ( rule__Graduation__NameAssignment_0 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1471:1: ( ( rule__Graduation__NameAssignment_0 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1472:1: ( rule__Graduation__NameAssignment_0 )?
            {
             before(grammarAccess.getGraduationAccess().getNameAssignment_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1473:1: ( rule__Graduation__NameAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1473:2: rule__Graduation__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Graduation__NameAssignment_0_in_rule__Graduation__Group__0__Impl2905);
                    rule__Graduation__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraduationAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Graduation__Group__0__Impl"


    // $ANTLR start "rule__Graduation__Group__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1483:1: rule__Graduation__Group__1 : rule__Graduation__Group__1__Impl ;
    public final void rule__Graduation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1487:1: ( rule__Graduation__Group__1__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1488:2: rule__Graduation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Graduation__Group__1__Impl_in_rule__Graduation__Group__12936);
            rule__Graduation__Group__1__Impl();

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
    // $ANTLR end "rule__Graduation__Group__1"


    // $ANTLR start "rule__Graduation__Group__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1494:1: rule__Graduation__Group__1__Impl : ( ( rule__Graduation__StatementAssignment_1 ) ) ;
    public final void rule__Graduation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1498:1: ( ( ( rule__Graduation__StatementAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1499:1: ( ( rule__Graduation__StatementAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1499:1: ( ( rule__Graduation__StatementAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1500:1: ( rule__Graduation__StatementAssignment_1 )
            {
             before(grammarAccess.getGraduationAccess().getStatementAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1501:1: ( rule__Graduation__StatementAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1501:2: rule__Graduation__StatementAssignment_1
            {
            pushFollow(FOLLOW_rule__Graduation__StatementAssignment_1_in_rule__Graduation__Group__1__Impl2963);
            rule__Graduation__StatementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraduationAccess().getStatementAssignment_1()); 

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
    // $ANTLR end "rule__Graduation__Group__1__Impl"


    // $ANTLR start "rule__Rating__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1515:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1519:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1520:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
            {
            pushFollow(FOLLOW_rule__Rating__Group__0__Impl_in_rule__Rating__Group__02997);
            rule__Rating__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rating__Group__1_in_rule__Rating__Group__03000);
            rule__Rating__Group__1();

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
    // $ANTLR end "rule__Rating__Group__0"


    // $ANTLR start "rule__Rating__Group__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1527:1: rule__Rating__Group__0__Impl : ( 'rating' ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1531:1: ( ( 'rating' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1532:1: ( 'rating' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1532:1: ( 'rating' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1533:1: 'rating'
            {
             before(grammarAccess.getRatingAccess().getRatingKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Rating__Group__0__Impl3028); 
             after(grammarAccess.getRatingAccess().getRatingKeyword_0()); 

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
    // $ANTLR end "rule__Rating__Group__0__Impl"


    // $ANTLR start "rule__Rating__Group__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1546:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1550:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1551:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
            {
            pushFollow(FOLLOW_rule__Rating__Group__1__Impl_in_rule__Rating__Group__13059);
            rule__Rating__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rating__Group__2_in_rule__Rating__Group__13062);
            rule__Rating__Group__2();

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
    // $ANTLR end "rule__Rating__Group__1"


    // $ANTLR start "rule__Rating__Group__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1558:1: rule__Rating__Group__1__Impl : ( ( rule__Rating__NameAssignment_1 ) ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1562:1: ( ( ( rule__Rating__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1563:1: ( ( rule__Rating__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1563:1: ( ( rule__Rating__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1564:1: ( rule__Rating__NameAssignment_1 )
            {
             before(grammarAccess.getRatingAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1565:1: ( rule__Rating__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1565:2: rule__Rating__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rating__NameAssignment_1_in_rule__Rating__Group__1__Impl3089);
            rule__Rating__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Rating__Group__1__Impl"


    // $ANTLR start "rule__Rating__Group__2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1575:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1579:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1580:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FOLLOW_rule__Rating__Group__2__Impl_in_rule__Rating__Group__23119);
            rule__Rating__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rating__Group__3_in_rule__Rating__Group__23122);
            rule__Rating__Group__3();

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
    // $ANTLR end "rule__Rating__Group__2"


    // $ANTLR start "rule__Rating__Group__2__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1587:1: rule__Rating__Group__2__Impl : ( ( rule__Rating__QuestionAssignment_2 ) ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1591:1: ( ( ( rule__Rating__QuestionAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1592:1: ( ( rule__Rating__QuestionAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1592:1: ( ( rule__Rating__QuestionAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1593:1: ( rule__Rating__QuestionAssignment_2 )
            {
             before(grammarAccess.getRatingAccess().getQuestionAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1594:1: ( rule__Rating__QuestionAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1594:2: rule__Rating__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Rating__QuestionAssignment_2_in_rule__Rating__Group__2__Impl3149);
            rule__Rating__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getQuestionAssignment_2()); 

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
    // $ANTLR end "rule__Rating__Group__2__Impl"


    // $ANTLR start "rule__Rating__Group__3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1604:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1608:1: ( rule__Rating__Group__3__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1609:2: rule__Rating__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rating__Group__3__Impl_in_rule__Rating__Group__33179);
            rule__Rating__Group__3__Impl();

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
    // $ANTLR end "rule__Rating__Group__3"


    // $ANTLR start "rule__Rating__Group__3__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1615:1: rule__Rating__Group__3__Impl : ( ( rule__Rating__RatingQuantityAssignment_3 ) ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1619:1: ( ( ( rule__Rating__RatingQuantityAssignment_3 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1620:1: ( ( rule__Rating__RatingQuantityAssignment_3 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1620:1: ( ( rule__Rating__RatingQuantityAssignment_3 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1621:1: ( rule__Rating__RatingQuantityAssignment_3 )
            {
             before(grammarAccess.getRatingAccess().getRatingQuantityAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1622:1: ( rule__Rating__RatingQuantityAssignment_3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1622:2: rule__Rating__RatingQuantityAssignment_3
            {
            pushFollow(FOLLOW_rule__Rating__RatingQuantityAssignment_3_in_rule__Rating__Group__3__Impl3206);
            rule__Rating__RatingQuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getRatingQuantityAssignment_3()); 

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
    // $ANTLR end "rule__Rating__Group__3__Impl"


    // $ANTLR start "rule__Survey__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1641:1: rule__Survey__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Survey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1645:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1646:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1646:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1647:1: RULE_ID
            {
             before(grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_13249); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1656:1: rule__Survey__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Survey__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1660:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1661:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1661:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1662:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_23280); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1671:1: rule__Survey__GreetingAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Survey__GreetingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1675:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1676:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1676:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1677:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getGreetingSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__GreetingAssignment_33311); 
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


    // $ANTLR start "rule__Survey__PagesAssignment_4"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1686:1: rule__Survey__PagesAssignment_4 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1690:1: ( ( rulePage ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1691:1: ( rulePage )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1691:1: ( rulePage )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1692:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePage_in_rule__Survey__PagesAssignment_43342);
            rulePage();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Survey__PagesAssignment_4"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1701:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1705:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1706:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1706:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1707:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13373); 
             after(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Page__NameAssignment_1"


    // $ANTLR start "rule__Page__QuestionAssignment_3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1716:1: rule__Page__QuestionAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1720:1: ( ( ruleQuestion ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1721:1: ( ruleQuestion )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1721:1: ( ruleQuestion )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1722:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Page__QuestionAssignment_33404);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPageAccess().getQuestionQuestionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Page__QuestionAssignment_3"


    // $ANTLR start "rule__Page__ForwardingAssignment_4_0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1731:1: rule__Page__ForwardingAssignment_4_0 : ( ( 'forwarding to ->' ) ) ;
    public final void rule__Page__ForwardingAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1735:1: ( ( ( 'forwarding to ->' ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1736:1: ( ( 'forwarding to ->' ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1736:1: ( ( 'forwarding to ->' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1737:1: ( 'forwarding to ->' )
            {
             before(grammarAccess.getPageAccess().getForwardingForwardingToKeyword_4_0_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1738:1: ( 'forwarding to ->' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1739:1: 'forwarding to ->'
            {
             before(grammarAccess.getPageAccess().getForwardingForwardingToKeyword_4_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Page__ForwardingAssignment_4_03440); 
             after(grammarAccess.getPageAccess().getForwardingForwardingToKeyword_4_0_0()); 

            }

             after(grammarAccess.getPageAccess().getForwardingForwardingToKeyword_4_0_0()); 

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
    // $ANTLR end "rule__Page__ForwardingAssignment_4_0"


    // $ANTLR start "rule__Page__FollowingPageAssignment_4_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1754:1: rule__Page__FollowingPageAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Page__FollowingPageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1758:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1759:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1759:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1760:1: ( RULE_ID )
            {
             before(grammarAccess.getPageAccess().getFollowingPagePageCrossReference_4_1_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1761:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1762:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getFollowingPagePageIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__FollowingPageAssignment_4_13483); 
             after(grammarAccess.getPageAccess().getFollowingPagePageIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPageAccess().getFollowingPagePageCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Page__FollowingPageAssignment_4_1"


    // $ANTLR start "rule__Freetext__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1773:1: rule__Freetext__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Freetext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1777:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1778:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1778:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1779:1: RULE_ID
            {
             before(grammarAccess.getFreetextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Freetext__NameAssignment_13518); 
             after(grammarAccess.getFreetextAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Freetext__NameAssignment_1"


    // $ANTLR start "rule__Freetext__QuestionAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1788:1: rule__Freetext__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Freetext__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1792:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1793:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1793:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1794:1: RULE_STRING
            {
             before(grammarAccess.getFreetextAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Freetext__QuestionAssignment_23549); 
             after(grammarAccess.getFreetextAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Freetext__QuestionAssignment_2"


    // $ANTLR start "rule__Selection__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1803:1: rule__Selection__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1807:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1808:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1808:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1809:1: RULE_ID
            {
             before(grammarAccess.getSelectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_13580); 
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


    // $ANTLR start "rule__Selection__QuestionAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1818:1: rule__Selection__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Selection__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1822:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1823:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1823:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1824:1: RULE_STRING
            {
             before(grammarAccess.getSelectionAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Selection__QuestionAssignment_23611); 
             after(grammarAccess.getSelectionAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Selection__QuestionAssignment_2"


    // $ANTLR start "rule__Selection__ChoicesAssignment_4"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1833:1: rule__Selection__ChoicesAssignment_4 : ( ruleChoice ) ;
    public final void rule__Selection__ChoicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1837:1: ( ( ruleChoice ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1838:1: ( ruleChoice )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1838:1: ( ruleChoice )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1839:1: ruleChoice
            {
             before(grammarAccess.getSelectionAccess().getChoicesChoiceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleChoice_in_rule__Selection__ChoicesAssignment_43642);
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


    // $ANTLR start "rule__Choice__FreetextAssignment_0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1848:1: rule__Choice__FreetextAssignment_0 : ( ( 'freetext' ) ) ;
    public final void rule__Choice__FreetextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1852:1: ( ( ( 'freetext' ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1853:1: ( ( 'freetext' ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1853:1: ( ( 'freetext' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1854:1: ( 'freetext' )
            {
             before(grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1855:1: ( 'freetext' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1856:1: 'freetext'
            {
             before(grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0()); 
            match(input,15,FOLLOW_15_in_rule__Choice__FreetextAssignment_03678); 
             after(grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0()); 

            }

             after(grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0()); 

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
    // $ANTLR end "rule__Choice__FreetextAssignment_0"


    // $ANTLR start "rule__Choice__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1871:1: rule__Choice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1875:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1876:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1876:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1877:1: RULE_ID
            {
             before(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_13717); 
             after(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Choice__NameAssignment_1"


    // $ANTLR start "rule__Choice__BulletPointAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1886:1: rule__Choice__BulletPointAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Choice__BulletPointAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1890:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1891:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1891:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1892:1: RULE_STRING
            {
             before(grammarAccess.getChoiceAccess().getBulletPointSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Choice__BulletPointAssignment_23748); 
             after(grammarAccess.getChoiceAccess().getBulletPointSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Choice__BulletPointAssignment_2"


    // $ANTLR start "rule__Chart__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1901:1: rule__Chart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1905:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1906:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1906:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1907:1: RULE_ID
            {
             before(grammarAccess.getChartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chart__NameAssignment_13779); 
             after(grammarAccess.getChartAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Chart__NameAssignment_1"


    // $ANTLR start "rule__Chart__QuestionAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1916:1: rule__Chart__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Chart__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1920:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1921:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1921:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1922:1: RULE_STRING
            {
             before(grammarAccess.getChartAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Chart__QuestionAssignment_23810); 
             after(grammarAccess.getChartAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Chart__QuestionAssignment_2"


    // $ANTLR start "rule__Chart__ChoicesAssignment_4"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1931:1: rule__Chart__ChoicesAssignment_4 : ( ruleChoice ) ;
    public final void rule__Chart__ChoicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1935:1: ( ( ruleChoice ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1936:1: ( ruleChoice )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1936:1: ( ruleChoice )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1937:1: ruleChoice
            {
             before(grammarAccess.getChartAccess().getChoicesChoiceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleChoice_in_rule__Chart__ChoicesAssignment_43841);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChartAccess().getChoicesChoiceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Chart__ChoicesAssignment_4"


    // $ANTLR start "rule__Chart__GraduationsAssignment_8"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1946:1: rule__Chart__GraduationsAssignment_8 : ( ruleGraduation ) ;
    public final void rule__Chart__GraduationsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1950:1: ( ( ruleGraduation ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1951:1: ( ruleGraduation )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1951:1: ( ruleGraduation )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1952:1: ruleGraduation
            {
             before(grammarAccess.getChartAccess().getGraduationsGraduationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleGraduation_in_rule__Chart__GraduationsAssignment_83872);
            ruleGraduation();

            state._fsp--;

             after(grammarAccess.getChartAccess().getGraduationsGraduationParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Chart__GraduationsAssignment_8"


    // $ANTLR start "rule__Graduation__NameAssignment_0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1961:1: rule__Graduation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Graduation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1965:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1966:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1966:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1967:1: RULE_ID
            {
             before(grammarAccess.getGraduationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Graduation__NameAssignment_03903); 
             after(grammarAccess.getGraduationAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Graduation__NameAssignment_0"


    // $ANTLR start "rule__Graduation__StatementAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1976:1: rule__Graduation__StatementAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Graduation__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1980:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1981:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1981:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1982:1: RULE_STRING
            {
             before(grammarAccess.getGraduationAccess().getStatementSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Graduation__StatementAssignment_13934); 
             after(grammarAccess.getGraduationAccess().getStatementSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Graduation__StatementAssignment_1"


    // $ANTLR start "rule__Rating__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1991:1: rule__Rating__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rating__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1995:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1996:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1996:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1997:1: RULE_ID
            {
             before(grammarAccess.getRatingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rating__NameAssignment_13965); 
             after(grammarAccess.getRatingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rating__NameAssignment_1"


    // $ANTLR start "rule__Rating__QuestionAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2006:1: rule__Rating__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Rating__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2010:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2011:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2011:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2012:1: RULE_STRING
            {
             before(grammarAccess.getRatingAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rating__QuestionAssignment_23996); 
             after(grammarAccess.getRatingAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rating__QuestionAssignment_2"


    // $ANTLR start "rule__Rating__RatingQuantityAssignment_3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2021:1: rule__Rating__RatingQuantityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Rating__RatingQuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2025:1: ( ( RULE_INT ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2026:1: ( RULE_INT )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2026:1: ( RULE_INT )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2027:1: RULE_INT
            {
             before(grammarAccess.getRatingAccess().getRatingQuantityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Rating__RatingQuantityAssignment_34027); 
             after(grammarAccess.getRatingAccess().getRatingQuantityINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rating__RatingQuantityAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0_in_ruleSurvey94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_entryRuleFreetext241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreetext248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__0_in_ruleFreetext274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelection308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0_in_ruleSelection334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0_in_ruleChoice394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_entryRuleChart421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChart428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__0_in_ruleChart454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraduation_in_entryRuleGraduation481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraduation488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__Group__0_in_ruleGraduation514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRating_in_entryRuleRating541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRating548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__0_in_ruleRating574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_rule__Question__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_rule__Question__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_rule__Question__Alternatives644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRating_in_rule__Question__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2813 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3873 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__GreetingAssignment_3_in_rule__Survey__Group__3__Impl903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__PagesAssignment_4_in_rule__Survey__Group__4__Impl961 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__01002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__01005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Page__Group__0__Impl1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__11064 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__11067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21124 = new BitSet(new long[]{0x00000000000B8000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Page__Group__2__Impl1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31186 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__QuestionAssignment_3_in_rule__Page__Group__3__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41246 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0_in_rule__Page__Group__4__Impl1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Page__Group__5__Impl1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__01378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__01381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ForwardingAssignment_4_0_in_rule__Page__Group_4__0__Impl1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__11438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__FollowingPageAssignment_4_1_in_rule__Page__Group_4__1__Impl1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__0__Impl_in_rule__Freetext__Group__01499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Freetext__Group__1_in_rule__Freetext__Group__01502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Freetext__Group__0__Impl1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__1__Impl_in_rule__Freetext__Group__11561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Freetext__Group__2_in_rule__Freetext__Group__11564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__NameAssignment_1_in_rule__Freetext__Group__1__Impl1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__2__Impl_in_rule__Freetext__Group__21621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__QuestionAssignment_2_in_rule__Freetext__Group__2__Impl1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__01684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__01687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Selection__Group__0__Impl1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__11746 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__21806 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__21809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__QuestionAssignment_2_in_rule__Selection__Group__2__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__31866 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__31869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Selection__Group__3__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__41928 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__41931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__ChoicesAssignment_4_in_rule__Selection__Group__4__Impl1958 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__51989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Selection__Group__5__Impl2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__02060 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__02063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__FreetextAssignment_0_in_rule__Choice__Group__0__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__12121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__12124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__NameAssignment_1_in_rule__Choice__Group__1__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__22181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__BulletPointAssignment_2_in_rule__Choice__Group__2__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__0__Impl_in_rule__Chart__Group__02244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Chart__Group__1_in_rule__Chart__Group__02247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Chart__Group__0__Impl2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__1__Impl_in_rule__Chart__Group__12306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Chart__Group__2_in_rule__Chart__Group__12309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__NameAssignment_1_in_rule__Chart__Group__1__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__2__Impl_in_rule__Chart__Group__22366 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Chart__Group__3_in_rule__Chart__Group__22369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__QuestionAssignment_2_in_rule__Chart__Group__2__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__3__Impl_in_rule__Chart__Group__32426 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Chart__Group__4_in_rule__Chart__Group__32429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Chart__Group__3__Impl2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__4__Impl_in_rule__Chart__Group__42488 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Chart__Group__5_in_rule__Chart__Group__42491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__ChoicesAssignment_4_in_rule__Chart__Group__4__Impl2518 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_rule__Chart__Group__5__Impl_in_rule__Chart__Group__52549 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Chart__Group__6_in_rule__Chart__Group__52552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Chart__Group__5__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__6__Impl_in_rule__Chart__Group__62611 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Chart__Group__7_in_rule__Chart__Group__62614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Chart__Group__6__Impl2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__7__Impl_in_rule__Chart__Group__72673 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Chart__Group__8_in_rule__Chart__Group__72676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Chart__Group__7__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__8__Impl_in_rule__Chart__Group__82735 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Chart__Group__9_in_rule__Chart__Group__82738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__GraduationsAssignment_8_in_rule__Chart__Group__8__Impl2765 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Chart__Group__9__Impl_in_rule__Chart__Group__92796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Chart__Group__9__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__Group__0__Impl_in_rule__Graduation__Group__02875 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Graduation__Group__1_in_rule__Graduation__Group__02878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__NameAssignment_0_in_rule__Graduation__Group__0__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__Group__1__Impl_in_rule__Graduation__Group__12936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__StatementAssignment_1_in_rule__Graduation__Group__1__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__0__Impl_in_rule__Rating__Group__02997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rating__Group__1_in_rule__Rating__Group__03000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Rating__Group__0__Impl3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__1__Impl_in_rule__Rating__Group__13059 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rating__Group__2_in_rule__Rating__Group__13062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__NameAssignment_1_in_rule__Rating__Group__1__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__2__Impl_in_rule__Rating__Group__23119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Rating__Group__3_in_rule__Rating__Group__23122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__QuestionAssignment_2_in_rule__Rating__Group__2__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__3__Impl_in_rule__Rating__Group__33179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__RatingQuantityAssignment_3_in_rule__Rating__Group__3__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_13249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_23280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__GreetingAssignment_33311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_43342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionAssignment_33404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Page__ForwardingAssignment_4_03440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__FollowingPageAssignment_4_13483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Freetext__NameAssignment_13518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Freetext__QuestionAssignment_23549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_13580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Selection__QuestionAssignment_23611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__Selection__ChoicesAssignment_43642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Choice__FreetextAssignment_03678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_13717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Choice__BulletPointAssignment_23748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chart__NameAssignment_13779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Chart__QuestionAssignment_23810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__Chart__ChoicesAssignment_43841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraduation_in_rule__Chart__GraduationsAssignment_83872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Graduation__NameAssignment_03903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Graduation__StatementAssignment_13934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rating__NameAssignment_13965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rating__QuestionAssignment_23996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Rating__RatingQuantityAssignment_34027 = new BitSet(new long[]{0x0000000000000002L});

}