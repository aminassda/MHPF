/**
 */
package ssda_research.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ssda_research.OutlierDetection;
import ssda_research.Plot;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outlier Detection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.OutlierDetectionImpl#getPlot <em>Plot</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OutlierDetectionImpl extends Data_PreprocessingImpl implements OutlierDetection {
	/**
	 * The cached value of the '{@link #getPlot() <em>Plot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Plot> plot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutlierDetectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.OUTLIER_DETECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Plot> getPlot() {
		if (plot == null) {
			plot = new EObjectResolvingEList<Plot>(Plot.class, this, Ssda_researchPackage.OUTLIER_DETECTION__PLOT);
		}
		return plot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.OUTLIER_DETECTION__PLOT:
			return getPlot();
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
		case Ssda_researchPackage.OUTLIER_DETECTION__PLOT:
			getPlot().clear();
			getPlot().addAll((Collection<? extends Plot>) newValue);
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
		case Ssda_researchPackage.OUTLIER_DETECTION__PLOT:
			getPlot().clear();
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
		case Ssda_researchPackage.OUTLIER_DETECTION__PLOT:
			return plot != null && !plot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutlierDetectionImpl
