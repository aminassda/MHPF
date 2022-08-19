/**
 */
package ssda_research.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ssda_research.Data_Preprocessing;
import ssda_research.Dataset;
import ssda_research.Preprocessed_data;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Preprocessing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.Data_PreprocessingImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link ssda_research.impl.Data_PreprocessingImpl#getP_data <em>Pdata</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Data_PreprocessingImpl extends MinimalEObjectImpl.Container implements Data_Preprocessing {
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
	 * The cached value of the '{@link #getP_data() <em>Pdata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_data()
	 * @generated
	 * @ordered
	 */
	protected EList<Preprocessed_data> p_data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data_PreprocessingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.DATA_PREPROCESSING;
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
					Ssda_researchPackage.DATA_PREPROCESSING__DATASET);
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Preprocessed_data> getP_data() {
		if (p_data == null) {
			p_data = new EObjectContainmentEList<Preprocessed_data>(Preprocessed_data.class, this,
					Ssda_researchPackage.DATA_PREPROCESSING__PDATA);
		}
		return p_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ssda_researchPackage.DATA_PREPROCESSING__PDATA:
			return ((InternalEList<?>) getP_data()).basicRemove(otherEnd, msgs);
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
		case Ssda_researchPackage.DATA_PREPROCESSING__DATASET:
			return getDataset();
		case Ssda_researchPackage.DATA_PREPROCESSING__PDATA:
			return getP_data();
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
		case Ssda_researchPackage.DATA_PREPROCESSING__DATASET:
			getDataset().clear();
			getDataset().addAll((Collection<? extends Dataset>) newValue);
			return;
		case Ssda_researchPackage.DATA_PREPROCESSING__PDATA:
			getP_data().clear();
			getP_data().addAll((Collection<? extends Preprocessed_data>) newValue);
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
		case Ssda_researchPackage.DATA_PREPROCESSING__DATASET:
			getDataset().clear();
			return;
		case Ssda_researchPackage.DATA_PREPROCESSING__PDATA:
			getP_data().clear();
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
		case Ssda_researchPackage.DATA_PREPROCESSING__DATASET:
			return dataset != null && !dataset.isEmpty();
		case Ssda_researchPackage.DATA_PREPROCESSING__PDATA:
			return p_data != null && !p_data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Data_PreprocessingImpl
