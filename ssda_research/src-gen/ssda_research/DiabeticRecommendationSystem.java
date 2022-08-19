/**
 */
package ssda_research;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diabetic Recommendation System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.DiabeticRecommendationSystem#getPatient <em>Patient</em>}</li>
 *   <li>{@link ssda_research.DiabeticRecommendationSystem#getSymp <em>Symp</em>}</li>
 *   <li>{@link ssda_research.DiabeticRecommendationSystem#getMed <em>Med</em>}</li>
 *   <li>{@link ssda_research.DiabeticRecommendationSystem#getDoctor <em>Doctor</em>}</li>
 *   <li>{@link ssda_research.DiabeticRecommendationSystem#getPred <em>Pred</em>}</li>
 *   <li>{@link ssda_research.DiabeticRecommendationSystem#getDataset <em>Dataset</em>}</li>
 *   <li>{@link ssda_research.DiabeticRecommendationSystem#getEda <em>Eda</em>}</li>
 *   <li>{@link ssda_research.DiabeticRecommendationSystem#getDpreprocess <em>Dpreprocess</em>}</li>
 *   <li>{@link ssda_research.DiabeticRecommendationSystem#getModel_op <em>Model op</em>}</li>
 *   <li>{@link ssda_research.DiabeticRecommendationSystem#getEstimators <em>Estimators</em>}</li>
 *   <li>{@link ssda_research.DiabeticRecommendationSystem#getCv <em>Cv</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem()
 * @model
 * @generated
 */
public interface DiabeticRecommendationSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.Patient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem_Patient()
	 * @model containment="true"
	 * @generated
	 */
	EList<Patient> getPatient();

	/**
	 * Returns the value of the '<em><b>Symp</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.Symptoms}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symp</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem_Symp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Symptoms> getSymp();

	/**
	 * Returns the value of the '<em><b>Med</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.Medicines}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Med</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem_Med()
	 * @model containment="true"
	 * @generated
	 */
	EList<Medicines> getMed();

	/**
	 * Returns the value of the '<em><b>Doctor</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.Doctor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctor</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem_Doctor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Doctor> getDoctor();

	/**
	 * Returns the value of the '<em><b>Pred</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.DiabetesPrediction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem_Pred()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<DiabetesPrediction> getPred();

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem_Dataset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dataset> getDataset();

	/**
	 * Returns the value of the '<em><b>Eda</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.ExploratoryDataAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eda</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem_Eda()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExploratoryDataAnalysis> getEda();

	/**
	 * Returns the value of the '<em><b>Dpreprocess</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.Data_Preprocessing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dpreprocess</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem_Dpreprocess()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data_Preprocessing> getDpreprocess();

	/**
	 * Returns the value of the '<em><b>Model op</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.ModelOptimization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model op</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem_Model_op()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelOptimization> getModel_op();

	/**
	 * Returns the value of the '<em><b>Estimators</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.classifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimators</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem_Estimators()
	 * @model containment="true"
	 * @generated
	 */
	EList<classifiers> getEstimators();

	/**
	 * Returns the value of the '<em><b>Cv</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.CrossValidation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cv</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabeticRecommendationSystem_Cv()
	 * @model containment="true"
	 * @generated
	 */
	EList<CrossValidation> getCv();

} // DiabeticRecommendationSystem
