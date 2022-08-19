/**
 */
package ssda_research.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ssda_research.DiabetesPrediction;
import ssda_research.Performance_Evaluation;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diabetes Prediction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.DiabetesPredictionImpl#getEvaluated <em>Evaluated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiabetesPredictionImpl extends MinimalEObjectImpl.Container implements DiabetesPrediction {
	/**
	 * The cached value of the '{@link #getEvaluated() <em>Evaluated</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluated()
	 * @generated
	 * @ordered
	 */
	protected EList<Performance_Evaluation> evaluated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiabetesPredictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.DIABETES_PREDICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Performance_Evaluation> getEvaluated() {
		if (evaluated == null) {
			evaluated = new EObjectContainmentEList<Performance_Evaluation>(Performance_Evaluation.class, this,
					Ssda_researchPackage.DIABETES_PREDICTION__EVALUATED);
		}
		return evaluated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ssda_researchPackage.DIABETES_PREDICTION__EVALUATED:
			return ((InternalEList<?>) getEvaluated()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.DIABETES_PREDICTION__EVALUATED:
			return getEvaluated();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Ssda_researchPackage.DIABETES_PREDICTION__EVALUATED:
			getEvaluated().clear();
			getEvaluated().addAll((Collection<? extends Performance_Evaluation>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case Ssda_researchPackage.DIABETES_PREDICTION__EVALUATED:
			getEvaluated().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Ssda_researchPackage.DIABETES_PREDICTION__EVALUATED:
			return evaluated != null && !evaluated.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiabetesPredictionImpl
