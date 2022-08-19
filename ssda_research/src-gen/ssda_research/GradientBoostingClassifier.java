/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient Boosting Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.GradientBoostingClassifier#getN_estimators <em>Nestimators</em>}</li>
 *   <li>{@link ssda_research.GradientBoostingClassifier#getLearning_rate <em>Learning rate</em>}</li>
 *   <li>{@link ssda_research.GradientBoostingClassifier#getMax_depth <em>Max depth</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getGradientBoostingClassifier()
 * @model
 * @generated
 */
public interface GradientBoostingClassifier extends classifiers {
	/**
	 * Returns the value of the '<em><b>Nestimators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nestimators</em>' attribute.
	 * @see #setN_estimators(String)
	 * @see ssda_research.Ssda_researchPackage#getGradientBoostingClassifier_N_estimators()
	 * @model
	 * @generated
	 */
	String getN_estimators();

	/**
	 * Sets the value of the '{@link ssda_research.GradientBoostingClassifier#getN_estimators <em>Nestimators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nestimators</em>' attribute.
	 * @see #getN_estimators()
	 * @generated
	 */
	void setN_estimators(String value);

	/**
	 * Returns the value of the '<em><b>Learning rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learning rate</em>' attribute.
	 * @see #setLearning_rate(float)
	 * @see ssda_research.Ssda_researchPackage#getGradientBoostingClassifier_Learning_rate()
	 * @model required="true"
	 * @generated
	 */
	float getLearning_rate();

	/**
	 * Sets the value of the '{@link ssda_research.GradientBoostingClassifier#getLearning_rate <em>Learning rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learning rate</em>' attribute.
	 * @see #getLearning_rate()
	 * @generated
	 */
	void setLearning_rate(float value);

	/**
	 * Returns the value of the '<em><b>Max depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max depth</em>' attribute.
	 * @see #setMax_depth(String)
	 * @see ssda_research.Ssda_researchPackage#getGradientBoostingClassifier_Max_depth()
	 * @model
	 * @generated
	 */
	String getMax_depth();

	/**
	 * Sets the value of the '{@link ssda_research.GradientBoostingClassifier#getMax_depth <em>Max depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max depth</em>' attribute.
	 * @see #getMax_depth()
	 * @generated
	 */
	void setMax_depth(String value);

} // GradientBoostingClassifier
