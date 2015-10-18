/**
 */
package org.xtext.nordakademie.evaluation.evaluation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Choice#isFreetext <em>Freetext</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Choice#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Choice#getBulletPoint <em>Bullet Point</em>}</li>
 * </ul>
 *
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends EObject
{
  /**
   * Returns the value of the '<em><b>Freetext</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Freetext</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Freetext</em>' attribute.
   * @see #setFreetext(boolean)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getChoice_Freetext()
   * @model
   * @generated
   */
  boolean isFreetext();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Choice#isFreetext <em>Freetext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Freetext</em>' attribute.
   * @see #isFreetext()
   * @generated
   */
  void setFreetext(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getChoice_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Choice#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Bullet Point</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bullet Point</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bullet Point</em>' attribute.
   * @see #setBulletPoint(String)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getChoice_BulletPoint()
   * @model
   * @generated
   */
  String getBulletPoint();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Choice#getBulletPoint <em>Bullet Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bullet Point</em>' attribute.
   * @see #getBulletPoint()
   * @generated
   */
  void setBulletPoint(String value);

} // Choice
