/**
 */
package ssda_research;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diabetes Prediction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.DiabetesPrediction#getEvaluated <em>Evaluated</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getDiabetesPrediction()
 * @model
 * @generated
 */
public interface DiabetesPrediction extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluated</b></em>' containment reference list.
	 * The list contents are of type {@link ssda_research.Performance_Evaluation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluated</em>' containment reference list.
	 * @see ssda_research.Ssda_researchPackage#getDiabetesPrediction_Evaluated()
	 * @model containment="true"
	 * @generated
	 */
	EList<Performance_Evaluation> getEvaluated();

} // DiabetesPrediction
