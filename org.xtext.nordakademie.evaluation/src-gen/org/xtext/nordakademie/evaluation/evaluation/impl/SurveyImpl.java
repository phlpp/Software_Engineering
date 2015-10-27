/**
 */
package org.xtext.nordakademie.evaluation.evaluation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage;
import org.xtext.nordakademie.evaluation.evaluation.Page;
import org.xtext.nordakademie.evaluation.evaluation.Survey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.SurveyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.SurveyImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.SurveyImpl#getGreeting <em>Greeting</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.SurveyImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyImpl extends MinimalEObjectImpl.Container implements Survey
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
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getGreeting() <em>Greeting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreeting()
   * @generated
   * @ordered
   */
  protected static final String GREETING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGreeting() <em>Greeting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreeting()
   * @generated
   * @ordered
   */
  protected String greeting = GREETING_EDEFAULT;

  /**
   * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPages()
   * @generated
   * @ordered
   */
  protected EList<Page> pages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SurveyImpl()
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
    return EvaluationPackage.Literals.SURVEY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.SURVEY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.SURVEY__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGreeting()
  {
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreeting(String newGreeting)
  {
    String oldGreeting = greeting;
    greeting = newGreeting;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.SURVEY__GREETING, oldGreeting, greeting));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Page> getPages()
  {
    if (pages == null)
    {
      pages = new EObjectContainmentEList<Page>(Page.class, this, EvaluationPackage.SURVEY__PAGES);
    }
    return pages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EvaluationPackage.SURVEY__PAGES:
        return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EvaluationPackage.SURVEY__NAME:
        return getName();
      case EvaluationPackage.SURVEY__TITLE:
        return getTitle();
      case EvaluationPackage.SURVEY__GREETING:
        return getGreeting();
      case EvaluationPackage.SURVEY__PAGES:
        return getPages();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EvaluationPackage.SURVEY__NAME:
        setName((String)newValue);
        return;
      case EvaluationPackage.SURVEY__TITLE:
        setTitle((String)newValue);
        return;
      case EvaluationPackage.SURVEY__GREETING:
        setGreeting((String)newValue);
        return;
      case EvaluationPackage.SURVEY__PAGES:
        getPages().clear();
        getPages().addAll((Collection<? extends Page>)newValue);
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
      case EvaluationPackage.SURVEY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EvaluationPackage.SURVEY__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case EvaluationPackage.SURVEY__GREETING:
        setGreeting(GREETING_EDEFAULT);
        return;
      case EvaluationPackage.SURVEY__PAGES:
        getPages().clear();
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
      case EvaluationPackage.SURVEY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EvaluationPackage.SURVEY__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case EvaluationPackage.SURVEY__GREETING:
        return GREETING_EDEFAULT == null ? greeting != null : !GREETING_EDEFAULT.equals(greeting);
      case EvaluationPackage.SURVEY__PAGES:
        return pages != null && !pages.isEmpty();
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
    result.append(", title: ");
    result.append(title);
    result.append(", greeting: ");
    result.append(greeting);
    result.append(')');
    return result.toString();
  }

} //SurveyImpl
