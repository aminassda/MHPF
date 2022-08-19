/**
 */
package ssda_research;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symptoms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Symptoms#getSymptom_name <em>Symptom name</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getSymptoms()
 * @model
 * @generated
 */
public interface Symptoms extends EObject {
	/**
	 * Returns the value of the '<em><b>Symptom name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symptom name</em>' attribute.
	 * @see #setSymptom_name(String)
	 * @see ssda_research.Ssda_researchPackage#getSymptoms_Symptom_name()
	 * @model
	 * @generated
	 */
	String getSymptom_name();

	/**
	 * Sets the value of the '{@link ssda_research.Symptoms#getSymptom_name <em>Symptom name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symptom name</em>' attribute.
	 * @see #getSymptom_name()
	 * @generated
	 */
	void setSymptom_name(String value);

} // Symptoms
