/**
 */
package ssda_research;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Preprocessing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Data_Preprocessing#getDataset <em>Dataset</em>}</li>
 *   <li>{@link ssda_research.Data_Preprocessing#getP_data <em>Pdata</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getData_Preprocessing()
 * @model abstract="true"
 * @generated
 */
public interface Data_Preprocessing extends EObject {
	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getData_Preprocessing_Dataset()
	 * @model
	 * @generated
	 */
	EList<Dataset> getDataset();

	/**
	 * Returns the value of the '<em><b>Pdata</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.Preprocessed_data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pdata</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getData_Preprocessing_P_data()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Preprocessed_data> getP_data();

} // Data_Preprocessing
