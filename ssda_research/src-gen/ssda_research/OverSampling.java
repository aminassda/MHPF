/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Over Sampling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.OverSampling#getSampling_technique <em>Sampling technique</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getOverSampling()
 * @model
 * @generated
 */
public interface OverSampling extends Sampling {
	/**
	 * Returns the value of the '<em><b>Sampling technique</b></em>' attribute.
	 * The literals are from the enumeration {@link ssda_research.Oversampling_technique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling technique</em>' attribute.
	 * @see ssda_research.Oversampling_technique
	 * @see #setSampling_technique(Oversampling_technique)
	 * @see ssda_research.Ssda_researchPackage#getOverSampling_Sampling_technique()
	 * @model
	 * @generated
	 */
	Oversampling_technique getSampling_technique();

	/**
	 * Sets the value of the '{@link ssda_research.OverSampling#getSampling_technique <em>Sampling technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling technique</em>' attribute.
	 * @see ssda_research.Oversampling_technique
	 * @see #getSampling_technique()
	 * @generated
	 */
	void setSampling_technique(Oversampling_technique value);

} // OverSampling
