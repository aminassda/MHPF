/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Train_data#getX_train <em>Xtrain</em>}</li>
 *   <li>{@link ssda_research.Train_data#getY_train <em>Ytrain</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getTrain_data()
 * @model
 * @generated
 */
public interface Train_data extends Splitted_dataset {
	/**
	 * Returns the value of the '<em><b>Xtrain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xtrain</em>' attribute.
	 * @see #setX_train(String)
	 * @see ssda_research.Ssda_researchPackage#getTrain_data_X_train()
	 * @model dataType="ssda_research.Trained"
	 * @generated
	 */
	String getX_train();

	/**
	 * Sets the value of the '{@link ssda_research.Train_data#getX_train <em>Xtrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xtrain</em>' attribute.
	 * @see #getX_train()
	 * @generated
	 */
	void setX_train(String value);

	/**
	 * Returns the value of the '<em><b>Ytrain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ytrain</em>' attribute.
	 * @see #setY_train(String)
	 * @see ssda_research.Ssda_researchPackage#getTrain_data_Y_train()
	 * @model dataType="ssda_research.Trained"
	 * @generated
	 */
	String getY_train();

	/**
	 * Sets the value of the '{@link ssda_research.Train_data#getY_train <em>Ytrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ytrain</em>' attribute.
	 * @see #getY_train()
	 * @generated
	 */
	void setY_train(String value);

} // Train_data
