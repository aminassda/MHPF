/**
 */
package ssda_research.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ssda_research.IQR;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IQR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.IQRImpl#getQ1 <em>Q1</em>}</li>
 *   <li>{@link ssda_research.impl.IQRImpl#getQ2 <em>Q2</em>}</li>
 *   <li>{@link ssda_research.impl.IQRImpl#getQ3 <em>Q3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IQRImpl extends MinimalEObjectImpl.Container implements IQR {
	/**
	 * The default value of the '{@link #getQ1() <em>Q1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ1()
	 * @generated
	 * @ordered
	 */
	protected static final String Q1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQ1() <em>Q1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ1()
	 * @generated
	 * @ordered
	 */
	protected String q1 = Q1_EDEFAULT;

	/**
	 * The default value of the '{@link #getQ2() <em>Q2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ2()
	 * @generated
	 * @ordered
	 */
	protected static final String Q2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQ2() <em>Q2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ2()
	 * @generated
	 * @ordered
	 */
	protected String q2 = Q2_EDEFAULT;

	/**
	 * The default value of the '{@link #getQ3() <em>Q3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ3()
	 * @generated
	 * @ordered
	 */
	protected static final String Q3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQ3() <em>Q3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ3()
	 * @generated
	 * @ordered
	 */
	protected String q3 = Q3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IQRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.IQR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQ1() {
		return q1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQ1(String newQ1) {
		String oldQ1 = q1;
		q1 = newQ1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.IQR__Q1, oldQ1, q1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQ2() {
		return q2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQ2(String newQ2) {
		String oldQ2 = q2;
		q2 = newQ2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.IQR__Q2, oldQ2, q2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQ3() {
		return q3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQ3(String newQ3) {
		String oldQ3 = q3;
		q3 = newQ3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.IQR__Q3, oldQ3, q3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void quantile() {
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
		case Ssda_researchPackage.IQR__Q1:
			return getQ1();
		case Ssda_researchPackage.IQR__Q2:
			return getQ2();
		case Ssda_researchPackage.IQR__Q3:
			return getQ3();
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
		case Ssda_researchPackage.IQR__Q1:
			setQ1((String) newValue);
			return;
		case Ssda_researchPackage.IQR__Q2:
			setQ2((String) newValue);
			return;
		case Ssda_researchPackage.IQR__Q3:
			setQ3((String) newValue);
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
		case Ssda_researchPackage.IQR__Q1:
			setQ1(Q1_EDEFAULT);
			return;
		case Ssda_researchPackage.IQR__Q2:
			setQ2(Q2_EDEFAULT);
			return;
		case Ssda_researchPackage.IQR__Q3:
			setQ3(Q3_EDEFAULT);
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
		case Ssda_researchPackage.IQR__Q1:
			return Q1_EDEFAULT == null ? q1 != null : !Q1_EDEFAULT.equals(q1);
		case Ssda_researchPackage.IQR__Q2:
			return Q2_EDEFAULT == null ? q2 != null : !Q2_EDEFAULT.equals(q2);
		case Ssda_researchPackage.IQR__Q3:
			return Q3_EDEFAULT == null ? q3 != null : !Q3_EDEFAULT.equals(q3);
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
		case Ssda_researchPackage.IQR___QUANTILE:
			quantile();
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
		result.append(" (Q1: ");
		result.append(q1);
		result.append(", Q2: ");
		result.append(q2);
		result.append(", Q3: ");
		result.append(q3);
		result.append(')');
		return result.toString();
	}

} //IQRImpl
