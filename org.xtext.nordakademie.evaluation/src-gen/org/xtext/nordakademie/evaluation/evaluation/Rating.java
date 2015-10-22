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
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.Rating#getRatingQuantity <em>Rating Quantity</em>}</li>
 * </ul>
 *
 * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getRating()
 * @model
 * @generated
 */
public interface Rating extends Question
{
  /**
   * Returns the value of the '<em><b>Rating Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rating Quantity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rating Quantity</em>' attribute.
   * @see #setRatingQuantity(int)
   * @see org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage#getRating_RatingQuantity()
   * @model
   * @generated
   */
  int getRatingQuantity();

  /**
   * Sets the value of the '{@link org.xtext.nordakademie.evaluation.evaluation.Rating#getRatingQuantity <em>Rating Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rating Quantity</em>' attribute.
   * @see #getRatingQuantity()
   * @generated
   */
  void setRatingQuantity(int value);

} // Rating
