/**
 */
package ssda_research;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ssda_research.Ssda_researchFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface Ssda_researchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ssda_research";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ssda_research";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ssda_research";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ssda_researchPackage eINSTANCE = ssda_research.impl.Ssda_researchPackageImpl.init();

	/**
	 * The meta object id for the '{@link ssda_research.impl.DiabeticRecommendationSystemImpl <em>Diabetic Recommendation System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.DiabeticRecommendationSystemImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getDiabeticRecommendationSystem()
	 * @generated
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM__PATIENT = 0;

	/**
	 * The feature id for the '<em><b>Symp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM__SYMP = 1;

	/**
	 * The feature id for the '<em><b>Med</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM__MED = 2;

	/**
	 * The feature id for the '<em><b>Doctor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR = 3;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM__PRED = 4;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM__DATASET = 5;

	/**
	 * The feature id for the '<em><b>Eda</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM__EDA = 6;

	/**
	 * The feature id for the '<em><b>Dpreprocess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS = 7;

	/**
	 * The feature id for the '<em><b>Model op</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP = 8;

	/**
	 * The feature id for the '<em><b>Estimators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS = 9;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM__CV = 10;

	/**
	 * The number of structural features of the '<em>Diabetic Recommendation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Diabetic Recommendation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETIC_RECOMMENDATION_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.PatientImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Bmi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__BMI = 3;

	/**
	 * The feature id for the '<em><b>Activity level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ACTIVITY_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__GENDER = 5;

	/**
	 * The feature id for the '<em><b>Patient type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PATIENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__AGE = 7;

	/**
	 * The feature id for the '<em><b>Other diseases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__OTHER_DISEASES = 8;

	/**
	 * The feature id for the '<em><b>Symp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__SYMP = 9;

	/**
	 * The feature id for the '<em><b>Med</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__MED = 10;

	/**
	 * The feature id for the '<em><b>Doctor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__DOCTOR = 11;

	/**
	 * The feature id for the '<em><b>View pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__VIEW_PRED = 12;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.SymptomsImpl <em>Symptoms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.SymptomsImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getSymptoms()
	 * @generated
	 */
	int SYMPTOMS = 2;

	/**
	 * The feature id for the '<em><b>Symptom name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS__SYMPTOM_NAME = 0;

	/**
	 * The number of structural features of the '<em>Symptoms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Symptoms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.MedicinesImpl <em>Medicines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.MedicinesImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getMedicines()
	 * @generated
	 */
	int MEDICINES = 3;

	/**
	 * The feature id for the '<em><b>Medicine name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINES__MEDICINE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Medicine dossage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINES__MEDICINE_DOSSAGE = 1;

	/**
	 * The number of structural features of the '<em>Medicines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Medicines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.DoctorImpl <em>Doctor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.DoctorImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getDoctor()
	 * @generated
	 */
	int DOCTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Clinic timings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__CLINIC_TIMINGS = 2;

	/**
	 * The feature id for the '<em><b>Phone no</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__PHONE_NO = 3;

	/**
	 * The feature id for the '<em><b>Specalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__SPECALIZATION = 4;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__PATIENT = 5;

	/**
	 * The feature id for the '<em><b>Recommend med</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__RECOMMEND_MED = 6;

	/**
	 * The feature id for the '<em><b>View pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__VIEW_PRED = 7;

	/**
	 * The number of structural features of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.DiabetesPredictionImpl <em>Diabetes Prediction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.DiabetesPredictionImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getDiabetesPrediction()
	 * @generated
	 */
	int DIABETES_PREDICTION = 5;

	/**
	 * The feature id for the '<em><b>Evaluated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETES_PREDICTION__EVALUATED = 0;

	/**
	 * The number of structural features of the '<em>Diabetes Prediction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETES_PREDICTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diabetes Prediction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETES_PREDICTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.Performance_EvaluationImpl <em>Performance Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.Performance_EvaluationImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getPerformance_Evaluation()
	 * @generated
	 */
	int PERFORMANCE_EVALUATION = 6;

	/**
	 * The number of structural features of the '<em>Performance Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_EVALUATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Precision score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_EVALUATION___PRECISION_SCORE = 0;

	/**
	 * The operation id for the '<em>Accuracy score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_EVALUATION___ACCURACY_SCORE = 1;

	/**
	 * The operation id for the '<em>Recall score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_EVALUATION___RECALL_SCORE = 2;

	/**
	 * The operation id for the '<em>Confusion matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_EVALUATION___CONFUSION_MATRIX = 3;

	/**
	 * The operation id for the '<em>Classification report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_EVALUATION___CLASSIFICATION_REPORT = 4;

	/**
	 * The operation id for the '<em>Auc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_EVALUATION___AUC = 5;

	/**
	 * The number of operations of the '<em>Performance Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_EVALUATION_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ssda_research.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.DatasetImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Accessible to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__ACCESSIBLE_TO = 1;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.Splitted_datasetImpl <em>Splitted dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.Splitted_datasetImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getSplitted_dataset()
	 * @generated
	 */
	int SPLITTED_DATASET = 8;

	/**
	 * The number of structural features of the '<em>Splitted dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_DATASET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Splitted dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_DATASET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.Train_dataImpl <em>Train data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.Train_dataImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getTrain_data()
	 * @generated
	 */
	int TRAIN_DATA = 9;

	/**
	 * The feature id for the '<em><b>Xtrain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__XTRAIN = SPLITTED_DATASET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ytrain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__YTRAIN = SPLITTED_DATASET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Train data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA_FEATURE_COUNT = SPLITTED_DATASET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Train data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA_OPERATION_COUNT = SPLITTED_DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.Test_dataImpl <em>Test data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.Test_dataImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getTest_data()
	 * @generated
	 */
	int TEST_DATA = 10;

	/**
	 * The feature id for the '<em><b>Xtest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__XTEST = SPLITTED_DATASET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ytest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__YTEST = SPLITTED_DATASET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_FEATURE_COUNT = SPLITTED_DATASET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Test data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_OPERATION_COUNT = SPLITTED_DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.ModelOptimizationImpl <em>Model Optimization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.ModelOptimizationImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getModelOptimization()
	 * @generated
	 */
	int MODEL_OPTIMIZATION = 11;

	/**
	 * The feature id for the '<em><b>Param grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPTIMIZATION__PARAM_GRID = 0;

	/**
	 * The feature id for the '<em><b>Estimator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPTIMIZATION__ESTIMATOR = 1;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPTIMIZATION__SPLITS = 2;

	/**
	 * The feature id for the '<em><b>Generate pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPTIMIZATION__GENERATE_PRED = 3;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPTIMIZATION__DATASET = 4;

	/**
	 * The number of structural features of the '<em>Model Optimization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPTIMIZATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPTIMIZATION___FIT = 0;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPTIMIZATION___PREDICT = 1;

	/**
	 * The number of operations of the '<em>Model Optimization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPTIMIZATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ssda_research.impl.RandomizedSearchCVImpl <em>Randomized Search CV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.RandomizedSearchCVImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getRandomizedSearchCV()
	 * @generated
	 */
	int RANDOMIZED_SEARCH_CV = 12;

	/**
	 * The feature id for the '<em><b>Param grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZED_SEARCH_CV__PARAM_GRID = MODEL_OPTIMIZATION__PARAM_GRID;

	/**
	 * The feature id for the '<em><b>Estimator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZED_SEARCH_CV__ESTIMATOR = MODEL_OPTIMIZATION__ESTIMATOR;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZED_SEARCH_CV__SPLITS = MODEL_OPTIMIZATION__SPLITS;

	/**
	 * The feature id for the '<em><b>Generate pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZED_SEARCH_CV__GENERATE_PRED = MODEL_OPTIMIZATION__GENERATE_PRED;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZED_SEARCH_CV__DATASET = MODEL_OPTIMIZATION__DATASET;

	/**
	 * The number of structural features of the '<em>Randomized Search CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZED_SEARCH_CV_FEATURE_COUNT = MODEL_OPTIMIZATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZED_SEARCH_CV___FIT = MODEL_OPTIMIZATION___FIT;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZED_SEARCH_CV___PREDICT = MODEL_OPTIMIZATION___PREDICT;

	/**
	 * The number of operations of the '<em>Randomized Search CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZED_SEARCH_CV_OPERATION_COUNT = MODEL_OPTIMIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.GridSearchCVImpl <em>Grid Search CV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.GridSearchCVImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getGridSearchCV()
	 * @generated
	 */
	int GRID_SEARCH_CV = 13;

	/**
	 * The feature id for the '<em><b>Param grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_SEARCH_CV__PARAM_GRID = MODEL_OPTIMIZATION__PARAM_GRID;

	/**
	 * The feature id for the '<em><b>Estimator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_SEARCH_CV__ESTIMATOR = MODEL_OPTIMIZATION__ESTIMATOR;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_SEARCH_CV__SPLITS = MODEL_OPTIMIZATION__SPLITS;

	/**
	 * The feature id for the '<em><b>Generate pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_SEARCH_CV__GENERATE_PRED = MODEL_OPTIMIZATION__GENERATE_PRED;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_SEARCH_CV__DATASET = MODEL_OPTIMIZATION__DATASET;

	/**
	 * The number of structural features of the '<em>Grid Search CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_SEARCH_CV_FEATURE_COUNT = MODEL_OPTIMIZATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_SEARCH_CV___FIT = MODEL_OPTIMIZATION___FIT;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_SEARCH_CV___PREDICT = MODEL_OPTIMIZATION___PREDICT;

	/**
	 * The number of operations of the '<em>Grid Search CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_SEARCH_CV_OPERATION_COUNT = MODEL_OPTIMIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.classifiersImpl <em>classifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.classifiersImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getclassifiers()
	 * @generated
	 */
	int CLASSIFIERS = 14;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS__PRED = 0;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS__SPLITS = 1;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS__DATASET = 2;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS__CV = 3;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS__RANDOM_STATE = 4;

	/**
	 * The number of structural features of the '<em>classifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS___FIT = 0;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS___PREDICT = 1;

	/**
	 * The number of operations of the '<em>classifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ssda_research.impl.RandomForestClassifierImpl <em>Random Forest Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.RandomForestClassifierImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getRandomForestClassifier()
	 * @generated
	 */
	int RANDOM_FOREST_CLASSIFIER = 15;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER__PRED = CLASSIFIERS__PRED;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER__SPLITS = CLASSIFIERS__SPLITS;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER__DATASET = CLASSIFIERS__DATASET;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER__CV = CLASSIFIERS__CV;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER__RANDOM_STATE = CLASSIFIERS__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Max depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER__MAX_DEPTH = CLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER__MAX_FEATURES = CLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min samples split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT = CLASSIFIERS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min samples leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF = CLASSIFIERS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nestimators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER__NESTIMATORS = CLASSIFIERS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER__CRITERION = CLASSIFIERS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Random Forest Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER_FEATURE_COUNT = CLASSIFIERS_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER___FIT = CLASSIFIERS___FIT;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER___PREDICT = CLASSIFIERS___PREDICT;

	/**
	 * The number of operations of the '<em>Random Forest Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_CLASSIFIER_OPERATION_COUNT = CLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.DecisionTreeClassifierImpl <em>Decision Tree Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.DecisionTreeClassifierImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getDecisionTreeClassifier()
	 * @generated
	 */
	int DECISION_TREE_CLASSIFIER = 48;

	/**
	 * The meta object id for the '{@link ssda_research.impl.MLPClassifierImpl <em>MLP Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.MLPClassifierImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getMLPClassifier()
	 * @generated
	 */
	int MLP_CLASSIFIER = 16;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER__PRED = CLASSIFIERS__PRED;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER__SPLITS = CLASSIFIERS__SPLITS;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER__DATASET = CLASSIFIERS__DATASET;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER__CV = CLASSIFIERS__CV;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER__RANDOM_STATE = CLASSIFIERS__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Hidden layer status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER__HIDDEN_LAYER_STATUS = CLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER__ACTIVATION = CLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Solver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER__SOLVER = CLASSIFIERS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MLP Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER_FEATURE_COUNT = CLASSIFIERS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER___FIT = CLASSIFIERS___FIT;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER___PREDICT = CLASSIFIERS___PREDICT;

	/**
	 * The number of operations of the '<em>MLP Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_CLASSIFIER_OPERATION_COUNT = CLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.GradientBoostingClassifierImpl <em>Gradient Boosting Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.GradientBoostingClassifierImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getGradientBoostingClassifier()
	 * @generated
	 */
	int GRADIENT_BOOSTING_CLASSIFIER = 17;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER__PRED = CLASSIFIERS__PRED;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER__SPLITS = CLASSIFIERS__SPLITS;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER__DATASET = CLASSIFIERS__DATASET;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER__CV = CLASSIFIERS__CV;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER__RANDOM_STATE = CLASSIFIERS__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Nestimators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER__NESTIMATORS = CLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Learning rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER__LEARNING_RATE = CLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER__MAX_DEPTH = CLASSIFIERS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gradient Boosting Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER_FEATURE_COUNT = CLASSIFIERS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER___FIT = CLASSIFIERS___FIT;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER___PREDICT = CLASSIFIERS___PREDICT;

	/**
	 * The number of operations of the '<em>Gradient Boosting Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BOOSTING_CLASSIFIER_OPERATION_COUNT = CLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.GaussianNBImpl <em>Gaussian NB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.GaussianNBImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getGaussianNB()
	 * @generated
	 */
	int GAUSSIAN_NB = 18;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_NB__PRED = CLASSIFIERS__PRED;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_NB__SPLITS = CLASSIFIERS__SPLITS;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_NB__DATASET = CLASSIFIERS__DATASET;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_NB__CV = CLASSIFIERS__CV;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_NB__RANDOM_STATE = CLASSIFIERS__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Var smoothing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_NB__VAR_SMOOTHING = CLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gaussian NB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_NB_FEATURE_COUNT = CLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_NB___FIT = CLASSIFIERS___FIT;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_NB___PREDICT = CLASSIFIERS___PREDICT;

	/**
	 * The number of operations of the '<em>Gaussian NB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_NB_OPERATION_COUNT = CLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.SVCImpl <em>SVC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.SVCImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getSVC()
	 * @generated
	 */
	int SVC = 19;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC__PRED = CLASSIFIERS__PRED;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC__SPLITS = CLASSIFIERS__SPLITS;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC__DATASET = CLASSIFIERS__DATASET;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC__CV = CLASSIFIERS__CV;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC__RANDOM_STATE = CLASSIFIERS__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Kernel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC__KERNEL = CLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gamma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC__GAMMA = CLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC__C = CLASSIFIERS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SVC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_FEATURE_COUNT = CLASSIFIERS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC___FIT = CLASSIFIERS___FIT;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC___PREDICT = CLASSIFIERS___PREDICT;

	/**
	 * The number of operations of the '<em>SVC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVC_OPERATION_COUNT = CLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.LogisticRegressionImpl <em>Logistic Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.LogisticRegressionImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getLogisticRegression()
	 * @generated
	 */
	int LOGISTIC_REGRESSION = 20;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__PRED = CLASSIFIERS__PRED;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__SPLITS = CLASSIFIERS__SPLITS;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__DATASET = CLASSIFIERS__DATASET;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__CV = CLASSIFIERS__CV;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__RANDOM_STATE = CLASSIFIERS__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Solvers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__SOLVERS = CLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__PENALTY = CLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cvalues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__CVALUES = CLASSIFIERS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Logistic Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION_FEATURE_COUNT = CLASSIFIERS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION___FIT = CLASSIFIERS___FIT;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION___PREDICT = CLASSIFIERS___PREDICT;

	/**
	 * The number of operations of the '<em>Logistic Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION_OPERATION_COUNT = CLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.KNeighborsClassifierImpl <em>KNeighbors Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.KNeighborsClassifierImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getKNeighborsClassifier()
	 * @generated
	 */
	int KNEIGHBORS_CLASSIFIER = 21;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER__PRED = CLASSIFIERS__PRED;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER__SPLITS = CLASSIFIERS__SPLITS;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER__DATASET = CLASSIFIERS__DATASET;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER__CV = CLASSIFIERS__CV;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER__RANDOM_STATE = CLASSIFIERS__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER__METRIC = CLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER__P = CLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nneighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER__NNEIGHBORS = CLASSIFIERS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>KNeighbors Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER_FEATURE_COUNT = CLASSIFIERS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER___FIT = CLASSIFIERS___FIT;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER___PREDICT = CLASSIFIERS___PREDICT;

	/**
	 * The number of operations of the '<em>KNeighbors Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNEIGHBORS_CLASSIFIER_OPERATION_COUNT = CLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.VotingClassifierImpl <em>Voting Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.VotingClassifierImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getVotingClassifier()
	 * @generated
	 */
	int VOTING_CLASSIFIER = 22;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__PRED = CLASSIFIERS__PRED;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__SPLITS = CLASSIFIERS__SPLITS;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__DATASET = CLASSIFIERS__DATASET;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__CV = CLASSIFIERS__CV;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__RANDOM_STATE = CLASSIFIERS__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Voting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__VOTING = CLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__WEIGHTS = CLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Estimators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__ESTIMATORS = CLASSIFIERS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Voting Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER_FEATURE_COUNT = CLASSIFIERS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER___FIT = CLASSIFIERS___FIT;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER___PREDICT = CLASSIFIERS___PREDICT;

	/**
	 * The number of operations of the '<em>Voting Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER_OPERATION_COUNT = CLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.Data_PreprocessingImpl <em>Data Preprocessing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.Data_PreprocessingImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getData_Preprocessing()
	 * @generated
	 */
	int DATA_PREPROCESSING = 23;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPROCESSING__DATASET = 0;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPROCESSING__PDATA = 1;

	/**
	 * The number of structural features of the '<em>Data Preprocessing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPROCESSING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Preprocessing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPROCESSING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.MissingValuesImpl <em>Missing Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.MissingValuesImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getMissingValues()
	 * @generated
	 */
	int MISSING_VALUES = 24;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__DATASET = DATA_PREPROCESSING__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__PDATA = DATA_PREPROCESSING__PDATA;

	/**
	 * The number of structural features of the '<em>Missing Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES_FEATURE_COUNT = DATA_PREPROCESSING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Isnull</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES___ISNULL = DATA_PREPROCESSING_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Missing Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES_OPERATION_COUNT = DATA_PREPROCESSING_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssda_research.impl.OutlierDetectionImpl <em>Outlier Detection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.OutlierDetectionImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getOutlierDetection()
	 * @generated
	 */
	int OUTLIER_DETECTION = 25;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_DETECTION__DATASET = DATA_PREPROCESSING__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_DETECTION__PDATA = DATA_PREPROCESSING__PDATA;

	/**
	 * The feature id for the '<em><b>Plot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_DETECTION__PLOT = DATA_PREPROCESSING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Outlier Detection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_DETECTION_FEATURE_COUNT = DATA_PREPROCESSING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Outlier Detection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_DETECTION_OPERATION_COUNT = DATA_PREPROCESSING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.Numeric_OutlierImpl <em>Numeric Outlier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.Numeric_OutlierImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getNumeric_Outlier()
	 * @generated
	 */
	int NUMERIC_OUTLIER = 26;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OUTLIER__DATASET = OUTLIER_DETECTION__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OUTLIER__PDATA = OUTLIER_DETECTION__PDATA;

	/**
	 * The feature id for the '<em><b>Plot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OUTLIER__PLOT = OUTLIER_DETECTION__PLOT;

	/**
	 * The number of structural features of the '<em>Numeric Outlier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OUTLIER_FEATURE_COUNT = OUTLIER_DETECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>IOR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OUTLIER___IOR = OUTLIER_DETECTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Outlier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OUTLIER_OPERATION_COUNT = OUTLIER_DETECTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssda_research.impl.FeatureScalingImpl <em>Feature Scaling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.FeatureScalingImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getFeatureScaling()
	 * @generated
	 */
	int FEATURE_SCALING = 27;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SCALING__DATASET = DATA_PREPROCESSING__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SCALING__PDATA = DATA_PREPROCESSING__PDATA;

	/**
	 * The number of structural features of the '<em>Feature Scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SCALING_FEATURE_COUNT = DATA_PREPROCESSING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fit transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SCALING___FIT_TRANSFORM = DATA_PREPROCESSING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SCALING___TRANSFORM = DATA_PREPROCESSING_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SCALING_OPERATION_COUNT = DATA_PREPROCESSING_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ssda_research.impl.StandardScalerImpl <em>Standard Scaler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.StandardScalerImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getStandardScaler()
	 * @generated
	 */
	int STANDARD_SCALER = 28;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SCALER__DATASET = FEATURE_SCALING__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SCALER__PDATA = FEATURE_SCALING__PDATA;

	/**
	 * The number of structural features of the '<em>Standard Scaler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SCALER_FEATURE_COUNT = FEATURE_SCALING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fit transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SCALER___FIT_TRANSFORM = FEATURE_SCALING___FIT_TRANSFORM;

	/**
	 * The operation id for the '<em>Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SCALER___TRANSFORM = FEATURE_SCALING___TRANSFORM;

	/**
	 * The number of operations of the '<em>Standard Scaler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SCALER_OPERATION_COUNT = FEATURE_SCALING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.EncodingImpl <em>Encoding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.EncodingImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getEncoding()
	 * @generated
	 */
	int ENCODING = 29;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__DATASET = DATA_PREPROCESSING__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__PDATA = DATA_PREPROCESSING__PDATA;

	/**
	 * The number of structural features of the '<em>Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_FEATURE_COUNT = DATA_PREPROCESSING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING___MAP = DATA_PREPROCESSING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Fit transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING___FIT_TRANSFORM = DATA_PREPROCESSING_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPERATION_COUNT = DATA_PREPROCESSING_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ssda_research.impl.SamplingImpl <em>Sampling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.SamplingImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getSampling()
	 * @generated
	 */
	int SAMPLING = 30;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING__DATASET = DATA_PREPROCESSING__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING__PDATA = DATA_PREPROCESSING__PDATA;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING__STRATEGY = DATA_PREPROCESSING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING__RANDOM_STATE = DATA_PREPROCESSING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_FEATURE_COUNT = DATA_PREPROCESSING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Fit resample</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING___FIT_RESAMPLE = DATA_PREPROCESSING_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_OPERATION_COUNT = DATA_PREPROCESSING_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssda_research.impl.UndersamplingImpl <em>Undersampling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.UndersamplingImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getUndersampling()
	 * @generated
	 */
	int UNDERSAMPLING = 31;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSAMPLING__DATASET = SAMPLING__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSAMPLING__PDATA = SAMPLING__PDATA;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSAMPLING__STRATEGY = SAMPLING__STRATEGY;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSAMPLING__RANDOM_STATE = SAMPLING__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Undersampling technque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSAMPLING__UNDERSAMPLING_TECHNQUE = SAMPLING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Undersampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSAMPLING_FEATURE_COUNT = SAMPLING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Fit resample</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSAMPLING___FIT_RESAMPLE = SAMPLING___FIT_RESAMPLE;

	/**
	 * The number of operations of the '<em>Undersampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSAMPLING_OPERATION_COUNT = SAMPLING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.Hybrid_MethodImpl <em>Hybrid Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.Hybrid_MethodImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getHybrid_Method()
	 * @generated
	 */
	int HYBRID_METHOD = 32;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_METHOD__DATASET = SAMPLING__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_METHOD__PDATA = SAMPLING__PDATA;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_METHOD__STRATEGY = SAMPLING__STRATEGY;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_METHOD__RANDOM_STATE = SAMPLING__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Hybrid sampling method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_METHOD__HYBRID_SAMPLING_METHOD = SAMPLING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hybrid Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_METHOD_FEATURE_COUNT = SAMPLING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Fit resample</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_METHOD___FIT_RESAMPLE = SAMPLING___FIT_RESAMPLE;

	/**
	 * The number of operations of the '<em>Hybrid Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_METHOD_OPERATION_COUNT = SAMPLING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.OverSamplingImpl <em>Over Sampling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.OverSamplingImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getOverSampling()
	 * @generated
	 */
	int OVER_SAMPLING = 33;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_SAMPLING__DATASET = SAMPLING__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_SAMPLING__PDATA = SAMPLING__PDATA;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_SAMPLING__STRATEGY = SAMPLING__STRATEGY;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_SAMPLING__RANDOM_STATE = SAMPLING__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Sampling technique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_SAMPLING__SAMPLING_TECHNIQUE = SAMPLING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Over Sampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_SAMPLING_FEATURE_COUNT = SAMPLING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Fit resample</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_SAMPLING___FIT_RESAMPLE = SAMPLING___FIT_RESAMPLE;

	/**
	 * The number of operations of the '<em>Over Sampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_SAMPLING_OPERATION_COUNT = SAMPLING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.CrossValidationImpl <em>Cross Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.CrossValidationImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getCrossValidation()
	 * @generated
	 */
	int CROSS_VALIDATION = 35;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__DATASET = 0;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__SPLITS = 1;

	/**
	 * The feature id for the '<em><b>Access pdata</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__ACCESS_PDATA = 2;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__CLASSIFIERS = 3;

	/**
	 * The feature id for the '<em><b>Shuffle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__SHUFFLE = 4;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__RANDOM_STATE = 5;

	/**
	 * The number of structural features of the '<em>Cross Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Cross Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.ValidationImpl <em>Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.ValidationImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getValidation()
	 * @generated
	 */
	int VALIDATION = 34;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__DATASET = CROSS_VALIDATION__DATASET;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__SPLITS = CROSS_VALIDATION__SPLITS;

	/**
	 * The feature id for the '<em><b>Access pdata</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__ACCESS_PDATA = CROSS_VALIDATION__ACCESS_PDATA;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__CLASSIFIERS = CROSS_VALIDATION__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Shuffle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__SHUFFLE = CROSS_VALIDATION__SHUFFLE;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__RANDOM_STATE = CROSS_VALIDATION__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__CV = CROSS_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_FEATURE_COUNT = CROSS_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Cross val score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION___CROSS_VAL_SCORE = CROSS_VALIDATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cross val predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION___CROSS_VAL_PREDICT = CROSS_VALIDATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPERATION_COUNT = CROSS_VALIDATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ssda_research.impl.TrainTestSplitImpl <em>Train Test Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.TrainTestSplitImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getTrainTestSplit()
	 * @generated
	 */
	int TRAIN_TEST_SPLIT = 36;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TEST_SPLIT__DATASET = CROSS_VALIDATION__DATASET;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TEST_SPLIT__SPLITS = CROSS_VALIDATION__SPLITS;

	/**
	 * The feature id for the '<em><b>Access pdata</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TEST_SPLIT__ACCESS_PDATA = CROSS_VALIDATION__ACCESS_PDATA;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TEST_SPLIT__CLASSIFIERS = CROSS_VALIDATION__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Shuffle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TEST_SPLIT__SHUFFLE = CROSS_VALIDATION__SHUFFLE;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TEST_SPLIT__RANDOM_STATE = CROSS_VALIDATION__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Train size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TEST_SPLIT__TRAIN_SIZE = CROSS_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TEST_SPLIT__TEST_SIZE = CROSS_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Train Test Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TEST_SPLIT_FEATURE_COUNT = CROSS_VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Train test split</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TEST_SPLIT___TRAIN_TEST_SPLIT = CROSS_VALIDATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Train Test Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TEST_SPLIT_OPERATION_COUNT = CROSS_VALIDATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssda_research.impl.IQRImpl <em>IQR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.IQRImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getIQR()
	 * @generated
	 */
	int IQR = 37;

	/**
	 * The feature id for the '<em><b>Q1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQR__Q1 = 0;

	/**
	 * The feature id for the '<em><b>Q2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQR__Q2 = 1;

	/**
	 * The feature id for the '<em><b>Q3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQR__Q3 = 2;

	/**
	 * The number of structural features of the '<em>IQR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Quantile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQR___QUANTILE = 0;

	/**
	 * The number of operations of the '<em>IQR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ssda_research.impl.ExploratoryDataAnalysisImpl <em>Exploratory Data Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.ExploratoryDataAnalysisImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getExploratoryDataAnalysis()
	 * @generated
	 */
	int EXPLORATORY_DATA_ANALYSIS = 39;

	/**
	 * The feature id for the '<em><b>Datasets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__DATASETS = 0;

	/**
	 * The number of structural features of the '<em>Exploratory Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exploratory Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.PlotImpl <em>Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.PlotImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getPlot()
	 * @generated
	 */
	int PLOT = 42;

	/**
	 * The feature id for the '<em><b>Datasets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__DATASETS = EXPLORATORY_DATA_ANALYSIS__DATASETS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__TITLE = EXPLORATORY_DATA_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_FEATURE_COUNT = EXPLORATORY_DATA_ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_OPERATION_COUNT = EXPLORATORY_DATA_ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.scatterImpl <em>scatter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.scatterImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getscatter()
	 * @generated
	 */
	int SCATTER = 38;

	/**
	 * The feature id for the '<em><b>Datasets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__DATASETS = PLOT__DATASETS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__TITLE = PLOT__TITLE;

	/**
	 * The number of structural features of the '<em>scatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_FEATURE_COUNT = PLOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Regression line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER___REGRESSION_LINE = PLOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Xaxis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER___XAXIS = PLOT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Yaxis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER___YAXIS = PLOT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>scatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_OPERATION_COUNT = PLOT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ssda_research.impl.boxplotImpl <em>boxplot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.boxplotImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getboxplot()
	 * @generated
	 */
	int BOXPLOT = 40;

	/**
	 * The feature id for the '<em><b>Datasets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXPLOT__DATASETS = PLOT__DATASETS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXPLOT__TITLE = PLOT__TITLE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXPLOT__MIN = PLOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXPLOT__MAX = PLOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Whisker width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXPLOT__WHISKER_WIDTH = PLOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower whisker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXPLOT__LOWER_WHISKER = PLOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper whisker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXPLOT__UPPER_WHISKER = PLOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Iqr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXPLOT__IQR = PLOT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>boxplot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXPLOT_FEATURE_COUNT = PLOT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Five summarydata</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXPLOT___FIVE_SUMMARYDATA = PLOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>boxplot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXPLOT_OPERATION_COUNT = PLOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssda_research.impl.DatasetDeclarationImpl <em>Dataset Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.DatasetDeclarationImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getDatasetDeclaration()
	 * @generated
	 */
	int DATASET_DECLARATION = 41;

	/**
	 * The feature id for the '<em><b>Datasets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DECLARATION__DATASETS = EXPLORATORY_DATA_ANALYSIS__DATASETS;

	/**
	 * The number of structural features of the '<em>Dataset Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DECLARATION_FEATURE_COUNT = EXPLORATORY_DATA_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Read csv</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DECLARATION___READ_CSV = EXPLORATORY_DATA_ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Head</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DECLARATION___HEAD = EXPLORATORY_DATA_ANALYSIS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Dtypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DECLARATION___DTYPES = EXPLORATORY_DATA_ANALYSIS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Shape</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DECLARATION___SHAPE = EXPLORATORY_DATA_ANALYSIS_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dataset Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DECLARATION_OPERATION_COUNT = EXPLORATORY_DATA_ANALYSIS_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link ssda_research.impl.FeaturesSelectionImpl <em>Features Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.FeaturesSelectionImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getFeaturesSelection()
	 * @generated
	 */
	int FEATURES_SELECTION = 43;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_SELECTION__DATASET = DATA_PREPROCESSING__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_SELECTION__PDATA = DATA_PREPROCESSING__PDATA;

	/**
	 * The number of structural features of the '<em>Features Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_SELECTION_FEATURE_COUNT = DATA_PREPROCESSING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fit transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_SELECTION___FIT_TRANSFORM = DATA_PREPROCESSING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Drop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_SELECTION___DROP = DATA_PREPROCESSING_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Features Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_SELECTION_OPERATION_COUNT = DATA_PREPROCESSING_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ssda_research.impl.Pearson_CorrelationImpl <em>Pearson Correlation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.Pearson_CorrelationImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getPearson_Correlation()
	 * @generated
	 */
	int PEARSON_CORRELATION = 44;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEARSON_CORRELATION__DATASET = FEATURES_SELECTION__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEARSON_CORRELATION__PDATA = FEATURES_SELECTION__PDATA;

	/**
	 * The number of structural features of the '<em>Pearson Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEARSON_CORRELATION_FEATURE_COUNT = FEATURES_SELECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fit transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEARSON_CORRELATION___FIT_TRANSFORM = FEATURES_SELECTION___FIT_TRANSFORM;

	/**
	 * The operation id for the '<em>Drop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEARSON_CORRELATION___DROP = FEATURES_SELECTION___DROP;

	/**
	 * The operation id for the '<em>Corr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEARSON_CORRELATION___CORR = FEATURES_SELECTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pearson Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEARSON_CORRELATION_OPERATION_COUNT = FEATURES_SELECTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssda_research.impl.LabelEncodingImpl <em>Label Encoding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.LabelEncodingImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getLabelEncoding()
	 * @generated
	 */
	int LABEL_ENCODING = 45;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ENCODING__DATASET = ENCODING__DATASET;

	/**
	 * The feature id for the '<em><b>Pdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ENCODING__PDATA = ENCODING__PDATA;

	/**
	 * The number of structural features of the '<em>Label Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ENCODING_FEATURE_COUNT = ENCODING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ENCODING___MAP = ENCODING___MAP;

	/**
	 * The operation id for the '<em>Fit transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ENCODING___FIT_TRANSFORM = ENCODING___FIT_TRANSFORM;

	/**
	 * The operation id for the '<em>Binary Labels</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ENCODING___BINARY_LABELS = ENCODING_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Label Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ENCODING_OPERATION_COUNT = ENCODING_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssda_research.impl.KFoldImpl <em>KFold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.KFoldImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getKFold()
	 * @generated
	 */
	int KFOLD = 46;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD__DATASET = VALIDATION__DATASET;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD__SPLITS = VALIDATION__SPLITS;

	/**
	 * The feature id for the '<em><b>Access pdata</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD__ACCESS_PDATA = VALIDATION__ACCESS_PDATA;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD__CLASSIFIERS = VALIDATION__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Shuffle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD__SHUFFLE = VALIDATION__SHUFFLE;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD__RANDOM_STATE = VALIDATION__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD__CV = VALIDATION__CV;

	/**
	 * The feature id for the '<em><b>Nsplits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD__NSPLITS = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KFold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Cross val score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD___CROSS_VAL_SCORE = VALIDATION___CROSS_VAL_SCORE;

	/**
	 * The operation id for the '<em>Cross val predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD___CROSS_VAL_PREDICT = VALIDATION___CROSS_VAL_PREDICT;

	/**
	 * The number of operations of the '<em>KFold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KFOLD_OPERATION_COUNT = VALIDATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.impl.Preprocessed_dataImpl <em>Preprocessed data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.impl.Preprocessed_dataImpl
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getPreprocessed_data()
	 * @generated
	 */
	int PREPROCESSED_DATA = 47;

	/**
	 * The number of structural features of the '<em>Preprocessed data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSED_DATA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Preprocessed data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSED_DATA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__PRED = CLASSIFIERS__PRED;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__SPLITS = CLASSIFIERS__SPLITS;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__DATASET = CLASSIFIERS__DATASET;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__CV = CLASSIFIERS__CV;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__RANDOM_STATE = CLASSIFIERS__RANDOM_STATE;

	/**
	 * The feature id for the '<em><b>Creterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__CRETERION = CLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__MAX_DEPTH = CLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Splitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__SPLITTER = CLASSIFIERS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min samples split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT = CLASSIFIERS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min samples leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF = CLASSIFIERS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min weight fraction leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF = CLASSIFIERS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Class weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__CLASS_WEIGHT = CLASSIFIERS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER__MAX_FEATURES = CLASSIFIERS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Decision Tree Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER_FEATURE_COUNT = CLASSIFIERS_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Fit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER___FIT = CLASSIFIERS___FIT;

	/**
	 * The operation id for the '<em>Predict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER___PREDICT = CLASSIFIERS___PREDICT;

	/**
	 * The number of operations of the '<em>Decision Tree Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_CLASSIFIER_OPERATION_COUNT = CLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssda_research.Hybrid_sampling_method <em>Hybrid sampling method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.Hybrid_sampling_method
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getHybrid_sampling_method()
	 * @generated
	 */
	int HYBRID_SAMPLING_METHOD = 49;

	/**
	 * The meta object id for the '{@link ssda_research.Oversampling_technique <em>Oversampling technique</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.Oversampling_technique
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getOversampling_technique()
	 * @generated
	 */
	int OVERSAMPLING_TECHNIQUE = 50;

	/**
	 * The meta object id for the '{@link ssda_research.UnderSampling_technique <em>Under Sampling technique</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.UnderSampling_technique
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getUnderSampling_technique()
	 * @generated
	 */
	int UNDER_SAMPLING_TECHNIQUE = 51;

	/**
	 * The meta object id for the '{@link ssda_research.Sampling_strategy <em>Sampling strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.Sampling_strategy
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getSampling_strategy()
	 * @generated
	 */
	int SAMPLING_STRATEGY = 52;

	/**
	 * The meta object id for the '{@link ssda_research.Voting_type <em>Voting type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.Voting_type
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getVoting_type()
	 * @generated
	 */
	int VOTING_TYPE = 53;

	/**
	 * The meta object id for the '{@link ssda_research.Regularization <em>Regularization</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssda_research.Regularization
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getRegularization()
	 * @generated
	 */
	int REGULARIZATION = 54;

	/**
	 * The meta object id for the '<em>Trained</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getTrained()
	 * @generated
	 */
	int TRAINED = 55;

	/**
	 * The meta object id for the '<em>Tested</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getTested()
	 * @generated
	 */
	int TESTED = 56;

	/**
	 * The meta object id for the '<em>Lower Quartile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getLowerQuartile()
	 * @generated
	 */
	int LOWER_QUARTILE = 57;

	/**
	 * The meta object id for the '<em>Upper Quartile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getUpperQuartile()
	 * @generated
	 */
	int UPPER_QUARTILE = 58;

	/**
	 * The meta object id for the '<em>Median</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ssda_research.impl.Ssda_researchPackageImpl#getMedian()
	 * @generated
	 */
	int MEDIAN = 59;

	/**
	 * Returns the meta object for class '{@link ssda_research.DiabeticRecommendationSystem <em>Diabetic Recommendation System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diabetic Recommendation System</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem
	 * @generated
	 */
	EClass getDiabeticRecommendationSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabeticRecommendationSystem#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem#getPatient()
	 * @see #getDiabeticRecommendationSystem()
	 * @generated
	 */
	EReference getDiabeticRecommendationSystem_Patient();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabeticRecommendationSystem#getSymp <em>Symp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symp</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem#getSymp()
	 * @see #getDiabeticRecommendationSystem()
	 * @generated
	 */
	EReference getDiabeticRecommendationSystem_Symp();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabeticRecommendationSystem#getMed <em>Med</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Med</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem#getMed()
	 * @see #getDiabeticRecommendationSystem()
	 * @generated
	 */
	EReference getDiabeticRecommendationSystem_Med();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabeticRecommendationSystem#getDoctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doctor</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem#getDoctor()
	 * @see #getDiabeticRecommendationSystem()
	 * @generated
	 */
	EReference getDiabeticRecommendationSystem_Doctor();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabeticRecommendationSystem#getPred <em>Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pred</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem#getPred()
	 * @see #getDiabeticRecommendationSystem()
	 * @generated
	 */
	EReference getDiabeticRecommendationSystem_Pred();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabeticRecommendationSystem#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem#getDataset()
	 * @see #getDiabeticRecommendationSystem()
	 * @generated
	 */
	EReference getDiabeticRecommendationSystem_Dataset();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabeticRecommendationSystem#getEda <em>Eda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eda</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem#getEda()
	 * @see #getDiabeticRecommendationSystem()
	 * @generated
	 */
	EReference getDiabeticRecommendationSystem_Eda();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabeticRecommendationSystem#getDpreprocess <em>Dpreprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dpreprocess</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem#getDpreprocess()
	 * @see #getDiabeticRecommendationSystem()
	 * @generated
	 */
	EReference getDiabeticRecommendationSystem_Dpreprocess();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabeticRecommendationSystem#getModel_op <em>Model op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model op</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem#getModel_op()
	 * @see #getDiabeticRecommendationSystem()
	 * @generated
	 */
	EReference getDiabeticRecommendationSystem_Model_op();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabeticRecommendationSystem#getEstimators <em>Estimators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Estimators</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem#getEstimators()
	 * @see #getDiabeticRecommendationSystem()
	 * @generated
	 */
	EReference getDiabeticRecommendationSystem_Estimators();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabeticRecommendationSystem#getCv <em>Cv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cv</em>'.
	 * @see ssda_research.DiabeticRecommendationSystem#getCv()
	 * @see #getDiabeticRecommendationSystem()
	 * @generated
	 */
	EReference getDiabeticRecommendationSystem_Cv();

	/**
	 * Returns the meta object for class '{@link ssda_research.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see ssda_research.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Patient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ssda_research.Patient#getName()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Name();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Patient#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ssda_research.Patient#getHeight()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Height();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Patient#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ssda_research.Patient#getWeight()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Weight();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Patient#getBmi <em>Bmi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bmi</em>'.
	 * @see ssda_research.Patient#getBmi()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Bmi();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Patient#getActivity_level <em>Activity level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity level</em>'.
	 * @see ssda_research.Patient#getActivity_level()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Activity_level();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Patient#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see ssda_research.Patient#getGender()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Gender();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Patient#getPatient_type <em>Patient type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient type</em>'.
	 * @see ssda_research.Patient#getPatient_type()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Patient_type();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Patient#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see ssda_research.Patient#getAge()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Age();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Patient#getOther_diseases <em>Other diseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other diseases</em>'.
	 * @see ssda_research.Patient#getOther_diseases()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Other_diseases();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.Patient#getSymp <em>Symp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Symp</em>'.
	 * @see ssda_research.Patient#getSymp()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Symp();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.Patient#getMed <em>Med</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Med</em>'.
	 * @see ssda_research.Patient#getMed()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Med();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.Patient#getDoctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Doctor</em>'.
	 * @see ssda_research.Patient#getDoctor()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Doctor();

	/**
	 * Returns the meta object for the reference '{@link ssda_research.Patient#getView_pred <em>View pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View pred</em>'.
	 * @see ssda_research.Patient#getView_pred()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_View_pred();

	/**
	 * Returns the meta object for class '{@link ssda_research.Symptoms <em>Symptoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symptoms</em>'.
	 * @see ssda_research.Symptoms
	 * @generated
	 */
	EClass getSymptoms();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Symptoms#getSymptom_name <em>Symptom name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symptom name</em>'.
	 * @see ssda_research.Symptoms#getSymptom_name()
	 * @see #getSymptoms()
	 * @generated
	 */
	EAttribute getSymptoms_Symptom_name();

	/**
	 * Returns the meta object for class '{@link ssda_research.Medicines <em>Medicines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medicines</em>'.
	 * @see ssda_research.Medicines
	 * @generated
	 */
	EClass getMedicines();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Medicines#getMedicine_name <em>Medicine name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medicine name</em>'.
	 * @see ssda_research.Medicines#getMedicine_name()
	 * @see #getMedicines()
	 * @generated
	 */
	EAttribute getMedicines_Medicine_name();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Medicines#getMedicine_dossage <em>Medicine dossage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medicine dossage</em>'.
	 * @see ssda_research.Medicines#getMedicine_dossage()
	 * @see #getMedicines()
	 * @generated
	 */
	EAttribute getMedicines_Medicine_dossage();

	/**
	 * Returns the meta object for class '{@link ssda_research.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor</em>'.
	 * @see ssda_research.Doctor
	 * @generated
	 */
	EClass getDoctor();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Doctor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ssda_research.Doctor#getName()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Name();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Doctor#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see ssda_research.Doctor#getAddress()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Address();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Doctor#getClinic_timings <em>Clinic timings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clinic timings</em>'.
	 * @see ssda_research.Doctor#getClinic_timings()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Clinic_timings();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Doctor#getPhone_no <em>Phone no</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone no</em>'.
	 * @see ssda_research.Doctor#getPhone_no()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Phone_no();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Doctor#getSpecalization <em>Specalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specalization</em>'.
	 * @see ssda_research.Doctor#getSpecalization()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Specalization();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.Doctor#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Patient</em>'.
	 * @see ssda_research.Doctor#getPatient()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Patient();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.Doctor#getRecommend_med <em>Recommend med</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommend med</em>'.
	 * @see ssda_research.Doctor#getRecommend_med()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Recommend_med();

	/**
	 * Returns the meta object for the reference '{@link ssda_research.Doctor#getView_pred <em>View pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View pred</em>'.
	 * @see ssda_research.Doctor#getView_pred()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_View_pred();

	/**
	 * Returns the meta object for class '{@link ssda_research.DiabetesPrediction <em>Diabetes Prediction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diabetes Prediction</em>'.
	 * @see ssda_research.DiabetesPrediction
	 * @generated
	 */
	EClass getDiabetesPrediction();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.DiabetesPrediction#getEvaluated <em>Evaluated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluated</em>'.
	 * @see ssda_research.DiabetesPrediction#getEvaluated()
	 * @see #getDiabetesPrediction()
	 * @generated
	 */
	EReference getDiabetesPrediction_Evaluated();

	/**
	 * Returns the meta object for class '{@link ssda_research.Performance_Evaluation <em>Performance Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Evaluation</em>'.
	 * @see ssda_research.Performance_Evaluation
	 * @generated
	 */
	EClass getPerformance_Evaluation();

	/**
	 * Returns the meta object for the '{@link ssda_research.Performance_Evaluation#precision_score() <em>Precision score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Precision score</em>' operation.
	 * @see ssda_research.Performance_Evaluation#precision_score()
	 * @generated
	 */
	EOperation getPerformance_Evaluation__Precision_score();

	/**
	 * Returns the meta object for the '{@link ssda_research.Performance_Evaluation#accuracy_score() <em>Accuracy score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accuracy score</em>' operation.
	 * @see ssda_research.Performance_Evaluation#accuracy_score()
	 * @generated
	 */
	EOperation getPerformance_Evaluation__Accuracy_score();

	/**
	 * Returns the meta object for the '{@link ssda_research.Performance_Evaluation#recall_score() <em>Recall score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recall score</em>' operation.
	 * @see ssda_research.Performance_Evaluation#recall_score()
	 * @generated
	 */
	EOperation getPerformance_Evaluation__Recall_score();

	/**
	 * Returns the meta object for the '{@link ssda_research.Performance_Evaluation#confusion_matrix() <em>Confusion matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confusion matrix</em>' operation.
	 * @see ssda_research.Performance_Evaluation#confusion_matrix()
	 * @generated
	 */
	EOperation getPerformance_Evaluation__Confusion_matrix();

	/**
	 * Returns the meta object for the '{@link ssda_research.Performance_Evaluation#classification_report() <em>Classification report</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Classification report</em>' operation.
	 * @see ssda_research.Performance_Evaluation#classification_report()
	 * @generated
	 */
	EOperation getPerformance_Evaluation__Classification_report();

	/**
	 * Returns the meta object for the '{@link ssda_research.Performance_Evaluation#auc() <em>Auc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Auc</em>' operation.
	 * @see ssda_research.Performance_Evaluation#auc()
	 * @generated
	 */
	EOperation getPerformance_Evaluation__Auc();

	/**
	 * Returns the meta object for class '{@link ssda_research.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see ssda_research.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Dataset#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ssda_research.Dataset#getType()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Type();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.Dataset#getAccessible_to <em>Accessible to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessible to</em>'.
	 * @see ssda_research.Dataset#getAccessible_to()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_Accessible_to();

	/**
	 * Returns the meta object for class '{@link ssda_research.Splitted_dataset <em>Splitted dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Splitted dataset</em>'.
	 * @see ssda_research.Splitted_dataset
	 * @generated
	 */
	EClass getSplitted_dataset();

	/**
	 * Returns the meta object for class '{@link ssda_research.Train_data <em>Train data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train data</em>'.
	 * @see ssda_research.Train_data
	 * @generated
	 */
	EClass getTrain_data();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Train_data#getX_train <em>Xtrain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xtrain</em>'.
	 * @see ssda_research.Train_data#getX_train()
	 * @see #getTrain_data()
	 * @generated
	 */
	EAttribute getTrain_data_X_train();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Train_data#getY_train <em>Ytrain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ytrain</em>'.
	 * @see ssda_research.Train_data#getY_train()
	 * @see #getTrain_data()
	 * @generated
	 */
	EAttribute getTrain_data_Y_train();

	/**
	 * Returns the meta object for class '{@link ssda_research.Test_data <em>Test data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test data</em>'.
	 * @see ssda_research.Test_data
	 * @generated
	 */
	EClass getTest_data();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Test_data#getX_test <em>Xtest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xtest</em>'.
	 * @see ssda_research.Test_data#getX_test()
	 * @see #getTest_data()
	 * @generated
	 */
	EAttribute getTest_data_X_test();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Test_data#getY_test <em>Ytest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ytest</em>'.
	 * @see ssda_research.Test_data#getY_test()
	 * @see #getTest_data()
	 * @generated
	 */
	EAttribute getTest_data_Y_test();

	/**
	 * Returns the meta object for class '{@link ssda_research.ModelOptimization <em>Model Optimization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Optimization</em>'.
	 * @see ssda_research.ModelOptimization
	 * @generated
	 */
	EClass getModelOptimization();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.ModelOptimization#getParam_grid <em>Param grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param grid</em>'.
	 * @see ssda_research.ModelOptimization#getParam_grid()
	 * @see #getModelOptimization()
	 * @generated
	 */
	EAttribute getModelOptimization_Param_grid();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.ModelOptimization#getEstimator <em>Estimator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estimator</em>'.
	 * @see ssda_research.ModelOptimization#getEstimator()
	 * @see #getModelOptimization()
	 * @generated
	 */
	EReference getModelOptimization_Estimator();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.ModelOptimization#getSplits <em>Splits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Splits</em>'.
	 * @see ssda_research.ModelOptimization#getSplits()
	 * @see #getModelOptimization()
	 * @generated
	 */
	EReference getModelOptimization_Splits();

	/**
	 * Returns the meta object for the reference '{@link ssda_research.ModelOptimization#getGenerate_pred <em>Generate pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generate pred</em>'.
	 * @see ssda_research.ModelOptimization#getGenerate_pred()
	 * @see #getModelOptimization()
	 * @generated
	 */
	EReference getModelOptimization_Generate_pred();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.ModelOptimization#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dataset</em>'.
	 * @see ssda_research.ModelOptimization#getDataset()
	 * @see #getModelOptimization()
	 * @generated
	 */
	EReference getModelOptimization_Dataset();

	/**
	 * Returns the meta object for the '{@link ssda_research.ModelOptimization#fit() <em>Fit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fit</em>' operation.
	 * @see ssda_research.ModelOptimization#fit()
	 * @generated
	 */
	EOperation getModelOptimization__Fit();

	/**
	 * Returns the meta object for the '{@link ssda_research.ModelOptimization#predict() <em>Predict</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Predict</em>' operation.
	 * @see ssda_research.ModelOptimization#predict()
	 * @generated
	 */
	EOperation getModelOptimization__Predict();

	/**
	 * Returns the meta object for class '{@link ssda_research.RandomizedSearchCV <em>Randomized Search CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Randomized Search CV</em>'.
	 * @see ssda_research.RandomizedSearchCV
	 * @generated
	 */
	EClass getRandomizedSearchCV();

	/**
	 * Returns the meta object for class '{@link ssda_research.GridSearchCV <em>Grid Search CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Search CV</em>'.
	 * @see ssda_research.GridSearchCV
	 * @generated
	 */
	EClass getGridSearchCV();

	/**
	 * Returns the meta object for class '{@link ssda_research.classifiers <em>classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>classifiers</em>'.
	 * @see ssda_research.classifiers
	 * @generated
	 */
	EClass getclassifiers();

	/**
	 * Returns the meta object for the reference '{@link ssda_research.classifiers#getPred <em>Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pred</em>'.
	 * @see ssda_research.classifiers#getPred()
	 * @see #getclassifiers()
	 * @generated
	 */
	EReference getclassifiers_Pred();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.classifiers#getSplits <em>Splits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Splits</em>'.
	 * @see ssda_research.classifiers#getSplits()
	 * @see #getclassifiers()
	 * @generated
	 */
	EReference getclassifiers_Splits();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.classifiers#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dataset</em>'.
	 * @see ssda_research.classifiers#getDataset()
	 * @see #getclassifiers()
	 * @generated
	 */
	EReference getclassifiers_Dataset();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.classifiers#getCv <em>Cv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cv</em>'.
	 * @see ssda_research.classifiers#getCv()
	 * @see #getclassifiers()
	 * @generated
	 */
	EReference getclassifiers_Cv();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.classifiers#getRandom_state <em>Random state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random state</em>'.
	 * @see ssda_research.classifiers#getRandom_state()
	 * @see #getclassifiers()
	 * @generated
	 */
	EAttribute getclassifiers_Random_state();

	/**
	 * Returns the meta object for the '{@link ssda_research.classifiers#fit() <em>Fit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fit</em>' operation.
	 * @see ssda_research.classifiers#fit()
	 * @generated
	 */
	EOperation getclassifiers__Fit();

	/**
	 * Returns the meta object for the '{@link ssda_research.classifiers#predict() <em>Predict</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Predict</em>' operation.
	 * @see ssda_research.classifiers#predict()
	 * @generated
	 */
	EOperation getclassifiers__Predict();

	/**
	 * Returns the meta object for class '{@link ssda_research.RandomForestClassifier <em>Random Forest Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Forest Classifier</em>'.
	 * @see ssda_research.RandomForestClassifier
	 * @generated
	 */
	EClass getRandomForestClassifier();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.RandomForestClassifier#getMax_depth <em>Max depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max depth</em>'.
	 * @see ssda_research.RandomForestClassifier#getMax_depth()
	 * @see #getRandomForestClassifier()
	 * @generated
	 */
	EAttribute getRandomForestClassifier_Max_depth();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.RandomForestClassifier#getMax_features <em>Max features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max features</em>'.
	 * @see ssda_research.RandomForestClassifier#getMax_features()
	 * @see #getRandomForestClassifier()
	 * @generated
	 */
	EAttribute getRandomForestClassifier_Max_features();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.RandomForestClassifier#getMin_samples_split <em>Min samples split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min samples split</em>'.
	 * @see ssda_research.RandomForestClassifier#getMin_samples_split()
	 * @see #getRandomForestClassifier()
	 * @generated
	 */
	EAttribute getRandomForestClassifier_Min_samples_split();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.RandomForestClassifier#getMin_samples_leaf <em>Min samples leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min samples leaf</em>'.
	 * @see ssda_research.RandomForestClassifier#getMin_samples_leaf()
	 * @see #getRandomForestClassifier()
	 * @generated
	 */
	EAttribute getRandomForestClassifier_Min_samples_leaf();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.RandomForestClassifier#getN_estimators <em>Nestimators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nestimators</em>'.
	 * @see ssda_research.RandomForestClassifier#getN_estimators()
	 * @see #getRandomForestClassifier()
	 * @generated
	 */
	EAttribute getRandomForestClassifier_N_estimators();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.RandomForestClassifier#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criterion</em>'.
	 * @see ssda_research.RandomForestClassifier#getCriterion()
	 * @see #getRandomForestClassifier()
	 * @generated
	 */
	EAttribute getRandomForestClassifier_Criterion();

	/**
	 * Returns the meta object for class '{@link ssda_research.DecisionTreeClassifier <em>Decision Tree Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Tree Classifier</em>'.
	 * @see ssda_research.DecisionTreeClassifier
	 * @generated
	 */
	EClass getDecisionTreeClassifier();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.DecisionTreeClassifier#getCreterion <em>Creterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creterion</em>'.
	 * @see ssda_research.DecisionTreeClassifier#getCreterion()
	 * @see #getDecisionTreeClassifier()
	 * @generated
	 */
	EAttribute getDecisionTreeClassifier_Creterion();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.DecisionTreeClassifier#getMax_depth <em>Max depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max depth</em>'.
	 * @see ssda_research.DecisionTreeClassifier#getMax_depth()
	 * @see #getDecisionTreeClassifier()
	 * @generated
	 */
	EAttribute getDecisionTreeClassifier_Max_depth();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.DecisionTreeClassifier#getSplitter <em>Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Splitter</em>'.
	 * @see ssda_research.DecisionTreeClassifier#getSplitter()
	 * @see #getDecisionTreeClassifier()
	 * @generated
	 */
	EAttribute getDecisionTreeClassifier_Splitter();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.DecisionTreeClassifier#getMin_samples_split <em>Min samples split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min samples split</em>'.
	 * @see ssda_research.DecisionTreeClassifier#getMin_samples_split()
	 * @see #getDecisionTreeClassifier()
	 * @generated
	 */
	EAttribute getDecisionTreeClassifier_Min_samples_split();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.DecisionTreeClassifier#getMin_samples_leaf <em>Min samples leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min samples leaf</em>'.
	 * @see ssda_research.DecisionTreeClassifier#getMin_samples_leaf()
	 * @see #getDecisionTreeClassifier()
	 * @generated
	 */
	EAttribute getDecisionTreeClassifier_Min_samples_leaf();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.DecisionTreeClassifier#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min weight fraction leaf</em>'.
	 * @see ssda_research.DecisionTreeClassifier#getMin_weight_fraction_leaf()
	 * @see #getDecisionTreeClassifier()
	 * @generated
	 */
	EAttribute getDecisionTreeClassifier_Min_weight_fraction_leaf();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.DecisionTreeClassifier#getMax_features <em>Max features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max features</em>'.
	 * @see ssda_research.DecisionTreeClassifier#getMax_features()
	 * @see #getDecisionTreeClassifier()
	 * @generated
	 */
	EAttribute getDecisionTreeClassifier_Max_features();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.DecisionTreeClassifier#getClass_weight <em>Class weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class weight</em>'.
	 * @see ssda_research.DecisionTreeClassifier#getClass_weight()
	 * @see #getDecisionTreeClassifier()
	 * @generated
	 */
	EAttribute getDecisionTreeClassifier_Class_weight();

	/**
	 * Returns the meta object for class '{@link ssda_research.MLPClassifier <em>MLP Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MLP Classifier</em>'.
	 * @see ssda_research.MLPClassifier
	 * @generated
	 */
	EClass getMLPClassifier();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.MLPClassifier#getHidden_layer_status <em>Hidden layer status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden layer status</em>'.
	 * @see ssda_research.MLPClassifier#getHidden_layer_status()
	 * @see #getMLPClassifier()
	 * @generated
	 */
	EAttribute getMLPClassifier_Hidden_layer_status();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.MLPClassifier#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation</em>'.
	 * @see ssda_research.MLPClassifier#getActivation()
	 * @see #getMLPClassifier()
	 * @generated
	 */
	EAttribute getMLPClassifier_Activation();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.MLPClassifier#getSolver <em>Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver</em>'.
	 * @see ssda_research.MLPClassifier#getSolver()
	 * @see #getMLPClassifier()
	 * @generated
	 */
	EAttribute getMLPClassifier_Solver();

	/**
	 * Returns the meta object for class '{@link ssda_research.GradientBoostingClassifier <em>Gradient Boosting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradient Boosting Classifier</em>'.
	 * @see ssda_research.GradientBoostingClassifier
	 * @generated
	 */
	EClass getGradientBoostingClassifier();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.GradientBoostingClassifier#getN_estimators <em>Nestimators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nestimators</em>'.
	 * @see ssda_research.GradientBoostingClassifier#getN_estimators()
	 * @see #getGradientBoostingClassifier()
	 * @generated
	 */
	EAttribute getGradientBoostingClassifier_N_estimators();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.GradientBoostingClassifier#getLearning_rate <em>Learning rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Learning rate</em>'.
	 * @see ssda_research.GradientBoostingClassifier#getLearning_rate()
	 * @see #getGradientBoostingClassifier()
	 * @generated
	 */
	EAttribute getGradientBoostingClassifier_Learning_rate();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.GradientBoostingClassifier#getMax_depth <em>Max depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max depth</em>'.
	 * @see ssda_research.GradientBoostingClassifier#getMax_depth()
	 * @see #getGradientBoostingClassifier()
	 * @generated
	 */
	EAttribute getGradientBoostingClassifier_Max_depth();

	/**
	 * Returns the meta object for class '{@link ssda_research.GaussianNB <em>Gaussian NB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gaussian NB</em>'.
	 * @see ssda_research.GaussianNB
	 * @generated
	 */
	EClass getGaussianNB();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.GaussianNB#getVar_smoothing <em>Var smoothing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var smoothing</em>'.
	 * @see ssda_research.GaussianNB#getVar_smoothing()
	 * @see #getGaussianNB()
	 * @generated
	 */
	EAttribute getGaussianNB_Var_smoothing();

	/**
	 * Returns the meta object for class '{@link ssda_research.SVC <em>SVC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SVC</em>'.
	 * @see ssda_research.SVC
	 * @generated
	 */
	EClass getSVC();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.SVC#getKernel <em>Kernel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel</em>'.
	 * @see ssda_research.SVC#getKernel()
	 * @see #getSVC()
	 * @generated
	 */
	EAttribute getSVC_Kernel();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.SVC#getGamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gamma</em>'.
	 * @see ssda_research.SVC#getGamma()
	 * @see #getSVC()
	 * @generated
	 */
	EAttribute getSVC_Gamma();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.SVC#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see ssda_research.SVC#getC()
	 * @see #getSVC()
	 * @generated
	 */
	EAttribute getSVC_C();

	/**
	 * Returns the meta object for class '{@link ssda_research.LogisticRegression <em>Logistic Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Regression</em>'.
	 * @see ssda_research.LogisticRegression
	 * @generated
	 */
	EClass getLogisticRegression();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.LogisticRegression#getSolvers <em>Solvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solvers</em>'.
	 * @see ssda_research.LogisticRegression#getSolvers()
	 * @see #getLogisticRegression()
	 * @generated
	 */
	EAttribute getLogisticRegression_Solvers();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.LogisticRegression#getPenalty <em>Penalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty</em>'.
	 * @see ssda_research.LogisticRegression#getPenalty()
	 * @see #getLogisticRegression()
	 * @generated
	 */
	EAttribute getLogisticRegression_Penalty();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.LogisticRegression#getC_values <em>Cvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cvalues</em>'.
	 * @see ssda_research.LogisticRegression#getC_values()
	 * @see #getLogisticRegression()
	 * @generated
	 */
	EAttribute getLogisticRegression_C_values();

	/**
	 * Returns the meta object for class '{@link ssda_research.KNeighborsClassifier <em>KNeighbors Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KNeighbors Classifier</em>'.
	 * @see ssda_research.KNeighborsClassifier
	 * @generated
	 */
	EClass getKNeighborsClassifier();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.KNeighborsClassifier#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see ssda_research.KNeighborsClassifier#getMetric()
	 * @see #getKNeighborsClassifier()
	 * @generated
	 */
	EAttribute getKNeighborsClassifier_Metric();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.KNeighborsClassifier#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P</em>'.
	 * @see ssda_research.KNeighborsClassifier#getP()
	 * @see #getKNeighborsClassifier()
	 * @generated
	 */
	EAttribute getKNeighborsClassifier_P();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.KNeighborsClassifier#getN_neighbors <em>Nneighbors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nneighbors</em>'.
	 * @see ssda_research.KNeighborsClassifier#getN_neighbors()
	 * @see #getKNeighborsClassifier()
	 * @generated
	 */
	EAttribute getKNeighborsClassifier_N_neighbors();

	/**
	 * Returns the meta object for class '{@link ssda_research.VotingClassifier <em>Voting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voting Classifier</em>'.
	 * @see ssda_research.VotingClassifier
	 * @generated
	 */
	EClass getVotingClassifier();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.VotingClassifier#getEstimators <em>Estimators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimators</em>'.
	 * @see ssda_research.VotingClassifier#getEstimators()
	 * @see #getVotingClassifier()
	 * @generated
	 */
	EAttribute getVotingClassifier_Estimators();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.VotingClassifier#getWeights <em>Weights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weights</em>'.
	 * @see ssda_research.VotingClassifier#getWeights()
	 * @see #getVotingClassifier()
	 * @generated
	 */
	EAttribute getVotingClassifier_Weights();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.VotingClassifier#getVoting <em>Voting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voting</em>'.
	 * @see ssda_research.VotingClassifier#getVoting()
	 * @see #getVotingClassifier()
	 * @generated
	 */
	EAttribute getVotingClassifier_Voting();

	/**
	 * Returns the meta object for class '{@link ssda_research.Data_Preprocessing <em>Data Preprocessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Preprocessing</em>'.
	 * @see ssda_research.Data_Preprocessing
	 * @generated
	 */
	EClass getData_Preprocessing();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.Data_Preprocessing#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dataset</em>'.
	 * @see ssda_research.Data_Preprocessing#getDataset()
	 * @see #getData_Preprocessing()
	 * @generated
	 */
	EReference getData_Preprocessing_Dataset();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.Data_Preprocessing#getP_data <em>Pdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pdata</em>'.
	 * @see ssda_research.Data_Preprocessing#getP_data()
	 * @see #getData_Preprocessing()
	 * @generated
	 */
	EReference getData_Preprocessing_P_data();

	/**
	 * Returns the meta object for class '{@link ssda_research.MissingValues <em>Missing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Missing Values</em>'.
	 * @see ssda_research.MissingValues
	 * @generated
	 */
	EClass getMissingValues();

	/**
	 * Returns the meta object for the '{@link ssda_research.MissingValues#isnull() <em>Isnull</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Isnull</em>' operation.
	 * @see ssda_research.MissingValues#isnull()
	 * @generated
	 */
	EOperation getMissingValues__Isnull();

	/**
	 * Returns the meta object for class '{@link ssda_research.OutlierDetection <em>Outlier Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outlier Detection</em>'.
	 * @see ssda_research.OutlierDetection
	 * @generated
	 */
	EClass getOutlierDetection();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.OutlierDetection#getPlot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plot</em>'.
	 * @see ssda_research.OutlierDetection#getPlot()
	 * @see #getOutlierDetection()
	 * @generated
	 */
	EReference getOutlierDetection_Plot();

	/**
	 * Returns the meta object for class '{@link ssda_research.Numeric_Outlier <em>Numeric Outlier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Outlier</em>'.
	 * @see ssda_research.Numeric_Outlier
	 * @generated
	 */
	EClass getNumeric_Outlier();

	/**
	 * Returns the meta object for the '{@link ssda_research.Numeric_Outlier#IOR() <em>IOR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>IOR</em>' operation.
	 * @see ssda_research.Numeric_Outlier#IOR()
	 * @generated
	 */
	EOperation getNumeric_Outlier__IOR();

	/**
	 * Returns the meta object for class '{@link ssda_research.FeatureScaling <em>Feature Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Scaling</em>'.
	 * @see ssda_research.FeatureScaling
	 * @generated
	 */
	EClass getFeatureScaling();

	/**
	 * Returns the meta object for the '{@link ssda_research.FeatureScaling#fit_transform() <em>Fit transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fit transform</em>' operation.
	 * @see ssda_research.FeatureScaling#fit_transform()
	 * @generated
	 */
	EOperation getFeatureScaling__Fit_transform();

	/**
	 * Returns the meta object for the '{@link ssda_research.FeatureScaling#transform() <em>Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform</em>' operation.
	 * @see ssda_research.FeatureScaling#transform()
	 * @generated
	 */
	EOperation getFeatureScaling__Transform();

	/**
	 * Returns the meta object for class '{@link ssda_research.StandardScaler <em>Standard Scaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Scaler</em>'.
	 * @see ssda_research.StandardScaler
	 * @generated
	 */
	EClass getStandardScaler();

	/**
	 * Returns the meta object for class '{@link ssda_research.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoding</em>'.
	 * @see ssda_research.Encoding
	 * @generated
	 */
	EClass getEncoding();

	/**
	 * Returns the meta object for the '{@link ssda_research.Encoding#map() <em>Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Map</em>' operation.
	 * @see ssda_research.Encoding#map()
	 * @generated
	 */
	EOperation getEncoding__Map();

	/**
	 * Returns the meta object for the '{@link ssda_research.Encoding#fit_transform() <em>Fit transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fit transform</em>' operation.
	 * @see ssda_research.Encoding#fit_transform()
	 * @generated
	 */
	EOperation getEncoding__Fit_transform();

	/**
	 * Returns the meta object for class '{@link ssda_research.Sampling <em>Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampling</em>'.
	 * @see ssda_research.Sampling
	 * @generated
	 */
	EClass getSampling();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Sampling#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see ssda_research.Sampling#getStrategy()
	 * @see #getSampling()
	 * @generated
	 */
	EAttribute getSampling_Strategy();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Sampling#getRandom_state <em>Random state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random state</em>'.
	 * @see ssda_research.Sampling#getRandom_state()
	 * @see #getSampling()
	 * @generated
	 */
	EAttribute getSampling_Random_state();

	/**
	 * Returns the meta object for the '{@link ssda_research.Sampling#fit_resample() <em>Fit resample</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fit resample</em>' operation.
	 * @see ssda_research.Sampling#fit_resample()
	 * @generated
	 */
	EOperation getSampling__Fit_resample();

	/**
	 * Returns the meta object for class '{@link ssda_research.Undersampling <em>Undersampling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undersampling</em>'.
	 * @see ssda_research.Undersampling
	 * @generated
	 */
	EClass getUndersampling();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Undersampling#getUndersampling_technque <em>Undersampling technque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undersampling technque</em>'.
	 * @see ssda_research.Undersampling#getUndersampling_technque()
	 * @see #getUndersampling()
	 * @generated
	 */
	EAttribute getUndersampling_Undersampling_technque();

	/**
	 * Returns the meta object for class '{@link ssda_research.Hybrid_Method <em>Hybrid Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Method</em>'.
	 * @see ssda_research.Hybrid_Method
	 * @generated
	 */
	EClass getHybrid_Method();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Hybrid_Method#getHybrid_sampling_method <em>Hybrid sampling method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hybrid sampling method</em>'.
	 * @see ssda_research.Hybrid_Method#getHybrid_sampling_method()
	 * @see #getHybrid_Method()
	 * @generated
	 */
	EAttribute getHybrid_Method_Hybrid_sampling_method();

	/**
	 * Returns the meta object for class '{@link ssda_research.OverSampling <em>Over Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Over Sampling</em>'.
	 * @see ssda_research.OverSampling
	 * @generated
	 */
	EClass getOverSampling();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.OverSampling#getSampling_technique <em>Sampling technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling technique</em>'.
	 * @see ssda_research.OverSampling#getSampling_technique()
	 * @see #getOverSampling()
	 * @generated
	 */
	EAttribute getOverSampling_Sampling_technique();

	/**
	 * Returns the meta object for class '{@link ssda_research.Validation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation</em>'.
	 * @see ssda_research.Validation
	 * @generated
	 */
	EClass getValidation();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Validation#getCv <em>Cv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cv</em>'.
	 * @see ssda_research.Validation#getCv()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_Cv();

	/**
	 * Returns the meta object for the '{@link ssda_research.Validation#cross_val_score() <em>Cross val score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cross val score</em>' operation.
	 * @see ssda_research.Validation#cross_val_score()
	 * @generated
	 */
	EOperation getValidation__Cross_val_score();

	/**
	 * Returns the meta object for the '{@link ssda_research.Validation#cross_val_predict() <em>Cross val predict</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cross val predict</em>' operation.
	 * @see ssda_research.Validation#cross_val_predict()
	 * @generated
	 */
	EOperation getValidation__Cross_val_predict();

	/**
	 * Returns the meta object for class '{@link ssda_research.CrossValidation <em>Cross Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Validation</em>'.
	 * @see ssda_research.CrossValidation
	 * @generated
	 */
	EClass getCrossValidation();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.CrossValidation#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dataset</em>'.
	 * @see ssda_research.CrossValidation#getDataset()
	 * @see #getCrossValidation()
	 * @generated
	 */
	EReference getCrossValidation_Dataset();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.CrossValidation#getSplits <em>Splits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Splits</em>'.
	 * @see ssda_research.CrossValidation#getSplits()
	 * @see #getCrossValidation()
	 * @generated
	 */
	EReference getCrossValidation_Splits();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.CrossValidation#getAccess_p_data <em>Access pdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Access pdata</em>'.
	 * @see ssda_research.CrossValidation#getAccess_p_data()
	 * @see #getCrossValidation()
	 * @generated
	 */
	EReference getCrossValidation_Access_p_data();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.CrossValidation#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classifiers</em>'.
	 * @see ssda_research.CrossValidation#getClassifiers()
	 * @see #getCrossValidation()
	 * @generated
	 */
	EReference getCrossValidation_Classifiers();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.CrossValidation#isShuffle <em>Shuffle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shuffle</em>'.
	 * @see ssda_research.CrossValidation#isShuffle()
	 * @see #getCrossValidation()
	 * @generated
	 */
	EAttribute getCrossValidation_Shuffle();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.CrossValidation#getRandom_state <em>Random state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random state</em>'.
	 * @see ssda_research.CrossValidation#getRandom_state()
	 * @see #getCrossValidation()
	 * @generated
	 */
	EAttribute getCrossValidation_Random_state();

	/**
	 * Returns the meta object for class '{@link ssda_research.TrainTestSplit <em>Train Test Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Test Split</em>'.
	 * @see ssda_research.TrainTestSplit
	 * @generated
	 */
	EClass getTrainTestSplit();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.TrainTestSplit#getTest_size <em>Test size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test size</em>'.
	 * @see ssda_research.TrainTestSplit#getTest_size()
	 * @see #getTrainTestSplit()
	 * @generated
	 */
	EAttribute getTrainTestSplit_Test_size();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.TrainTestSplit#getTrain_size <em>Train size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train size</em>'.
	 * @see ssda_research.TrainTestSplit#getTrain_size()
	 * @see #getTrainTestSplit()
	 * @generated
	 */
	EAttribute getTrainTestSplit_Train_size();

	/**
	 * Returns the meta object for the '{@link ssda_research.TrainTestSplit#train_test_split() <em>Train test split</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Train test split</em>' operation.
	 * @see ssda_research.TrainTestSplit#train_test_split()
	 * @generated
	 */
	EOperation getTrainTestSplit__Train_test_split();

	/**
	 * Returns the meta object for class '{@link ssda_research.IQR <em>IQR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IQR</em>'.
	 * @see ssda_research.IQR
	 * @generated
	 */
	EClass getIQR();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.IQR#getQ1 <em>Q1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Q1</em>'.
	 * @see ssda_research.IQR#getQ1()
	 * @see #getIQR()
	 * @generated
	 */
	EAttribute getIQR_Q1();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.IQR#getQ2 <em>Q2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Q2</em>'.
	 * @see ssda_research.IQR#getQ2()
	 * @see #getIQR()
	 * @generated
	 */
	EAttribute getIQR_Q2();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.IQR#getQ3 <em>Q3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Q3</em>'.
	 * @see ssda_research.IQR#getQ3()
	 * @see #getIQR()
	 * @generated
	 */
	EAttribute getIQR_Q3();

	/**
	 * Returns the meta object for the '{@link ssda_research.IQR#quantile() <em>Quantile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quantile</em>' operation.
	 * @see ssda_research.IQR#quantile()
	 * @generated
	 */
	EOperation getIQR__Quantile();

	/**
	 * Returns the meta object for class '{@link ssda_research.scatter <em>scatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>scatter</em>'.
	 * @see ssda_research.scatter
	 * @generated
	 */
	EClass getscatter();

	/**
	 * Returns the meta object for the '{@link ssda_research.scatter#regression_line() <em>Regression line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Regression line</em>' operation.
	 * @see ssda_research.scatter#regression_line()
	 * @generated
	 */
	EOperation getscatter__Regression_line();

	/**
	 * Returns the meta object for the '{@link ssda_research.scatter#x_axis() <em>Xaxis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Xaxis</em>' operation.
	 * @see ssda_research.scatter#x_axis()
	 * @generated
	 */
	EOperation getscatter__X_axis();

	/**
	 * Returns the meta object for the '{@link ssda_research.scatter#y_axis() <em>Yaxis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Yaxis</em>' operation.
	 * @see ssda_research.scatter#y_axis()
	 * @generated
	 */
	EOperation getscatter__Y_axis();

	/**
	 * Returns the meta object for class '{@link ssda_research.ExploratoryDataAnalysis <em>Exploratory Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exploratory Data Analysis</em>'.
	 * @see ssda_research.ExploratoryDataAnalysis
	 * @generated
	 */
	EClass getExploratoryDataAnalysis();

	/**
	 * Returns the meta object for the reference list '{@link ssda_research.ExploratoryDataAnalysis#getDatasets <em>Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datasets</em>'.
	 * @see ssda_research.ExploratoryDataAnalysis#getDatasets()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_Datasets();

	/**
	 * Returns the meta object for class '{@link ssda_research.boxplot <em>boxplot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>boxplot</em>'.
	 * @see ssda_research.boxplot
	 * @generated
	 */
	EClass getboxplot();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.boxplot#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ssda_research.boxplot#getMin()
	 * @see #getboxplot()
	 * @generated
	 */
	EAttribute getboxplot_Min();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.boxplot#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ssda_research.boxplot#getMax()
	 * @see #getboxplot()
	 * @generated
	 */
	EAttribute getboxplot_Max();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.boxplot#getWhisker_width <em>Whisker width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whisker width</em>'.
	 * @see ssda_research.boxplot#getWhisker_width()
	 * @see #getboxplot()
	 * @generated
	 */
	EAttribute getboxplot_Whisker_width();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.boxplot#getLower_whisker <em>Lower whisker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower whisker</em>'.
	 * @see ssda_research.boxplot#getLower_whisker()
	 * @see #getboxplot()
	 * @generated
	 */
	EAttribute getboxplot_Lower_whisker();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.boxplot#getUpper_whisker <em>Upper whisker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper whisker</em>'.
	 * @see ssda_research.boxplot#getUpper_whisker()
	 * @see #getboxplot()
	 * @generated
	 */
	EAttribute getboxplot_Upper_whisker();

	/**
	 * Returns the meta object for the containment reference list '{@link ssda_research.boxplot#getIqr <em>Iqr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iqr</em>'.
	 * @see ssda_research.boxplot#getIqr()
	 * @see #getboxplot()
	 * @generated
	 */
	EReference getboxplot_Iqr();

	/**
	 * Returns the meta object for the '{@link ssda_research.boxplot#five_summarydata() <em>Five summarydata</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Five summarydata</em>' operation.
	 * @see ssda_research.boxplot#five_summarydata()
	 * @generated
	 */
	EOperation getboxplot__Five_summarydata();

	/**
	 * Returns the meta object for class '{@link ssda_research.DatasetDeclaration <em>Dataset Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Declaration</em>'.
	 * @see ssda_research.DatasetDeclaration
	 * @generated
	 */
	EClass getDatasetDeclaration();

	/**
	 * Returns the meta object for the '{@link ssda_research.DatasetDeclaration#read_csv() <em>Read csv</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read csv</em>' operation.
	 * @see ssda_research.DatasetDeclaration#read_csv()
	 * @generated
	 */
	EOperation getDatasetDeclaration__Read_csv();

	/**
	 * Returns the meta object for the '{@link ssda_research.DatasetDeclaration#head() <em>Head</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Head</em>' operation.
	 * @see ssda_research.DatasetDeclaration#head()
	 * @generated
	 */
	EOperation getDatasetDeclaration__Head();

	/**
	 * Returns the meta object for the '{@link ssda_research.DatasetDeclaration#dtypes() <em>Dtypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dtypes</em>' operation.
	 * @see ssda_research.DatasetDeclaration#dtypes()
	 * @generated
	 */
	EOperation getDatasetDeclaration__Dtypes();

	/**
	 * Returns the meta object for the '{@link ssda_research.DatasetDeclaration#shape() <em>Shape</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shape</em>' operation.
	 * @see ssda_research.DatasetDeclaration#shape()
	 * @generated
	 */
	EOperation getDatasetDeclaration__Shape();

	/**
	 * Returns the meta object for class '{@link ssda_research.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot</em>'.
	 * @see ssda_research.Plot
	 * @generated
	 */
	EClass getPlot();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.Plot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ssda_research.Plot#getTitle()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_Title();

	/**
	 * Returns the meta object for class '{@link ssda_research.FeaturesSelection <em>Features Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Selection</em>'.
	 * @see ssda_research.FeaturesSelection
	 * @generated
	 */
	EClass getFeaturesSelection();

	/**
	 * Returns the meta object for the '{@link ssda_research.FeaturesSelection#fit_transform() <em>Fit transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fit transform</em>' operation.
	 * @see ssda_research.FeaturesSelection#fit_transform()
	 * @generated
	 */
	EOperation getFeaturesSelection__Fit_transform();

	/**
	 * Returns the meta object for the '{@link ssda_research.FeaturesSelection#drop() <em>Drop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Drop</em>' operation.
	 * @see ssda_research.FeaturesSelection#drop()
	 * @generated
	 */
	EOperation getFeaturesSelection__Drop();

	/**
	 * Returns the meta object for class '{@link ssda_research.Pearson_Correlation <em>Pearson Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pearson Correlation</em>'.
	 * @see ssda_research.Pearson_Correlation
	 * @generated
	 */
	EClass getPearson_Correlation();

	/**
	 * Returns the meta object for the '{@link ssda_research.Pearson_Correlation#corr() <em>Corr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Corr</em>' operation.
	 * @see ssda_research.Pearson_Correlation#corr()
	 * @generated
	 */
	EOperation getPearson_Correlation__Corr();

	/**
	 * Returns the meta object for class '{@link ssda_research.LabelEncoding <em>Label Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Encoding</em>'.
	 * @see ssda_research.LabelEncoding
	 * @generated
	 */
	EClass getLabelEncoding();

	/**
	 * Returns the meta object for the '{@link ssda_research.LabelEncoding#BinaryLabels() <em>Binary Labels</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Binary Labels</em>' operation.
	 * @see ssda_research.LabelEncoding#BinaryLabels()
	 * @generated
	 */
	EOperation getLabelEncoding__BinaryLabels();

	/**
	 * Returns the meta object for class '{@link ssda_research.KFold <em>KFold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KFold</em>'.
	 * @see ssda_research.KFold
	 * @generated
	 */
	EClass getKFold();

	/**
	 * Returns the meta object for the attribute '{@link ssda_research.KFold#getN_splits <em>Nsplits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nsplits</em>'.
	 * @see ssda_research.KFold#getN_splits()
	 * @see #getKFold()
	 * @generated
	 */
	EAttribute getKFold_N_splits();

	/**
	 * Returns the meta object for class '{@link ssda_research.Preprocessed_data <em>Preprocessed data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preprocessed data</em>'.
	 * @see ssda_research.Preprocessed_data
	 * @generated
	 */
	EClass getPreprocessed_data();

	/**
	 * Returns the meta object for enum '{@link ssda_research.Hybrid_sampling_method <em>Hybrid sampling method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hybrid sampling method</em>'.
	 * @see ssda_research.Hybrid_sampling_method
	 * @generated
	 */
	EEnum getHybrid_sampling_method();

	/**
	 * Returns the meta object for enum '{@link ssda_research.Oversampling_technique <em>Oversampling technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Oversampling technique</em>'.
	 * @see ssda_research.Oversampling_technique
	 * @generated
	 */
	EEnum getOversampling_technique();

	/**
	 * Returns the meta object for enum '{@link ssda_research.UnderSampling_technique <em>Under Sampling technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Under Sampling technique</em>'.
	 * @see ssda_research.UnderSampling_technique
	 * @generated
	 */
	EEnum getUnderSampling_technique();

	/**
	 * Returns the meta object for enum '{@link ssda_research.Sampling_strategy <em>Sampling strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sampling strategy</em>'.
	 * @see ssda_research.Sampling_strategy
	 * @generated
	 */
	EEnum getSampling_strategy();

	/**
	 * Returns the meta object for enum '{@link ssda_research.Voting_type <em>Voting type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Voting type</em>'.
	 * @see ssda_research.Voting_type
	 * @generated
	 */
	EEnum getVoting_type();

	/**
	 * Returns the meta object for enum '{@link ssda_research.Regularization <em>Regularization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Regularization</em>'.
	 * @see ssda_research.Regularization
	 * @generated
	 */
	EEnum getRegularization();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Trained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Trained</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getTrained();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Tested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tested</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getTested();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Lower Quartile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lower Quartile</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getLowerQuartile();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Upper Quartile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Quartile</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getUpperQuartile();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Median</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getMedian();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ssda_researchFactory getSsda_researchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ssda_research.impl.DiabeticRecommendationSystemImpl <em>Diabetic Recommendation System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.DiabeticRecommendationSystemImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getDiabeticRecommendationSystem()
		 * @generated
		 */
		EClass DIABETIC_RECOMMENDATION_SYSTEM = eINSTANCE.getDiabeticRecommendationSystem();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETIC_RECOMMENDATION_SYSTEM__PATIENT = eINSTANCE.getDiabeticRecommendationSystem_Patient();

		/**
		 * The meta object literal for the '<em><b>Symp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETIC_RECOMMENDATION_SYSTEM__SYMP = eINSTANCE.getDiabeticRecommendationSystem_Symp();

		/**
		 * The meta object literal for the '<em><b>Med</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETIC_RECOMMENDATION_SYSTEM__MED = eINSTANCE.getDiabeticRecommendationSystem_Med();

		/**
		 * The meta object literal for the '<em><b>Doctor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR = eINSTANCE.getDiabeticRecommendationSystem_Doctor();

		/**
		 * The meta object literal for the '<em><b>Pred</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETIC_RECOMMENDATION_SYSTEM__PRED = eINSTANCE.getDiabeticRecommendationSystem_Pred();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETIC_RECOMMENDATION_SYSTEM__DATASET = eINSTANCE.getDiabeticRecommendationSystem_Dataset();

		/**
		 * The meta object literal for the '<em><b>Eda</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETIC_RECOMMENDATION_SYSTEM__EDA = eINSTANCE.getDiabeticRecommendationSystem_Eda();

		/**
		 * The meta object literal for the '<em><b>Dpreprocess</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS = eINSTANCE
				.getDiabeticRecommendationSystem_Dpreprocess();

		/**
		 * The meta object literal for the '<em><b>Model op</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP = eINSTANCE.getDiabeticRecommendationSystem_Model_op();

		/**
		 * The meta object literal for the '<em><b>Estimators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS = eINSTANCE.getDiabeticRecommendationSystem_Estimators();

		/**
		 * The meta object literal for the '<em><b>Cv</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETIC_RECOMMENDATION_SYSTEM__CV = eINSTANCE.getDiabeticRecommendationSystem_Cv();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.PatientImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__NAME = eINSTANCE.getPatient_Name();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__HEIGHT = eINSTANCE.getPatient_Height();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__WEIGHT = eINSTANCE.getPatient_Weight();

		/**
		 * The meta object literal for the '<em><b>Bmi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__BMI = eINSTANCE.getPatient_Bmi();

		/**
		 * The meta object literal for the '<em><b>Activity level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__ACTIVITY_LEVEL = eINSTANCE.getPatient_Activity_level();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__GENDER = eINSTANCE.getPatient_Gender();

		/**
		 * The meta object literal for the '<em><b>Patient type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__PATIENT_TYPE = eINSTANCE.getPatient_Patient_type();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__AGE = eINSTANCE.getPatient_Age();

		/**
		 * The meta object literal for the '<em><b>Other diseases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__OTHER_DISEASES = eINSTANCE.getPatient_Other_diseases();

		/**
		 * The meta object literal for the '<em><b>Symp</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__SYMP = eINSTANCE.getPatient_Symp();

		/**
		 * The meta object literal for the '<em><b>Med</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__MED = eINSTANCE.getPatient_Med();

		/**
		 * The meta object literal for the '<em><b>Doctor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__DOCTOR = eINSTANCE.getPatient_Doctor();

		/**
		 * The meta object literal for the '<em><b>View pred</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__VIEW_PRED = eINSTANCE.getPatient_View_pred();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.SymptomsImpl <em>Symptoms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.SymptomsImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getSymptoms()
		 * @generated
		 */
		EClass SYMPTOMS = eINSTANCE.getSymptoms();

		/**
		 * The meta object literal for the '<em><b>Symptom name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMPTOMS__SYMPTOM_NAME = eINSTANCE.getSymptoms_Symptom_name();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.MedicinesImpl <em>Medicines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.MedicinesImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getMedicines()
		 * @generated
		 */
		EClass MEDICINES = eINSTANCE.getMedicines();

		/**
		 * The meta object literal for the '<em><b>Medicine name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINES__MEDICINE_NAME = eINSTANCE.getMedicines_Medicine_name();

		/**
		 * The meta object literal for the '<em><b>Medicine dossage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINES__MEDICINE_DOSSAGE = eINSTANCE.getMedicines_Medicine_dossage();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.DoctorImpl <em>Doctor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.DoctorImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getDoctor()
		 * @generated
		 */
		EClass DOCTOR = eINSTANCE.getDoctor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__NAME = eINSTANCE.getDoctor_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__ADDRESS = eINSTANCE.getDoctor_Address();

		/**
		 * The meta object literal for the '<em><b>Clinic timings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__CLINIC_TIMINGS = eINSTANCE.getDoctor_Clinic_timings();

		/**
		 * The meta object literal for the '<em><b>Phone no</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__PHONE_NO = eINSTANCE.getDoctor_Phone_no();

		/**
		 * The meta object literal for the '<em><b>Specalization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__SPECALIZATION = eINSTANCE.getDoctor_Specalization();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__PATIENT = eINSTANCE.getDoctor_Patient();

		/**
		 * The meta object literal for the '<em><b>Recommend med</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__RECOMMEND_MED = eINSTANCE.getDoctor_Recommend_med();

		/**
		 * The meta object literal for the '<em><b>View pred</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__VIEW_PRED = eINSTANCE.getDoctor_View_pred();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.DiabetesPredictionImpl <em>Diabetes Prediction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.DiabetesPredictionImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getDiabetesPrediction()
		 * @generated
		 */
		EClass DIABETES_PREDICTION = eINSTANCE.getDiabetesPrediction();

		/**
		 * The meta object literal for the '<em><b>Evaluated</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIABETES_PREDICTION__EVALUATED = eINSTANCE.getDiabetesPrediction_Evaluated();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.Performance_EvaluationImpl <em>Performance Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.Performance_EvaluationImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getPerformance_Evaluation()
		 * @generated
		 */
		EClass PERFORMANCE_EVALUATION = eINSTANCE.getPerformance_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Precision score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_EVALUATION___PRECISION_SCORE = eINSTANCE.getPerformance_Evaluation__Precision_score();

		/**
		 * The meta object literal for the '<em><b>Accuracy score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_EVALUATION___ACCURACY_SCORE = eINSTANCE.getPerformance_Evaluation__Accuracy_score();

		/**
		 * The meta object literal for the '<em><b>Recall score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_EVALUATION___RECALL_SCORE = eINSTANCE.getPerformance_Evaluation__Recall_score();

		/**
		 * The meta object literal for the '<em><b>Confusion matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_EVALUATION___CONFUSION_MATRIX = eINSTANCE.getPerformance_Evaluation__Confusion_matrix();

		/**
		 * The meta object literal for the '<em><b>Classification report</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_EVALUATION___CLASSIFICATION_REPORT = eINSTANCE
				.getPerformance_Evaluation__Classification_report();

		/**
		 * The meta object literal for the '<em><b>Auc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_EVALUATION___AUC = eINSTANCE.getPerformance_Evaluation__Auc();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.DatasetImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__TYPE = eINSTANCE.getDataset_Type();

		/**
		 * The meta object literal for the '<em><b>Accessible to</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__ACCESSIBLE_TO = eINSTANCE.getDataset_Accessible_to();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.Splitted_datasetImpl <em>Splitted dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.Splitted_datasetImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getSplitted_dataset()
		 * @generated
		 */
		EClass SPLITTED_DATASET = eINSTANCE.getSplitted_dataset();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.Train_dataImpl <em>Train data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.Train_dataImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getTrain_data()
		 * @generated
		 */
		EClass TRAIN_DATA = eINSTANCE.getTrain_data();

		/**
		 * The meta object literal for the '<em><b>Xtrain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_DATA__XTRAIN = eINSTANCE.getTrain_data_X_train();

		/**
		 * The meta object literal for the '<em><b>Ytrain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_DATA__YTRAIN = eINSTANCE.getTrain_data_Y_train();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.Test_dataImpl <em>Test data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.Test_dataImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getTest_data()
		 * @generated
		 */
		EClass TEST_DATA = eINSTANCE.getTest_data();

		/**
		 * The meta object literal for the '<em><b>Xtest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_DATA__XTEST = eINSTANCE.getTest_data_X_test();

		/**
		 * The meta object literal for the '<em><b>Ytest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_DATA__YTEST = eINSTANCE.getTest_data_Y_test();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.ModelOptimizationImpl <em>Model Optimization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.ModelOptimizationImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getModelOptimization()
		 * @generated
		 */
		EClass MODEL_OPTIMIZATION = eINSTANCE.getModelOptimization();

		/**
		 * The meta object literal for the '<em><b>Param grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_OPTIMIZATION__PARAM_GRID = eINSTANCE.getModelOptimization_Param_grid();

		/**
		 * The meta object literal for the '<em><b>Estimator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_OPTIMIZATION__ESTIMATOR = eINSTANCE.getModelOptimization_Estimator();

		/**
		 * The meta object literal for the '<em><b>Splits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_OPTIMIZATION__SPLITS = eINSTANCE.getModelOptimization_Splits();

		/**
		 * The meta object literal for the '<em><b>Generate pred</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_OPTIMIZATION__GENERATE_PRED = eINSTANCE.getModelOptimization_Generate_pred();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_OPTIMIZATION__DATASET = eINSTANCE.getModelOptimization_Dataset();

		/**
		 * The meta object literal for the '<em><b>Fit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_OPTIMIZATION___FIT = eINSTANCE.getModelOptimization__Fit();

		/**
		 * The meta object literal for the '<em><b>Predict</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_OPTIMIZATION___PREDICT = eINSTANCE.getModelOptimization__Predict();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.RandomizedSearchCVImpl <em>Randomized Search CV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.RandomizedSearchCVImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getRandomizedSearchCV()
		 * @generated
		 */
		EClass RANDOMIZED_SEARCH_CV = eINSTANCE.getRandomizedSearchCV();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.GridSearchCVImpl <em>Grid Search CV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.GridSearchCVImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getGridSearchCV()
		 * @generated
		 */
		EClass GRID_SEARCH_CV = eINSTANCE.getGridSearchCV();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.classifiersImpl <em>classifiers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.classifiersImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getclassifiers()
		 * @generated
		 */
		EClass CLASSIFIERS = eINSTANCE.getclassifiers();

		/**
		 * The meta object literal for the '<em><b>Pred</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIERS__PRED = eINSTANCE.getclassifiers_Pred();

		/**
		 * The meta object literal for the '<em><b>Splits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIERS__SPLITS = eINSTANCE.getclassifiers_Splits();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIERS__DATASET = eINSTANCE.getclassifiers_Dataset();

		/**
		 * The meta object literal for the '<em><b>Cv</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIERS__CV = eINSTANCE.getclassifiers_Cv();

		/**
		 * The meta object literal for the '<em><b>Random state</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIERS__RANDOM_STATE = eINSTANCE.getclassifiers_Random_state();

		/**
		 * The meta object literal for the '<em><b>Fit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIERS___FIT = eINSTANCE.getclassifiers__Fit();

		/**
		 * The meta object literal for the '<em><b>Predict</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIERS___PREDICT = eINSTANCE.getclassifiers__Predict();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.RandomForestClassifierImpl <em>Random Forest Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.RandomForestClassifierImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getRandomForestClassifier()
		 * @generated
		 */
		EClass RANDOM_FOREST_CLASSIFIER = eINSTANCE.getRandomForestClassifier();

		/**
		 * The meta object literal for the '<em><b>Max depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_FOREST_CLASSIFIER__MAX_DEPTH = eINSTANCE.getRandomForestClassifier_Max_depth();

		/**
		 * The meta object literal for the '<em><b>Max features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_FOREST_CLASSIFIER__MAX_FEATURES = eINSTANCE.getRandomForestClassifier_Max_features();

		/**
		 * The meta object literal for the '<em><b>Min samples split</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT = eINSTANCE
				.getRandomForestClassifier_Min_samples_split();

		/**
		 * The meta object literal for the '<em><b>Min samples leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF = eINSTANCE.getRandomForestClassifier_Min_samples_leaf();

		/**
		 * The meta object literal for the '<em><b>Nestimators</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_FOREST_CLASSIFIER__NESTIMATORS = eINSTANCE.getRandomForestClassifier_N_estimators();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_FOREST_CLASSIFIER__CRITERION = eINSTANCE.getRandomForestClassifier_Criterion();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.DecisionTreeClassifierImpl <em>Decision Tree Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.DecisionTreeClassifierImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getDecisionTreeClassifier()
		 * @generated
		 */
		EClass DECISION_TREE_CLASSIFIER = eINSTANCE.getDecisionTreeClassifier();

		/**
		 * The meta object literal for the '<em><b>Creterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TREE_CLASSIFIER__CRETERION = eINSTANCE.getDecisionTreeClassifier_Creterion();

		/**
		 * The meta object literal for the '<em><b>Max depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TREE_CLASSIFIER__MAX_DEPTH = eINSTANCE.getDecisionTreeClassifier_Max_depth();

		/**
		 * The meta object literal for the '<em><b>Splitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TREE_CLASSIFIER__SPLITTER = eINSTANCE.getDecisionTreeClassifier_Splitter();

		/**
		 * The meta object literal for the '<em><b>Min samples split</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT = eINSTANCE
				.getDecisionTreeClassifier_Min_samples_split();

		/**
		 * The meta object literal for the '<em><b>Min samples leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF = eINSTANCE.getDecisionTreeClassifier_Min_samples_leaf();

		/**
		 * The meta object literal for the '<em><b>Min weight fraction leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF = eINSTANCE
				.getDecisionTreeClassifier_Min_weight_fraction_leaf();

		/**
		 * The meta object literal for the '<em><b>Max features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TREE_CLASSIFIER__MAX_FEATURES = eINSTANCE.getDecisionTreeClassifier_Max_features();

		/**
		 * The meta object literal for the '<em><b>Class weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TREE_CLASSIFIER__CLASS_WEIGHT = eINSTANCE.getDecisionTreeClassifier_Class_weight();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.MLPClassifierImpl <em>MLP Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.MLPClassifierImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getMLPClassifier()
		 * @generated
		 */
		EClass MLP_CLASSIFIER = eINSTANCE.getMLPClassifier();

		/**
		 * The meta object literal for the '<em><b>Hidden layer status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MLP_CLASSIFIER__HIDDEN_LAYER_STATUS = eINSTANCE.getMLPClassifier_Hidden_layer_status();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MLP_CLASSIFIER__ACTIVATION = eINSTANCE.getMLPClassifier_Activation();

		/**
		 * The meta object literal for the '<em><b>Solver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MLP_CLASSIFIER__SOLVER = eINSTANCE.getMLPClassifier_Solver();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.GradientBoostingClassifierImpl <em>Gradient Boosting Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.GradientBoostingClassifierImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getGradientBoostingClassifier()
		 * @generated
		 */
		EClass GRADIENT_BOOSTING_CLASSIFIER = eINSTANCE.getGradientBoostingClassifier();

		/**
		 * The meta object literal for the '<em><b>Nestimators</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_BOOSTING_CLASSIFIER__NESTIMATORS = eINSTANCE.getGradientBoostingClassifier_N_estimators();

		/**
		 * The meta object literal for the '<em><b>Learning rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_BOOSTING_CLASSIFIER__LEARNING_RATE = eINSTANCE
				.getGradientBoostingClassifier_Learning_rate();

		/**
		 * The meta object literal for the '<em><b>Max depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_BOOSTING_CLASSIFIER__MAX_DEPTH = eINSTANCE.getGradientBoostingClassifier_Max_depth();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.GaussianNBImpl <em>Gaussian NB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.GaussianNBImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getGaussianNB()
		 * @generated
		 */
		EClass GAUSSIAN_NB = eINSTANCE.getGaussianNB();

		/**
		 * The meta object literal for the '<em><b>Var smoothing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN_NB__VAR_SMOOTHING = eINSTANCE.getGaussianNB_Var_smoothing();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.SVCImpl <em>SVC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.SVCImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getSVC()
		 * @generated
		 */
		EClass SVC = eINSTANCE.getSVC();

		/**
		 * The meta object literal for the '<em><b>Kernel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVC__KERNEL = eINSTANCE.getSVC_Kernel();

		/**
		 * The meta object literal for the '<em><b>Gamma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVC__GAMMA = eINSTANCE.getSVC_Gamma();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVC__C = eINSTANCE.getSVC_C();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.LogisticRegressionImpl <em>Logistic Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.LogisticRegressionImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getLogisticRegression()
		 * @generated
		 */
		EClass LOGISTIC_REGRESSION = eINSTANCE.getLogisticRegression();

		/**
		 * The meta object literal for the '<em><b>Solvers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGISTIC_REGRESSION__SOLVERS = eINSTANCE.getLogisticRegression_Solvers();

		/**
		 * The meta object literal for the '<em><b>Penalty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGISTIC_REGRESSION__PENALTY = eINSTANCE.getLogisticRegression_Penalty();

		/**
		 * The meta object literal for the '<em><b>Cvalues</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGISTIC_REGRESSION__CVALUES = eINSTANCE.getLogisticRegression_C_values();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.KNeighborsClassifierImpl <em>KNeighbors Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.KNeighborsClassifierImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getKNeighborsClassifier()
		 * @generated
		 */
		EClass KNEIGHBORS_CLASSIFIER = eINSTANCE.getKNeighborsClassifier();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNEIGHBORS_CLASSIFIER__METRIC = eINSTANCE.getKNeighborsClassifier_Metric();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNEIGHBORS_CLASSIFIER__P = eINSTANCE.getKNeighborsClassifier_P();

		/**
		 * The meta object literal for the '<em><b>Nneighbors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNEIGHBORS_CLASSIFIER__NNEIGHBORS = eINSTANCE.getKNeighborsClassifier_N_neighbors();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.VotingClassifierImpl <em>Voting Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.VotingClassifierImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getVotingClassifier()
		 * @generated
		 */
		EClass VOTING_CLASSIFIER = eINSTANCE.getVotingClassifier();

		/**
		 * The meta object literal for the '<em><b>Estimators</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTING_CLASSIFIER__ESTIMATORS = eINSTANCE.getVotingClassifier_Estimators();

		/**
		 * The meta object literal for the '<em><b>Weights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTING_CLASSIFIER__WEIGHTS = eINSTANCE.getVotingClassifier_Weights();

		/**
		 * The meta object literal for the '<em><b>Voting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTING_CLASSIFIER__VOTING = eINSTANCE.getVotingClassifier_Voting();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.Data_PreprocessingImpl <em>Data Preprocessing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.Data_PreprocessingImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getData_Preprocessing()
		 * @generated
		 */
		EClass DATA_PREPROCESSING = eINSTANCE.getData_Preprocessing();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREPROCESSING__DATASET = eINSTANCE.getData_Preprocessing_Dataset();

		/**
		 * The meta object literal for the '<em><b>Pdata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREPROCESSING__PDATA = eINSTANCE.getData_Preprocessing_P_data();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.MissingValuesImpl <em>Missing Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.MissingValuesImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getMissingValues()
		 * @generated
		 */
		EClass MISSING_VALUES = eINSTANCE.getMissingValues();

		/**
		 * The meta object literal for the '<em><b>Isnull</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MISSING_VALUES___ISNULL = eINSTANCE.getMissingValues__Isnull();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.OutlierDetectionImpl <em>Outlier Detection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.OutlierDetectionImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getOutlierDetection()
		 * @generated
		 */
		EClass OUTLIER_DETECTION = eINSTANCE.getOutlierDetection();

		/**
		 * The meta object literal for the '<em><b>Plot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTLIER_DETECTION__PLOT = eINSTANCE.getOutlierDetection_Plot();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.Numeric_OutlierImpl <em>Numeric Outlier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.Numeric_OutlierImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getNumeric_Outlier()
		 * @generated
		 */
		EClass NUMERIC_OUTLIER = eINSTANCE.getNumeric_Outlier();

		/**
		 * The meta object literal for the '<em><b>IOR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NUMERIC_OUTLIER___IOR = eINSTANCE.getNumeric_Outlier__IOR();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.FeatureScalingImpl <em>Feature Scaling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.FeatureScalingImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getFeatureScaling()
		 * @generated
		 */
		EClass FEATURE_SCALING = eINSTANCE.getFeatureScaling();

		/**
		 * The meta object literal for the '<em><b>Fit transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_SCALING___FIT_TRANSFORM = eINSTANCE.getFeatureScaling__Fit_transform();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_SCALING___TRANSFORM = eINSTANCE.getFeatureScaling__Transform();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.StandardScalerImpl <em>Standard Scaler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.StandardScalerImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getStandardScaler()
		 * @generated
		 */
		EClass STANDARD_SCALER = eINSTANCE.getStandardScaler();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.EncodingImpl <em>Encoding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.EncodingImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getEncoding()
		 * @generated
		 */
		EClass ENCODING = eINSTANCE.getEncoding();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENCODING___MAP = eINSTANCE.getEncoding__Map();

		/**
		 * The meta object literal for the '<em><b>Fit transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENCODING___FIT_TRANSFORM = eINSTANCE.getEncoding__Fit_transform();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.SamplingImpl <em>Sampling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.SamplingImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getSampling()
		 * @generated
		 */
		EClass SAMPLING = eINSTANCE.getSampling();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLING__STRATEGY = eINSTANCE.getSampling_Strategy();

		/**
		 * The meta object literal for the '<em><b>Random state</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLING__RANDOM_STATE = eINSTANCE.getSampling_Random_state();

		/**
		 * The meta object literal for the '<em><b>Fit resample</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SAMPLING___FIT_RESAMPLE = eINSTANCE.getSampling__Fit_resample();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.UndersamplingImpl <em>Undersampling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.UndersamplingImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getUndersampling()
		 * @generated
		 */
		EClass UNDERSAMPLING = eINSTANCE.getUndersampling();

		/**
		 * The meta object literal for the '<em><b>Undersampling technque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDERSAMPLING__UNDERSAMPLING_TECHNQUE = eINSTANCE.getUndersampling_Undersampling_technque();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.Hybrid_MethodImpl <em>Hybrid Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.Hybrid_MethodImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getHybrid_Method()
		 * @generated
		 */
		EClass HYBRID_METHOD = eINSTANCE.getHybrid_Method();

		/**
		 * The meta object literal for the '<em><b>Hybrid sampling method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYBRID_METHOD__HYBRID_SAMPLING_METHOD = eINSTANCE.getHybrid_Method_Hybrid_sampling_method();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.OverSamplingImpl <em>Over Sampling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.OverSamplingImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getOverSampling()
		 * @generated
		 */
		EClass OVER_SAMPLING = eINSTANCE.getOverSampling();

		/**
		 * The meta object literal for the '<em><b>Sampling technique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVER_SAMPLING__SAMPLING_TECHNIQUE = eINSTANCE.getOverSampling_Sampling_technique();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.ValidationImpl <em>Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.ValidationImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getValidation()
		 * @generated
		 */
		EClass VALIDATION = eINSTANCE.getValidation();

		/**
		 * The meta object literal for the '<em><b>Cv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION__CV = eINSTANCE.getValidation_Cv();

		/**
		 * The meta object literal for the '<em><b>Cross val score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATION___CROSS_VAL_SCORE = eINSTANCE.getValidation__Cross_val_score();

		/**
		 * The meta object literal for the '<em><b>Cross val predict</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATION___CROSS_VAL_PREDICT = eINSTANCE.getValidation__Cross_val_predict();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.CrossValidationImpl <em>Cross Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.CrossValidationImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getCrossValidation()
		 * @generated
		 */
		EClass CROSS_VALIDATION = eINSTANCE.getCrossValidation();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_VALIDATION__DATASET = eINSTANCE.getCrossValidation_Dataset();

		/**
		 * The meta object literal for the '<em><b>Splits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_VALIDATION__SPLITS = eINSTANCE.getCrossValidation_Splits();

		/**
		 * The meta object literal for the '<em><b>Access pdata</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_VALIDATION__ACCESS_PDATA = eINSTANCE.getCrossValidation_Access_p_data();

		/**
		 * The meta object literal for the '<em><b>Classifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_VALIDATION__CLASSIFIERS = eINSTANCE.getCrossValidation_Classifiers();

		/**
		 * The meta object literal for the '<em><b>Shuffle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_VALIDATION__SHUFFLE = eINSTANCE.getCrossValidation_Shuffle();

		/**
		 * The meta object literal for the '<em><b>Random state</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_VALIDATION__RANDOM_STATE = eINSTANCE.getCrossValidation_Random_state();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.TrainTestSplitImpl <em>Train Test Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.TrainTestSplitImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getTrainTestSplit()
		 * @generated
		 */
		EClass TRAIN_TEST_SPLIT = eINSTANCE.getTrainTestSplit();

		/**
		 * The meta object literal for the '<em><b>Test size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_TEST_SPLIT__TEST_SIZE = eINSTANCE.getTrainTestSplit_Test_size();

		/**
		 * The meta object literal for the '<em><b>Train size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_TEST_SPLIT__TRAIN_SIZE = eINSTANCE.getTrainTestSplit_Train_size();

		/**
		 * The meta object literal for the '<em><b>Train test split</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN_TEST_SPLIT___TRAIN_TEST_SPLIT = eINSTANCE.getTrainTestSplit__Train_test_split();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.IQRImpl <em>IQR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.IQRImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getIQR()
		 * @generated
		 */
		EClass IQR = eINSTANCE.getIQR();

		/**
		 * The meta object literal for the '<em><b>Q1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IQR__Q1 = eINSTANCE.getIQR_Q1();

		/**
		 * The meta object literal for the '<em><b>Q2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IQR__Q2 = eINSTANCE.getIQR_Q2();

		/**
		 * The meta object literal for the '<em><b>Q3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IQR__Q3 = eINSTANCE.getIQR_Q3();

		/**
		 * The meta object literal for the '<em><b>Quantile</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IQR___QUANTILE = eINSTANCE.getIQR__Quantile();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.scatterImpl <em>scatter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.scatterImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getscatter()
		 * @generated
		 */
		EClass SCATTER = eINSTANCE.getscatter();

		/**
		 * The meta object literal for the '<em><b>Regression line</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCATTER___REGRESSION_LINE = eINSTANCE.getscatter__Regression_line();

		/**
		 * The meta object literal for the '<em><b>Xaxis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCATTER___XAXIS = eINSTANCE.getscatter__X_axis();

		/**
		 * The meta object literal for the '<em><b>Yaxis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCATTER___YAXIS = eINSTANCE.getscatter__Y_axis();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.ExploratoryDataAnalysisImpl <em>Exploratory Data Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.ExploratoryDataAnalysisImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getExploratoryDataAnalysis()
		 * @generated
		 */
		EClass EXPLORATORY_DATA_ANALYSIS = eINSTANCE.getExploratoryDataAnalysis();

		/**
		 * The meta object literal for the '<em><b>Datasets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__DATASETS = eINSTANCE.getExploratoryDataAnalysis_Datasets();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.boxplotImpl <em>boxplot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.boxplotImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getboxplot()
		 * @generated
		 */
		EClass BOXPLOT = eINSTANCE.getboxplot();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOXPLOT__MIN = eINSTANCE.getboxplot_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOXPLOT__MAX = eINSTANCE.getboxplot_Max();

		/**
		 * The meta object literal for the '<em><b>Whisker width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOXPLOT__WHISKER_WIDTH = eINSTANCE.getboxplot_Whisker_width();

		/**
		 * The meta object literal for the '<em><b>Lower whisker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOXPLOT__LOWER_WHISKER = eINSTANCE.getboxplot_Lower_whisker();

		/**
		 * The meta object literal for the '<em><b>Upper whisker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOXPLOT__UPPER_WHISKER = eINSTANCE.getboxplot_Upper_whisker();

		/**
		 * The meta object literal for the '<em><b>Iqr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOXPLOT__IQR = eINSTANCE.getboxplot_Iqr();

		/**
		 * The meta object literal for the '<em><b>Five summarydata</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOXPLOT___FIVE_SUMMARYDATA = eINSTANCE.getboxplot__Five_summarydata();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.DatasetDeclarationImpl <em>Dataset Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.DatasetDeclarationImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getDatasetDeclaration()
		 * @generated
		 */
		EClass DATASET_DECLARATION = eINSTANCE.getDatasetDeclaration();

		/**
		 * The meta object literal for the '<em><b>Read csv</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATASET_DECLARATION___READ_CSV = eINSTANCE.getDatasetDeclaration__Read_csv();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATASET_DECLARATION___HEAD = eINSTANCE.getDatasetDeclaration__Head();

		/**
		 * The meta object literal for the '<em><b>Dtypes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATASET_DECLARATION___DTYPES = eINSTANCE.getDatasetDeclaration__Dtypes();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATASET_DECLARATION___SHAPE = eINSTANCE.getDatasetDeclaration__Shape();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.PlotImpl <em>Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.PlotImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getPlot()
		 * @generated
		 */
		EClass PLOT = eINSTANCE.getPlot();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT__TITLE = eINSTANCE.getPlot_Title();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.FeaturesSelectionImpl <em>Features Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.FeaturesSelectionImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getFeaturesSelection()
		 * @generated
		 */
		EClass FEATURES_SELECTION = eINSTANCE.getFeaturesSelection();

		/**
		 * The meta object literal for the '<em><b>Fit transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURES_SELECTION___FIT_TRANSFORM = eINSTANCE.getFeaturesSelection__Fit_transform();

		/**
		 * The meta object literal for the '<em><b>Drop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURES_SELECTION___DROP = eINSTANCE.getFeaturesSelection__Drop();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.Pearson_CorrelationImpl <em>Pearson Correlation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.Pearson_CorrelationImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getPearson_Correlation()
		 * @generated
		 */
		EClass PEARSON_CORRELATION = eINSTANCE.getPearson_Correlation();

		/**
		 * The meta object literal for the '<em><b>Corr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PEARSON_CORRELATION___CORR = eINSTANCE.getPearson_Correlation__Corr();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.LabelEncodingImpl <em>Label Encoding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.LabelEncodingImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getLabelEncoding()
		 * @generated
		 */
		EClass LABEL_ENCODING = eINSTANCE.getLabelEncoding();

		/**
		 * The meta object literal for the '<em><b>Binary Labels</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_ENCODING___BINARY_LABELS = eINSTANCE.getLabelEncoding__BinaryLabels();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.KFoldImpl <em>KFold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.KFoldImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getKFold()
		 * @generated
		 */
		EClass KFOLD = eINSTANCE.getKFold();

		/**
		 * The meta object literal for the '<em><b>Nsplits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KFOLD__NSPLITS = eINSTANCE.getKFold_N_splits();

		/**
		 * The meta object literal for the '{@link ssda_research.impl.Preprocessed_dataImpl <em>Preprocessed data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.impl.Preprocessed_dataImpl
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getPreprocessed_data()
		 * @generated
		 */
		EClass PREPROCESSED_DATA = eINSTANCE.getPreprocessed_data();

		/**
		 * The meta object literal for the '{@link ssda_research.Hybrid_sampling_method <em>Hybrid sampling method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.Hybrid_sampling_method
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getHybrid_sampling_method()
		 * @generated
		 */
		EEnum HYBRID_SAMPLING_METHOD = eINSTANCE.getHybrid_sampling_method();

		/**
		 * The meta object literal for the '{@link ssda_research.Oversampling_technique <em>Oversampling technique</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.Oversampling_technique
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getOversampling_technique()
		 * @generated
		 */
		EEnum OVERSAMPLING_TECHNIQUE = eINSTANCE.getOversampling_technique();

		/**
		 * The meta object literal for the '{@link ssda_research.UnderSampling_technique <em>Under Sampling technique</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.UnderSampling_technique
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getUnderSampling_technique()
		 * @generated
		 */
		EEnum UNDER_SAMPLING_TECHNIQUE = eINSTANCE.getUnderSampling_technique();

		/**
		 * The meta object literal for the '{@link ssda_research.Sampling_strategy <em>Sampling strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.Sampling_strategy
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getSampling_strategy()
		 * @generated
		 */
		EEnum SAMPLING_STRATEGY = eINSTANCE.getSampling_strategy();

		/**
		 * The meta object literal for the '{@link ssda_research.Voting_type <em>Voting type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.Voting_type
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getVoting_type()
		 * @generated
		 */
		EEnum VOTING_TYPE = eINSTANCE.getVoting_type();

		/**
		 * The meta object literal for the '{@link ssda_research.Regularization <em>Regularization</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssda_research.Regularization
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getRegularization()
		 * @generated
		 */
		EEnum REGULARIZATION = eINSTANCE.getRegularization();

		/**
		 * The meta object literal for the '<em>Trained</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getTrained()
		 * @generated
		 */
		EDataType TRAINED = eINSTANCE.getTrained();

		/**
		 * The meta object literal for the '<em>Tested</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getTested()
		 * @generated
		 */
		EDataType TESTED = eINSTANCE.getTested();

		/**
		 * The meta object literal for the '<em>Lower Quartile</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getLowerQuartile()
		 * @generated
		 */
		EDataType LOWER_QUARTILE = eINSTANCE.getLowerQuartile();

		/**
		 * The meta object literal for the '<em>Upper Quartile</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getUpperQuartile()
		 * @generated
		 */
		EDataType UPPER_QUARTILE = eINSTANCE.getUpperQuartile();

		/**
		 * The meta object literal for the '<em>Median</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ssda_research.impl.Ssda_researchPackageImpl#getMedian()
		 * @generated
		 */
		EDataType MEDIAN = eINSTANCE.getMedian();

	}

} //Ssda_researchPackage
