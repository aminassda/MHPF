/**
 */
package ssda_research;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>boxplot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.boxplot#getMin <em>Min</em>}</li>
 *   <li>{@link ssda_research.boxplot#getMax <em>Max</em>}</li>
 *   <li>{@link ssda_research.boxplot#getWhisker_width <em>Whisker width</em>}</li>
 *   <li>{@link ssda_research.boxplot#getLower_whisker <em>Lower whisker</em>}</li>
 *   <li>{@link ssda_research.boxplot#getUpper_whisker <em>Upper whisker</em>}</li>
 *   <li>{@link ssda_research.boxplot#getIqr <em>Iqr</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getboxplot()
 * @model
 * @generated
 */
public interface boxplot extends Plot {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(float)
	 * @see ssda_research.Ssda_researchPackage#getboxplot_Min()
	 * @model required="true"
	 * @generated
	 */
	float getMin();

	/**
	 * Sets the value of the '{@link ssda_research.boxplot#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(float value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(float)
	 * @see ssda_research.Ssda_researchPackage#getboxplot_Max()
	 * @model required="true"
	 * @generated
	 */
	float getMax();

	/**
	 * Sets the value of the '{@link ssda_research.boxplot#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(float value);

	/**
	 * Returns the value of the '<em><b>Whisker width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whisker width</em>' attribute.
	 * @see #setWhisker_width(float)
	 * @see ssda_research.Ssda_researchPackage#getboxplot_Whisker_width()
	 * @model required="true"
	 * @generated
	 */
	float getWhisker_width();

	/**
	 * Sets the value of the '{@link ssda_research.boxplot#getWhisker_width <em>Whisker width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whisker width</em>' attribute.
	 * @see #getWhisker_width()
	 * @generated
	 */
	void setWhisker_width(float value);

	/**
	 * Returns the value of the '<em><b>Lower whisker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower whisker</em>' attribute.
	 * @see #setLower_whisker(String)
	 * @see ssda_research.Ssda_researchPackage#getboxplot_Lower_whisker()
	 * @model
	 * @generated
	 */
	String getLower_whisker();

	/**
	 * Sets the value of the '{@link ssda_research.boxplot#getLower_whisker <em>Lower whisker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower whisker</em>' attribute.
	 * @see #getLower_whisker()
	 * @generated
	 */
	void setLower_whisker(String value);

	/**
	 * Returns the value of the '<em><b>Upper whisker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper whisker</em>' attribute.
	 * @see #setUpper_whisker(String)
	 * @see ssda_research.Ssda_researchPackage#getboxplot_Upper_whisker()
	 * @model
	 * @generated
	 */
	String getUpper_whisker();

	/**
	 * Sets the value of the '{@link ssda_research.boxplot#getUpper_whisker <em>Upper whisker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper whisker</em>' attribute.
	 * @see #getUpper_whisker()
	 * @generated
	 */
	void setUpper_whisker(String value);

	/**
	 * Returns the value of the '<em><b>Iqr</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.IQR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iqr</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getboxplot_Iqr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IQR> getIqr();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void five_summarydata();

} // boxplot
