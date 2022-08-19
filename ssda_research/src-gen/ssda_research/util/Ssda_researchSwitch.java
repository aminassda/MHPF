/**
 */
package ssda_research.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ssda_research.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ssda_research.Ssda_researchPackage
 * @generated
 */
public class Ssda_researchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ssda_researchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ssda_researchSwitch() {
		if (modelPackage == null) {
			modelPackage = Ssda_researchPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM: {
			DiabeticRecommendationSystem diabeticRecommendationSystem = (DiabeticRecommendationSystem) theEObject;
			T result = caseDiabeticRecommendationSystem(diabeticRecommendationSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.PATIENT: {
			Patient patient = (Patient) theEObject;
			T result = casePatient(patient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.SYMPTOMS: {
			Symptoms symptoms = (Symptoms) theEObject;
			T result = caseSymptoms(symptoms);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.MEDICINES: {
			Medicines medicines = (Medicines) theEObject;
			T result = caseMedicines(medicines);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.DOCTOR: {
			Doctor doctor = (Doctor) theEObject;
			T result = caseDoctor(doctor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.DIABETES_PREDICTION: {
			DiabetesPrediction diabetesPrediction = (DiabetesPrediction) theEObject;
			T result = caseDiabetesPrediction(diabetesPrediction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.PERFORMANCE_EVALUATION: {
			Performance_Evaluation performance_Evaluation = (Performance_Evaluation) theEObject;
			T result = casePerformance_Evaluation(performance_Evaluation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.DATASET: {
			Dataset dataset = (Dataset) theEObject;
			T result = caseDataset(dataset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.SPLITTED_DATASET: {
			Splitted_dataset splitted_dataset = (Splitted_dataset) theEObject;
			T result = caseSplitted_dataset(splitted_dataset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.TRAIN_DATA: {
			Train_data train_data = (Train_data) theEObject;
			T result = caseTrain_data(train_data);
			if (result == null)
				result = caseSplitted_dataset(train_data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.TEST_DATA: {
			Test_data test_data = (Test_data) theEObject;
			T result = caseTest_data(test_data);
			if (result == null)
				result = caseSplitted_dataset(test_data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.MODEL_OPTIMIZATION: {
			ModelOptimization modelOptimization = (ModelOptimization) theEObject;
			T result = caseModelOptimization(modelOptimization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.RANDOMIZED_SEARCH_CV: {
			RandomizedSearchCV randomizedSearchCV = (RandomizedSearchCV) theEObject;
			T result = caseRandomizedSearchCV(randomizedSearchCV);
			if (result == null)
				result = caseModelOptimization(randomizedSearchCV);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.GRID_SEARCH_CV: {
			GridSearchCV gridSearchCV = (GridSearchCV) theEObject;
			T result = caseGridSearchCV(gridSearchCV);
			if (result == null)
				result = caseModelOptimization(gridSearchCV);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.CLASSIFIERS: {
			classifiers classifiers = (classifiers) theEObject;
			T result = caseclassifiers(classifiers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.RANDOM_FOREST_CLASSIFIER: {
			RandomForestClassifier randomForestClassifier = (RandomForestClassifier) theEObject;
			T result = caseRandomForestClassifier(randomForestClassifier);
			if (result == null)
				result = caseclassifiers(randomForestClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.MLP_CLASSIFIER: {
			MLPClassifier mlpClassifier = (MLPClassifier) theEObject;
			T result = caseMLPClassifier(mlpClassifier);
			if (result == null)
				result = caseclassifiers(mlpClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.GRADIENT_BOOSTING_CLASSIFIER: {
			GradientBoostingClassifier gradientBoostingClassifier = (GradientBoostingClassifier) theEObject;
			T result = caseGradientBoostingClassifier(gradientBoostingClassifier);
			if (result == null)
				result = caseclassifiers(gradientBoostingClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.GAUSSIAN_NB: {
			GaussianNB gaussianNB = (GaussianNB) theEObject;
			T result = caseGaussianNB(gaussianNB);
			if (result == null)
				result = caseclassifiers(gaussianNB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.SVC: {
			SVC svc = (SVC) theEObject;
			T result = caseSVC(svc);
			if (result == null)
				result = caseclassifiers(svc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.LOGISTIC_REGRESSION: {
			LogisticRegression logisticRegression = (LogisticRegression) theEObject;
			T result = caseLogisticRegression(logisticRegression);
			if (result == null)
				result = caseclassifiers(logisticRegression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER: {
			KNeighborsClassifier kNeighborsClassifier = (KNeighborsClassifier) theEObject;
			T result = caseKNeighborsClassifier(kNeighborsClassifier);
			if (result == null)
				result = caseclassifiers(kNeighborsClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.VOTING_CLASSIFIER: {
			VotingClassifier votingClassifier = (VotingClassifier) theEObject;
			T result = caseVotingClassifier(votingClassifier);
			if (result == null)
				result = caseclassifiers(votingClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.DATA_PREPROCESSING: {
			Data_Preprocessing data_Preprocessing = (Data_Preprocessing) theEObject;
			T result = caseData_Preprocessing(data_Preprocessing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.MISSING_VALUES: {
			MissingValues missingValues = (MissingValues) theEObject;
			T result = caseMissingValues(missingValues);
			if (result == null)
				result = caseData_Preprocessing(missingValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.OUTLIER_DETECTION: {
			OutlierDetection outlierDetection = (OutlierDetection) theEObject;
			T result = caseOutlierDetection(outlierDetection);
			if (result == null)
				result = caseData_Preprocessing(outlierDetection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.NUMERIC_OUTLIER: {
			Numeric_Outlier numeric_Outlier = (Numeric_Outlier) theEObject;
			T result = caseNumeric_Outlier(numeric_Outlier);
			if (result == null)
				result = caseOutlierDetection(numeric_Outlier);
			if (result == null)
				result = caseData_Preprocessing(numeric_Outlier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.FEATURE_SCALING: {
			FeatureScaling featureScaling = (FeatureScaling) theEObject;
			T result = caseFeatureScaling(featureScaling);
			if (result == null)
				result = caseData_Preprocessing(featureScaling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.STANDARD_SCALER: {
			StandardScaler standardScaler = (StandardScaler) theEObject;
			T result = caseStandardScaler(standardScaler);
			if (result == null)
				result = caseFeatureScaling(standardScaler);
			if (result == null)
				result = caseData_Preprocessing(standardScaler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.ENCODING: {
			Encoding encoding = (Encoding) theEObject;
			T result = caseEncoding(encoding);
			if (result == null)
				result = caseData_Preprocessing(encoding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.SAMPLING: {
			Sampling sampling = (Sampling) theEObject;
			T result = caseSampling(sampling);
			if (result == null)
				result = caseData_Preprocessing(sampling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.UNDERSAMPLING: {
			Undersampling undersampling = (Undersampling) theEObject;
			T result = caseUndersampling(undersampling);
			if (result == null)
				result = caseSampling(undersampling);
			if (result == null)
				result = caseData_Preprocessing(undersampling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.HYBRID_METHOD: {
			Hybrid_Method hybrid_Method = (Hybrid_Method) theEObject;
			T result = caseHybrid_Method(hybrid_Method);
			if (result == null)
				result = caseSampling(hybrid_Method);
			if (result == null)
				result = caseData_Preprocessing(hybrid_Method);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.OVER_SAMPLING: {
			OverSampling overSampling = (OverSampling) theEObject;
			T result = caseOverSampling(overSampling);
			if (result == null)
				result = caseSampling(overSampling);
			if (result == null)
				result = caseData_Preprocessing(overSampling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.VALIDATION: {
			Validation validation = (Validation) theEObject;
			T result = caseValidation(validation);
			if (result == null)
				result = caseCrossValidation(validation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.CROSS_VALIDATION: {
			CrossValidation crossValidation = (CrossValidation) theEObject;
			T result = caseCrossValidation(crossValidation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.TRAIN_TEST_SPLIT: {
			TrainTestSplit trainTestSplit = (TrainTestSplit) theEObject;
			T result = caseTrainTestSplit(trainTestSplit);
			if (result == null)
				result = caseCrossValidation(trainTestSplit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.IQR: {
			IQR iqr = (IQR) theEObject;
			T result = caseIQR(iqr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.SCATTER: {
			scatter scatter = (scatter) theEObject;
			T result = casescatter(scatter);
			if (result == null)
				result = casePlot(scatter);
			if (result == null)
				result = caseExploratoryDataAnalysis(scatter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.EXPLORATORY_DATA_ANALYSIS: {
			ExploratoryDataAnalysis exploratoryDataAnalysis = (ExploratoryDataAnalysis) theEObject;
			T result = caseExploratoryDataAnalysis(exploratoryDataAnalysis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.BOXPLOT: {
			boxplot boxplot = (boxplot) theEObject;
			T result = caseboxplot(boxplot);
			if (result == null)
				result = casePlot(boxplot);
			if (result == null)
				result = caseExploratoryDataAnalysis(boxplot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.DATASET_DECLARATION: {
			DatasetDeclaration datasetDeclaration = (DatasetDeclaration) theEObject;
			T result = caseDatasetDeclaration(datasetDeclaration);
			if (result == null)
				result = caseExploratoryDataAnalysis(datasetDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.PLOT: {
			Plot plot = (Plot) theEObject;
			T result = casePlot(plot);
			if (result == null)
				result = caseExploratoryDataAnalysis(plot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.FEATURES_SELECTION: {
			FeaturesSelection featuresSelection = (FeaturesSelection) theEObject;
			T result = caseFeaturesSelection(featuresSelection);
			if (result == null)
				result = caseData_Preprocessing(featuresSelection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.PEARSON_CORRELATION: {
			Pearson_Correlation pearson_Correlation = (Pearson_Correlation) theEObject;
			T result = casePearson_Correlation(pearson_Correlation);
			if (result == null)
				result = caseFeaturesSelection(pearson_Correlation);
			if (result == null)
				result = caseData_Preprocessing(pearson_Correlation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.LABEL_ENCODING: {
			LabelEncoding labelEncoding = (LabelEncoding) theEObject;
			T result = caseLabelEncoding(labelEncoding);
			if (result == null)
				result = caseEncoding(labelEncoding);
			if (result == null)
				result = caseData_Preprocessing(labelEncoding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.KFOLD: {
			KFold kFold = (KFold) theEObject;
			T result = caseKFold(kFold);
			if (result == null)
				result = caseValidation(kFold);
			if (result == null)
				result = caseCrossValidation(kFold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.PREPROCESSED_DATA: {
			Preprocessed_data preprocessed_data = (Preprocessed_data) theEObject;
			T result = casePreprocessed_data(preprocessed_data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ssda_researchPackage.DECISION_TREE_CLASSIFIER: {
			DecisionTreeClassifier decisionTreeClassifier = (DecisionTreeClassifier) theEObject;
			T result = caseDecisionTreeClassifier(decisionTreeClassifier);
			if (result == null)
				result = caseclassifiers(decisionTreeClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diabetic Recommendation System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diabetic Recommendation System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiabeticRecommendationSystem(DiabeticRecommendationSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symptoms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symptoms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymptoms(Symptoms object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicines</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicines</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicines(Medicines object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doctor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doctor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoctor(Doctor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diabetes Prediction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diabetes Prediction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiabetesPrediction(DiabetesPrediction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformance_Evaluation(Performance_Evaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataset(Dataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Splitted dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Splitted dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitted_dataset(Splitted_dataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrain_data(Train_data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest_data(Test_data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Optimization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Optimization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelOptimization(ModelOptimization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Randomized Search CV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Randomized Search CV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomizedSearchCV(RandomizedSearchCV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Search CV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Search CV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridSearchCV(GridSearchCV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>classifiers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>classifiers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseclassifiers(classifiers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Forest Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Forest Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomForestClassifier(RandomForestClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Tree Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Tree Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionTreeClassifier(DecisionTreeClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MLP Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MLP Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLPClassifier(MLPClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradient Boosting Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradient Boosting Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGradientBoostingClassifier(GradientBoostingClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gaussian NB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gaussian NB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGaussianNB(GaussianNB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SVC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SVC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSVC(SVC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Regression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Regression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticRegression(LogisticRegression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KNeighbors Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KNeighbors Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKNeighborsClassifier(KNeighborsClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voting Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voting Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVotingClassifier(VotingClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Preprocessing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Preprocessing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData_Preprocessing(Data_Preprocessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Missing Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Missing Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissingValues(MissingValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outlier Detection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outlier Detection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutlierDetection(OutlierDetection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Outlier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Outlier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumeric_Outlier(Numeric_Outlier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Scaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Scaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureScaling(FeatureScaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Scaler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Scaler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardScaler(StandardScaler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncoding(Encoding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampling(Sampling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undersampling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undersampling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndersampling(Undersampling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHybrid_Method(Hybrid_Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Over Sampling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Over Sampling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverSampling(OverSampling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidation(Validation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossValidation(CrossValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Test Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Test Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainTestSplit(TrainTestSplit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IQR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IQR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIQR(IQR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>scatter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>scatter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescatter(scatter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exploratory Data Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exploratory Data Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExploratoryDataAnalysis(ExploratoryDataAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>boxplot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>boxplot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseboxplot(boxplot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetDeclaration(DatasetDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlot(Plot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Features Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Features Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturesSelection(FeaturesSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pearson Correlation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pearson Correlation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePearson_Correlation(Pearson_Correlation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Encoding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelEncoding(LabelEncoding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KFold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KFold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKFold(KFold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preprocessed data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preprocessed data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreprocessed_data(Preprocessed_data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Ssda_researchSwitch
