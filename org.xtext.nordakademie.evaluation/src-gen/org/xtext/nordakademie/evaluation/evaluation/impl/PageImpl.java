/**
 */
package org.xtext.nordakademie.evaluation.evaluation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage;
import org.xtext.nordakademie.evaluation.evaluation.Page;
import org.xtext.nordakademie.evaluation.evaluation.Question;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.PageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.PageImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.PageImpl#isForwarding <em>Forwarding</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.PageImpl#getFollowingPage <em>Following Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page
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
   * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected Question question;

  /**
   * The default value of the '{@link #isForwarding() <em>Forwarding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForwarding()
   * @generated
   * @ordered
   */
  protected static final boolean FORWARDING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isForwarding() <em>Forwarding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForwarding()
   * @generated
   * @ordered
   */
  protected boolean forwarding = FORWARDING_EDEFAULT;

  /**
   * The cached value of the '{@link #getFollowingPage() <em>Following Page</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFollowingPage()
   * @generated
   * @ordered
   */
  protected Page followingPage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageImpl()
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
    return EvaluationPackage.Literals.PAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.PAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question getQuestion()
  {
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuestion(Question newQuestion, NotificationChain msgs)
  {
    Question oldQuestion = question;
    question = newQuestion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluationPackage.PAGE__QUESTION, oldQuestion, newQuestion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuestion(Question newQuestion)
  {
    if (newQuestion != question)
    {
      NotificationChain msgs = null;
      if (question != null)
        msgs = ((InternalEObject)question).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvaluationPackage.PAGE__QUESTION, null, msgs);
      if (newQuestion != null)
        msgs = ((InternalEObject)newQuestion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvaluationPackage.PAGE__QUESTION, null, msgs);
      msgs = basicSetQuestion(newQuestion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.PAGE__QUESTION, newQuestion, newQuestion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isForwarding()
  {
    return forwarding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForwarding(boolean newForwarding)
  {
    boolean oldForwarding = forwarding;
    forwarding = newForwarding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.PAGE__FORWARDING, oldForwarding, forwarding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page getFollowingPage()
  {
    if (followingPage != null && followingPage.eIsProxy())
    {
      InternalEObject oldFollowingPage = (InternalEObject)followingPage;
      followingPage = (Page)eResolveProxy(oldFollowingPage);
      if (followingPage != oldFollowingPage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluationPackage.PAGE__FOLLOWING_PAGE, oldFollowingPage, followingPage));
      }
    }
    return followingPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page basicGetFollowingPage()
  {
    return followingPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFollowingPage(Page newFollowingPage)
  {
    Page oldFollowingPage = followingPage;
    followingPage = newFollowingPage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.PAGE__FOLLOWING_PAGE, oldFollowingPage, followingPage));
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
      case EvaluationPackage.PAGE__QUESTION:
        return basicSetQuestion(null, msgs);
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
      case EvaluationPackage.PAGE__NAME:
        return getName();
      case EvaluationPackage.PAGE__QUESTION:
        return getQuestion();
      case EvaluationPackage.PAGE__FORWARDING:
        return isForwarding();
      case EvaluationPackage.PAGE__FOLLOWING_PAGE:
        if (resolve) return getFollowingPage();
        return basicGetFollowingPage();
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
      case EvaluationPackage.PAGE__NAME:
        setName((String)newValue);
        return;
      case EvaluationPackage.PAGE__QUESTION:
        setQuestion((Question)newValue);
        return;
      case EvaluationPackage.PAGE__FORWARDING:
        setForwarding((Boolean)newValue);
        return;
      case EvaluationPackage.PAGE__FOLLOWING_PAGE:
        setFollowingPage((Page)newValue);
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
      case EvaluationPackage.PAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EvaluationPackage.PAGE__QUESTION:
        setQuestion((Question)null);
        return;
      case EvaluationPackage.PAGE__FORWARDING:
        setForwarding(FORWARDING_EDEFAULT);
        return;
      case EvaluationPackage.PAGE__FOLLOWING_PAGE:
        setFollowingPage((Page)null);
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
      case EvaluationPackage.PAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EvaluationPackage.PAGE__QUESTION:
        return question != null;
      case EvaluationPackage.PAGE__FORWARDING:
        return forwarding != FORWARDING_EDEFAULT;
      case EvaluationPackage.PAGE__FOLLOWING_PAGE:
        return followingPage != null;
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
    result.append(", forwarding: ");
    result.append(forwarding);
    result.append(')');
    return result.toString();
  }

} //PageImpl
