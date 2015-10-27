/**
 */
package org.xtext.nordakademie.evaluation.evaluation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Page#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Page#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Page#isForwarding <em>Forwarding</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Page#getFollowingPage <em>Following Page</em>}</li>
 * </ul>
 *
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject
{
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
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getPage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Page#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Question</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' containment reference.
   * @see #setQuestion(Question)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getPage_Question()
   * @model containment="true"
   * @generated
   */
  Question getQuestion();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Page#getQuestion <em>Question</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' containment reference.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(Question value);

  /**
   * Returns the value of the '<em><b>Forwarding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forwarding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forwarding</em>' attribute.
   * @see #setForwarding(boolean)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getPage_Forwarding()
   * @model
   * @generated
   */
  boolean isForwarding();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Page#isForwarding <em>Forwarding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forwarding</em>' attribute.
   * @see #isForwarding()
   * @generated
   */
  void setForwarding(boolean value);

  /**
   * Returns the value of the '<em><b>Following Page</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Following Page</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Following Page</em>' reference.
   * @see #setFollowingPage(Page)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getPage_FollowingPage()
   * @model
   * @generated
   */
  Page getFollowingPage();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Page#getFollowingPage <em>Following Page</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Following Page</em>' reference.
   * @see #getFollowingPage()
   * @generated
   */
  void setFollowingPage(Page value);

} // Page
