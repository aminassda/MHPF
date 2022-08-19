/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.SVC;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.SVCImpl#getKernel <em>Kernel</em>}</li>
 *   <li>{@link ssda_research.impl.SVCImpl#getGamma <em>Gamma</em>}</li>
 *   <li>{@link ssda_research.impl.SVCImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SVCImpl extends classifiersImpl implements SVC {
	/**
	 * The default value of the '{@link #getKernel() <em>Kernel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel()
	 * @generated
	 * @ordered
	 */
	protected static final String KERNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKernel() <em>Kernel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel()
	 * @generated
	 * @ordered
	 */
	protected String kernel = KERNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGamma() <em>Gamma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma()
	 * @generated
	 * @ordered
	 */
	protected static final int GAMMA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGamma() <em>Gamma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma()
	 * @generated
	 * @ordered
	 */
	protected int gamma = GAMMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected static final int C_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected int c = C_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SVCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.SVC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKernel() {
		return kernel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKernel(String newKernel) {
		String oldKernel = kernel;
		kernel = newKernel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.SVC__KERNEL, oldKernel, kernel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGamma() {
		return gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGamma(int newGamma) {
		int oldGamma = gamma;
		gamma = newGamma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.SVC__GAMMA, oldGamma, gamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setC(int newC) {
		int oldC = c;
		c = newC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.SVC__C, oldC, c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.SVC__KERNEL:
			return getKernel();
		case Ssda_researchPackage.SVC__GAMMA:
			return getGamma();
		case Ssda_researchPackage.SVC__C:
			return getC();
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
		case Ssda_researchPackage.SVC__KERNEL:
			setKernel((String) newValue);
			return;
		case Ssda_researchPackage.SVC__GAMMA:
			setGamma((Integer) newValue);
			return;
		case Ssda_researchPackage.SVC__C:
			setC((Integer) newValue);
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
		case Ssda_researchPackage.SVC__KERNEL:
			setKernel(KERNEL_EDEFAULT);
			return;
		case Ssda_researchPackage.SVC__GAMMA:
			setGamma(GAMMA_EDEFAULT);
			return;
		case Ssda_researchPackage.SVC__C:
			setC(C_EDEFAULT);
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
		case Ssda_researchPackage.SVC__KERNEL:
			return KERNEL_EDEFAULT == null ? kernel != null : !KERNEL_EDEFAULT.equals(kernel);
		case Ssda_researchPackage.SVC__GAMMA:
			return gamma != GAMMA_EDEFAULT;
		case Ssda_researchPackage.SVC__C:
			return c != C_EDEFAULT;
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
		result.append(" (kernel: ");
		result.append(kernel);
		result.append(", gamma: ");
		result.append(gamma);
		result.append(", C: ");
		result.append(c);
		result.append(')');
		return result.toString();
	}

} //SVCImpl
