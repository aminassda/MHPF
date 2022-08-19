/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Hybrid_Method#getHybrid_sampling_method <em>Hybrid sampling method</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getHybrid_Method()
 * @model
 * @generated
 */
public interface Hybrid_Method extends Sampling {
	/**
	 * Returns the value of the '<em><b>Hybrid sampling method</b></em>' attribute.
	 * The literals are from the enumeration {@link ssda_research.Hybrid_sampling_method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hybrid sampling method</em>' attribute.
	 * @see ssda_research.Hybrid_sampling_method
	 * @see #setHybrid_sampling_method(Hybrid_sampling_method)
	 * @see ssda_research.Ssda_researchPackage#getHybrid_Method_Hybrid_sampling_method()
	 * @model
	 * @generated
	 */
	Hybrid_sampling_method getHybrid_sampling_method();

	/**
	 * Sets the value of the '{@link ssda_research.Hybrid_Method#getHybrid_sampling_method <em>Hybrid sampling method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hybrid sampling method</em>' attribute.
	 * @see ssda_research.Hybrid_sampling_method
	 * @see #getHybrid_sampling_method()
	 * @generated
	 */
	void setHybrid_sampling_method(Hybrid_sampling_method value);

} // Hybrid_Method
