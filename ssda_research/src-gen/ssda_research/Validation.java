/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Validation#getCv <em>Cv</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getValidation()
 * @model abstract="true"
 * @generated
 */
public interface Validation extends CrossValidation {
	/**
	 * Returns the value of the '<em><b>Cv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cv</em>' attribute.
	 * @see #setCv(String)
	 * @see ssda_research.Ssda_researchPackage#getValidation_Cv()
	 * @model
	 * @generated
	 */
	String getCv();

	/**
	 * Sets the value of the '{@link ssda_research.Validation#getCv <em>Cv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cv</em>' attribute.
	 * @see #getCv()
	 * @generated
	 */
	void setCv(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cross_val_score();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cross_val_predict();

} // Validation
