/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Forest Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.RandomForestClassifier#getMax_depth <em>Max depth</em>}</li>
 *   <li>{@link ssda_research.RandomForestClassifier#getMax_features <em>Max features</em>}</li>
 *   <li>{@link ssda_research.RandomForestClassifier#getMin_samples_split <em>Min samples split</em>}</li>
 *   <li>{@link ssda_research.RandomForestClassifier#getMin_samples_leaf <em>Min samples leaf</em>}</li>
 *   <li>{@link ssda_research.RandomForestClassifier#getN_estimators <em>Nestimators</em>}</li>
 *   <li>{@link ssda_research.RandomForestClassifier#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getRandomForestClassifier()
 * @model
 * @generated
 */
public interface RandomForestClassifier extends classifiers {
	/**
	 * Returns the value of the '<em><b>Max depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max depth</em>' attribute.
	 * @see #setMax_depth(String)
	 * @see ssda_research.Ssda_researchPackage#getRandomForestClassifier_Max_depth()
	 * @model
	 * @generated
	 */
	String getMax_depth();

	/**
	 * Sets the value of the '{@link ssda_research.RandomForestClassifier#getMax_depth <em>Max depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max depth</em>' attribute.
	 * @see #getMax_depth()
	 * @generated
	 */
	void setMax_depth(String value);

	/**
	 * Returns the value of the '<em><b>Max features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max features</em>' attribute.
	 * @see #setMax_features(String)
	 * @see ssda_research.Ssda_researchPackage#getRandomForestClassifier_Max_features()
	 * @model
	 * @generated
	 */
	String getMax_features();

	/**
	 * Sets the value of the '{@link ssda_research.RandomForestClassifier#getMax_features <em>Max features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max features</em>' attribute.
	 * @see #getMax_features()
	 * @generated
	 */
	void setMax_features(String value);

	/**
	 * Returns the value of the '<em><b>Min samples split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min samples split</em>' attribute.
	 * @see #setMin_samples_split(String)
	 * @see ssda_research.Ssda_researchPackage#getRandomForestClassifier_Min_samples_split()
	 * @model
	 * @generated
	 */
	String getMin_samples_split();

	/**
	 * Sets the value of the '{@link ssda_research.RandomForestClassifier#getMin_samples_split <em>Min samples split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min samples split</em>' attribute.
	 * @see #getMin_samples_split()
	 * @generated
	 */
	void setMin_samples_split(String value);

	/**
	 * Returns the value of the '<em><b>Min samples leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min samples leaf</em>' attribute.
	 * @see #setMin_samples_leaf(String)
	 * @see ssda_research.Ssda_researchPackage#getRandomForestClassifier_Min_samples_leaf()
	 * @model
	 * @generated
	 */
	String getMin_samples_leaf();

	/**
	 * Sets the value of the '{@link ssda_research.RandomForestClassifier#getMin_samples_leaf <em>Min samples leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min samples leaf</em>' attribute.
	 * @see #getMin_samples_leaf()
	 * @generated
	 */
	void setMin_samples_leaf(String value);

	/**
	 * Returns the value of the '<em><b>Nestimators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nestimators</em>' attribute.
	 * @see #setN_estimators(String)
	 * @see ssda_research.Ssda_researchPackage#getRandomForestClassifier_N_estimators()
	 * @model
	 * @generated
	 */
	String getN_estimators();

	/**
	 * Sets the value of the '{@link ssda_research.RandomForestClassifier#getN_estimators <em>Nestimators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nestimators</em>' attribute.
	 * @see #getN_estimators()
	 * @generated
	 */
	void setN_estimators(String value);

	/**
	 * Returns the value of the '<em><b>Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion</em>' attribute.
	 * @see #setCriterion(String)
	 * @see ssda_research.Ssda_researchPackage#getRandomForestClassifier_Criterion()
	 * @model
	 * @generated
	 */
	String getCriterion();

	/**
	 * Sets the value of the '{@link ssda_research.RandomForestClassifier#getCriterion <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion</em>' attribute.
	 * @see #getCriterion()
	 * @generated
	 */
	void setCriterion(String value);

} // RandomForestClassifier
