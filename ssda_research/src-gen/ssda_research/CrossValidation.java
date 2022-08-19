/**
 */
package ssda_research;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.CrossValidation#getDataset <em>Dataset</em>}</li>
 *   <li>{@link ssda_research.CrossValidation#getSplits <em>Splits</em>}</li>
 *   <li>{@link ssda_research.CrossValidation#getAccess_p_data <em>Access pdata</em>}</li>
 *   <li>{@link ssda_research.CrossValidation#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link ssda_research.CrossValidation#isShuffle <em>Shuffle</em>}</li>
 *   <li>{@link ssda_research.CrossValidation#getRandom_state <em>Random state</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getCrossValidation()
 * @model abstract="true"
 * @generated
 */
public interface CrossValidation extends EObject {
	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getCrossValidation_Dataset()
	 * @model required="true"
	 * @generated
	 */
	EList<Dataset> getDataset();

	/**
	 * Returns the value of the '<em><b>Splits</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.Splitted_dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Splits</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getCrossValidation_Splits()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Splitted_dataset> getSplits();

	/**
	 * Returns the value of the '<em><b>Access pdata</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Preprocessed_data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access pdata</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getCrossValidation_Access_p_data()
	 * @model
	 * @generated
	 */
	EList<Preprocessed_data> getAccess_p_data();

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.classifiers}.
	 * It is bidirectional and its opposite is '{@link ssda_research.classifiers#getCv <em>Cv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getCrossValidation_Classifiers()
	 * @see ssda_research.classifiers#getCv
	 * @model opposite="cv" required="true"
	 * @generated
	 */
	EList<classifiers> getClassifiers();

	/**
	 * Returns the value of the '<em><b>Shuffle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shuffle</em>' attribute.
	 * @see #setShuffle(boolean)
	 * @see ssda_research.Ssda_researchPackage#getCrossValidation_Shuffle()
	 * @model required="true"
	 * @generated
	 */
	boolean isShuffle();

	/**
	 * Sets the value of the '{@link ssda_research.CrossValidation#isShuffle <em>Shuffle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shuffle</em>' attribute.
	 * @see #isShuffle()
	 * @generated
	 */
	void setShuffle(boolean value);

	/**
	 * Returns the value of the '<em><b>Random state</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random state</em>' attribute.
	 * @see #setRandom_state(String)
	 * @see ssda_research.Ssda_researchPackage#getCrossValidation_Random_state()
	 * @model default="None"
	 * @generated
	 */
	String getRandom_state();

	/**
	 * Sets the value of the '{@link ssda_research.CrossValidation#getRandom_state <em>Random state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random state</em>' attribute.
	 * @see #getRandom_state()
	 * @generated
	 */
	void setRandom_state(String value);

} // CrossValidation
