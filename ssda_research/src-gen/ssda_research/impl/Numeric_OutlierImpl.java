/**
 */
package ssda_research.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import ssda_research.Numeric_Outlier;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Outlier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Numeric_OutlierImpl extends OutlierDetectionImpl implements Numeric_Outlier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Numeric_OutlierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.NUMERIC_OUTLIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void IOR() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Ssda_researchPackage.NUMERIC_OUTLIER___IOR:
			IOR();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Numeric_OutlierImpl
