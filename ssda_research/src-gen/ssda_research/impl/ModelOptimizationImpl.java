/**
 */
package ssda_research.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ssda_research.Dataset;
import ssda_research.DiabetesPrediction;
import ssda_research.ModelOptimization;
import ssda_research.Splitted_dataset;
import ssda_research.Ssda_researchPackage;
import ssda_research.classifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Optimization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.ModelOptimizationImpl#getParam_grid <em>Param grid</em>}</li>
 *   <li>{@link ssda_research.impl.ModelOptimizationImpl#getEstimator <em>Estimator</em>}</li>
 *   <li>{@link ssda_research.impl.ModelOptimizationImpl#getSplits <em>Splits</em>}</li>
 *   <li>{@link ssda_research.impl.ModelOptimizationImpl#getGenerate_pred <em>Generate pred</em>}</li>
 *   <li>{@link ssda_research.impl.ModelOptimizationImpl#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelOptimizationImpl extends MinimalEObjectImpl.Container implements ModelOptimization {
	/**
	 * The default value of the '{@link #getParam_grid() <em>Param grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_grid()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_GRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParam_grid() <em>Param grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_grid()
	 * @generated
	 * @ordered
	 */
	protected String param_grid = PARAM_GRID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstimator() <em>Estimator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimator()
	 * @generated
	 * @ordered
	 */
	protected EList<classifiers> estimator;

	/**
	 * The cached value of the '{@link #getSplits() <em>Splits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplits()
	 * @generated
	 * @ordered
	 */
	protected EList<Splitted_dataset> splits;

	/**
	 * The cached value of the '{@link #getGenerate_pred() <em>Generate pred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerate_pred()
	 * @generated
	 * @ordered
	 */
	protected DiabetesPrediction generate_pred;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelOptimizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.MODEL_OPTIMIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParam_grid() {
		return param_grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParam_grid(String newParam_grid) {
		String oldParam_grid = param_grid;
		param_grid = newParam_grid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.MODEL_OPTIMIZATION__PARAM_GRID,
					oldParam_grid, param_grid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<classifiers> getEstimator() {
		if (estimator == null) {
			estimator = new EObjectResolvingEList<classifiers>(classifiers.class, this,
					Ssda_researchPackage.MODEL_OPTIMIZATION__ESTIMATOR);
		}
		return estimator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Splitted_dataset> getSplits() {
		if (splits == null) {
			splits = new EObjectResolvingEList<Splitted_dataset>(Splitted_dataset.class, this,
					Ssda_researchPackage.MODEL_OPTIMIZATION__SPLITS);
		}
		return splits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiabetesPrediction getGenerate_pred() {
		if (generate_pred != null && generate_pred.eIsProxy()) {
			InternalEObject oldGenerate_pred = (InternalEObject) generate_pred;
			generate_pred = (DiabetesPrediction) eResolveProxy(oldGenerate_pred);
			if (generate_pred != oldGenerate_pred) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Ssda_researchPackage.MODEL_OPTIMIZATION__GENERATE_PRED, oldGenerate_pred, generate_pred));
			}
		}
		return generate_pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiabetesPrediction basicGetGenerate_pred() {
		return generate_pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_pred(DiabetesPrediction newGenerate_pred) {
		DiabetesPrediction oldGenerate_pred = generate_pred;
		generate_pred = newGenerate_pred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ssda_researchPackage.MODEL_OPTIMIZATION__GENERATE_PRED, oldGenerate_pred, generate_pred));
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
					Ssda_researchPackage.MODEL_OPTIMIZATION__DATASET);
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fit() {
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
	public void predict() {
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
		case Ssda_researchPackage.MODEL_OPTIMIZATION__PARAM_GRID:
			return getParam_grid();
		case Ssda_researchPackage.MODEL_OPTIMIZATION__ESTIMATOR:
			return getEstimator();
		case Ssda_researchPackage.MODEL_OPTIMIZATION__SPLITS:
			return getSplits();
		case Ssda_researchPackage.MODEL_OPTIMIZATION__GENERATE_PRED:
			if (resolve)
				return getGenerate_pred();
			return basicGetGenerate_pred();
		case Ssda_researchPackage.MODEL_OPTIMIZATION__DATASET:
			return getDataset();
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
		case Ssda_researchPackage.MODEL_OPTIMIZATION__PARAM_GRID:
			setParam_grid((String) newValue);
			return;
		case Ssda_researchPackage.MODEL_OPTIMIZATION__ESTIMATOR:
			getEstimator().clear();
			getEstimator().addAll((Collection<? extends classifiers>) newValue);
			return;
		case Ssda_researchPackage.MODEL_OPTIMIZATION__SPLITS:
			getSplits().clear();
			getSplits().addAll((Collection<? extends Splitted_dataset>) newValue);
			return;
		case Ssda_researchPackage.MODEL_OPTIMIZATION__GENERATE_PRED:
			setGenerate_pred((DiabetesPrediction) newValue);
			return;
		case Ssda_researchPackage.MODEL_OPTIMIZATION__DATASET:
			getDataset().clear();
			getDataset().addAll((Collection<? extends Dataset>) newValue);
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
		case Ssda_researchPackage.MODEL_OPTIMIZATION__PARAM_GRID:
			setParam_grid(PARAM_GRID_EDEFAULT);
			return;
		case Ssda_researchPackage.MODEL_OPTIMIZATION__ESTIMATOR:
			getEstimator().clear();
			return;
		case Ssda_researchPackage.MODEL_OPTIMIZATION__SPLITS:
			getSplits().clear();
			return;
		case Ssda_researchPackage.MODEL_OPTIMIZATION__GENERATE_PRED:
			setGenerate_pred((DiabetesPrediction) null);
			return;
		case Ssda_researchPackage.MODEL_OPTIMIZATION__DATASET:
			getDataset().clear();
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
		case Ssda_researchPackage.MODEL_OPTIMIZATION__PARAM_GRID:
			return PARAM_GRID_EDEFAULT == null ? param_grid != null : !PARAM_GRID_EDEFAULT.equals(param_grid);
		case Ssda_researchPackage.MODEL_OPTIMIZATION__ESTIMATOR:
			return estimator != null && !estimator.isEmpty();
		case Ssda_researchPackage.MODEL_OPTIMIZATION__SPLITS:
			return splits != null && !splits.isEmpty();
		case Ssda_researchPackage.MODEL_OPTIMIZATION__GENERATE_PRED:
			return generate_pred != null;
		case Ssda_researchPackage.MODEL_OPTIMIZATION__DATASET:
			return dataset != null && !dataset.isEmpty();
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
		case Ssda_researchPackage.MODEL_OPTIMIZATION___FIT:
			fit();
			return null;
		case Ssda_researchPackage.MODEL_OPTIMIZATION___PREDICT:
			predict();
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
		result.append(" (param_grid: ");
		result.append(param_grid);
		result.append(')');
		return result.toString();
	}

} //ModelOptimizationImpl
