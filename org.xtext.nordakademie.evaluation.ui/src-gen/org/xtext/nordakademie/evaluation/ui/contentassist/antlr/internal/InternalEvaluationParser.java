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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'page'", "'('", "')'", "'freetext'", "'rating'", "'select'", "'chart'", "'x'", "'forwarding to ->'"
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


    // $ANTLR start "entryRuleRating"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:172:1: entryRuleRating : ruleRating EOF ;
    public final void entryRuleRating() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:173:1: ( ruleRating EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:174:1: ruleRating EOF
            {
             before(grammarAccess.getRatingRule()); 
            pushFollow(FOLLOW_ruleRating_in_entryRuleRating301);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRatingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRating308); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:181:1: ruleRating : ( ( rule__Rating__Group__0 ) ) ;
    public final void ruleRating() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:185:2: ( ( ( rule__Rating__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:186:1: ( ( rule__Rating__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:186:1: ( ( rule__Rating__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:187:1: ( rule__Rating__Group__0 )
            {
             before(grammarAccess.getRatingAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:188:1: ( rule__Rating__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:188:2: rule__Rating__Group__0
            {
            pushFollow(FOLLOW_rule__Rating__Group__0_in_ruleRating334);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:209:1: ruleChoice : ( ( rule__Choice__Alternatives ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:213:2: ( ( ( rule__Choice__Alternatives ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:214:1: ( ( rule__Choice__Alternatives ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:214:1: ( ( rule__Choice__Alternatives ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:215:1: ( rule__Choice__Alternatives )
            {
             before(grammarAccess.getChoiceAccess().getAlternatives()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:216:1: ( rule__Choice__Alternatives )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:216:2: rule__Choice__Alternatives
            {
            pushFollow(FOLLOW_rule__Choice__Alternatives_in_ruleChoice394);
            rule__Choice__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleSelection"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:228:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:229:1: ( ruleSelection EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:230:1: ruleSelection EOF
            {
             before(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_ruleSelection_in_entryRuleSelection421);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelection428); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:237:1: ruleSelection : ( ( rule__Selection__Group__0 ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:241:2: ( ( ( rule__Selection__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:242:1: ( ( rule__Selection__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:242:1: ( ( rule__Selection__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:243:1: ( rule__Selection__Group__0 )
            {
             before(grammarAccess.getSelectionAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:244:1: ( rule__Selection__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:244:2: rule__Selection__Group__0
            {
            pushFollow(FOLLOW_rule__Selection__Group__0_in_ruleSelection454);
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


    // $ANTLR start "entryRuleChart"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:256:1: entryRuleChart : ruleChart EOF ;
    public final void entryRuleChart() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:257:1: ( ruleChart EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:258:1: ruleChart EOF
            {
             before(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_ruleChart_in_entryRuleChart481);
            ruleChart();

            state._fsp--;

             after(grammarAccess.getChartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChart488); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:265:1: ruleChart : ( ( rule__Chart__Group__0 ) ) ;
    public final void ruleChart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:269:2: ( ( ( rule__Chart__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:270:1: ( ( rule__Chart__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:270:1: ( ( rule__Chart__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:271:1: ( rule__Chart__Group__0 )
            {
             before(grammarAccess.getChartAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:272:1: ( rule__Chart__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:272:2: rule__Chart__Group__0
            {
            pushFollow(FOLLOW_rule__Chart__Group__0_in_ruleChart514);
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


    // $ANTLR start "entryRuleBullet"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:284:1: entryRuleBullet : ruleBullet EOF ;
    public final void entryRuleBullet() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:285:1: ( ruleBullet EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:286:1: ruleBullet EOF
            {
             before(grammarAccess.getBulletRule()); 
            pushFollow(FOLLOW_ruleBullet_in_entryRuleBullet541);
            ruleBullet();

            state._fsp--;

             after(grammarAccess.getBulletRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBullet548); 

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
    // $ANTLR end "entryRuleBullet"


    // $ANTLR start "ruleBullet"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:293:1: ruleBullet : ( ( rule__Bullet__Group__0 ) ) ;
    public final void ruleBullet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:297:2: ( ( ( rule__Bullet__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:298:1: ( ( rule__Bullet__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:298:1: ( ( rule__Bullet__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:299:1: ( rule__Bullet__Group__0 )
            {
             before(grammarAccess.getBulletAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:300:1: ( rule__Bullet__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:300:2: rule__Bullet__Group__0
            {
            pushFollow(FOLLOW_rule__Bullet__Group__0_in_ruleBullet574);
            rule__Bullet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBulletAccess().getGroup()); 

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
    // $ANTLR end "ruleBullet"


    // $ANTLR start "entryRuleGraduation"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:312:1: entryRuleGraduation : ruleGraduation EOF ;
    public final void entryRuleGraduation() throws RecognitionException {
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:313:1: ( ruleGraduation EOF )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:314:1: ruleGraduation EOF
            {
             before(grammarAccess.getGraduationRule()); 
            pushFollow(FOLLOW_ruleGraduation_in_entryRuleGraduation601);
            ruleGraduation();

            state._fsp--;

             after(grammarAccess.getGraduationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraduation608); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:321:1: ruleGraduation : ( ( rule__Graduation__Group__0 ) ) ;
    public final void ruleGraduation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:325:2: ( ( ( rule__Graduation__Group__0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:326:1: ( ( rule__Graduation__Group__0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:326:1: ( ( rule__Graduation__Group__0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:327:1: ( rule__Graduation__Group__0 )
            {
             before(grammarAccess.getGraduationAccess().getGroup()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:328:1: ( rule__Graduation__Group__0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:328:2: rule__Graduation__Group__0
            {
            pushFollow(FOLLOW_rule__Graduation__Group__0_in_ruleGraduation634);
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


    // $ANTLR start "rule__Question__Alternatives"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:340:1: rule__Question__Alternatives : ( ( ruleFreetext ) | ( ruleRating ) | ( ruleChoice ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:344:1: ( ( ruleFreetext ) | ( ruleRating ) | ( ruleChoice ) )
            int alt1=3;
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
            case 18:
                {
                alt1=3;
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
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:351:6: ( ruleRating )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:351:6: ( ruleRating )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:352:1: ruleRating
                    {
                     before(grammarAccess.getQuestionAccess().getRatingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRating_in_rule__Question__Alternatives687);
                    ruleRating();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getRatingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:357:6: ( ruleChoice )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:357:6: ( ruleChoice )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:358:1: ruleChoice
                    {
                     before(grammarAccess.getQuestionAccess().getChoiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleChoice_in_rule__Question__Alternatives704);
                    ruleChoice();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getChoiceParserRuleCall_2()); 

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


    // $ANTLR start "rule__Choice__Alternatives"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:368:1: rule__Choice__Alternatives : ( ( ruleSelection ) | ( ruleChart ) );
    public final void rule__Choice__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:372:1: ( ( ruleSelection ) | ( ruleChart ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:373:1: ( ruleSelection )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:373:1: ( ruleSelection )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:374:1: ruleSelection
                    {
                     before(grammarAccess.getChoiceAccess().getSelectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSelection_in_rule__Choice__Alternatives736);
                    ruleSelection();

                    state._fsp--;

                     after(grammarAccess.getChoiceAccess().getSelectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:379:6: ( ruleChart )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:379:6: ( ruleChart )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:380:1: ruleChart
                    {
                     before(grammarAccess.getChoiceAccess().getChartParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChart_in_rule__Choice__Alternatives753);
                    ruleChart();

                    state._fsp--;

                     after(grammarAccess.getChoiceAccess().getChartParserRuleCall_1()); 

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
    // $ANTLR end "rule__Choice__Alternatives"


    // $ANTLR start "rule__Survey__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:392:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:396:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:397:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0783);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0786);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:404:1: rule__Survey__Group__0__Impl : ( 'survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:408:1: ( ( 'survey' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:409:1: ( 'survey' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:409:1: ( 'survey' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:410:1: 'survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Survey__Group__0__Impl814); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:423:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:427:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:428:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1845);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1848);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:435:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__NameAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:439:1: ( ( ( rule__Survey__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:440:1: ( ( rule__Survey__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:440:1: ( ( rule__Survey__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:441:1: ( rule__Survey__NameAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:442:1: ( rule__Survey__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:442:2: rule__Survey__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl875);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:452:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:456:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:457:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2905);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2908);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:464:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__TitleAssignment_2 ) ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:468:1: ( ( ( rule__Survey__TitleAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:469:1: ( ( rule__Survey__TitleAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:469:1: ( ( rule__Survey__TitleAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:470:1: ( rule__Survey__TitleAssignment_2 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:471:1: ( rule__Survey__TitleAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:471:2: rule__Survey__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl935);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:481:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:485:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:486:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3965);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3968);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:493:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__GreetingAssignment_3 )? ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:497:1: ( ( ( rule__Survey__GreetingAssignment_3 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:498:1: ( ( rule__Survey__GreetingAssignment_3 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:498:1: ( ( rule__Survey__GreetingAssignment_3 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:499:1: ( rule__Survey__GreetingAssignment_3 )?
            {
             before(grammarAccess.getSurveyAccess().getGreetingAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:500:1: ( rule__Survey__GreetingAssignment_3 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:500:2: rule__Survey__GreetingAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Survey__GreetingAssignment_3_in_rule__Survey__Group__3__Impl995);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:510:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:514:1: ( rule__Survey__Group__4__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:515:2: rule__Survey__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41026);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:521:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__PagesAssignment_4 )* ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:525:1: ( ( ( rule__Survey__PagesAssignment_4 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:526:1: ( ( rule__Survey__PagesAssignment_4 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:526:1: ( ( rule__Survey__PagesAssignment_4 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:527:1: ( rule__Survey__PagesAssignment_4 )*
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:528:1: ( rule__Survey__PagesAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:528:2: rule__Survey__PagesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Survey__PagesAssignment_4_in_rule__Survey__Group__4__Impl1053);
            	    rule__Survey__PagesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:548:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:552:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:553:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__01094);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__01097);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:560:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:564:1: ( ( 'page' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:565:1: ( 'page' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:565:1: ( 'page' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:566:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Page__Group__0__Impl1125); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:579:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:583:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:584:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__11156);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__11159);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:591:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:595:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:596:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:596:1: ( ( rule__Page__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:597:1: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:598:1: ( rule__Page__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:598:2: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl1186);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:608:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:612:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:613:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21216);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21219);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:620:1: rule__Page__Group__2__Impl : ( '(' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:624:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:625:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:625:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:626:1: '('
            {
             before(grammarAccess.getPageAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Page__Group__2__Impl1247); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:639:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:643:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:644:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31278);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31281);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:651:1: rule__Page__Group__3__Impl : ( ( rule__Page__QuestionAssignment_3 ) ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:655:1: ( ( ( rule__Page__QuestionAssignment_3 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:656:1: ( ( rule__Page__QuestionAssignment_3 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:656:1: ( ( rule__Page__QuestionAssignment_3 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:657:1: ( rule__Page__QuestionAssignment_3 )
            {
             before(grammarAccess.getPageAccess().getQuestionAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:658:1: ( rule__Page__QuestionAssignment_3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:658:2: rule__Page__QuestionAssignment_3
            {
            pushFollow(FOLLOW_rule__Page__QuestionAssignment_3_in_rule__Page__Group__3__Impl1308);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:668:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:672:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:673:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41338);
            rule__Page__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41341);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:680:1: rule__Page__Group__4__Impl : ( ( rule__Page__Group_4__0 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:684:1: ( ( ( rule__Page__Group_4__0 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:685:1: ( ( rule__Page__Group_4__0 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:685:1: ( ( rule__Page__Group_4__0 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:686:1: ( rule__Page__Group_4__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:687:1: ( rule__Page__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:687:2: rule__Page__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_4__0_in_rule__Page__Group__4__Impl1368);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:697:1: rule__Page__Group__5 : rule__Page__Group__5__Impl ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:701:1: ( rule__Page__Group__5__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:702:2: rule__Page__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51399);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:708:1: rule__Page__Group__5__Impl : ( ')' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:712:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:713:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:713:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:714:1: ')'
            {
             before(grammarAccess.getPageAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Page__Group__5__Impl1427); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:739:1: rule__Page__Group_4__0 : rule__Page__Group_4__0__Impl rule__Page__Group_4__1 ;
    public final void rule__Page__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:743:1: ( rule__Page__Group_4__0__Impl rule__Page__Group_4__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:744:2: rule__Page__Group_4__0__Impl rule__Page__Group_4__1
            {
            pushFollow(FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__01470);
            rule__Page__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__01473);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:751:1: rule__Page__Group_4__0__Impl : ( ( rule__Page__ForwardingAssignment_4_0 ) ) ;
    public final void rule__Page__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:755:1: ( ( ( rule__Page__ForwardingAssignment_4_0 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:756:1: ( ( rule__Page__ForwardingAssignment_4_0 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:756:1: ( ( rule__Page__ForwardingAssignment_4_0 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:757:1: ( rule__Page__ForwardingAssignment_4_0 )
            {
             before(grammarAccess.getPageAccess().getForwardingAssignment_4_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:758:1: ( rule__Page__ForwardingAssignment_4_0 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:758:2: rule__Page__ForwardingAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Page__ForwardingAssignment_4_0_in_rule__Page__Group_4__0__Impl1500);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:768:1: rule__Page__Group_4__1 : rule__Page__Group_4__1__Impl ;
    public final void rule__Page__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:772:1: ( rule__Page__Group_4__1__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:773:2: rule__Page__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__11530);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:779:1: rule__Page__Group_4__1__Impl : ( ( rule__Page__FollowingPageAssignment_4_1 ) ) ;
    public final void rule__Page__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:783:1: ( ( ( rule__Page__FollowingPageAssignment_4_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:784:1: ( ( rule__Page__FollowingPageAssignment_4_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:784:1: ( ( rule__Page__FollowingPageAssignment_4_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:785:1: ( rule__Page__FollowingPageAssignment_4_1 )
            {
             before(grammarAccess.getPageAccess().getFollowingPageAssignment_4_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:786:1: ( rule__Page__FollowingPageAssignment_4_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:786:2: rule__Page__FollowingPageAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Page__FollowingPageAssignment_4_1_in_rule__Page__Group_4__1__Impl1557);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:800:1: rule__Freetext__Group__0 : rule__Freetext__Group__0__Impl rule__Freetext__Group__1 ;
    public final void rule__Freetext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:804:1: ( rule__Freetext__Group__0__Impl rule__Freetext__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:805:2: rule__Freetext__Group__0__Impl rule__Freetext__Group__1
            {
            pushFollow(FOLLOW_rule__Freetext__Group__0__Impl_in_rule__Freetext__Group__01591);
            rule__Freetext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Freetext__Group__1_in_rule__Freetext__Group__01594);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:812:1: rule__Freetext__Group__0__Impl : ( 'freetext' ) ;
    public final void rule__Freetext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:816:1: ( ( 'freetext' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:817:1: ( 'freetext' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:817:1: ( 'freetext' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:818:1: 'freetext'
            {
             before(grammarAccess.getFreetextAccess().getFreetextKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Freetext__Group__0__Impl1622); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:831:1: rule__Freetext__Group__1 : rule__Freetext__Group__1__Impl rule__Freetext__Group__2 ;
    public final void rule__Freetext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:835:1: ( rule__Freetext__Group__1__Impl rule__Freetext__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:836:2: rule__Freetext__Group__1__Impl rule__Freetext__Group__2
            {
            pushFollow(FOLLOW_rule__Freetext__Group__1__Impl_in_rule__Freetext__Group__11653);
            rule__Freetext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Freetext__Group__2_in_rule__Freetext__Group__11656);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:843:1: rule__Freetext__Group__1__Impl : ( ( rule__Freetext__NameAssignment_1 ) ) ;
    public final void rule__Freetext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:847:1: ( ( ( rule__Freetext__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:848:1: ( ( rule__Freetext__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:848:1: ( ( rule__Freetext__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:849:1: ( rule__Freetext__NameAssignment_1 )
            {
             before(grammarAccess.getFreetextAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:850:1: ( rule__Freetext__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:850:2: rule__Freetext__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Freetext__NameAssignment_1_in_rule__Freetext__Group__1__Impl1683);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:860:1: rule__Freetext__Group__2 : rule__Freetext__Group__2__Impl rule__Freetext__Group__3 ;
    public final void rule__Freetext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:864:1: ( rule__Freetext__Group__2__Impl rule__Freetext__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:865:2: rule__Freetext__Group__2__Impl rule__Freetext__Group__3
            {
            pushFollow(FOLLOW_rule__Freetext__Group__2__Impl_in_rule__Freetext__Group__21713);
            rule__Freetext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Freetext__Group__3_in_rule__Freetext__Group__21716);
            rule__Freetext__Group__3();

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:872:1: rule__Freetext__Group__2__Impl : ( ( rule__Freetext__QuestionTextAssignment_2 ) ) ;
    public final void rule__Freetext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:876:1: ( ( ( rule__Freetext__QuestionTextAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:877:1: ( ( rule__Freetext__QuestionTextAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:877:1: ( ( rule__Freetext__QuestionTextAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:878:1: ( rule__Freetext__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getFreetextAccess().getQuestionTextAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:879:1: ( rule__Freetext__QuestionTextAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:879:2: rule__Freetext__QuestionTextAssignment_2
            {
            pushFollow(FOLLOW_rule__Freetext__QuestionTextAssignment_2_in_rule__Freetext__Group__2__Impl1743);
            rule__Freetext__QuestionTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFreetextAccess().getQuestionTextAssignment_2()); 

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


    // $ANTLR start "rule__Freetext__Group__3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:889:1: rule__Freetext__Group__3 : rule__Freetext__Group__3__Impl ;
    public final void rule__Freetext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:893:1: ( rule__Freetext__Group__3__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:894:2: rule__Freetext__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Freetext__Group__3__Impl_in_rule__Freetext__Group__31773);
            rule__Freetext__Group__3__Impl();

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
    // $ANTLR end "rule__Freetext__Group__3"


    // $ANTLR start "rule__Freetext__Group__3__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:900:1: rule__Freetext__Group__3__Impl : ( ( rule__Freetext__HelpTextAssignment_3 )? ) ;
    public final void rule__Freetext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:904:1: ( ( ( rule__Freetext__HelpTextAssignment_3 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:905:1: ( ( rule__Freetext__HelpTextAssignment_3 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:905:1: ( ( rule__Freetext__HelpTextAssignment_3 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:906:1: ( rule__Freetext__HelpTextAssignment_3 )?
            {
             before(grammarAccess.getFreetextAccess().getHelpTextAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:907:1: ( rule__Freetext__HelpTextAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:907:2: rule__Freetext__HelpTextAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Freetext__HelpTextAssignment_3_in_rule__Freetext__Group__3__Impl1800);
                    rule__Freetext__HelpTextAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFreetextAccess().getHelpTextAssignment_3()); 

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
    // $ANTLR end "rule__Freetext__Group__3__Impl"


    // $ANTLR start "rule__Rating__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:925:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:929:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:930:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
            {
            pushFollow(FOLLOW_rule__Rating__Group__0__Impl_in_rule__Rating__Group__01839);
            rule__Rating__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rating__Group__1_in_rule__Rating__Group__01842);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:937:1: rule__Rating__Group__0__Impl : ( 'rating' ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:941:1: ( ( 'rating' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:942:1: ( 'rating' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:942:1: ( 'rating' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:943:1: 'rating'
            {
             before(grammarAccess.getRatingAccess().getRatingKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Rating__Group__0__Impl1870); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:956:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:960:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:961:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
            {
            pushFollow(FOLLOW_rule__Rating__Group__1__Impl_in_rule__Rating__Group__11901);
            rule__Rating__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rating__Group__2_in_rule__Rating__Group__11904);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:968:1: rule__Rating__Group__1__Impl : ( ( rule__Rating__NameAssignment_1 ) ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:972:1: ( ( ( rule__Rating__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:973:1: ( ( rule__Rating__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:973:1: ( ( rule__Rating__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:974:1: ( rule__Rating__NameAssignment_1 )
            {
             before(grammarAccess.getRatingAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:975:1: ( rule__Rating__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:975:2: rule__Rating__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rating__NameAssignment_1_in_rule__Rating__Group__1__Impl1931);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:985:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:989:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:990:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FOLLOW_rule__Rating__Group__2__Impl_in_rule__Rating__Group__21961);
            rule__Rating__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rating__Group__3_in_rule__Rating__Group__21964);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:997:1: rule__Rating__Group__2__Impl : ( ( rule__Rating__QuestionTextAssignment_2 ) ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1001:1: ( ( ( rule__Rating__QuestionTextAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1002:1: ( ( rule__Rating__QuestionTextAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1002:1: ( ( rule__Rating__QuestionTextAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1003:1: ( rule__Rating__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getRatingAccess().getQuestionTextAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1004:1: ( rule__Rating__QuestionTextAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1004:2: rule__Rating__QuestionTextAssignment_2
            {
            pushFollow(FOLLOW_rule__Rating__QuestionTextAssignment_2_in_rule__Rating__Group__2__Impl1991);
            rule__Rating__QuestionTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getQuestionTextAssignment_2()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1014:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl rule__Rating__Group__4 ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1018:1: ( rule__Rating__Group__3__Impl rule__Rating__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1019:2: rule__Rating__Group__3__Impl rule__Rating__Group__4
            {
            pushFollow(FOLLOW_rule__Rating__Group__3__Impl_in_rule__Rating__Group__32021);
            rule__Rating__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rating__Group__4_in_rule__Rating__Group__32024);
            rule__Rating__Group__4();

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1026:1: rule__Rating__Group__3__Impl : ( ( rule__Rating__HelpTextAssignment_3 )? ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1030:1: ( ( ( rule__Rating__HelpTextAssignment_3 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1031:1: ( ( rule__Rating__HelpTextAssignment_3 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1031:1: ( ( rule__Rating__HelpTextAssignment_3 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1032:1: ( rule__Rating__HelpTextAssignment_3 )?
            {
             before(grammarAccess.getRatingAccess().getHelpTextAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1033:1: ( rule__Rating__HelpTextAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1033:2: rule__Rating__HelpTextAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Rating__HelpTextAssignment_3_in_rule__Rating__Group__3__Impl2051);
                    rule__Rating__HelpTextAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRatingAccess().getHelpTextAssignment_3()); 

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


    // $ANTLR start "rule__Rating__Group__4"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1043:1: rule__Rating__Group__4 : rule__Rating__Group__4__Impl ;
    public final void rule__Rating__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1047:1: ( rule__Rating__Group__4__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1048:2: rule__Rating__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Rating__Group__4__Impl_in_rule__Rating__Group__42082);
            rule__Rating__Group__4__Impl();

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
    // $ANTLR end "rule__Rating__Group__4"


    // $ANTLR start "rule__Rating__Group__4__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1054:1: rule__Rating__Group__4__Impl : ( ( rule__Rating__RatingQuantityAssignment_4 ) ) ;
    public final void rule__Rating__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1058:1: ( ( ( rule__Rating__RatingQuantityAssignment_4 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1059:1: ( ( rule__Rating__RatingQuantityAssignment_4 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1059:1: ( ( rule__Rating__RatingQuantityAssignment_4 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1060:1: ( rule__Rating__RatingQuantityAssignment_4 )
            {
             before(grammarAccess.getRatingAccess().getRatingQuantityAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1061:1: ( rule__Rating__RatingQuantityAssignment_4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1061:2: rule__Rating__RatingQuantityAssignment_4
            {
            pushFollow(FOLLOW_rule__Rating__RatingQuantityAssignment_4_in_rule__Rating__Group__4__Impl2109);
            rule__Rating__RatingQuantityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getRatingQuantityAssignment_4()); 

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
    // $ANTLR end "rule__Rating__Group__4__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1081:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1085:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1086:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__02149);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__02152);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1093:1: rule__Selection__Group__0__Impl : ( 'select' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1097:1: ( ( 'select' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1098:1: ( 'select' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1098:1: ( 'select' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1099:1: 'select'
            {
             before(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Selection__Group__0__Impl2180); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1112:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1116:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1117:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__12211);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__12214);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1124:1: rule__Selection__Group__1__Impl : ( ( rule__Selection__NameAssignment_1 ) ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1128:1: ( ( ( rule__Selection__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1129:1: ( ( rule__Selection__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1129:1: ( ( rule__Selection__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1130:1: ( rule__Selection__NameAssignment_1 )
            {
             before(grammarAccess.getSelectionAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1131:1: ( rule__Selection__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1131:2: rule__Selection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl2241);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1141:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1145:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1146:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__22271);
            rule__Selection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__22274);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1153:1: rule__Selection__Group__2__Impl : ( ( rule__Selection__QuestionTextAssignment_2 ) ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1157:1: ( ( ( rule__Selection__QuestionTextAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1158:1: ( ( rule__Selection__QuestionTextAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1158:1: ( ( rule__Selection__QuestionTextAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1159:1: ( rule__Selection__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getSelectionAccess().getQuestionTextAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1160:1: ( rule__Selection__QuestionTextAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1160:2: rule__Selection__QuestionTextAssignment_2
            {
            pushFollow(FOLLOW_rule__Selection__QuestionTextAssignment_2_in_rule__Selection__Group__2__Impl2301);
            rule__Selection__QuestionTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getQuestionTextAssignment_2()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1170:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1174:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1175:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__32331);
            rule__Selection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__32334);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1182:1: rule__Selection__Group__3__Impl : ( ( rule__Selection__HelpTextAssignment_3 )? ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1186:1: ( ( ( rule__Selection__HelpTextAssignment_3 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1187:1: ( ( rule__Selection__HelpTextAssignment_3 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1187:1: ( ( rule__Selection__HelpTextAssignment_3 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1188:1: ( rule__Selection__HelpTextAssignment_3 )?
            {
             before(grammarAccess.getSelectionAccess().getHelpTextAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1189:1: ( rule__Selection__HelpTextAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1189:2: rule__Selection__HelpTextAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Selection__HelpTextAssignment_3_in_rule__Selection__Group__3__Impl2361);
                    rule__Selection__HelpTextAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectionAccess().getHelpTextAssignment_3()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1199:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1203:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1204:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
            {
            pushFollow(FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__42392);
            rule__Selection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__42395);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1211:1: rule__Selection__Group__4__Impl : ( '(' ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1215:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1216:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1216:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1217:1: '('
            {
             before(grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Selection__Group__4__Impl2423); 
             after(grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_4()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1230:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl rule__Selection__Group__6 ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1234:1: ( rule__Selection__Group__5__Impl rule__Selection__Group__6 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1235:2: rule__Selection__Group__5__Impl rule__Selection__Group__6
            {
            pushFollow(FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__52454);
            rule__Selection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__6_in_rule__Selection__Group__52457);
            rule__Selection__Group__6();

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1242:1: rule__Selection__Group__5__Impl : ( ( rule__Selection__BulletsAssignment_5 )* ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1246:1: ( ( ( rule__Selection__BulletsAssignment_5 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1247:1: ( ( rule__Selection__BulletsAssignment_5 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1247:1: ( ( rule__Selection__BulletsAssignment_5 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1248:1: ( rule__Selection__BulletsAssignment_5 )*
            {
             before(grammarAccess.getSelectionAccess().getBulletsAssignment_5()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1249:1: ( rule__Selection__BulletsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1249:2: rule__Selection__BulletsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Selection__BulletsAssignment_5_in_rule__Selection__Group__5__Impl2484);
            	    rule__Selection__BulletsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getBulletsAssignment_5()); 

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


    // $ANTLR start "rule__Selection__Group__6"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1259:1: rule__Selection__Group__6 : rule__Selection__Group__6__Impl ;
    public final void rule__Selection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1263:1: ( rule__Selection__Group__6__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1264:2: rule__Selection__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group__6__Impl_in_rule__Selection__Group__62515);
            rule__Selection__Group__6__Impl();

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
    // $ANTLR end "rule__Selection__Group__6"


    // $ANTLR start "rule__Selection__Group__6__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1270:1: rule__Selection__Group__6__Impl : ( ')' ) ;
    public final void rule__Selection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1274:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1275:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1275:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1276:1: ')'
            {
             before(grammarAccess.getSelectionAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Selection__Group__6__Impl2543); 
             after(grammarAccess.getSelectionAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Selection__Group__6__Impl"


    // $ANTLR start "rule__Chart__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1303:1: rule__Chart__Group__0 : rule__Chart__Group__0__Impl rule__Chart__Group__1 ;
    public final void rule__Chart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1307:1: ( rule__Chart__Group__0__Impl rule__Chart__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1308:2: rule__Chart__Group__0__Impl rule__Chart__Group__1
            {
            pushFollow(FOLLOW_rule__Chart__Group__0__Impl_in_rule__Chart__Group__02588);
            rule__Chart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__1_in_rule__Chart__Group__02591);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1315:1: rule__Chart__Group__0__Impl : ( 'chart' ) ;
    public final void rule__Chart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1319:1: ( ( 'chart' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1320:1: ( 'chart' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1320:1: ( 'chart' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1321:1: 'chart'
            {
             before(grammarAccess.getChartAccess().getChartKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Chart__Group__0__Impl2619); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1334:1: rule__Chart__Group__1 : rule__Chart__Group__1__Impl rule__Chart__Group__2 ;
    public final void rule__Chart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1338:1: ( rule__Chart__Group__1__Impl rule__Chart__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1339:2: rule__Chart__Group__1__Impl rule__Chart__Group__2
            {
            pushFollow(FOLLOW_rule__Chart__Group__1__Impl_in_rule__Chart__Group__12650);
            rule__Chart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__2_in_rule__Chart__Group__12653);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1346:1: rule__Chart__Group__1__Impl : ( ( rule__Chart__NameAssignment_1 ) ) ;
    public final void rule__Chart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1350:1: ( ( ( rule__Chart__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1351:1: ( ( rule__Chart__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1351:1: ( ( rule__Chart__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1352:1: ( rule__Chart__NameAssignment_1 )
            {
             before(grammarAccess.getChartAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1353:1: ( rule__Chart__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1353:2: rule__Chart__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Chart__NameAssignment_1_in_rule__Chart__Group__1__Impl2680);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1363:1: rule__Chart__Group__2 : rule__Chart__Group__2__Impl rule__Chart__Group__3 ;
    public final void rule__Chart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1367:1: ( rule__Chart__Group__2__Impl rule__Chart__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1368:2: rule__Chart__Group__2__Impl rule__Chart__Group__3
            {
            pushFollow(FOLLOW_rule__Chart__Group__2__Impl_in_rule__Chart__Group__22710);
            rule__Chart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__3_in_rule__Chart__Group__22713);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1375:1: rule__Chart__Group__2__Impl : ( ( rule__Chart__QuestionTextAssignment_2 ) ) ;
    public final void rule__Chart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1379:1: ( ( ( rule__Chart__QuestionTextAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1380:1: ( ( rule__Chart__QuestionTextAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1380:1: ( ( rule__Chart__QuestionTextAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1381:1: ( rule__Chart__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getChartAccess().getQuestionTextAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1382:1: ( rule__Chart__QuestionTextAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1382:2: rule__Chart__QuestionTextAssignment_2
            {
            pushFollow(FOLLOW_rule__Chart__QuestionTextAssignment_2_in_rule__Chart__Group__2__Impl2740);
            rule__Chart__QuestionTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getQuestionTextAssignment_2()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1392:1: rule__Chart__Group__3 : rule__Chart__Group__3__Impl rule__Chart__Group__4 ;
    public final void rule__Chart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1396:1: ( rule__Chart__Group__3__Impl rule__Chart__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1397:2: rule__Chart__Group__3__Impl rule__Chart__Group__4
            {
            pushFollow(FOLLOW_rule__Chart__Group__3__Impl_in_rule__Chart__Group__32770);
            rule__Chart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__4_in_rule__Chart__Group__32773);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1404:1: rule__Chart__Group__3__Impl : ( ( rule__Chart__HelpTextAssignment_3 )? ) ;
    public final void rule__Chart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1408:1: ( ( ( rule__Chart__HelpTextAssignment_3 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1409:1: ( ( rule__Chart__HelpTextAssignment_3 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1409:1: ( ( rule__Chart__HelpTextAssignment_3 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1410:1: ( rule__Chart__HelpTextAssignment_3 )?
            {
             before(grammarAccess.getChartAccess().getHelpTextAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1411:1: ( rule__Chart__HelpTextAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1411:2: rule__Chart__HelpTextAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Chart__HelpTextAssignment_3_in_rule__Chart__Group__3__Impl2800);
                    rule__Chart__HelpTextAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChartAccess().getHelpTextAssignment_3()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1421:1: rule__Chart__Group__4 : rule__Chart__Group__4__Impl rule__Chart__Group__5 ;
    public final void rule__Chart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1425:1: ( rule__Chart__Group__4__Impl rule__Chart__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1426:2: rule__Chart__Group__4__Impl rule__Chart__Group__5
            {
            pushFollow(FOLLOW_rule__Chart__Group__4__Impl_in_rule__Chart__Group__42831);
            rule__Chart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__5_in_rule__Chart__Group__42834);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1433:1: rule__Chart__Group__4__Impl : ( '(' ) ;
    public final void rule__Chart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1437:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1438:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1438:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1439:1: '('
            {
             before(grammarAccess.getChartAccess().getLeftParenthesisKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Chart__Group__4__Impl2862); 
             after(grammarAccess.getChartAccess().getLeftParenthesisKeyword_4()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1452:1: rule__Chart__Group__5 : rule__Chart__Group__5__Impl rule__Chart__Group__6 ;
    public final void rule__Chart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1456:1: ( rule__Chart__Group__5__Impl rule__Chart__Group__6 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1457:2: rule__Chart__Group__5__Impl rule__Chart__Group__6
            {
            pushFollow(FOLLOW_rule__Chart__Group__5__Impl_in_rule__Chart__Group__52893);
            rule__Chart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__6_in_rule__Chart__Group__52896);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1464:1: rule__Chart__Group__5__Impl : ( ( rule__Chart__BulletsAssignment_5 )* ) ;
    public final void rule__Chart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1468:1: ( ( ( rule__Chart__BulletsAssignment_5 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1469:1: ( ( rule__Chart__BulletsAssignment_5 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1469:1: ( ( rule__Chart__BulletsAssignment_5 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1470:1: ( rule__Chart__BulletsAssignment_5 )*
            {
             before(grammarAccess.getChartAccess().getBulletsAssignment_5()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1471:1: ( rule__Chart__BulletsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1471:2: rule__Chart__BulletsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Chart__BulletsAssignment_5_in_rule__Chart__Group__5__Impl2923);
            	    rule__Chart__BulletsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getChartAccess().getBulletsAssignment_5()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1481:1: rule__Chart__Group__6 : rule__Chart__Group__6__Impl rule__Chart__Group__7 ;
    public final void rule__Chart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1485:1: ( rule__Chart__Group__6__Impl rule__Chart__Group__7 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1486:2: rule__Chart__Group__6__Impl rule__Chart__Group__7
            {
            pushFollow(FOLLOW_rule__Chart__Group__6__Impl_in_rule__Chart__Group__62954);
            rule__Chart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__7_in_rule__Chart__Group__62957);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1493:1: rule__Chart__Group__6__Impl : ( ')' ) ;
    public final void rule__Chart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1497:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1498:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1498:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1499:1: ')'
            {
             before(grammarAccess.getChartAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Chart__Group__6__Impl2985); 
             after(grammarAccess.getChartAccess().getRightParenthesisKeyword_6()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1512:1: rule__Chart__Group__7 : rule__Chart__Group__7__Impl rule__Chart__Group__8 ;
    public final void rule__Chart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1516:1: ( rule__Chart__Group__7__Impl rule__Chart__Group__8 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1517:2: rule__Chart__Group__7__Impl rule__Chart__Group__8
            {
            pushFollow(FOLLOW_rule__Chart__Group__7__Impl_in_rule__Chart__Group__73016);
            rule__Chart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__8_in_rule__Chart__Group__73019);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1524:1: rule__Chart__Group__7__Impl : ( 'x' ) ;
    public final void rule__Chart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1528:1: ( ( 'x' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1529:1: ( 'x' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1529:1: ( 'x' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1530:1: 'x'
            {
             before(grammarAccess.getChartAccess().getXKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__Chart__Group__7__Impl3047); 
             after(grammarAccess.getChartAccess().getXKeyword_7()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1543:1: rule__Chart__Group__8 : rule__Chart__Group__8__Impl rule__Chart__Group__9 ;
    public final void rule__Chart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1547:1: ( rule__Chart__Group__8__Impl rule__Chart__Group__9 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1548:2: rule__Chart__Group__8__Impl rule__Chart__Group__9
            {
            pushFollow(FOLLOW_rule__Chart__Group__8__Impl_in_rule__Chart__Group__83078);
            rule__Chart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__9_in_rule__Chart__Group__83081);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1555:1: rule__Chart__Group__8__Impl : ( '(' ) ;
    public final void rule__Chart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1559:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1560:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1560:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1561:1: '('
            {
             before(grammarAccess.getChartAccess().getLeftParenthesisKeyword_8()); 
            match(input,13,FOLLOW_13_in_rule__Chart__Group__8__Impl3109); 
             after(grammarAccess.getChartAccess().getLeftParenthesisKeyword_8()); 

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1574:1: rule__Chart__Group__9 : rule__Chart__Group__9__Impl rule__Chart__Group__10 ;
    public final void rule__Chart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1578:1: ( rule__Chart__Group__9__Impl rule__Chart__Group__10 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1579:2: rule__Chart__Group__9__Impl rule__Chart__Group__10
            {
            pushFollow(FOLLOW_rule__Chart__Group__9__Impl_in_rule__Chart__Group__93140);
            rule__Chart__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chart__Group__10_in_rule__Chart__Group__93143);
            rule__Chart__Group__10();

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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1586:1: rule__Chart__Group__9__Impl : ( ( rule__Chart__GraduationsAssignment_9 )* ) ;
    public final void rule__Chart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1590:1: ( ( ( rule__Chart__GraduationsAssignment_9 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1591:1: ( ( rule__Chart__GraduationsAssignment_9 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1591:1: ( ( rule__Chart__GraduationsAssignment_9 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1592:1: ( rule__Chart__GraduationsAssignment_9 )*
            {
             before(grammarAccess.getChartAccess().getGraduationsAssignment_9()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1593:1: ( rule__Chart__GraduationsAssignment_9 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1593:2: rule__Chart__GraduationsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Chart__GraduationsAssignment_9_in_rule__Chart__Group__9__Impl3170);
            	    rule__Chart__GraduationsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getChartAccess().getGraduationsAssignment_9()); 

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


    // $ANTLR start "rule__Chart__Group__10"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1603:1: rule__Chart__Group__10 : rule__Chart__Group__10__Impl ;
    public final void rule__Chart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1607:1: ( rule__Chart__Group__10__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1608:2: rule__Chart__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Chart__Group__10__Impl_in_rule__Chart__Group__103201);
            rule__Chart__Group__10__Impl();

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
    // $ANTLR end "rule__Chart__Group__10"


    // $ANTLR start "rule__Chart__Group__10__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1614:1: rule__Chart__Group__10__Impl : ( ')' ) ;
    public final void rule__Chart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1618:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1619:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1619:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1620:1: ')'
            {
             before(grammarAccess.getChartAccess().getRightParenthesisKeyword_10()); 
            match(input,14,FOLLOW_14_in_rule__Chart__Group__10__Impl3229); 
             after(grammarAccess.getChartAccess().getRightParenthesisKeyword_10()); 

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
    // $ANTLR end "rule__Chart__Group__10__Impl"


    // $ANTLR start "rule__Bullet__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1655:1: rule__Bullet__Group__0 : rule__Bullet__Group__0__Impl rule__Bullet__Group__1 ;
    public final void rule__Bullet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1659:1: ( rule__Bullet__Group__0__Impl rule__Bullet__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1660:2: rule__Bullet__Group__0__Impl rule__Bullet__Group__1
            {
            pushFollow(FOLLOW_rule__Bullet__Group__0__Impl_in_rule__Bullet__Group__03282);
            rule__Bullet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bullet__Group__1_in_rule__Bullet__Group__03285);
            rule__Bullet__Group__1();

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
    // $ANTLR end "rule__Bullet__Group__0"


    // $ANTLR start "rule__Bullet__Group__0__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1667:1: rule__Bullet__Group__0__Impl : ( ( rule__Bullet__FreetextAssignment_0 )? ) ;
    public final void rule__Bullet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1671:1: ( ( ( rule__Bullet__FreetextAssignment_0 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1672:1: ( ( rule__Bullet__FreetextAssignment_0 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1672:1: ( ( rule__Bullet__FreetextAssignment_0 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1673:1: ( rule__Bullet__FreetextAssignment_0 )?
            {
             before(grammarAccess.getBulletAccess().getFreetextAssignment_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1674:1: ( rule__Bullet__FreetextAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1674:2: rule__Bullet__FreetextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Bullet__FreetextAssignment_0_in_rule__Bullet__Group__0__Impl3312);
                    rule__Bullet__FreetextAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBulletAccess().getFreetextAssignment_0()); 

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
    // $ANTLR end "rule__Bullet__Group__0__Impl"


    // $ANTLR start "rule__Bullet__Group__1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1684:1: rule__Bullet__Group__1 : rule__Bullet__Group__1__Impl rule__Bullet__Group__2 ;
    public final void rule__Bullet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1688:1: ( rule__Bullet__Group__1__Impl rule__Bullet__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1689:2: rule__Bullet__Group__1__Impl rule__Bullet__Group__2
            {
            pushFollow(FOLLOW_rule__Bullet__Group__1__Impl_in_rule__Bullet__Group__13343);
            rule__Bullet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bullet__Group__2_in_rule__Bullet__Group__13346);
            rule__Bullet__Group__2();

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
    // $ANTLR end "rule__Bullet__Group__1"


    // $ANTLR start "rule__Bullet__Group__1__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1696:1: rule__Bullet__Group__1__Impl : ( ( rule__Bullet__NameAssignment_1 ) ) ;
    public final void rule__Bullet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1700:1: ( ( ( rule__Bullet__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1701:1: ( ( rule__Bullet__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1701:1: ( ( rule__Bullet__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1702:1: ( rule__Bullet__NameAssignment_1 )
            {
             before(grammarAccess.getBulletAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1703:1: ( rule__Bullet__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1703:2: rule__Bullet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Bullet__NameAssignment_1_in_rule__Bullet__Group__1__Impl3373);
            rule__Bullet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBulletAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Bullet__Group__1__Impl"


    // $ANTLR start "rule__Bullet__Group__2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1713:1: rule__Bullet__Group__2 : rule__Bullet__Group__2__Impl ;
    public final void rule__Bullet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1717:1: ( rule__Bullet__Group__2__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1718:2: rule__Bullet__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Bullet__Group__2__Impl_in_rule__Bullet__Group__23403);
            rule__Bullet__Group__2__Impl();

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
    // $ANTLR end "rule__Bullet__Group__2"


    // $ANTLR start "rule__Bullet__Group__2__Impl"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1724:1: rule__Bullet__Group__2__Impl : ( ( rule__Bullet__BulletTextAssignment_2 ) ) ;
    public final void rule__Bullet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1728:1: ( ( ( rule__Bullet__BulletTextAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1729:1: ( ( rule__Bullet__BulletTextAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1729:1: ( ( rule__Bullet__BulletTextAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1730:1: ( rule__Bullet__BulletTextAssignment_2 )
            {
             before(grammarAccess.getBulletAccess().getBulletTextAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1731:1: ( rule__Bullet__BulletTextAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1731:2: rule__Bullet__BulletTextAssignment_2
            {
            pushFollow(FOLLOW_rule__Bullet__BulletTextAssignment_2_in_rule__Bullet__Group__2__Impl3430);
            rule__Bullet__BulletTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBulletAccess().getBulletTextAssignment_2()); 

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
    // $ANTLR end "rule__Bullet__Group__2__Impl"


    // $ANTLR start "rule__Graduation__Group__0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1747:1: rule__Graduation__Group__0 : rule__Graduation__Group__0__Impl rule__Graduation__Group__1 ;
    public final void rule__Graduation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1751:1: ( rule__Graduation__Group__0__Impl rule__Graduation__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1752:2: rule__Graduation__Group__0__Impl rule__Graduation__Group__1
            {
            pushFollow(FOLLOW_rule__Graduation__Group__0__Impl_in_rule__Graduation__Group__03466);
            rule__Graduation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Graduation__Group__1_in_rule__Graduation__Group__03469);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1759:1: rule__Graduation__Group__0__Impl : ( ( rule__Graduation__NameAssignment_0 )? ) ;
    public final void rule__Graduation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1763:1: ( ( ( rule__Graduation__NameAssignment_0 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1764:1: ( ( rule__Graduation__NameAssignment_0 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1764:1: ( ( rule__Graduation__NameAssignment_0 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1765:1: ( rule__Graduation__NameAssignment_0 )?
            {
             before(grammarAccess.getGraduationAccess().getNameAssignment_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1766:1: ( rule__Graduation__NameAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1766:2: rule__Graduation__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Graduation__NameAssignment_0_in_rule__Graduation__Group__0__Impl3496);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1776:1: rule__Graduation__Group__1 : rule__Graduation__Group__1__Impl ;
    public final void rule__Graduation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1780:1: ( rule__Graduation__Group__1__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1781:2: rule__Graduation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Graduation__Group__1__Impl_in_rule__Graduation__Group__13527);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1787:1: rule__Graduation__Group__1__Impl : ( ( rule__Graduation__GraduationTextAssignment_1 ) ) ;
    public final void rule__Graduation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1791:1: ( ( ( rule__Graduation__GraduationTextAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1792:1: ( ( rule__Graduation__GraduationTextAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1792:1: ( ( rule__Graduation__GraduationTextAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1793:1: ( rule__Graduation__GraduationTextAssignment_1 )
            {
             before(grammarAccess.getGraduationAccess().getGraduationTextAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1794:1: ( rule__Graduation__GraduationTextAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1794:2: rule__Graduation__GraduationTextAssignment_1
            {
            pushFollow(FOLLOW_rule__Graduation__GraduationTextAssignment_1_in_rule__Graduation__Group__1__Impl3554);
            rule__Graduation__GraduationTextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraduationAccess().getGraduationTextAssignment_1()); 

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


    // $ANTLR start "rule__Survey__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1809:1: rule__Survey__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Survey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1813:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1814:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1814:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1815:1: RULE_ID
            {
             before(grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_13593); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1824:1: rule__Survey__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Survey__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1828:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1829:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1829:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1830:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_23624); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1839:1: rule__Survey__GreetingAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Survey__GreetingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1843:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1844:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1844:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1845:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getGreetingSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__GreetingAssignment_33655); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1854:1: rule__Survey__PagesAssignment_4 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1858:1: ( ( rulePage ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1859:1: ( rulePage )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1859:1: ( rulePage )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1860:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePage_in_rule__Survey__PagesAssignment_43686);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1869:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1873:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1874:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1874:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1875:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13717); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1884:1: rule__Page__QuestionAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1888:1: ( ( ruleQuestion ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1889:1: ( ruleQuestion )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1889:1: ( ruleQuestion )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1890:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Page__QuestionAssignment_33748);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1899:1: rule__Page__ForwardingAssignment_4_0 : ( ( 'forwarding to ->' ) ) ;
    public final void rule__Page__ForwardingAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1903:1: ( ( ( 'forwarding to ->' ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1904:1: ( ( 'forwarding to ->' ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1904:1: ( ( 'forwarding to ->' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1905:1: ( 'forwarding to ->' )
            {
             before(grammarAccess.getPageAccess().getForwardingForwardingToKeyword_4_0_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1906:1: ( 'forwarding to ->' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1907:1: 'forwarding to ->'
            {
             before(grammarAccess.getPageAccess().getForwardingForwardingToKeyword_4_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Page__ForwardingAssignment_4_03784); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1922:1: rule__Page__FollowingPageAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Page__FollowingPageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1926:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1927:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1927:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1928:1: ( RULE_ID )
            {
             before(grammarAccess.getPageAccess().getFollowingPagePageCrossReference_4_1_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1929:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1930:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getFollowingPagePageIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__FollowingPageAssignment_4_13827); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1941:1: rule__Freetext__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Freetext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1945:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1946:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1946:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1947:1: RULE_ID
            {
             before(grammarAccess.getFreetextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Freetext__NameAssignment_13862); 
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


    // $ANTLR start "rule__Freetext__QuestionTextAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1956:1: rule__Freetext__QuestionTextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Freetext__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1960:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1961:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1961:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1962:1: RULE_STRING
            {
             before(grammarAccess.getFreetextAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Freetext__QuestionTextAssignment_23893); 
             after(grammarAccess.getFreetextAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Freetext__QuestionTextAssignment_2"


    // $ANTLR start "rule__Freetext__HelpTextAssignment_3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1971:1: rule__Freetext__HelpTextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Freetext__HelpTextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1975:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1976:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1976:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1977:1: RULE_STRING
            {
             before(grammarAccess.getFreetextAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Freetext__HelpTextAssignment_33924); 
             after(grammarAccess.getFreetextAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Freetext__HelpTextAssignment_3"


    // $ANTLR start "rule__Rating__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1986:1: rule__Rating__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rating__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1990:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1991:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1991:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1992:1: RULE_ID
            {
             before(grammarAccess.getRatingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rating__NameAssignment_13955); 
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


    // $ANTLR start "rule__Rating__QuestionTextAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2001:1: rule__Rating__QuestionTextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Rating__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2005:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2006:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2006:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2007:1: RULE_STRING
            {
             before(grammarAccess.getRatingAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rating__QuestionTextAssignment_23986); 
             after(grammarAccess.getRatingAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rating__QuestionTextAssignment_2"


    // $ANTLR start "rule__Rating__HelpTextAssignment_3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2016:1: rule__Rating__HelpTextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Rating__HelpTextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2020:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2021:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2021:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2022:1: RULE_STRING
            {
             before(grammarAccess.getRatingAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rating__HelpTextAssignment_34017); 
             after(grammarAccess.getRatingAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rating__HelpTextAssignment_3"


    // $ANTLR start "rule__Rating__RatingQuantityAssignment_4"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2031:1: rule__Rating__RatingQuantityAssignment_4 : ( RULE_INT ) ;
    public final void rule__Rating__RatingQuantityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2035:1: ( ( RULE_INT ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2036:1: ( RULE_INT )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2036:1: ( RULE_INT )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2037:1: RULE_INT
            {
             before(grammarAccess.getRatingAccess().getRatingQuantityINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Rating__RatingQuantityAssignment_44048); 
             after(grammarAccess.getRatingAccess().getRatingQuantityINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rating__RatingQuantityAssignment_4"


    // $ANTLR start "rule__Selection__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2046:1: rule__Selection__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2050:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2051:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2051:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2052:1: RULE_ID
            {
             before(grammarAccess.getSelectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_14079); 
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


    // $ANTLR start "rule__Selection__QuestionTextAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2061:1: rule__Selection__QuestionTextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Selection__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2065:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2066:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2066:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2067:1: RULE_STRING
            {
             before(grammarAccess.getSelectionAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Selection__QuestionTextAssignment_24110); 
             after(grammarAccess.getSelectionAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Selection__QuestionTextAssignment_2"


    // $ANTLR start "rule__Selection__HelpTextAssignment_3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2076:1: rule__Selection__HelpTextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Selection__HelpTextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2080:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2081:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2081:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2082:1: RULE_STRING
            {
             before(grammarAccess.getSelectionAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Selection__HelpTextAssignment_34141); 
             after(grammarAccess.getSelectionAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Selection__HelpTextAssignment_3"


    // $ANTLR start "rule__Selection__BulletsAssignment_5"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2091:1: rule__Selection__BulletsAssignment_5 : ( ruleBullet ) ;
    public final void rule__Selection__BulletsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2095:1: ( ( ruleBullet ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2096:1: ( ruleBullet )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2096:1: ( ruleBullet )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2097:1: ruleBullet
            {
             before(grammarAccess.getSelectionAccess().getBulletsBulletParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBullet_in_rule__Selection__BulletsAssignment_54172);
            ruleBullet();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getBulletsBulletParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Selection__BulletsAssignment_5"


    // $ANTLR start "rule__Chart__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2106:1: rule__Chart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2110:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2111:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2111:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2112:1: RULE_ID
            {
             before(grammarAccess.getChartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chart__NameAssignment_14203); 
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


    // $ANTLR start "rule__Chart__QuestionTextAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2121:1: rule__Chart__QuestionTextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Chart__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2125:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2126:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2126:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2127:1: RULE_STRING
            {
             before(grammarAccess.getChartAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Chart__QuestionTextAssignment_24234); 
             after(grammarAccess.getChartAccess().getQuestionTextSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Chart__QuestionTextAssignment_2"


    // $ANTLR start "rule__Chart__HelpTextAssignment_3"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2136:1: rule__Chart__HelpTextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Chart__HelpTextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2140:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2141:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2141:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2142:1: RULE_STRING
            {
             before(grammarAccess.getChartAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Chart__HelpTextAssignment_34265); 
             after(grammarAccess.getChartAccess().getHelpTextSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Chart__HelpTextAssignment_3"


    // $ANTLR start "rule__Chart__BulletsAssignment_5"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2151:1: rule__Chart__BulletsAssignment_5 : ( ruleBullet ) ;
    public final void rule__Chart__BulletsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2155:1: ( ( ruleBullet ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2156:1: ( ruleBullet )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2156:1: ( ruleBullet )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2157:1: ruleBullet
            {
             before(grammarAccess.getChartAccess().getBulletsBulletParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBullet_in_rule__Chart__BulletsAssignment_54296);
            ruleBullet();

            state._fsp--;

             after(grammarAccess.getChartAccess().getBulletsBulletParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Chart__BulletsAssignment_5"


    // $ANTLR start "rule__Chart__GraduationsAssignment_9"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2166:1: rule__Chart__GraduationsAssignment_9 : ( ruleGraduation ) ;
    public final void rule__Chart__GraduationsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2170:1: ( ( ruleGraduation ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2171:1: ( ruleGraduation )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2171:1: ( ruleGraduation )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2172:1: ruleGraduation
            {
             before(grammarAccess.getChartAccess().getGraduationsGraduationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleGraduation_in_rule__Chart__GraduationsAssignment_94327);
            ruleGraduation();

            state._fsp--;

             after(grammarAccess.getChartAccess().getGraduationsGraduationParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Chart__GraduationsAssignment_9"


    // $ANTLR start "rule__Bullet__FreetextAssignment_0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2181:1: rule__Bullet__FreetextAssignment_0 : ( ( 'freetext' ) ) ;
    public final void rule__Bullet__FreetextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2185:1: ( ( ( 'freetext' ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2186:1: ( ( 'freetext' ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2186:1: ( ( 'freetext' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2187:1: ( 'freetext' )
            {
             before(grammarAccess.getBulletAccess().getFreetextFreetextKeyword_0_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2188:1: ( 'freetext' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2189:1: 'freetext'
            {
             before(grammarAccess.getBulletAccess().getFreetextFreetextKeyword_0_0()); 
            match(input,15,FOLLOW_15_in_rule__Bullet__FreetextAssignment_04363); 
             after(grammarAccess.getBulletAccess().getFreetextFreetextKeyword_0_0()); 

            }

             after(grammarAccess.getBulletAccess().getFreetextFreetextKeyword_0_0()); 

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
    // $ANTLR end "rule__Bullet__FreetextAssignment_0"


    // $ANTLR start "rule__Bullet__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2204:1: rule__Bullet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bullet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2208:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2209:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2209:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2210:1: RULE_ID
            {
             before(grammarAccess.getBulletAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bullet__NameAssignment_14402); 
             after(grammarAccess.getBulletAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Bullet__NameAssignment_1"


    // $ANTLR start "rule__Bullet__BulletTextAssignment_2"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2219:1: rule__Bullet__BulletTextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Bullet__BulletTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2223:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2224:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2224:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2225:1: RULE_STRING
            {
             before(grammarAccess.getBulletAccess().getBulletTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Bullet__BulletTextAssignment_24433); 
             after(grammarAccess.getBulletAccess().getBulletTextSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Bullet__BulletTextAssignment_2"


    // $ANTLR start "rule__Graduation__NameAssignment_0"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2234:1: rule__Graduation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Graduation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2238:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2239:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2239:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2240:1: RULE_ID
            {
             before(grammarAccess.getGraduationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Graduation__NameAssignment_04464); 
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


    // $ANTLR start "rule__Graduation__GraduationTextAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2249:1: rule__Graduation__GraduationTextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Graduation__GraduationTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2253:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2254:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2254:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:2255:1: RULE_STRING
            {
             before(grammarAccess.getGraduationAccess().getGraduationTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Graduation__GraduationTextAssignment_14495); 
             after(grammarAccess.getGraduationAccess().getGraduationTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Graduation__GraduationTextAssignment_1"

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
    public static final BitSet FOLLOW_ruleRating_in_entryRuleRating301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRating308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__0_in_ruleRating334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Alternatives_in_ruleChoice394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelection428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0_in_ruleSelection454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_entryRuleChart481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChart488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__0_in_ruleChart514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBullet_in_entryRuleBullet541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBullet548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bullet__Group__0_in_ruleBullet574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraduation_in_entryRuleGraduation601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraduation608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__Group__0_in_ruleGraduation634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreetext_in_rule__Question__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRating_in_rule__Question__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__Question__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_rule__Choice__Alternatives736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_rule__Choice__Alternatives753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1845 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2905 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3965 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__GreetingAssignment_3_in_rule__Survey__Group__3__Impl995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__PagesAssignment_4_in_rule__Survey__Group__4__Impl1053 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__01094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__01097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Page__Group__0__Impl1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__11156 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__11159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21216 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Page__Group__2__Impl1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31278 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__QuestionAssignment_3_in_rule__Page__Group__3__Impl1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41338 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0_in_rule__Page__Group__4__Impl1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Page__Group__5__Impl1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__01470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__01473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ForwardingAssignment_4_0_in_rule__Page__Group_4__0__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__11530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__FollowingPageAssignment_4_1_in_rule__Page__Group_4__1__Impl1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__0__Impl_in_rule__Freetext__Group__01591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Freetext__Group__1_in_rule__Freetext__Group__01594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Freetext__Group__0__Impl1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__1__Impl_in_rule__Freetext__Group__11653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Freetext__Group__2_in_rule__Freetext__Group__11656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__NameAssignment_1_in_rule__Freetext__Group__1__Impl1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__2__Impl_in_rule__Freetext__Group__21713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Freetext__Group__3_in_rule__Freetext__Group__21716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__QuestionTextAssignment_2_in_rule__Freetext__Group__2__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__3__Impl_in_rule__Freetext__Group__31773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__HelpTextAssignment_3_in_rule__Freetext__Group__3__Impl1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__0__Impl_in_rule__Rating__Group__01839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rating__Group__1_in_rule__Rating__Group__01842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Rating__Group__0__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__1__Impl_in_rule__Rating__Group__11901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rating__Group__2_in_rule__Rating__Group__11904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__NameAssignment_1_in_rule__Rating__Group__1__Impl1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__2__Impl_in_rule__Rating__Group__21961 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Rating__Group__3_in_rule__Rating__Group__21964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__QuestionTextAssignment_2_in_rule__Rating__Group__2__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__3__Impl_in_rule__Rating__Group__32021 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Rating__Group__4_in_rule__Rating__Group__32024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__HelpTextAssignment_3_in_rule__Rating__Group__3__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__Group__4__Impl_in_rule__Rating__Group__42082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rating__RatingQuantityAssignment_4_in_rule__Rating__Group__4__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__02149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__02152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Selection__Group__0__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__12211 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__12214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__22271 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__22274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__QuestionTextAssignment_2_in_rule__Selection__Group__2__Impl2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__32331 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__32334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__HelpTextAssignment_3_in_rule__Selection__Group__3__Impl2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__42392 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__42395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Selection__Group__4__Impl2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__52454 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Selection__Group__6_in_rule__Selection__Group__52457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__BulletsAssignment_5_in_rule__Selection__Group__5__Impl2484 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_rule__Selection__Group__6__Impl_in_rule__Selection__Group__62515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Selection__Group__6__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__0__Impl_in_rule__Chart__Group__02588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Chart__Group__1_in_rule__Chart__Group__02591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Chart__Group__0__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__1__Impl_in_rule__Chart__Group__12650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Chart__Group__2_in_rule__Chart__Group__12653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__NameAssignment_1_in_rule__Chart__Group__1__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__2__Impl_in_rule__Chart__Group__22710 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__Chart__Group__3_in_rule__Chart__Group__22713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__QuestionTextAssignment_2_in_rule__Chart__Group__2__Impl2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__3__Impl_in_rule__Chart__Group__32770 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__Chart__Group__4_in_rule__Chart__Group__32773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__HelpTextAssignment_3_in_rule__Chart__Group__3__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__4__Impl_in_rule__Chart__Group__42831 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Chart__Group__5_in_rule__Chart__Group__42834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Chart__Group__4__Impl2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__5__Impl_in_rule__Chart__Group__52893 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Chart__Group__6_in_rule__Chart__Group__52896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__BulletsAssignment_5_in_rule__Chart__Group__5__Impl2923 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_rule__Chart__Group__6__Impl_in_rule__Chart__Group__62954 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Chart__Group__7_in_rule__Chart__Group__62957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Chart__Group__6__Impl2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__7__Impl_in_rule__Chart__Group__73016 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Chart__Group__8_in_rule__Chart__Group__73019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Chart__Group__7__Impl3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__8__Impl_in_rule__Chart__Group__83078 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Chart__Group__9_in_rule__Chart__Group__83081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Chart__Group__8__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__Group__9__Impl_in_rule__Chart__Group__93140 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Chart__Group__10_in_rule__Chart__Group__93143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chart__GraduationsAssignment_9_in_rule__Chart__Group__9__Impl3170 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Chart__Group__10__Impl_in_rule__Chart__Group__103201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Chart__Group__10__Impl3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bullet__Group__0__Impl_in_rule__Bullet__Group__03282 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Bullet__Group__1_in_rule__Bullet__Group__03285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bullet__FreetextAssignment_0_in_rule__Bullet__Group__0__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bullet__Group__1__Impl_in_rule__Bullet__Group__13343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bullet__Group__2_in_rule__Bullet__Group__13346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bullet__NameAssignment_1_in_rule__Bullet__Group__1__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bullet__Group__2__Impl_in_rule__Bullet__Group__23403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bullet__BulletTextAssignment_2_in_rule__Bullet__Group__2__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__Group__0__Impl_in_rule__Graduation__Group__03466 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Graduation__Group__1_in_rule__Graduation__Group__03469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__NameAssignment_0_in_rule__Graduation__Group__0__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__Group__1__Impl_in_rule__Graduation__Group__13527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graduation__GraduationTextAssignment_1_in_rule__Graduation__Group__1__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_13593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_23624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__GreetingAssignment_33655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_43686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionAssignment_33748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Page__ForwardingAssignment_4_03784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__FollowingPageAssignment_4_13827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Freetext__NameAssignment_13862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Freetext__QuestionTextAssignment_23893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Freetext__HelpTextAssignment_33924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rating__NameAssignment_13955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rating__QuestionTextAssignment_23986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rating__HelpTextAssignment_34017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Rating__RatingQuantityAssignment_44048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_14079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Selection__QuestionTextAssignment_24110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Selection__HelpTextAssignment_34141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBullet_in_rule__Selection__BulletsAssignment_54172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chart__NameAssignment_14203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Chart__QuestionTextAssignment_24234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Chart__HelpTextAssignment_34265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBullet_in_rule__Chart__BulletsAssignment_54296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraduation_in_rule__Chart__GraduationsAssignment_94327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Bullet__FreetextAssignment_04363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bullet__NameAssignment_14402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Bullet__BulletTextAssignment_24433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Graduation__NameAssignment_04464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Graduation__GraduationTextAssignment_14495 = new BitSet(new long[]{0x0000000000000002L});

}