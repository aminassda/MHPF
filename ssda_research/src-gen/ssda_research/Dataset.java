/**
 */
package ssda_research;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Dataset#getType <em>Type</em>}</li>
 *   <li>{@link ssda_research.Dataset#getAccessible_to <em>Accessible to</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getDataset()
 * @model
 * @generated
 */
public interface Dataset extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ssda_research.Ssda_researchPackage#getDataset_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ssda_research.Dataset#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Accessible to</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Symptoms}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible to</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getDataset_Accessible_to()
	 * @model required="true"
	 * @generated
	 */
	EList<Symptoms> getAccessible_to();

} // Dataset
