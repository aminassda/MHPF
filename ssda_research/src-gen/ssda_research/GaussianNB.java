/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gaussian NB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.GaussianNB#getVar_smoothing <em>Var smoothing</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getGaussianNB()
 * @model
 * @generated
 */
public interface GaussianNB extends classifiers {
	/**
	 * Returns the value of the '<em><b>Var smoothing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var smoothing</em>' attribute.
	 * @see #setVar_smoothing(String)
	 * @see ssda_research.Ssda_researchPackage#getGaussianNB_Var_smoothing()
	 * @model
	 * @generated
	 */
	String getVar_smoothing();

	/**
	 * Sets the value of the '{@link ssda_research.GaussianNB#getVar_smoothing <em>Var smoothing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var smoothing</em>' attribute.
	 * @see #getVar_smoothing()
	 * @generated
	 */
	void setVar_smoothing(String value);

} // GaussianNB
