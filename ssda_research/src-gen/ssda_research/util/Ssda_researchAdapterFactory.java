/**
 */
package ssda_research.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ssda_research.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ssda_research.Ssda_researchPackage
 * @generated
 */
public class Ssda_researchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ssda_researchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ssda_researchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ssda_researchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ssda_researchSwitch<Adapter> modelSwitch = new Ssda_researchSwitch<Adapter>() {
		@Override
		public Adapter caseDiabeticRecommendationSystem(DiabeticRecommendationSystem object) {
			return createDiabeticRecommendationSystemAdapter();
		}

		@Override
		public Adapter casePatient(Patient object) {
			return createPatientAdapter();
		}

		@Override
		public Adapter caseSymptoms(Symptoms object) {
			return createSymptomsAdapter();
		}

		@Override
		public Adapter caseMedicines(Medicines object) {
			return createMedicinesAdapter();
		}

		@Override
		public Adapter caseDoctor(Doctor object) {
			return createDoctorAdapter();
		}

		@Override
		public Adapter caseDiabetesPrediction(DiabetesPrediction object) {
			return createDiabetesPredictionAdapter();
		}

		@Override
		public Adapter casePerformance_Evaluation(Performance_Evaluation object) {
			return createPerformance_EvaluationAdapter();
		}

		@Override
		public Adapter caseDataset(Dataset object) {
			return createDatasetAdapter();
		}

		@Override
		public Adapter caseSplitted_dataset(Splitted_dataset object) {
			return createSplitted_datasetAdapter();
		}

		@Override
		public Adapter caseTrain_data(Train_data object) {
			return createTrain_dataAdapter();
		}

		@Override
		public Adapter caseTest_data(Test_data object) {
			return createTest_dataAdapter();
		}

		@Override
		public Adapter caseModelOptimization(ModelOptimization object) {
			return createModelOptimizationAdapter();
		}

		@Override
		public Adapter caseRandomizedSearchCV(RandomizedSearchCV object) {
			return createRandomizedSearchCVAdapter();
		}

		@Override
		public Adapter caseGridSearchCV(GridSearchCV object) {
			return createGridSearchCVAdapter();
		}

		@Override
		public Adapter caseclassifiers(classifiers object) {
			return createclassifiersAdapter();
		}

		@Override
		public Adapter caseRandomForestClassifier(RandomForestClassifier object) {
			return createRandomForestClassifierAdapter();
		}

		@Override
		public Adapter caseMLPClassifier(MLPClassifier object) {
			return createMLPClassifierAdapter();
		}

		@Override
		public Adapter caseGradientBoostingClassifier(GradientBoostingClassifier object) {
			return createGradientBoostingClassifierAdapter();
		}

		@Override
		public Adapter caseGaussianNB(GaussianNB object) {
			return createGaussianNBAdapter();
		}

		@Override
		public Adapter caseSVC(SVC object) {
			return createSVCAdapter();
		}

		@Override
		public Adapter caseLogisticRegression(LogisticRegression object) {
			return createLogisticRegressionAdapter();
		}

		@Override
		public Adapter caseKNeighborsClassifier(KNeighborsClassifier object) {
			return createKNeighborsClassifierAdapter();
		}

		@Override
		public Adapter caseVotingClassifier(VotingClassifier object) {
			return createVotingClassifierAdapter();
		}

		@Override
		public Adapter caseData_Preprocessing(Data_Preprocessing object) {
			return createData_PreprocessingAdapter();
		}

		@Override
		public Adapter caseMissingValues(MissingValues object) {
			return createMissingValuesAdapter();
		}

		@Override
		public Adapter caseOutlierDetection(OutlierDetection object) {
			return createOutlierDetectionAdapter();
		}

		@Override
		public Adapter caseNumeric_Outlier(Numeric_Outlier object) {
			return createNumeric_OutlierAdapter();
		}

		@Override
		public Adapter caseFeatureScaling(FeatureScaling object) {
			return createFeatureScalingAdapter();
		}

		@Override
		public Adapter caseStandardScaler(StandardScaler object) {
			return createStandardScalerAdapter();
		}

		@Override
		public Adapter caseEncoding(Encoding object) {
			return createEncodingAdapter();
		}

		@Override
		public Adapter caseSampling(Sampling object) {
			return createSamplingAdapter();
		}

		@Override
		public Adapter caseUndersampling(Undersampling object) {
			return createUndersamplingAdapter();
		}

		@Override
		public Adapter caseHybrid_Method(Hybrid_Method object) {
			return createHybrid_MethodAdapter();
		}

		@Override
		public Adapter caseOverSampling(OverSampling object) {
			return createOverSamplingAdapter();
		}

		@Override
		public Adapter caseValidation(Validation object) {
			return createValidationAdapter();
		}

		@Override
		public Adapter caseCrossValidation(CrossValidation object) {
			return createCrossValidationAdapter();
		}

		@Override
		public Adapter caseTrainTestSplit(TrainTestSplit object) {
			return createTrainTestSplitAdapter();
		}

		@Override
		public Adapter caseIQR(IQR object) {
			return createIQRAdapter();
		}

		@Override
		public Adapter casescatter(scatter object) {
			return createscatterAdapter();
		}

		@Override
		public Adapter caseExploratoryDataAnalysis(ExploratoryDataAnalysis object) {
			return createExploratoryDataAnalysisAdapter();
		}

		@Override
		public Adapter caseboxplot(boxplot object) {
			return createboxplotAdapter();
		}

		@Override
		public Adapter caseDatasetDeclaration(DatasetDeclaration object) {
			return createDatasetDeclarationAdapter();
		}

		@Override
		public Adapter casePlot(Plot object) {
			return createPlotAdapter();
		}

		@Override
		public Adapter caseFeaturesSelection(FeaturesSelection object) {
			return createFeaturesSelectionAdapter();
		}

		@Override
		public Adapter casePearson_Correlation(Pearson_Correlation object) {
			return createPearson_CorrelationAdapter();
		}

		@Override
		public Adapter caseLabelEncoding(LabelEncoding object) {
			return createLabelEncodingAdapter();
		}

		@Override
		public Adapter caseKFold(KFold object) {
			return createKFoldAdapter();
		}

		@Override
		public Adapter casePreprocessed_data(Preprocessed_data object) {
			return createPreprocessed_dataAdapter();
		}

		@Override
		public Adapter caseDecisionTreeClassifier(DecisionTreeClassifier object) {
			return createDecisionTreeClassifierAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.DiabeticRecommendationSystem <em>Diabetic Recommendation System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.DiabeticRecommendationSystem
	 * @generated
	 */
	public Adapter createDiabeticRecommendationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Patient
	 * @generated
	 */
	public Adapter createPatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Symptoms <em>Symptoms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Symptoms
	 * @generated
	 */
	public Adapter createSymptomsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Medicines <em>Medicines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Medicines
	 * @generated
	 */
	public Adapter createMedicinesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Doctor
	 * @generated
	 */
	public Adapter createDoctorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.DiabetesPrediction <em>Diabetes Prediction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.DiabetesPrediction
	 * @generated
	 */
	public Adapter createDiabetesPredictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Performance_Evaluation <em>Performance Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Performance_Evaluation
	 * @generated
	 */
	public Adapter createPerformance_EvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Dataset
	 * @generated
	 */
	public Adapter createDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Splitted_dataset <em>Splitted dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Splitted_dataset
	 * @generated
	 */
	public Adapter createSplitted_datasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Train_data <em>Train data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Train_data
	 * @generated
	 */
	public Adapter createTrain_dataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Test_data <em>Test data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Test_data
	 * @generated
	 */
	public Adapter createTest_dataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.ModelOptimization <em>Model Optimization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.ModelOptimization
	 * @generated
	 */
	public Adapter createModelOptimizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.RandomizedSearchCV <em>Randomized Search CV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.RandomizedSearchCV
	 * @generated
	 */
	public Adapter createRandomizedSearchCVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.GridSearchCV <em>Grid Search CV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.GridSearchCV
	 * @generated
	 */
	public Adapter createGridSearchCVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.classifiers <em>classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.classifiers
	 * @generated
	 */
	public Adapter createclassifiersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.RandomForestClassifier <em>Random Forest Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.RandomForestClassifier
	 * @generated
	 */
	public Adapter createRandomForestClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.DecisionTreeClassifier <em>Decision Tree Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.DecisionTreeClassifier
	 * @generated
	 */
	public Adapter createDecisionTreeClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.MLPClassifier <em>MLP Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.MLPClassifier
	 * @generated
	 */
	public Adapter createMLPClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.GradientBoostingClassifier <em>Gradient Boosting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.GradientBoostingClassifier
	 * @generated
	 */
	public Adapter createGradientBoostingClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.GaussianNB <em>Gaussian NB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.GaussianNB
	 * @generated
	 */
	public Adapter createGaussianNBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.SVC <em>SVC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.SVC
	 * @generated
	 */
	public Adapter createSVCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.LogisticRegression <em>Logistic Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.LogisticRegression
	 * @generated
	 */
	public Adapter createLogisticRegressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.KNeighborsClassifier <em>KNeighbors Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.KNeighborsClassifier
	 * @generated
	 */
	public Adapter createKNeighborsClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.VotingClassifier <em>Voting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.VotingClassifier
	 * @generated
	 */
	public Adapter createVotingClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Data_Preprocessing <em>Data Preprocessing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Data_Preprocessing
	 * @generated
	 */
	public Adapter createData_PreprocessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.MissingValues <em>Missing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.MissingValues
	 * @generated
	 */
	public Adapter createMissingValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.OutlierDetection <em>Outlier Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.OutlierDetection
	 * @generated
	 */
	public Adapter createOutlierDetectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Numeric_Outlier <em>Numeric Outlier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Numeric_Outlier
	 * @generated
	 */
	public Adapter createNumeric_OutlierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.FeatureScaling <em>Feature Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.FeatureScaling
	 * @generated
	 */
	public Adapter createFeatureScalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.StandardScaler <em>Standard Scaler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.StandardScaler
	 * @generated
	 */
	public Adapter createStandardScalerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Encoding
	 * @generated
	 */
	public Adapter createEncodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Sampling <em>Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Sampling
	 * @generated
	 */
	public Adapter createSamplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Undersampling <em>Undersampling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Undersampling
	 * @generated
	 */
	public Adapter createUndersamplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Hybrid_Method <em>Hybrid Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Hybrid_Method
	 * @generated
	 */
	public Adapter createHybrid_MethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.OverSampling <em>Over Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.OverSampling
	 * @generated
	 */
	public Adapter createOverSamplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Validation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Validation
	 * @generated
	 */
	public Adapter createValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.CrossValidation <em>Cross Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.CrossValidation
	 * @generated
	 */
	public Adapter createCrossValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.TrainTestSplit <em>Train Test Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.TrainTestSplit
	 * @generated
	 */
	public Adapter createTrainTestSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.IQR <em>IQR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.IQR
	 * @generated
	 */
	public Adapter createIQRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.scatter <em>scatter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.scatter
	 * @generated
	 */
	public Adapter createscatterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.ExploratoryDataAnalysis <em>Exploratory Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.ExploratoryDataAnalysis
	 * @generated
	 */
	public Adapter createExploratoryDataAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.boxplot <em>boxplot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.boxplot
	 * @generated
	 */
	public Adapter createboxplotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.DatasetDeclaration <em>Dataset Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.DatasetDeclaration
	 * @generated
	 */
	public Adapter createDatasetDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Plot
	 * @generated
	 */
	public Adapter createPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.FeaturesSelection <em>Features Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.FeaturesSelection
	 * @generated
	 */
	public Adapter createFeaturesSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Pearson_Correlation <em>Pearson Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Pearson_Correlation
	 * @generated
	 */
	public Adapter createPearson_CorrelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.LabelEncoding <em>Label Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.LabelEncoding
	 * @generated
	 */
	public Adapter createLabelEncodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.KFold <em>KFold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.KFold
	 * @generated
	 */
	public Adapter createKFoldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ssda_research.Preprocessed_data <em>Preprocessed data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ssda_research.Preprocessed_data
	 * @generated
	 */
	public Adapter createPreprocessed_dataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Ssda_researchAdapterFactory
