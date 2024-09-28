/**
 */
package emobility.impl;

import emobility.CSO;
import emobility.Clearing_House;
import emobility.EmobilityPackage;
import emobility.eMSP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clearing House</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.Clearing_HouseImpl#getEmsp <em>Emsp</em>}</li>
 *   <li>{@link emobility.impl.Clearing_HouseImpl#getCso <em>Cso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Clearing_HouseImpl extends EV_User_ElementImpl implements Clearing_House {
	/**
	 * The cached value of the '{@link #getEmsp() <em>Emsp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmsp()
	 * @generated
	 * @ordered
	 */
	protected eMSP emsp;

	/**
	 * The cached value of the '{@link #getCso() <em>Cso</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCso()
	 * @generated
	 * @ordered
	 */
	protected CSO cso;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Clearing_HouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.CLEARING_HOUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eMSP getEmsp() {
		if (emsp != null && emsp.eIsProxy()) {
			InternalEObject oldEmsp = (InternalEObject)emsp;
			emsp = (eMSP)eResolveProxy(oldEmsp);
			if (emsp != oldEmsp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.CLEARING_HOUSE__EMSP, oldEmsp, emsp));
			}
		}
		return emsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eMSP basicGetEmsp() {
		return emsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmsp(eMSP newEmsp, NotificationChain msgs) {
		eMSP oldEmsp = emsp;
		emsp = newEmsp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmobilityPackage.CLEARING_HOUSE__EMSP, oldEmsp, newEmsp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmsp(eMSP newEmsp) {
		if (newEmsp != emsp) {
			NotificationChain msgs = null;
			if (emsp != null)
				msgs = ((InternalEObject)emsp).eInverseRemove(this, EmobilityPackage.EMSP__CLEARING_HOUSE, eMSP.class, msgs);
			if (newEmsp != null)
				msgs = ((InternalEObject)newEmsp).eInverseAdd(this, EmobilityPackage.EMSP__CLEARING_HOUSE, eMSP.class, msgs);
			msgs = basicSetEmsp(newEmsp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.CLEARING_HOUSE__EMSP, newEmsp, newEmsp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSO getCso() {
		if (cso != null && cso.eIsProxy()) {
			InternalEObject oldCso = (InternalEObject)cso;
			cso = (CSO)eResolveProxy(oldCso);
			if (cso != oldCso) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.CLEARING_HOUSE__CSO, oldCso, cso));
			}
		}
		return cso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSO basicGetCso() {
		return cso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCso(CSO newCso, NotificationChain msgs) {
		CSO oldCso = cso;
		cso = newCso;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmobilityPackage.CLEARING_HOUSE__CSO, oldCso, newCso);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCso(CSO newCso) {
		if (newCso != cso) {
			NotificationChain msgs = null;
			if (cso != null)
				msgs = ((InternalEObject)cso).eInverseRemove(this, EmobilityPackage.CSO__CLEARING_HOUSE, CSO.class, msgs);
			if (newCso != null)
				msgs = ((InternalEObject)newCso).eInverseAdd(this, EmobilityPackage.CSO__CLEARING_HOUSE, CSO.class, msgs);
			msgs = basicSetCso(newCso, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.CLEARING_HOUSE__CSO, newCso, newCso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmobilityPackage.CLEARING_HOUSE__EMSP:
				if (emsp != null)
					msgs = ((InternalEObject)emsp).eInverseRemove(this, EmobilityPackage.EMSP__CLEARING_HOUSE, eMSP.class, msgs);
				return basicSetEmsp((eMSP)otherEnd, msgs);
			case EmobilityPackage.CLEARING_HOUSE__CSO:
				if (cso != null)
					msgs = ((InternalEObject)cso).eInverseRemove(this, EmobilityPackage.CSO__CLEARING_HOUSE, CSO.class, msgs);
				return basicSetCso((CSO)otherEnd, msgs);
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
			case EmobilityPackage.CLEARING_HOUSE__EMSP:
				return basicSetEmsp(null, msgs);
			case EmobilityPackage.CLEARING_HOUSE__CSO:
				return basicSetCso(null, msgs);
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
			case EmobilityPackage.CLEARING_HOUSE__EMSP:
				if (resolve) return getEmsp();
				return basicGetEmsp();
			case EmobilityPackage.CLEARING_HOUSE__CSO:
				if (resolve) return getCso();
				return basicGetCso();
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
			case EmobilityPackage.CLEARING_HOUSE__EMSP:
				setEmsp((eMSP)newValue);
				return;
			case EmobilityPackage.CLEARING_HOUSE__CSO:
				setCso((CSO)newValue);
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
			case EmobilityPackage.CLEARING_HOUSE__EMSP:
				setEmsp((eMSP)null);
				return;
			case EmobilityPackage.CLEARING_HOUSE__CSO:
				setCso((CSO)null);
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
			case EmobilityPackage.CLEARING_HOUSE__EMSP:
				return emsp != null;
			case EmobilityPackage.CLEARING_HOUSE__CSO:
				return cso != null;
		}
		return super.eIsSet(featureID);
	}

} //Clearing_HouseImpl
