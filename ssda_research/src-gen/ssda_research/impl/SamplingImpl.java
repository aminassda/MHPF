/**
 */
package ssda_research.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.Sampling;
import ssda_research.Sampling_strategy;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sampling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.SamplingImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link ssda_research.impl.SamplingImpl#getRandom_state <em>Random state</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SamplingImpl extends Data_PreprocessingImpl implements Sampling {
	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final Sampling_strategy STRATEGY_EDEFAULT = Sampling_strategy.MINORITY;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected Sampling_strategy strategy = STRATEGY_EDEFAULT;

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
	protected SamplingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.SAMPLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sampling_strategy getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrategy(Sampling_strategy newStrategy) {
		Sampling_strategy oldStrategy = strategy;
		strategy = newStrategy == null ? STRATEGY_EDEFAULT : newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.SAMPLING__STRATEGY, oldStrategy,
					strategy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.SAMPLING__RANDOM_STATE,
					oldRandom_state, random_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fit_resample() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.SAMPLING__STRATEGY:
			return getStrategy();
		case Ssda_researchPackage.SAMPLING__RANDOM_STATE:
			return getRandom_state();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Ssda_researchPackage.SAMPLING__STRATEGY:
			setStrategy((Sampling_strategy) newValue);
			return;
		case Ssda_researchPackage.SAMPLING__RANDOM_STATE:
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
		case Ssda_researchPackage.SAMPLING__STRATEGY:
			setStrategy(STRATEGY_EDEFAULT);
			return;
		case Ssda_researchPackage.SAMPLING__RANDOM_STATE:
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
		case Ssda_researchPackage.SAMPLING__STRATEGY:
			return strategy != STRATEGY_EDEFAULT;
		case Ssda_researchPackage.SAMPLING__RANDOM_STATE:
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
		case Ssda_researchPackage.SAMPLING___FIT_RESAMPLE:
			fit_resample();
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
		result.append(" (strategy: ");
		result.append(strategy);
		result.append(", random_state: ");
		result.append(random_state);
		result.append(')');
		return result.toString();
	}

} //SamplingImpl
