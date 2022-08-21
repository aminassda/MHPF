/**
 */
package ssda_research.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ssda_research.CrossValidation;
import ssda_research.Data_Preprocessing;
import ssda_research.Dataset;
import ssda_research.DiabetesPrediction;
import ssda_research.DiabeticRecommendationSystem;
import ssda_research.Doctor;
import ssda_research.Drug;
import ssda_research.ExploratoryDataAnalysis;
import ssda_research.ModelOptimization;
import ssda_research.Patient;
import ssda_research.Ssda_researchPackage;
import ssda_research.Symptoms;
import ssda_research.classifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diabetic Recommendation System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.DiabeticRecommendationSystemImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link ssda_research.impl.DiabeticRecommendationSystemImpl#getSymp <em>Symp</em>}</li>
 *   <li>{@link ssda_research.impl.DiabeticRecommendationSystemImpl#getDrug <em>Drug</em>}</li>
 *   <li>{@link ssda_research.impl.DiabeticRecommendationSystemImpl#getDoctor <em>Doctor</em>}</li>
 *   <li>{@link ssda_research.impl.DiabeticRecommendationSystemImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link ssda_research.impl.DiabeticRecommendationSystemImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link ssda_research.impl.DiabeticRecommendationSystemImpl#getEda <em>Eda</em>}</li>
 *   <li>{@link ssda_research.impl.DiabeticRecommendationSystemImpl#getDpreprocess <em>Dpreprocess</em>}</li>
 *   <li>{@link ssda_research.impl.DiabeticRecommendationSystemImpl#getModel_op <em>Model op</em>}</li>
 *   <li>{@link ssda_research.impl.DiabeticRecommendationSystemImpl#getEstimators <em>Estimators</em>}</li>
 *   <li>{@link ssda_research.impl.DiabeticRecommendationSystemImpl#getCv <em>Cv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiabeticRecommendationSystemImpl extends MinimalEObjectImpl.Container
		implements DiabeticRecommendationSystem {
	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected EList<Patient> patient;

	/**
	 * The cached value of the '{@link #getSymp() <em>Symp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymp()
	 * @generated
	 * @ordered
	 */
	protected EList<Symptoms> symp;

	/**
	 * The cached value of the '{@link #getDrug() <em>Drug</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrug()
	 * @generated
	 * @ordered
	 */
	protected EList<Drug> drug;

	/**
	 * The cached value of the '{@link #getDoctor() <em>Doctor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctor()
	 * @generated
	 * @ordered
	 */
	protected EList<Doctor> doctor;

	/**
	 * The cached value of the '{@link #getPred() <em>Pred</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPred()
	 * @generated
	 * @ordered
	 */
	protected EList<DiabetesPrediction> pred;

	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> dataset;

	/**
	 * The cached value of the '{@link #getEda() <em>Eda</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEda()
	 * @generated
	 * @ordered
	 */
	protected EList<ExploratoryDataAnalysis> eda;

	/**
	 * The cached value of the '{@link #getDpreprocess() <em>Dpreprocess</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpreprocess()
	 * @generated
	 * @ordered
	 */
	protected EList<Data_Preprocessing> dpreprocess;

	/**
	 * The cached value of the '{@link #getModel_op() <em>Model op</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel_op()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelOptimization> model_op;

	/**
	 * The cached value of the '{@link #getEstimators() <em>Estimators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimators()
	 * @generated
	 * @ordered
	 */
	protected EList<classifiers> estimators;

	/**
	 * The cached value of the '{@link #getCv() <em>Cv</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCv()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossValidation> cv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiabeticRecommendationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.DIABETIC_RECOMMENDATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Patient> getPatient() {
		if (patient == null) {
			patient = new EObjectContainmentEList<Patient>(Patient.class, this,
					Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PATIENT);
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Symptoms> getSymp() {
		if (symp == null) {
			symp = new EObjectContainmentEList<Symptoms>(Symptoms.class, this,
					Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__SYMP);
		}
		return symp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Drug> getDrug() {
		if (drug == null) {
			drug = new EObjectContainmentEList<Drug>(Drug.class, this,
					Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DRUG);
		}
		return drug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Doctor> getDoctor() {
		if (doctor == null) {
			doctor = new EObjectContainmentEList<Doctor>(Doctor.class, this,
					Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR);
		}
		return doctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiabetesPrediction> getPred() {
		if (pred == null) {
			pred = new EObjectContainmentEList<DiabetesPrediction>(DiabetesPrediction.class, this,
					Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PRED);
		}
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dataset> getDataset() {
		if (dataset == null) {
			dataset = new EObjectContainmentEList<Dataset>(Dataset.class, this,
					Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DATASET);
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExploratoryDataAnalysis> getEda() {
		if (eda == null) {
			eda = new EObjectContainmentEList<ExploratoryDataAnalysis>(ExploratoryDataAnalysis.class, this,
					Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__EDA);
		}
		return eda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data_Preprocessing> getDpreprocess() {
		if (dpreprocess == null) {
			dpreprocess = new EObjectContainmentEList<Data_Preprocessing>(Data_Preprocessing.class, this,
					Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS);
		}
		return dpreprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelOptimization> getModel_op() {
		if (model_op == null) {
			model_op = new EObjectContainmentEList<ModelOptimization>(ModelOptimization.class, this,
					Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP);
		}
		return model_op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<classifiers> getEstimators() {
		if (estimators == null) {
			estimators = new EObjectContainmentEList<classifiers>(classifiers.class, this,
					Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS);
		}
		return estimators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossValidation> getCv() {
		if (cv == null) {
			cv = new EObjectContainmentEList<CrossValidation>(CrossValidation.class, this,
					Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__CV);
		}
		return cv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PATIENT:
			return ((InternalEList<?>) getPatient()).basicRemove(otherEnd, msgs);
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__SYMP:
			return ((InternalEList<?>) getSymp()).basicRemove(otherEnd, msgs);
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DRUG:
			return ((InternalEList<?>) getDrug()).basicRemove(otherEnd, msgs);
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR:
			return ((InternalEList<?>) getDoctor()).basicRemove(otherEnd, msgs);
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PRED:
			return ((InternalEList<?>) getPred()).basicRemove(otherEnd, msgs);
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DATASET:
			return ((InternalEList<?>) getDataset()).basicRemove(otherEnd, msgs);
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__EDA:
			return ((InternalEList<?>) getEda()).basicRemove(otherEnd, msgs);
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS:
			return ((InternalEList<?>) getDpreprocess()).basicRemove(otherEnd, msgs);
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP:
			return ((InternalEList<?>) getModel_op()).basicRemove(otherEnd, msgs);
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS:
			return ((InternalEList<?>) getEstimators()).basicRemove(otherEnd, msgs);
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__CV:
			return ((InternalEList<?>) getCv()).basicRemove(otherEnd, msgs);
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
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PATIENT:
			return getPatient();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__SYMP:
			return getSymp();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DRUG:
			return getDrug();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR:
			return getDoctor();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PRED:
			return getPred();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DATASET:
			return getDataset();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__EDA:
			return getEda();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS:
			return getDpreprocess();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP:
			return getModel_op();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS:
			return getEstimators();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__CV:
			return getCv();
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
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PATIENT:
			getPatient().clear();
			getPatient().addAll((Collection<? extends Patient>) newValue);
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__SYMP:
			getSymp().clear();
			getSymp().addAll((Collection<? extends Symptoms>) newValue);
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DRUG:
			getDrug().clear();
			getDrug().addAll((Collection<? extends Drug>) newValue);
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR:
			getDoctor().clear();
			getDoctor().addAll((Collection<? extends Doctor>) newValue);
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PRED:
			getPred().clear();
			getPred().addAll((Collection<? extends DiabetesPrediction>) newValue);
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DATASET:
			getDataset().clear();
			getDataset().addAll((Collection<? extends Dataset>) newValue);
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__EDA:
			getEda().clear();
			getEda().addAll((Collection<? extends ExploratoryDataAnalysis>) newValue);
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS:
			getDpreprocess().clear();
			getDpreprocess().addAll((Collection<? extends Data_Preprocessing>) newValue);
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP:
			getModel_op().clear();
			getModel_op().addAll((Collection<? extends ModelOptimization>) newValue);
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS:
			getEstimators().clear();
			getEstimators().addAll((Collection<? extends classifiers>) newValue);
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__CV:
			getCv().clear();
			getCv().addAll((Collection<? extends CrossValidation>) newValue);
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
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PATIENT:
			getPatient().clear();
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__SYMP:
			getSymp().clear();
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DRUG:
			getDrug().clear();
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR:
			getDoctor().clear();
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PRED:
			getPred().clear();
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DATASET:
			getDataset().clear();
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__EDA:
			getEda().clear();
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS:
			getDpreprocess().clear();
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP:
			getModel_op().clear();
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS:
			getEstimators().clear();
			return;
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__CV:
			getCv().clear();
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
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PATIENT:
			return patient != null && !patient.isEmpty();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__SYMP:
			return symp != null && !symp.isEmpty();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DRUG:
			return drug != null && !drug.isEmpty();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DOCTOR:
			return doctor != null && !doctor.isEmpty();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__PRED:
			return pred != null && !pred.isEmpty();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DATASET:
			return dataset != null && !dataset.isEmpty();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__EDA:
			return eda != null && !eda.isEmpty();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__DPREPROCESS:
			return dpreprocess != null && !dpreprocess.isEmpty();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__MODEL_OP:
			return model_op != null && !model_op.isEmpty();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__ESTIMATORS:
			return estimators != null && !estimators.isEmpty();
		case Ssda_researchPackage.DIABETIC_RECOMMENDATION_SYSTEM__CV:
			return cv != null && !cv.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiabeticRecommendationSystemImpl
