/**
 */
package ssda_research.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.Ssda_researchPackage;
import ssda_research.TrainTestSplit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train Test Split</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.TrainTestSplitImpl#getTrain_size <em>Train size</em>}</li>
 *   <li>{@link ssda_research.impl.TrainTestSplitImpl#getTest_size <em>Test size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainTestSplitImpl extends CrossValidationImpl implements TrainTestSplit {
	/**
	 * The default value of the '{@link #getTrain_size() <em>Train size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrain_size()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAIN_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrain_size() <em>Train size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrain_size()
	 * @generated
	 * @ordered
	 */
	protected String train_size = TRAIN_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTest_size() <em>Test size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest_size()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTest_size() <em>Test size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest_size()
	 * @generated
	 * @ordered
	 */
	protected String test_size = TEST_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainTestSplitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.TRAIN_TEST_SPLIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTest_size() {
		return test_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTest_size(String newTest_size) {
		String oldTest_size = test_size;
		test_size = newTest_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.TRAIN_TEST_SPLIT__TEST_SIZE,
					oldTest_size, test_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrain_size() {
		return train_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrain_size(String newTrain_size) {
		String oldTrain_size = train_size;
		train_size = newTrain_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.TRAIN_TEST_SPLIT__TRAIN_SIZE,
					oldTrain_size, train_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void train_test_split() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.TRAIN_TEST_SPLIT__TRAIN_SIZE:
			return getTrain_size();
		case Ssda_researchPackage.TRAIN_TEST_SPLIT__TEST_SIZE:
			return getTest_size();
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
		case Ssda_researchPackage.TRAIN_TEST_SPLIT__TRAIN_SIZE:
			setTrain_size((String) newValue);
			return;
		case Ssda_researchPackage.TRAIN_TEST_SPLIT__TEST_SIZE:
			setTest_size((String) newValue);
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
		case Ssda_researchPackage.TRAIN_TEST_SPLIT__TRAIN_SIZE:
			setTrain_size(TRAIN_SIZE_EDEFAULT);
			return;
		case Ssda_researchPackage.TRAIN_TEST_SPLIT__TEST_SIZE:
			setTest_size(TEST_SIZE_EDEFAULT);
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
		case Ssda_researchPackage.TRAIN_TEST_SPLIT__TRAIN_SIZE:
			return TRAIN_SIZE_EDEFAULT == null ? train_size != null : !TRAIN_SIZE_EDEFAULT.equals(train_size);
		case Ssda_researchPackage.TRAIN_TEST_SPLIT__TEST_SIZE:
			return TEST_SIZE_EDEFAULT == null ? test_size != null : !TEST_SIZE_EDEFAULT.equals(test_size);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Ssda_researchPackage.TRAIN_TEST_SPLIT___TRAIN_TEST_SPLIT:
			train_test_split();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (train_size: ");
		result.append(train_size);
		result.append(", test_size: ");
		result.append(test_size);
		result.append(')');
		return result.toString();
	}

} //TrainTestSplitImpl
