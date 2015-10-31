/**
 */
package org.xtext.nordakademie.evaluation.evaluation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bullet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Bullet#isFreetext <em>Freetext</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Bullet#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Bullet#getBulletText <em>Bullet Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getBullet()
 * @model
 * @generated
 */
public interface Bullet extends EObject
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
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getBullet_Freetext()
   * @model
   * @generated
   */
  boolean isFreetext();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Bullet#isFreetext <em>Freetext</em>}' attribute.
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
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getBullet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Bullet#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Bullet Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bullet Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bullet Text</em>' attribute.
   * @see #setBulletText(String)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getBullet_BulletText()
   * @model
   * @generated
   */
  String getBulletText();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Bullet#getBulletText <em>Bullet Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bullet Text</em>' attribute.
   * @see #getBulletText()
   * @generated
   */
  void setBulletText(String value);

} // Bullet
