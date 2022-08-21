/**
 */
package ssda_research;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drug</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Drug#getDrug_name <em>Drug name</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getDrug()
 * @model abstract="true"
 * @generated
 */
public interface Drug extends EObject {
	/**
	 * Returns the value of the '<em><b>Drug name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drug name</em>' attribute.
	 * @see #setDrug_name(String)
	 * @see ssda_research.Ssda_researchPackage#getDrug_Drug_name()
	 * @model
	 * @generated
	 */
	String getDrug_name();

	/**
	 * Sets the value of the '{@link ssda_research.Drug#getDrug_name <em>Drug name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drug name</em>' attribute.
	 * @see #getDrug_name()
	 * @generated
	 */
	void setDrug_name(String value);

} // Drug
