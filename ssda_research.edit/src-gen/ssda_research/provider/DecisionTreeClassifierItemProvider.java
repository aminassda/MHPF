/**
 */
package ssda_research.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ssda_research.DecisionTreeClassifier;
import ssda_research.Ssda_researchPackage;

/**
 * This is the item provider adapter for a {@link ssda_research.DecisionTreeClassifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DecisionTreeClassifierItemProvider extends classifiersItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionTreeClassifierItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCreterionPropertyDescriptor(object);
			addMax_depthPropertyDescriptor(object);
			addSplitterPropertyDescriptor(object);
			addMin_samples_splitPropertyDescriptor(object);
			addMin_samples_leafPropertyDescriptor(object);
			addMin_weight_fraction_leafPropertyDescriptor(object);
			addClass_weightPropertyDescriptor(object);
			addMax_featuresPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Creterion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreterionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DecisionTreeClassifier_creterion_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DecisionTreeClassifier_creterion_feature",
								"_UI_DecisionTreeClassifier_type"),
						Ssda_researchPackage.Literals.DECISION_TREE_CLASSIFIER__CRETERION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMax_depthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DecisionTreeClassifier_max_depth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DecisionTreeClassifier_max_depth_feature",
								"_UI_DecisionTreeClassifier_type"),
						Ssda_researchPackage.Literals.DECISION_TREE_CLASSIFIER__MAX_DEPTH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Splitter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSplitterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DecisionTreeClassifier_splitter_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DecisionTreeClassifier_splitter_feature",
								"_UI_DecisionTreeClassifier_type"),
						Ssda_researchPackage.Literals.DECISION_TREE_CLASSIFIER__SPLITTER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min samples split feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMin_samples_splitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DecisionTreeClassifier_min_samples_split_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DecisionTreeClassifier_min_samples_split_feature",
						"_UI_DecisionTreeClassifier_type"),
				Ssda_researchPackage.Literals.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min samples leaf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMin_samples_leafPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DecisionTreeClassifier_min_samples_leaf_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DecisionTreeClassifier_min_samples_leaf_feature",
						"_UI_DecisionTreeClassifier_type"),
				Ssda_researchPackage.Literals.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min weight fraction leaf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMin_weight_fraction_leafPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DecisionTreeClassifier_min_weight_fraction_leaf_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DecisionTreeClassifier_min_weight_fraction_leaf_feature",
								"_UI_DecisionTreeClassifier_type"),
						Ssda_researchPackage.Literals.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMax_featuresPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DecisionTreeClassifier_max_features_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DecisionTreeClassifier_max_features_feature", "_UI_DecisionTreeClassifier_type"),
						Ssda_researchPackage.Literals.DECISION_TREE_CLASSIFIER__MAX_FEATURES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Class weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClass_weightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DecisionTreeClassifier_class_weight_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DecisionTreeClassifier_class_weight_feature", "_UI_DecisionTreeClassifier_type"),
						Ssda_researchPackage.Literals.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DecisionTreeClassifier.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DecisionTreeClassifier"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DecisionTreeClassifier) object).getRandom_state();
		return label == null || label.length() == 0 ? getString("_UI_DecisionTreeClassifier_type")
				: getString("_UI_DecisionTreeClassifier_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DecisionTreeClassifier.class)) {
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CRETERION:
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH:
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__SPLITTER:
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT:
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF:
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT:
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
