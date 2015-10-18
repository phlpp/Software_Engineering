/**
 */
package org.xtext.nordakademie.evaluation.evaluation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationFactory
 * @model kind="package"
 * @generated
 */
public interface EvaluationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "evaluation";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/nordakademie/evaluation/Evaluation";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "evaluation";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EvaluationPackage eINSTANCE = org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.SurveyImpl <em>Survey</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.SurveyImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getSurvey()
   * @generated
   */
  int SURVEY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY__TITLE = 1;

  /**
   * The feature id for the '<em><b>Greeting</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY__GREETING = 2;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY__DURATION = 3;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY__QUESTIONS = 4;

  /**
   * The number of structural features of the '<em>Survey</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.QuestionImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__QUESTION = 1;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.FreetextImpl <em>Freetext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.FreetextImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getFreetext()
   * @generated
   */
  int FREETEXT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREETEXT__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREETEXT__QUESTION = QUESTION__QUESTION;

  /**
   * The number of structural features of the '<em>Freetext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREETEXT_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.SelectionImpl <em>Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.SelectionImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getSelection()
   * @generated
   */
  int SELECTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__QUESTION = QUESTION__QUESTION;

  /**
   * The feature id for the '<em><b>Choices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__CHOICES = QUESTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.ChoiceImpl <em>Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.ChoiceImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getChoice()
   * @generated
   */
  int CHOICE = 4;

  /**
   * The feature id for the '<em><b>Freetext</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__FREETEXT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__NAME = 1;

  /**
   * The feature id for the '<em><b>Bullet Point</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__BULLET_POINT = 2;

  /**
   * The number of structural features of the '<em>Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.nordakademie.evaluation.evaluation.Survey <em>Survey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Survey</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Survey
   * @generated
   */
  EClass getSurvey();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Survey#getName()
   * @see #getSurvey()
   * @generated
   */
  EAttribute getSurvey_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Survey#getTitle()
   * @see #getSurvey()
   * @generated
   */
  EAttribute getSurvey_Title();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getGreeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Greeting</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Survey#getGreeting()
   * @see #getSurvey()
   * @generated
   */
  EAttribute getSurvey_Greeting();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Survey#getDuration()
   * @see #getSurvey()
   * @generated
   */
  EAttribute getSurvey_Duration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Survey#getQuestions()
   * @see #getSurvey()
   * @generated
   */
  EReference getSurvey_Questions();

  /**
   * Returns the meta object for class '{@link org.xtext.nordakademie.evaluation.evaluation.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Question#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Question#getName()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Question#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Question#getQuestion()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Question();

  /**
   * Returns the meta object for class '{@link org.xtext.nordakademie.evaluation.evaluation.Freetext <em>Freetext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Freetext</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Freetext
   * @generated
   */
  EClass getFreetext();

  /**
   * Returns the meta object for class '{@link org.xtext.nordakademie.evaluation.evaluation.Selection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Selection
   * @generated
   */
  EClass getSelection();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nordakademie.evaluation.evaluation.Selection#getChoices <em>Choices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choices</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Selection#getChoices()
   * @see #getSelection()
   * @generated
   */
  EReference getSelection_Choices();

  /**
   * Returns the meta object for class '{@link org.xtext.nordakademie.evaluation.evaluation.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Choice
   * @generated
   */
  EClass getChoice();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Choice#isFreetext <em>Freetext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Freetext</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Choice#isFreetext()
   * @see #getChoice()
   * @generated
   */
  EAttribute getChoice_Freetext();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Choice#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Choice#getName()
   * @see #getChoice()
   * @generated
   */
  EAttribute getChoice_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Choice#getBulletPoint <em>Bullet Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bullet Point</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Choice#getBulletPoint()
   * @see #getChoice()
   * @generated
   */
  EAttribute getChoice_BulletPoint();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EvaluationFactory getEvaluationFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.SurveyImpl <em>Survey</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.SurveyImpl
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getSurvey()
     * @generated
     */
    EClass SURVEY = eINSTANCE.getSurvey();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SURVEY__NAME = eINSTANCE.getSurvey_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SURVEY__TITLE = eINSTANCE.getSurvey_Title();

    /**
     * The meta object literal for the '<em><b>Greeting</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SURVEY__GREETING = eINSTANCE.getSurvey_Greeting();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SURVEY__DURATION = eINSTANCE.getSurvey_Duration();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SURVEY__QUESTIONS = eINSTANCE.getSurvey_Questions();

    /**
     * The meta object literal for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.QuestionImpl
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

    /**
     * The meta object literal for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.FreetextImpl <em>Freetext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.FreetextImpl
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getFreetext()
     * @generated
     */
    EClass FREETEXT = eINSTANCE.getFreetext();

    /**
     * The meta object literal for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.SelectionImpl <em>Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.SelectionImpl
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getSelection()
     * @generated
     */
    EClass SELECTION = eINSTANCE.getSelection();

    /**
     * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION__CHOICES = eINSTANCE.getSelection_Choices();

    /**
     * The meta object literal for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.ChoiceImpl <em>Choice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.ChoiceImpl
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getChoice()
     * @generated
     */
    EClass CHOICE = eINSTANCE.getChoice();

    /**
     * The meta object literal for the '<em><b>Freetext</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOICE__FREETEXT = eINSTANCE.getChoice_Freetext();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOICE__NAME = eINSTANCE.getChoice_Name();

    /**
     * The meta object literal for the '<em><b>Bullet Point</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOICE__BULLET_POINT = eINSTANCE.getChoice_BulletPoint();

  }

} //EvaluationPackage
