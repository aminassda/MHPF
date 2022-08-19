/**
 */
package ssda_research;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outlier Detection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.OutlierDetection#getPlot <em>Plot</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getOutlierDetection()
 * @model abstract="true"
 * @generated
 */
public interface OutlierDetection extends Data_Preprocessing {
	/**
	 * Returns the value of the '<em><b>Plot</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Plot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plot</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getOutlierDetection_Plot()
	 * @model required="true"
	 * @generated
	 */
	EList<Plot> getPlot();

} // OutlierDetection
