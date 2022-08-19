/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.Ssda_researchPackage;
import ssda_research.Train_data;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.Train_dataImpl#getX_train <em>Xtrain</em>}</li>
 *   <li>{@link ssda_research.impl.Train_dataImpl#getY_train <em>Ytrain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Train_dataImpl extends Splitted_datasetImpl implements Train_data {
	/**
	 * The default value of the '{@link #getX_train() <em>Xtrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_train()
	 * @generated
	 * @ordered
	 */
	protected static final String XTRAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX_train() <em>Xtrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_train()
	 * @generated
	 * @ordered
	 */
	protected String x_train = XTRAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getY_train() <em>Ytrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY_train()
	 * @generated
	 * @ordered
	 */
	protected static final String YTRAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY_train() <em>Ytrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY_train()
	 * @generated
	 * @ordered
	 */
	protected String y_train = YTRAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Train_dataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.TRAIN_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getX_train() {
		return x_train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX_train(String newX_train) {
		String oldX_train = x_train;
		x_train = newX_train;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.TRAIN_DATA__XTRAIN, oldX_train,
					x_train));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getY_train() {
		return y_train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY_train(String newY_train) {
		String oldY_train = y_train;
		y_train = newY_train;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.TRAIN_DATA__YTRAIN, oldY_train,
					y_train));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.TRAIN_DATA__XTRAIN:
			return getX_train();
		case Ssda_researchPackage.TRAIN_DATA__YTRAIN:
			return getY_train();
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
		case Ssda_researchPackage.TRAIN_DATA__XTRAIN:
			setX_train((String) newValue);
			return;
		case Ssda_researchPackage.TRAIN_DATA__YTRAIN:
			setY_train((String) newValue);
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
		case Ssda_researchPackage.TRAIN_DATA__XTRAIN:
			setX_train(XTRAIN_EDEFAULT);
			return;
		case Ssda_researchPackage.TRAIN_DATA__YTRAIN:
			setY_train(YTRAIN_EDEFAULT);
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
		case Ssda_researchPackage.TRAIN_DATA__XTRAIN:
			return XTRAIN_EDEFAULT == null ? x_train != null : !XTRAIN_EDEFAULT.equals(x_train);
		case Ssda_researchPackage.TRAIN_DATA__YTRAIN:
			return YTRAIN_EDEFAULT == null ? y_train != null : !YTRAIN_EDEFAULT.equals(y_train);
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
		result.append(" (X_train: ");
		result.append(x_train);
		result.append(", Y_train: ");
		result.append(y_train);
		result.append(')');
		return result.toString();
	}

} //Train_dataImpl
