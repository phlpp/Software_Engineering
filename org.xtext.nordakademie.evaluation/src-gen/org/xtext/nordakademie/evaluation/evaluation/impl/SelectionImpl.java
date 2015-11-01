/**
 */
package org.xtext.nordakademie.evaluation.evaluation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage;
import org.xtext.nordakademie.evaluation.evaluation.Selection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.SelectionImpl#isOneChoice <em>One Choice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionImpl extends ChoiceImpl implements Selection
{
  /**
   * The default value of the '{@link #isOneChoice() <em>One Choice</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOneChoice()
   * @generated
   * @ordered
   */
  protected static final boolean ONE_CHOICE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOneChoice() <em>One Choice</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOneChoice()
   * @generated
   * @ordered
   */
  protected boolean oneChoice = ONE_CHOICE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectionImpl()
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
    return EvaluationPackage.Literals.SELECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOneChoice()
  {
    return oneChoice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOneChoice(boolean newOneChoice)
  {
    boolean oldOneChoice = oneChoice;
    oneChoice = newOneChoice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.SELECTION__ONE_CHOICE, oldOneChoice, oneChoice));
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
      case EvaluationPackage.SELECTION__ONE_CHOICE:
        return isOneChoice();
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
      case EvaluationPackage.SELECTION__ONE_CHOICE:
        setOneChoice((Boolean)newValue);
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
      case EvaluationPackage.SELECTION__ONE_CHOICE:
        setOneChoice(ONE_CHOICE_EDEFAULT);
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
      case EvaluationPackage.SELECTION__ONE_CHOICE:
        return oneChoice != ONE_CHOICE_EDEFAULT;
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
    result.append(" (oneChoice: ");
    result.append(oneChoice);
    result.append(')');
    return result.toString();
  }

} //SelectionImpl
