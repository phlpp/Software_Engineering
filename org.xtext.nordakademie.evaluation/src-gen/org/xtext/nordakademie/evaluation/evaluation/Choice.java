/**
 */
package org.xtext.nordakademie.evaluation.evaluation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Choice#getBullets <em>Bullets</em>}</li>
 * </ul>
 *
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends Question
{
  /**
   * Returns the value of the '<em><b>Bullets</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nordakademie.evaluation.evaluation.Bullet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bullets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bullets</em>' containment reference list.
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getChoice_Bullets()
   * @model containment="true"
   * @generated
   */
  EList<Bullet> getBullets();

} // Choice
