/**
 */
package ssda_research.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ssda_research.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ssda_researchFactoryImpl extends EFactoryImpl implements Ssda_researchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ssda_researchFactory init() {
		try {
			Ssda_researchFactory theSsda_researchFactory = (Ssda_researchFactory) EPackage.Registry.INSTANCE
					.getEFactory(Ssda_researchPackage.eNS_URI);
			if (theSsda_researchFactory != null) {
				return theSsda_researchFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ssda_researchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ssda_researchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM:
			return createDiabeticRecommendationSystem();
		case Ssda_researchPackage.PATIENT:
			return createPatient();
		case Ssda_researchPackage.SYMPTOMS:
			return createSymptoms();
		case Ssda_researchPackage.MEDICINES:
			return createMedicines();
		case Ssda_researchPackage.DOCTOR:
			return createDoctor();
		case Ssda_researchPackage.DIABETES_PREDICTION:
			return createDiabetesPrediction();
		case Ssda_researchPackage.PERFORMANCE_EVALUATION:
			return createPerformance_Evaluation();
		case Ssda_researchPackage.DATASET:
			return createDataset();
		case Ssda_researchPackage.TRAIN_DATA:
			return createTrain_data();
		case Ssda_researchPackage.TEST_DATA:
			return createTest_data();
		case Ssda_researchPackage.RANDOMIZED_SEARCH_CV:
			return createRandomizedSearchCV();
		case Ssda_researchPackage.GRID_SEARCH_CV:
			return createGridSearchCV();
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER:
			return createRandomForestClassifier();
		case Ssda_researchPackage.MLP_CLASSIFIER:
			return createMLPClassifier();
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER:
			return createGradientBoostingClassifier();
		case Ssda_researchPackage.GAUSSIAN_NB:
			return createGaussianNB();
		case Ssda_researchPackage.SVC:
			return createSVC();
		case Ssda_researchPackage.LOGISTIC_REGRESSION:
			return createLogisticRegression();
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER:
			return createKNeighborsClassifier();
		case Ssda_researchPackage.VOTING_CLASSIFIER:
			return createVotingClassifier();
		case Ssda_researchPackage.MISSING_VALUES:
			return createMissingValues();
		case Ssda_researchPackage.NUMERIC_OUTLIER:
			return createNumeric_Outlier();
		case Ssda_researchPackage.STANDARD_SCALER:
			return createStandardScaler();
		case Ssda_researchPackage.UNDERSAMPLING:
			return createUndersampling();
		case Ssda_researchPackage.HYBRID_METHOD:
			return createHybrid_Method();
		case Ssda_researchPackage.OVER_SAMPLING:
			return createOverSampling();
		case Ssda_researchPackage.TRAIN_TEST_SPLIT:
			return createTrainTestSplit();
		case Ssda_researchPackage.IQR:
			return createIQR();
		case Ssda_researchPackage.SCATTER:
			return createscatter();
		case Ssda_researchPackage.BOXPLOT:
			return createboxplot();
		case Ssda_researchPackage.DATASET_DECLARATION:
			return createDatasetDeclaration();
		case Ssda_researchPackage.PEARSON_CORRELATION:
			return createPearson_Correlation();
		case Ssda_researchPackage.LABEL_ENCODING:
			return createLabelEncoding();
		case Ssda_researchPackage.KFOLD:
			return createKFold();
		case Ssda_researchPackage.PREPROCESSED_DATA:
			return createPreprocessed_data();
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER:
			return createDecisionTreeClassifier();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Ssda_researchPackage.HYBRID_SAMPLING_METHOD:
			return createHybrid_sampling_methodFromString(eDataType, initialValue);
		case Ssda_researchPackage.OVERSAMPLING_TECHNIQUE:
			return createOversampling_techniqueFromString(eDataType, initialValue);
		case Ssda_researchPackage.UNDER_SAMPLING_TECHNIQUE:
			return createUnderSampling_techniqueFromString(eDataType, initialValue);
		case Ssda_researchPackage.SAMPLING_STRATEGY:
			return createSampling_strategyFromString(eDataType, initialValue);
		case Ssda_researchPackage.VOTING_TYPE:
			return createVoting_typeFromString(eDataType, initialValue);
		case Ssda_researchPackage.REGULARIZATION:
			return createRegularizationFromString(eDataType, initialValue);
		case Ssda_researchPackage.TRAINED:
			return createTrainedFromString(eDataType, initialValue);
		case Ssda_researchPackage.TESTED:
			return createTestedFromString(eDataType, initialValue);
		case Ssda_researchPackage.LOWER_QUARTILE:
			return createLowerQuartileFromString(eDataType, initialValue);
		case Ssda_researchPackage.UPPER_QUARTILE:
			return createUpperQuartileFromString(eDataType, initialValue);
		case Ssda_researchPackage.MEDIAN:
			return createMedianFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Ssda_researchPackage.HYBRID_SAMPLING_METHOD:
			return convertHybrid_sampling_methodToString(eDataType, instanceValue);
		case Ssda_researchPackage.OVERSAMPLING_TECHNIQUE:
			return convertOversampling_techniqueToString(eDataType, instanceValue);
		case Ssda_researchPackage.UNDER_SAMPLING_TECHNIQUE:
			return convertUnderSampling_techniqueToString(eDataType, instanceValue);
		case Ssda_researchPackage.SAMPLING_STRATEGY:
			return convertSampling_strategyToString(eDataType, instanceValue);
		case Ssda_researchPackage.VOTING_TYPE:
			return convertVoting_typeToString(eDataType, instanceValue);
		case Ssda_researchPackage.REGULARIZATION:
			return convertRegularizationToString(eDataType, instanceValue);
		case Ssda_researchPackage.TRAINED:
			return convertTrainedToString(eDataType, instanceValue);
		case Ssda_researchPackage.TESTED:
			return convertTestedToString(eDataType, instanceValue);
		case Ssda_researchPackage.LOWER_QUARTILE:
			return convertLowerQuartileToString(eDataType, instanceValue);
		case Ssda_researchPackage.UPPER_QUARTILE:
			return convertUpperQuartileToString(eDataType, instanceValue);
		case Ssda_researchPackage.MEDIAN:
			return convertMedianToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiabeticRecommendationSystem createDiabeticRecommendationSystem() {
		DiabeticRecommendationSystemImpl diabeticRecommendationSystem = new DiabeticRecommendationSystemImpl();
		return diabeticRecommendationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Symptoms createSymptoms() {
		SymptomsImpl symptoms = new SymptomsImpl();
		return symptoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Medicines createMedicines() {
		MedicinesImpl medicines = new MedicinesImpl();
		return medicines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Doctor createDoctor() {
		DoctorImpl doctor = new DoctorImpl();
		return doctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiabetesPrediction createDiabetesPrediction() {
		DiabetesPredictionImpl diabetesPrediction = new DiabetesPredictionImpl();
		return diabetesPrediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Performance_Evaluation createPerformance_Evaluation() {
		Performance_EvaluationImpl performance_Evaluation = new Performance_EvaluationImpl();
		return performance_Evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dataset createDataset() {
		DatasetImpl dataset = new DatasetImpl();
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Train_data createTrain_data() {
		Train_dataImpl train_data = new Train_dataImpl();
		return train_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Test_data createTest_data() {
		Test_dataImpl test_data = new Test_dataImpl();
		return test_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RandomizedSearchCV createRandomizedSearchCV() {
		RandomizedSearchCVImpl randomizedSearchCV = new RandomizedSearchCVImpl();
		return randomizedSearchCV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridSearchCV createGridSearchCV() {
		GridSearchCVImpl gridSearchCV = new GridSearchCVImpl();
		return gridSearchCV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RandomForestClassifier createRandomForestClassifier() {
		RandomForestClassifierImpl randomForestClassifier = new RandomForestClassifierImpl();
		return randomForestClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionTreeClassifier createDecisionTreeClassifier() {
		DecisionTreeClassifierImpl decisionTreeClassifier = new DecisionTreeClassifierImpl();
		return decisionTreeClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLPClassifier createMLPClassifier() {
		MLPClassifierImpl mlpClassifier = new MLPClassifierImpl();
		return mlpClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GradientBoostingClassifier createGradientBoostingClassifier() {
		GradientBoostingClassifierImpl gradientBoostingClassifier = new GradientBoostingClassifierImpl();
		return gradientBoostingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GaussianNB createGaussianNB() {
		GaussianNBImpl gaussianNB = new GaussianNBImpl();
		return gaussianNB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SVC createSVC() {
		SVCImpl svc = new SVCImpl();
		return svc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticRegression createLogisticRegression() {
		LogisticRegressionImpl logisticRegression = new LogisticRegressionImpl();
		return logisticRegression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KNeighborsClassifier createKNeighborsClassifier() {
		KNeighborsClassifierImpl kNeighborsClassifier = new KNeighborsClassifierImpl();
		return kNeighborsClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VotingClassifier createVotingClassifier() {
		VotingClassifierImpl votingClassifier = new VotingClassifierImpl();
		return votingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissingValues createMissingValues() {
		MissingValuesImpl missingValues = new MissingValuesImpl();
		return missingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Numeric_Outlier createNumeric_Outlier() {
		Numeric_OutlierImpl numeric_Outlier = new Numeric_OutlierImpl();
		return numeric_Outlier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardScaler createStandardScaler() {
		StandardScalerImpl standardScaler = new StandardScalerImpl();
		return standardScaler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Undersampling createUndersampling() {
		UndersamplingImpl undersampling = new UndersamplingImpl();
		return undersampling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hybrid_Method createHybrid_Method() {
		Hybrid_MethodImpl hybrid_Method = new Hybrid_MethodImpl();
		return hybrid_Method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverSampling createOverSampling() {
		OverSamplingImpl overSampling = new OverSamplingImpl();
		return overSampling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainTestSplit createTrainTestSplit() {
		TrainTestSplitImpl trainTestSplit = new TrainTestSplitImpl();
		return trainTestSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IQR createIQR() {
		IQRImpl iqr = new IQRImpl();
		return iqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public scatter createscatter() {
		scatterImpl scatter = new scatterImpl();
		return scatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boxplot createboxplot() {
		boxplotImpl boxplot = new boxplotImpl();
		return boxplot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetDeclaration createDatasetDeclaration() {
		DatasetDeclarationImpl datasetDeclaration = new DatasetDeclarationImpl();
		return datasetDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pearson_Correlation createPearson_Correlation() {
		Pearson_CorrelationImpl pearson_Correlation = new Pearson_CorrelationImpl();
		return pearson_Correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelEncoding createLabelEncoding() {
		LabelEncodingImpl labelEncoding = new LabelEncodingImpl();
		return labelEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KFold createKFold() {
		KFoldImpl kFold = new KFoldImpl();
		return kFold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Preprocessed_data createPreprocessed_data() {
		Preprocessed_dataImpl preprocessed_data = new Preprocessed_dataImpl();
		return preprocessed_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hybrid_sampling_method createHybrid_sampling_methodFromString(EDataType eDataType, String initialValue) {
		Hybrid_sampling_method result = Hybrid_sampling_method.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHybrid_sampling_methodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oversampling_technique createOversampling_techniqueFromString(EDataType eDataType, String initialValue) {
		Oversampling_technique result = Oversampling_technique.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOversampling_techniqueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnderSampling_technique createUnderSampling_techniqueFromString(EDataType eDataType, String initialValue) {
		UnderSampling_technique result = UnderSampling_technique.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnderSampling_techniqueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sampling_strategy createSampling_strategyFromString(EDataType eDataType, String initialValue) {
		Sampling_strategy result = Sampling_strategy.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSampling_strategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voting_type createVoting_typeFromString(EDataType eDataType, String initialValue) {
		Voting_type result = Voting_type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoting_typeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regularization createRegularizationFromString(EDataType eDataType, String initialValue) {
		Regularization result = Regularization.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegularizationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTrainedFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrainedToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTestedFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestedToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLowerQuartileFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLowerQuartileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUpperQuartileFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperQuartileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMedianFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedianToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ssda_researchPackage getSsda_researchPackage() {
		return (Ssda_researchPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ssda_researchPackage getPackage() {
		return Ssda_researchPackage.eINSTANCE;
	}

} //Ssda_researchFactoryImpl
