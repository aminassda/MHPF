/**
 */
package ssda_research;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IQR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.IQR#getQ1 <em>Q1</em>}</li>
 *   <li>{@link ssda_research.IQR#getQ2 <em>Q2</em>}</li>
 *   <li>{@link ssda_research.IQR#getQ3 <em>Q3</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getIQR()
 * @model
 * @generated
 */
public interface IQR extends EObject {
	/**
	 * Returns the value of the '<em><b>Q1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q1</em>' attribute.
	 * @see #setQ1(String)
	 * @see ssda_research.Ssda_researchPackage#getIQR_Q1()
	 * @model dataType="ssda_research.LowerQuartile"
	 * @generated
	 */
	String getQ1();

	/**
	 * Sets the value of the '{@link ssda_research.IQR#getQ1 <em>Q1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q1</em>' attribute.
	 * @see #getQ1()
	 * @generated
	 */
	void setQ1(String value);

	/**
	 * Returns the value of the '<em><b>Q2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q2</em>' attribute.
	 * @see #setQ2(String)
	 * @see ssda_research.Ssda_researchPackage#getIQR_Q2()
	 * @model dataType="ssda_research.Median"
	 * @generated
	 */
	String getQ2();

	/**
	 * Sets the value of the '{@link ssda_research.IQR#getQ2 <em>Q2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q2</em>' attribute.
	 * @see #getQ2()
	 * @generated
	 */
	void setQ2(String value);

	/**
	 * Returns the value of the '<em><b>Q3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q3</em>' attribute.
	 * @see #setQ3(String)
	 * @see ssda_research.Ssda_researchPackage#getIQR_Q3()
	 * @model dataType="ssda_research.UpperQuartile"
	 * @generated
	 */
	String getQ3();

	/**
	 * Sets the value of the '{@link ssda_research.IQR#getQ3 <em>Q3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q3</em>' attribute.
	 * @see #getQ3()
	 * @generated
	 */
	void setQ3(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void quantile();

} // IQR
