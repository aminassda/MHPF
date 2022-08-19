/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.LogisticRegression;
import ssda_research.Regularization;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logistic Regression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.LogisticRegressionImpl#getSolvers <em>Solvers</em>}</li>
 *   <li>{@link ssda_research.impl.LogisticRegressionImpl#getPenalty <em>Penalty</em>}</li>
 *   <li>{@link ssda_research.impl.LogisticRegressionImpl#getC_values <em>Cvalues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogisticRegressionImpl extends classifiersImpl implements LogisticRegression {
	/**
	 * The default value of the '{@link #getSolvers() <em>Solvers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolvers()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLVERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolvers() <em>Solvers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolvers()
	 * @generated
	 * @ordered
	 */
	protected String solvers = SOLVERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalty() <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalty()
	 * @generated
	 * @ordered
	 */
	protected static final Regularization PENALTY_EDEFAULT = Regularization.L1;

	/**
	 * The cached value of the '{@link #getPenalty() <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalty()
	 * @generated
	 * @ordered
	 */
	protected Regularization penalty = PENALTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getC_values() <em>Cvalues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_values()
	 * @generated
	 * @ordered
	 */
	protected static final String CVALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC_values() <em>Cvalues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_values()
	 * @generated
	 * @ordered
	 */
	protected String c_values = CVALUES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticRegressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.LOGISTIC_REGRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSolvers() {
		return solvers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolvers(String newSolvers) {
		String oldSolvers = solvers;
		solvers = newSolvers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.LOGISTIC_REGRESSION__SOLVERS,
					oldSolvers, solvers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regularization getPenalty() {
		return penalty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPenalty(Regularization newPenalty) {
		Regularization oldPenalty = penalty;
		penalty = newPenalty == null ? PENALTY_EDEFAULT : newPenalty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.LOGISTIC_REGRESSION__PENALTY,
					oldPenalty, penalty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getC_values() {
		return c_values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setC_values(String newC_values) {
		String oldC_values = c_values;
		c_values = newC_values;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.LOGISTIC_REGRESSION__CVALUES,
					oldC_values, c_values));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.LOGISTIC_REGRESSION__SOLVERS:
			return getSolvers();
		case Ssda_researchPackage.LOGISTIC_REGRESSION__PENALTY:
			return getPenalty();
		case Ssda_researchPackage.LOGISTIC_REGRESSION__CVALUES:
			return getC_values();
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
		case Ssda_researchPackage.LOGISTIC_REGRESSION__SOLVERS:
			setSolvers((String) newValue);
			return;
		case Ssda_researchPackage.LOGISTIC_REGRESSION__PENALTY:
			setPenalty((Regularization) newValue);
			return;
		case Ssda_researchPackage.LOGISTIC_REGRESSION__CVALUES:
			setC_values((String) newValue);
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
		case Ssda_researchPackage.LOGISTIC_REGRESSION__SOLVERS:
			setSolvers(SOLVERS_EDEFAULT);
			return;
		case Ssda_researchPackage.LOGISTIC_REGRESSION__PENALTY:
			setPenalty(PENALTY_EDEFAULT);
			return;
		case Ssda_researchPackage.LOGISTIC_REGRESSION__CVALUES:
			setC_values(CVALUES_EDEFAULT);
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
		case Ssda_researchPackage.LOGISTIC_REGRESSION__SOLVERS:
			return SOLVERS_EDEFAULT == null ? solvers != null : !SOLVERS_EDEFAULT.equals(solvers);
		case Ssda_researchPackage.LOGISTIC_REGRESSION__PENALTY:
			return penalty != PENALTY_EDEFAULT;
		case Ssda_researchPackage.LOGISTIC_REGRESSION__CVALUES:
			return CVALUES_EDEFAULT == null ? c_values != null : !CVALUES_EDEFAULT.equals(c_values);
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
		result.append(" (solvers: ");
		result.append(solvers);
		result.append(", penalty: ");
		result.append(penalty);
		result.append(", c_values: ");
		result.append(c_values);
		result.append(')');
		return result.toString();
	}

} //LogisticRegressionImpl
