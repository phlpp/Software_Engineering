/**
 */
package org.xtext.nordakademie.evaluation.evaluation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nordakademie.evaluation.evaluation.Choice;
import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.ChoiceImpl#isFreetext <em>Freetext</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.ChoiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.ChoiceImpl#getBulletPoint <em>Bullet Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoiceImpl extends MinimalEObjectImpl.Container implements Choice
{
  /**
   * The default value of the '{@link #isFreetext() <em>Freetext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFreetext()
   * @generated
   * @ordered
   */
  protected static final boolean FREETEXT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFreetext() <em>Freetext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFreetext()
   * @generated
   * @ordered
   */
  protected boolean freetext = FREETEXT_EDEFAULT;

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
   * The default value of the '{@link #getBulletPoint() <em>Bullet Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBulletPoint()
   * @generated
   * @ordered
   */
  protected static final String BULLET_POINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBulletPoint() <em>Bullet Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBulletPoint()
   * @generated
   * @ordered
   */
  protected String bulletPoint = BULLET_POINT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChoiceImpl()
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
    return EvaluationPackage.Literals.CHOICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFreetext()
  {
    return freetext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFreetext(boolean newFreetext)
  {
    boolean oldFreetext = freetext;
    freetext = newFreetext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.CHOICE__FREETEXT, oldFreetext, freetext));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.CHOICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBulletPoint()
  {
    return bulletPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBulletPoint(String newBulletPoint)
  {
    String oldBulletPoint = bulletPoint;
    bulletPoint = newBulletPoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.CHOICE__BULLET_POINT, oldBulletPoint, bulletPoint));
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
      case EvaluationPackage.CHOICE__FREETEXT:
        return isFreetext();
      case EvaluationPackage.CHOICE__NAME:
        return getName();
      case EvaluationPackage.CHOICE__BULLET_POINT:
        return getBulletPoint();
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
      case EvaluationPackage.CHOICE__FREETEXT:
        setFreetext((Boolean)newValue);
        return;
      case EvaluationPackage.CHOICE__NAME:
        setName((String)newValue);
        return;
      case EvaluationPackage.CHOICE__BULLET_POINT:
        setBulletPoint((String)newValue);
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
      case EvaluationPackage.CHOICE__FREETEXT:
        setFreetext(FREETEXT_EDEFAULT);
        return;
      case EvaluationPackage.CHOICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EvaluationPackage.CHOICE__BULLET_POINT:
        setBulletPoint(BULLET_POINT_EDEFAULT);
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
      case EvaluationPackage.CHOICE__FREETEXT:
        return freetext != FREETEXT_EDEFAULT;
      case EvaluationPackage.CHOICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EvaluationPackage.CHOICE__BULLET_POINT:
        return BULLET_POINT_EDEFAULT == null ? bulletPoint != null : !BULLET_POINT_EDEFAULT.equals(bulletPoint);
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
    result.append(" (freetext: ");
    result.append(freetext);
    result.append(", name: ");
    result.append(name);
    result.append(", bulletPoint: ");
    result.append(bulletPoint);
    result.append(')');
    return result.toString();
  }

} //ChoiceImpl
