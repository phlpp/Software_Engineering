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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'page'", "'('", "')'", "'freetext'", "'select'", "'chart'", "'x'", "'rating'", "'calendar'"
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


    // $ANTLR start "entryRuleCalendar"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:312:1: entryRuleCalendar : ruleCalendar EOF ;
    public final void entryRuleCalendar() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:313:1: ( ruleCalendar EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:314:1: ruleCalendar EOF
            {
             before(grammarAccess.getCalendarRule()); 
            pushFollow(FOLLOW_ruleCalendar_in_entryRuleCalendar601);
            ruleCalendar();

            state._fsp--;

             after(grammarAccess.getCalendarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalendar608); 

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
    // $ANTLR end "entryRuleCalendar"


    // $ANTLR start "ruleCalendar"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:321:1: ruleCalendar : ( ( rule__Calendar__Group__0 ) ) ;
    public final void ruleCalendar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:325:2: ( ( ( rule__Calendar__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:326:1: ( ( rule__Calendar__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:326:1: ( ( rule__Calendar__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:327:1: ( rule__Calendar__Group__0 )
            {
             before(grammarAccess.getCalendarAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:328:1: ( rule__Calendar__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:328:2: rule__Calendar__Group__0
            {
            pushFollow(FOLLOW_rule__Calendar__Group__0_in_ruleCalendar634);
            rule__Calendar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalendarAccess().getGroup()); 

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
    // $ANTLR end "ruleCalendar"


    // $ANTLR start "rule__Question__Alternatives"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:340:1: rule__Question__Alternatives : ( ( ruleFreetext ) | ( ruleSelection ) | ( ruleChart ) | ( ruleRating ) | ( ruleCalendar ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:344:1: ( ( ruleFreetext ) | ( ruleSelection ) | ( ruleChart ) | ( ruleRating ) | ( ruleCalendar ) )
            int alt1=5;
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
            case 20:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:345:1: ( ruleFreetext )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:345:1: ( ruleFreetext )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:346:1: ruleFreetext
                    {
                     before(grammarAccess.getQuestionAccess().getFreetextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFreetext_in_rule__Question__Alternatives670);
                    ruleFreetext();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFreetextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:351:6: ( ruleSelection )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:351:6: ( ruleSelection )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:352:1: ruleSelection
                    {
                     before(grammarAccess.getQuestionAccess().getSelectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSelection_in_rule__Question__Alternatives687);
                    ruleSelection();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getSelectionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:357:6: ( ruleChart )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:357:6: ( ruleChart )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:358:1: ruleChart
                    {
                     before(grammarAccess.getQuestionAccess().getChartParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleChart_in_rule__Question__Alternatives704);
                    ruleChart();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getChartParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:363:6: ( ruleRating )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:363:6: ( ruleRating )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:364:1: ruleRating
                    {
                     before(grammarAccess.getQuestionAccess().getRatingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRating_in_rule__Question__Alternatives721);
                    ruleRating();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getRatingParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:369:6: ( ruleCalendar )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:369:6: ( ruleCalendar )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:370:1: ruleCalendar
                    {
                     before(grammarAccess.getQuestionAccess().getCalendarParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCalendar_in_rule__Question__Alternatives738);
                    ruleCalendar();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getCalendarParserRuleCall_4()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:382:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:386:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:387:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0768);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0771);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:394:1: rule__Survey__Group__0__Impl : ( 'survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:398:1: ( ( 'survey' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:399:1: ( 'survey' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:399:1: ( 'survey' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:400:1: 'survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Survey__Group__0__Impl799); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:413:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:417:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:418:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1830);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1833);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:425:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__NameAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:429:1: ( ( ( rule__Survey__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:430:1: ( ( rule__Survey__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:430:1: ( ( rule__Survey__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:431:1: ( rule__Survey__NameAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:432:1: ( rule__Survey__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:432:2: rule__Survey__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl860);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:442:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:446:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:447:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2890);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2893);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:454:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__TitleAssignment_2 ) ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:458:1: ( ( ( rule__Survey__TitleAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:459:1: ( ( rule__Survey__TitleAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:459:1: ( ( rule__Survey__TitleAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:460:1: ( rule__Survey__TitleAssignment_2 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:461:1: ( rule__Survey__TitleAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:461:2: rule__Survey__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl920);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:471:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:475:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:476:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3950);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3953);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:483:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__GreetingAssignment_3 )? ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:487:1: ( ( ( rule__Survey__GreetingAssignment_3 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:488:1: ( ( rule__Survey__GreetingAssignment_3 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:488:1: ( ( rule__Survey__GreetingAssignment_3 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:489:1: ( rule__Survey__GreetingAssignment_3 )?
            {
             before(grammarAccess.getSurveyAccess().getGreetingAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:490:1: ( rule__Survey__GreetingAssignment_3 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:490:2: rule__Survey__GreetingAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Survey__GreetingAssignment_3_in_rule__Survey__Group__3__Impl980);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:500:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl rule__Survey__Group__5 ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:504:1: ( rule__Survey__Group__4__Impl rule__Survey__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:505:2: rule__Survey__Group__4__Impl rule__Survey__Group__5
            {
            pushFollow(FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41011);
            rule__Survey__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__41014);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:512:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__DurationAssignment_4 )? ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:516:1: ( ( ( rule__Survey__DurationAssignment_4 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:517:1: ( ( rule__Survey__DurationAssignment_4 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:517:1: ( ( rule__Survey__DurationAssignment_4 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:518:1: ( rule__Survey__DurationAssignment_4 )?
            {
             before(grammarAccess.getSurveyAccess().getDurationAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:519:1: ( rule__Survey__DurationAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:519:2: rule__Survey__DurationAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Survey__DurationAssignment_4_in_rule__Survey__Group__4__Impl1041);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:529:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:533:1: ( rule__Survey__Group__5__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:534:2: rule__Survey__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51072);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:540:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__PagesAssignment_5 )* ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:544:1: ( ( ( rule__Survey__PagesAssignment_5 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:545:1: ( ( rule__Survey__PagesAssignment_5 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:545:1: ( ( rule__Survey__PagesAssignment_5 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:546:1: ( rule__Survey__PagesAssignment_5 )*
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_5()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:547:1: ( rule__Survey__PagesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:547:2: rule__Survey__PagesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Survey__PagesAssignment_5_in_rule__Survey__Group__5__Impl1099);
            	    rule__Survey__PagesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getPagesAssignment_5()); 

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


    // $ANTLR start "rule__Page__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:569:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:573:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:574:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__01142);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__01145);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:581:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:585:1: ( ( 'page' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:586:1: ( 'page' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:586:1: ( 'page' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:587:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Page__Group__0__Impl1173); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:600:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:604:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:605:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__11204);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__11207);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:612:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:616:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:617:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:617:1: ( ( rule__Page__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:618:1: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:619:1: ( rule__Page__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:619:2: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl1234);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:629:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:633:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:634:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21264);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21267);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:641:1: rule__Page__Group__2__Impl : ( '(' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:645:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:646:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:646:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:647:1: '('
            {
             before(grammarAccess.getPageAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Page__Group__2__Impl1295); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:660:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:664:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:665:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31326);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31329);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:672:1: rule__Page__Group__3__Impl : ( ( rule__Page__QuestionsAssignment_3 )* ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:676:1: ( ( ( rule__Page__QuestionsAssignment_3 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:677:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:677:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:678:1: ( rule__Page__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getPageAccess().getQuestionsAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:679:1: ( rule__Page__QuestionsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=17)||(LA5_0>=19 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:679:2: rule__Page__QuestionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl1356);
            	    rule__Page__QuestionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getQuestionsAssignment_3()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:689:1: rule__Page__Group__4 : rule__Page__Group__4__Impl ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:693:1: ( rule__Page__Group__4__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:694:2: rule__Page__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41387);
            rule__Page__Group__4__Impl();

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:700:1: rule__Page__Group__4__Impl : ( ')' ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:704:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:705:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:705:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:706:1: ')'
            {
             before(grammarAccess.getPageAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Page__Group__4__Impl1415); 
             after(grammarAccess.getPageAccess().getRightParenthesisKeyword_4()); 

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


    // $ANTLR start "rule__Freetext__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:729:1: rule__Freetext__Group__0 : rule__Freetext__Group__0__Impl rule__Freetext__Group__1 ;
    public final void rule__Freetext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:733:1: ( rule__Freetext__Group__0__Impl rule__Freetext__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:734:2: rule__Freetext__Group__0__Impl rule__Freetext__Group__1
            {
            pushFollow(FOLLOW_rule__Freetext__Group__0__Impl_in_rule__Freetext__Group__01456);
            rule__Freetext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Freetext__Group__1_in_rule__Freetext__Group__01459);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:741:1: rule__Freetext__Group__0__Impl : ( 'freetext' ) ;
    public final void rule__Freetext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:745:1: ( ( 'freetext' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:746:1: ( 'freetext' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:746:1: ( 'freetext' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:747:1: 'freetext'
            {
             before(grammarAccess.getFreetextAccess().getFreetextKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Freetext__Group__0__Impl1487); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:760:1: rule__Freetext__Group__1 : rule__Freetext__Group__1__Impl rule__Freetext__Group__2 ;
    public final void rule__Freetext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:764:1: ( rule__Freetext__Group__1__Impl rule__Freetext__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:765:2: rule__Freetext__Group__1__Impl rule__Freetext__Group__2
            {
            pushFollow(FOLLOW_rule__Freetext__Group__1__Impl_in_rule__Freetext__Group__11518);
            rule__Freetext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Freetext__Group__2_in_rule__Freetext__Group__11521);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:772:1: rule__Freetext__Group__1__Impl : ( ( rule__Freetext__NameAssignment_1 ) ) ;
    public final void rule__Freetext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:776:1: ( ( ( rule__Freetext__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:777:1: ( ( rule__Freetext__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:777:1: ( ( rule__Freetext__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:778:1: ( rule__Freetext__NameAssignment_1 )
            {
             before(grammarAccess.getFreetextAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:779:1: ( rule__Freetext__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:779:2: rule__Freetext__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Freetext__NameAssignment_1_in_rule__Freetext__Group__1__Impl1548);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:789:1: rule__Freetext__Group__2 : rule__Freetext__Group__2__Impl ;
    public final void rule__Freetext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:793:1: ( rule__Freetext__Group__2__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:794:2: rule__Freetext__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Freetext__Group__2__Impl_in_rule__Freetext__Group__21578);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:800:1: rule__Freetext__Group__2__Impl : ( ( rule__Freetext__QuestionAssignment_2 ) ) ;
    public final void rule__Freetext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:804:1: ( ( ( rule__Freetext__QuestionAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:805:1: ( ( rule__Freetext__QuestionAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:805:1: ( ( rule__Freetext__QuestionAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:806:1: ( rule__Freetext__QuestionAssignment_2 )
            {
             before(grammarAccess.getFreetextAccess().getQuestionAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:807:1: ( rule__Freetext__QuestionAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:807:2: rule__Freetext__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Freetext__QuestionAssignment_2_in_rule__Freetext__Group__2__Impl1605);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:823:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:827:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:828:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__01641);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__01644);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:835:1: rule__Selection__Group__0__Impl : ( 'select' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:839:1: ( ( 'select' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:840:1: ( 'select' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:840:1: ( 'select' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:841:1: 'select'
            {
             before(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Selection__Group__0__Impl1672); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:854:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:858:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:859:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__11703);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__11706);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:866:1: rule__Selection__Group__1__Impl : ( ( rule__Selection__NameAssignment_1 ) ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:870:1: ( ( ( rule__Selection__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:871:1: ( ( rule__Selection__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:871:1: ( ( rule__Selection__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:872:1: ( rule__Selection__NameAssignment_1 )
            {
             before(grammarAccess.getSelectionAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:873:1: ( rule__Selection__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:873:2: rule__Selection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl1733);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:883:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:887:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:888:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__21763);
            rule__Selection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__21766);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:895:1: rule__Selection__Group__2__Impl : ( ( rule__Selection__QuestionAssignment_2 ) ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:899:1: ( ( ( rule__Selection__QuestionAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:900:1: ( ( rule__Selection__QuestionAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:900:1: ( ( rule__Selection__QuestionAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:901:1: ( rule__Selection__QuestionAssignment_2 )
            {
             before(grammarAccess.getSelectionAccess().getQuestionAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:902:1: ( rule__Selection__QuestionAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:902:2: rule__Selection__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Selection__QuestionAssignment_2_in_rule__Selection__Group__2__Impl1793);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:912:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:916:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:917:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__31823);
            rule__Selection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__31826);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:924:1: rule__Selection__Group__3__Impl : ( '(' ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:928:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:929:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:929:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:930:1: '('
            {
             before(grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Selection__Group__3__Impl1854); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:943:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:947:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:948:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
            {
            pushFollow(FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__41885);
            rule__Selection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__41888);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:955:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__ChoicesAssignment_4 )* ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:959:1: ( ( ( rule__Selection__ChoicesAssignment_4 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:960:1: ( ( rule__Selection__ChoicesAssignment_4 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:960:1: ( ( rule__Selection__ChoicesAssignment_4 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:961:1: ( rule__Selection__ChoicesAssignment_4 )*
            {
             before(grammarAccess.getSelectionAccess().getChoicesAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:962:1: ( rule__Selection__ChoicesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:962:2: rule__Selection__ChoicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Selection__ChoicesAssignment_4_in_rule__Selection__Group__4__Impl1915);
            	    rule__Selection__ChoicesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:972:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:976:1: ( rule__Selection__Group__5__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:977:2: rule__Selection__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__51946);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:983:1: rule__Selection__Group__5__Impl : ( ')' ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:987:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:988:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:988:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:989:1: ')'
            {
             before(grammarAccess.getSelectionAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Selection__Group__5__Impl1974); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1014:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1018:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1019:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__02017);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__02020);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1026:1: rule__Choice__Group__0__Impl : ( ( rule__Choice__FreetextAssignment_0 )? ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1030:1: ( ( ( rule__Choice__FreetextAssignment_0 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1031:1: ( ( rule__Choice__FreetextAssignment_0 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1031:1: ( ( rule__Choice__FreetextAssignment_0 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1032:1: ( rule__Choice__FreetextAssignment_0 )?
            {
             before(grammarAccess.getChoiceAccess().getFreetextAssignment_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1033:1: ( rule__Choice__FreetextAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1033:2: rule__Choice__FreetextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Choice__FreetextAssignment_0_in_rule__Choice__Group__0__Impl2047);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1043:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1047:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1048:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__12078);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__12081);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1055:1: rule__Choice__Group__1__Impl : ( ( rule__Choice__NameAssignment_1 ) ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1059:1: ( ( ( rule__Choice__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1060:1: ( ( rule__Choice__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1060:1: ( ( rule__Choice__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1061:1: ( rule__Choice__NameAssignment_1 )
            {
             before(grammarAccess.getChoiceAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1062:1: ( rule__Choice__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1062:2: rule__Choice__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Choice__NameAssignment_1_in_rule__Choice__Group__1__Impl2108);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1072:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1076:1: ( rule__Choice__Group__2__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1077:2: rule__Choice__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__22138);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1083:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__BulletPointAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1087:1: ( ( ( rule__Choice__BulletPointAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1088:1: ( ( rule__Choice__BulletPointAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1088:1: ( ( rule__Choice__BulletPointAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1089:1: ( rule__Choice__BulletPointAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getBulletPointAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1090:1: ( rule__Choice__BulletPointAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1090:2: rule__Choice__BulletPointAssignment_2
            {
            pushFollow(FOLLOW_rule__Choice__BulletPointAssignment_2_in_rule__Choice__Group__2__Impl2165);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1106:1: rule__Chart__Group__0 : rule__Chart__Group__0__Impl rule__Chart__Group__1 ;
    public final void rule__Chart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1110:1: ( rule__Chart__Group__0__Impl rule__Chart__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1111:2: rule__Chart__Group__0__Impl rule__Chart__Group__1
            {
            pushFollow(FOLLOW_rule__Chart__Group__0__Impl_in_rule__Chart__Group__02201);
            rule__Chart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__1_in_rule__Chart__Group__02204);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1118:1: rule__Chart__Group__0__Impl : ( 'chart' ) ;
    public final void rule__Chart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1122:1: ( ( 'chart' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1123:1: ( 'chart' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1123:1: ( 'chart' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1124:1: 'chart'
            {
             before(grammarAccess.getChartAccess().getChartKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Chart__Group__0__Impl2232); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1137:1: rule__Chart__Group__1 : rule__Chart__Group__1__Impl rule__Chart__Group__2 ;
    public final void rule__Chart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1141:1: ( rule__Chart__Group__1__Impl rule__Chart__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1142:2: rule__Chart__Group__1__Impl rule__Chart__Group__2
            {
            pushFollow(FOLLOW_rule__Chart__Group__1__Impl_in_rule__Chart__Group__12263);
            rule__Chart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__2_in_rule__Chart__Group__12266);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1149:1: rule__Chart__Group__1__Impl : ( ( rule__Chart__NameAssignment_1 ) ) ;
    public final void rule__Chart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1153:1: ( ( ( rule__Chart__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1154:1: ( ( rule__Chart__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1154:1: ( ( rule__Chart__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1155:1: ( rule__Chart__NameAssignment_1 )
            {
             before(grammarAccess.getChartAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1156:1: ( rule__Chart__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1156:2: rule__Chart__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Chart__NameAssignment_1_in_rule__Chart__Group__1__Impl2293);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1166:1: rule__Chart__Group__2 : rule__Chart__Group__2__Impl rule__Chart__Group__3 ;
    public final void rule__Chart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1170:1: ( rule__Chart__Group__2__Impl rule__Chart__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1171:2: rule__Chart__Group__2__Impl rule__Chart__Group__3
            {
            pushFollow(FOLLOW_rule__Chart__Group__2__Impl_in_rule__Chart__Group__22323);
            rule__Chart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__3_in_rule__Chart__Group__22326);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1178:1: rule__Chart__Group__2__Impl : ( ( rule__Chart__QuestionAssignment_2 ) ) ;
    public final void rule__Chart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1182:1: ( ( ( rule__Chart__QuestionAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1183:1: ( ( rule__Chart__QuestionAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1183:1: ( ( rule__Chart__QuestionAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1184:1: ( rule__Chart__QuestionAssignment_2 )
            {
             before(grammarAccess.getChartAccess().getQuestionAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1185:1: ( rule__Chart__QuestionAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1185:2: rule__Chart__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Chart__QuestionAssignment_2_in_rule__Chart__Group__2__Impl2353);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1195:1: rule__Chart__Group__3 : rule__Chart__Group__3__Impl rule__Chart__Group__4 ;
    public final void rule__Chart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1199:1: ( rule__Chart__Group__3__Impl rule__Chart__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1200:2: rule__Chart__Group__3__Impl rule__Chart__Group__4
            {
            pushFollow(FOLLOW_rule__Chart__Group__3__Impl_in_rule__Chart__Group__32383);
            rule__Chart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__4_in_rule__Chart__Group__32386);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1207:1: rule__Chart__Group__3__Impl : ( '(' ) ;
    public final void rule__Chart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1211:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1212:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1212:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1213:1: '('
            {
             before(grammarAccess.getChartAccess().getLeftParenthesisKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Chart__Group__3__Impl2414); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1226:1: rule__Chart__Group__4 : rule__Chart__Group__4__Impl rule__Chart__Group__5 ;
    public final void rule__Chart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1230:1: ( rule__Chart__Group__4__Impl rule__Chart__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1231:2: rule__Chart__Group__4__Impl rule__Chart__Group__5
            {
            pushFollow(FOLLOW_rule__Chart__Group__4__Impl_in_rule__Chart__Group__42445);
            rule__Chart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__5_in_rule__Chart__Group__42448);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1238:1: rule__Chart__Group__4__Impl : ( ( rule__Chart__ChoicesAssignment_4 )* ) ;
    public final void rule__Chart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1242:1: ( ( ( rule__Chart__ChoicesAssignment_4 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1243:1: ( ( rule__Chart__ChoicesAssignment_4 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1243:1: ( ( rule__Chart__ChoicesAssignment_4 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1244:1: ( rule__Chart__ChoicesAssignment_4 )*
            {
             before(grammarAccess.getChartAccess().getChoicesAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1245:1: ( rule__Chart__ChoicesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1245:2: rule__Chart__ChoicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Chart__ChoicesAssignment_4_in_rule__Chart__Group__4__Impl2475);
            	    rule__Chart__ChoicesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1255:1: rule__Chart__Group__5 : rule__Chart__Group__5__Impl rule__Chart__Group__6 ;
    public final void rule__Chart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1259:1: ( rule__Chart__Group__5__Impl rule__Chart__Group__6 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1260:2: rule__Chart__Group__5__Impl rule__Chart__Group__6
            {
            pushFollow(FOLLOW_rule__Chart__Group__5__Impl_in_rule__Chart__Group__52506);
            rule__Chart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__6_in_rule__Chart__Group__52509);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1267:1: rule__Chart__Group__5__Impl : ( ')' ) ;
    public final void rule__Chart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1271:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1272:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1272:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1273:1: ')'
            {
             before(grammarAccess.getChartAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Chart__Group__5__Impl2537); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1286:1: rule__Chart__Group__6 : rule__Chart__Group__6__Impl rule__Chart__Group__7 ;
    public final void rule__Chart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1290:1: ( rule__Chart__Group__6__Impl rule__Chart__Group__7 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1291:2: rule__Chart__Group__6__Impl rule__Chart__Group__7
            {
            pushFollow(FOLLOW_rule__Chart__Group__6__Impl_in_rule__Chart__Group__62568);
            rule__Chart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__7_in_rule__Chart__Group__62571);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1298:1: rule__Chart__Group__6__Impl : ( 'x' ) ;
    public final void rule__Chart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1302:1: ( ( 'x' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1303:1: ( 'x' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1303:1: ( 'x' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1304:1: 'x'
            {
             before(grammarAccess.getChartAccess().getXKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Chart__Group__6__Impl2599); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1317:1: rule__Chart__Group__7 : rule__Chart__Group__7__Impl rule__Chart__Group__8 ;
    public final void rule__Chart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1321:1: ( rule__Chart__Group__7__Impl rule__Chart__Group__8 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1322:2: rule__Chart__Group__7__Impl rule__Chart__Group__8
            {
            pushFollow(FOLLOW_rule__Chart__Group__7__Impl_in_rule__Chart__Group__72630);
            rule__Chart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__8_in_rule__Chart__Group__72633);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1329:1: rule__Chart__Group__7__Impl : ( '(' ) ;
    public final void rule__Chart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1333:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1334:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1334:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1335:1: '('
            {
             before(grammarAccess.getChartAccess().getLeftParenthesisKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__Chart__Group__7__Impl2661); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1348:1: rule__Chart__Group__8 : rule__Chart__Group__8__Impl rule__Chart__Group__9 ;
    public final void rule__Chart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1352:1: ( rule__Chart__Group__8__Impl rule__Chart__Group__9 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1353:2: rule__Chart__Group__8__Impl rule__Chart__Group__9
            {
            pushFollow(FOLLOW_rule__Chart__Group__8__Impl_in_rule__Chart__Group__82692);
            rule__Chart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__9_in_rule__Chart__Group__82695);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1360:1: rule__Chart__Group__8__Impl : ( ( rule__Chart__GraduationsAssignment_8 )* ) ;
    public final void rule__Chart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1364:1: ( ( ( rule__Chart__GraduationsAssignment_8 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1365:1: ( ( rule__Chart__GraduationsAssignment_8 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1365:1: ( ( rule__Chart__GraduationsAssignment_8 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1366:1: ( rule__Chart__GraduationsAssignment_8 )*
            {
             before(grammarAccess.getChartAccess().getGraduationsAssignment_8()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1367:1: ( rule__Chart__GraduationsAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1367:2: rule__Chart__GraduationsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Chart__GraduationsAssignment_8_in_rule__Chart__Group__8__Impl2722);
            	    rule__Chart__GraduationsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1377:1: rule__Chart__Group__9 : rule__Chart__Group__9__Impl ;
    public final void rule__Chart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1381:1: ( rule__Chart__Group__9__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1382:2: rule__Chart__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Chart__Group__9__Impl_in_rule__Chart__Group__92753);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1388:1: rule__Chart__Group__9__Impl : ( ')' ) ;
    public final void rule__Chart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1392:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1393:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1393:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1394:1: ')'
            {
             before(grammarAccess.getChartAccess().getRightParenthesisKeyword_9()); 
            match(input,14,FOLLOW_14_in_rule__Chart__Group__9__Impl2781); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1427:1: rule__Graduation__Group__0 : rule__Graduation__Group__0__Impl rule__Graduation__Group__1 ;
    public final void rule__Graduation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1431:1: ( rule__Graduation__Group__0__Impl rule__Graduation__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1432:2: rule__Graduation__Group__0__Impl rule__Graduation__Group__1
            {
            pushFollow(FOLLOW_rule__Graduation__Group__0__Impl_in_rule__Graduation__Group__02832);
            rule__Graduation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Graduation__Group__1_in_rule__Graduation__Group__02835);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1439:1: rule__Graduation__Group__0__Impl : ( ( rule__Graduation__NameAssignment_0 )? ) ;
    public final void rule__Graduation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1443:1: ( ( ( rule__Graduation__NameAssignment_0 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1444:1: ( ( rule__Graduation__NameAssignment_0 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1444:1: ( ( rule__Graduation__NameAssignment_0 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1445:1: ( rule__Graduation__NameAssignment_0 )?
            {
             before(grammarAccess.getGraduationAccess().getNameAssignment_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1446:1: ( rule__Graduation__NameAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1446:2: rule__Graduation__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Graduation__NameAssignment_0_in_rule__Graduation__Group__0__Impl2862);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1456:1: rule__Graduation__Group__1 : rule__Graduation__Group__1__Impl ;
    public final void rule__Graduation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1460:1: ( rule__Graduation__Group__1__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1461:2: rule__Graduation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Graduation__Group__1__Impl_in_rule__Graduation__Group__12893);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1467:1: rule__Graduation__Group__1__Impl : ( ( rule__Graduation__StatementAssignment_1 ) ) ;
    public final void rule__Graduation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1471:1: ( ( ( rule__Graduation__StatementAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1472:1: ( ( rule__Graduation__StatementAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1472:1: ( ( rule__Graduation__StatementAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1473:1: ( rule__Graduation__StatementAssignment_1 )
            {
             before(grammarAccess.getGraduationAccess().getStatementAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1474:1: ( rule__Graduation__StatementAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1474:2: rule__Graduation__StatementAssignment_1
            {
            pushFollow(FOLLOW_rule__Graduation__StatementAssignment_1_in_rule__Graduation__Group__1__Impl2920);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1488:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1492:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1493:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
            {
            pushFollow(FOLLOW_rule__Rating__Group__0__Impl_in_rule__Rating__Group__02954);
            rule__Rating__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rating__Group__1_in_rule__Rating__Group__02957);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1500:1: rule__Rating__Group__0__Impl : ( 'rating' ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1504:1: ( ( 'rating' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1505:1: ( 'rating' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1505:1: ( 'rating' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1506:1: 'rating'
            {
             before(grammarAccess.getRatingAccess().getRatingKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Rating__Group__0__Impl2985); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1519:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1523:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1524:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
            {
            pushFollow(FOLLOW_rule__Rating__Group__1__Impl_in_rule__Rating__Group__13016);
            rule__Rating__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rating__Group__2_in_rule__Rating__Group__13019);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1531:1: rule__Rating__Group__1__Impl : ( ( rule__Rating__NameAssignment_1 ) ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1535:1: ( ( ( rule__Rating__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1536:1: ( ( rule__Rating__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1536:1: ( ( rule__Rating__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1537:1: ( rule__Rating__NameAssignment_1 )
            {
             before(grammarAccess.getRatingAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1538:1: ( rule__Rating__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1538:2: rule__Rating__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rating__NameAssignment_1_in_rule__Rating__Group__1__Impl3046);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1548:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1552:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1553:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FOLLOW_rule__Rating__Group__2__Impl_in_rule__Rating__Group__23076);
            rule__Rating__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rating__Group__3_in_rule__Rating__Group__23079);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1560:1: rule__Rating__Group__2__Impl : ( ( rule__Rating__QuestionAssignment_2 ) ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1564:1: ( ( ( rule__Rating__QuestionAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1565:1: ( ( rule__Rating__QuestionAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1565:1: ( ( rule__Rating__QuestionAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1566:1: ( rule__Rating__QuestionAssignment_2 )
            {
             before(grammarAccess.getRatingAccess().getQuestionAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1567:1: ( rule__Rating__QuestionAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1567:2: rule__Rating__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Rating__QuestionAssignment_2_in_rule__Rating__Group__2__Impl3106);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1577:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1581:1: ( rule__Rating__Group__3__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1582:2: rule__Rating__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rating__Group__3__Impl_in_rule__Rating__Group__33136);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1588:1: rule__Rating__Group__3__Impl : ( ( rule__Rating__RatingQuantityAssignment_3 ) ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1592:1: ( ( ( rule__Rating__RatingQuantityAssignment_3 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1593:1: ( ( rule__Rating__RatingQuantityAssignment_3 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1593:1: ( ( rule__Rating__RatingQuantityAssignment_3 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1594:1: ( rule__Rating__RatingQuantityAssignment_3 )
            {
             before(grammarAccess.getRatingAccess().getRatingQuantityAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1595:1: ( rule__Rating__RatingQuantityAssignment_3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1595:2: rule__Rating__RatingQuantityAssignment_3
            {
            pushFollow(FOLLOW_rule__Rating__RatingQuantityAssignment_3_in_rule__Rating__Group__3__Impl3163);
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


    // $ANTLR start "rule__Calendar__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1613:1: rule__Calendar__Group__0 : rule__Calendar__Group__0__Impl rule__Calendar__Group__1 ;
    public final void rule__Calendar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1617:1: ( rule__Calendar__Group__0__Impl rule__Calendar__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1618:2: rule__Calendar__Group__0__Impl rule__Calendar__Group__1
            {
            pushFollow(FOLLOW_rule__Calendar__Group__0__Impl_in_rule__Calendar__Group__03201);
            rule__Calendar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calendar__Group__1_in_rule__Calendar__Group__03204);
            rule__Calendar__Group__1();

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
    // $ANTLR end "rule__Calendar__Group__0"


    // $ANTLR start "rule__Calendar__Group__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1625:1: rule__Calendar__Group__0__Impl : ( 'calendar' ) ;
    public final void rule__Calendar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1629:1: ( ( 'calendar' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1630:1: ( 'calendar' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1630:1: ( 'calendar' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1631:1: 'calendar'
            {
             before(grammarAccess.getCalendarAccess().getCalendarKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Calendar__Group__0__Impl3232); 
             after(grammarAccess.getCalendarAccess().getCalendarKeyword_0()); 

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
    // $ANTLR end "rule__Calendar__Group__0__Impl"


    // $ANTLR start "rule__Calendar__Group__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1644:1: rule__Calendar__Group__1 : rule__Calendar__Group__1__Impl rule__Calendar__Group__2 ;
    public final void rule__Calendar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1648:1: ( rule__Calendar__Group__1__Impl rule__Calendar__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1649:2: rule__Calendar__Group__1__Impl rule__Calendar__Group__2
            {
            pushFollow(FOLLOW_rule__Calendar__Group__1__Impl_in_rule__Calendar__Group__13263);
            rule__Calendar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calendar__Group__2_in_rule__Calendar__Group__13266);
            rule__Calendar__Group__2();

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
    // $ANTLR end "rule__Calendar__Group__1"


    // $ANTLR start "rule__Calendar__Group__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1656:1: rule__Calendar__Group__1__Impl : ( ( rule__Calendar__NameAssignment_1 ) ) ;
    public final void rule__Calendar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1660:1: ( ( ( rule__Calendar__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1661:1: ( ( rule__Calendar__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1661:1: ( ( rule__Calendar__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1662:1: ( rule__Calendar__NameAssignment_1 )
            {
             before(grammarAccess.getCalendarAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1663:1: ( rule__Calendar__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1663:2: rule__Calendar__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Calendar__NameAssignment_1_in_rule__Calendar__Group__1__Impl3293);
            rule__Calendar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCalendarAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Calendar__Group__1__Impl"


    // $ANTLR start "rule__Calendar__Group__2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1673:1: rule__Calendar__Group__2 : rule__Calendar__Group__2__Impl ;
    public final void rule__Calendar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1677:1: ( rule__Calendar__Group__2__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1678:2: rule__Calendar__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Calendar__Group__2__Impl_in_rule__Calendar__Group__23323);
            rule__Calendar__Group__2__Impl();

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
    // $ANTLR end "rule__Calendar__Group__2"


    // $ANTLR start "rule__Calendar__Group__2__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1684:1: rule__Calendar__Group__2__Impl : ( ( rule__Calendar__QuestionAssignment_2 ) ) ;
    public final void rule__Calendar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1688:1: ( ( ( rule__Calendar__QuestionAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1689:1: ( ( rule__Calendar__QuestionAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1689:1: ( ( rule__Calendar__QuestionAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1690:1: ( rule__Calendar__QuestionAssignment_2 )
            {
             before(grammarAccess.getCalendarAccess().getQuestionAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1691:1: ( rule__Calendar__QuestionAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1691:2: rule__Calendar__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Calendar__QuestionAssignment_2_in_rule__Calendar__Group__2__Impl3350);
            rule__Calendar__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCalendarAccess().getQuestionAssignment_2()); 

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
    // $ANTLR end "rule__Calendar__Group__2__Impl"


    // $ANTLR start "rule__Survey__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1708:1: rule__Survey__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Survey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1712:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1713:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1713:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1714:1: RULE_ID
            {
             before(grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_13391); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1723:1: rule__Survey__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Survey__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1727:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1728:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1728:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1729:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_23422); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1738:1: rule__Survey__GreetingAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Survey__GreetingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1742:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1743:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1743:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1744:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getGreetingSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__GreetingAssignment_33453); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1753:1: rule__Survey__DurationAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Survey__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1757:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1758:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1758:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1759:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getDurationSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__DurationAssignment_43484); 
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


    // $ANTLR start "rule__Survey__PagesAssignment_5"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1768:1: rule__Survey__PagesAssignment_5 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1772:1: ( ( rulePage ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1773:1: ( rulePage )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1773:1: ( rulePage )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1774:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePage_in_rule__Survey__PagesAssignment_53515);
            rulePage();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Survey__PagesAssignment_5"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1783:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1787:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1788:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1788:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1789:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13546); 
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


    // $ANTLR start "rule__Page__QuestionsAssignment_3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1798:1: rule__Page__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1802:1: ( ( ruleQuestion ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1803:1: ( ruleQuestion )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1803:1: ( ruleQuestion )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1804:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_33577);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Page__QuestionsAssignment_3"


    // $ANTLR start "rule__Freetext__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1813:1: rule__Freetext__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Freetext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1817:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1818:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1818:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1819:1: RULE_ID
            {
             before(grammarAccess.getFreetextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Freetext__NameAssignment_13608); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1828:1: rule__Freetext__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Freetext__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1832:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1833:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1833:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1834:1: RULE_STRING
            {
             before(grammarAccess.getFreetextAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Freetext__QuestionAssignment_23639); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1843:1: rule__Selection__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1847:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1848:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1848:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1849:1: RULE_ID
            {
             before(grammarAccess.getSelectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_13670); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1858:1: rule__Selection__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Selection__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1862:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1863:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1863:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1864:1: RULE_STRING
            {
             before(grammarAccess.getSelectionAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Selection__QuestionAssignment_23701); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1873:1: rule__Selection__ChoicesAssignment_4 : ( ruleChoice ) ;
    public final void rule__Selection__ChoicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1877:1: ( ( ruleChoice ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1878:1: ( ruleChoice )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1878:1: ( ruleChoice )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1879:1: ruleChoice
            {
             before(grammarAccess.getSelectionAccess().getChoicesChoiceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleChoice_in_rule__Selection__ChoicesAssignment_43732);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1888:1: rule__Choice__FreetextAssignment_0 : ( ( 'freetext' ) ) ;
    public final void rule__Choice__FreetextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1892:1: ( ( ( 'freetext' ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1893:1: ( ( 'freetext' ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1893:1: ( ( 'freetext' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1894:1: ( 'freetext' )
            {
             before(grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1895:1: ( 'freetext' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1896:1: 'freetext'
            {
             before(grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0()); 
            match(input,15,FOLLOW_15_in_rule__Choice__FreetextAssignment_03768); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1911:1: rule__Choice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1915:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1916:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1916:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1917:1: RULE_ID
            {
             before(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_13807); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1926:1: rule__Choice__BulletPointAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Choice__BulletPointAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1930:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1931:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1931:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1932:1: RULE_STRING
            {
             before(grammarAccess.getChoiceAccess().getBulletPointSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Choice__BulletPointAssignment_23838); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1941:1: rule__Chart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1945:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1946:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1946:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1947:1: RULE_ID
            {
             before(grammarAccess.getChartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chart__NameAssignment_13869); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1956:1: rule__Chart__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Chart__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1960:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1961:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1961:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1962:1: RULE_STRING
            {
             before(grammarAccess.getChartAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Chart__QuestionAssignment_23900); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1971:1: rule__Chart__ChoicesAssignment_4 : ( ruleChoice ) ;
    public final void rule__Chart__ChoicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1975:1: ( ( ruleChoice ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1976:1: ( ruleChoice )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1976:1: ( ruleChoice )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1977:1: ruleChoice
            {
             before(grammarAccess.getChartAccess().getChoicesChoiceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleChoice_in_rule__Chart__ChoicesAssignment_43931);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1986:1: rule__Chart__GraduationsAssignment_8 : ( ruleGraduation ) ;
    public final void rule__Chart__GraduationsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1990:1: ( ( ruleGraduation ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1991:1: ( ruleGraduation )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1991:1: ( ruleGraduation )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1992:1: ruleGraduation
            {
             before(grammarAccess.getChartAccess().getGraduationsGraduationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleGraduation_in_rule__Chart__GraduationsAssignment_83962);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2001:1: rule__Graduation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Graduation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2005:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2006:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2006:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2007:1: RULE_ID
            {
             before(grammarAccess.getGraduationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Graduation__NameAssignment_03993); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2016:1: rule__Graduation__StatementAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Graduation__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2020:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2021:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2021:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2022:1: RULE_STRING
            {
             before(grammarAccess.getGraduationAccess().getStatementSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Graduation__StatementAssignment_14024); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2031:1: rule__Rating__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rating__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2035:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2036:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2036:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2037:1: RULE_ID
            {
             before(grammarAccess.getRatingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rating__NameAssignment_14055); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2046:1: rule__Rating__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Rating__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2050:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2051:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2051:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2052:1: RULE_STRING
            {
             before(grammarAccess.getRatingAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rating__QuestionAssignment_24086); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2061:1: rule__Rating__RatingQuantityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Rating__RatingQuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2065:1: ( ( RULE_INT ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2066:1: ( RULE_INT )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2066:1: ( RULE_INT )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2067:1: RULE_INT
            {
             before(grammarAccess.getRatingAccess().getRatingQuantityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Rating__RatingQuantityAssignment_34117); 
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


    // $ANTLR start "rule__Calendar__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2076:1: rule__Calendar__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Calendar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2080:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2081:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2081:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2082:1: RULE_ID
            {
             before(grammarAccess.getCalendarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calendar__NameAssignment_14148); 
             after(grammarAccess.getCalendarAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Calendar__NameAssignment_1"


    // $ANTLR start "rule__Calendar__QuestionAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2091:1: rule__Calendar__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Calendar__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2095:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2096:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2096:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2097:1: RULE_STRING
            {
             before(grammarAccess.getCalendarAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Calendar__QuestionAssignment_24179); 
             after(grammarAccess.getCalendarAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Calendar__QuestionAssignment_2"

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
    public static final BitSet FOLLOW_ruleCalendar_in_entryRuleCalendar601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalendar608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calendar__Group__0_in_ruleCalendar634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_rule__Question__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_rule__Question__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_rule__Question__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRating_in_rule__Question__Alternatives721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalendar_in_rule__Question__Alternatives738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2890 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3950 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__GreetingAssignment_3_in_rule__Survey__Group__3__Impl980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41011 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__41014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__DurationAssignment_4_in_rule__Survey__Group__4__Impl1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__PagesAssignment_5_in_rule__Survey__Group__5__Impl1099 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__01142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__01145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Page__Group__0__Impl1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__11204 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__11207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21264 = new BitSet(new long[]{0x00000000001BC000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Page__Group__2__Impl1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31326 = new BitSet(new long[]{0x00000000001BC000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl1356 = new BitSet(new long[]{0x00000000001B8002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Page__Group__4__Impl1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__0__Impl_in_rule__Freetext__Group__01456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Freetext__Group__1_in_rule__Freetext__Group__01459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Freetext__Group__0__Impl1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__1__Impl_in_rule__Freetext__Group__11518 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Freetext__Group__2_in_rule__Freetext__Group__11521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__NameAssignment_1_in_rule__Freetext__Group__1__Impl1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__2__Impl_in_rule__Freetext__Group__21578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__QuestionAssignment_2_in_rule__Freetext__Group__2__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__01641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__01644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Selection__Group__0__Impl1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__11703 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__11706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__21763 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__21766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__QuestionAssignment_2_in_rule__Selection__Group__2__Impl1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__31823 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__31826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Selection__Group__3__Impl1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__41885 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__41888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__ChoicesAssignment_4_in_rule__Selection__Group__4__Impl1915 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__51946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Selection__Group__5__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__02017 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__02020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__FreetextAssignment_0_in_rule__Choice__Group__0__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__12078 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__12081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__NameAssignment_1_in_rule__Choice__Group__1__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__22138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__BulletPointAssignment_2_in_rule__Choice__Group__2__Impl2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__0__Impl_in_rule__Chart__Group__02201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Chart__Group__1_in_rule__Chart__Group__02204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Chart__Group__0__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__1__Impl_in_rule__Chart__Group__12263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Chart__Group__2_in_rule__Chart__Group__12266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__NameAssignment_1_in_rule__Chart__Group__1__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__2__Impl_in_rule__Chart__Group__22323 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Chart__Group__3_in_rule__Chart__Group__22326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__QuestionAssignment_2_in_rule__Chart__Group__2__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__3__Impl_in_rule__Chart__Group__32383 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Chart__Group__4_in_rule__Chart__Group__32386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Chart__Group__3__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__4__Impl_in_rule__Chart__Group__42445 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Chart__Group__5_in_rule__Chart__Group__42448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__ChoicesAssignment_4_in_rule__Chart__Group__4__Impl2475 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_rule__Chart__Group__5__Impl_in_rule__Chart__Group__52506 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Chart__Group__6_in_rule__Chart__Group__52509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Chart__Group__5__Impl2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__6__Impl_in_rule__Chart__Group__62568 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Chart__Group__7_in_rule__Chart__Group__62571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Chart__Group__6__Impl2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__7__Impl_in_rule__Chart__Group__72630 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Chart__Group__8_in_rule__Chart__Group__72633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Chart__Group__7__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__8__Impl_in_rule__Chart__Group__82692 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Chart__Group__9_in_rule__Chart__Group__82695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__GraduationsAssignment_8_in_rule__Chart__Group__8__Impl2722 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Chart__Group__9__Impl_in_rule__Chart__Group__92753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Chart__Group__9__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__Group__0__Impl_in_rule__Graduation__Group__02832 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Graduation__Group__1_in_rule__Graduation__Group__02835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__NameAssignment_0_in_rule__Graduation__Group__0__Impl2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__Group__1__Impl_in_rule__Graduation__Group__12893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__StatementAssignment_1_in_rule__Graduation__Group__1__Impl2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__0__Impl_in_rule__Rating__Group__02954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rating__Group__1_in_rule__Rating__Group__02957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Rating__Group__0__Impl2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__1__Impl_in_rule__Rating__Group__13016 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rating__Group__2_in_rule__Rating__Group__13019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__NameAssignment_1_in_rule__Rating__Group__1__Impl3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__2__Impl_in_rule__Rating__Group__23076 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Rating__Group__3_in_rule__Rating__Group__23079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__QuestionAssignment_2_in_rule__Rating__Group__2__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__3__Impl_in_rule__Rating__Group__33136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__RatingQuantityAssignment_3_in_rule__Rating__Group__3__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calendar__Group__0__Impl_in_rule__Calendar__Group__03201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Calendar__Group__1_in_rule__Calendar__Group__03204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Calendar__Group__0__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calendar__Group__1__Impl_in_rule__Calendar__Group__13263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calendar__Group__2_in_rule__Calendar__Group__13266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calendar__NameAssignment_1_in_rule__Calendar__Group__1__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calendar__Group__2__Impl_in_rule__Calendar__Group__23323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calendar__QuestionAssignment_2_in_rule__Calendar__Group__2__Impl3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_13391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_23422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__GreetingAssignment_33453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__DurationAssignment_43484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_53515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_33577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Freetext__NameAssignment_13608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Freetext__QuestionAssignment_23639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_13670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Selection__QuestionAssignment_23701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__Selection__ChoicesAssignment_43732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Choice__FreetextAssignment_03768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_13807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Choice__BulletPointAssignment_23838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chart__NameAssignment_13869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Chart__QuestionAssignment_23900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__Chart__ChoicesAssignment_43931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraduation_in_rule__Chart__GraduationsAssignment_83962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Graduation__NameAssignment_03993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Graduation__StatementAssignment_14024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rating__NameAssignment_14055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rating__QuestionAssignment_24086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Rating__RatingQuantityAssignment_34117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calendar__NameAssignment_14148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Calendar__QuestionAssignment_24179 = new BitSet(new long[]{0x0000000000000002L});

}