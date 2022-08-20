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
 *   <li>{@link ssda_research.impl.LogisticRegressionImpl#getSolver <em>Solver</em>}</li>
 *   <li>{@link ssda_research.impl.LogisticRegressionImpl#getPenalty <em>Penalty</em>}</li>
 *   <li>{@link ssda_research.impl.LogisticRegressionImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogisticRegressionImpl extends classifiersImpl implements LogisticRegression {
	/**
	 * The default value of the '{@link #getSolver() <em>Solver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolver()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolver() <em>Solver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolver()
	 * @generated
	 * @ordered
	 */
	protected String solver = SOLVER_EDEFAULT;

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
	 * The default value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected static final String C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected String c = C_EDEFAULT;

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
	public String getSolver() {
		return solver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolver(String newSolver) {
		String oldSolver = solver;
		solver = newSolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.LOGISTIC_REGRESSION__SOLVER,
					oldSolver, solver));
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
	public String getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setC(String newC) {
		String oldC = c;
		c = newC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.LOGISTIC_REGRESSION__C, oldC,
					c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.LOGISTIC_REGRESSION__SOLVER:
			return getSolver();
		case Ssda_researchPackage.LOGISTIC_REGRESSION__PENALTY:
			return getPenalty();
		case Ssda_researchPackage.LOGISTIC_REGRESSION__C:
			return getC();
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
		case Ssda_researchPackage.LOGISTIC_REGRESSION__SOLVER:
			setSolver((String) newValue);
			return;
		case Ssda_researchPackage.LOGISTIC_REGRESSION__PENALTY:
			setPenalty((Regularization) newValue);
			return;
		case Ssda_researchPackage.LOGISTIC_REGRESSION__C:
			setC((String) newValue);
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
		case Ssda_researchPackage.LOGISTIC_REGRESSION__SOLVER:
			setSolver(SOLVER_EDEFAULT);
			return;
		case Ssda_researchPackage.LOGISTIC_REGRESSION__PENALTY:
			setPenalty(PENALTY_EDEFAULT);
			return;
		case Ssda_researchPackage.LOGISTIC_REGRESSION__C:
			setC(C_EDEFAULT);
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
		case Ssda_researchPackage.LOGISTIC_REGRESSION__SOLVER:
			return SOLVER_EDEFAULT == null ? solver != null : !SOLVER_EDEFAULT.equals(solver);
		case Ssda_researchPackage.LOGISTIC_REGRESSION__PENALTY:
			return penalty != PENALTY_EDEFAULT;
		case Ssda_researchPackage.LOGISTIC_REGRESSION__C:
			return C_EDEFAULT == null ? c != null : !C_EDEFAULT.equals(c);
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
		result.append(" (solver: ");
		result.append(solver);
		result.append(", penalty: ");
		result.append(penalty);
		result.append(", C: ");
		result.append(c);
		result.append(')');
		return result.toString();
	}

} //LogisticRegressionImpl
