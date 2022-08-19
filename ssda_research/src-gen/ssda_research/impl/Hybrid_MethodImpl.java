/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.Hybrid_Method;
import ssda_research.Hybrid_sampling_method;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.Hybrid_MethodImpl#getHybrid_sampling_method <em>Hybrid sampling method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Hybrid_MethodImpl extends SamplingImpl implements Hybrid_Method {
	/**
	 * The default value of the '{@link #getHybrid_sampling_method() <em>Hybrid sampling method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHybrid_sampling_method()
	 * @generated
	 * @ordered
	 */
	protected static final Hybrid_sampling_method HYBRID_SAMPLING_METHOD_EDEFAULT = Hybrid_sampling_method.SMOTE_TOMEK;

	/**
	 * The cached value of the '{@link #getHybrid_sampling_method() <em>Hybrid sampling method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHybrid_sampling_method()
	 * @generated
	 * @ordered
	 */
	protected Hybrid_sampling_method hybrid_sampling_method = HYBRID_SAMPLING_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hybrid_MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.HYBRID_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hybrid_sampling_method getHybrid_sampling_method() {
		return hybrid_sampling_method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHybrid_sampling_method(Hybrid_sampling_method newHybrid_sampling_method) {
		Hybrid_sampling_method oldHybrid_sampling_method = hybrid_sampling_method;
		hybrid_sampling_method = newHybrid_sampling_method == null ? HYBRID_SAMPLING_METHOD_EDEFAULT
				: newHybrid_sampling_method;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.HYBRID_METHOD__HYBRID_SAMPLING_METHOD, oldHybrid_sampling_method,
					hybrid_sampling_method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.HYBRID_METHOD__HYBRID_SAMPLING_METHOD:
			return getHybrid_sampling_method();
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
		case Ssda_researchPackage.HYBRID_METHOD__HYBRID_SAMPLING_METHOD:
			setHybrid_sampling_method((Hybrid_sampling_method) newValue);
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
		case Ssda_researchPackage.HYBRID_METHOD__HYBRID_SAMPLING_METHOD:
			setHybrid_sampling_method(HYBRID_SAMPLING_METHOD_EDEFAULT);
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
		case Ssda_researchPackage.HYBRID_METHOD__HYBRID_SAMPLING_METHOD:
			return hybrid_sampling_method != HYBRID_SAMPLING_METHOD_EDEFAULT;
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
		result.append(" (hybrid_sampling_method: ");
		result.append(hybrid_sampling_method);
		result.append(')');
		return result.toString();
	}

} //Hybrid_MethodImpl
