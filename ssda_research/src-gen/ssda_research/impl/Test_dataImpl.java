/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.Ssda_researchPackage;
import ssda_research.Test_data;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.Test_dataImpl#getX_test <em>Xtest</em>}</li>
 *   <li>{@link ssda_research.impl.Test_dataImpl#getY_test <em>Ytest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Test_dataImpl extends Splitted_datasetImpl implements Test_data {
	/**
	 * The default value of the '{@link #getX_test() <em>Xtest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_test()
	 * @generated
	 * @ordered
	 */
	protected static final String XTEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX_test() <em>Xtest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_test()
	 * @generated
	 * @ordered
	 */
	protected String x_test = XTEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getY_test() <em>Ytest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY_test()
	 * @generated
	 * @ordered
	 */
	protected static final String YTEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY_test() <em>Ytest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY_test()
	 * @generated
	 * @ordered
	 */
	protected String y_test = YTEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Test_dataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.TEST_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getX_test() {
		return x_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX_test(String newX_test) {
		String oldX_test = x_test;
		x_test = newX_test;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.TEST_DATA__XTEST, oldX_test,
					x_test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getY_test() {
		return y_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY_test(String newY_test) {
		String oldY_test = y_test;
		y_test = newY_test;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.TEST_DATA__YTEST, oldY_test,
					y_test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.TEST_DATA__XTEST:
			return getX_test();
		case Ssda_researchPackage.TEST_DATA__YTEST:
			return getY_test();
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
		case Ssda_researchPackage.TEST_DATA__XTEST:
			setX_test((String) newValue);
			return;
		case Ssda_researchPackage.TEST_DATA__YTEST:
			setY_test((String) newValue);
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
		case Ssda_researchPackage.TEST_DATA__XTEST:
			setX_test(XTEST_EDEFAULT);
			return;
		case Ssda_researchPackage.TEST_DATA__YTEST:
			setY_test(YTEST_EDEFAULT);
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
		case Ssda_researchPackage.TEST_DATA__XTEST:
			return XTEST_EDEFAULT == null ? x_test != null : !XTEST_EDEFAULT.equals(x_test);
		case Ssda_researchPackage.TEST_DATA__YTEST:
			return YTEST_EDEFAULT == null ? y_test != null : !YTEST_EDEFAULT.equals(y_test);
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
		result.append(" (X_test: ");
		result.append(x_test);
		result.append(", Y_test: ");
		result.append(y_test);
		result.append(')');
		return result.toString();
	}

} //Test_dataImpl
