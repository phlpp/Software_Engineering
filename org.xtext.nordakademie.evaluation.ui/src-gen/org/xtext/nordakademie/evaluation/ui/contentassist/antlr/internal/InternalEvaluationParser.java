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


    // $ANTLR start "rule__Question__Alternatives"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:228:1: rule__Question__Alternatives : ( ( ruleFreetext ) | ( ruleSelection ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:232:1: ( ( ruleFreetext ) | ( ruleSelection ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:233:1: ( ruleFreetext )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:233:1: ( ruleFreetext )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:234:1: ruleFreetext
                    {
                     before(grammarAccess.getQuestionAccess().getFreetextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFreetext_in_rule__Question__Alternatives430);
                    ruleFreetext();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFreetextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:239:6: ( ruleSelection )
                    {
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:239:6: ( ruleSelection )
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:240:1: ruleSelection
                    {
                     before(grammarAccess.getQuestionAccess().getSelectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSelection_in_rule__Question__Alternatives447);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:252:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:256:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:257:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0477);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0480);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:264:1: rule__Survey__Group__0__Impl : ( 'survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:268:1: ( ( 'survey' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:269:1: ( 'survey' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:269:1: ( 'survey' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:270:1: 'survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Survey__Group__0__Impl508); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:283:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:287:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:288:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1539);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1542);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:295:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__NameAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:299:1: ( ( ( rule__Survey__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:300:1: ( ( rule__Survey__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:300:1: ( ( rule__Survey__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:301:1: ( rule__Survey__NameAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:302:1: ( rule__Survey__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:302:2: rule__Survey__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl569);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:312:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:316:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:317:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2599);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2602);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:324:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__TitleAssignment_2 ) ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:328:1: ( ( ( rule__Survey__TitleAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:329:1: ( ( rule__Survey__TitleAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:329:1: ( ( rule__Survey__TitleAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:330:1: ( rule__Survey__TitleAssignment_2 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:331:1: ( rule__Survey__TitleAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:331:2: rule__Survey__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl629);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:341:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:345:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:346:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3659);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3662);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:353:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__GreetingAssignment_3 )? ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:357:1: ( ( ( rule__Survey__GreetingAssignment_3 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:358:1: ( ( rule__Survey__GreetingAssignment_3 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:358:1: ( ( rule__Survey__GreetingAssignment_3 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:359:1: ( rule__Survey__GreetingAssignment_3 )?
            {
             before(grammarAccess.getSurveyAccess().getGreetingAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:360:1: ( rule__Survey__GreetingAssignment_3 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:360:2: rule__Survey__GreetingAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Survey__GreetingAssignment_3_in_rule__Survey__Group__3__Impl689);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:370:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl rule__Survey__Group__5 ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:374:1: ( rule__Survey__Group__4__Impl rule__Survey__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:375:2: rule__Survey__Group__4__Impl rule__Survey__Group__5
            {
            pushFollow(FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4720);
            rule__Survey__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4723);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:382:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__DurationAssignment_4 )? ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:386:1: ( ( ( rule__Survey__DurationAssignment_4 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:387:1: ( ( rule__Survey__DurationAssignment_4 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:387:1: ( ( rule__Survey__DurationAssignment_4 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:388:1: ( rule__Survey__DurationAssignment_4 )?
            {
             before(grammarAccess.getSurveyAccess().getDurationAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:389:1: ( rule__Survey__DurationAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:389:2: rule__Survey__DurationAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Survey__DurationAssignment_4_in_rule__Survey__Group__4__Impl750);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:399:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:403:1: ( rule__Survey__Group__5__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:404:2: rule__Survey__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5781);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:410:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__PagesAssignment_5 )* ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:414:1: ( ( ( rule__Survey__PagesAssignment_5 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:415:1: ( ( rule__Survey__PagesAssignment_5 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:415:1: ( ( rule__Survey__PagesAssignment_5 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:416:1: ( rule__Survey__PagesAssignment_5 )*
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_5()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:417:1: ( rule__Survey__PagesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:417:2: rule__Survey__PagesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Survey__PagesAssignment_5_in_rule__Survey__Group__5__Impl808);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:439:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:443:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:444:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__0851);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__0854);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:451:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:455:1: ( ( 'page' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:456:1: ( 'page' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:456:1: ( 'page' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:457:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Page__Group__0__Impl882); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:470:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:474:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:475:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__1913);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__1916);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:482:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:486:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:487:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:487:1: ( ( rule__Page__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:488:1: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:489:1: ( rule__Page__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:489:2: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl943);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:499:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:503:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:504:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__2973);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__2976);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:511:1: rule__Page__Group__2__Impl : ( '(' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:515:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:516:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:516:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:517:1: '('
            {
             before(grammarAccess.getPageAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Page__Group__2__Impl1004); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:530:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:534:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:535:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31035);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31038);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:542:1: rule__Page__Group__3__Impl : ( ( rule__Page__QuestionsAssignment_3 )* ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:546:1: ( ( ( rule__Page__QuestionsAssignment_3 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:547:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:547:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:548:1: ( rule__Page__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getPageAccess().getQuestionsAssignment_3()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:549:1: ( rule__Page__QuestionsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:549:2: rule__Page__QuestionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl1065);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:559:1: rule__Page__Group__4 : rule__Page__Group__4__Impl ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:563:1: ( rule__Page__Group__4__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:564:2: rule__Page__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41096);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:570:1: rule__Page__Group__4__Impl : ( ')' ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:574:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:575:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:575:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:576:1: ')'
            {
             before(grammarAccess.getPageAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Page__Group__4__Impl1124); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:599:1: rule__Freetext__Group__0 : rule__Freetext__Group__0__Impl rule__Freetext__Group__1 ;
    public final void rule__Freetext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:603:1: ( rule__Freetext__Group__0__Impl rule__Freetext__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:604:2: rule__Freetext__Group__0__Impl rule__Freetext__Group__1
            {
            pushFollow(FOLLOW_rule__Freetext__Group__0__Impl_in_rule__Freetext__Group__01165);
            rule__Freetext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Freetext__Group__1_in_rule__Freetext__Group__01168);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:611:1: rule__Freetext__Group__0__Impl : ( 'freetext' ) ;
    public final void rule__Freetext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:615:1: ( ( 'freetext' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:616:1: ( 'freetext' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:616:1: ( 'freetext' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:617:1: 'freetext'
            {
             before(grammarAccess.getFreetextAccess().getFreetextKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Freetext__Group__0__Impl1196); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:630:1: rule__Freetext__Group__1 : rule__Freetext__Group__1__Impl rule__Freetext__Group__2 ;
    public final void rule__Freetext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:634:1: ( rule__Freetext__Group__1__Impl rule__Freetext__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:635:2: rule__Freetext__Group__1__Impl rule__Freetext__Group__2
            {
            pushFollow(FOLLOW_rule__Freetext__Group__1__Impl_in_rule__Freetext__Group__11227);
            rule__Freetext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Freetext__Group__2_in_rule__Freetext__Group__11230);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:642:1: rule__Freetext__Group__1__Impl : ( ( rule__Freetext__NameAssignment_1 ) ) ;
    public final void rule__Freetext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:646:1: ( ( ( rule__Freetext__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:647:1: ( ( rule__Freetext__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:647:1: ( ( rule__Freetext__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:648:1: ( rule__Freetext__NameAssignment_1 )
            {
             before(grammarAccess.getFreetextAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:649:1: ( rule__Freetext__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:649:2: rule__Freetext__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Freetext__NameAssignment_1_in_rule__Freetext__Group__1__Impl1257);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:659:1: rule__Freetext__Group__2 : rule__Freetext__Group__2__Impl ;
    public final void rule__Freetext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:663:1: ( rule__Freetext__Group__2__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:664:2: rule__Freetext__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Freetext__Group__2__Impl_in_rule__Freetext__Group__21287);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:670:1: rule__Freetext__Group__2__Impl : ( ( rule__Freetext__QuestionAssignment_2 ) ) ;
    public final void rule__Freetext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:674:1: ( ( ( rule__Freetext__QuestionAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:675:1: ( ( rule__Freetext__QuestionAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:675:1: ( ( rule__Freetext__QuestionAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:676:1: ( rule__Freetext__QuestionAssignment_2 )
            {
             before(grammarAccess.getFreetextAccess().getQuestionAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:677:1: ( rule__Freetext__QuestionAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:677:2: rule__Freetext__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Freetext__QuestionAssignment_2_in_rule__Freetext__Group__2__Impl1314);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:693:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:697:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:698:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__01350);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__01353);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:705:1: rule__Selection__Group__0__Impl : ( 'select' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:709:1: ( ( 'select' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:710:1: ( 'select' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:710:1: ( 'select' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:711:1: 'select'
            {
             before(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Selection__Group__0__Impl1381); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:724:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:728:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:729:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__11412);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__11415);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:736:1: rule__Selection__Group__1__Impl : ( ( rule__Selection__NameAssignment_1 ) ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:740:1: ( ( ( rule__Selection__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:741:1: ( ( rule__Selection__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:741:1: ( ( rule__Selection__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:742:1: ( rule__Selection__NameAssignment_1 )
            {
             before(grammarAccess.getSelectionAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:743:1: ( rule__Selection__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:743:2: rule__Selection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl1442);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:753:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:757:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:758:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__21472);
            rule__Selection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__21475);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:765:1: rule__Selection__Group__2__Impl : ( ( rule__Selection__QuestionAssignment_2 ) ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:769:1: ( ( ( rule__Selection__QuestionAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:770:1: ( ( rule__Selection__QuestionAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:770:1: ( ( rule__Selection__QuestionAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:771:1: ( rule__Selection__QuestionAssignment_2 )
            {
             before(grammarAccess.getSelectionAccess().getQuestionAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:772:1: ( rule__Selection__QuestionAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:772:2: rule__Selection__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Selection__QuestionAssignment_2_in_rule__Selection__Group__2__Impl1502);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:782:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:786:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:787:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__31532);
            rule__Selection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__31535);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:794:1: rule__Selection__Group__3__Impl : ( '(' ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:798:1: ( ( '(' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:799:1: ( '(' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:799:1: ( '(' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:800:1: '('
            {
             before(grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Selection__Group__3__Impl1563); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:813:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:817:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:818:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
            {
            pushFollow(FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__41594);
            rule__Selection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__41597);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:825:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__ChoicesAssignment_4 )* ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:829:1: ( ( ( rule__Selection__ChoicesAssignment_4 )* ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:830:1: ( ( rule__Selection__ChoicesAssignment_4 )* )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:830:1: ( ( rule__Selection__ChoicesAssignment_4 )* )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:831:1: ( rule__Selection__ChoicesAssignment_4 )*
            {
             before(grammarAccess.getSelectionAccess().getChoicesAssignment_4()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:832:1: ( rule__Selection__ChoicesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:832:2: rule__Selection__ChoicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Selection__ChoicesAssignment_4_in_rule__Selection__Group__4__Impl1624);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:842:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:846:1: ( rule__Selection__Group__5__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:847:2: rule__Selection__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__51655);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:853:1: rule__Selection__Group__5__Impl : ( ')' ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:857:1: ( ( ')' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:858:1: ( ')' )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:858:1: ( ')' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:859:1: ')'
            {
             before(grammarAccess.getSelectionAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Selection__Group__5__Impl1683); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:884:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:888:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:889:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__01726);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__01729);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:896:1: rule__Choice__Group__0__Impl : ( ( rule__Choice__FreetextAssignment_0 )? ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:900:1: ( ( ( rule__Choice__FreetextAssignment_0 )? ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:901:1: ( ( rule__Choice__FreetextAssignment_0 )? )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:901:1: ( ( rule__Choice__FreetextAssignment_0 )? )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:902:1: ( rule__Choice__FreetextAssignment_0 )?
            {
             before(grammarAccess.getChoiceAccess().getFreetextAssignment_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:903:1: ( rule__Choice__FreetextAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:903:2: rule__Choice__FreetextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Choice__FreetextAssignment_0_in_rule__Choice__Group__0__Impl1756);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:913:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:917:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:918:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__11787);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__11790);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:925:1: rule__Choice__Group__1__Impl : ( ( rule__Choice__NameAssignment_1 ) ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:929:1: ( ( ( rule__Choice__NameAssignment_1 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:930:1: ( ( rule__Choice__NameAssignment_1 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:930:1: ( ( rule__Choice__NameAssignment_1 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:931:1: ( rule__Choice__NameAssignment_1 )
            {
             before(grammarAccess.getChoiceAccess().getNameAssignment_1()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:932:1: ( rule__Choice__NameAssignment_1 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:932:2: rule__Choice__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Choice__NameAssignment_1_in_rule__Choice__Group__1__Impl1817);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:942:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:946:1: ( rule__Choice__Group__2__Impl )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:947:2: rule__Choice__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__21847);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:953:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__BulletPointAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:957:1: ( ( ( rule__Choice__BulletPointAssignment_2 ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:958:1: ( ( rule__Choice__BulletPointAssignment_2 ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:958:1: ( ( rule__Choice__BulletPointAssignment_2 ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:959:1: ( rule__Choice__BulletPointAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getBulletPointAssignment_2()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:960:1: ( rule__Choice__BulletPointAssignment_2 )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:960:2: rule__Choice__BulletPointAssignment_2
            {
            pushFollow(FOLLOW_rule__Choice__BulletPointAssignment_2_in_rule__Choice__Group__2__Impl1874);
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


    // $ANTLR start "rule__Survey__NameAssignment_1"
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:977:1: rule__Survey__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Survey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:981:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:982:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:982:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:983:1: RULE_ID
            {
             before(grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_11915); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:992:1: rule__Survey__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Survey__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:996:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:997:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:997:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:998:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_21946); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1007:1: rule__Survey__GreetingAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Survey__GreetingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1011:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1012:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1012:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1013:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getGreetingSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__GreetingAssignment_31977); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1022:1: rule__Survey__DurationAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Survey__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1026:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1027:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1027:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1028:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getDurationSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__DurationAssignment_42008); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1037:1: rule__Survey__PagesAssignment_5 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1041:1: ( ( rulePage ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1042:1: ( rulePage )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1042:1: ( rulePage )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1043:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePage_in_rule__Survey__PagesAssignment_52039);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1052:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1056:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1057:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1057:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1058:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_12070); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1067:1: rule__Page__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1071:1: ( ( ruleQuestion ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1072:1: ( ruleQuestion )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1072:1: ( ruleQuestion )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1073:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_32101);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1082:1: rule__Freetext__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Freetext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1086:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1087:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1087:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1088:1: RULE_ID
            {
             before(grammarAccess.getFreetextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Freetext__NameAssignment_12132); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1097:1: rule__Freetext__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Freetext__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1101:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1102:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1102:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1103:1: RULE_STRING
            {
             before(grammarAccess.getFreetextAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Freetext__QuestionAssignment_22163); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1112:1: rule__Selection__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1116:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1117:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1117:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1118:1: RULE_ID
            {
             before(grammarAccess.getSelectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_12194); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1127:1: rule__Selection__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Selection__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1131:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1132:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1132:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1133:1: RULE_STRING
            {
             before(grammarAccess.getSelectionAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Selection__QuestionAssignment_22225); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1142:1: rule__Selection__ChoicesAssignment_4 : ( ruleChoice ) ;
    public final void rule__Selection__ChoicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1146:1: ( ( ruleChoice ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1147:1: ( ruleChoice )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1147:1: ( ruleChoice )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1148:1: ruleChoice
            {
             before(grammarAccess.getSelectionAccess().getChoicesChoiceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleChoice_in_rule__Selection__ChoicesAssignment_42256);
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1157:1: rule__Choice__FreetextAssignment_0 : ( ( 'freetext' ) ) ;
    public final void rule__Choice__FreetextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1161:1: ( ( ( 'freetext' ) ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1162:1: ( ( 'freetext' ) )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1162:1: ( ( 'freetext' ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1163:1: ( 'freetext' )
            {
             before(grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0()); 
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1164:1: ( 'freetext' )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1165:1: 'freetext'
            {
             before(grammarAccess.getChoiceAccess().getFreetextFreetextKeyword_0_0()); 
            match(input,15,FOLLOW_15_in_rule__Choice__FreetextAssignment_02292); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1180:1: rule__Choice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1184:1: ( ( RULE_ID ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1185:1: ( RULE_ID )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1185:1: ( RULE_ID )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1186:1: RULE_ID
            {
             before(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_12331); 
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
    // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1195:1: rule__Choice__BulletPointAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Choice__BulletPointAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1199:1: ( ( RULE_STRING ) )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1200:1: ( RULE_STRING )
            {
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1200:1: ( RULE_STRING )
            // ../org.xtext.nordakademie.evaluation.ui/src-gen/org/xtext/nordakademie/evaluation/ui/contentassist/antlr/internal/InternalEvaluation.g:1201:1: RULE_STRING
            {
             before(grammarAccess.getChoiceAccess().getBulletPointSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Choice__BulletPointAssignment_22362); 
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
    public static final BitSet FOLLOW_ruleFreetext_in_rule__Question__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_rule__Question__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1539 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2599 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3659 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__GreetingAssignment_3_in_rule__Survey__Group__3__Impl689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4720 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__DurationAssignment_4_in_rule__Survey__Group__4__Impl750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__PagesAssignment_5_in_rule__Survey__Group__5__Impl808 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__0851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__0854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Page__Group__0__Impl882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__1913 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__2973 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Page__Group__2__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31035 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl1065 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Page__Group__4__Impl1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__0__Impl_in_rule__Freetext__Group__01165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Freetext__Group__1_in_rule__Freetext__Group__01168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Freetext__Group__0__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__1__Impl_in_rule__Freetext__Group__11227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Freetext__Group__2_in_rule__Freetext__Group__11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__NameAssignment_1_in_rule__Freetext__Group__1__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__Group__2__Impl_in_rule__Freetext__Group__21287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freetext__QuestionAssignment_2_in_rule__Freetext__Group__2__Impl1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__01350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__01353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Selection__Group__0__Impl1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__11412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__11415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__21472 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__21475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__QuestionAssignment_2_in_rule__Selection__Group__2__Impl1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__31532 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__31535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Selection__Group__3__Impl1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__41594 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__41597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__ChoicesAssignment_4_in_rule__Selection__Group__4__Impl1624 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__51655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Selection__Group__5__Impl1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__01726 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__01729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__FreetextAssignment_0_in_rule__Choice__Group__0__Impl1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__11787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__11790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__NameAssignment_1_in_rule__Choice__Group__1__Impl1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__21847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__BulletPointAssignment_2_in_rule__Choice__Group__2__Impl1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_11915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_21946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__GreetingAssignment_31977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__DurationAssignment_42008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_52039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_12070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_32101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Freetext__NameAssignment_12132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Freetext__QuestionAssignment_22163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_12194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Selection__QuestionAssignment_22225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__Selection__ChoicesAssignment_42256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Choice__FreetextAssignment_02292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_12331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Choice__BulletPointAssignment_22362 = new BitSet(new long[]{0x0000000000000002L});

}