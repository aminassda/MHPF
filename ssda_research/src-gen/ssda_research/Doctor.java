/**
 */
package ssda_research;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doctor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.Doctor#getName <em>Name</em>}</li>
 *   <li>{@link ssda_research.Doctor#getAddress <em>Address</em>}</li>
 *   <li>{@link ssda_research.Doctor#getClinic_timings <em>Clinic timings</em>}</li>
 *   <li>{@link ssda_research.Doctor#getPhone_no <em>Phone no</em>}</li>
 *   <li>{@link ssda_research.Doctor#getSpecalization <em>Specalization</em>}</li>
 *   <li>{@link ssda_research.Doctor#getPatient <em>Patient</em>}</li>
 *   <li>{@link ssda_research.Doctor#getRecommend_med <em>Recommend med</em>}</li>
 *   <li>{@link ssda_research.Doctor#getView_pred <em>View pred</em>}</li>
 * </ul>
 *
 * @see ssda_research.Ssda_researchPackage#getDoctor()
 * @model
 * @generated
 */
public interface Doctor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ssda_research.Ssda_researchPackage#getDoctor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ssda_research.Doctor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see ssda_research.Ssda_researchPackage#getDoctor_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link ssda_research.Doctor#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Clinic timings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinic timings</em>' attribute.
	 * @see #setClinic_timings(String)
	 * @see ssda_research.Ssda_researchPackage#getDoctor_Clinic_timings()
	 * @model
	 * @generated
	 */
	String getClinic_timings();

	/**
	 * Sets the value of the '{@link ssda_research.Doctor#getClinic_timings <em>Clinic timings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinic timings</em>' attribute.
	 * @see #getClinic_timings()
	 * @generated
	 */
	void setClinic_timings(String value);

	/**
	 * Returns the value of the '<em><b>Phone no</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone no</em>' attribute.
	 * @see #setPhone_no(int)
	 * @see ssda_research.Ssda_researchPackage#getDoctor_Phone_no()
	 * @model required="true"
	 * @generated
	 */
	int getPhone_no();

	/**
	 * Sets the value of the '{@link ssda_research.Doctor#getPhone_no <em>Phone no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone no</em>' attribute.
	 * @see #getPhone_no()
	 * @generated
	 */
	void setPhone_no(int value);

	/**
	 * Returns the value of the '<em><b>Specalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specalization</em>' attribute.
	 * @see #setSpecalization(String)
	 * @see ssda_research.Ssda_researchPackage#getDoctor_Specalization()
	 * @model
	 * @generated
	 */
	String getSpecalization();

	/**
	 * Sets the value of the '{@link ssda_research.Doctor#getSpecalization <em>Specalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specalization</em>' attribute.
	 * @see #getSpecalization()
	 * @generated
	 */
	void setSpecalization(String value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Patient}.
	 * It is bidirectional and its opposite is '{@link ssda_research.Patient#getDoctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getDoctor_Patient()
	 * @see ssda_research.Patient#getDoctor
	 * @model opposite="doctor"
	 * @generated
	 */
	EList<Patient> getPatient();

	/**
	 * Returns the value of the '<em><b>Recommend med</b></em>' reference list.
	 * The list contents are of type {@link ssda_research.Medicines}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommend med</em>' reference list.
	 * @see ssda_research.Ssda_researchPackage#getDoctor_Recommend_med()
	 * @model
	 * @generated
	 */
	EList<Medicines> getRecommend_med();

	/**
	 * Returns the value of the '<em><b>View pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View pred</em>' reference.
	 * @see #setView_pred(DiabetesPrediction)
	 * @see ssda_research.Ssda_researchPackage#getDoctor_View_pred()
	 * @model required="true"
	 * @generated
	 */
	DiabetesPrediction getView_pred();

	/**
	 * Sets the value of the '{@link ssda_research.Doctor#getView_pred <em>View pred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View pred</em>' reference.
	 * @see #getView_pred()
	 * @generated
	 */
	void setView_pred(DiabetesPrediction value);

} // Doctor
