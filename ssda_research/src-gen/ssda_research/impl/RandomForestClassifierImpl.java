/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.RandomForestClassifier;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Forest Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.RandomForestClassifierImpl#getMax_depth <em>Max depth</em>}</li>
 *   <li>{@link ssda_research.impl.RandomForestClassifierImpl#getMax_features <em>Max features</em>}</li>
 *   <li>{@link ssda_research.impl.RandomForestClassifierImpl#getMin_samples_split <em>Min samples split</em>}</li>
 *   <li>{@link ssda_research.impl.RandomForestClassifierImpl#getMin_samples_leaf <em>Min samples leaf</em>}</li>
 *   <li>{@link ssda_research.impl.RandomForestClassifierImpl#getN_estimators <em>Nestimators</em>}</li>
 *   <li>{@link ssda_research.impl.RandomForestClassifierImpl#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RandomForestClassifierImpl extends classifiersImpl implements RandomForestClassifier {
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
	 * The default value of the '{@link #getMax_features() <em>Max features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_features()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_FEATURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax_features() <em>Max features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_features()
	 * @generated
	 * @ordered
	 */
	protected String max_features = MAX_FEATURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_samples_split() <em>Min samples split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_samples_split()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_SAMPLES_SPLIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin_samples_split() <em>Min samples split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_samples_split()
	 * @generated
	 * @ordered
	 */
	protected String min_samples_split = MIN_SAMPLES_SPLIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_samples_leaf() <em>Min samples leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_samples_leaf()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_SAMPLES_LEAF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin_samples_leaf() <em>Min samples leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_samples_leaf()
	 * @generated
	 * @ordered
	 */
	protected String min_samples_leaf = MIN_SAMPLES_LEAF_EDEFAULT;

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
	 * The default value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected String criterion = CRITERION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomForestClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.RANDOM_FOREST_CLASSIFIER;
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
					Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH, oldMax_depth, max_depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMax_features() {
		return max_features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax_features(String newMax_features) {
		String oldMax_features = max_features;
		max_features = newMax_features;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES, oldMax_features, max_features));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMin_samples_split() {
		return min_samples_split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin_samples_split(String newMin_samples_split) {
		String oldMin_samples_split = min_samples_split;
		min_samples_split = newMin_samples_split;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT, oldMin_samples_split,
					min_samples_split));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMin_samples_leaf() {
		return min_samples_leaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin_samples_leaf(String newMin_samples_leaf) {
		String oldMin_samples_leaf = min_samples_leaf;
		min_samples_leaf = newMin_samples_leaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF, oldMin_samples_leaf,
					min_samples_leaf));
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
					Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS, oldN_estimators, n_estimators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCriterion() {
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCriterion(String newCriterion) {
		String oldCriterion = criterion;
		criterion = newCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__CRITERION, oldCriterion, criterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH:
			return getMax_depth();
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES:
			return getMax_features();
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT:
			return getMin_samples_split();
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF:
			return getMin_samples_leaf();
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS:
			return getN_estimators();
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__CRITERION:
			return getCriterion();
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
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH:
			setMax_depth((String) newValue);
			return;
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES:
			setMax_features((String) newValue);
			return;
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT:
			setMin_samples_split((String) newValue);
			return;
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF:
			setMin_samples_leaf((String) newValue);
			return;
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS:
			setN_estimators((String) newValue);
			return;
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__CRITERION:
			setCriterion((String) newValue);
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
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH:
			setMax_depth(MAX_DEPTH_EDEFAULT);
			return;
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES:
			setMax_features(MAX_FEATURES_EDEFAULT);
			return;
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT:
			setMin_samples_split(MIN_SAMPLES_SPLIT_EDEFAULT);
			return;
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF:
			setMin_samples_leaf(MIN_SAMPLES_LEAF_EDEFAULT);
			return;
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS:
			setN_estimators(NESTIMATORS_EDEFAULT);
			return;
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__CRITERION:
			setCriterion(CRITERION_EDEFAULT);
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
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH:
			return MAX_DEPTH_EDEFAULT == null ? max_depth != null : !MAX_DEPTH_EDEFAULT.equals(max_depth);
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES:
			return MAX_FEATURES_EDEFAULT == null ? max_features != null : !MAX_FEATURES_EDEFAULT.equals(max_features);
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT:
			return MIN_SAMPLES_SPLIT_EDEFAULT == null ? min_samples_split != null
					: !MIN_SAMPLES_SPLIT_EDEFAULT.equals(min_samples_split);
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF:
			return MIN_SAMPLES_LEAF_EDEFAULT == null ? min_samples_leaf != null
					: !MIN_SAMPLES_LEAF_EDEFAULT.equals(min_samples_leaf);
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS:
			return NESTIMATORS_EDEFAULT == null ? n_estimators != null : !NESTIMATORS_EDEFAULT.equals(n_estimators);
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER__CRITERION:
			return CRITERION_EDEFAULT == null ? criterion != null : !CRITERION_EDEFAULT.equals(criterion);
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
		result.append(" (max_depth: ");
		result.append(max_depth);
		result.append(", max_features: ");
		result.append(max_features);
		result.append(", min_samples_split: ");
		result.append(min_samples_split);
		result.append(", min_samples_leaf: ");
		result.append(min_samples_leaf);
		result.append(", n_estimators: ");
		result.append(n_estimators);
		result.append(", criterion: ");
		result.append(criterion);
		result.append(')');
		return result.toString();
	}

} //RandomForestClassifierImpl
