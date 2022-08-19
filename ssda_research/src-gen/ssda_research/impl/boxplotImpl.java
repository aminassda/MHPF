/**
 */
package ssda_research.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ssda_research.IQR;
import ssda_research.Ssda_researchPackage;
import ssda_research.boxplot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>boxplot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.boxplotImpl#getMin <em>Min</em>}</li>
 *   <li>{@link ssda_research.impl.boxplotImpl#getMax <em>Max</em>}</li>
 *   <li>{@link ssda_research.impl.boxplotImpl#getWhisker_width <em>Whisker width</em>}</li>
 *   <li>{@link ssda_research.impl.boxplotImpl#getLower_whisker <em>Lower whisker</em>}</li>
 *   <li>{@link ssda_research.impl.boxplotImpl#getUpper_whisker <em>Upper whisker</em>}</li>
 *   <li>{@link ssda_research.impl.boxplotImpl#getIqr <em>Iqr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class boxplotImpl extends PlotImpl implements boxplot {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected float min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected float max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhisker_width() <em>Whisker width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhisker_width()
	 * @generated
	 * @ordered
	 */
	protected static final float WHISKER_WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWhisker_width() <em>Whisker width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhisker_width()
	 * @generated
	 * @ordered
	 */
	protected float whisker_width = WHISKER_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower_whisker() <em>Lower whisker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_whisker()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_WHISKER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLower_whisker() <em>Lower whisker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_whisker()
	 * @generated
	 * @ordered
	 */
	protected String lower_whisker = LOWER_WHISKER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper_whisker() <em>Upper whisker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper_whisker()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_WHISKER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpper_whisker() <em>Upper whisker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper_whisker()
	 * @generated
	 * @ordered
	 */
	protected String upper_whisker = UPPER_WHISKER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIqr() <em>Iqr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIqr()
	 * @generated
	 * @ordered
	 */
	protected EList<IQR> iqr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boxplotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.BOXPLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(float newMin) {
		float oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.BOXPLOT__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(float newMax) {
		float oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.BOXPLOT__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWhisker_width() {
		return whisker_width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhisker_width(float newWhisker_width) {
		float oldWhisker_width = whisker_width;
		whisker_width = newWhisker_width;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.BOXPLOT__WHISKER_WIDTH,
					oldWhisker_width, whisker_width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLower_whisker() {
		return lower_whisker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLower_whisker(String newLower_whisker) {
		String oldLower_whisker = lower_whisker;
		lower_whisker = newLower_whisker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.BOXPLOT__LOWER_WHISKER,
					oldLower_whisker, lower_whisker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpper_whisker() {
		return upper_whisker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpper_whisker(String newUpper_whisker) {
		String oldUpper_whisker = upper_whisker;
		upper_whisker = newUpper_whisker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.BOXPLOT__UPPER_WHISKER,
					oldUpper_whisker, upper_whisker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IQR> getIqr() {
		if (iqr == null) {
			iqr = new EObjectContainmentEList<IQR>(IQR.class, this, Ssda_researchPackage.BOXPLOT__IQR);
		}
		return iqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void five_summarydata() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ssda_researchPackage.BOXPLOT__IQR:
			return ((InternalEList<?>) getIqr()).basicRemove(otherEnd, msgs);
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
		case Ssda_researchPackage.BOXPLOT__MIN:
			return getMin();
		case Ssda_researchPackage.BOXPLOT__MAX:
			return getMax();
		case Ssda_researchPackage.BOXPLOT__WHISKER_WIDTH:
			return getWhisker_width();
		case Ssda_researchPackage.BOXPLOT__LOWER_WHISKER:
			return getLower_whisker();
		case Ssda_researchPackage.BOXPLOT__UPPER_WHISKER:
			return getUpper_whisker();
		case Ssda_researchPackage.BOXPLOT__IQR:
			return getIqr();
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
		case Ssda_researchPackage.BOXPLOT__MIN:
			setMin((Float) newValue);
			return;
		case Ssda_researchPackage.BOXPLOT__MAX:
			setMax((Float) newValue);
			return;
		case Ssda_researchPackage.BOXPLOT__WHISKER_WIDTH:
			setWhisker_width((Float) newValue);
			return;
		case Ssda_researchPackage.BOXPLOT__LOWER_WHISKER:
			setLower_whisker((String) newValue);
			return;
		case Ssda_researchPackage.BOXPLOT__UPPER_WHISKER:
			setUpper_whisker((String) newValue);
			return;
		case Ssda_researchPackage.BOXPLOT__IQR:
			getIqr().clear();
			getIqr().addAll((Collection<? extends IQR>) newValue);
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
		case Ssda_researchPackage.BOXPLOT__MIN:
			setMin(MIN_EDEFAULT);
			return;
		case Ssda_researchPackage.BOXPLOT__MAX:
			setMax(MAX_EDEFAULT);
			return;
		case Ssda_researchPackage.BOXPLOT__WHISKER_WIDTH:
			setWhisker_width(WHISKER_WIDTH_EDEFAULT);
			return;
		case Ssda_researchPackage.BOXPLOT__LOWER_WHISKER:
			setLower_whisker(LOWER_WHISKER_EDEFAULT);
			return;
		case Ssda_researchPackage.BOXPLOT__UPPER_WHISKER:
			setUpper_whisker(UPPER_WHISKER_EDEFAULT);
			return;
		case Ssda_researchPackage.BOXPLOT__IQR:
			getIqr().clear();
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
		case Ssda_researchPackage.BOXPLOT__MIN:
			return min != MIN_EDEFAULT;
		case Ssda_researchPackage.BOXPLOT__MAX:
			return max != MAX_EDEFAULT;
		case Ssda_researchPackage.BOXPLOT__WHISKER_WIDTH:
			return whisker_width != WHISKER_WIDTH_EDEFAULT;
		case Ssda_researchPackage.BOXPLOT__LOWER_WHISKER:
			return LOWER_WHISKER_EDEFAULT == null ? lower_whisker != null
					: !LOWER_WHISKER_EDEFAULT.equals(lower_whisker);
		case Ssda_researchPackage.BOXPLOT__UPPER_WHISKER:
			return UPPER_WHISKER_EDEFAULT == null ? upper_whisker != null
					: !UPPER_WHISKER_EDEFAULT.equals(upper_whisker);
		case Ssda_researchPackage.BOXPLOT__IQR:
			return iqr != null && !iqr.isEmpty();
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
		case Ssda_researchPackage.BOXPLOT___FIVE_SUMMARYDATA:
			five_summarydata();
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
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", whisker_width: ");
		result.append(whisker_width);
		result.append(", lower_whisker: ");
		result.append(lower_whisker);
		result.append(", upper_whisker: ");
		result.append(upper_whisker);
		result.append(')');
		return result.toString();
	}

} //boxplotImpl
