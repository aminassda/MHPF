/**
 */
package ssda_research;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>classifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.classifiers#getPred <em>Pred</em>}</li>
 *   <li>{@link ssda_research.classifiers#getSplits <em>Splits</em>}</li>
 *   <li>{@link ssda_research.classifiers#getDataset <em>Dataset</em>}</li>
 *   <li>{@link ssda_research.classifiers#getCv <em>Cv</em>}</li>
 *   <li>{@link ssda_research.classifiers#getRandom_state <em>Random state</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getclassifiers()
 * @model abstract="true"
 * @generated
 */
public interface classifiers extends EObject {
	/**
	 * Returns the value of the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred</em>' reference.
	 * @see #setPred(DiabetesPrediction)
	 * @see ssda_research.Ssda_researchPackage#getclassifiers_Pred()
	 * @model required="true"
	 * @generated
	 */
	DiabetesPrediction getPred();

	/**
	 * Sets the value of the '{@link ssda_research.classifiers#getPred <em>Pred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pred</em>' reference.
	 * @see #getPred()
	 * @generated
	 */
	void setPred(DiabetesPrediction value);

	/**
	 * Returns the value of the '<em><b>Splits</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Splitted_dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Splits</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getclassifiers_Splits()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<Splitted_dataset> getSplits();

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getclassifiers_Dataset()
	 * @model required="true"
	 * @generated
	 */
	EList<Dataset> getDataset();

	/**
	 * Returns the value of the '<em><b>Cv</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.CrossValidation}.
	 * It is bidirectional and its opposite is '{@link ssda_research.CrossValidation#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cv</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getclassifiers_Cv()
	 * @see ssda_research.CrossValidation#getClassifiers
	 * @model opposite="classifiers"
	 * @generated
	 */
	EList<CrossValidation> getCv();

	/**
	 * Returns the value of the '<em><b>Random state</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random state</em>' attribute.
	 * @see #setRandom_state(String)
	 * @see ssda_research.Ssda_researchPackage#getclassifiers_Random_state()
	 * @model default="None"
	 * @generated
	 */
	String getRandom_state();

	/**
	 * Sets the value of the '{@link ssda_research.classifiers#getRandom_state <em>Random state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random state</em>' attribute.
	 * @see #getRandom_state()
	 * @generated
	 */
	void setRandom_state(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void predict();

} // classifiers
