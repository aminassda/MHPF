/**
 */
package ssda_research;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KFold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.KFold#getN_splits <em>Nsplits</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getKFold()
 * @model
 * @generated
 */
public interface KFold extends Validation {
	/**
	 * Returns the value of the '<em><b>Nsplits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nsplits</em>' attribute.
	 * @see #setN_splits(String)
	 * @see ssda_research.Ssda_researchPackage#getKFold_N_splits()
	 * @model
	 * @generated
	 */
	String getN_splits();

	/**
	 * Sets the value of the '{@link ssda_research.KFold#getN_splits <em>Nsplits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nsplits</em>' attribute.
	 * @see #getN_splits()
	 * @generated
	 */
	void setN_splits(String value);

} // KFold
