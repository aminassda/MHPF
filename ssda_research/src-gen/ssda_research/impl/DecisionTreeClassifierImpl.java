/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.DecisionTreeClassifier;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Tree Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.DecisionTreeClassifierImpl#getCreterion <em>Creterion</em>}</li>
 *   <li>{@link ssda_research.impl.DecisionTreeClassifierImpl#getMax_depth <em>Max depth</em>}</li>
 *   <li>{@link ssda_research.impl.DecisionTreeClassifierImpl#getSplitter <em>Splitter</em>}</li>
 *   <li>{@link ssda_research.impl.DecisionTreeClassifierImpl#getMin_samples_split <em>Min samples split</em>}</li>
 *   <li>{@link ssda_research.impl.DecisionTreeClassifierImpl#getMin_samples_leaf <em>Min samples leaf</em>}</li>
 *   <li>{@link ssda_research.impl.DecisionTreeClassifierImpl#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}</li>
 *   <li>{@link ssda_research.impl.DecisionTreeClassifierImpl#getClass_weight <em>Class weight</em>}</li>
 *   <li>{@link ssda_research.impl.DecisionTreeClassifierImpl#getMax_features <em>Max features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionTreeClassifierImpl extends classifiersImpl implements DecisionTreeClassifier {
	/**
	 * The default value of the '{@link #getCreterion() <em>Creterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreterion()
	 * @generated
	 * @ordered
	 */
	protected static final String CRETERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreterion() <em>Creterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreterion()
	 * @generated
	 * @ordered
	 */
	protected String creterion = CRETERION_EDEFAULT;

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
	 * The default value of the '{@link #getSplitter() <em>Splitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitter()
	 * @generated
	 * @ordered
	 */
	protected static final String SPLITTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSplitter() <em>Splitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitter()
	 * @generated
	 * @ordered
	 */
	protected String splitter = SPLITTER_EDEFAULT;

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
	 * The default value of the '{@link #getMin_weight_fraction_leaf() <em>Min weight fraction leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_weight_fraction_leaf()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_WEIGHT_FRACTION_LEAF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin_weight_fraction_leaf() <em>Min weight fraction leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_weight_fraction_leaf()
	 * @generated
	 * @ordered
	 */
	protected String min_weight_fraction_leaf = MIN_WEIGHT_FRACTION_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_weight() <em>Class weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_weight()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_weight() <em>Class weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_weight()
	 * @generated
	 * @ordered
	 */
	protected String class_weight = CLASS_WEIGHT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionTreeClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.DECISION_TREE_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreterion() {
		return creterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreterion(String newCreterion) {
		String oldCreterion = creterion;
		creterion = newCreterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CRETERION, oldCreterion, creterion));
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
					Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH, oldMax_depth, max_depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSplitter() {
		return splitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSplitter(String newSplitter) {
		String oldSplitter = splitter;
		splitter = newSplitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.DECISION_TREE_CLASSIFIER__SPLITTER, oldSplitter, splitter));
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
					Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT, oldMin_samples_split,
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
					Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF, oldMin_samples_leaf,
					min_samples_leaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMin_weight_fraction_leaf() {
		return min_weight_fraction_leaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin_weight_fraction_leaf(String newMin_weight_fraction_leaf) {
		String oldMin_weight_fraction_leaf = min_weight_fraction_leaf;
		min_weight_fraction_leaf = newMin_weight_fraction_leaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF,
					oldMin_weight_fraction_leaf, min_weight_fraction_leaf));
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
					Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES, oldMax_features, max_features));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClass_weight() {
		return class_weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass_weight(String newClass_weight) {
		String oldClass_weight = class_weight;
		class_weight = newClass_weight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT, oldClass_weight, class_weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CRETERION:
			return getCreterion();
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH:
			return getMax_depth();
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__SPLITTER:
			return getSplitter();
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT:
			return getMin_samples_split();
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF:
			return getMin_samples_leaf();
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
			return getMin_weight_fraction_leaf();
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT:
			return getClass_weight();
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES:
			return getMax_features();
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
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CRETERION:
			setCreterion((String) newValue);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH:
			setMax_depth((String) newValue);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__SPLITTER:
			setSplitter((String) newValue);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT:
			setMin_samples_split((String) newValue);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF:
			setMin_samples_leaf((String) newValue);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
			setMin_weight_fraction_leaf((String) newValue);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT:
			setClass_weight((String) newValue);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES:
			setMax_features((String) newValue);
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
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CRETERION:
			setCreterion(CRETERION_EDEFAULT);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH:
			setMax_depth(MAX_DEPTH_EDEFAULT);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__SPLITTER:
			setSplitter(SPLITTER_EDEFAULT);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT:
			setMin_samples_split(MIN_SAMPLES_SPLIT_EDEFAULT);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF:
			setMin_samples_leaf(MIN_SAMPLES_LEAF_EDEFAULT);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
			setMin_weight_fraction_leaf(MIN_WEIGHT_FRACTION_LEAF_EDEFAULT);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT:
			setClass_weight(CLASS_WEIGHT_EDEFAULT);
			return;
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES:
			setMax_features(MAX_FEATURES_EDEFAULT);
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
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CRETERION:
			return CRETERION_EDEFAULT == null ? creterion != null : !CRETERION_EDEFAULT.equals(creterion);
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH:
			return MAX_DEPTH_EDEFAULT == null ? max_depth != null : !MAX_DEPTH_EDEFAULT.equals(max_depth);
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__SPLITTER:
			return SPLITTER_EDEFAULT == null ? splitter != null : !SPLITTER_EDEFAULT.equals(splitter);
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT:
			return MIN_SAMPLES_SPLIT_EDEFAULT == null ? min_samples_split != null
					: !MIN_SAMPLES_SPLIT_EDEFAULT.equals(min_samples_split);
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF:
			return MIN_SAMPLES_LEAF_EDEFAULT == null ? min_samples_leaf != null
					: !MIN_SAMPLES_LEAF_EDEFAULT.equals(min_samples_leaf);
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
			return MIN_WEIGHT_FRACTION_LEAF_EDEFAULT == null ? min_weight_fraction_leaf != null
					: !MIN_WEIGHT_FRACTION_LEAF_EDEFAULT.equals(min_weight_fraction_leaf);
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT:
			return CLASS_WEIGHT_EDEFAULT == null ? class_weight != null : !CLASS_WEIGHT_EDEFAULT.equals(class_weight);
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES:
			return MAX_FEATURES_EDEFAULT == null ? max_features != null : !MAX_FEATURES_EDEFAULT.equals(max_features);
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
		result.append(" (creterion: ");
		result.append(creterion);
		result.append(", max_depth: ");
		result.append(max_depth);
		result.append(", splitter: ");
		result.append(splitter);
		result.append(", min_samples_split: ");
		result.append(min_samples_split);
		result.append(", min_samples_leaf: ");
		result.append(min_samples_leaf);
		result.append(", min_weight_fraction_leaf: ");
		result.append(min_weight_fraction_leaf);
		result.append(", class_weight: ");
		result.append(class_weight);
		result.append(", max_features: ");
		result.append(max_features);
		result.append(')');
		return result.toString();
	}

} //DecisionTreeClassifierImpl
