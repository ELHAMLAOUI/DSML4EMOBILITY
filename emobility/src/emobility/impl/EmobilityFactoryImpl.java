/**
 */
package emobility.impl;

import emobility.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmobilityFactoryImpl extends EFactoryImpl implements EmobilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmobilityFactory init() {
		try {
			EmobilityFactory theEmobilityFactory = (EmobilityFactory)EPackage.Registry.INSTANCE.getEFactory(EmobilityPackage.eNS_URI);
			if (theEmobilityFactory != null) {
				return theEmobilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmobilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmobilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmobilityPackage.CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS: return createCS_operator_sys_to_from_CS_manag_sys();
			case EmobilityPackage.APP_TO_FROM_ROUTE_PLANNING: return createApp_to_from_Route_Planning();
			case EmobilityPackage.CSO: return createCSO();
			case EmobilityPackage.CS_CONTROLLER: return createCS_Controller();
			case EmobilityPackage.CSMS: return createCSMS();
			case EmobilityPackage.EV_USER: return createEV_User();
			case EmobilityPackage.EMOBILITY_ARCHITECTURE: return createEMobilityArchitecture();
			case EmobilityPackage.DSO: return createDSO();
			case EmobilityPackage.SERVER: return createServer();
			case EmobilityPackage.EVSE: return createEVSE();
			case EmobilityPackage.ENERGY_SUPPLIER: return createEnergy_Supplier();
			case EmobilityPackage.LAPTOP: return createLaptop();
			case EmobilityPackage.APP_TO_FROM_CS_OPERATOR_SYSTEM: return createApp_to_from_CS_operator_system();
			case EmobilityPackage.BROWSER: return createBrowser();
			case EmobilityPackage.APP_TO_ENERGY_INFORMATION: return createApp_to_Energy_information();
			case EmobilityPackage.BATTERY_HEALTH_TO_FROM_SENSORS: return createBattery_health_to_from_Sensors();
			case EmobilityPackage.SERVICE_API: return createService_API();
			case EmobilityPackage.ELECTRIC_VEHICULE: return createElectric_Vehicule();
			case EmobilityPackage.MOBILE: return createMobile();
			case EmobilityPackage.CLEARING_HOUSE: return createClearing_House();
			case EmobilityPackage.EMSP: return createeMSP();
			case EmobilityPackage.APK: return createAPK();
			case EmobilityPackage.APP_TO_FROM_BATTERY_HEALTH: return createApp_to_from_Battery_health();
			case EmobilityPackage.CS_MANAG_SYS_TO_FROM_CS_CONTROLLER: return createCS_manag_sys_to_from_CS_Controller();
			case EmobilityPackage.WEB_APPLICATION: return createWeb_Application();
			case EmobilityPackage.ADMINISTRATOR: return createAdministrator();
			case EmobilityPackage.COMMUNICATION: return createCommunication();
			case EmobilityPackage.DOMAIN: return createDomain();
			case EmobilityPackage.SECURITY_CONTROL: return createSecurityControl();
			case EmobilityPackage.THREAT: return createThreat();
			case EmobilityPackage.ASSET: return createAsset();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EmobilityPackage.APP_TO_FROM_CS_OPERATOR_SYSTEM_CAT:
				return createApp_to_from_CS_operator_system_CatFromString(eDataType, initialValue);
			case EmobilityPackage.APP_TO_BATTERY_HEALTH_CAT:
				return createApp_to_Battery_health_CatFromString(eDataType, initialValue);
			case EmobilityPackage.APP_TO_FROM_FROM_ROUTE_PLANNING_CAT:
				return createApp_to_from_from_Route_Planning_CatFromString(eDataType, initialValue);
			case EmobilityPackage.APP_TO_FROM_ENERGY_INFORMATION_CAT:
				return createApp_to_from_Energy_information_CatFromString(eDataType, initialValue);
			case EmobilityPackage.CS_MANAG_SYS_TO_FROM_CS_CONTROLLER_CAT:
				return createCS_manag_sys_to_from_CS_Controller_CatFromString(eDataType, initialValue);
			case EmobilityPackage.CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS_CAT:
				return createCS_operator_sys_to_from_CS_manag_sys_CatFromString(eDataType, initialValue);
			case EmobilityPackage.MOS_TYPE:
				return createmOS_typeFromString(eDataType, initialValue);
			case EmobilityPackage.BATTERY_HEALTH_TO_FROM_SENSORS_CAT:
				return createBattery_health_to_from_Sensors_CatFromString(eDataType, initialValue);
			case EmobilityPackage.INFORMATION_PROTOCOL:
				return createInformation_ProtocolFromString(eDataType, initialValue);
			case EmobilityPackage.VENDOR_TYPE:
				return createVendor_TypeFromString(eDataType, initialValue);
			case EmobilityPackage.OS_TYPE:
				return createOS_TypeFromString(eDataType, initialValue);
			case EmobilityPackage.COMMUNICATION_PROTOCOL:
				return createCommunication_ProtocolFromString(eDataType, initialValue);
			case EmobilityPackage.SECURITY_CONTROLS:
				return createSecurity_ControlsFromString(eDataType, initialValue);
			case EmobilityPackage.CIA_LEVEL:
				return createCIA_LevelFromString(eDataType, initialValue);
			case EmobilityPackage.THREAT_CATEGORY:
				return createThreat_CategoryFromString(eDataType, initialValue);
			case EmobilityPackage.LIKELIHOOD_LEVEL:
				return createLikelihood_LevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EmobilityPackage.APP_TO_FROM_CS_OPERATOR_SYSTEM_CAT:
				return convertApp_to_from_CS_operator_system_CatToString(eDataType, instanceValue);
			case EmobilityPackage.APP_TO_BATTERY_HEALTH_CAT:
				return convertApp_to_Battery_health_CatToString(eDataType, instanceValue);
			case EmobilityPackage.APP_TO_FROM_FROM_ROUTE_PLANNING_CAT:
				return convertApp_to_from_from_Route_Planning_CatToString(eDataType, instanceValue);
			case EmobilityPackage.APP_TO_FROM_ENERGY_INFORMATION_CAT:
				return convertApp_to_from_Energy_information_CatToString(eDataType, instanceValue);
			case EmobilityPackage.CS_MANAG_SYS_TO_FROM_CS_CONTROLLER_CAT:
				return convertCS_manag_sys_to_from_CS_Controller_CatToString(eDataType, instanceValue);
			case EmobilityPackage.CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS_CAT:
				return convertCS_operator_sys_to_from_CS_manag_sys_CatToString(eDataType, instanceValue);
			case EmobilityPackage.MOS_TYPE:
				return convertmOS_typeToString(eDataType, instanceValue);
			case EmobilityPackage.BATTERY_HEALTH_TO_FROM_SENSORS_CAT:
				return convertBattery_health_to_from_Sensors_CatToString(eDataType, instanceValue);
			case EmobilityPackage.INFORMATION_PROTOCOL:
				return convertInformation_ProtocolToString(eDataType, instanceValue);
			case EmobilityPackage.VENDOR_TYPE:
				return convertVendor_TypeToString(eDataType, instanceValue);
			case EmobilityPackage.OS_TYPE:
				return convertOS_TypeToString(eDataType, instanceValue);
			case EmobilityPackage.COMMUNICATION_PROTOCOL:
				return convertCommunication_ProtocolToString(eDataType, instanceValue);
			case EmobilityPackage.SECURITY_CONTROLS:
				return convertSecurity_ControlsToString(eDataType, instanceValue);
			case EmobilityPackage.CIA_LEVEL:
				return convertCIA_LevelToString(eDataType, instanceValue);
			case EmobilityPackage.THREAT_CATEGORY:
				return convertThreat_CategoryToString(eDataType, instanceValue);
			case EmobilityPackage.LIKELIHOOD_LEVEL:
				return convertLikelihood_LevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS_operator_sys_to_from_CS_manag_sys createCS_operator_sys_to_from_CS_manag_sys() {
		CS_operator_sys_to_from_CS_manag_sysImpl cS_operator_sys_to_from_CS_manag_sys = new CS_operator_sys_to_from_CS_manag_sysImpl();
		return cS_operator_sys_to_from_CS_manag_sys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App_to_from_Route_Planning createApp_to_from_Route_Planning() {
		App_to_from_Route_PlanningImpl app_to_from_Route_Planning = new App_to_from_Route_PlanningImpl();
		return app_to_from_Route_Planning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSO createCSO() {
		CSOImpl cso = new CSOImpl();
		return cso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS_Controller createCS_Controller() {
		CS_ControllerImpl cS_Controller = new CS_ControllerImpl();
		return cS_Controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMS createCSMS() {
		CSMSImpl csms = new CSMSImpl();
		return csms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EV_User createEV_User() {
		EV_UserImpl eV_User = new EV_UserImpl();
		return eV_User;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMobilityArchitecture createEMobilityArchitecture() {
		EMobilityArchitectureImpl eMobilityArchitecture = new EMobilityArchitectureImpl();
		return eMobilityArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSO createDSO() {
		DSOImpl dso = new DSOImpl();
		return dso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVSE createEVSE() {
		EVSEImpl evse = new EVSEImpl();
		return evse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Energy_Supplier createEnergy_Supplier() {
		Energy_SupplierImpl energy_Supplier = new Energy_SupplierImpl();
		return energy_Supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Laptop createLaptop() {
		LaptopImpl laptop = new LaptopImpl();
		return laptop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App_to_from_CS_operator_system createApp_to_from_CS_operator_system() {
		App_to_from_CS_operator_systemImpl app_to_from_CS_operator_system = new App_to_from_CS_operator_systemImpl();
		return app_to_from_CS_operator_system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Browser createBrowser() {
		BrowserImpl browser = new BrowserImpl();
		return browser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App_to_Energy_information createApp_to_Energy_information() {
		App_to_Energy_informationImpl app_to_Energy_information = new App_to_Energy_informationImpl();
		return app_to_Energy_information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Battery_health_to_from_Sensors createBattery_health_to_from_Sensors() {
		Battery_health_to_from_SensorsImpl battery_health_to_from_Sensors = new Battery_health_to_from_SensorsImpl();
		return battery_health_to_from_Sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service_API createService_API() {
		Service_APIImpl service_API = new Service_APIImpl();
		return service_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Electric_Vehicule createElectric_Vehicule() {
		Electric_VehiculeImpl electric_Vehicule = new Electric_VehiculeImpl();
		return electric_Vehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mobile createMobile() {
		MobileImpl mobile = new MobileImpl();
		return mobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clearing_House createClearing_House() {
		Clearing_HouseImpl clearing_House = new Clearing_HouseImpl();
		return clearing_House;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eMSP createeMSP() {
		eMSPImpl eMSP = new eMSPImpl();
		return eMSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APK createAPK() {
		APKImpl apk = new APKImpl();
		return apk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App_to_from_Battery_health createApp_to_from_Battery_health() {
		App_to_from_Battery_healthImpl app_to_from_Battery_health = new App_to_from_Battery_healthImpl();
		return app_to_from_Battery_health;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS_manag_sys_to_from_CS_Controller createCS_manag_sys_to_from_CS_Controller() {
		CS_manag_sys_to_from_CS_ControllerImpl cS_manag_sys_to_from_CS_Controller = new CS_manag_sys_to_from_CS_ControllerImpl();
		return cS_manag_sys_to_from_CS_Controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Web_Application createWeb_Application() {
		Web_ApplicationImpl web_Application = new Web_ApplicationImpl();
		return web_Application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Administrator createAdministrator() {
		AdministratorImpl administrator = new AdministratorImpl();
		return administrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityControl createSecurityControl() {
		SecurityControlImpl securityControl = new SecurityControlImpl();
		return securityControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat createThreat() {
		ThreatImpl threat = new ThreatImpl();
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App_to_from_CS_operator_system_Cat createApp_to_from_CS_operator_system_CatFromString(EDataType eDataType, String initialValue) {
		App_to_from_CS_operator_system_Cat result = App_to_from_CS_operator_system_Cat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApp_to_from_CS_operator_system_CatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App_to_Battery_health_Cat createApp_to_Battery_health_CatFromString(EDataType eDataType, String initialValue) {
		App_to_Battery_health_Cat result = App_to_Battery_health_Cat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApp_to_Battery_health_CatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App_to_from_from_Route_Planning_Cat createApp_to_from_from_Route_Planning_CatFromString(EDataType eDataType, String initialValue) {
		App_to_from_from_Route_Planning_Cat result = App_to_from_from_Route_Planning_Cat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApp_to_from_from_Route_Planning_CatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App_to_from_Energy_information_Cat createApp_to_from_Energy_information_CatFromString(EDataType eDataType, String initialValue) {
		App_to_from_Energy_information_Cat result = App_to_from_Energy_information_Cat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApp_to_from_Energy_information_CatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS_manag_sys_to_from_CS_Controller_Cat createCS_manag_sys_to_from_CS_Controller_CatFromString(EDataType eDataType, String initialValue) {
		CS_manag_sys_to_from_CS_Controller_Cat result = CS_manag_sys_to_from_CS_Controller_Cat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCS_manag_sys_to_from_CS_Controller_CatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS_operator_sys_to_from_CS_manag_sys_Cat createCS_operator_sys_to_from_CS_manag_sys_CatFromString(EDataType eDataType, String initialValue) {
		CS_operator_sys_to_from_CS_manag_sys_Cat result = CS_operator_sys_to_from_CS_manag_sys_Cat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCS_operator_sys_to_from_CS_manag_sys_CatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mOS_type createmOS_typeFromString(EDataType eDataType, String initialValue) {
		mOS_type result = mOS_type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmOS_typeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Battery_health_to_from_Sensors_Cat createBattery_health_to_from_Sensors_CatFromString(EDataType eDataType, String initialValue) {
		Battery_health_to_from_Sensors_Cat result = Battery_health_to_from_Sensors_Cat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBattery_health_to_from_Sensors_CatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information_Protocol createInformation_ProtocolFromString(EDataType eDataType, String initialValue) {
		Information_Protocol result = Information_Protocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInformation_ProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor_Type createVendor_TypeFromString(EDataType eDataType, String initialValue) {
		Vendor_Type result = Vendor_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVendor_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OS_Type createOS_TypeFromString(EDataType eDataType, String initialValue) {
		OS_Type result = OS_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOS_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication_Protocol createCommunication_ProtocolFromString(EDataType eDataType, String initialValue) {
		Communication_Protocol result = Communication_Protocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunication_ProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security_Controls createSecurity_ControlsFromString(EDataType eDataType, String initialValue) {
		Security_Controls result = Security_Controls.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurity_ControlsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIA_Level createCIA_LevelFromString(EDataType eDataType, String initialValue) {
		CIA_Level result = CIA_Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIA_LevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat_Category createThreat_CategoryFromString(EDataType eDataType, String initialValue) {
		Threat_Category result = Threat_Category.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThreat_CategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Likelihood_Level createLikelihood_LevelFromString(EDataType eDataType, String initialValue) {
		Likelihood_Level result = Likelihood_Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLikelihood_LevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmobilityPackage getEmobilityPackage() {
		return (EmobilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmobilityPackage getPackage() {
		return EmobilityPackage.eINSTANCE;
	}

} //EmobilityFactoryImpl
