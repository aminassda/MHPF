/**
 */
package ssda_research.impl;

import java.lang.reflect.InvocationTargetException;

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

import ssda_research.CrossValidation;
import ssda_research.Dataset;
import ssda_research.DiabetesPrediction;
import ssda_research.Splitted_dataset;
import ssda_research.Ssda_researchPackage;
import ssda_research.classifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>classifiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.classifiersImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link ssda_research.impl.classifiersImpl#getSplits <em>Splits</em>}</li>
 *   <li>{@link ssda_research.impl.classifiersImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link ssda_research.impl.classifiersImpl#getCv <em>Cv</em>}</li>
 *   <li>{@link ssda_research.impl.classifiersImpl#getRandom_state <em>Random state</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class classifiersImpl extends MinimalEObjectImpl.Container implements classifiers {
	/**
	 * The cached value of the '{@link #getPred() <em>Pred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPred()
	 * @generated
	 * @ordered
	 */
	protected DiabetesPrediction pred;

	/**
	 * The cached value of the '{@link #getSplits() <em>Splits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplits()
	 * @generated
	 * @ordered
	 */
	protected EList<Splitted_dataset> splits;

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
	 * The cached value of the '{@link #getCv() <em>Cv</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCv()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossValidation> cv;

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
	protected classifiersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.CLASSIFIERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiabetesPrediction getPred() {
		if (pred != null && pred.eIsProxy()) {
			InternalEObject oldPred = (InternalEObject) pred;
			pred = (DiabetesPrediction) eResolveProxy(oldPred);
			if (pred != oldPred) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ssda_researchPackage.CLASSIFIERS__PRED,
							oldPred, pred));
			}
		}
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiabetesPrediction basicGetPred() {
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPred(DiabetesPrediction newPred) {
		DiabetesPrediction oldPred = pred;
		pred = newPred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.CLASSIFIERS__PRED, oldPred,
					pred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Splitted_dataset> getSplits() {
		if (splits == null) {
			splits = new EObjectResolvingEList<Splitted_dataset>(Splitted_dataset.class, this,
					Ssda_researchPackage.CLASSIFIERS__SPLITS);
		}
		return splits;
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
					Ssda_researchPackage.CLASSIFIERS__DATASET);
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossValidation> getCv() {
		if (cv == null) {
			cv = new EObjectWithInverseResolvingEList.ManyInverse<CrossValidation>(CrossValidation.class, this,
					Ssda_researchPackage.CLASSIFIERS__CV, Ssda_researchPackage.CROSS_VALIDATION__CLASSIFIERS);
		}
		return cv;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.CLASSIFIERS__RANDOM_STATE,
					oldRandom_state, random_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void predict() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		case Ssda_researchPackage.CLASSIFIERS__CV:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCv()).basicAdd(otherEnd, msgs);
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
		case Ssda_researchPackage.CLASSIFIERS__CV:
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
		case Ssda_researchPackage.CLASSIFIERS__PRED:
			if (resolve)
				return getPred();
			return basicGetPred();
		case Ssda_researchPackage.CLASSIFIERS__SPLITS:
			return getSplits();
		case Ssda_researchPackage.CLASSIFIERS__DATASET:
			return getDataset();
		case Ssda_researchPackage.CLASSIFIERS__CV:
			return getCv();
		case Ssda_researchPackage.CLASSIFIERS__RANDOM_STATE:
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
		case Ssda_researchPackage.CLASSIFIERS__PRED:
			setPred((DiabetesPrediction) newValue);
			return;
		case Ssda_researchPackage.CLASSIFIERS__SPLITS:
			getSplits().clear();
			getSplits().addAll((Collection<? extends Splitted_dataset>) newValue);
			return;
		case Ssda_researchPackage.CLASSIFIERS__DATASET:
			getDataset().clear();
			getDataset().addAll((Collection<? extends Dataset>) newValue);
			return;
		case Ssda_researchPackage.CLASSIFIERS__CV:
			getCv().clear();
			getCv().addAll((Collection<? extends CrossValidation>) newValue);
			return;
		case Ssda_researchPackage.CLASSIFIERS__RANDOM_STATE:
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
		case Ssda_researchPackage.CLASSIFIERS__PRED:
			setPred((DiabetesPrediction) null);
			return;
		case Ssda_researchPackage.CLASSIFIERS__SPLITS:
			getSplits().clear();
			return;
		case Ssda_researchPackage.CLASSIFIERS__DATASET:
			getDataset().clear();
			return;
		case Ssda_researchPackage.CLASSIFIERS__CV:
			getCv().clear();
			return;
		case Ssda_researchPackage.CLASSIFIERS__RANDOM_STATE:
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
		case Ssda_researchPackage.CLASSIFIERS__PRED:
			return pred != null;
		case Ssda_researchPackage.CLASSIFIERS__SPLITS:
			return splits != null && !splits.isEmpty();
		case Ssda_researchPackage.CLASSIFIERS__DATASET:
			return dataset != null && !dataset.isEmpty();
		case Ssda_researchPackage.CLASSIFIERS__CV:
			return cv != null && !cv.isEmpty();
		case Ssda_researchPackage.CLASSIFIERS__RANDOM_STATE:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Ssda_researchPackage.CLASSIFIERS___FIT:
			fit();
			return null;
		case Ssda_researchPackage.CLASSIFIERS___PREDICT:
			predict();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (random_state: ");
		result.append(random_state);
		result.append(')');
		return result.toString();
	}

} //classifiersImpl
