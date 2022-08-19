/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.GaussianNB;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gaussian NB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.GaussianNBImpl#getVar_smoothing <em>Var smoothing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaussianNBImpl extends classifiersImpl implements GaussianNB {
	/**
	 * The default value of the '{@link #getVar_smoothing() <em>Var smoothing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar_smoothing()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_SMOOTHING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVar_smoothing() <em>Var smoothing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar_smoothing()
	 * @generated
	 * @ordered
	 */
	protected String var_smoothing = VAR_SMOOTHING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaussianNBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.GAUSSIAN_NB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVar_smoothing() {
		return var_smoothing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVar_smoothing(String newVar_smoothing) {
		String oldVar_smoothing = var_smoothing;
		var_smoothing = newVar_smoothing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.GAUSSIAN_NB__VAR_SMOOTHING,
					oldVar_smoothing, var_smoothing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.GAUSSIAN_NB__VAR_SMOOTHING:
			return getVar_smoothing();
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
		case Ssda_researchPackage.GAUSSIAN_NB__VAR_SMOOTHING:
			setVar_smoothing((String) newValue);
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
		case Ssda_researchPackage.GAUSSIAN_NB__VAR_SMOOTHING:
			setVar_smoothing(VAR_SMOOTHING_EDEFAULT);
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
		case Ssda_researchPackage.GAUSSIAN_NB__VAR_SMOOTHING:
			return VAR_SMOOTHING_EDEFAULT == null ? var_smoothing != null
					: !VAR_SMOOTHING_EDEFAULT.equals(var_smoothing);
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
		result.append(" (var_smoothing: ");
		result.append(var_smoothing);
		result.append(')');
		return result.toString();
	}

} //GaussianNBImpl
