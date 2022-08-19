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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ssda_research.CrossValidation;
import ssda_research.Dataset;
import ssda_research.Preprocessed_data;
import ssda_research.Splitted_dataset;
import ssda_research.Ssda_researchPackage;
import ssda_research.classifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Validation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.CrossValidationImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link ssda_research.impl.CrossValidationImpl#getSplits <em>Splits</em>}</li>
 *   <li>{@link ssda_research.impl.CrossValidationImpl#getAccess_p_data <em>Access pdata</em>}</li>
 *   <li>{@link ssda_research.impl.CrossValidationImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link ssda_research.impl.CrossValidationImpl#isShuffle <em>Shuffle</em>}</li>
 *   <li>{@link ssda_research.impl.CrossValidationImpl#getRandom_state <em>Random state</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CrossValidationImpl extends MinimalEObjectImpl.Container implements CrossValidation {
	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> dataset;

	/**
	 * The cached value of the '{@link #getSplits() <em>Splits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplits()
	 * @generated
	 * @ordered
	 */
	protected EList<Splitted_dataset> splits;

	/**
	 * The cached value of the '{@link #getAccess_p_data() <em>Access pdata</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_p_data()
	 * @generated
	 * @ordered
	 */
	protected EList<Preprocessed_data> access_p_data;

	/**
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<classifiers> classifiers;

	/**
	 * The default value of the '{@link #isShuffle() <em>Shuffle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShuffle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHUFFLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShuffle() <em>Shuffle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShuffle()
	 * @generated
	 * @ordered
	 */
	protected boolean shuffle = SHUFFLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRandom_state() <em>Random state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandom_state()
	 * @generated
	 * @ordered
	 */
	protected static final String RANDOM_STATE_EDEFAULT = "None";

	/**
	 * The cached value of the '{@link #getRandom_state() <em>Random state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandom_state()
	 * @generated
	 * @ordered
	 */
	protected String random_state = RANDOM_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossValidationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.CROSS_VALIDATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dataset> getDataset() {
		if (dataset == null) {
			dataset = new EObjectResolvingEList<Dataset>(Dataset.class, this,
					Ssda_researchPackage.CROSS_VALIDATION__DATASET);
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Splitted_dataset> getSplits() {
		if (splits == null) {
			splits = new EObjectContainmentEList<Splitted_dataset>(Splitted_dataset.class, this,
					Ssda_researchPackage.CROSS_VALIDATION__SPLITS);
		}
		return splits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Preprocessed_data> getAccess_p_data() {
		if (access_p_data == null) {
			access_p_data = new EObjectResolvingEList<Preprocessed_data>(Preprocessed_data.class, this,
					Ssda_researchPackage.CROSS_VALIDATION__ACCESS_PDATA);
		}
		return access_p_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<classifiers> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectWithInverseResolvingEList.ManyInverse<classifiers>(classifiers.class, this,
					Ssda_researchPackage.CROSS_VALIDATION__CLASSIFIERS, Ssda_researchPackage.CLASSIFIERS__CV);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShuffle() {
		return shuffle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShuffle(boolean newShuffle) {
		boolean oldShuffle = shuffle;
		shuffle = newShuffle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.CROSS_VALIDATION__SHUFFLE,
					oldShuffle, shuffle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRandom_state() {
		return random_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRandom_state(String newRandom_state) {
		String oldRandom_state = random_state;
		random_state = newRandom_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.CROSS_VALIDATION__RANDOM_STATE,
					oldRandom_state, random_state));
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
		case Ssda_researchPackage.CROSS_VALIDATION__CLASSIFIERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getClassifiers()).basicAdd(otherEnd, msgs);
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
		case Ssda_researchPackage.CROSS_VALIDATION__SPLITS:
			return ((InternalEList<?>) getSplits()).basicRemove(otherEnd, msgs);
		case Ssda_researchPackage.CROSS_VALIDATION__CLASSIFIERS:
			return ((InternalEList<?>) getClassifiers()).basicRemove(otherEnd, msgs);
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
		case Ssda_researchPackage.CROSS_VALIDATION__DATASET:
			return getDataset();
		case Ssda_researchPackage.CROSS_VALIDATION__SPLITS:
			return getSplits();
		case Ssda_researchPackage.CROSS_VALIDATION__ACCESS_PDATA:
			return getAccess_p_data();
		case Ssda_researchPackage.CROSS_VALIDATION__CLASSIFIERS:
			return getClassifiers();
		case Ssda_researchPackage.CROSS_VALIDATION__SHUFFLE:
			return isShuffle();
		case Ssda_researchPackage.CROSS_VALIDATION__RANDOM_STATE:
			return getRandom_state();
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
		case Ssda_researchPackage.CROSS_VALIDATION__DATASET:
			getDataset().clear();
			getDataset().addAll((Collection<? extends Dataset>) newValue);
			return;
		case Ssda_researchPackage.CROSS_VALIDATION__SPLITS:
			getSplits().clear();
			getSplits().addAll((Collection<? extends Splitted_dataset>) newValue);
			return;
		case Ssda_researchPackage.CROSS_VALIDATION__ACCESS_PDATA:
			getAccess_p_data().clear();
			getAccess_p_data().addAll((Collection<? extends Preprocessed_data>) newValue);
			return;
		case Ssda_researchPackage.CROSS_VALIDATION__CLASSIFIERS:
			getClassifiers().clear();
			getClassifiers().addAll((Collection<? extends classifiers>) newValue);
			return;
		case Ssda_researchPackage.CROSS_VALIDATION__SHUFFLE:
			setShuffle((Boolean) newValue);
			return;
		case Ssda_researchPackage.CROSS_VALIDATION__RANDOM_STATE:
			setRandom_state((String) newValue);
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
		case Ssda_researchPackage.CROSS_VALIDATION__DATASET:
			getDataset().clear();
			return;
		case Ssda_researchPackage.CROSS_VALIDATION__SPLITS:
			getSplits().clear();
			return;
		case Ssda_researchPackage.CROSS_VALIDATION__ACCESS_PDATA:
			getAccess_p_data().clear();
			return;
		case Ssda_researchPackage.CROSS_VALIDATION__CLASSIFIERS:
			getClassifiers().clear();
			return;
		case Ssda_researchPackage.CROSS_VALIDATION__SHUFFLE:
			setShuffle(SHUFFLE_EDEFAULT);
			return;
		case Ssda_researchPackage.CROSS_VALIDATION__RANDOM_STATE:
			setRandom_state(RANDOM_STATE_EDEFAULT);
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
		case Ssda_researchPackage.CROSS_VALIDATION__DATASET:
			return dataset != null && !dataset.isEmpty();
		case Ssda_researchPackage.CROSS_VALIDATION__SPLITS:
			return splits != null && !splits.isEmpty();
		case Ssda_researchPackage.CROSS_VALIDATION__ACCESS_PDATA:
			return access_p_data != null && !access_p_data.isEmpty();
		case Ssda_researchPackage.CROSS_VALIDATION__CLASSIFIERS:
			return classifiers != null && !classifiers.isEmpty();
		case Ssda_researchPackage.CROSS_VALIDATION__SHUFFLE:
			return shuffle != SHUFFLE_EDEFAULT;
		case Ssda_researchPackage.CROSS_VALIDATION__RANDOM_STATE:
			return RANDOM_STATE_EDEFAULT == null ? random_state != null : !RANDOM_STATE_EDEFAULT.equals(random_state);
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
		result.append(" (shuffle: ");
		result.append(shuffle);
		result.append(", random_state: ");
		result.append(random_state);
		result.append(')');
		return result.toString();
	}

} //CrossValidationImpl
