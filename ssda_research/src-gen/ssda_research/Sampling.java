/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sampling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Sampling#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link ssda_research.Sampling#getRandom_state <em>Random state</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getSampling()
 * @model abstract="true"
 * @generated
 */
public interface Sampling extends Data_Preprocessing {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link ssda_research.Sampling_strategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see ssda_research.Sampling_strategy
	 * @see #setStrategy(Sampling_strategy)
	 * @see ssda_research.Ssda_researchPackage#getSampling_Strategy()
	 * @model
	 * @generated
	 */
	Sampling_strategy getStrategy();

	/**
	 * Sets the value of the '{@link ssda_research.Sampling#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see ssda_research.Sampling_strategy
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(Sampling_strategy value);

	/**
	 * Returns the value of the '<em><b>Random state</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random state</em>' attribute.
	 * @see #setRandom_state(String)
	 * @see ssda_research.Ssda_researchPackage#getSampling_Random_state()
	 * @model default="None"
	 * @generated
	 */
	String getRandom_state();

	/**
	 * Sets the value of the '{@link ssda_research.Sampling#getRandom_state <em>Random state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random state</em>' attribute.
	 * @see #getRandom_state()
	 * @generated
	 */
	void setRandom_state(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fit_resample();

} // Sampling
