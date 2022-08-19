/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.SVC#getKernel <em>Kernel</em>}</li>
 *   <li>{@link ssda_research.SVC#getGamma <em>Gamma</em>}</li>
 *   <li>{@link ssda_research.SVC#getC <em>C</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getSVC()
 * @model
 * @generated
 */
public interface SVC extends classifiers {
	/**
	 * Returns the value of the '<em><b>Kernel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel</em>' attribute.
	 * @see #setKernel(String)
	 * @see ssda_research.Ssda_researchPackage#getSVC_Kernel()
	 * @model
	 * @generated
	 */
	String getKernel();

	/**
	 * Sets the value of the '{@link ssda_research.SVC#getKernel <em>Kernel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel</em>' attribute.
	 * @see #getKernel()
	 * @generated
	 */
	void setKernel(String value);

	/**
	 * Returns the value of the '<em><b>Gamma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamma</em>' attribute.
	 * @see #setGamma(int)
	 * @see ssda_research.Ssda_researchPackage#getSVC_Gamma()
	 * @model required="true"
	 * @generated
	 */
	int getGamma();

	/**
	 * Sets the value of the '{@link ssda_research.SVC#getGamma <em>Gamma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma</em>' attribute.
	 * @see #getGamma()
	 * @generated
	 */
	void setGamma(int value);

	/**
	 * Returns the value of the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' attribute.
	 * @see #setC(int)
	 * @see ssda_research.Ssda_researchPackage#getSVC_C()
	 * @model required="true"
	 * @generated
	 */
	int getC();

	/**
	 * Sets the value of the '{@link ssda_research.SVC#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' attribute.
	 * @see #getC()
	 * @generated
	 */
	void setC(int value);

} // SVC
