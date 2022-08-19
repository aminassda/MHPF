/**
 */
package ssda_research.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ssda_research.CrossValidation;
import ssda_research.Data_Preprocessing;
import ssda_research.Dataset;
import ssda_research.DatasetDeclaration;
import ssda_research.DecisionTreeClassifier;
import ssda_research.DiabetesPrediction;
import ssda_research.DiabeticRecommendationSystem;
import ssda_research.Doctor;
import ssda_research.Encoding;
import ssda_research.ExploratoryDataAnalysis;
import ssda_research.FeatureScaling;
import ssda_research.FeaturesSelection;
import ssda_research.GaussianNB;
import ssda_research.GradientBoostingClassifier;
import ssda_research.GridSearchCV;
import ssda_research.Hybrid_Method;
import ssda_research.Hybrid_sampling_method;
import ssda_research.KFold;
import ssda_research.KNeighborsClassifier;
import ssda_research.LabelEncoding;
import ssda_research.LogisticRegression;
import ssda_research.MLPClassifier;
import ssda_research.Medicines;
import ssda_research.MissingValues;
import ssda_research.ModelOptimization;
import ssda_research.Numeric_Outlier;
import ssda_research.OutlierDetection;
import ssda_research.OverSampling;
import ssda_research.Oversampling_technique;
import ssda_research.Patient;
import ssda_research.Pearson_Correlation;
import ssda_research.Performance_Evaluation;
import ssda_research.Plot;
import ssda_research.Preprocessed_data;
import ssda_research.RandomForestClassifier;
import ssda_research.RandomizedSearchCV;
import ssda_research.Regularization;
import ssda_research.Sampling;
import ssda_research.Sampling_strategy;
import ssda_research.Splitted_dataset;
import ssda_research.Ssda_researchFactory;
import ssda_research.Ssda_researchPackage;
import ssda_research.StandardScaler;
import ssda_research.Symptoms;
import ssda_research.Test_data;
import ssda_research.TrainTestSplit;
import ssda_research.Train_data;
import ssda_research.UnderSampling_technique;
import ssda_research.Undersampling;
import ssda_research.Validation;
import ssda_research.VotingClassifier;
import ssda_research.Voting_type;
import ssda_research.boxplot;
import ssda_research.classifiers;
import ssda_research.scatter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ssda_researchPackageImpl extends EPackageImpl implements Ssda_researchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diabeticRecommendationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symptomsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicinesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diabetesPredictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performance_EvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitted_datasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass train_dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass test_dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelOptimizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomizedSearchCVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridSearchCVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifiersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomForestClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionTreeClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlpClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientBoostingClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaussianNBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticRegressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kNeighborsClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass votingClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data_PreprocessingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlierDetectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numeric_OutlierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureScalingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardScalerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encodingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass samplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undersamplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybrid_MethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overSamplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainTestSplitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iqrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scatterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exploratoryDataAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxplotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featuresSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pearson_CorrelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEncodingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kFoldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preprocessed_dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hybrid_sampling_methodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oversampling_techniqueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum underSampling_techniqueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sampling_strategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum voting_typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regularizationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType trainedEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testedEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lowerQuartileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType upperQuartileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType medianEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ssda_research.Ssda_researchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ssda_researchPackageImpl() {
		super(eNS_URI, Ssda_researchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Ssda_researchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ssda_researchPackage init() {
		if (isInited)
			return (Ssda_researchPackage) EPackage.Registry.INSTANCE.getEPackage(Ssda_researchPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSsda_researchPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Ssda_researchPackageImpl theSsda_researchPackage = registeredSsda_researchPackage instanceof Ssda_researchPackageImpl
				? (Ssda_researchPackageImpl) registeredSsda_researchPackage
				: new Ssda_researchPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSsda_researchPackage.createPackageContents();

		// Initialize created meta-data
		theSsda_researchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSsda_researchPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ssda_researchPackage.eNS_URI, theSsda_researchPackage);
		return theSsda_researchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiabeticRecommendationSystem() {
		return diabeticRecommendationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabeticRecommendationSystem_Patient() {
		return (EReference) diabeticRecommendationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabeticRecommendationSystem_Symp() {
		return (EReference) diabeticRecommendationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabeticRecommendationSystem_Med() {
		return (EReference) diabeticRecommendationSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabeticRecommendationSystem_Doctor() {
		return (EReference) diabeticRecommendationSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabeticRecommendationSystem_Pred() {
		return (EReference) diabeticRecommendationSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabeticRecommendationSystem_Dataset() {
		return (EReference) diabeticRecommendationSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabeticRecommendationSystem_Eda() {
		return (EReference) diabeticRecommendationSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabeticRecommendationSystem_Dpreprocess() {
		return (EReference) diabeticRecommendationSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabeticRecommendationSystem_Model_op() {
		return (EReference) diabeticRecommendationSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabeticRecommendationSystem_Estimators() {
		return (EReference) diabeticRecommendationSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabeticRecommendationSystem_Cv() {
		return (EReference) diabeticRecommendationSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Name() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Height() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Weight() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Bmi() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Activity_level() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Gender() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Patient_type() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Age() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Other_diseases() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Symp() {
		return (EReference) patientEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Med() {
		return (EReference) patientEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Doctor() {
		return (EReference) patientEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_View_pred() {
		return (EReference) patientEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymptoms() {
		return symptomsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymptoms_Symptom_name() {
		return (EAttribute) symptomsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicines() {
		return medicinesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedicines_Medicine_name() {
		return (EAttribute) medicinesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedicines_Medicine_dossage() {
		return (EAttribute) medicinesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoctor() {
		return doctorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_Name() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_Address() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_Clinic_timings() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_Phone_no() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_Specalization() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctor_Patient() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctor_Recommend_med() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctor_View_pred() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiabetesPrediction() {
		return diabetesPredictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiabetesPrediction_Evaluated() {
		return (EReference) diabetesPredictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformance_Evaluation() {
		return performance_EvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformance_Evaluation__Precision_score() {
		return performance_EvaluationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformance_Evaluation__Accuracy_score() {
		return performance_EvaluationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformance_Evaluation__Recall_score() {
		return performance_EvaluationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformance_Evaluation__Confusion_matrix() {
		return performance_EvaluationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformance_Evaluation__Classification_report() {
		return performance_EvaluationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformance_Evaluation__Auc() {
		return performance_EvaluationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataset() {
		return datasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_Type() {
		return (EAttribute) datasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataset_Accessible_to() {
		return (EReference) datasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSplitted_dataset() {
		return splitted_datasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrain_data() {
		return train_dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrain_data_X_train() {
		return (EAttribute) train_dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrain_data_Y_train() {
		return (EAttribute) train_dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTest_data() {
		return test_dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTest_data_X_test() {
		return (EAttribute) test_dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTest_data_Y_test() {
		return (EAttribute) test_dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelOptimization() {
		return modelOptimizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelOptimization_Param_grid() {
		return (EAttribute) modelOptimizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelOptimization_Estimator() {
		return (EReference) modelOptimizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelOptimization_Splits() {
		return (EReference) modelOptimizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelOptimization_Generate_pred() {
		return (EReference) modelOptimizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelOptimization_Dataset() {
		return (EReference) modelOptimizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelOptimization__Fit() {
		return modelOptimizationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelOptimization__Predict() {
		return modelOptimizationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRandomizedSearchCV() {
		return randomizedSearchCVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGridSearchCV() {
		return gridSearchCVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getclassifiers() {
		return classifiersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getclassifiers_Pred() {
		return (EReference) classifiersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getclassifiers_Splits() {
		return (EReference) classifiersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getclassifiers_Dataset() {
		return (EReference) classifiersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getclassifiers_Cv() {
		return (EReference) classifiersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getclassifiers_Random_state() {
		return (EAttribute) classifiersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getclassifiers__Fit() {
		return classifiersEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getclassifiers__Predict() {
		return classifiersEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRandomForestClassifier() {
		return randomForestClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRandomForestClassifier_Max_depth() {
		return (EAttribute) randomForestClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRandomForestClassifier_Max_features() {
		return (EAttribute) randomForestClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRandomForestClassifier_Min_samples_split() {
		return (EAttribute) randomForestClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRandomForestClassifier_Min_samples_leaf() {
		return (EAttribute) randomForestClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRandomForestClassifier_N_estimators() {
		return (EAttribute) randomForestClassifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRandomForestClassifier_Criterion() {
		return (EAttribute) randomForestClassifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecisionTreeClassifier() {
		return decisionTreeClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionTreeClassifier_Criterion() {
		return (EAttribute) decisionTreeClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionTreeClassifier_Max_depth() {
		return (EAttribute) decisionTreeClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionTreeClassifier_Splitter() {
		return (EAttribute) decisionTreeClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionTreeClassifier_Min_samples_split() {
		return (EAttribute) decisionTreeClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionTreeClassifier_Min_samples_leaf() {
		return (EAttribute) decisionTreeClassifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionTreeClassifier_Min_weight_fraction_leaf() {
		return (EAttribute) decisionTreeClassifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionTreeClassifier_Max_features() {
		return (EAttribute) decisionTreeClassifierEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionTreeClassifier_Class_weight() {
		return (EAttribute) decisionTreeClassifierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMLPClassifier() {
		return mlpClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMLPClassifier_Hidden_layer_status() {
		return (EAttribute) mlpClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMLPClassifier_Activation() {
		return (EAttribute) mlpClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMLPClassifier_Solver() {
		return (EAttribute) mlpClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGradientBoostingClassifier() {
		return gradientBoostingClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGradientBoostingClassifier_N_estimators() {
		return (EAttribute) gradientBoostingClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGradientBoostingClassifier_Learning_rate() {
		return (EAttribute) gradientBoostingClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGradientBoostingClassifier_Max_depth() {
		return (EAttribute) gradientBoostingClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGaussianNB() {
		return gaussianNBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGaussianNB_Var_smoothing() {
		return (EAttribute) gaussianNBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSVC() {
		return svcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSVC_Kernel() {
		return (EAttribute) svcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSVC_Gamma() {
		return (EAttribute) svcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSVC_C() {
		return (EAttribute) svcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogisticRegression() {
		return logisticRegressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogisticRegression_Solvers() {
		return (EAttribute) logisticRegressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogisticRegression_Penalty() {
		return (EAttribute) logisticRegressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogisticRegression_C_values() {
		return (EAttribute) logisticRegressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKNeighborsClassifier() {
		return kNeighborsClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKNeighborsClassifier_Metric() {
		return (EAttribute) kNeighborsClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKNeighborsClassifier_P() {
		return (EAttribute) kNeighborsClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKNeighborsClassifier_N_neighbors() {
		return (EAttribute) kNeighborsClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVotingClassifier() {
		return votingClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVotingClassifier_Estimators() {
		return (EAttribute) votingClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVotingClassifier_Weights() {
		return (EAttribute) votingClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVotingClassifier_Voting() {
		return (EAttribute) votingClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData_Preprocessing() {
		return data_PreprocessingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Preprocessing_Dataset() {
		return (EReference) data_PreprocessingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Preprocessing_P_data() {
		return (EReference) data_PreprocessingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMissingValues() {
		return missingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMissingValues__Isnull() {
		return missingValuesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutlierDetection() {
		return outlierDetectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutlierDetection_Plot() {
		return (EReference) outlierDetectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumeric_Outlier() {
		return numeric_OutlierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNumeric_Outlier__IOR() {
		return numeric_OutlierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureScaling() {
		return featureScalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeatureScaling__Fit_transform() {
		return featureScalingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeatureScaling__Transform() {
		return featureScalingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardScaler() {
		return standardScalerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncoding() {
		return encodingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEncoding__Map() {
		return encodingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEncoding__Fit_transform() {
		return encodingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSampling() {
		return samplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampling_Strategy() {
		return (EAttribute) samplingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampling_Random_state() {
		return (EAttribute) samplingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSampling__Fit_resample() {
		return samplingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUndersampling() {
		return undersamplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUndersampling_Undersampling_technque() {
		return (EAttribute) undersamplingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHybrid_Method() {
		return hybrid_MethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHybrid_Method_Hybrid_sampling_method() {
		return (EAttribute) hybrid_MethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOverSampling() {
		return overSamplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOverSampling_Sampling_technique() {
		return (EAttribute) overSamplingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidation() {
		return validationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidation_Cv() {
		return (EAttribute) validationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValidation__Cross_val_score() {
		return validationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValidation__Cross_val_predict() {
		return validationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossValidation() {
		return crossValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossValidation_Dataset() {
		return (EReference) crossValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossValidation_Splits() {
		return (EReference) crossValidationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossValidation_Access_p_data() {
		return (EReference) crossValidationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossValidation_Classifiers() {
		return (EReference) crossValidationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossValidation_Shuffle() {
		return (EAttribute) crossValidationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossValidation_Random_state() {
		return (EAttribute) crossValidationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrainTestSplit() {
		return trainTestSplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainTestSplit_Test_size() {
		return (EAttribute) trainTestSplitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainTestSplit_Train_size() {
		return (EAttribute) trainTestSplitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTrainTestSplit__Train_test_split() {
		return trainTestSplitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIQR() {
		return iqrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIQR_Q1() {
		return (EAttribute) iqrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIQR_Q2() {
		return (EAttribute) iqrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIQR_Q3() {
		return (EAttribute) iqrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIQR__Quantile() {
		return iqrEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getscatter() {
		return scatterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getscatter__Regression_line() {
		return scatterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getscatter__X_axis() {
		return scatterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getscatter__Y_axis() {
		return scatterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExploratoryDataAnalysis() {
		return exploratoryDataAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExploratoryDataAnalysis_Datasets() {
		return (EReference) exploratoryDataAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getboxplot() {
		return boxplotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getboxplot_Min() {
		return (EAttribute) boxplotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getboxplot_Max() {
		return (EAttribute) boxplotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getboxplot_Whisker_width() {
		return (EAttribute) boxplotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getboxplot_Lower_whisker() {
		return (EAttribute) boxplotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getboxplot_Upper_whisker() {
		return (EAttribute) boxplotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getboxplot_Iqr() {
		return (EReference) boxplotEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getboxplot__Five_summarydata() {
		return boxplotEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatasetDeclaration() {
		return datasetDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatasetDeclaration__Read_csv() {
		return datasetDeclarationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatasetDeclaration__Head() {
		return datasetDeclarationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatasetDeclaration__Dtypes() {
		return datasetDeclarationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatasetDeclaration__Shape() {
		return datasetDeclarationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlot() {
		return plotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlot_Title() {
		return (EAttribute) plotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturesSelection() {
		return featuresSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeaturesSelection__Fit_transform() {
		return featuresSelectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeaturesSelection__Drop() {
		return featuresSelectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPearson_Correlation() {
		return pearson_CorrelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPearson_Correlation__Corr() {
		return pearson_CorrelationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelEncoding() {
		return labelEncodingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabelEncoding__BinaryLabels() {
		return labelEncodingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKFold() {
		return kFoldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKFold_N_splits() {
		return (EAttribute) kFoldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreprocessed_data() {
		return preprocessed_dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHybrid_sampling_method() {
		return hybrid_sampling_methodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOversampling_technique() {
		return oversampling_techniqueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnderSampling_technique() {
		return underSampling_techniqueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSampling_strategy() {
		return sampling_strategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVoting_type() {
		return voting_typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRegularization() {
		return regularizationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTrained() {
		return trainedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTested() {
		return testedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLowerQuartile() {
		return lowerQuartileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUpperQuartile() {
		return upperQuartileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMedian() {
		return medianEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ssda_researchFactory getSsda_researchFactory() {
		return (Ssda_researchFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		diabeticRecommendationSystemEClass = createEClass(DIABETIC_RECOMMENDATION_SYSTEM);
		createEReference(diabeticRecommendationSystemEClass, DIABETIC_RECOMMENDATION_SYSTEM__PATIENT);
		createEReference(diabeticRecommendationSystemEClass, DIABETIC_RECOMMENDATION_SYSTEM__SYMP);
		createEReference(diabeticRecommendationSystemEClass, DIABETIC_RECOMMENDATION_SYSTEM__MED);
		createEReference(diabeticRecommendationSystemEClass, DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR);
		createEReference(diabeticRecommendationSystemEClass, DIABETIC_RECOMMENDATION_SYSTEM__PRED);
		createEReference(diabeticRecommendationSystemEClass, DIABETIC_RECOMMENDATION_SYSTEM__DATASET);
		createEReference(diabeticRecommendationSystemEClass, DIABETIC_RECOMMENDATION_SYSTEM__EDA);
		createEReference(diabeticRecommendationSystemEClass, DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS);
		createEReference(diabeticRecommendationSystemEClass, DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP);
		createEReference(diabeticRecommendationSystemEClass, DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS);
		createEReference(diabeticRecommendationSystemEClass, DIABETIC_RECOMMENDATION_SYSTEM__CV);

		patientEClass = createEClass(PATIENT);
		createEAttribute(patientEClass, PATIENT__NAME);
		createEAttribute(patientEClass, PATIENT__HEIGHT);
		createEAttribute(patientEClass, PATIENT__WEIGHT);
		createEAttribute(patientEClass, PATIENT__BMI);
		createEAttribute(patientEClass, PATIENT__ACTIVITY_LEVEL);
		createEAttribute(patientEClass, PATIENT__GENDER);
		createEAttribute(patientEClass, PATIENT__PATIENT_TYPE);
		createEAttribute(patientEClass, PATIENT__AGE);
		createEAttribute(patientEClass, PATIENT__OTHER_DISEASES);
		createEReference(patientEClass, PATIENT__SYMP);
		createEReference(patientEClass, PATIENT__MED);
		createEReference(patientEClass, PATIENT__DOCTOR);
		createEReference(patientEClass, PATIENT__VIEW_PRED);

		symptomsEClass = createEClass(SYMPTOMS);
		createEAttribute(symptomsEClass, SYMPTOMS__SYMPTOM_NAME);

		medicinesEClass = createEClass(MEDICINES);
		createEAttribute(medicinesEClass, MEDICINES__MEDICINE_NAME);
		createEAttribute(medicinesEClass, MEDICINES__MEDICINE_DOSSAGE);

		doctorEClass = createEClass(DOCTOR);
		createEAttribute(doctorEClass, DOCTOR__NAME);
		createEAttribute(doctorEClass, DOCTOR__ADDRESS);
		createEAttribute(doctorEClass, DOCTOR__CLINIC_TIMINGS);
		createEAttribute(doctorEClass, DOCTOR__PHONE_NO);
		createEAttribute(doctorEClass, DOCTOR__SPECALIZATION);
		createEReference(doctorEClass, DOCTOR__PATIENT);
		createEReference(doctorEClass, DOCTOR__RECOMMEND_MED);
		createEReference(doctorEClass, DOCTOR__VIEW_PRED);

		diabetesPredictionEClass = createEClass(DIABETES_PREDICTION);
		createEReference(diabetesPredictionEClass, DIABETES_PREDICTION__EVALUATED);

		performance_EvaluationEClass = createEClass(PERFORMANCE_EVALUATION);
		createEOperation(performance_EvaluationEClass, PERFORMANCE_EVALUATION___PRECISION_SCORE);
		createEOperation(performance_EvaluationEClass, PERFORMANCE_EVALUATION___ACCURACY_SCORE);
		createEOperation(performance_EvaluationEClass, PERFORMANCE_EVALUATION___RECALL_SCORE);
		createEOperation(performance_EvaluationEClass, PERFORMANCE_EVALUATION___CONFUSION_MATRIX);
		createEOperation(performance_EvaluationEClass, PERFORMANCE_EVALUATION___CLASSIFICATION_REPORT);
		createEOperation(performance_EvaluationEClass, PERFORMANCE_EVALUATION___AUC);

		datasetEClass = createEClass(DATASET);
		createEAttribute(datasetEClass, DATASET__TYPE);
		createEReference(datasetEClass, DATASET__ACCESSIBLE_TO);

		splitted_datasetEClass = createEClass(SPLITTED_DATASET);

		train_dataEClass = createEClass(TRAIN_DATA);
		createEAttribute(train_dataEClass, TRAIN_DATA__XTRAIN);
		createEAttribute(train_dataEClass, TRAIN_DATA__YTRAIN);

		test_dataEClass = createEClass(TEST_DATA);
		createEAttribute(test_dataEClass, TEST_DATA__XTEST);
		createEAttribute(test_dataEClass, TEST_DATA__YTEST);

		modelOptimizationEClass = createEClass(MODEL_OPTIMIZATION);
		createEAttribute(modelOptimizationEClass, MODEL_OPTIMIZATION__PARAM_GRID);
		createEReference(modelOptimizationEClass, MODEL_OPTIMIZATION__ESTIMATOR);
		createEReference(modelOptimizationEClass, MODEL_OPTIMIZATION__SPLITS);
		createEReference(modelOptimizationEClass, MODEL_OPTIMIZATION__GENERATE_PRED);
		createEReference(modelOptimizationEClass, MODEL_OPTIMIZATION__DATASET);
		createEOperation(modelOptimizationEClass, MODEL_OPTIMIZATION___FIT);
		createEOperation(modelOptimizationEClass, MODEL_OPTIMIZATION___PREDICT);

		randomizedSearchCVEClass = createEClass(RANDOMIZED_SEARCH_CV);

		gridSearchCVEClass = createEClass(GRID_SEARCH_CV);

		classifiersEClass = createEClass(CLASSIFIERS);
		createEReference(classifiersEClass, CLASSIFIERS__PRED);
		createEReference(classifiersEClass, CLASSIFIERS__SPLITS);
		createEReference(classifiersEClass, CLASSIFIERS__DATASET);
		createEReference(classifiersEClass, CLASSIFIERS__CV);
		createEAttribute(classifiersEClass, CLASSIFIERS__RANDOM_STATE);
		createEOperation(classifiersEClass, CLASSIFIERS___FIT);
		createEOperation(classifiersEClass, CLASSIFIERS___PREDICT);

		randomForestClassifierEClass = createEClass(RANDOM_FOREST_CLASSIFIER);
		createEAttribute(randomForestClassifierEClass, RANDOM_FOREST_CLASSIFIER__MAX_DEPTH);
		createEAttribute(randomForestClassifierEClass, RANDOM_FOREST_CLASSIFIER__MAX_FEATURES);
		createEAttribute(randomForestClassifierEClass, RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT);
		createEAttribute(randomForestClassifierEClass, RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF);
		createEAttribute(randomForestClassifierEClass, RANDOM_FOREST_CLASSIFIER__NESTIMATORS);
		createEAttribute(randomForestClassifierEClass, RANDOM_FOREST_CLASSIFIER__CRITERION);

		mlpClassifierEClass = createEClass(MLP_CLASSIFIER);
		createEAttribute(mlpClassifierEClass, MLP_CLASSIFIER__HIDDEN_LAYER_STATUS);
		createEAttribute(mlpClassifierEClass, MLP_CLASSIFIER__ACTIVATION);
		createEAttribute(mlpClassifierEClass, MLP_CLASSIFIER__SOLVER);

		gradientBoostingClassifierEClass = createEClass(GRADIENT_BOOSTING_CLASSIFIER);
		createEAttribute(gradientBoostingClassifierEClass, GRADIENT_BOOSTING_CLASSIFIER__NESTIMATORS);
		createEAttribute(gradientBoostingClassifierEClass, GRADIENT_BOOSTING_CLASSIFIER__LEARNING_RATE);
		createEAttribute(gradientBoostingClassifierEClass, GRADIENT_BOOSTING_CLASSIFIER__MAX_DEPTH);

		gaussianNBEClass = createEClass(GAUSSIAN_NB);
		createEAttribute(gaussianNBEClass, GAUSSIAN_NB__VAR_SMOOTHING);

		svcEClass = createEClass(SVC);
		createEAttribute(svcEClass, SVC__KERNEL);
		createEAttribute(svcEClass, SVC__GAMMA);
		createEAttribute(svcEClass, SVC__C);

		logisticRegressionEClass = createEClass(LOGISTIC_REGRESSION);
		createEAttribute(logisticRegressionEClass, LOGISTIC_REGRESSION__SOLVERS);
		createEAttribute(logisticRegressionEClass, LOGISTIC_REGRESSION__PENALTY);
		createEAttribute(logisticRegressionEClass, LOGISTIC_REGRESSION__CVALUES);

		kNeighborsClassifierEClass = createEClass(KNEIGHBORS_CLASSIFIER);
		createEAttribute(kNeighborsClassifierEClass, KNEIGHBORS_CLASSIFIER__METRIC);
		createEAttribute(kNeighborsClassifierEClass, KNEIGHBORS_CLASSIFIER__P);
		createEAttribute(kNeighborsClassifierEClass, KNEIGHBORS_CLASSIFIER__NNEIGHBORS);

		votingClassifierEClass = createEClass(VOTING_CLASSIFIER);
		createEAttribute(votingClassifierEClass, VOTING_CLASSIFIER__VOTING);
		createEAttribute(votingClassifierEClass, VOTING_CLASSIFIER__WEIGHTS);
		createEAttribute(votingClassifierEClass, VOTING_CLASSIFIER__ESTIMATORS);

		data_PreprocessingEClass = createEClass(DATA_PREPROCESSING);
		createEReference(data_PreprocessingEClass, DATA_PREPROCESSING__DATASET);
		createEReference(data_PreprocessingEClass, DATA_PREPROCESSING__PDATA);

		missingValuesEClass = createEClass(MISSING_VALUES);
		createEOperation(missingValuesEClass, MISSING_VALUES___ISNULL);

		outlierDetectionEClass = createEClass(OUTLIER_DETECTION);
		createEReference(outlierDetectionEClass, OUTLIER_DETECTION__PLOT);

		numeric_OutlierEClass = createEClass(NUMERIC_OUTLIER);
		createEOperation(numeric_OutlierEClass, NUMERIC_OUTLIER___IOR);

		featureScalingEClass = createEClass(FEATURE_SCALING);
		createEOperation(featureScalingEClass, FEATURE_SCALING___FIT_TRANSFORM);
		createEOperation(featureScalingEClass, FEATURE_SCALING___TRANSFORM);

		standardScalerEClass = createEClass(STANDARD_SCALER);

		encodingEClass = createEClass(ENCODING);
		createEOperation(encodingEClass, ENCODING___MAP);
		createEOperation(encodingEClass, ENCODING___FIT_TRANSFORM);

		samplingEClass = createEClass(SAMPLING);
		createEAttribute(samplingEClass, SAMPLING__STRATEGY);
		createEAttribute(samplingEClass, SAMPLING__RANDOM_STATE);
		createEOperation(samplingEClass, SAMPLING___FIT_RESAMPLE);

		undersamplingEClass = createEClass(UNDERSAMPLING);
		createEAttribute(undersamplingEClass, UNDERSAMPLING__UNDERSAMPLING_TECHNQUE);

		hybrid_MethodEClass = createEClass(HYBRID_METHOD);
		createEAttribute(hybrid_MethodEClass, HYBRID_METHOD__HYBRID_SAMPLING_METHOD);

		overSamplingEClass = createEClass(OVER_SAMPLING);
		createEAttribute(overSamplingEClass, OVER_SAMPLING__SAMPLING_TECHNIQUE);

		validationEClass = createEClass(VALIDATION);
		createEAttribute(validationEClass, VALIDATION__CV);
		createEOperation(validationEClass, VALIDATION___CROSS_VAL_SCORE);
		createEOperation(validationEClass, VALIDATION___CROSS_VAL_PREDICT);

		crossValidationEClass = createEClass(CROSS_VALIDATION);
		createEReference(crossValidationEClass, CROSS_VALIDATION__DATASET);
		createEReference(crossValidationEClass, CROSS_VALIDATION__SPLITS);
		createEReference(crossValidationEClass, CROSS_VALIDATION__ACCESS_PDATA);
		createEReference(crossValidationEClass, CROSS_VALIDATION__CLASSIFIERS);
		createEAttribute(crossValidationEClass, CROSS_VALIDATION__SHUFFLE);
		createEAttribute(crossValidationEClass, CROSS_VALIDATION__RANDOM_STATE);

		trainTestSplitEClass = createEClass(TRAIN_TEST_SPLIT);
		createEAttribute(trainTestSplitEClass, TRAIN_TEST_SPLIT__TRAIN_SIZE);
		createEAttribute(trainTestSplitEClass, TRAIN_TEST_SPLIT__TEST_SIZE);
		createEOperation(trainTestSplitEClass, TRAIN_TEST_SPLIT___TRAIN_TEST_SPLIT);

		iqrEClass = createEClass(IQR);
		createEAttribute(iqrEClass, IQR__Q1);
		createEAttribute(iqrEClass, IQR__Q2);
		createEAttribute(iqrEClass, IQR__Q3);
		createEOperation(iqrEClass, IQR___QUANTILE);

		scatterEClass = createEClass(SCATTER);
		createEOperation(scatterEClass, SCATTER___REGRESSION_LINE);
		createEOperation(scatterEClass, SCATTER___XAXIS);
		createEOperation(scatterEClass, SCATTER___YAXIS);

		exploratoryDataAnalysisEClass = createEClass(EXPLORATORY_DATA_ANALYSIS);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__DATASETS);

		boxplotEClass = createEClass(BOXPLOT);
		createEAttribute(boxplotEClass, BOXPLOT__MIN);
		createEAttribute(boxplotEClass, BOXPLOT__MAX);
		createEAttribute(boxplotEClass, BOXPLOT__WHISKER_WIDTH);
		createEAttribute(boxplotEClass, BOXPLOT__LOWER_WHISKER);
		createEAttribute(boxplotEClass, BOXPLOT__UPPER_WHISKER);
		createEReference(boxplotEClass, BOXPLOT__IQR);
		createEOperation(boxplotEClass, BOXPLOT___FIVE_SUMMARYDATA);

		datasetDeclarationEClass = createEClass(DATASET_DECLARATION);
		createEOperation(datasetDeclarationEClass, DATASET_DECLARATION___READ_CSV);
		createEOperation(datasetDeclarationEClass, DATASET_DECLARATION___HEAD);
		createEOperation(datasetDeclarationEClass, DATASET_DECLARATION___DTYPES);
		createEOperation(datasetDeclarationEClass, DATASET_DECLARATION___SHAPE);

		plotEClass = createEClass(PLOT);
		createEAttribute(plotEClass, PLOT__TITLE);

		featuresSelectionEClass = createEClass(FEATURES_SELECTION);
		createEOperation(featuresSelectionEClass, FEATURES_SELECTION___FIT_TRANSFORM);
		createEOperation(featuresSelectionEClass, FEATURES_SELECTION___DROP);

		pearson_CorrelationEClass = createEClass(PEARSON_CORRELATION);
		createEOperation(pearson_CorrelationEClass, PEARSON_CORRELATION___CORR);

		labelEncodingEClass = createEClass(LABEL_ENCODING);
		createEOperation(labelEncodingEClass, LABEL_ENCODING___BINARY_LABELS);

		kFoldEClass = createEClass(KFOLD);
		createEAttribute(kFoldEClass, KFOLD__NSPLITS);

		preprocessed_dataEClass = createEClass(PREPROCESSED_DATA);

		decisionTreeClassifierEClass = createEClass(DECISION_TREE_CLASSIFIER);
		createEAttribute(decisionTreeClassifierEClass, DECISION_TREE_CLASSIFIER__CRITERION);
		createEAttribute(decisionTreeClassifierEClass, DECISION_TREE_CLASSIFIER__MAX_DEPTH);
		createEAttribute(decisionTreeClassifierEClass, DECISION_TREE_CLASSIFIER__SPLITTER);
		createEAttribute(decisionTreeClassifierEClass, DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT);
		createEAttribute(decisionTreeClassifierEClass, DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF);
		createEAttribute(decisionTreeClassifierEClass, DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF);
		createEAttribute(decisionTreeClassifierEClass, DECISION_TREE_CLASSIFIER__CLASS_WEIGHT);
		createEAttribute(decisionTreeClassifierEClass, DECISION_TREE_CLASSIFIER__MAX_FEATURES);

		// Create enums
		hybrid_sampling_methodEEnum = createEEnum(HYBRID_SAMPLING_METHOD);
		oversampling_techniqueEEnum = createEEnum(OVERSAMPLING_TECHNIQUE);
		underSampling_techniqueEEnum = createEEnum(UNDER_SAMPLING_TECHNIQUE);
		sampling_strategyEEnum = createEEnum(SAMPLING_STRATEGY);
		voting_typeEEnum = createEEnum(VOTING_TYPE);
		regularizationEEnum = createEEnum(REGULARIZATION);

		// Create data types
		trainedEDataType = createEDataType(TRAINED);
		testedEDataType = createEDataType(TESTED);
		lowerQuartileEDataType = createEDataType(LOWER_QUARTILE);
		upperQuartileEDataType = createEDataType(UPPER_QUARTILE);
		medianEDataType = createEDataType(MEDIAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		train_dataEClass.getESuperTypes().add(this.getSplitted_dataset());
		test_dataEClass.getESuperTypes().add(this.getSplitted_dataset());
		randomizedSearchCVEClass.getESuperTypes().add(this.getModelOptimization());
		gridSearchCVEClass.getESuperTypes().add(this.getModelOptimization());
		randomForestClassifierEClass.getESuperTypes().add(this.getclassifiers());
		mlpClassifierEClass.getESuperTypes().add(this.getclassifiers());
		gradientBoostingClassifierEClass.getESuperTypes().add(this.getclassifiers());
		gaussianNBEClass.getESuperTypes().add(this.getclassifiers());
		svcEClass.getESuperTypes().add(this.getclassifiers());
		logisticRegressionEClass.getESuperTypes().add(this.getclassifiers());
		kNeighborsClassifierEClass.getESuperTypes().add(this.getclassifiers());
		votingClassifierEClass.getESuperTypes().add(this.getclassifiers());
		missingValuesEClass.getESuperTypes().add(this.getData_Preprocessing());
		outlierDetectionEClass.getESuperTypes().add(this.getData_Preprocessing());
		numeric_OutlierEClass.getESuperTypes().add(this.getOutlierDetection());
		featureScalingEClass.getESuperTypes().add(this.getData_Preprocessing());
		standardScalerEClass.getESuperTypes().add(this.getFeatureScaling());
		encodingEClass.getESuperTypes().add(this.getData_Preprocessing());
		samplingEClass.getESuperTypes().add(this.getData_Preprocessing());
		undersamplingEClass.getESuperTypes().add(this.getSampling());
		hybrid_MethodEClass.getESuperTypes().add(this.getSampling());
		overSamplingEClass.getESuperTypes().add(this.getSampling());
		validationEClass.getESuperTypes().add(this.getCrossValidation());
		trainTestSplitEClass.getESuperTypes().add(this.getCrossValidation());
		scatterEClass.getESuperTypes().add(this.getPlot());
		boxplotEClass.getESuperTypes().add(this.getPlot());
		datasetDeclarationEClass.getESuperTypes().add(this.getExploratoryDataAnalysis());
		plotEClass.getESuperTypes().add(this.getExploratoryDataAnalysis());
		featuresSelectionEClass.getESuperTypes().add(this.getData_Preprocessing());
		pearson_CorrelationEClass.getESuperTypes().add(this.getFeaturesSelection());
		labelEncodingEClass.getESuperTypes().add(this.getEncoding());
		kFoldEClass.getESuperTypes().add(this.getValidation());
		decisionTreeClassifierEClass.getESuperTypes().add(this.getclassifiers());

		// Initialize classes, features, and operations; add parameters
		initEClass(diabeticRecommendationSystemEClass, DiabeticRecommendationSystem.class,
				"DiabeticRecommendationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiabeticRecommendationSystem_Patient(), this.getPatient(), null, "patient", null, 0, -1,
				DiabeticRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiabeticRecommendationSystem_Symp(), this.getSymptoms(), null, "symp", null, 0, -1,
				DiabeticRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiabeticRecommendationSystem_Med(), this.getMedicines(), null, "med", null, 0, -1,
				DiabeticRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiabeticRecommendationSystem_Doctor(), this.getDoctor(), null, "doctor", null, 0, -1,
				DiabeticRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiabeticRecommendationSystem_Pred(), this.getDiabetesPrediction(), null, "pred", null, 1, 2,
				DiabeticRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiabeticRecommendationSystem_Dataset(), this.getDataset(), null, "dataset", null, 0, -1,
				DiabeticRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiabeticRecommendationSystem_Eda(), this.getExploratoryDataAnalysis(), null, "eda", null, 0,
				-1, DiabeticRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiabeticRecommendationSystem_Dpreprocess(), this.getData_Preprocessing(), null, "dpreprocess",
				null, 0, -1, DiabeticRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiabeticRecommendationSystem_Model_op(), this.getModelOptimization(), null, "model_op", null,
				0, -1, DiabeticRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiabeticRecommendationSystem_Estimators(), this.getclassifiers(), null, "estimators", null, 0,
				-1, DiabeticRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiabeticRecommendationSystem_Cv(), this.getCrossValidation(), null, "cv", null, 0, -1,
				DiabeticRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Height(), ecorePackage.getEString(), "height", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Weight(), ecorePackage.getEString(), "weight", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Bmi(), ecorePackage.getEString(), "bmi", null, 0, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Activity_level(), ecorePackage.getEString(), "activity_level", null, 0, 1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Gender(), ecorePackage.getEString(), "gender", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Patient_type(), ecorePackage.getEString(), "patient_type", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Age(), ecorePackage.getEString(), "age", null, 0, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Other_diseases(), ecorePackage.getEString(), "Other_diseases", null, 0, 1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Symp(), this.getSymptoms(), null, "symp", null, 0, -1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPatient_Med(), this.getMedicines(), null, "med", null, 0, -1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPatient_Doctor(), this.getDoctor(), this.getDoctor_Patient(), "doctor", null, 0, -1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_View_pred(), this.getDiabetesPrediction(), null, "view_pred", null, 1, 1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symptomsEClass, Symptoms.class, "Symptoms", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymptoms_Symptom_name(), ecorePackage.getEString(), "symptom_name", null, 0, 1,
				Symptoms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(medicinesEClass, Medicines.class, "Medicines", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedicines_Medicine_name(), ecorePackage.getEString(), "medicine_name", null, 0, 1,
				Medicines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicines_Medicine_dossage(), ecorePackage.getEString(), "medicine_dossage", null, 0, 1,
				Medicines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(doctorEClass, Doctor.class, "Doctor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoctor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Doctor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Address(), ecorePackage.getEString(), "address", null, 0, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Clinic_timings(), ecorePackage.getEString(), "clinic_timings", null, 0, 1,
				Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Phone_no(), ecorePackage.getEInt(), "phone_no", null, 1, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Specalization(), ecorePackage.getEString(), "specalization", null, 0, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Patient(), this.getPatient(), this.getPatient_Doctor(), "patient", null, 0, -1,
				Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Recommend_med(), this.getMedicines(), null, "recommend_med", null, 0, -1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_View_pred(), this.getDiabetesPrediction(), null, "view_pred", null, 1, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diabetesPredictionEClass, DiabetesPrediction.class, "DiabetesPrediction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiabetesPrediction_Evaluated(), this.getPerformance_Evaluation(), null, "evaluated", null, 0,
				-1, DiabetesPrediction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performance_EvaluationEClass, Performance_Evaluation.class, "Performance_Evaluation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPerformance_Evaluation__Precision_score(), null, "precision_score", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getPerformance_Evaluation__Accuracy_score(), null, "accuracy_score", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getPerformance_Evaluation__Recall_score(), null, "recall_score", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPerformance_Evaluation__Confusion_matrix(), null, "confusion_matrix", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getPerformance_Evaluation__Classification_report(), null, "classification_report", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getPerformance_Evaluation__Auc(), null, "auc", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataset_Type(), ecorePackage.getEString(), "type", null, 0, 1, Dataset.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_Accessible_to(), this.getSymptoms(), null, "accessible_to", null, 1, -1,
				Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitted_datasetEClass, Splitted_dataset.class, "Splitted_dataset", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(train_dataEClass, Train_data.class, "Train_data", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrain_data_X_train(), this.getTrained(), "X_train", null, 0, 1, Train_data.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_data_Y_train(), this.getTrained(), "Y_train", null, 0, 1, Train_data.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(test_dataEClass, Test_data.class, "Test_data", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest_data_X_test(), this.getTested(), "X_test", null, 0, 1, Test_data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_data_Y_test(), this.getTested(), "Y_test", null, 0, 1, Test_data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelOptimizationEClass, ModelOptimization.class, "ModelOptimization", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelOptimization_Param_grid(), ecorePackage.getEString(), "param_grid", null, 0, 1,
				ModelOptimization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getModelOptimization_Estimator(), this.getclassifiers(), null, "estimator", null, 1, -1,
				ModelOptimization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelOptimization_Splits(), this.getSplitted_dataset(), null, "splits", null, 0, -1,
				ModelOptimization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelOptimization_Generate_pred(), this.getDiabetesPrediction(), null, "generate_pred", null,
				1, 1, ModelOptimization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelOptimization_Dataset(), this.getDataset(), null, "dataset", null, 0, -1,
				ModelOptimization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModelOptimization__Fit(), null, "fit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getModelOptimization__Predict(), null, "predict", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(randomizedSearchCVEClass, RandomizedSearchCV.class, "RandomizedSearchCV", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gridSearchCVEClass, GridSearchCV.class, "GridSearchCV", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(classifiersEClass, classifiers.class, "classifiers", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getclassifiers_Pred(), this.getDiabetesPrediction(), null, "pred", null, 1, 1, classifiers.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getclassifiers_Splits(), this.getSplitted_dataset(), null, "splits", null, 1, 2,
				classifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getclassifiers_Dataset(), this.getDataset(), null, "dataset", null, 1, -1, classifiers.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getclassifiers_Cv(), this.getCrossValidation(), this.getCrossValidation_Classifiers(), "cv",
				null, 0, -1, classifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getclassifiers_Random_state(), ecorePackage.getEString(), "random_state", "None", 0, 1,
				classifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getclassifiers__Fit(), null, "fit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getclassifiers__Predict(), null, "predict", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(randomForestClassifierEClass, RandomForestClassifier.class, "RandomForestClassifier", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRandomForestClassifier_Max_depth(), ecorePackage.getEString(), "max_depth", null, 0, 1,
				RandomForestClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRandomForestClassifier_Max_features(), ecorePackage.getEString(), "max_features", null, 0, 1,
				RandomForestClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRandomForestClassifier_Min_samples_split(), ecorePackage.getEString(), "min_samples_split",
				null, 0, 1, RandomForestClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRandomForestClassifier_Min_samples_leaf(), ecorePackage.getEString(), "min_samples_leaf",
				null, 0, 1, RandomForestClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRandomForestClassifier_N_estimators(), ecorePackage.getEString(), "n_estimators", null, 0, 1,
				RandomForestClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRandomForestClassifier_Criterion(), ecorePackage.getEString(), "criterion", null, 0, 1,
				RandomForestClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mlpClassifierEClass, MLPClassifier.class, "MLPClassifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMLPClassifier_Hidden_layer_status(), ecorePackage.getEInt(), "hidden_layer_status", null, 1,
				1, MLPClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMLPClassifier_Activation(), ecorePackage.getEString(), "activation", null, 0, 1,
				MLPClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMLPClassifier_Solver(), ecorePackage.getEString(), "solver", null, 0, 1, MLPClassifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientBoostingClassifierEClass, GradientBoostingClassifier.class, "GradientBoostingClassifier",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGradientBoostingClassifier_N_estimators(), ecorePackage.getEString(), "n_estimators", null, 0,
				1, GradientBoostingClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientBoostingClassifier_Learning_rate(), ecorePackage.getEFloat(), "learning_rate", null,
				1, 1, GradientBoostingClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientBoostingClassifier_Max_depth(), ecorePackage.getEString(), "max_depth", null, 0, 1,
				GradientBoostingClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gaussianNBEClass, GaussianNB.class, "GaussianNB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGaussianNB_Var_smoothing(), ecorePackage.getEString(), "var_smoothing", null, 0, 1,
				GaussianNB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(svcEClass, ssda_research.SVC.class, "SVC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSVC_Kernel(), ecorePackage.getEString(), "kernel", null, 0, 1, ssda_research.SVC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSVC_Gamma(), ecorePackage.getEInt(), "gamma", null, 1, 1, ssda_research.SVC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSVC_C(), ecorePackage.getEInt(), "C", null, 1, 1, ssda_research.SVC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logisticRegressionEClass, LogisticRegression.class, "LogisticRegression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogisticRegression_Solvers(), ecorePackage.getEString(), "solvers", null, 0, 1,
				LogisticRegression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogisticRegression_Penalty(), this.getRegularization(), "penalty", null, 0, 1,
				LogisticRegression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogisticRegression_C_values(), ecorePackage.getEString(), "c_values", null, 0, 1,
				LogisticRegression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(kNeighborsClassifierEClass, KNeighborsClassifier.class, "KNeighborsClassifier", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKNeighborsClassifier_Metric(), ecorePackage.getEString(), "metric", null, 0, 1,
				KNeighborsClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKNeighborsClassifier_P(), ecorePackage.getEInt(), "p", null, 1, 1, KNeighborsClassifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKNeighborsClassifier_N_neighbors(), ecorePackage.getEString(), "n_neighbors", null, 0, 1,
				KNeighborsClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(votingClassifierEClass, VotingClassifier.class, "VotingClassifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVotingClassifier_Voting(), this.getVoting_type(), "voting", null, 0, 1,
				VotingClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVotingClassifier_Weights(), ecorePackage.getEString(), "weights", null, 0, 1,
				VotingClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVotingClassifier_Estimators(), ecorePackage.getEString(), "estimators", null, 0, 1,
				VotingClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(data_PreprocessingEClass, Data_Preprocessing.class, "Data_Preprocessing", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Preprocessing_Dataset(), this.getDataset(), null, "dataset", null, 0, -1,
				Data_Preprocessing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Preprocessing_P_data(), this.getPreprocessed_data(), null, "p_data", null, 1, -1,
				Data_Preprocessing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missingValuesEClass, MissingValues.class, "MissingValues", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMissingValues__Isnull(), null, "isnull", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outlierDetectionEClass, OutlierDetection.class, "OutlierDetection", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutlierDetection_Plot(), this.getPlot(), null, "plot", null, 1, -1, OutlierDetection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numeric_OutlierEClass, Numeric_Outlier.class, "Numeric_Outlier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNumeric_Outlier__IOR(), null, "IOR", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureScalingEClass, FeatureScaling.class, "FeatureScaling", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFeatureScaling__Fit_transform(), null, "fit_transform", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFeatureScaling__Transform(), null, "transform", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(standardScalerEClass, StandardScaler.class, "StandardScaler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(encodingEClass, Encoding.class, "Encoding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEncoding__Map(), null, "map", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEncoding__Fit_transform(), null, "fit_transform", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(samplingEClass, Sampling.class, "Sampling", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampling_Strategy(), this.getSampling_strategy(), "strategy", null, 0, 1, Sampling.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampling_Random_state(), ecorePackage.getEString(), "random_state", "None", 0, 1,
				Sampling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getSampling__Fit_resample(), null, "fit_resample", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(undersamplingEClass, Undersampling.class, "Undersampling", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUndersampling_Undersampling_technque(), this.getUnderSampling_technique(),
				"Undersampling_technque", null, 0, 1, Undersampling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hybrid_MethodEClass, Hybrid_Method.class, "Hybrid_Method", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHybrid_Method_Hybrid_sampling_method(), this.getHybrid_sampling_method(),
				"hybrid_sampling_method", null, 0, 1, Hybrid_Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overSamplingEClass, OverSampling.class, "OverSampling", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverSampling_Sampling_technique(), this.getOversampling_technique(), "sampling_technique",
				null, 0, 1, OverSampling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validationEClass, Validation.class, "Validation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidation_Cv(), ecorePackage.getEString(), "cv", null, 0, 1, Validation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getValidation__Cross_val_score(), null, "cross_val_score", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getValidation__Cross_val_predict(), null, "cross_val_predict", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(crossValidationEClass, CrossValidation.class, "CrossValidation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrossValidation_Dataset(), this.getDataset(), null, "dataset", null, 1, -1,
				CrossValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossValidation_Splits(), this.getSplitted_dataset(), null, "splits", null, 0, 2,
				CrossValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossValidation_Access_p_data(), this.getPreprocessed_data(), null, "access_p_data", null, 0,
				-1, CrossValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossValidation_Classifiers(), this.getclassifiers(), this.getclassifiers_Cv(), "classifiers",
				null, 1, -1, CrossValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossValidation_Shuffle(), ecorePackage.getEBoolean(), "shuffle", null, 1, 1,
				CrossValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossValidation_Random_state(), ecorePackage.getEString(), "random_state", "None", 0, 1,
				CrossValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(trainTestSplitEClass, TrainTestSplit.class, "TrainTestSplit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrainTestSplit_Train_size(), ecorePackage.getEString(), "train_size", null, 0, 1,
				TrainTestSplit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainTestSplit_Test_size(), ecorePackage.getEString(), "test_size", null, 0, 1,
				TrainTestSplit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getTrainTestSplit__Train_test_split(), null, "train_test_split", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iqrEClass, ssda_research.IQR.class, "IQR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIQR_Q1(), this.getLowerQuartile(), "Q1", null, 0, 1, ssda_research.IQR.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIQR_Q2(), this.getMedian(), "Q2", null, 0, 1, ssda_research.IQR.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIQR_Q3(), this.getUpperQuartile(), "Q3", null, 0, 1, ssda_research.IQR.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIQR__Quantile(), null, "quantile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scatterEClass, scatter.class, "scatter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getscatter__Regression_line(), null, "regression_line", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getscatter__X_axis(), null, "x_axis", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getscatter__Y_axis(), null, "y_axis", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exploratoryDataAnalysisEClass, ExploratoryDataAnalysis.class, "ExploratoryDataAnalysis", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExploratoryDataAnalysis_Datasets(), this.getDataset(), null, "datasets", null, 0, -1,
				ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boxplotEClass, boxplot.class, "boxplot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getboxplot_Min(), ecorePackage.getEFloat(), "min", null, 1, 1, boxplot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getboxplot_Max(), ecorePackage.getEFloat(), "max", null, 1, 1, boxplot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getboxplot_Whisker_width(), ecorePackage.getEFloat(), "whisker_width", null, 1, 1, boxplot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getboxplot_Lower_whisker(), ecorePackage.getEString(), "lower_whisker", null, 0, 1,
				boxplot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getboxplot_Upper_whisker(), ecorePackage.getEString(), "upper_whisker", null, 0, 1,
				boxplot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getboxplot_Iqr(), this.getIQR(), null, "iqr", null, 1, -1, boxplot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getboxplot__Five_summarydata(), null, "five_summarydata", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datasetDeclarationEClass, DatasetDeclaration.class, "DatasetDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDatasetDeclaration__Read_csv(), null, "read_csv", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDatasetDeclaration__Head(), null, "head", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDatasetDeclaration__Dtypes(), null, "dtypes", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDatasetDeclaration__Shape(), null, "shape", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(plotEClass, Plot.class, "Plot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlot_Title(), ecorePackage.getEString(), "title", null, 0, 1, Plot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featuresSelectionEClass, FeaturesSelection.class, "FeaturesSelection", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFeaturesSelection__Fit_transform(), null, "fit_transform", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFeaturesSelection__Drop(), null, "drop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pearson_CorrelationEClass, Pearson_Correlation.class, "Pearson_Correlation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPearson_Correlation__Corr(), null, "corr", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(labelEncodingEClass, LabelEncoding.class, "LabelEncoding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLabelEncoding__BinaryLabels(), null, "BinaryLabels", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(kFoldEClass, KFold.class, "KFold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKFold_N_splits(), ecorePackage.getEString(), "n_splits", null, 0, 1, KFold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preprocessed_dataEClass, Preprocessed_data.class, "Preprocessed_data", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionTreeClassifierEClass, DecisionTreeClassifier.class, "DecisionTreeClassifier", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecisionTreeClassifier_Criterion(), ecorePackage.getEString(), "criterion", null, 0, 1,
				DecisionTreeClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionTreeClassifier_Max_depth(), ecorePackage.getEString(), "max_depth", null, 0, 1,
				DecisionTreeClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionTreeClassifier_Splitter(), ecorePackage.getEString(), "splitter", null, 0, 1,
				DecisionTreeClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionTreeClassifier_Min_samples_split(), ecorePackage.getEString(), "min_samples_split",
				null, 0, 1, DecisionTreeClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionTreeClassifier_Min_samples_leaf(), ecorePackage.getEString(), "min_samples_leaf",
				null, 0, 1, DecisionTreeClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionTreeClassifier_Min_weight_fraction_leaf(), ecorePackage.getEString(),
				"min_weight_fraction_leaf", null, 0, 1, DecisionTreeClassifier.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionTreeClassifier_Class_weight(), ecorePackage.getEString(), "class_weight", null, 0, 1,
				DecisionTreeClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionTreeClassifier_Max_features(), ecorePackage.getEString(), "max_features", null, 0, 1,
				DecisionTreeClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(hybrid_sampling_methodEEnum, Hybrid_sampling_method.class, "Hybrid_sampling_method");
		addEEnumLiteral(hybrid_sampling_methodEEnum, Hybrid_sampling_method.SMOTE_TOMEK);

		initEEnum(oversampling_techniqueEEnum, Oversampling_technique.class, "Oversampling_technique");
		addEEnumLiteral(oversampling_techniqueEEnum, Oversampling_technique.SMOTE);
		addEEnumLiteral(oversampling_techniqueEEnum, Oversampling_technique.RANDOM_OVER_SAMPLER);
		addEEnumLiteral(oversampling_techniqueEEnum, Oversampling_technique.ADASYN);

		initEEnum(underSampling_techniqueEEnum, UnderSampling_technique.class, "UnderSampling_technique");
		addEEnumLiteral(underSampling_techniqueEEnum, UnderSampling_technique.TOMEK_LINKS);
		addEEnumLiteral(underSampling_techniqueEEnum, UnderSampling_technique.NEAR_MISS);

		initEEnum(sampling_strategyEEnum, Sampling_strategy.class, "Sampling_strategy");
		addEEnumLiteral(sampling_strategyEEnum, Sampling_strategy.MINORITY);
		addEEnumLiteral(sampling_strategyEEnum, Sampling_strategy.MAJORITY);

		initEEnum(voting_typeEEnum, Voting_type.class, "Voting_type");
		addEEnumLiteral(voting_typeEEnum, Voting_type.HARD);
		addEEnumLiteral(voting_typeEEnum, Voting_type.SOFT);

		initEEnum(regularizationEEnum, Regularization.class, "Regularization");
		addEEnumLiteral(regularizationEEnum, Regularization.L1);
		addEEnumLiteral(regularizationEEnum, Regularization.L2);

		// Initialize data types
		initEDataType(trainedEDataType, String.class, "Trained", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(testedEDataType, String.class, "Tested", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lowerQuartileEDataType, String.class, "LowerQuartile", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(upperQuartileEDataType, String.class, "UpperQuartile", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(medianEDataType, String.class, "Median", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

} //Ssda_researchPackageImpl
