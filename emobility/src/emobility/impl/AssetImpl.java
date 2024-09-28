/**
 */
package emobility.impl;

import emobility.Asset;
import emobility.CIA_Level;
import emobility.EmobilityPackage;
import emobility.SecurityControl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.AssetImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link emobility.impl.AssetImpl#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link emobility.impl.AssetImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link emobility.impl.AssetImpl#getSecuritycontrol <em>Securitycontrol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final CIA_Level AVAILABILITY_EDEFAULT = CIA_Level.L1;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected CIA_Level availability = AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegrity() <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrity()
	 * @generated
	 * @ordered
	 */
	protected static final CIA_Level INTEGRITY_EDEFAULT = CIA_Level.L1;

	/**
	 * The cached value of the '{@link #getIntegrity() <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrity()
	 * @generated
	 * @ordered
	 */
	protected CIA_Level integrity = INTEGRITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final CIA_Level CONFIDENTIALITY_EDEFAULT = CIA_Level.L1;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected CIA_Level confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecuritycontrol() <em>Securitycontrol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritycontrol()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityControl> securitycontrol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIA_Level getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(CIA_Level newAvailability) {
		CIA_Level oldAvailability = availability;
		availability = newAvailability == null ? AVAILABILITY_EDEFAULT : newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.ASSET__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIA_Level getIntegrity() {
		return integrity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrity(CIA_Level newIntegrity) {
		CIA_Level oldIntegrity = integrity;
		integrity = newIntegrity == null ? INTEGRITY_EDEFAULT : newIntegrity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.ASSET__INTEGRITY, oldIntegrity, integrity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIA_Level getConfidentiality() {
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(CIA_Level newConfidentiality) {
		CIA_Level oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.ASSET__CONFIDENTIALITY, oldConfidentiality, confidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityControl> getSecuritycontrol() {
		if (securitycontrol == null) {
			securitycontrol = new EObjectResolvingEList<SecurityControl>(SecurityControl.class, this, EmobilityPackage.ASSET__SECURITYCONTROL);
		}
		return securitycontrol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmobilityPackage.ASSET__AVAILABILITY:
				return getAvailability();
			case EmobilityPackage.ASSET__INTEGRITY:
				return getIntegrity();
			case EmobilityPackage.ASSET__CONFIDENTIALITY:
				return getConfidentiality();
			case EmobilityPackage.ASSET__SECURITYCONTROL:
				return getSecuritycontrol();
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
			case EmobilityPackage.ASSET__AVAILABILITY:
				setAvailability((CIA_Level)newValue);
				return;
			case EmobilityPackage.ASSET__INTEGRITY:
				setIntegrity((CIA_Level)newValue);
				return;
			case EmobilityPackage.ASSET__CONFIDENTIALITY:
				setConfidentiality((CIA_Level)newValue);
				return;
			case EmobilityPackage.ASSET__SECURITYCONTROL:
				getSecuritycontrol().clear();
				getSecuritycontrol().addAll((Collection<? extends SecurityControl>)newValue);
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
			case EmobilityPackage.ASSET__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case EmobilityPackage.ASSET__INTEGRITY:
				setIntegrity(INTEGRITY_EDEFAULT);
				return;
			case EmobilityPackage.ASSET__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
				return;
			case EmobilityPackage.ASSET__SECURITYCONTROL:
				getSecuritycontrol().clear();
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
			case EmobilityPackage.ASSET__AVAILABILITY:
				return availability != AVAILABILITY_EDEFAULT;
			case EmobilityPackage.ASSET__INTEGRITY:
				return integrity != INTEGRITY_EDEFAULT;
			case EmobilityPackage.ASSET__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
			case EmobilityPackage.ASSET__SECURITYCONTROL:
				return securitycontrol != null && !securitycontrol.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Availability: ");
		result.append(availability);
		result.append(", Integrity: ");
		result.append(integrity);
		result.append(", Confidentiality: ");
		result.append(confidentiality);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
