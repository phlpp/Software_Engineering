/**
 */
package org.xtext.nordakademie.evaluation.evaluation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage;
import org.xtext.nordakademie.evaluation.evaluation.Graduation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graduation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.GraduationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.GraduationImpl#getGraduationText <em>Graduation Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraduationImpl extends MinimalEObjectImpl.Container implements Graduation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getGraduationText() <em>Graduation Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraduationText()
   * @generated
   * @ordered
   */
  protected static final String GRADUATION_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGraduationText() <em>Graduation Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraduationText()
   * @generated
   * @ordered
   */
  protected String graduationText = GRADUATION_TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraduationImpl()
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
    return EvaluationPackage.Literals.GRADUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.GRADUATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGraduationText()
  {
    return graduationText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGraduationText(String newGraduationText)
  {
    String oldGraduationText = graduationText;
    graduationText = newGraduationText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.GRADUATION__GRADUATION_TEXT, oldGraduationText, graduationText));
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
      case EvaluationPackage.GRADUATION__NAME:
        return getName();
      case EvaluationPackage.GRADUATION__GRADUATION_TEXT:
        return getGraduationText();
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
      case EvaluationPackage.GRADUATION__NAME:
        setName((String)newValue);
        return;
      case EvaluationPackage.GRADUATION__GRADUATION_TEXT:
        setGraduationText((String)newValue);
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
      case EvaluationPackage.GRADUATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EvaluationPackage.GRADUATION__GRADUATION_TEXT:
        setGraduationText(GRADUATION_TEXT_EDEFAULT);
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
      case EvaluationPackage.GRADUATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EvaluationPackage.GRADUATION__GRADUATION_TEXT:
        return GRADUATION_TEXT_EDEFAULT == null ? graduationText != null : !GRADUATION_TEXT_EDEFAULT.equals(graduationText);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", graduationText: ");
    result.append(graduationText);
    result.append(')');
    return result.toString();
  }

} //GraduationImpl
