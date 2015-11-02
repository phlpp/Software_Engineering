/**
 */
package org.xtext.nordakademie.evaluation.evaluation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Selection#isOneChoice <em>One Choice</em>}</li>
 * </ul>
 *
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends Choice
{
  /**
   * Returns the value of the '<em><b>One Choice</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One Choice</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>One Choice</em>' attribute.
   * @see #setOneChoice(boolean)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getSelection_OneChoice()
   * @model
   * @generated
   */
  boolean isOneChoice();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Selection#isOneChoice <em>One Choice</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>One Choice</em>' attribute.
   * @see #isOneChoice()
   * @generated
   */
  void setOneChoice(boolean value);

} // Selection
