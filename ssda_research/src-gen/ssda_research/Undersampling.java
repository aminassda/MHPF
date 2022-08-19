/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Undersampling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Undersampling#getUndersampling_technque <em>Undersampling technque</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getUndersampling()
 * @model
 * @generated
 */
public interface Undersampling extends Sampling {
	/**
	 * Returns the value of the '<em><b>Undersampling technque</b></em>' attribute.
	 * The literals are from the enumeration {@link ssda_research.UnderSampling_technique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undersampling technque</em>' attribute.
	 * @see ssda_research.UnderSampling_technique
	 * @see #setUndersampling_technque(UnderSampling_technique)
	 * @see ssda_research.Ssda_researchPackage#getUndersampling_Undersampling_technque()
	 * @model
	 * @generated
	 */
	UnderSampling_technique getUndersampling_technque();

	/**
	 * Sets the value of the '{@link ssda_research.Undersampling#getUndersampling_technque <em>Undersampling technque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undersampling technque</em>' attribute.
	 * @see ssda_research.UnderSampling_technique
	 * @see #getUndersampling_technque()
	 * @generated
	 */
	void setUndersampling_technque(UnderSampling_technique value);

} // Undersampling
