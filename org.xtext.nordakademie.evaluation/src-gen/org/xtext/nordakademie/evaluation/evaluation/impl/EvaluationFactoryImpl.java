/**
 */
package org.xtext.nordakademie.evaluation.evaluation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.nordakademie.evaluation.evaluation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluationFactoryImpl extends EFactoryImpl implements EvaluationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EvaluationFactory init()
  {
    try
    {
      EvaluationFactory theEvaluationFactory = (EvaluationFactory)EPackage.Registry.INSTANCE.getEFactory(EvaluationPackage.eNS_URI);
      if (theEvaluationFactory != null)
      {
        return theEvaluationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EvaluationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EvaluationPackage.SURVEY: return createSurvey();
      case EvaluationPackage.PAGE: return createPage();
      case EvaluationPackage.QUESTION: return createQuestion();
      case EvaluationPackage.FREETEXT: return createFreetext();
      case EvaluationPackage.RATING: return createRating();
      case EvaluationPackage.CHOICE: return createChoice();
      case EvaluationPackage.SELECTION: return createSelection();
      case EvaluationPackage.CHART: return createChart();
      case EvaluationPackage.BULLET: return createBullet();
      case EvaluationPackage.GRADUATION: return createGraduation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Survey createSurvey()
  {
    SurveyImpl survey = new SurveyImpl();
    return survey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page createPage()
  {
    PageImpl page = new PageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Freetext createFreetext()
  {
    FreetextImpl freetext = new FreetextImpl();
    return freetext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rating createRating()
  {
    RatingImpl rating = new RatingImpl();
    return rating;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choice createChoice()
  {
    ChoiceImpl choice = new ChoiceImpl();
    return choice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selection createSelection()
  {
    SelectionImpl selection = new SelectionImpl();
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chart createChart()
  {
    ChartImpl chart = new ChartImpl();
    return chart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bullet createBullet()
  {
    BulletImpl bullet = new BulletImpl();
    return bullet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Graduation createGraduation()
  {
    GraduationImpl graduation = new GraduationImpl();
    return graduation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationPackage getEvaluationPackage()
  {
    return (EvaluationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EvaluationPackage getPackage()
  {
    return EvaluationPackage.eINSTANCE;
  }

} //EvaluationFactoryImpl
