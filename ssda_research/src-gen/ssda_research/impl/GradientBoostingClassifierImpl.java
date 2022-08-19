/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.GradientBoostingClassifier;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gradient Boosting Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.GradientBoostingClassifierImpl#getN_estimators <em>Nestimators</em>}</li>
 *   <li>{@link ssda_research.impl.GradientBoostingClassifierImpl#getLearning_rate <em>Learning rate</em>}</li>
 *   <li>{@link ssda_research.impl.GradientBoostingClassifierImpl#getMax_depth <em>Max depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GradientBoostingClassifierImpl extends classifiersImpl implements GradientBoostingClassifier {
	/**
	 * The default value of the '{@link #getN_estimators() <em>Nestimators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN_estimators()
	 * @generated
	 * @ordered
	 */
	protected static final String NESTIMATORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getN_estimators() <em>Nestimators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN_estimators()
	 * @generated
	 * @ordered
	 */
	protected String n_estimators = NESTIMATORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLearning_rate() <em>Learning rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearning_rate()
	 * @generated
	 * @ordered
	 */
	protected static final float LEARNING_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLearning_rate() <em>Learning rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearning_rate()
	 * @generated
	 * @ordered
	 */
	protected float learning_rate = LEARNING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_depth() <em>Max depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_depth()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax_depth() <em>Max depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_depth()
	 * @generated
	 * @ordered
	 */
	protected String max_depth = MAX_DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradientBoostingClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.GRADIENT_BOOSTING_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getN_estimators() {
		return n_estimators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setN_estimators(String newN_estimators) {
		String oldN_estimators = n_estimators;
		n_estimators = newN_estimators;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__NESTIMATORS, oldN_estimators, n_estimators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLearning_rate() {
		return learning_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLearning_rate(float newLearning_rate) {
		float oldLearning_rate = learning_rate;
		learning_rate = newLearning_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__LEARNING_RATE, oldLearning_rate, learning_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMax_depth() {
		return max_depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax_depth(String newMax_depth) {
		String oldMax_depth = max_depth;
		max_depth = newMax_depth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__MAX_DEPTH, oldMax_depth, max_depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__NESTIMATORS:
			return getN_estimators();
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__LEARNING_RATE:
			return getLearning_rate();
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__MAX_DEPTH:
			return getMax_depth();
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
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__NESTIMATORS:
			setN_estimators((String) newValue);
			return;
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__LEARNING_RATE:
			setLearning_rate((Float) newValue);
			return;
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__MAX_DEPTH:
			setMax_depth((String) newValue);
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
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__NESTIMATORS:
			setN_estimators(NESTIMATORS_EDEFAULT);
			return;
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__LEARNING_RATE:
			setLearning_rate(LEARNING_RATE_EDEFAULT);
			return;
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__MAX_DEPTH:
			setMax_depth(MAX_DEPTH_EDEFAULT);
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
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__NESTIMATORS:
			return NESTIMATORS_EDEFAULT == null ? n_estimators != null : !NESTIMATORS_EDEFAULT.equals(n_estimators);
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__LEARNING_RATE:
			return learning_rate != LEARNING_RATE_EDEFAULT;
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER__MAX_DEPTH:
			return MAX_DEPTH_EDEFAULT == null ? max_depth != null : !MAX_DEPTH_EDEFAULT.equals(max_depth);
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
		result.append(" (n_estimators: ");
		result.append(n_estimators);
		result.append(", learning_rate: ");
		result.append(learning_rate);
		result.append(", max_depth: ");
		result.append(max_depth);
		result.append(')');
		return result.toString();
	}

} //GradientBoostingClassifierImpl
