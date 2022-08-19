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
import ssda_research.Symptoms;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.PatientImpl#getName <em>Name</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getBmi <em>Bmi</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getActivity_level <em>Activity level</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getPatient_type <em>Patient type</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getAge <em>Age</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getOther_diseases <em>Other diseases</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getSymp <em>Symp</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getMed <em>Med</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getDoctor <em>Doctor</em>}</li>
 *   <li>{@link ssda_research.impl.PatientImpl#getView_pred <em>View pred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends MinimalEObjectImpl.Container implements Patient {
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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected String weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBmi() <em>Bmi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmi()
	 * @generated
	 * @ordered
	 */
	protected static final String BMI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBmi() <em>Bmi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmi()
	 * @generated
	 * @ordered
	 */
	protected String bmi = BMI_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivity_level() <em>Activity level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_level()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivity_level() <em>Activity level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_level()
	 * @generated
	 * @ordered
	 */
	protected String activity_level = ACTIVITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final String GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected String gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatient_type() <em>Patient type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient_type()
	 * @generated
	 * @ordered
	 */
	protected static final String PATIENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatient_type() <em>Patient type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient_type()
	 * @generated
	 * @ordered
	 */
	protected String patient_type = PATIENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final String AGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected String age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOther_diseases() <em>Other diseases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther_diseases()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DISEASES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOther_diseases() <em>Other diseases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther_diseases()
	 * @generated
	 * @ordered
	 */
	protected String other_diseases = OTHER_DISEASES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSymp() <em>Symp</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymp()
	 * @generated
	 * @ordered
	 */
	protected EList<Symptoms> symp;

	/**
	 * The cached value of the '{@link #getMed() <em>Med</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMed()
	 * @generated
	 * @ordered
	 */
	protected EList<Medicines> med;

	/**
	 * The cached value of the '{@link #getDoctor() <em>Doctor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctor()
	 * @generated
	 * @ordered
	 */
	protected EList<Doctor> doctor;

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
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.PATIENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.PATIENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.PATIENT__HEIGHT, oldHeight,
					height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(String newWeight) {
		String oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.PATIENT__WEIGHT, oldWeight,
					weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBmi() {
		return bmi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBmi(String newBmi) {
		String oldBmi = bmi;
		bmi = newBmi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.PATIENT__BMI, oldBmi, bmi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivity_level() {
		return activity_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity_level(String newActivity_level) {
		String oldActivity_level = activity_level;
		activity_level = newActivity_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.PATIENT__ACTIVITY_LEVEL,
					oldActivity_level, activity_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(String newGender) {
		String oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.PATIENT__GENDER, oldGender,
					gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatient_type() {
		return patient_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatient_type(String newPatient_type) {
		String oldPatient_type = patient_type;
		patient_type = newPatient_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.PATIENT__PATIENT_TYPE,
					oldPatient_type, patient_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(String newAge) {
		String oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.PATIENT__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOther_diseases() {
		return other_diseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOther_diseases(String newOther_diseases) {
		String oldOther_diseases = other_diseases;
		other_diseases = newOther_diseases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.PATIENT__OTHER_DISEASES,
					oldOther_diseases, other_diseases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Symptoms> getSymp() {
		if (symp == null) {
			symp = new EObjectResolvingEList<Symptoms>(Symptoms.class, this, Ssda_researchPackage.PATIENT__SYMP);
		}
		return symp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Medicines> getMed() {
		if (med == null) {
			med = new EObjectResolvingEList<Medicines>(Medicines.class, this, Ssda_researchPackage.PATIENT__MED);
		}
		return med;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Doctor> getDoctor() {
		if (doctor == null) {
			doctor = new EObjectWithInverseResolvingEList.ManyInverse<Doctor>(Doctor.class, this,
					Ssda_researchPackage.PATIENT__DOCTOR, Ssda_researchPackage.DOCTOR__PATIENT);
		}
		return doctor;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ssda_researchPackage.PATIENT__VIEW_PRED,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.PATIENT__VIEW_PRED, oldView_pred,
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
		case Ssda_researchPackage.PATIENT__DOCTOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDoctor()).basicAdd(otherEnd, msgs);
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
		case Ssda_researchPackage.PATIENT__DOCTOR:
			return ((InternalEList<?>) getDoctor()).basicRemove(otherEnd, msgs);
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
		case Ssda_researchPackage.PATIENT__NAME:
			return getName();
		case Ssda_researchPackage.PATIENT__HEIGHT:
			return getHeight();
		case Ssda_researchPackage.PATIENT__WEIGHT:
			return getWeight();
		case Ssda_researchPackage.PATIENT__BMI:
			return getBmi();
		case Ssda_researchPackage.PATIENT__ACTIVITY_LEVEL:
			return getActivity_level();
		case Ssda_researchPackage.PATIENT__GENDER:
			return getGender();
		case Ssda_researchPackage.PATIENT__PATIENT_TYPE:
			return getPatient_type();
		case Ssda_researchPackage.PATIENT__AGE:
			return getAge();
		case Ssda_researchPackage.PATIENT__OTHER_DISEASES:
			return getOther_diseases();
		case Ssda_researchPackage.PATIENT__SYMP:
			return getSymp();
		case Ssda_researchPackage.PATIENT__MED:
			return getMed();
		case Ssda_researchPackage.PATIENT__DOCTOR:
			return getDoctor();
		case Ssda_researchPackage.PATIENT__VIEW_PRED:
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
		case Ssda_researchPackage.PATIENT__NAME:
			setName((String) newValue);
			return;
		case Ssda_researchPackage.PATIENT__HEIGHT:
			setHeight((String) newValue);
			return;
		case Ssda_researchPackage.PATIENT__WEIGHT:
			setWeight((String) newValue);
			return;
		case Ssda_researchPackage.PATIENT__BMI:
			setBmi((String) newValue);
			return;
		case Ssda_researchPackage.PATIENT__ACTIVITY_LEVEL:
			setActivity_level((String) newValue);
			return;
		case Ssda_researchPackage.PATIENT__GENDER:
			setGender((String) newValue);
			return;
		case Ssda_researchPackage.PATIENT__PATIENT_TYPE:
			setPatient_type((String) newValue);
			return;
		case Ssda_researchPackage.PATIENT__AGE:
			setAge((String) newValue);
			return;
		case Ssda_researchPackage.PATIENT__OTHER_DISEASES:
			setOther_diseases((String) newValue);
			return;
		case Ssda_researchPackage.PATIENT__SYMP:
			getSymp().clear();
			getSymp().addAll((Collection<? extends Symptoms>) newValue);
			return;
		case Ssda_researchPackage.PATIENT__MED:
			getMed().clear();
			getMed().addAll((Collection<? extends Medicines>) newValue);
			return;
		case Ssda_researchPackage.PATIENT__DOCTOR:
			getDoctor().clear();
			getDoctor().addAll((Collection<? extends Doctor>) newValue);
			return;
		case Ssda_researchPackage.PATIENT__VIEW_PRED:
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
		case Ssda_researchPackage.PATIENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Ssda_researchPackage.PATIENT__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case Ssda_researchPackage.PATIENT__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case Ssda_researchPackage.PATIENT__BMI:
			setBmi(BMI_EDEFAULT);
			return;
		case Ssda_researchPackage.PATIENT__ACTIVITY_LEVEL:
			setActivity_level(ACTIVITY_LEVEL_EDEFAULT);
			return;
		case Ssda_researchPackage.PATIENT__GENDER:
			setGender(GENDER_EDEFAULT);
			return;
		case Ssda_researchPackage.PATIENT__PATIENT_TYPE:
			setPatient_type(PATIENT_TYPE_EDEFAULT);
			return;
		case Ssda_researchPackage.PATIENT__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case Ssda_researchPackage.PATIENT__OTHER_DISEASES:
			setOther_diseases(OTHER_DISEASES_EDEFAULT);
			return;
		case Ssda_researchPackage.PATIENT__SYMP:
			getSymp().clear();
			return;
		case Ssda_researchPackage.PATIENT__MED:
			getMed().clear();
			return;
		case Ssda_researchPackage.PATIENT__DOCTOR:
			getDoctor().clear();
			return;
		case Ssda_researchPackage.PATIENT__VIEW_PRED:
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
		case Ssda_researchPackage.PATIENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Ssda_researchPackage.PATIENT__HEIGHT:
			return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
		case Ssda_researchPackage.PATIENT__WEIGHT:
			return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
		case Ssda_researchPackage.PATIENT__BMI:
			return BMI_EDEFAULT == null ? bmi != null : !BMI_EDEFAULT.equals(bmi);
		case Ssda_researchPackage.PATIENT__ACTIVITY_LEVEL:
			return ACTIVITY_LEVEL_EDEFAULT == null ? activity_level != null
					: !ACTIVITY_LEVEL_EDEFAULT.equals(activity_level);
		case Ssda_researchPackage.PATIENT__GENDER:
			return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
		case Ssda_researchPackage.PATIENT__PATIENT_TYPE:
			return PATIENT_TYPE_EDEFAULT == null ? patient_type != null : !PATIENT_TYPE_EDEFAULT.equals(patient_type);
		case Ssda_researchPackage.PATIENT__AGE:
			return AGE_EDEFAULT == null ? age != null : !AGE_EDEFAULT.equals(age);
		case Ssda_researchPackage.PATIENT__OTHER_DISEASES:
			return OTHER_DISEASES_EDEFAULT == null ? other_diseases != null
					: !OTHER_DISEASES_EDEFAULT.equals(other_diseases);
		case Ssda_researchPackage.PATIENT__SYMP:
			return symp != null && !symp.isEmpty();
		case Ssda_researchPackage.PATIENT__MED:
			return med != null && !med.isEmpty();
		case Ssda_researchPackage.PATIENT__DOCTOR:
			return doctor != null && !doctor.isEmpty();
		case Ssda_researchPackage.PATIENT__VIEW_PRED:
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
		result.append(", height: ");
		result.append(height);
		result.append(", weight: ");
		result.append(weight);
		result.append(", bmi: ");
		result.append(bmi);
		result.append(", activity_level: ");
		result.append(activity_level);
		result.append(", gender: ");
		result.append(gender);
		result.append(", patient_type: ");
		result.append(patient_type);
		result.append(", age: ");
		result.append(age);
		result.append(", Other_diseases: ");
		result.append(other_diseases);
		result.append(')');
		return result.toString();
	}

} //PatientImpl
