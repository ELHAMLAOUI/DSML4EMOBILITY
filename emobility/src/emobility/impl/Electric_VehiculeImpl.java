/**
 */
package emobility.impl;

import emobility.EVSE;
import emobility.Electric_Vehicule;
import emobility.EmobilityPackage;
import emobility.Vendor_Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electric Vehicule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.Electric_VehiculeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link emobility.impl.Electric_VehiculeImpl#getEvse <em>Evse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Electric_VehiculeImpl extends EMobilityElementImpl implements Electric_Vehicule {
	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final Vendor_Type VENDOR_EDEFAULT = Vendor_Type.TESLA;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected Vendor_Type vendor = VENDOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvse() <em>Evse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvse()
	 * @generated
	 * @ordered
	 */
	protected EVSE evse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Electric_VehiculeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.ELECTRIC_VEHICULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor_Type getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(Vendor_Type newVendor) {
		Vendor_Type oldVendor = vendor;
		vendor = newVendor == null ? VENDOR_EDEFAULT : newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.ELECTRIC_VEHICULE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVSE getEvse() {
		if (evse != null && evse.eIsProxy()) {
			InternalEObject oldEvse = (InternalEObject)evse;
			evse = (EVSE)eResolveProxy(oldEvse);
			if (evse != oldEvse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.ELECTRIC_VEHICULE__EVSE, oldEvse, evse));
			}
		}
		return evse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVSE basicGetEvse() {
		return evse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvse(EVSE newEvse, NotificationChain msgs) {
		EVSE oldEvse = evse;
		evse = newEvse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmobilityPackage.ELECTRIC_VEHICULE__EVSE, oldEvse, newEvse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvse(EVSE newEvse) {
		if (newEvse != evse) {
			NotificationChain msgs = null;
			if (evse != null)
				msgs = ((InternalEObject)evse).eInverseRemove(this, EmobilityPackage.EVSE__ELECTRIC_VEHICULE, EVSE.class, msgs);
			if (newEvse != null)
				msgs = ((InternalEObject)newEvse).eInverseAdd(this, EmobilityPackage.EVSE__ELECTRIC_VEHICULE, EVSE.class, msgs);
			msgs = basicSetEvse(newEvse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.ELECTRIC_VEHICULE__EVSE, newEvse, newEvse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmobilityPackage.ELECTRIC_VEHICULE__EVSE:
				if (evse != null)
					msgs = ((InternalEObject)evse).eInverseRemove(this, EmobilityPackage.EVSE__ELECTRIC_VEHICULE, EVSE.class, msgs);
				return basicSetEvse((EVSE)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmobilityPackage.ELECTRIC_VEHICULE__EVSE:
				return basicSetEvse(null, msgs);
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
			case EmobilityPackage.ELECTRIC_VEHICULE__VENDOR:
				return getVendor();
			case EmobilityPackage.ELECTRIC_VEHICULE__EVSE:
				if (resolve) return getEvse();
				return basicGetEvse();
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
			case EmobilityPackage.ELECTRIC_VEHICULE__VENDOR:
				setVendor((Vendor_Type)newValue);
				return;
			case EmobilityPackage.ELECTRIC_VEHICULE__EVSE:
				setEvse((EVSE)newValue);
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
			case EmobilityPackage.ELECTRIC_VEHICULE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case EmobilityPackage.ELECTRIC_VEHICULE__EVSE:
				setEvse((EVSE)null);
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
			case EmobilityPackage.ELECTRIC_VEHICULE__VENDOR:
				return vendor != VENDOR_EDEFAULT;
			case EmobilityPackage.ELECTRIC_VEHICULE__EVSE:
				return evse != null;
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
		result.append(" (vendor: ");
		result.append(vendor);
		result.append(')');
		return result.toString();
	}

} //Electric_VehiculeImpl
