/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Test_data#getX_test <em>Xtest</em>}</li>
 *   <li>{@link ssda_research.Test_data#getY_test <em>Ytest</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getTest_data()
 * @model
 * @generated
 */
public interface Test_data extends Splitted_dataset {
	/**
	 * Returns the value of the '<em><b>Xtest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xtest</em>' attribute.
	 * @see #setX_test(String)
	 * @see ssda_research.Ssda_researchPackage#getTest_data_X_test()
	 * @model dataType="ssda_research.Tested"
	 * @generated
	 */
	String getX_test();

	/**
	 * Sets the value of the '{@link ssda_research.Test_data#getX_test <em>Xtest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xtest</em>' attribute.
	 * @see #getX_test()
	 * @generated
	 */
	void setX_test(String value);

	/**
	 * Returns the value of the '<em><b>Ytest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ytest</em>' attribute.
	 * @see #setY_test(String)
	 * @see ssda_research.Ssda_researchPackage#getTest_data_Y_test()
	 * @model dataType="ssda_research.Tested"
	 * @generated
	 */
	String getY_test();

	/**
	 * Sets the value of the '{@link ssda_research.Test_data#getY_test <em>Ytest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ytest</em>' attribute.
	 * @see #getY_test()
	 * @generated
	 */
	void setY_test(String value);

} // Test_data
