/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.MLPClassifier;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MLP Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.MLPClassifierImpl#getHidden_layer_status <em>Hidden layer status</em>}</li>
 *   <li>{@link ssda_research.impl.MLPClassifierImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link ssda_research.impl.MLPClassifierImpl#getSolver <em>Solver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLPClassifierImpl extends classifiersImpl implements MLPClassifier {
	/**
	 * The default value of the '{@link #getHidden_layer_status() <em>Hidden layer status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHidden_layer_status()
	 * @generated
	 * @ordered
	 */
	protected static final int HIDDEN_LAYER_STATUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHidden_layer_status() <em>Hidden layer status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHidden_layer_status()
	 * @generated
	 * @ordered
	 */
	protected int hidden_layer_status = HIDDEN_LAYER_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivation() <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected String activation = ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolver() <em>Solver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolver()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolver() <em>Solver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolver()
	 * @generated
	 * @ordered
	 */
	protected String solver = SOLVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLPClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.MLP_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHidden_layer_status() {
		return hidden_layer_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHidden_layer_status(int newHidden_layer_status) {
		int oldHidden_layer_status = hidden_layer_status;
		hidden_layer_status = newHidden_layer_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.MLP_CLASSIFIER__HIDDEN_LAYER_STATUS, oldHidden_layer_status,
					hidden_layer_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivation() {
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivation(String newActivation) {
		String oldActivation = activation;
		activation = newActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.MLP_CLASSIFIER__ACTIVATION,
					oldActivation, activation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSolver() {
		return solver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolver(String newSolver) {
		String oldSolver = solver;
		solver = newSolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.MLP_CLASSIFIER__SOLVER,
					oldSolver, solver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.MLP_CLASSIFIER__HIDDEN_LAYER_STATUS:
			return getHidden_layer_status();
		case Ssda_researchPackage.MLP_CLASSIFIER__ACTIVATION:
			return getActivation();
		case Ssda_researchPackage.MLP_CLASSIFIER__SOLVER:
			return getSolver();
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
		case Ssda_researchPackage.MLP_CLASSIFIER__HIDDEN_LAYER_STATUS:
			setHidden_layer_status((Integer) newValue);
			return;
		case Ssda_researchPackage.MLP_CLASSIFIER__ACTIVATION:
			setActivation((String) newValue);
			return;
		case Ssda_researchPackage.MLP_CLASSIFIER__SOLVER:
			setSolver((String) newValue);
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
		case Ssda_researchPackage.MLP_CLASSIFIER__HIDDEN_LAYER_STATUS:
			setHidden_layer_status(HIDDEN_LAYER_STATUS_EDEFAULT);
			return;
		case Ssda_researchPackage.MLP_CLASSIFIER__ACTIVATION:
			setActivation(ACTIVATION_EDEFAULT);
			return;
		case Ssda_researchPackage.MLP_CLASSIFIER__SOLVER:
			setSolver(SOLVER_EDEFAULT);
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
		case Ssda_researchPackage.MLP_CLASSIFIER__HIDDEN_LAYER_STATUS:
			return hidden_layer_status != HIDDEN_LAYER_STATUS_EDEFAULT;
		case Ssda_researchPackage.MLP_CLASSIFIER__ACTIVATION:
			return ACTIVATION_EDEFAULT == null ? activation != null : !ACTIVATION_EDEFAULT.equals(activation);
		case Ssda_researchPackage.MLP_CLASSIFIER__SOLVER:
			return SOLVER_EDEFAULT == null ? solver != null : !SOLVER_EDEFAULT.equals(solver);
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
		result.append(" (hidden_layer_status: ");
		result.append(hidden_layer_status);
		result.append(", activation: ");
		result.append(activation);
		result.append(", solver: ");
		result.append(solver);
		result.append(')');
		return result.toString();
	}

} //MLPClassifierImpl
