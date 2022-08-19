/**
 */
package ssda_research.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ssda_research.Dataset;
import ssda_research.ExploratoryDataAnalysis;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exploratory Data Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.ExploratoryDataAnalysisImpl#getDatasets <em>Datasets</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExploratoryDataAnalysisImpl extends MinimalEObjectImpl.Container
		implements ExploratoryDataAnalysis {
	/**
	 * The cached value of the '{@link #getDatasets() <em>Datasets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasets()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> datasets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExploratoryDataAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.EXPLORATORY_DATA_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dataset> getDatasets() {
		if (datasets == null) {
			datasets = new EObjectResolvingEList<Dataset>(Dataset.class, this,
					Ssda_researchPackage.EXPLORATORY_DATA_ANALYSIS__DATASETS);
		}
		return datasets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.EXPLORATORY_DATA_ANALYSIS__DATASETS:
			return getDatasets();
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
		case Ssda_researchPackage.EXPLORATORY_DATA_ANALYSIS__DATASETS:
			getDatasets().clear();
			getDatasets().addAll((Collection<? extends Dataset>) newValue);
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
		case Ssda_researchPackage.EXPLORATORY_DATA_ANALYSIS__DATASETS:
			getDatasets().clear();
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
		case Ssda_researchPackage.EXPLORATORY_DATA_ANALYSIS__DATASETS:
			return datasets != null && !datasets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExploratoryDataAnalysisImpl
