/**
 */
package ssda_research;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Medicines#getMedicine_name <em>Medicine name</em>}</li>
 *   <li>{@link ssda_research.Medicines#getMedicine_dossage <em>Medicine dossage</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getMedicines()
 * @model
 * @generated
 */
public interface Medicines extends EObject {
	/**
	 * Returns the value of the '<em><b>Medicine name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicine name</em>' attribute.
	 * @see #setMedicine_name(String)
	 * @see ssda_research.Ssda_researchPackage#getMedicines_Medicine_name()
	 * @model
	 * @generated
	 */
	String getMedicine_name();

	/**
	 * Sets the value of the '{@link ssda_research.Medicines#getMedicine_name <em>Medicine name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicine name</em>' attribute.
	 * @see #getMedicine_name()
	 * @generated
	 */
	void setMedicine_name(String value);

	/**
	 * Returns the value of the '<em><b>Medicine dossage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicine dossage</em>' attribute.
	 * @see #setMedicine_dossage(String)
	 * @see ssda_research.Ssda_researchPackage#getMedicines_Medicine_dossage()
	 * @model
	 * @generated
	 */
	String getMedicine_dossage();

	/**
	 * Sets the value of the '{@link ssda_research.Medicines#getMedicine_dossage <em>Medicine dossage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicine dossage</em>' attribute.
	 * @see #getMedicine_dossage()
	 * @generated
	 */
	void setMedicine_dossage(String value);

} // Medicines
