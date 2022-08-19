/**
 */
package ssda_research.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ssda_research.DiabetesPrediction;
import ssda_research.Doctor;
import ssda_research.Medicines;
import ssda_research.Patient;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doctor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.DoctorImpl#getName <em>Name</em>}</li>
 *   <li>{@link ssda_research.impl.DoctorImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link ssda_research.impl.DoctorImpl#getClinic_timings <em>Clinic timings</em>}</li>
 *   <li>{@link ssda_research.impl.DoctorImpl#getPhone_no <em>Phone no</em>}</li>
 *   <li>{@link ssda_research.impl.DoctorImpl#getSpecalization <em>Specalization</em>}</li>
 *   <li>{@link ssda_research.impl.DoctorImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link ssda_research.impl.DoctorImpl#getRecommend_med <em>Recommend med</em>}</li>
 *   <li>{@link ssda_research.impl.DoctorImpl#getView_pred <em>View pred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoctorImpl extends MinimalEObjectImpl.Container implements Doctor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getClinic_timings() <em>Clinic timings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinic_timings()
	 * @generated
	 * @ordered
	 */
	protected static final String CLINIC_TIMINGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClinic_timings() <em>Clinic timings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinic_timings()
	 * @generated
	 * @ordered
	 */
	protected String clinic_timings = CLINIC_TIMINGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone_no() <em>Phone no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_no()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhone_no() <em>Phone no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_no()
	 * @generated
	 * @ordered
	 */
	protected int phone_no = PHONE_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecalization() <em>Specalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecalization()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecalization() <em>Specalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecalization()
	 * @generated
	 * @ordered
	 */
	protected String specalization = SPECALIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected EList<Patient> patient;

	/**
	 * The cached value of the '{@link #getRecommend_med() <em>Recommend med</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommend_med()
	 * @generated
	 * @ordered
	 */
	protected EList<Medicines> recommend_med;

	/**
	 * The cached value of the '{@link #getView_pred() <em>View pred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView_pred()
	 * @generated
	 * @ordered
	 */
	protected DiabetesPrediction view_pred;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.DOCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.DOCTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.DOCTOR__ADDRESS, oldAddress,
					address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClinic_timings() {
		return clinic_timings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClinic_timings(String newClinic_timings) {
		String oldClinic_timings = clinic_timings;
		clinic_timings = newClinic_timings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.DOCTOR__CLINIC_TIMINGS,
					oldClinic_timings, clinic_timings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPhone_no() {
		return phone_no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhone_no(int newPhone_no) {
		int oldPhone_no = phone_no;
		phone_no = newPhone_no;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.DOCTOR__PHONE_NO, oldPhone_no,
					phone_no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecalization() {
		return specalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecalization(String newSpecalization) {
		String oldSpecalization = specalization;
		specalization = newSpecalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.DOCTOR__SPECALIZATION,
					oldSpecalization, specalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Patient> getPatient() {
		if (patient == null) {
			patient = new EObjectWithInverseResolvingEList.ManyInverse<Patient>(Patient.class, this,
					Ssda_researchPackage.DOCTOR__PATIENT, Ssda_researchPackage.PATIENT__DOCTOR);
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Medicines> getRecommend_med() {
		if (recommend_med == null) {
			recommend_med = new EObjectResolvingEList<Medicines>(Medicines.class, this,
					Ssda_researchPackage.DOCTOR__RECOMMEND_MED);
		}
		return recommend_med;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiabetesPrediction getView_pred() {
		if (view_pred != null && view_pred.eIsProxy()) {
			InternalEObject oldView_pred = (InternalEObject) view_pred;
			view_pred = (DiabetesPrediction) eResolveProxy(oldView_pred);
			if (view_pred != oldView_pred) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ssda_researchPackage.DOCTOR__VIEW_PRED,
							oldView_pred, view_pred));
			}
		}
		return view_pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiabetesPrediction basicGetView_pred() {
		return view_pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setView_pred(DiabetesPrediction newView_pred) {
		DiabetesPrediction oldView_pred = view_pred;
		view_pred = newView_pred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.DOCTOR__VIEW_PRED, oldView_pred,
					view_pred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ssda_researchPackage.DOCTOR__PATIENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPatient()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ssda_researchPackage.DOCTOR__PATIENT:
			return ((InternalEList<?>) getPatient()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.DOCTOR__NAME:
			return getName();
		case Ssda_researchPackage.DOCTOR__ADDRESS:
			return getAddress();
		case Ssda_researchPackage.DOCTOR__CLINIC_TIMINGS:
			return getClinic_timings();
		case Ssda_researchPackage.DOCTOR__PHONE_NO:
			return getPhone_no();
		case Ssda_researchPackage.DOCTOR__SPECALIZATION:
			return getSpecalization();
		case Ssda_researchPackage.DOCTOR__PATIENT:
			return getPatient();
		case Ssda_researchPackage.DOCTOR__RECOMMEND_MED:
			return getRecommend_med();
		case Ssda_researchPackage.DOCTOR__VIEW_PRED:
			if (resolve)
				return getView_pred();
			return basicGetView_pred();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Ssda_researchPackage.DOCTOR__NAME:
			setName((String) newValue);
			return;
		case Ssda_researchPackage.DOCTOR__ADDRESS:
			setAddress((String) newValue);
			return;
		case Ssda_researchPackage.DOCTOR__CLINIC_TIMINGS:
			setClinic_timings((String) newValue);
			return;
		case Ssda_researchPackage.DOCTOR__PHONE_NO:
			setPhone_no((Integer) newValue);
			return;
		case Ssda_researchPackage.DOCTOR__SPECALIZATION:
			setSpecalization((String) newValue);
			return;
		case Ssda_researchPackage.DOCTOR__PATIENT:
			getPatient().clear();
			getPatient().addAll((Collection<? extends Patient>) newValue);
			return;
		case Ssda_researchPackage.DOCTOR__RECOMMEND_MED:
			getRecommend_med().clear();
			getRecommend_med().addAll((Collection<? extends Medicines>) newValue);
			return;
		case Ssda_researchPackage.DOCTOR__VIEW_PRED:
			setView_pred((DiabetesPrediction) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Ssda_researchPackage.DOCTOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Ssda_researchPackage.DOCTOR__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case Ssda_researchPackage.DOCTOR__CLINIC_TIMINGS:
			setClinic_timings(CLINIC_TIMINGS_EDEFAULT);
			return;
		case Ssda_researchPackage.DOCTOR__PHONE_NO:
			setPhone_no(PHONE_NO_EDEFAULT);
			return;
		case Ssda_researchPackage.DOCTOR__SPECALIZATION:
			setSpecalization(SPECALIZATION_EDEFAULT);
			return;
		case Ssda_researchPackage.DOCTOR__PATIENT:
			getPatient().clear();
			return;
		case Ssda_researchPackage.DOCTOR__RECOMMEND_MED:
			getRecommend_med().clear();
			return;
		case Ssda_researchPackage.DOCTOR__VIEW_PRED:
			setView_pred((DiabetesPrediction) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Ssda_researchPackage.DOCTOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Ssda_researchPackage.DOCTOR__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case Ssda_researchPackage.DOCTOR__CLINIC_TIMINGS:
			return CLINIC_TIMINGS_EDEFAULT == null ? clinic_timings != null
					: !CLINIC_TIMINGS_EDEFAULT.equals(clinic_timings);
		case Ssda_researchPackage.DOCTOR__PHONE_NO:
			return phone_no != PHONE_NO_EDEFAULT;
		case Ssda_researchPackage.DOCTOR__SPECALIZATION:
			return SPECALIZATION_EDEFAULT == null ? specalization != null
					: !SPECALIZATION_EDEFAULT.equals(specalization);
		case Ssda_researchPackage.DOCTOR__PATIENT:
			return patient != null && !patient.isEmpty();
		case Ssda_researchPackage.DOCTOR__RECOMMEND_MED:
			return recommend_med != null && !recommend_med.isEmpty();
		case Ssda_researchPackage.DOCTOR__VIEW_PRED:
			return view_pred != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(", clinic_timings: ");
		result.append(clinic_timings);
		result.append(", phone_no: ");
		result.append(phone_no);
		result.append(", specalization: ");
		result.append(specalization);
		result.append(')');
		return result.toString();
	}

} //DoctorImpl
