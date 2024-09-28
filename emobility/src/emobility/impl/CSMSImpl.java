/**
 */
package emobility.impl;

import emobility.CSMS;
import emobility.CS_Controller;
import emobility.EmobilityPackage;
import emobility.Server;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSMS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.CSMSImpl#getCs_controller <em>Cs controller</em>}</li>
 *   <li>{@link emobility.impl.CSMSImpl#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSMSImpl extends Energy_Transfer_ElementImpl implements CSMS {
	/**
	 * The cached value of the '{@link #getCs_controller() <em>Cs controller</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCs_controller()
	 * @generated
	 * @ordered
	 */
	protected EList<CS_Controller> cs_controller;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected Server server;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.CSMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS_Controller> getCs_controller() {
		if (cs_controller == null) {
			cs_controller = new EObjectResolvingEList<CS_Controller>(CS_Controller.class, this, EmobilityPackage.CSMS__CS_CONTROLLER);
		}
		return cs_controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (Server)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.CSMS__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		Server oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.CSMS__SERVER, oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmobilityPackage.CSMS__CS_CONTROLLER:
				return getCs_controller();
			case EmobilityPackage.CSMS__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
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
			case EmobilityPackage.CSMS__CS_CONTROLLER:
				getCs_controller().clear();
				getCs_controller().addAll((Collection<? extends CS_Controller>)newValue);
				return;
			case EmobilityPackage.CSMS__SERVER:
				setServer((Server)newValue);
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
			case EmobilityPackage.CSMS__CS_CONTROLLER:
				getCs_controller().clear();
				return;
			case EmobilityPackage.CSMS__SERVER:
				setServer((Server)null);
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
			case EmobilityPackage.CSMS__CS_CONTROLLER:
				return cs_controller != null && !cs_controller.isEmpty();
			case EmobilityPackage.CSMS__SERVER:
				return server != null;
		}
		return super.eIsSet(featureID);
	}

} //CSMSImpl
