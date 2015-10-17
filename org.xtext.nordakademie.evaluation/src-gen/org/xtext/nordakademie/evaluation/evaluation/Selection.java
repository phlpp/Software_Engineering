/**
 */
package org.xtext.nordakademie.evaluation.evaluation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Selection#getChoices <em>Choices</em>}</li>
 * </ul>
 *
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends Question
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
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getSelection_Choices()
   * @model containment="true"
   * @generated
   */
  EList<Choice> getChoices();

} // Selection
