/**
 */
package org.xtext.nordakademie.evaluation.evaluation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getGreeting <em>Greeting</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getSurvey()
 * @model
 * @generated
 */
public interface Survey extends EObject
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
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getSurvey_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getSurvey_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Greeting</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greeting</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greeting</em>' attribute.
   * @see #setGreeting(String)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getSurvey_Greeting()
   * @model
   * @generated
   */
  String getGreeting();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Survey#getGreeting <em>Greeting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Greeting</em>' attribute.
   * @see #getGreeting()
   * @generated
   */
  void setGreeting(String value);

  /**
   * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nordakademie.evaluation.evaluation.Page}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pages</em>' containment reference list.
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getSurvey_Pages()
   * @model containment="true"
   * @generated
   */
  EList<Page> getPages();

} // Survey
