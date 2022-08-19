/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voting Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.VotingClassifier#getVoting <em>Voting</em>}</li>
 *   <li>{@link ssda_research.VotingClassifier#getWeights <em>Weights</em>}</li>
 *   <li>{@link ssda_research.VotingClassifier#getEstimators <em>Estimators</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getVotingClassifier()
 * @model
 * @generated
 */
public interface VotingClassifier extends classifiers {
	/**
	 * Returns the value of the '<em><b>Voting</b></em>' attribute.
	 * The literals are from the enumeration {@link ssda_research.Voting_type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voting</em>' attribute.
	 * @see ssda_research.Voting_type
	 * @see #setVoting(Voting_type)
	 * @see ssda_research.Ssda_researchPackage#getVotingClassifier_Voting()
	 * @model
	 * @generated
	 */
	Voting_type getVoting();

	/**
	 * Sets the value of the '{@link ssda_research.VotingClassifier#getVoting <em>Voting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voting</em>' attribute.
	 * @see ssda_research.Voting_type
	 * @see #getVoting()
	 * @generated
	 */
	void setVoting(Voting_type value);

	/**
	 * Returns the value of the '<em><b>Weights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weights</em>' attribute.
	 * @see #setWeights(String)
	 * @see ssda_research.Ssda_researchPackage#getVotingClassifier_Weights()
	 * @model
	 * @generated
	 */
	String getWeights();

	/**
	 * Sets the value of the '{@link ssda_research.VotingClassifier#getWeights <em>Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weights</em>' attribute.
	 * @see #getWeights()
	 * @generated
	 */
	void setWeights(String value);

	/**
	 * Returns the value of the '<em><b>Estimators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimators</em>' attribute.
	 * @see #setEstimators(String)
	 * @see ssda_research.Ssda_researchPackage#getVotingClassifier_Estimators()
	 * @model
	 * @generated
	 */
	String getEstimators();

	/**
	 * Sets the value of the '{@link ssda_research.VotingClassifier#getEstimators <em>Estimators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimators</em>' attribute.
	 * @see #getEstimators()
	 * @generated
	 */
	void setEstimators(String value);

} // VotingClassifier
