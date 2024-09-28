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
 * An implementation of the model object '<em><b>CSO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.CSOImpl#getEmsp <em>Emsp</em>}</li>
 *   <li>{@link emobility.impl.CSOImpl#getClearing_house <em>Clearing house</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSOImpl extends Energy_Transfer_ElementImpl implements CSO {
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
	 * The cached value of the '{@link #getClearing_house() <em>Clearing house</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearing_house()
	 * @generated
	 * @ordered
	 */
	protected Clearing_House clearing_house;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.CSO;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.CSO__EMSP, oldEmsp, emsp));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmobilityPackage.CSO__EMSP, oldEmsp, newEmsp);
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
				msgs = ((InternalEObject)emsp).eInverseRemove(this, EmobilityPackage.EMSP__CSO, eMSP.class, msgs);
			if (newEmsp != null)
				msgs = ((InternalEObject)newEmsp).eInverseAdd(this, EmobilityPackage.EMSP__CSO, eMSP.class, msgs);
			msgs = basicSetEmsp(newEmsp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.CSO__EMSP, newEmsp, newEmsp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clearing_House getClearing_house() {
		if (clearing_house != null && clearing_house.eIsProxy()) {
			InternalEObject oldClearing_house = (InternalEObject)clearing_house;
			clearing_house = (Clearing_House)eResolveProxy(oldClearing_house);
			if (clearing_house != oldClearing_house) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.CSO__CLEARING_HOUSE, oldClearing_house, clearing_house));
			}
		}
		return clearing_house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clearing_House basicGetClearing_house() {
		return clearing_house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearing_house(Clearing_House newClearing_house, NotificationChain msgs) {
		Clearing_House oldClearing_house = clearing_house;
		clearing_house = newClearing_house;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmobilityPackage.CSO__CLEARING_HOUSE, oldClearing_house, newClearing_house);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearing_house(Clearing_House newClearing_house) {
		if (newClearing_house != clearing_house) {
			NotificationChain msgs = null;
			if (clearing_house != null)
				msgs = ((InternalEObject)clearing_house).eInverseRemove(this, EmobilityPackage.CLEARING_HOUSE__CSO, Clearing_House.class, msgs);
			if (newClearing_house != null)
				msgs = ((InternalEObject)newClearing_house).eInverseAdd(this, EmobilityPackage.CLEARING_HOUSE__CSO, Clearing_House.class, msgs);
			msgs = basicSetClearing_house(newClearing_house, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.CSO__CLEARING_HOUSE, newClearing_house, newClearing_house));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmobilityPackage.CSO__EMSP:
				if (emsp != null)
					msgs = ((InternalEObject)emsp).eInverseRemove(this, EmobilityPackage.EMSP__CSO, eMSP.class, msgs);
				return basicSetEmsp((eMSP)otherEnd, msgs);
			case EmobilityPackage.CSO__CLEARING_HOUSE:
				if (clearing_house != null)
					msgs = ((InternalEObject)clearing_house).eInverseRemove(this, EmobilityPackage.CLEARING_HOUSE__CSO, Clearing_House.class, msgs);
				return basicSetClearing_house((Clearing_House)otherEnd, msgs);
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
			case EmobilityPackage.CSO__EMSP:
				return basicSetEmsp(null, msgs);
			case EmobilityPackage.CSO__CLEARING_HOUSE:
				return basicSetClearing_house(null, msgs);
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
			case EmobilityPackage.CSO__EMSP:
				if (resolve) return getEmsp();
				return basicGetEmsp();
			case EmobilityPackage.CSO__CLEARING_HOUSE:
				if (resolve) return getClearing_house();
				return basicGetClearing_house();
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
			case EmobilityPackage.CSO__EMSP:
				setEmsp((eMSP)newValue);
				return;
			case EmobilityPackage.CSO__CLEARING_HOUSE:
				setClearing_house((Clearing_House)newValue);
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
			case EmobilityPackage.CSO__EMSP:
				setEmsp((eMSP)null);
				return;
			case EmobilityPackage.CSO__CLEARING_HOUSE:
				setClearing_house((Clearing_House)null);
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
			case EmobilityPackage.CSO__EMSP:
				return emsp != null;
			case EmobilityPackage.CSO__CLEARING_HOUSE:
				return clearing_house != null;
		}
		return super.eIsSet(featureID);
	}

} //CSOImpl
