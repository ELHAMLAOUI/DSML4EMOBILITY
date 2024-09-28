/**
 */
package emobility.impl;

import emobility.EV_User;
import emobility.EmobilityPackage;
import emobility.Laptop;
import emobility.Mobile;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EV User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.EV_UserImpl#getLaptop <em>Laptop</em>}</li>
 *   <li>{@link emobility.impl.EV_UserImpl#getMobile <em>Mobile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EV_UserImpl extends EV_User_ElementImpl implements EV_User {
	/**
	 * The cached value of the '{@link #getLaptop() <em>Laptop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaptop()
	 * @generated
	 * @ordered
	 */
	protected Laptop laptop;

	/**
	 * The cached value of the '{@link #getMobile() <em>Mobile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected Mobile mobile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EV_UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.EV_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Laptop getLaptop() {
		if (laptop != null && laptop.eIsProxy()) {
			InternalEObject oldLaptop = (InternalEObject)laptop;
			laptop = (Laptop)eResolveProxy(oldLaptop);
			if (laptop != oldLaptop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.EV_USER__LAPTOP, oldLaptop, laptop));
			}
		}
		return laptop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Laptop basicGetLaptop() {
		return laptop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaptop(Laptop newLaptop) {
		Laptop oldLaptop = laptop;
		laptop = newLaptop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.EV_USER__LAPTOP, oldLaptop, laptop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mobile getMobile() {
		if (mobile != null && mobile.eIsProxy()) {
			InternalEObject oldMobile = (InternalEObject)mobile;
			mobile = (Mobile)eResolveProxy(oldMobile);
			if (mobile != oldMobile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.EV_USER__MOBILE, oldMobile, mobile));
			}
		}
		return mobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mobile basicGetMobile() {
		return mobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobile(Mobile newMobile) {
		Mobile oldMobile = mobile;
		mobile = newMobile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.EV_USER__MOBILE, oldMobile, mobile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmobilityPackage.EV_USER__LAPTOP:
				if (resolve) return getLaptop();
				return basicGetLaptop();
			case EmobilityPackage.EV_USER__MOBILE:
				if (resolve) return getMobile();
				return basicGetMobile();
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
			case EmobilityPackage.EV_USER__LAPTOP:
				setLaptop((Laptop)newValue);
				return;
			case EmobilityPackage.EV_USER__MOBILE:
				setMobile((Mobile)newValue);
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
			case EmobilityPackage.EV_USER__LAPTOP:
				setLaptop((Laptop)null);
				return;
			case EmobilityPackage.EV_USER__MOBILE:
				setMobile((Mobile)null);
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
			case EmobilityPackage.EV_USER__LAPTOP:
				return laptop != null;
			case EmobilityPackage.EV_USER__MOBILE:
				return mobile != null;
		}
		return super.eIsSet(featureID);
	}

} //EV_UserImpl
