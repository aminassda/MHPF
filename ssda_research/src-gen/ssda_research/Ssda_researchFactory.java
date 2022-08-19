/**
 */
package ssda_research;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ssda_research.Ssda_researchPackage
 * @generated
 */
public interface Ssda_researchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ssda_researchFactory eINSTANCE = ssda_research.impl.Ssda_researchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diabetic Recommendation System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diabetic Recommendation System</em>'.
	 * @generated
	 */
	DiabeticRecommendationSystem createDiabeticRecommendationSystem();

	/**
	 * Returns a new object of class '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient</em>'.
	 * @generated
	 */
	Patient createPatient();

	/**
	 * Returns a new object of class '<em>Symptoms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symptoms</em>'.
	 * @generated
	 */
	Symptoms createSymptoms();

	/**
	 * Returns a new object of class '<em>Medicines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicines</em>'.
	 * @generated
	 */
	Medicines createMedicines();

	/**
	 * Returns a new object of class '<em>Doctor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doctor</em>'.
	 * @generated
	 */
	Doctor createDoctor();

	/**
	 * Returns a new object of class '<em>Diabetes Prediction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diabetes Prediction</em>'.
	 * @generated
	 */
	DiabetesPrediction createDiabetesPrediction();

	/**
	 * Returns a new object of class '<em>Performance Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Evaluation</em>'.
	 * @generated
	 */
	Performance_Evaluation createPerformance_Evaluation();

	/**
	 * Returns a new object of class '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset</em>'.
	 * @generated
	 */
	Dataset createDataset();

	/**
	 * Returns a new object of class '<em>Train data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train data</em>'.
	 * @generated
	 */
	Train_data createTrain_data();

	/**
	 * Returns a new object of class '<em>Test data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test data</em>'.
	 * @generated
	 */
	Test_data createTest_data();

	/**
	 * Returns a new object of class '<em>Randomized Search CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Randomized Search CV</em>'.
	 * @generated
	 */
	RandomizedSearchCV createRandomizedSearchCV();

	/**
	 * Returns a new object of class '<em>Grid Search CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Search CV</em>'.
	 * @generated
	 */
	GridSearchCV createGridSearchCV();

	/**
	 * Returns a new object of class '<em>Random Forest Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Forest Classifier</em>'.
	 * @generated
	 */
	RandomForestClassifier createRandomForestClassifier();

	/**
	 * Returns a new object of class '<em>Decision Tree Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Tree Classifier</em>'.
	 * @generated
	 */
	DecisionTreeClassifier createDecisionTreeClassifier();

	/**
	 * Returns a new object of class '<em>MLP Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MLP Classifier</em>'.
	 * @generated
	 */
	MLPClassifier createMLPClassifier();

	/**
	 * Returns a new object of class '<em>Gradient Boosting Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gradient Boosting Classifier</em>'.
	 * @generated
	 */
	GradientBoostingClassifier createGradientBoostingClassifier();

	/**
	 * Returns a new object of class '<em>Gaussian NB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gaussian NB</em>'.
	 * @generated
	 */
	GaussianNB createGaussianNB();

	/**
	 * Returns a new object of class '<em>SVC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SVC</em>'.
	 * @generated
	 */
	SVC createSVC();

	/**
	 * Returns a new object of class '<em>Logistic Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logistic Regression</em>'.
	 * @generated
	 */
	LogisticRegression createLogisticRegression();

	/**
	 * Returns a new object of class '<em>KNeighbors Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KNeighbors Classifier</em>'.
	 * @generated
	 */
	KNeighborsClassifier createKNeighborsClassifier();

	/**
	 * Returns a new object of class '<em>Voting Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voting Classifier</em>'.
	 * @generated
	 */
	VotingClassifier createVotingClassifier();

	/**
	 * Returns a new object of class '<em>Missing Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Missing Values</em>'.
	 * @generated
	 */
	MissingValues createMissingValues();

	/**
	 * Returns a new object of class '<em>Numeric Outlier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Outlier</em>'.
	 * @generated
	 */
	Numeric_Outlier createNumeric_Outlier();

	/**
	 * Returns a new object of class '<em>Standard Scaler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Scaler</em>'.
	 * @generated
	 */
	StandardScaler createStandardScaler();

	/**
	 * Returns a new object of class '<em>Undersampling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undersampling</em>'.
	 * @generated
	 */
	Undersampling createUndersampling();

	/**
	 * Returns a new object of class '<em>Hybrid Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hybrid Method</em>'.
	 * @generated
	 */
	Hybrid_Method createHybrid_Method();

	/**
	 * Returns a new object of class '<em>Over Sampling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Over Sampling</em>'.
	 * @generated
	 */
	OverSampling createOverSampling();

	/**
	 * Returns a new object of class '<em>Train Test Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Test Split</em>'.
	 * @generated
	 */
	TrainTestSplit createTrainTestSplit();

	/**
	 * Returns a new object of class '<em>IQR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IQR</em>'.
	 * @generated
	 */
	IQR createIQR();

	/**
	 * Returns a new object of class '<em>scatter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>scatter</em>'.
	 * @generated
	 */
	scatter createscatter();

	/**
	 * Returns a new object of class '<em>boxplot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>boxplot</em>'.
	 * @generated
	 */
	boxplot createboxplot();

	/**
	 * Returns a new object of class '<em>Dataset Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Declaration</em>'.
	 * @generated
	 */
	DatasetDeclaration createDatasetDeclaration();

	/**
	 * Returns a new object of class '<em>Pearson Correlation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pearson Correlation</em>'.
	 * @generated
	 */
	Pearson_Correlation createPearson_Correlation();

	/**
	 * Returns a new object of class '<em>Label Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Encoding</em>'.
	 * @generated
	 */
	LabelEncoding createLabelEncoding();

	/**
	 * Returns a new object of class '<em>KFold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KFold</em>'.
	 * @generated
	 */
	KFold createKFold();

	/**
	 * Returns a new object of class '<em>Preprocessed data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preprocessed data</em>'.
	 * @generated
	 */
	Preprocessed_data createPreprocessed_data();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ssda_researchPackage getSsda_researchPackage();

} //Ssda_researchFactory
