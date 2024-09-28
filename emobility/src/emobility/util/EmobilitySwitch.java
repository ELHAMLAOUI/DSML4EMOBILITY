/**
 */
package emobility.util;

import emobility.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage
 * @generated
 */
public class EmobilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmobilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmobilitySwitch() {
		if (modelPackage == null) {
			modelPackage = EmobilityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EmobilityPackage.CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS: {
				CS_operator_sys_to_from_CS_manag_sys cS_operator_sys_to_from_CS_manag_sys = (CS_operator_sys_to_from_CS_manag_sys)theEObject;
				T result = caseCS_operator_sys_to_from_CS_manag_sys(cS_operator_sys_to_from_CS_manag_sys);
				if (result == null) result = caseEMobility_Data(cS_operator_sys_to_from_CS_manag_sys);
				if (result == null) result = caseAsset(cS_operator_sys_to_from_CS_manag_sys);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.APP_TO_FROM_ROUTE_PLANNING: {
				App_to_from_Route_Planning app_to_from_Route_Planning = (App_to_from_Route_Planning)theEObject;
				T result = caseApp_to_from_Route_Planning(app_to_from_Route_Planning);
				if (result == null) result = caseEMobility_Data(app_to_from_Route_Planning);
				if (result == null) result = caseAsset(app_to_from_Route_Planning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.CSO: {
				CSO cso = (CSO)theEObject;
				T result = caseCSO(cso);
				if (result == null) result = caseEnergy_Transfer_Element(cso);
				if (result == null) result = caseEMobilityElement(cso);
				if (result == null) result = caseAsset(cso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.CS_CONTROLLER: {
				CS_Controller cS_Controller = (CS_Controller)theEObject;
				T result = caseCS_Controller(cS_Controller);
				if (result == null) result = caseEnergy_Transfer_Element(cS_Controller);
				if (result == null) result = caseEMobilityElement(cS_Controller);
				if (result == null) result = caseAsset(cS_Controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.ENERGY_CONVERSION_ELEMENT: {
				Energy_Conversion_Element energy_Conversion_Element = (Energy_Conversion_Element)theEObject;
				T result = caseEnergy_Conversion_Element(energy_Conversion_Element);
				if (result == null) result = caseEMobilityElement(energy_Conversion_Element);
				if (result == null) result = caseAsset(energy_Conversion_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.EMOBILITY_ELEMENT: {
				EMobilityElement eMobilityElement = (EMobilityElement)theEObject;
				T result = caseEMobilityElement(eMobilityElement);
				if (result == null) result = caseAsset(eMobilityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.CSMS: {
				CSMS csms = (CSMS)theEObject;
				T result = caseCSMS(csms);
				if (result == null) result = caseEnergy_Transfer_Element(csms);
				if (result == null) result = caseEMobilityElement(csms);
				if (result == null) result = caseAsset(csms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.EV_USER: {
				EV_User eV_User = (EV_User)theEObject;
				T result = caseEV_User(eV_User);
				if (result == null) result = caseEV_User_Element(eV_User);
				if (result == null) result = caseEMobilityElement(eV_User);
				if (result == null) result = caseAsset(eV_User);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.EMOBILITY_ARCHITECTURE: {
				EMobilityArchitecture eMobilityArchitecture = (EMobilityArchitecture)theEObject;
				T result = caseEMobilityArchitecture(eMobilityArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.DSO: {
				DSO dso = (DSO)theEObject;
				T result = caseDSO(dso);
				if (result == null) result = caseEnergy_Conversion_Element(dso);
				if (result == null) result = caseEMobilityElement(dso);
				if (result == null) result = caseAsset(dso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = caseEnergy_Transfer_Element(server);
				if (result == null) result = caseEMobilityElement(server);
				if (result == null) result = caseAsset(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.EVSE: {
				EVSE evse = (EVSE)theEObject;
				T result = caseEVSE(evse);
				if (result == null) result = caseEnergy_Transfer_Element(evse);
				if (result == null) result = caseEMobilityElement(evse);
				if (result == null) result = caseAsset(evse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.ENERGY_SUPPLIER: {
				Energy_Supplier energy_Supplier = (Energy_Supplier)theEObject;
				T result = caseEnergy_Supplier(energy_Supplier);
				if (result == null) result = caseEnergy_Conversion_Element(energy_Supplier);
				if (result == null) result = caseEMobilityElement(energy_Supplier);
				if (result == null) result = caseAsset(energy_Supplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.LAPTOP: {
				Laptop laptop = (Laptop)theEObject;
				T result = caseLaptop(laptop);
				if (result == null) result = caseEV_User_Element(laptop);
				if (result == null) result = caseEMobilityElement(laptop);
				if (result == null) result = caseAsset(laptop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.APP_TO_FROM_CS_OPERATOR_SYSTEM: {
				App_to_from_CS_operator_system app_to_from_CS_operator_system = (App_to_from_CS_operator_system)theEObject;
				T result = caseApp_to_from_CS_operator_system(app_to_from_CS_operator_system);
				if (result == null) result = caseEMobility_Data(app_to_from_CS_operator_system);
				if (result == null) result = caseAsset(app_to_from_CS_operator_system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.BROWSER: {
				Browser browser = (Browser)theEObject;
				T result = caseBrowser(browser);
				if (result == null) result = caseEV_User_Element(browser);
				if (result == null) result = caseEMobilityElement(browser);
				if (result == null) result = caseAsset(browser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.APP_TO_ENERGY_INFORMATION: {
				App_to_Energy_information app_to_Energy_information = (App_to_Energy_information)theEObject;
				T result = caseApp_to_Energy_information(app_to_Energy_information);
				if (result == null) result = caseEMobility_Data(app_to_Energy_information);
				if (result == null) result = caseAsset(app_to_Energy_information);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.BATTERY_HEALTH_TO_FROM_SENSORS: {
				Battery_health_to_from_Sensors battery_health_to_from_Sensors = (Battery_health_to_from_Sensors)theEObject;
				T result = caseBattery_health_to_from_Sensors(battery_health_to_from_Sensors);
				if (result == null) result = caseEMobility_Data(battery_health_to_from_Sensors);
				if (result == null) result = caseAsset(battery_health_to_from_Sensors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.SERVICE_API: {
				Service_API service_API = (Service_API)theEObject;
				T result = caseService_API(service_API);
				if (result == null) result = caseEV_User_Element(service_API);
				if (result == null) result = caseEMobilityElement(service_API);
				if (result == null) result = caseAsset(service_API);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.ELECTRIC_VEHICULE: {
				Electric_Vehicule electric_Vehicule = (Electric_Vehicule)theEObject;
				T result = caseElectric_Vehicule(electric_Vehicule);
				if (result == null) result = caseEMobilityElement(electric_Vehicule);
				if (result == null) result = caseAsset(electric_Vehicule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.MOBILE: {
				Mobile mobile = (Mobile)theEObject;
				T result = caseMobile(mobile);
				if (result == null) result = caseEV_User_Element(mobile);
				if (result == null) result = caseEMobilityElement(mobile);
				if (result == null) result = caseAsset(mobile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.CLEARING_HOUSE: {
				Clearing_House clearing_House = (Clearing_House)theEObject;
				T result = caseClearing_House(clearing_House);
				if (result == null) result = caseEV_User_Element(clearing_House);
				if (result == null) result = caseEMobilityElement(clearing_House);
				if (result == null) result = caseAsset(clearing_House);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.EMSP: {
				eMSP eMSP = (eMSP)theEObject;
				T result = caseeMSP(eMSP);
				if (result == null) result = caseEV_User_Element(eMSP);
				if (result == null) result = caseEMobilityElement(eMSP);
				if (result == null) result = caseAsset(eMSP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.APK: {
				APK apk = (APK)theEObject;
				T result = caseAPK(apk);
				if (result == null) result = caseEV_User_Element(apk);
				if (result == null) result = caseEMobilityElement(apk);
				if (result == null) result = caseAsset(apk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.APP_TO_FROM_BATTERY_HEALTH: {
				App_to_from_Battery_health app_to_from_Battery_health = (App_to_from_Battery_health)theEObject;
				T result = caseApp_to_from_Battery_health(app_to_from_Battery_health);
				if (result == null) result = caseEMobility_Data(app_to_from_Battery_health);
				if (result == null) result = caseAsset(app_to_from_Battery_health);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.CS_MANAG_SYS_TO_FROM_CS_CONTROLLER: {
				CS_manag_sys_to_from_CS_Controller cS_manag_sys_to_from_CS_Controller = (CS_manag_sys_to_from_CS_Controller)theEObject;
				T result = caseCS_manag_sys_to_from_CS_Controller(cS_manag_sys_to_from_CS_Controller);
				if (result == null) result = caseEMobility_Data(cS_manag_sys_to_from_CS_Controller);
				if (result == null) result = caseAsset(cS_manag_sys_to_from_CS_Controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.ENERGY_TRANSFER_ELEMENT: {
				Energy_Transfer_Element energy_Transfer_Element = (Energy_Transfer_Element)theEObject;
				T result = caseEnergy_Transfer_Element(energy_Transfer_Element);
				if (result == null) result = caseEMobilityElement(energy_Transfer_Element);
				if (result == null) result = caseAsset(energy_Transfer_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.EV_USER_ELEMENT: {
				EV_User_Element eV_User_Element = (EV_User_Element)theEObject;
				T result = caseEV_User_Element(eV_User_Element);
				if (result == null) result = caseEMobilityElement(eV_User_Element);
				if (result == null) result = caseAsset(eV_User_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.WEB_APPLICATION: {
				Web_Application web_Application = (Web_Application)theEObject;
				T result = caseWeb_Application(web_Application);
				if (result == null) result = caseEV_User_Element(web_Application);
				if (result == null) result = caseEMobilityElement(web_Application);
				if (result == null) result = caseAsset(web_Application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.EMOBILITY_DATA: {
				EMobility_Data eMobility_Data = (EMobility_Data)theEObject;
				T result = caseEMobility_Data(eMobility_Data);
				if (result == null) result = caseAsset(eMobility_Data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.ADMINISTRATOR: {
				Administrator administrator = (Administrator)theEObject;
				T result = caseAdministrator(administrator);
				if (result == null) result = caseEnergy_Transfer_Element(administrator);
				if (result == null) result = caseEMobilityElement(administrator);
				if (result == null) result = caseAsset(administrator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.COMMUNICATION: {
				Communication communication = (Communication)theEObject;
				T result = caseCommunication(communication);
				if (result == null) result = caseEMobilityElement(communication);
				if (result == null) result = caseAsset(communication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = caseEMobilityElement(domain);
				if (result == null) result = caseAsset(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.SECURITY_CONTROL: {
				SecurityControl securityControl = (SecurityControl)theEObject;
				T result = caseSecurityControl(securityControl);
				if (result == null) result = caseEMobilityElement(securityControl);
				if (result == null) result = caseAsset(securityControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.THREAT: {
				Threat threat = (Threat)theEObject;
				T result = caseThreat(threat);
				if (result == null) result = caseEMobilityElement(threat);
				if (result == null) result = caseAsset(threat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmobilityPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CS operator sys to from CS manag sys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CS operator sys to from CS manag sys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCS_operator_sys_to_from_CS_manag_sys(CS_operator_sys_to_from_CS_manag_sys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App to from Route Planning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App to from Route Planning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApp_to_from_Route_Planning(App_to_from_Route_Planning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSO(CSO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CS Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CS Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCS_Controller(CS_Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Conversion Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Conversion Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergy_Conversion_Element(Energy_Conversion_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMobility Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMobility Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMobilityElement(EMobilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMS(CSMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EV User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EV User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEV_User(EV_User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMobility Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMobility Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMobilityArchitecture(EMobilityArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSO(DSO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EVSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EVSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEVSE(EVSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergy_Supplier(Energy_Supplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Laptop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Laptop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaptop(Laptop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App to from CS operator system</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App to from CS operator system</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApp_to_from_CS_operator_system(App_to_from_CS_operator_system object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowser(Browser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App to Energy information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App to Energy information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApp_to_Energy_information(App_to_Energy_information object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery health to from Sensors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery health to from Sensors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBattery_health_to_from_Sensors(Battery_health_to_from_Sensors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService_API(Service_API object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electric Vehicule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electric Vehicule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectric_Vehicule(Electric_Vehicule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobile(Mobile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clearing House</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clearing House</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearing_House(Clearing_House object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>eMSP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>eMSP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseeMSP(eMSP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPK(APK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App to from Battery health</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App to from Battery health</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApp_to_from_Battery_health(App_to_from_Battery_health object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CS manag sys to from CS Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CS manag sys to from CS Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCS_manag_sys_to_from_CS_Controller(CS_manag_sys_to_from_CS_Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Transfer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Transfer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergy_Transfer_Element(Energy_Transfer_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EV User Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EV User Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEV_User_Element(EV_User_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeb_Application(Web_Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMobility Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMobility Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMobility_Data(EMobility_Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrator(Administrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunication(Communication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityControl(SecurityControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreat(Threat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EmobilitySwitch
