/**
 */
package emobility.impl;

import emobility.EVSE;
import emobility.Electric_Vehicule;
import emobility.EmobilityPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EVSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.EVSEImpl#getElectric_vehicule <em>Electric vehicule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EVSEImpl extends Energy_Transfer_ElementImpl implements EVSE {
	/**
	 * The cached value of the '{@link #getElectric_vehicule() <em>Electric vehicule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectric_vehicule()
	 * @generated
	 * @ordered
	 */
	protected Electric_Vehicule electric_vehicule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EVSEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.EVSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Electric_Vehicule getElectric_vehicule() {
		if (electric_vehicule != null && electric_vehicule.eIsProxy()) {
			InternalEObject oldElectric_vehicule = (InternalEObject)electric_vehicule;
			electric_vehicule = (Electric_Vehicule)eResolveProxy(oldElectric_vehicule);
			if (electric_vehicule != oldElectric_vehicule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.EVSE__ELECTRIC_VEHICULE, oldElectric_vehicule, electric_vehicule));
			}
		}
		return electric_vehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Electric_Vehicule basicGetElectric_vehicule() {
		return electric_vehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectric_vehicule(Electric_Vehicule newElectric_vehicule, NotificationChain msgs) {
		Electric_Vehicule oldElectric_vehicule = electric_vehicule;
		electric_vehicule = newElectric_vehicule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmobilityPackage.EVSE__ELECTRIC_VEHICULE, oldElectric_vehicule, newElectric_vehicule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectric_vehicule(Electric_Vehicule newElectric_vehicule) {
		if (newElectric_vehicule != electric_vehicule) {
			NotificationChain msgs = null;
			if (electric_vehicule != null)
				msgs = ((InternalEObject)electric_vehicule).eInverseRemove(this, EmobilityPackage.ELECTRIC_VEHICULE__EVSE, Electric_Vehicule.class, msgs);
			if (newElectric_vehicule != null)
				msgs = ((InternalEObject)newElectric_vehicule).eInverseAdd(this, EmobilityPackage.ELECTRIC_VEHICULE__EVSE, Electric_Vehicule.class, msgs);
			msgs = basicSetElectric_vehicule(newElectric_vehicule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.EVSE__ELECTRIC_VEHICULE, newElectric_vehicule, newElectric_vehicule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmobilityPackage.EVSE__ELECTRIC_VEHICULE:
				if (electric_vehicule != null)
					msgs = ((InternalEObject)electric_vehicule).eInverseRemove(this, EmobilityPackage.ELECTRIC_VEHICULE__EVSE, Electric_Vehicule.class, msgs);
				return basicSetElectric_vehicule((Electric_Vehicule)otherEnd, msgs);
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
			case EmobilityPackage.EVSE__ELECTRIC_VEHICULE:
				return basicSetElectric_vehicule(null, msgs);
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
			case EmobilityPackage.EVSE__ELECTRIC_VEHICULE:
				if (resolve) return getElectric_vehicule();
				return basicGetElectric_vehicule();
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
			case EmobilityPackage.EVSE__ELECTRIC_VEHICULE:
				setElectric_vehicule((Electric_Vehicule)newValue);
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
			case EmobilityPackage.EVSE__ELECTRIC_VEHICULE:
				setElectric_vehicule((Electric_Vehicule)null);
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
			case EmobilityPackage.EVSE__ELECTRIC_VEHICULE:
				return electric_vehicule != null;
		}
		return super.eIsSet(featureID);
	}

} //EVSEImpl
