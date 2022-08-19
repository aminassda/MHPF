/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MLP Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.MLPClassifier#getHidden_layer_status <em>Hidden layer status</em>}</li>
 *   <li>{@link ssda_research.MLPClassifier#getActivation <em>Activation</em>}</li>
 *   <li>{@link ssda_research.MLPClassifier#getSolver <em>Solver</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getMLPClassifier()
 * @model
 * @generated
 */
public interface MLPClassifier extends classifiers {
	/**
	 * Returns the value of the '<em><b>Hidden layer status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden layer status</em>' attribute.
	 * @see #setHidden_layer_status(int)
	 * @see ssda_research.Ssda_researchPackage#getMLPClassifier_Hidden_layer_status()
	 * @model required="true"
	 * @generated
	 */
	int getHidden_layer_status();

	/**
	 * Sets the value of the '{@link ssda_research.MLPClassifier#getHidden_layer_status <em>Hidden layer status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden layer status</em>' attribute.
	 * @see #getHidden_layer_status()
	 * @generated
	 */
	void setHidden_layer_status(int value);

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' attribute.
	 * @see #setActivation(String)
	 * @see ssda_research.Ssda_researchPackage#getMLPClassifier_Activation()
	 * @model
	 * @generated
	 */
	String getActivation();

	/**
	 * Sets the value of the '{@link ssda_research.MLPClassifier#getActivation <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' attribute.
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(String value);

	/**
	 * Returns the value of the '<em><b>Solver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver</em>' attribute.
	 * @see #setSolver(String)
	 * @see ssda_research.Ssda_researchPackage#getMLPClassifier_Solver()
	 * @model
	 * @generated
	 */
	String getSolver();

	/**
	 * Sets the value of the '{@link ssda_research.MLPClassifier#getSolver <em>Solver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver</em>' attribute.
	 * @see #getSolver()
	 * @generated
	 */
	void setSolver(String value);

} // MLPClassifier
