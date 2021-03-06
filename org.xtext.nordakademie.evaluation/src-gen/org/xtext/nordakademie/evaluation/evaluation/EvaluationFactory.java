/**
 */
package org.xtext.nordakademie.evaluation.evaluation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage
 * @generated
 */
public interface EvaluationFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EvaluationFactory eINSTANCE = org.xtext.nordakademie.evaluation.evaluation.impl.EvaluationFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Survey</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Survey</em>'.
   * @generated
   */
  Survey createSurvey();

  /**
   * Returns a new object of class '<em>Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page</em>'.
   * @generated
   */
  Page createPage();

  /**
   * Returns a new object of class '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Question</em>'.
   * @generated
   */
  Question createQuestion();

  /**
   * Returns a new object of class '<em>Freetext</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Freetext</em>'.
   * @generated
   */
  Freetext createFreetext();

  /**
   * Returns a new object of class '<em>Rating</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rating</em>'.
   * @generated
   */
  Rating createRating();

  /**
   * Returns a new object of class '<em>Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choice</em>'.
   * @generated
   */
  Choice createChoice();

  /**
   * Returns a new object of class '<em>Selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection</em>'.
   * @generated
   */
  Selection createSelection();

  /**
   * Returns a new object of class '<em>Chart</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chart</em>'.
   * @generated
   */
  Chart createChart();

  /**
   * Returns a new object of class '<em>Bullet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bullet</em>'.
   * @generated
   */
  Bullet createBullet();

  /**
   * Returns a new object of class '<em>Graduation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graduation</em>'.
   * @generated
   */
  Graduation createGraduation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EvaluationPackage getEvaluationPackage();

} //EvaluationFactory
