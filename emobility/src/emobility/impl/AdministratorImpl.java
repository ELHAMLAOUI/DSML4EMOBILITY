/**
 */
package emobility.impl;

import emobility.Administrator;
import emobility.CSMS;
import emobility.EmobilityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.AdministratorImpl#getCsms <em>Csms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministratorImpl extends Energy_Transfer_ElementImpl implements Administrator {
	/**
	 * The cached value of the '{@link #getCsms() <em>Csms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsms()
	 * @generated
	 * @ordered
	 */
	protected CSMS csms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.ADMINISTRATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMS getCsms() {
		if (csms != null && csms.eIsProxy()) {
			InternalEObject oldCsms = (InternalEObject)csms;
			csms = (CSMS)eResolveProxy(oldCsms);
			if (csms != oldCsms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.ADMINISTRATOR__CSMS, oldCsms, csms));
			}
		}
		return csms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMS basicGetCsms() {
		return csms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsms(CSMS newCsms) {
		CSMS oldCsms = csms;
		csms = newCsms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.ADMINISTRATOR__CSMS, oldCsms, csms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmobilityPackage.ADMINISTRATOR__CSMS:
				if (resolve) return getCsms();
				return basicGetCsms();
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
			case EmobilityPackage.ADMINISTRATOR__CSMS:
				setCsms((CSMS)newValue);
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
			case EmobilityPackage.ADMINISTRATOR__CSMS:
				setCsms((CSMS)null);
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
			case EmobilityPackage.ADMINISTRATOR__CSMS:
				return csms != null;
		}
		return super.eIsSet(featureID);
	}

} //AdministratorImpl
