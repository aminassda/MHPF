/**
 */
package ssda_research.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ssda_research.DiabeticRecommendationSystem;
import ssda_research.Ssda_researchFactory;
import ssda_research.Ssda_researchPackage;

/**
 * This is the item provider adapter for a {@link ssda_research.DiabeticRecommendationSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiabeticRecommendationSystemItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiabeticRecommendationSystemItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__PATIENT);
			childrenFeatures.add(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__SYMP);
			childrenFeatures.add(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__MED);
			childrenFeatures.add(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR);
			childrenFeatures.add(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__PRED);
			childrenFeatures.add(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DATASET);
			childrenFeatures.add(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__EDA);
			childrenFeatures.add(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS);
			childrenFeatures.add(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP);
			childrenFeatures.add(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS);
			childrenFeatures.add(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__CV);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DiabeticRecommendationSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiabeticRecommendationSystem"));
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
		return getString("_UI_DiabeticRecommendationSystem_type");
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

		switch (notification.getFeatureID(DiabeticRecommendationSystem.class)) {
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PATIENT:
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__SYMP:
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__MED:
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR:
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PRED:
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DATASET:
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__EDA:
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS:
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP:
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS:
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__CV:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__PATIENT,
						Ssda_researchFactory.eINSTANCE.createPatient()));

		newChildDescriptors.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__SYMP,
				Ssda_researchFactory.eINSTANCE.createSymptoms()));

		newChildDescriptors.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__MED,
				Ssda_researchFactory.eINSTANCE.createMedicines()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR,
						Ssda_researchFactory.eINSTANCE.createDoctor()));

		newChildDescriptors.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__PRED,
				Ssda_researchFactory.eINSTANCE.createDiabetesPrediction()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DATASET,
						Ssda_researchFactory.eINSTANCE.createDataset()));

		newChildDescriptors.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__EDA,
				Ssda_researchFactory.eINSTANCE.createscatter()));

		newChildDescriptors.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__EDA,
				Ssda_researchFactory.eINSTANCE.createboxplot()));

		newChildDescriptors.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__EDA,
				Ssda_researchFactory.eINSTANCE.createDatasetDeclaration()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS,
						Ssda_researchFactory.eINSTANCE.createMissingValues()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS,
						Ssda_researchFactory.eINSTANCE.createNumeric_Outlier()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS,
						Ssda_researchFactory.eINSTANCE.createStandardScaler()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS,
						Ssda_researchFactory.eINSTANCE.createUndersampling()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS,
						Ssda_researchFactory.eINSTANCE.createHybrid_Method()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS,
						Ssda_researchFactory.eINSTANCE.createOverSampling()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS,
						Ssda_researchFactory.eINSTANCE.createPearson_Correlation()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS,
						Ssda_researchFactory.eINSTANCE.createLabelEncoding()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP,
						Ssda_researchFactory.eINSTANCE.createRandomizedSearchCV()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP,
						Ssda_researchFactory.eINSTANCE.createGridSearchCV()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS,
						Ssda_researchFactory.eINSTANCE.createRandomForestClassifier()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS,
						Ssda_researchFactory.eINSTANCE.createMLPClassifier()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS,
						Ssda_researchFactory.eINSTANCE.createGradientBoostingClassifier()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS,
						Ssda_researchFactory.eINSTANCE.createGaussianNB()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS,
						Ssda_researchFactory.eINSTANCE.createSVC()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS,
						Ssda_researchFactory.eINSTANCE.createLogisticRegression()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS,
						Ssda_researchFactory.eINSTANCE.createKNeighborsClassifier()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS,
						Ssda_researchFactory.eINSTANCE.createVotingClassifier()));

		newChildDescriptors
				.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS,
						Ssda_researchFactory.eINSTANCE.createDecisionTreeClassifier()));

		newChildDescriptors.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__CV,
				Ssda_researchFactory.eINSTANCE.createTrainTestSplit()));

		newChildDescriptors.add(createChildParameter(Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM__CV,
				Ssda_researchFactory.eINSTANCE.createKFold()));
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
