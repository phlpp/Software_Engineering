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
   * The feature id for the '<em><b>Pages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY__PAGES = 3;

  /**
   * The number of structural features of the '<em>Survey</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.PageImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getPage()
   * @generated
   */
  int PAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Question</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__QUESTION = 1;

  /**
   * The feature id for the '<em><b>Forwarding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__FORWARDING = 2;

  /**
   * The feature id for the '<em><b>Following Page</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__FOLLOWING_PAGE = 3;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.QuestionImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Question Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__QUESTION_TEXT = 1;

  /**
   * The feature id for the '<em><b>Help Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__HELP_TEXT = 2;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.FreetextImpl <em>Freetext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.FreetextImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getFreetext()
   * @generated
   */
  int FREETEXT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREETEXT__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Question Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREETEXT__QUESTION_TEXT = QUESTION__QUESTION_TEXT;

  /**
   * The feature id for the '<em><b>Help Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREETEXT__HELP_TEXT = QUESTION__HELP_TEXT;

  /**
   * The number of structural features of the '<em>Freetext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREETEXT_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.RatingImpl <em>Rating</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.RatingImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getRating()
   * @generated
   */
  int RATING = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Question Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING__QUESTION_TEXT = QUESTION__QUESTION_TEXT;

  /**
   * The feature id for the '<em><b>Help Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING__HELP_TEXT = QUESTION__HELP_TEXT;

  /**
   * The feature id for the '<em><b>Rating Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING__RATING_QUANTITY = QUESTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rating</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATING_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.ChoiceImpl <em>Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.ChoiceImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getChoice()
   * @generated
   */
  int CHOICE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Question Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__QUESTION_TEXT = QUESTION__QUESTION_TEXT;

  /**
   * The feature id for the '<em><b>Help Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__HELP_TEXT = QUESTION__HELP_TEXT;

  /**
   * The feature id for the '<em><b>Bullets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__BULLETS = QUESTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.SelectionImpl <em>Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.SelectionImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getSelection()
   * @generated
   */
  int SELECTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__NAME = CHOICE__NAME;

  /**
   * The feature id for the '<em><b>Question Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__QUESTION_TEXT = CHOICE__QUESTION_TEXT;

  /**
   * The feature id for the '<em><b>Help Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__HELP_TEXT = CHOICE__HELP_TEXT;

  /**
   * The feature id for the '<em><b>Bullets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__BULLETS = CHOICE__BULLETS;

  /**
   * The feature id for the '<em><b>One Choice</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__ONE_CHOICE = CHOICE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_FEATURE_COUNT = CHOICE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.ChartImpl <em>Chart</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.ChartImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getChart()
   * @generated
   */
  int CHART = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__NAME = CHOICE__NAME;

  /**
   * The feature id for the '<em><b>Question Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__QUESTION_TEXT = CHOICE__QUESTION_TEXT;

  /**
   * The feature id for the '<em><b>Help Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__HELP_TEXT = CHOICE__HELP_TEXT;

  /**
   * The feature id for the '<em><b>Bullets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__BULLETS = CHOICE__BULLETS;

  /**
   * The feature id for the '<em><b>Graduations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__GRADUATIONS = CHOICE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Chart</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_FEATURE_COUNT = CHOICE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.BulletImpl <em>Bullet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.BulletImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getBullet()
   * @generated
   */
  int BULLET = 8;

  /**
   * The feature id for the '<em><b>Freetext</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BULLET__FREETEXT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BULLET__NAME = 1;

  /**
   * The feature id for the '<em><b>Bullet Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BULLET__BULLET_TEXT = 2;

  /**
   * The number of structural features of the '<em>Bullet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BULLET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.GraduationImpl <em>Graduation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.GraduationImpl
   * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getGraduation()
   * @generated
   */
  int GRADUATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADUATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Graduation Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADUATION__GRADUATION_TEXT = 1;

  /**
   * The number of structural features of the '<em>Graduation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADUATION_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference list '{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Survey#getPages()
   * @see #getSurvey()
   * @generated
   */
  EReference getSurvey_Pages();

  /**
   * Returns the meta object for class '{@link org.xtext.nordakademie.evaluation.evaluation.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nordakademie.evaluation.evaluation.Page#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Question</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Page#getQuestion()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Question();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Page#isForwarding <em>Forwarding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Forwarding</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Page#isForwarding()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Forwarding();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nordakademie.evaluation.evaluation.Page#getFollowingPage <em>Following Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Following Page</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Page#getFollowingPage()
   * @see #getPage()
   * @generated
   */
  EReference getPage_FollowingPage();

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
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Question#getQuestionText <em>Question Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question Text</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Question#getQuestionText()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_QuestionText();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Question#getHelpText <em>Help Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Help Text</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Question#getHelpText()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_HelpText();

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
   * Returns the meta object for class '{@link org.xtext.nordakademie.evaluation.evaluation.Rating <em>Rating</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rating</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Rating
   * @generated
   */
  EClass getRating();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Rating#getRatingQuantity <em>Rating Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rating Quantity</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Rating#getRatingQuantity()
   * @see #getRating()
   * @generated
   */
  EAttribute getRating_RatingQuantity();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.nordakademie.evaluation.evaluation.Choice#getBullets <em>Bullets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bullets</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Choice#getBullets()
   * @see #getChoice()
   * @generated
   */
  EReference getChoice_Bullets();

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
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Selection#isOneChoice <em>One Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>One Choice</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Selection#isOneChoice()
   * @see #getSelection()
   * @generated
   */
  EAttribute getSelection_OneChoice();

  /**
   * Returns the meta object for class '{@link org.xtext.nordakademie.evaluation.evaluation.Chart <em>Chart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chart</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Chart
   * @generated
   */
  EClass getChart();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nordakademie.evaluation.evaluation.Chart#getGraduations <em>Graduations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Graduations</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Chart#getGraduations()
   * @see #getChart()
   * @generated
   */
  EReference getChart_Graduations();

  /**
   * Returns the meta object for class '{@link org.xtext.nordakademie.evaluation.evaluation.Bullet <em>Bullet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bullet</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Bullet
   * @generated
   */
  EClass getBullet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Bullet#isFreetext <em>Freetext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Freetext</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Bullet#isFreetext()
   * @see #getBullet()
   * @generated
   */
  EAttribute getBullet_Freetext();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Bullet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Bullet#getName()
   * @see #getBullet()
   * @generated
   */
  EAttribute getBullet_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Bullet#getBulletText <em>Bullet Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bullet Text</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Bullet#getBulletText()
   * @see #getBullet()
   * @generated
   */
  EAttribute getBullet_BulletText();

  /**
   * Returns the meta object for class '{@link org.xtext.nordakademie.evaluation.evaluation.Graduation <em>Graduation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graduation</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Graduation
   * @generated
   */
  EClass getGraduation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Graduation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Graduation#getName()
   * @see #getGraduation()
   * @generated
   */
  EAttribute getGraduation_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nordakademie.evaluation.evaluation.Graduation#getGraduationText <em>Graduation Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Graduation Text</em>'.
   * @see org.xtext.nordakademie.evaluation.evaluation.Graduation#getGraduationText()
   * @see #getGraduation()
   * @generated
   */
  EAttribute getGraduation_GraduationText();

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
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SURVEY__PAGES = eINSTANCE.getSurvey_Pages();

    /**
     * The meta object literal for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.PageImpl
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__QUESTION = eINSTANCE.getPage_Question();

    /**
     * The meta object literal for the '<em><b>Forwarding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__FORWARDING = eINSTANCE.getPage_Forwarding();

    /**
     * The meta object literal for the '<em><b>Following Page</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__FOLLOWING_PAGE = eINSTANCE.getPage_FollowingPage();

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
     * The meta object literal for the '<em><b>Question Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__QUESTION_TEXT = eINSTANCE.getQuestion_QuestionText();

    /**
     * The meta object literal for the '<em><b>Help Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__HELP_TEXT = eINSTANCE.getQuestion_HelpText();

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
     * The meta object literal for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.RatingImpl <em>Rating</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.RatingImpl
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getRating()
     * @generated
     */
    EClass RATING = eINSTANCE.getRating();

    /**
     * The meta object literal for the '<em><b>Rating Quantity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RATING__RATING_QUANTITY = eINSTANCE.getRating_RatingQuantity();

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
     * The meta object literal for the '<em><b>Bullets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOICE__BULLETS = eINSTANCE.getChoice_Bullets();

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
     * The meta object literal for the '<em><b>One Choice</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTION__ONE_CHOICE = eINSTANCE.getSelection_OneChoice();

    /**
     * The meta object literal for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.ChartImpl <em>Chart</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.ChartImpl
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getChart()
     * @generated
     */
    EClass CHART = eINSTANCE.getChart();

    /**
     * The meta object literal for the '<em><b>Graduations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHART__GRADUATIONS = eINSTANCE.getChart_Graduations();

    /**
     * The meta object literal for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.BulletImpl <em>Bullet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.BulletImpl
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getBullet()
     * @generated
     */
    EClass BULLET = eINSTANCE.getBullet();

    /**
     * The meta object literal for the '<em><b>Freetext</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BULLET__FREETEXT = eINSTANCE.getBullet_Freetext();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BULLET__NAME = eINSTANCE.getBullet_Name();

    /**
     * The meta object literal for the '<em><b>Bullet Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BULLET__BULLET_TEXT = eINSTANCE.getBullet_BulletText();

    /**
     * The meta object literal for the '{@link org.xtext.nordakademie.evaluation.evaluation.impl.GraduationImpl <em>Graduation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.GraduationImpl
     * @see org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationPackageImpl#getGraduation()
     * @generated
     */
    EClass GRADUATION = eINSTANCE.getGraduation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADUATION__NAME = eINSTANCE.getGraduation_Name();

    /**
     * The meta object literal for the '<em><b>Graduation Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADUATION__GRADUATION_TEXT = eINSTANCE.getGraduation_GraduationText();

  }

} //EvaluationPackage
