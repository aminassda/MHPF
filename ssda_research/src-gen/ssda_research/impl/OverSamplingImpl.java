/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.OverSampling;
import ssda_research.Oversampling_technique;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Over Sampling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.OverSamplingImpl#getSampling_technique <em>Sampling technique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverSamplingImpl extends SamplingImpl implements OverSampling {
	/**
	 * The default value of the '{@link #getSampling_technique() <em>Sampling technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampling_technique()
	 * @generated
	 * @ordered
	 */
	protected static final Oversampling_technique SAMPLING_TECHNIQUE_EDEFAULT = Oversampling_technique.SMOTE;

	/**
	 * The cached value of the '{@link #getSampling_technique() <em>Sampling technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampling_technique()
	 * @generated
	 * @ordered
	 */
	protected Oversampling_technique sampling_technique = SAMPLING_TECHNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverSamplingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.OVER_SAMPLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oversampling_technique getSampling_technique() {
		return sampling_technique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSampling_technique(Oversampling_technique newSampling_technique) {
		Oversampling_technique oldSampling_technique = sampling_technique;
		sampling_technique = newSampling_technique == null ? SAMPLING_TECHNIQUE_EDEFAULT : newSampling_technique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.OVER_SAMPLING__SAMPLING_TECHNIQUE, oldSampling_technique, sampling_technique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.OVER_SAMPLING__SAMPLING_TECHNIQUE:
			return getSampling_technique();
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
		case Ssda_researchPackage.OVER_SAMPLING__SAMPLING_TECHNIQUE:
			setSampling_technique((Oversampling_technique) newValue);
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
		case Ssda_researchPackage.OVER_SAMPLING__SAMPLING_TECHNIQUE:
			setSampling_technique(SAMPLING_TECHNIQUE_EDEFAULT);
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
		case Ssda_researchPackage.OVER_SAMPLING__SAMPLING_TECHNIQUE:
			return sampling_technique != SAMPLING_TECHNIQUE_EDEFAULT;
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
		result.append(" (sampling_technique: ");
		result.append(sampling_technique);
		result.append(')');
		return result.toString();
	}

} //OverSamplingImpl
