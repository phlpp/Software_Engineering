/**
 */
package org.xtext.nordakademie.evaluation.evaluation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.nordakademie.evaluation.evaluation.Chart;
import org.xtext.nordakademie.evaluation.evaluation.Choice;
import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage;
import org.xtext.nordakademie.evaluation.evaluation.Graduation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.ChartImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.xtext.nordakademie.evaluation.evaluation.impl.ChartImpl#getGraduations <em>Graduations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChartImpl extends QuestionImpl implements Chart
{
  /**
   * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoices()
   * @generated
   * @ordered
   */
  protected EList<Choice> choices;

  /**
   * The cached value of the '{@link #getGraduations() <em>Graduations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraduations()
   * @generated
   * @ordered
   */
  protected EList<Graduation> graduations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChartImpl()
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
    return EvaluationPackage.Literals.CHART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Choice> getChoices()
  {
    if (choices == null)
    {
      choices = new EObjectContainmentEList<Choice>(Choice.class, this, EvaluationPackage.CHART__CHOICES);
    }
    return choices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Graduation> getGraduations()
  {
    if (graduations == null)
    {
      graduations = new EObjectContainmentEList<Graduation>(Graduation.class, this, EvaluationPackage.CHART__GRADUATIONS);
    }
    return graduations;
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
      case EvaluationPackage.CHART__CHOICES:
        return ((InternalEList<?>)getChoices()).basicRemove(otherEnd, msgs);
      case EvaluationPackage.CHART__GRADUATIONS:
        return ((InternalEList<?>)getGraduations()).basicRemove(otherEnd, msgs);
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
      case EvaluationPackage.CHART__CHOICES:
        return getChoices();
      case EvaluationPackage.CHART__GRADUATIONS:
        return getGraduations();
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
      case EvaluationPackage.CHART__CHOICES:
        getChoices().clear();
        getChoices().addAll((Collection<? extends Choice>)newValue);
        return;
      case EvaluationPackage.CHART__GRADUATIONS:
        getGraduations().clear();
        getGraduations().addAll((Collection<? extends Graduation>)newValue);
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
      case EvaluationPackage.CHART__CHOICES:
        getChoices().clear();
        return;
      case EvaluationPackage.CHART__GRADUATIONS:
        getGraduations().clear();
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
      case EvaluationPackage.CHART__CHOICES:
        return choices != null && !choices.isEmpty();
      case EvaluationPackage.CHART__GRADUATIONS:
        return graduations != null && !graduations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ChartImpl
