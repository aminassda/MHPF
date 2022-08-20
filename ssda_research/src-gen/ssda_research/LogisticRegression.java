/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logistic Regression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.LogisticRegression#getSolver <em>Solver</em>}</li>
 *   <li>{@link ssda_research.LogisticRegression#getPenalty <em>Penalty</em>}</li>
 *   <li>{@link ssda_research.LogisticRegression#getC <em>C</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getLogisticRegression()
 * @model
 * @generated
 */
public interface LogisticRegression extends classifiers {
	/**
	 * Returns the value of the '<em><b>Solver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver</em>' attribute.
	 * @see #setSolver(String)
	 * @see ssda_research.Ssda_researchPackage#getLogisticRegression_Solver()
	 * @model
	 * @generated
	 */
	String getSolver();

	/**
	 * Sets the value of the '{@link ssda_research.LogisticRegression#getSolver <em>Solver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver</em>' attribute.
	 * @see #getSolver()
	 * @generated
	 */
	void setSolver(String value);

	/**
	 * Returns the value of the '<em><b>Penalty</b></em>' attribute.
	 * The literals are from the enumeration {@link ssda_research.Regularization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalty</em>' attribute.
	 * @see ssda_research.Regularization
	 * @see #setPenalty(Regularization)
	 * @see ssda_research.Ssda_researchPackage#getLogisticRegression_Penalty()
	 * @model
	 * @generated
	 */
	Regularization getPenalty();

	/**
	 * Sets the value of the '{@link ssda_research.LogisticRegression#getPenalty <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty</em>' attribute.
	 * @see ssda_research.Regularization
	 * @see #getPenalty()
	 * @generated
	 */
	void setPenalty(Regularization value);

	/**
	 * Returns the value of the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' attribute.
	 * @see #setC(String)
	 * @see ssda_research.Ssda_researchPackage#getLogisticRegression_C()
	 * @model
	 * @generated
	 */
	String getC();

	/**
	 * Sets the value of the '{@link ssda_research.LogisticRegression#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' attribute.
	 * @see #getC()
	 * @generated
	 */
	void setC(String value);

} // LogisticRegression
