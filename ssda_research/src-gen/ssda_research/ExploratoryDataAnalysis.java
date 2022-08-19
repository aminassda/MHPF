/**
 */
package ssda_research;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exploratory Data Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.ExploratoryDataAnalysis#getDatasets <em>Datasets</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getExploratoryDataAnalysis()
 * @model abstract="true"
 * @generated
 */
public interface ExploratoryDataAnalysis extends EObject {
	/**
	 * Returns the value of the '<em><b>Datasets</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasets</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getExploratoryDataAnalysis_Datasets()
	 * @model
	 * @generated
	 */
	EList<Dataset> getDatasets();

} // ExploratoryDataAnalysis
