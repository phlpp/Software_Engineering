/**
 */
package org.xtext.nordakademie.evaluation.evaluation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nordakademie.evaluation.evaluation.Bullet;
import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bullet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.BulletImpl#isFreetext <em>Freetext</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.BulletImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.BulletImpl#getBulletText <em>Bullet Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BulletImpl extends MinimalEObjectImpl.Container implements Bullet
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
   * The default value of the '{@link #getBulletText() <em>Bullet Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBulletText()
   * @generated
   * @ordered
   */
  protected static final String BULLET_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBulletText() <em>Bullet Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBulletText()
   * @generated
   * @ordered
   */
  protected String bulletText = BULLET_TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BulletImpl()
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
    return EvaluationPackage.Literals.BULLET;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.BULLET__FREETEXT, oldFreetext, freetext));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.BULLET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBulletText()
  {
    return bulletText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBulletText(String newBulletText)
  {
    String oldBulletText = bulletText;
    bulletText = newBulletText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.BULLET__BULLET_TEXT, oldBulletText, bulletText));
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
      case EvaluationPackage.BULLET__FREETEXT:
        return isFreetext();
      case EvaluationPackage.BULLET__NAME:
        return getName();
      case EvaluationPackage.BULLET__BULLET_TEXT:
        return getBulletText();
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
      case EvaluationPackage.BULLET__FREETEXT:
        setFreetext((Boolean)newValue);
        return;
      case EvaluationPackage.BULLET__NAME:
        setName((String)newValue);
        return;
      case EvaluationPackage.BULLET__BULLET_TEXT:
        setBulletText((String)newValue);
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
      case EvaluationPackage.BULLET__FREETEXT:
        setFreetext(FREETEXT_EDEFAULT);
        return;
      case EvaluationPackage.BULLET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EvaluationPackage.BULLET__BULLET_TEXT:
        setBulletText(BULLET_TEXT_EDEFAULT);
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
      case EvaluationPackage.BULLET__FREETEXT:
        return freetext != FREETEXT_EDEFAULT;
      case EvaluationPackage.BULLET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EvaluationPackage.BULLET__BULLET_TEXT:
        return BULLET_TEXT_EDEFAULT == null ? bulletText != null : !BULLET_TEXT_EDEFAULT.equals(bulletText);
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
    result.append(", bulletText: ");
    result.append(bulletText);
    result.append(')');
    return result.toString();
  }

} //BulletImpl
