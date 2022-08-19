/**
 */
package ssda_research;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Optimization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.ModelOptimization#getParam_grid <em>Param grid</em>}</li>
 *   <li>{@link ssda_research.ModelOptimization#getEstimator <em>Estimator</em>}</li>
 *   <li>{@link ssda_research.ModelOptimization#getSplits <em>Splits</em>}</li>
 *   <li>{@link ssda_research.ModelOptimization#getGenerate_pred <em>Generate pred</em>}</li>
 *   <li>{@link ssda_research.ModelOptimization#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getModelOptimization()
 * @model abstract="true"
 * @generated
 */
public interface ModelOptimization extends EObject {
	/**
	 * Returns the value of the '<em><b>Param grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param grid</em>' attribute.
	 * @see #setParam_grid(String)
	 * @see ssda_research.Ssda_researchPackage#getModelOptimization_Param_grid()
	 * @model
	 * @generated
	 */
	String getParam_grid();

	/**
	 * Sets the value of the '{@link ssda_research.ModelOptimization#getParam_grid <em>Param grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param grid</em>' attribute.
	 * @see #getParam_grid()
	 * @generated
	 */
	void setParam_grid(String value);

	/**
	 * Returns the value of the '<em><b>Estimator</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.classifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimator</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getModelOptimization_Estimator()
	 * @model required="true"
	 * @generated
	 */
	EList<classifiers> getEstimator();

	/**
	 * Returns the value of the '<em><b>Splits</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Splitted_dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Splits</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getModelOptimization_Splits()
	 * @model
	 * @generated
	 */
	EList<Splitted_dataset> getSplits();

	/**
	 * Returns the value of the '<em><b>Generate pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate pred</em>' reference.
	 * @see #setGenerate_pred(DiabetesPrediction)
	 * @see ssda_research.Ssda_researchPackage#getModelOptimization_Generate_pred()
	 * @model required="true"
	 * @generated
	 */
	DiabetesPrediction getGenerate_pred();

	/**
	 * Sets the value of the '{@link ssda_research.ModelOptimization#getGenerate_pred <em>Generate pred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate pred</em>' reference.
	 * @see #getGenerate_pred()
	 * @generated
	 */
	void setGenerate_pred(DiabetesPrediction value);

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getModelOptimization_Dataset()
	 * @model
	 * @generated
	 */
	EList<Dataset> getDataset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void predict();

} // ModelOptimization
