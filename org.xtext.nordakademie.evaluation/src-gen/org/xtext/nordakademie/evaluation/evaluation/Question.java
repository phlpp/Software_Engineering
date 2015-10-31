/**
 */
package org.xtext.nordakademie.evaluation.evaluation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Question#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Question#getQuestionText <em>Question Text</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Question#getHelpText <em>Help Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject
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
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getQuestion_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Question#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Question Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question Text</em>' attribute.
   * @see #setQuestionText(String)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getQuestion_QuestionText()
   * @model
   * @generated
   */
  String getQuestionText();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Question#getQuestionText <em>Question Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question Text</em>' attribute.
   * @see #getQuestionText()
   * @generated
   */
  void setQuestionText(String value);

  /**
   * Returns the value of the '<em><b>Help Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Help Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Help Text</em>' attribute.
   * @see #setHelpText(String)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getQuestion_HelpText()
   * @model
   * @generated
   */
  String getHelpText();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Question#getHelpText <em>Help Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Help Text</em>' attribute.
   * @see #getHelpText()
   * @generated
   */
  void setHelpText(String value);

} // Question
