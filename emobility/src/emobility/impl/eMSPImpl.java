/**
 */
package emobility.impl;

import emobility.CSO;
import emobility.Clearing_House;
import emobility.EmobilityPackage;
import emobility.Service_API;
import emobility.Web_Application;
import emobility.eMSP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>eMSP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.eMSPImpl#getCso <em>Cso</em>}</li>
 *   <li>{@link emobility.impl.eMSPImpl#getService_api <em>Service api</em>}</li>
 *   <li>{@link emobility.impl.eMSPImpl#getWeb_application <em>Web application</em>}</li>
 *   <li>{@link emobility.impl.eMSPImpl#getClearing_house <em>Clearing house</em>}</li>
 * </ul>
 *
 * @generated
 */
public class eMSPImpl extends EV_User_ElementImpl implements eMSP {
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
	 * The cached value of the '{@link #getService_api() <em>Service api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_api()
	 * @generated
	 * @ordered
	 */
	protected Service_API service_api;

	/**
	 * The cached value of the '{@link #getWeb_application() <em>Web application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeb_application()
	 * @generated
	 * @ordered
	 */
	protected Web_Application web_application;

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
	protected eMSPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.EMSP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.EMSP__CSO, oldCso, cso));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmobilityPackage.EMSP__CSO, oldCso, newCso);
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
				msgs = ((InternalEObject)cso).eInverseRemove(this, EmobilityPackage.CSO__EMSP, CSO.class, msgs);
			if (newCso != null)
				msgs = ((InternalEObject)newCso).eInverseAdd(this, EmobilityPackage.CSO__EMSP, CSO.class, msgs);
			msgs = basicSetCso(newCso, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.EMSP__CSO, newCso, newCso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service_API getService_api() {
		if (service_api != null && service_api.eIsProxy()) {
			InternalEObject oldService_api = (InternalEObject)service_api;
			service_api = (Service_API)eResolveProxy(oldService_api);
			if (service_api != oldService_api) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.EMSP__SERVICE_API, oldService_api, service_api));
			}
		}
		return service_api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service_API basicGetService_api() {
		return service_api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService_api(Service_API newService_api) {
		Service_API oldService_api = service_api;
		service_api = newService_api;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.EMSP__SERVICE_API, oldService_api, service_api));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Web_Application getWeb_application() {
		if (web_application != null && web_application.eIsProxy()) {
			InternalEObject oldWeb_application = (InternalEObject)web_application;
			web_application = (Web_Application)eResolveProxy(oldWeb_application);
			if (web_application != oldWeb_application) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.EMSP__WEB_APPLICATION, oldWeb_application, web_application));
			}
		}
		return web_application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Web_Application basicGetWeb_application() {
		return web_application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeb_application(Web_Application newWeb_application) {
		Web_Application oldWeb_application = web_application;
		web_application = newWeb_application;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.EMSP__WEB_APPLICATION, oldWeb_application, web_application));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.EMSP__CLEARING_HOUSE, oldClearing_house, clearing_house));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmobilityPackage.EMSP__CLEARING_HOUSE, oldClearing_house, newClearing_house);
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
				msgs = ((InternalEObject)clearing_house).eInverseRemove(this, EmobilityPackage.CLEARING_HOUSE__EMSP, Clearing_House.class, msgs);
			if (newClearing_house != null)
				msgs = ((InternalEObject)newClearing_house).eInverseAdd(this, EmobilityPackage.CLEARING_HOUSE__EMSP, Clearing_House.class, msgs);
			msgs = basicSetClearing_house(newClearing_house, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.EMSP__CLEARING_HOUSE, newClearing_house, newClearing_house));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmobilityPackage.EMSP__CSO:
				if (cso != null)
					msgs = ((InternalEObject)cso).eInverseRemove(this, EmobilityPackage.CSO__EMSP, CSO.class, msgs);
				return basicSetCso((CSO)otherEnd, msgs);
			case EmobilityPackage.EMSP__CLEARING_HOUSE:
				if (clearing_house != null)
					msgs = ((InternalEObject)clearing_house).eInverseRemove(this, EmobilityPackage.CLEARING_HOUSE__EMSP, Clearing_House.class, msgs);
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
			case EmobilityPackage.EMSP__CSO:
				return basicSetCso(null, msgs);
			case EmobilityPackage.EMSP__CLEARING_HOUSE:
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
			case EmobilityPackage.EMSP__CSO:
				if (resolve) return getCso();
				return basicGetCso();
			case EmobilityPackage.EMSP__SERVICE_API:
				if (resolve) return getService_api();
				return basicGetService_api();
			case EmobilityPackage.EMSP__WEB_APPLICATION:
				if (resolve) return getWeb_application();
				return basicGetWeb_application();
			case EmobilityPackage.EMSP__CLEARING_HOUSE:
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
			case EmobilityPackage.EMSP__CSO:
				setCso((CSO)newValue);
				return;
			case EmobilityPackage.EMSP__SERVICE_API:
				setService_api((Service_API)newValue);
				return;
			case EmobilityPackage.EMSP__WEB_APPLICATION:
				setWeb_application((Web_Application)newValue);
				return;
			case EmobilityPackage.EMSP__CLEARING_HOUSE:
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
			case EmobilityPackage.EMSP__CSO:
				setCso((CSO)null);
				return;
			case EmobilityPackage.EMSP__SERVICE_API:
				setService_api((Service_API)null);
				return;
			case EmobilityPackage.EMSP__WEB_APPLICATION:
				setWeb_application((Web_Application)null);
				return;
			case EmobilityPackage.EMSP__CLEARING_HOUSE:
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
			case EmobilityPackage.EMSP__CSO:
				return cso != null;
			case EmobilityPackage.EMSP__SERVICE_API:
				return service_api != null;
			case EmobilityPackage.EMSP__WEB_APPLICATION:
				return web_application != null;
			case EmobilityPackage.EMSP__CLEARING_HOUSE:
				return clearing_house != null;
		}
		return super.eIsSet(featureID);
	}

} //eMSPImpl
