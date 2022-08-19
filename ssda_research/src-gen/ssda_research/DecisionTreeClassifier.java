/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Tree Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.DecisionTreeClassifier#getCreterion <em>Creterion</em>}</li>
 *   <li>{@link ssda_research.DecisionTreeClassifier#getMax_depth <em>Max depth</em>}</li>
 *   <li>{@link ssda_research.DecisionTreeClassifier#getSplitter <em>Splitter</em>}</li>
 *   <li>{@link ssda_research.DecisionTreeClassifier#getMin_samples_split <em>Min samples split</em>}</li>
 *   <li>{@link ssda_research.DecisionTreeClassifier#getMin_samples_leaf <em>Min samples leaf</em>}</li>
 *   <li>{@link ssda_research.DecisionTreeClassifier#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}</li>
 *   <li>{@link ssda_research.DecisionTreeClassifier#getClass_weight <em>Class weight</em>}</li>
 *   <li>{@link ssda_research.DecisionTreeClassifier#getMax_features <em>Max features</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getDecisionTreeClassifier()
 * @model
 * @generated
 */
public interface DecisionTreeClassifier extends classifiers {
	/**
	 * Returns the value of the '<em><b>Creterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creterion</em>' attribute.
	 * @see #setCreterion(String)
	 * @see ssda_research.Ssda_researchPackage#getDecisionTreeClassifier_Creterion()
	 * @model
	 * @generated
	 */
	String getCreterion();

	/**
	 * Sets the value of the '{@link ssda_research.DecisionTreeClassifier#getCreterion <em>Creterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creterion</em>' attribute.
	 * @see #getCreterion()
	 * @generated
	 */
	void setCreterion(String value);

	/**
	 * Returns the value of the '<em><b>Max depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max depth</em>' attribute.
	 * @see #setMax_depth(String)
	 * @see ssda_research.Ssda_researchPackage#getDecisionTreeClassifier_Max_depth()
	 * @model
	 * @generated
	 */
	String getMax_depth();

	/**
	 * Sets the value of the '{@link ssda_research.DecisionTreeClassifier#getMax_depth <em>Max depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max depth</em>' attribute.
	 * @see #getMax_depth()
	 * @generated
	 */
	void setMax_depth(String value);

	/**
	 * Returns the value of the '<em><b>Splitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Splitter</em>' attribute.
	 * @see #setSplitter(String)
	 * @see ssda_research.Ssda_researchPackage#getDecisionTreeClassifier_Splitter()
	 * @model
	 * @generated
	 */
	String getSplitter();

	/**
	 * Sets the value of the '{@link ssda_research.DecisionTreeClassifier#getSplitter <em>Splitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Splitter</em>' attribute.
	 * @see #getSplitter()
	 * @generated
	 */
	void setSplitter(String value);

	/**
	 * Returns the value of the '<em><b>Min samples split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min samples split</em>' attribute.
	 * @see #setMin_samples_split(String)
	 * @see ssda_research.Ssda_researchPackage#getDecisionTreeClassifier_Min_samples_split()
	 * @model
	 * @generated
	 */
	String getMin_samples_split();

	/**
	 * Sets the value of the '{@link ssda_research.DecisionTreeClassifier#getMin_samples_split <em>Min samples split</em>}' attribute.
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
	 * @see ssda_research.Ssda_researchPackage#getDecisionTreeClassifier_Min_samples_leaf()
	 * @model
	 * @generated
	 */
	String getMin_samples_leaf();

	/**
	 * Sets the value of the '{@link ssda_research.DecisionTreeClassifier#getMin_samples_leaf <em>Min samples leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min samples leaf</em>' attribute.
	 * @see #getMin_samples_leaf()
	 * @generated
	 */
	void setMin_samples_leaf(String value);

	/**
	 * Returns the value of the '<em><b>Min weight fraction leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min weight fraction leaf</em>' attribute.
	 * @see #setMin_weight_fraction_leaf(String)
	 * @see ssda_research.Ssda_researchPackage#getDecisionTreeClassifier_Min_weight_fraction_leaf()
	 * @model
	 * @generated
	 */
	String getMin_weight_fraction_leaf();

	/**
	 * Sets the value of the '{@link ssda_research.DecisionTreeClassifier#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min weight fraction leaf</em>' attribute.
	 * @see #getMin_weight_fraction_leaf()
	 * @generated
	 */
	void setMin_weight_fraction_leaf(String value);

	/**
	 * Returns the value of the '<em><b>Max features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max features</em>' attribute.
	 * @see #setMax_features(String)
	 * @see ssda_research.Ssda_researchPackage#getDecisionTreeClassifier_Max_features()
	 * @model
	 * @generated
	 */
	String getMax_features();

	/**
	 * Sets the value of the '{@link ssda_research.DecisionTreeClassifier#getMax_features <em>Max features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max features</em>' attribute.
	 * @see #getMax_features()
	 * @generated
	 */
	void setMax_features(String value);

	/**
	 * Returns the value of the '<em><b>Class weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class weight</em>' attribute.
	 * @see #setClass_weight(String)
	 * @see ssda_research.Ssda_researchPackage#getDecisionTreeClassifier_Class_weight()
	 * @model
	 * @generated
	 */
	String getClass_weight();

	/**
	 * Sets the value of the '{@link ssda_research.DecisionTreeClassifier#getClass_weight <em>Class weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class weight</em>' attribute.
	 * @see #getClass_weight()
	 * @generated
	 */
	void setClass_weight(String value);

} // DecisionTreeClassifier
