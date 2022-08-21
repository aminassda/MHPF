/**
 */
package ssda_research.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ssda_research.Patient;
import ssda_research.Ssda_researchPackage;

/**
 * This is the item provider adapter for a {@link ssda_research.Patient} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatientItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addWeightPropertyDescriptor(object);
			addBmiPropertyDescriptor(object);
			addActivity_levelPropertyDescriptor(object);
			addGenderPropertyDescriptor(object);
			addPatient_typePropertyDescriptor(object);
			addAgePropertyDescriptor(object);
			addOther_diseasesPropertyDescriptor(object);
			addSympPropertyDescriptor(object);
			addMedPropertyDescriptor(object);
			addDoctorPropertyDescriptor(object);
			addView_predPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_name_feature", "_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_height_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_height_feature",
								"_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__HEIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_weight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_weight_feature",
								"_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__WEIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bmi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBmiPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_bmi_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_bmi_feature", "_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__BMI, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Activity level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivity_levelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_activity_level_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_activity_level_feature",
								"_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__ACTIVITY_LEVEL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Gender feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenderPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_gender_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_gender_feature",
								"_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__GENDER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Patient type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatient_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_patient_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_patient_type_feature",
								"_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__PATIENT_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Age feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_age_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_age_feature", "_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__AGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Other diseases feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOther_diseasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_Other_diseases_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_Other_diseases_feature",
								"_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__OTHER_DISEASES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Symp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSympPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_symp_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_symp_feature", "_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__SYMP, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Med feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_med_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_med_feature", "_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__MED, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Doctor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoctorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_doctor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_doctor_feature",
								"_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__DOCTOR, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the View pred feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addView_predPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_view_pred_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_view_pred_feature",
								"_UI_Patient_type"),
						Ssda_researchPackage.Literals.PATIENT__VIEW_PRED, true, false, true, null, null, null));
	}

	/**
	 * This returns Patient.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Patient"));
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
		String label = ((Patient) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Patient_type")
				: getString("_UI_Patient_type") + " " + label;
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

		switch (notification.getFeatureID(Patient.class)) {
		case Ssda_researchPackage.PATIENT__NAME:
		case Ssda_researchPackage.PATIENT__HEIGHT:
		case Ssda_researchPackage.PATIENT__WEIGHT:
		case Ssda_researchPackage.PATIENT__BMI:
		case Ssda_researchPackage.PATIENT__ACTIVITY_LEVEL:
		case Ssda_researchPackage.PATIENT__GENDER:
		case Ssda_researchPackage.PATIENT__PATIENT_TYPE:
		case Ssda_researchPackage.PATIENT__AGE:
		case Ssda_researchPackage.PATIENT__OTHER_DISEASES:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Ssda_researchEditPlugin.INSTANCE;
	}

}
