/**
 */
package ssda_research.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import ssda_research.util.Ssda_researchAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Ssda_researchItemProviderAdapterFactory extends Ssda_researchAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ssda_researchItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.DiabeticRecommendationSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiabeticRecommendationSystemItemProvider diabeticRecommendationSystemItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.DiabeticRecommendationSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiabeticRecommendationSystemAdapter() {
		if (diabeticRecommendationSystemItemProvider == null) {
			diabeticRecommendationSystemItemProvider = new DiabeticRecommendationSystemItemProvider(this);
		}

		return diabeticRecommendationSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Patient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientItemProvider patientItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Patient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatientAdapter() {
		if (patientItemProvider == null) {
			patientItemProvider = new PatientItemProvider(this);
		}

		return patientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Symptoms} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymptomsItemProvider symptomsItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Symptoms}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymptomsAdapter() {
		if (symptomsItemProvider == null) {
			symptomsItemProvider = new SymptomsItemProvider(this);
		}

		return symptomsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Doctor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctorItemProvider doctorItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Doctor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoctorAdapter() {
		if (doctorItemProvider == null) {
			doctorItemProvider = new DoctorItemProvider(this);
		}

		return doctorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.DiabetesPrediction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiabetesPredictionItemProvider diabetesPredictionItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.DiabetesPrediction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiabetesPredictionAdapter() {
		if (diabetesPredictionItemProvider == null) {
			diabetesPredictionItemProvider = new DiabetesPredictionItemProvider(this);
		}

		return diabetesPredictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Performance_Evaluation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Performance_EvaluationItemProvider performance_EvaluationItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Performance_Evaluation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerformance_EvaluationAdapter() {
		if (performance_EvaluationItemProvider == null) {
			performance_EvaluationItemProvider = new Performance_EvaluationItemProvider(this);
		}

		return performance_EvaluationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Dataset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetItemProvider datasetItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatasetAdapter() {
		if (datasetItemProvider == null) {
			datasetItemProvider = new DatasetItemProvider(this);
		}

		return datasetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Train_data} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Train_dataItemProvider train_dataItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Train_data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrain_dataAdapter() {
		if (train_dataItemProvider == null) {
			train_dataItemProvider = new Train_dataItemProvider(this);
		}

		return train_dataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Test_data} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Test_dataItemProvider test_dataItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Test_data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTest_dataAdapter() {
		if (test_dataItemProvider == null) {
			test_dataItemProvider = new Test_dataItemProvider(this);
		}

		return test_dataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.RandomizedSearchCV} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomizedSearchCVItemProvider randomizedSearchCVItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.RandomizedSearchCV}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRandomizedSearchCVAdapter() {
		if (randomizedSearchCVItemProvider == null) {
			randomizedSearchCVItemProvider = new RandomizedSearchCVItemProvider(this);
		}

		return randomizedSearchCVItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.GridSearchCV} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridSearchCVItemProvider gridSearchCVItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.GridSearchCV}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGridSearchCVAdapter() {
		if (gridSearchCVItemProvider == null) {
			gridSearchCVItemProvider = new GridSearchCVItemProvider(this);
		}

		return gridSearchCVItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.RandomForestClassifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomForestClassifierItemProvider randomForestClassifierItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.RandomForestClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRandomForestClassifierAdapter() {
		if (randomForestClassifierItemProvider == null) {
			randomForestClassifierItemProvider = new RandomForestClassifierItemProvider(this);
		}

		return randomForestClassifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.DecisionTreeClassifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionTreeClassifierItemProvider decisionTreeClassifierItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.DecisionTreeClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecisionTreeClassifierAdapter() {
		if (decisionTreeClassifierItemProvider == null) {
			decisionTreeClassifierItemProvider = new DecisionTreeClassifierItemProvider(this);
		}

		return decisionTreeClassifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Oral_drugs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Oral_drugsItemProvider oral_drugsItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Oral_drugs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOral_drugsAdapter() {
		if (oral_drugsItemProvider == null) {
			oral_drugsItemProvider = new Oral_drugsItemProvider(this);
		}

		return oral_drugsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Nonoral_Drugs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nonoral_DrugsItemProvider nonoral_DrugsItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Nonoral_Drugs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNonoral_DrugsAdapter() {
		if (nonoral_DrugsItemProvider == null) {
			nonoral_DrugsItemProvider = new Nonoral_DrugsItemProvider(this);
		}

		return nonoral_DrugsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.MLPClassifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLPClassifierItemProvider mlpClassifierItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.MLPClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMLPClassifierAdapter() {
		if (mlpClassifierItemProvider == null) {
			mlpClassifierItemProvider = new MLPClassifierItemProvider(this);
		}

		return mlpClassifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.GradientBoostingClassifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradientBoostingClassifierItemProvider gradientBoostingClassifierItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.GradientBoostingClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGradientBoostingClassifierAdapter() {
		if (gradientBoostingClassifierItemProvider == null) {
			gradientBoostingClassifierItemProvider = new GradientBoostingClassifierItemProvider(this);
		}

		return gradientBoostingClassifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.GaussianNB} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaussianNBItemProvider gaussianNBItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.GaussianNB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGaussianNBAdapter() {
		if (gaussianNBItemProvider == null) {
			gaussianNBItemProvider = new GaussianNBItemProvider(this);
		}

		return gaussianNBItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.SVC} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SVCItemProvider svcItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.SVC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSVCAdapter() {
		if (svcItemProvider == null) {
			svcItemProvider = new SVCItemProvider(this);
		}

		return svcItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.LogisticRegression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticRegressionItemProvider logisticRegressionItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.LogisticRegression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogisticRegressionAdapter() {
		if (logisticRegressionItemProvider == null) {
			logisticRegressionItemProvider = new LogisticRegressionItemProvider(this);
		}

		return logisticRegressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.KNeighborsClassifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KNeighborsClassifierItemProvider kNeighborsClassifierItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.KNeighborsClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKNeighborsClassifierAdapter() {
		if (kNeighborsClassifierItemProvider == null) {
			kNeighborsClassifierItemProvider = new KNeighborsClassifierItemProvider(this);
		}

		return kNeighborsClassifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.VotingClassifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VotingClassifierItemProvider votingClassifierItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.VotingClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVotingClassifierAdapter() {
		if (votingClassifierItemProvider == null) {
			votingClassifierItemProvider = new VotingClassifierItemProvider(this);
		}

		return votingClassifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.MissingValues} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissingValuesItemProvider missingValuesItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.MissingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMissingValuesAdapter() {
		if (missingValuesItemProvider == null) {
			missingValuesItemProvider = new MissingValuesItemProvider(this);
		}

		return missingValuesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Numeric_Outlier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Numeric_OutlierItemProvider numeric_OutlierItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Numeric_Outlier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumeric_OutlierAdapter() {
		if (numeric_OutlierItemProvider == null) {
			numeric_OutlierItemProvider = new Numeric_OutlierItemProvider(this);
		}

		return numeric_OutlierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.StandardScaler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardScalerItemProvider standardScalerItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.StandardScaler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStandardScalerAdapter() {
		if (standardScalerItemProvider == null) {
			standardScalerItemProvider = new StandardScalerItemProvider(this);
		}

		return standardScalerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Undersampling} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UndersamplingItemProvider undersamplingItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Undersampling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUndersamplingAdapter() {
		if (undersamplingItemProvider == null) {
			undersamplingItemProvider = new UndersamplingItemProvider(this);
		}

		return undersamplingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Hybrid_Method} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hybrid_MethodItemProvider hybrid_MethodItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Hybrid_Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHybrid_MethodAdapter() {
		if (hybrid_MethodItemProvider == null) {
			hybrid_MethodItemProvider = new Hybrid_MethodItemProvider(this);
		}

		return hybrid_MethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.OverSampling} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverSamplingItemProvider overSamplingItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.OverSampling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOverSamplingAdapter() {
		if (overSamplingItemProvider == null) {
			overSamplingItemProvider = new OverSamplingItemProvider(this);
		}

		return overSamplingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.TrainTestSplit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainTestSplitItemProvider trainTestSplitItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.TrainTestSplit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrainTestSplitAdapter() {
		if (trainTestSplitItemProvider == null) {
			trainTestSplitItemProvider = new TrainTestSplitItemProvider(this);
		}

		return trainTestSplitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.IQR} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IQRItemProvider iqrItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.IQR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIQRAdapter() {
		if (iqrItemProvider == null) {
			iqrItemProvider = new IQRItemProvider(this);
		}

		return iqrItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.scatter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scatterItemProvider scatterItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.scatter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createscatterAdapter() {
		if (scatterItemProvider == null) {
			scatterItemProvider = new scatterItemProvider(this);
		}

		return scatterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.boxplot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boxplotItemProvider boxplotItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.boxplot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createboxplotAdapter() {
		if (boxplotItemProvider == null) {
			boxplotItemProvider = new boxplotItemProvider(this);
		}

		return boxplotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.DatasetDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetDeclarationItemProvider datasetDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.DatasetDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatasetDeclarationAdapter() {
		if (datasetDeclarationItemProvider == null) {
			datasetDeclarationItemProvider = new DatasetDeclarationItemProvider(this);
		}

		return datasetDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Pearson_Correlation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pearson_CorrelationItemProvider pearson_CorrelationItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Pearson_Correlation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPearson_CorrelationAdapter() {
		if (pearson_CorrelationItemProvider == null) {
			pearson_CorrelationItemProvider = new Pearson_CorrelationItemProvider(this);
		}

		return pearson_CorrelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.LabelEncoding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelEncodingItemProvider labelEncodingItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.LabelEncoding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLabelEncodingAdapter() {
		if (labelEncodingItemProvider == null) {
			labelEncodingItemProvider = new LabelEncodingItemProvider(this);
		}

		return labelEncodingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.KFold} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KFoldItemProvider kFoldItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.KFold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKFoldAdapter() {
		if (kFoldItemProvider == null) {
			kFoldItemProvider = new KFoldItemProvider(this);
		}

		return kFoldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ssda_research.Preprocessed_data} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Preprocessed_dataItemProvider preprocessed_dataItemProvider;

	/**
	 * This creates an adapter for a {@link ssda_research.Preprocessed_data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreprocessed_dataAdapter() {
		if (preprocessed_dataItemProvider == null) {
			preprocessed_dataItemProvider = new Preprocessed_dataItemProvider(this);
		}

		return preprocessed_dataItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (diabeticRecommendationSystemItemProvider != null)
			diabeticRecommendationSystemItemProvider.dispose();
		if (patientItemProvider != null)
			patientItemProvider.dispose();
		if (symptomsItemProvider != null)
			symptomsItemProvider.dispose();
		if (doctorItemProvider != null)
			doctorItemProvider.dispose();
		if (diabetesPredictionItemProvider != null)
			diabetesPredictionItemProvider.dispose();
		if (performance_EvaluationItemProvider != null)
			performance_EvaluationItemProvider.dispose();
		if (datasetItemProvider != null)
			datasetItemProvider.dispose();
		if (train_dataItemProvider != null)
			train_dataItemProvider.dispose();
		if (test_dataItemProvider != null)
			test_dataItemProvider.dispose();
		if (randomizedSearchCVItemProvider != null)
			randomizedSearchCVItemProvider.dispose();
		if (gridSearchCVItemProvider != null)
			gridSearchCVItemProvider.dispose();
		if (randomForestClassifierItemProvider != null)
			randomForestClassifierItemProvider.dispose();
		if (mlpClassifierItemProvider != null)
			mlpClassifierItemProvider.dispose();
		if (gradientBoostingClassifierItemProvider != null)
			gradientBoostingClassifierItemProvider.dispose();
		if (gaussianNBItemProvider != null)
			gaussianNBItemProvider.dispose();
		if (svcItemProvider != null)
			svcItemProvider.dispose();
		if (logisticRegressionItemProvider != null)
			logisticRegressionItemProvider.dispose();
		if (kNeighborsClassifierItemProvider != null)
			kNeighborsClassifierItemProvider.dispose();
		if (votingClassifierItemProvider != null)
			votingClassifierItemProvider.dispose();
		if (missingValuesItemProvider != null)
			missingValuesItemProvider.dispose();
		if (numeric_OutlierItemProvider != null)
			numeric_OutlierItemProvider.dispose();
		if (standardScalerItemProvider != null)
			standardScalerItemProvider.dispose();
		if (undersamplingItemProvider != null)
			undersamplingItemProvider.dispose();
		if (hybrid_MethodItemProvider != null)
			hybrid_MethodItemProvider.dispose();
		if (overSamplingItemProvider != null)
			overSamplingItemProvider.dispose();
		if (trainTestSplitItemProvider != null)
			trainTestSplitItemProvider.dispose();
		if (iqrItemProvider != null)
			iqrItemProvider.dispose();
		if (scatterItemProvider != null)
			scatterItemProvider.dispose();
		if (boxplotItemProvider != null)
			boxplotItemProvider.dispose();
		if (datasetDeclarationItemProvider != null)
			datasetDeclarationItemProvider.dispose();
		if (pearson_CorrelationItemProvider != null)
			pearson_CorrelationItemProvider.dispose();
		if (labelEncodingItemProvider != null)
			labelEncodingItemProvider.dispose();
		if (kFoldItemProvider != null)
			kFoldItemProvider.dispose();
		if (preprocessed_dataItemProvider != null)
			preprocessed_dataItemProvider.dispose();
		if (decisionTreeClassifierItemProvider != null)
			decisionTreeClassifierItemProvider.dispose();
		if (oral_drugsItemProvider != null)
			oral_drugsItemProvider.dispose();
		if (nonoral_DrugsItemProvider != null)
			nonoral_DrugsItemProvider.dispose();
	}

}
