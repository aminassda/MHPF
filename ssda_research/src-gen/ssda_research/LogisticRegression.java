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
 *   <li>{@link ssda_research.LogisticRegression#getSolvers <em>Solvers</em>}</li>
 *   <li>{@link ssda_research.LogisticRegression#getPenalty <em>Penalty</em>}</li>
 *   <li>{@link ssda_research.LogisticRegression#getC_values <em>Cvalues</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getLogisticRegression()
 * @model
 * @generated
 */
public interface LogisticRegression extends classifiers {
	/**
	 * Returns the value of the '<em><b>Solvers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solvers</em>' attribute.
	 * @see #setSolvers(String)
	 * @see ssda_research.Ssda_researchPackage#getLogisticRegression_Solvers()
	 * @model
	 * @generated
	 */
	String getSolvers();

	/**
	 * Sets the value of the '{@link ssda_research.LogisticRegression#getSolvers <em>Solvers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solvers</em>' attribute.
	 * @see #getSolvers()
	 * @generated
	 */
	void setSolvers(String value);

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
	 * Returns the value of the '<em><b>Cvalues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cvalues</em>' attribute.
	 * @see #setC_values(String)
	 * @see ssda_research.Ssda_researchPackage#getLogisticRegression_C_values()
	 * @model
	 * @generated
	 */
	String getC_values();

	/**
	 * Sets the value of the '{@link ssda_research.LogisticRegression#getC_values <em>Cvalues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cvalues</em>' attribute.
	 * @see #getC_values()
	 * @generated
	 */
	void setC_values(String value);

} // LogisticRegression
