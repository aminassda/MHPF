/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KNeighbors Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.KNeighborsClassifier#getMetric <em>Metric</em>}</li>
 *   <li>{@link ssda_research.KNeighborsClassifier#getP <em>P</em>}</li>
 *   <li>{@link ssda_research.KNeighborsClassifier#getN_neighbors <em>Nneighbors</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getKNeighborsClassifier()
 * @model
 * @generated
 */
public interface KNeighborsClassifier extends classifiers {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see #setMetric(String)
	 * @see ssda_research.Ssda_researchPackage#getKNeighborsClassifier_Metric()
	 * @model
	 * @generated
	 */
	String getMetric();

	/**
	 * Sets the value of the '{@link ssda_research.KNeighborsClassifier#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(String value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' attribute.
	 * @see #setP(int)
	 * @see ssda_research.Ssda_researchPackage#getKNeighborsClassifier_P()
	 * @model required="true"
	 * @generated
	 */
	int getP();

	/**
	 * Sets the value of the '{@link ssda_research.KNeighborsClassifier#getP <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' attribute.
	 * @see #getP()
	 * @generated
	 */
	void setP(int value);

	/**
	 * Returns the value of the '<em><b>Nneighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nneighbors</em>' attribute.
	 * @see #setN_neighbors(String)
	 * @see ssda_research.Ssda_researchPackage#getKNeighborsClassifier_N_neighbors()
	 * @model
	 * @generated
	 */
	String getN_neighbors();

	/**
	 * Sets the value of the '{@link ssda_research.KNeighborsClassifier#getN_neighbors <em>Nneighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nneighbors</em>' attribute.
	 * @see #getN_neighbors()
	 * @generated
	 */
	void setN_neighbors(String value);

} // KNeighborsClassifier
