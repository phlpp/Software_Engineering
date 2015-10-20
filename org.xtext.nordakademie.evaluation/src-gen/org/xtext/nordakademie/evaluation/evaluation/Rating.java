/**
 */
package org.xtext.nordakademie.evaluation.evaluation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Rating#getRating <em>Rating</em>}</li>
 * </ul>
 *
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getRating()
 * @model
 * @generated
 */
public interface Rating extends Question
{
  /**
   * Returns the value of the '<em><b>Rating</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rating</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rating</em>' attribute.
   * @see #setRating(int)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getRating_Rating()
   * @model
   * @generated
   */
  int getRating();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Rating#getRating <em>Rating</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rating</em>' attribute.
   * @see #getRating()
   * @generated
   */
  void setRating(int value);

} // Rating
