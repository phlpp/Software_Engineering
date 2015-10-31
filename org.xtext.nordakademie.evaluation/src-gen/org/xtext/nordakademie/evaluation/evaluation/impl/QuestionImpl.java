/**
 */
package org.xtext.nordakademie.evaluation.evaluation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage;
import org.xtext.nordakademie.evaluation.evaluation.Question;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.QuestionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.QuestionImpl#getQuestionText <em>Question Text</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.QuestionImpl#getHelpText <em>Help Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question
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
   * The default value of the '{@link #getQuestionText() <em>Question Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestionText()
   * @generated
   * @ordered
   */
  protected static final String QUESTION_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuestionText() <em>Question Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestionText()
   * @generated
   * @ordered
   */
  protected String questionText = QUESTION_TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getHelpText() <em>Help Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelpText()
   * @generated
   * @ordered
   */
  protected static final String HELP_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHelpText() <em>Help Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelpText()
   * @generated
   * @ordered
   */
  protected String helpText = HELP_TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionImpl()
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
    return EvaluationPackage.Literals.QUESTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.QUESTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuestionText()
  {
    return questionText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuestionText(String newQuestionText)
  {
    String oldQuestionText = questionText;
    questionText = newQuestionText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.QUESTION__QUESTION_TEXT, oldQuestionText, questionText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHelpText()
  {
    return helpText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHelpText(String newHelpText)
  {
    String oldHelpText = helpText;
    helpText = newHelpText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluationPackage.QUESTION__HELP_TEXT, oldHelpText, helpText));
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
      case EvaluationPackage.QUESTION__NAME:
        return getName();
      case EvaluationPackage.QUESTION__QUESTION_TEXT:
        return getQuestionText();
      case EvaluationPackage.QUESTION__HELP_TEXT:
        return getHelpText();
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
      case EvaluationPackage.QUESTION__NAME:
        setName((String)newValue);
        return;
      case EvaluationPackage.QUESTION__QUESTION_TEXT:
        setQuestionText((String)newValue);
        return;
      case EvaluationPackage.QUESTION__HELP_TEXT:
        setHelpText((String)newValue);
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
      case EvaluationPackage.QUESTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EvaluationPackage.QUESTION__QUESTION_TEXT:
        setQuestionText(QUESTION_TEXT_EDEFAULT);
        return;
      case EvaluationPackage.QUESTION__HELP_TEXT:
        setHelpText(HELP_TEXT_EDEFAULT);
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
      case EvaluationPackage.QUESTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EvaluationPackage.QUESTION__QUESTION_TEXT:
        return QUESTION_TEXT_EDEFAULT == null ? questionText != null : !QUESTION_TEXT_EDEFAULT.equals(questionText);
      case EvaluationPackage.QUESTION__HELP_TEXT:
        return HELP_TEXT_EDEFAULT == null ? helpText != null : !HELP_TEXT_EDEFAULT.equals(helpText);
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
    result.append(", questionText: ");
    result.append(questionText);
    result.append(", helpText: ");
    result.append(helpText);
    result.append(')');
    return result.toString();
  }

} //QuestionImpl
