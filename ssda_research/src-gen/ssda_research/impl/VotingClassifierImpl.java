/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.Ssda_researchPackage;
import ssda_research.VotingClassifier;
import ssda_research.Voting_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voting Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.VotingClassifierImpl#getVoting <em>Voting</em>}</li>
 *   <li>{@link ssda_research.impl.VotingClassifierImpl#getWeights <em>Weights</em>}</li>
 *   <li>{@link ssda_research.impl.VotingClassifierImpl#getEstimators <em>Estimators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VotingClassifierImpl extends classifiersImpl implements VotingClassifier {
	/**
	 * The default value of the '{@link #getVoting() <em>Voting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoting()
	 * @generated
	 * @ordered
	 */
	protected static final Voting_type VOTING_EDEFAULT = Voting_type.HARD;

	/**
	 * The cached value of the '{@link #getVoting() <em>Voting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoting()
	 * @generated
	 * @ordered
	 */
	protected Voting_type voting = VOTING_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeights() <em>Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeights()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeights() <em>Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeights()
	 * @generated
	 * @ordered
	 */
	protected String weights = WEIGHTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimators() <em>Estimators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimators()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTIMATORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimators() <em>Estimators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimators()
	 * @generated
	 * @ordered
	 */
	protected String estimators = ESTIMATORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VotingClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.VOTING_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Voting_type getVoting() {
		return voting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoting(Voting_type newVoting) {
		Voting_type oldVoting = voting;
		voting = newVoting == null ? VOTING_EDEFAULT : newVoting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.VOTING_CLASSIFIER__VOTING,
					oldVoting, voting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeights() {
		return weights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeights(String newWeights) {
		String oldWeights = weights;
		weights = newWeights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.VOTING_CLASSIFIER__WEIGHTS,
					oldWeights, weights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEstimators() {
		return estimators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimators(String newEstimators) {
		String oldEstimators = estimators;
		estimators = newEstimators;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.VOTING_CLASSIFIER__ESTIMATORS,
					oldEstimators, estimators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.VOTING_CLASSIFIER__VOTING:
			return getVoting();
		case Ssda_researchPackage.VOTING_CLASSIFIER__WEIGHTS:
			return getWeights();
		case Ssda_researchPackage.VOTING_CLASSIFIER__ESTIMATORS:
			return getEstimators();
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
		case Ssda_researchPackage.VOTING_CLASSIFIER__VOTING:
			setVoting((Voting_type) newValue);
			return;
		case Ssda_researchPackage.VOTING_CLASSIFIER__WEIGHTS:
			setWeights((String) newValue);
			return;
		case Ssda_researchPackage.VOTING_CLASSIFIER__ESTIMATORS:
			setEstimators((String) newValue);
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
		case Ssda_researchPackage.VOTING_CLASSIFIER__VOTING:
			setVoting(VOTING_EDEFAULT);
			return;
		case Ssda_researchPackage.VOTING_CLASSIFIER__WEIGHTS:
			setWeights(WEIGHTS_EDEFAULT);
			return;
		case Ssda_researchPackage.VOTING_CLASSIFIER__ESTIMATORS:
			setEstimators(ESTIMATORS_EDEFAULT);
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
		case Ssda_researchPackage.VOTING_CLASSIFIER__VOTING:
			return voting != VOTING_EDEFAULT;
		case Ssda_researchPackage.VOTING_CLASSIFIER__WEIGHTS:
			return WEIGHTS_EDEFAULT == null ? weights != null : !WEIGHTS_EDEFAULT.equals(weights);
		case Ssda_researchPackage.VOTING_CLASSIFIER__ESTIMATORS:
			return ESTIMATORS_EDEFAULT == null ? estimators != null : !ESTIMATORS_EDEFAULT.equals(estimators);
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
		result.append(" (voting: ");
		result.append(voting);
		result.append(", weights: ");
		result.append(weights);
		result.append(", estimators: ");
		result.append(estimators);
		result.append(')');
		return result.toString();
	}

} //VotingClassifierImpl
