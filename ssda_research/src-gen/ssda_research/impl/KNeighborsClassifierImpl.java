/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssda_research.KNeighborsClassifier;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KNeighbors Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.KNeighborsClassifierImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link ssda_research.impl.KNeighborsClassifierImpl#getP <em>P</em>}</li>
 *   <li>{@link ssda_research.impl.KNeighborsClassifierImpl#getN_neighbors <em>Nneighbors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KNeighborsClassifierImpl extends classifiersImpl implements KNeighborsClassifier {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected String metric = METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getP() <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected static final int P_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected int p = P_EDEFAULT;

	/**
	 * The default value of the '{@link #getN_neighbors() <em>Nneighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN_neighbors()
	 * @generated
	 * @ordered
	 */
	protected static final String NNEIGHBORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getN_neighbors() <em>Nneighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN_neighbors()
	 * @generated
	 * @ordered
	 */
	protected String n_neighbors = NNEIGHBORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KNeighborsClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.KNEIGHBORS_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetric(String newMetric) {
		String oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__METRIC,
					oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getP() {
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP(int newP) {
		int oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__P, oldP,
					p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getN_neighbors() {
		return n_neighbors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setN_neighbors(String newN_neighbors) {
		String oldN_neighbors = n_neighbors;
		n_neighbors = newN_neighbors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS, oldN_neighbors, n_neighbors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__METRIC:
			return getMetric();
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__P:
			return getP();
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS:
			return getN_neighbors();
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
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__METRIC:
			setMetric((String) newValue);
			return;
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__P:
			setP((Integer) newValue);
			return;
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS:
			setN_neighbors((String) newValue);
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
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__METRIC:
			setMetric(METRIC_EDEFAULT);
			return;
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__P:
			setP(P_EDEFAULT);
			return;
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS:
			setN_neighbors(NNEIGHBORS_EDEFAULT);
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
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__METRIC:
			return METRIC_EDEFAULT == null ? metric != null : !METRIC_EDEFAULT.equals(metric);
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__P:
			return p != P_EDEFAULT;
		case Ssda_researchPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS:
			return NNEIGHBORS_EDEFAULT == null ? n_neighbors != null : !NNEIGHBORS_EDEFAULT.equals(n_neighbors);
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
		result.append(" (metric: ");
		result.append(metric);
		result.append(", p: ");
		result.append(p);
		result.append(", n_neighbors: ");
		result.append(n_neighbors);
		result.append(')');
		return result.toString();
	}

} //KNeighborsClassifierImpl
