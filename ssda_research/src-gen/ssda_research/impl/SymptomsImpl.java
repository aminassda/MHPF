/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ssda_research.Ssda_researchPackage;
import ssda_research.Symptoms;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symptoms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.SymptomsImpl#getSymptom_name <em>Symptom name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymptomsImpl extends MinimalEObjectImpl.Container implements Symptoms {
	/**
	 * The default value of the '{@link #getSymptom_name() <em>Symptom name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptom_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMPTOM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymptom_name() <em>Symptom name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptom_name()
	 * @generated
	 * @ordered
	 */
	protected String symptom_name = SYMPTOM_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymptomsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.SYMPTOMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymptom_name() {
		return symptom_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymptom_name(String newSymptom_name) {
		String oldSymptom_name = symptom_name;
		symptom_name = newSymptom_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.SYMPTOMS__SYMPTOM_NAME,
					oldSymptom_name, symptom_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.SYMPTOMS__SYMPTOM_NAME:
			return getSymptom_name();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Ssda_researchPackage.SYMPTOMS__SYMPTOM_NAME:
			setSymptom_name((String) newValue);
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
		case Ssda_researchPackage.SYMPTOMS__SYMPTOM_NAME:
			setSymptom_name(SYMPTOM_NAME_EDEFAULT);
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
		case Ssda_researchPackage.SYMPTOMS__SYMPTOM_NAME:
			return SYMPTOM_NAME_EDEFAULT == null ? symptom_name != null : !SYMPTOM_NAME_EDEFAULT.equals(symptom_name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (symptom_name: ");
		result.append(symptom_name);
		result.append(')');
		return result.toString();
	}

} //SymptomsImpl
