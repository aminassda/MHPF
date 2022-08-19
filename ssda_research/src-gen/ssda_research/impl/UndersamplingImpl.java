/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.Ssda_researchPackage;
import ssda_research.UnderSampling_technique;
import ssda_research.Undersampling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Undersampling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.UndersamplingImpl#getUndersampling_technque <em>Undersampling technque</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UndersamplingImpl extends SamplingImpl implements Undersampling {
	/**
	 * The default value of the '{@link #getUndersampling_technque() <em>Undersampling technque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndersampling_technque()
	 * @generated
	 * @ordered
	 */
	protected static final UnderSampling_technique UNDERSAMPLING_TECHNQUE_EDEFAULT = UnderSampling_technique.TOMEK_LINKS;

	/**
	 * The cached value of the '{@link #getUndersampling_technque() <em>Undersampling technque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndersampling_technque()
	 * @generated
	 * @ordered
	 */
	protected UnderSampling_technique undersampling_technque = UNDERSAMPLING_TECHNQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UndersamplingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.UNDERSAMPLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnderSampling_technique getUndersampling_technque() {
		return undersampling_technque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUndersampling_technque(UnderSampling_technique newUndersampling_technque) {
		UnderSampling_technique oldUndersampling_technque = undersampling_technque;
		undersampling_technque = newUndersampling_technque == null ? UNDERSAMPLING_TECHNQUE_EDEFAULT
				: newUndersampling_technque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.UNDERSAMPLING__UNDERSAMPLING_TECHNQUE, oldUndersampling_technque,
					undersampling_technque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.UNDERSAMPLING__UNDERSAMPLING_TECHNQUE:
			return getUndersampling_technque();
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
		case Ssda_researchPackage.UNDERSAMPLING__UNDERSAMPLING_TECHNQUE:
			setUndersampling_technque((UnderSampling_technique) newValue);
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
		case Ssda_researchPackage.UNDERSAMPLING__UNDERSAMPLING_TECHNQUE:
			setUndersampling_technque(UNDERSAMPLING_TECHNQUE_EDEFAULT);
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
		case Ssda_researchPackage.UNDERSAMPLING__UNDERSAMPLING_TECHNQUE:
			return undersampling_technque != UNDERSAMPLING_TECHNQUE_EDEFAULT;
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
		result.append(" (Undersampling_technque: ");
		result.append(undersampling_technque);
		result.append(')');
		return result.toString();
	}

} //UndersamplingImpl
