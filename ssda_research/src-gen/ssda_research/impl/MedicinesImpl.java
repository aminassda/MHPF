/**
 */
package ssda_research.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ssda_research.Medicines;
import ssda_research.Ssda_researchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicines</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ssda_research.impl.MedicinesImpl#getMedicine_name <em>Medicine name</em>}</li>
 *   <li>{@link ssda_research.impl.MedicinesImpl#getMedicine_dossage <em>Medicine dossage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinesImpl extends MinimalEObjectImpl.Container implements Medicines {
	/**
	 * The default value of the '{@link #getMedicine_name() <em>Medicine name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicine_name()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedicine_name() <em>Medicine name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicine_name()
	 * @generated
	 * @ordered
	 */
	protected String medicine_name = MEDICINE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMedicine_dossage() <em>Medicine dossage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicine_dossage()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICINE_DOSSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedicine_dossage() <em>Medicine dossage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicine_dossage()
	 * @generated
	 * @ordered
	 */
	protected String medicine_dossage = MEDICINE_DOSSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ssda_researchPackage.Literals.MEDICINES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMedicine_name() {
		return medicine_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMedicine_name(String newMedicine_name) {
		String oldMedicine_name = medicine_name;
		medicine_name = newMedicine_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.MEDICINES__MEDICINE_NAME,
					oldMedicine_name, medicine_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMedicine_dossage() {
		return medicine_dossage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMedicine_dossage(String newMedicine_dossage) {
		String oldMedicine_dossage = medicine_dossage;
		medicine_dossage = newMedicine_dossage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ssda_researchPackage.MEDICINES__MEDICINE_DOSSAGE,
					oldMedicine_dossage, medicine_dossage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ssda_researchPackage.MEDICINES__MEDICINE_NAME:
			return getMedicine_name();
		case Ssda_researchPackage.MEDICINES__MEDICINE_DOSSAGE:
			return getMedicine_dossage();
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
		case Ssda_researchPackage.MEDICINES__MEDICINE_NAME:
			setMedicine_name((String) newValue);
			return;
		case Ssda_researchPackage.MEDICINES__MEDICINE_DOSSAGE:
			setMedicine_dossage((String) newValue);
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
		case Ssda_researchPackage.MEDICINES__MEDICINE_NAME:
			setMedicine_name(MEDICINE_NAME_EDEFAULT);
			return;
		case Ssda_researchPackage.MEDICINES__MEDICINE_DOSSAGE:
			setMedicine_dossage(MEDICINE_DOSSAGE_EDEFAULT);
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
		case Ssda_researchPackage.MEDICINES__MEDICINE_NAME:
			return MEDICINE_NAME_EDEFAULT == null ? medicine_name != null
					: !MEDICINE_NAME_EDEFAULT.equals(medicine_name);
		case Ssda_researchPackage.MEDICINES__MEDICINE_DOSSAGE:
			return MEDICINE_DOSSAGE_EDEFAULT == null ? medicine_dossage != null
					: !MEDICINE_DOSSAGE_EDEFAULT.equals(medicine_dossage);
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
		result.append(" (medicine_name: ");
		result.append(medicine_name);
		result.append(", medicine_dossage: ");
		result.append(medicine_dossage);
		result.append(')');
		return result.toString();
	}

} //MedicinesImpl
