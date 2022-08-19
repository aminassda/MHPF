/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train Test Split</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.TrainTestSplit#getTrain_size <em>Train size</em>}</li>
 *   <li>{@link ssda_research.TrainTestSplit#getTest_size <em>Test size</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getTrainTestSplit()
 * @model
 * @generated
 */
public interface TrainTestSplit extends CrossValidation {
	/**
	 * Returns the value of the '<em><b>Test size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test size</em>' attribute.
	 * @see #setTest_size(String)
	 * @see ssda_research.Ssda_researchPackage#getTrainTestSplit_Test_size()
	 * @model
	 * @generated
	 */
	String getTest_size();

	/**
	 * Sets the value of the '{@link ssda_research.TrainTestSplit#getTest_size <em>Test size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test size</em>' attribute.
	 * @see #getTest_size()
	 * @generated
	 */
	void setTest_size(String value);

	/**
	 * Returns the value of the '<em><b>Train size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train size</em>' attribute.
	 * @see #setTrain_size(String)
	 * @see ssda_research.Ssda_researchPackage#getTrainTestSplit_Train_size()
	 * @model
	 * @generated
	 */
	String getTrain_size();

	/**
	 * Sets the value of the '{@link ssda_research.TrainTestSplit#getTrain_size <em>Train size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train size</em>' attribute.
	 * @see #getTrain_size()
	 * @generated
	 */
	void setTrain_size(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void train_test_split();

} // TrainTestSplit
