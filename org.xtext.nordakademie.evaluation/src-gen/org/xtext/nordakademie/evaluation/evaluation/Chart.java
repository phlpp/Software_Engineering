/**
 */
package org.xtext.nordakademie.evaluation.evaluation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Chart#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Chart#getGraduations <em>Graduations</em>}</li>
 * </ul>
 *
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getChart()
 * @model
 * @generated
 */
public interface Chart extends Question
{
  /**
   * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nordakademie.evaluation.evaluation.Choice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choices</em>' containment reference list.
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getChart_Choices()
   * @model containment="true"
   * @generated
   */
  EList<Choice> getChoices();

  /**
   * Returns the value of the '<em><b>Graduations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nordakademie.evaluation.evaluation.Graduation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graduations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graduations</em>' containment reference list.
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getChart_Graduations()
   * @model containment="true"
   * @generated
   */
  EList<Graduation> getGraduations();

} // Chart
