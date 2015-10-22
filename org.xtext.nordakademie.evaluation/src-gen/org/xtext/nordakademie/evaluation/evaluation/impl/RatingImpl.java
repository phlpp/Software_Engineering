/**
 */
package org.xtext.nordakademie.evaluation.evaluation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage;
import org.xtext.nordakademie.evaluation.evaluation.Rating;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.RatingImpl#getRatingQuantity <em>Rating Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatingImpl extends QuestionImpl implements Rating
{
  /**
   * The default value of the '{@link #getRatingQuantity() <em>Rating Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRatingQuantity()
   * @generated
   * @ordered
   */
  protected static final int RATING_QUANTITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRatingQuantity() <em>Rating Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRatingQuantity()
   * @generated
   * @ordered
   */
  protected int ratingQuantity = RATING_QUANTITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RatingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EvaluationPackage.Literals.RATING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRatingQuantity()
  {
    return ratingQuantity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRatingQuantity(int newRatingQuantity)
  {
    int oldRatingQuantity = ratingQuantity;
    ratingQuantity = newRatingQuantity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.RATING__RATING_QUANTITY, oldRatingQuantity, ratingQuantity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EvaluationPackage.RATING__RATING_QUANTITY:
        return getRatingQuantity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EvaluationPackage.RATING__RATING_QUANTITY:
        setRatingQuantity((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EvaluationPackage.RATING__RATING_QUANTITY:
        setRatingQuantity(RATING_QUANTITY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EvaluationPackage.RATING__RATING_QUANTITY:
        return ratingQuantity != RATING_QUANTITY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ratingQuantity: ");
    result.append(ratingQuantity);
    result.append(')');
    return result.toString();
  }

} //RatingImpl
