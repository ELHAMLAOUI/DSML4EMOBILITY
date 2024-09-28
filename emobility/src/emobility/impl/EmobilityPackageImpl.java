/**
 */
package emobility.impl;

import emobility.Administrator;
import emobility.App_to_Battery_health_Cat;
import emobility.App_to_Energy_information;
import emobility.App_to_from_Battery_health;
import emobility.App_to_from_CS_operator_system;
import emobility.App_to_from_CS_operator_system_Cat;
import emobility.App_to_from_Energy_information_Cat;
import emobility.App_to_from_Route_Planning;
import emobility.App_to_from_from_Route_Planning_Cat;
import emobility.Asset;
import emobility.Battery_health_to_from_Sensors;
import emobility.Battery_health_to_from_Sensors_Cat;
import emobility.Browser;
import emobility.CIA_Level;
import emobility.CS_Controller;
import emobility.CS_manag_sys_to_from_CS_Controller;
import emobility.CS_manag_sys_to_from_CS_Controller_Cat;
import emobility.CS_operator_sys_to_from_CS_manag_sys;
import emobility.CS_operator_sys_to_from_CS_manag_sys_Cat;
import emobility.Clearing_House;
import emobility.Communication;
import emobility.Communication_Protocol;
import emobility.Domain;
import emobility.EMobilityArchitecture;
import emobility.EMobilityElement;
import emobility.EMobility_Data;
import emobility.EV_User;
import emobility.EV_User_Element;
import emobility.Electric_Vehicule;
import emobility.EmobilityFactory;
import emobility.EmobilityPackage;
import emobility.Energy_Conversion_Element;
import emobility.Energy_Supplier;
import emobility.Energy_Transfer_Element;
import emobility.Information_Protocol;
import emobility.Laptop;
import emobility.Likelihood_Level;
import emobility.Mobile;
import emobility.OS_Type;
import emobility.SecurityControl;
import emobility.Security_Controls;
import emobility.Server;
import emobility.Service_API;
import emobility.Threat;
import emobility.Threat_Category;
import emobility.Vendor_Type;
import emobility.Web_Application;
import emobility.eMSP;
import emobility.mOS_type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmobilityPackageImpl extends EPackageImpl implements EmobilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cS_operator_sys_to_from_CS_manag_sysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass app_to_from_Route_PlanningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cS_ControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energy_Conversion_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eMobilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eV_UserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eMobilityArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energy_SupplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laptopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass app_to_from_CS_operator_systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass app_to_Energy_informationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass battery_health_to_from_SensorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass service_APIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electric_VehiculeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearing_HouseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eMSPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass app_to_from_Battery_healthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cS_manag_sys_to_from_CS_ControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energy_Transfer_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eV_User_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass web_ApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eMobility_DataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum app_to_from_CS_operator_system_CatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum app_to_Battery_health_CatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum app_to_from_from_Route_Planning_CatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum app_to_from_Energy_information_CatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cS_manag_sys_to_from_CS_Controller_CatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cS_operator_sys_to_from_CS_manag_sys_CatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mOS_typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum battery_health_to_from_Sensors_CatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum information_ProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vendor_TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oS_TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communication_ProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum security_ControlsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ciA_LevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum threat_CategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum likelihood_LevelEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see emobility.EmobilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmobilityPackageImpl() {
		super(eNS_URI, EmobilityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EmobilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmobilityPackage init() {
		if (isInited) return (EmobilityPackage)EPackage.Registry.INSTANCE.getEPackage(EmobilityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEmobilityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EmobilityPackageImpl theEmobilityPackage = registeredEmobilityPackage instanceof EmobilityPackageImpl ? (EmobilityPackageImpl)registeredEmobilityPackage : new EmobilityPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEmobilityPackage.createPackageContents();

		// Initialize created meta-data
		theEmobilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmobilityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmobilityPackage.eNS_URI, theEmobilityPackage);
		return theEmobilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCS_operator_sys_to_from_CS_manag_sys() {
		return cS_operator_sys_to_from_CS_manag_sysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCS_operator_sys_to_from_CS_manag_sys_Data_type() {
		return (EAttribute)cS_operator_sys_to_from_CS_manag_sysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApp_to_from_Route_Planning() {
		return app_to_from_Route_PlanningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApp_to_from_Route_Planning_Data_type() {
		return (EAttribute)app_to_from_Route_PlanningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSO() {
		return csoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSO_Emsp() {
		return (EReference)csoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSO_Clearing_house() {
		return (EReference)csoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCS_Controller() {
		return cS_ControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCS_Controller_Evse() {
		return (EReference)cS_ControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergy_Conversion_Element() {
		return energy_Conversion_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMobilityElement() {
		return eMobilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMobilityElement_Name() {
		return (EAttribute)eMobilityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMobilityElement_Description() {
		return (EAttribute)eMobilityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMS() {
		return csmsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMS_Cs_controller() {
		return (EReference)csmsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMS_Server() {
		return (EReference)csmsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEV_User() {
		return eV_UserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEV_User_Laptop() {
		return (EReference)eV_UserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEV_User_Mobile() {
		return (EReference)eV_UserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMobilityArchitecture() {
		return eMobilityArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMobilityArchitecture_Emobilityelement() {
		return (EReference)eMobilityArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSO() {
		return dsoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Os_type() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEVSE() {
		return evseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEVSE_Electric_vehicule() {
		return (EReference)evseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergy_Supplier() {
		return energy_SupplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaptop() {
		return laptopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaptop_Browser() {
		return (EReference)laptopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApp_to_from_CS_operator_system() {
		return app_to_from_CS_operator_systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApp_to_from_CS_operator_system_Data_type() {
		return (EAttribute)app_to_from_CS_operator_systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowser() {
		return browserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApp_to_Energy_information() {
		return app_to_Energy_informationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApp_to_Energy_information_Data_type() {
		return (EAttribute)app_to_Energy_informationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBattery_health_to_from_Sensors() {
		return battery_health_to_from_SensorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBattery_health_to_from_Sensors_Data_type() {
		return (EAttribute)battery_health_to_from_SensorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService_API() {
		return service_APIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectric_Vehicule() {
		return electric_VehiculeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectric_Vehicule_Vendor() {
		return (EAttribute)electric_VehiculeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectric_Vehicule_Evse() {
		return (EReference)electric_VehiculeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobile() {
		return mobileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobile_Apk() {
		return (EReference)mobileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobile_OS() {
		return (EAttribute)mobileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobile_Browser() {
		return (EReference)mobileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearing_House() {
		return clearing_HouseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearing_House_Emsp() {
		return (EReference)clearing_HouseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearing_House_Cso() {
		return (EReference)clearing_HouseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass geteMSP() {
		return eMSPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference geteMSP_Cso() {
		return (EReference)eMSPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference geteMSP_Service_api() {
		return (EReference)eMSPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference geteMSP_Web_application() {
		return (EReference)eMSPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference geteMSP_Clearing_house() {
		return (EReference)eMSPEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPK() {
		return apkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApp_to_from_Battery_health() {
		return app_to_from_Battery_healthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApp_to_from_Battery_health_Data_type() {
		return (EAttribute)app_to_from_Battery_healthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCS_manag_sys_to_from_CS_Controller() {
		return cS_manag_sys_to_from_CS_ControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCS_manag_sys_to_from_CS_Controller_Data_type() {
		return (EAttribute)cS_manag_sys_to_from_CS_ControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergy_Transfer_Element() {
		return energy_Transfer_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEV_User_Element() {
		return eV_User_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeb_Application() {
		return web_ApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMobility_Data() {
		return eMobility_DataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrator() {
		return administratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrator_Csms() {
		return (EReference)administratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunication() {
		return communicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunication_Info_protocol() {
		return (EAttribute)communicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Source() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Destination() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunication_Comm_protocol() {
		return (EAttribute)communicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Emobility_data() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Emobilityelement() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Communication() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityControl() {
		return securityControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityControl_Type() {
		return (EAttribute)securityControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreat() {
		return threatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreat_Id() {
		return (EAttribute)threatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreat_Likelihood() {
		return (EAttribute)threatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreat_Asset() {
		return (EReference)threatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreat_Risk_level() {
		return (EAttribute)threatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_Availability() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_Integrity() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_Confidentiality() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsset_Securitycontrol() {
		return (EReference)assetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApp_to_from_CS_operator_system_Cat() {
		return app_to_from_CS_operator_system_CatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApp_to_Battery_health_Cat() {
		return app_to_Battery_health_CatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApp_to_from_from_Route_Planning_Cat() {
		return app_to_from_from_Route_Planning_CatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApp_to_from_Energy_information_Cat() {
		return app_to_from_Energy_information_CatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCS_manag_sys_to_from_CS_Controller_Cat() {
		return cS_manag_sys_to_from_CS_Controller_CatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCS_operator_sys_to_from_CS_manag_sys_Cat() {
		return cS_operator_sys_to_from_CS_manag_sys_CatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getmOS_type() {
		return mOS_typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBattery_health_to_from_Sensors_Cat() {
		return battery_health_to_from_Sensors_CatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInformation_Protocol() {
		return information_ProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVendor_Type() {
		return vendor_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOS_Type() {
		return oS_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunication_Protocol() {
		return communication_ProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurity_Controls() {
		return security_ControlsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCIA_Level() {
		return ciA_LevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getThreat_Category() {
		return threat_CategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLikelihood_Level() {
		return likelihood_LevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmobilityFactory getEmobilityFactory() {
		return (EmobilityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cS_operator_sys_to_from_CS_manag_sysEClass = createEClass(CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS);
		createEAttribute(cS_operator_sys_to_from_CS_manag_sysEClass, CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__DATA_TYPE);

		app_to_from_Route_PlanningEClass = createEClass(APP_TO_FROM_ROUTE_PLANNING);
		createEAttribute(app_to_from_Route_PlanningEClass, APP_TO_FROM_ROUTE_PLANNING__DATA_TYPE);

		csoEClass = createEClass(CSO);
		createEReference(csoEClass, CSO__EMSP);
		createEReference(csoEClass, CSO__CLEARING_HOUSE);

		cS_ControllerEClass = createEClass(CS_CONTROLLER);
		createEReference(cS_ControllerEClass, CS_CONTROLLER__EVSE);

		energy_Conversion_ElementEClass = createEClass(ENERGY_CONVERSION_ELEMENT);

		eMobilityElementEClass = createEClass(EMOBILITY_ELEMENT);
		createEAttribute(eMobilityElementEClass, EMOBILITY_ELEMENT__NAME);
		createEAttribute(eMobilityElementEClass, EMOBILITY_ELEMENT__DESCRIPTION);

		csmsEClass = createEClass(CSMS);
		createEReference(csmsEClass, CSMS__CS_CONTROLLER);
		createEReference(csmsEClass, CSMS__SERVER);

		eV_UserEClass = createEClass(EV_USER);
		createEReference(eV_UserEClass, EV_USER__LAPTOP);
		createEReference(eV_UserEClass, EV_USER__MOBILE);

		eMobilityArchitectureEClass = createEClass(EMOBILITY_ARCHITECTURE);
		createEReference(eMobilityArchitectureEClass, EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT);

		dsoEClass = createEClass(DSO);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__OS_TYPE);

		evseEClass = createEClass(EVSE);
		createEReference(evseEClass, EVSE__ELECTRIC_VEHICULE);

		energy_SupplierEClass = createEClass(ENERGY_SUPPLIER);

		laptopEClass = createEClass(LAPTOP);
		createEReference(laptopEClass, LAPTOP__BROWSER);

		app_to_from_CS_operator_systemEClass = createEClass(APP_TO_FROM_CS_OPERATOR_SYSTEM);
		createEAttribute(app_to_from_CS_operator_systemEClass, APP_TO_FROM_CS_OPERATOR_SYSTEM__DATA_TYPE);

		browserEClass = createEClass(BROWSER);

		app_to_Energy_informationEClass = createEClass(APP_TO_ENERGY_INFORMATION);
		createEAttribute(app_to_Energy_informationEClass, APP_TO_ENERGY_INFORMATION__DATA_TYPE);

		battery_health_to_from_SensorsEClass = createEClass(BATTERY_HEALTH_TO_FROM_SENSORS);
		createEAttribute(battery_health_to_from_SensorsEClass, BATTERY_HEALTH_TO_FROM_SENSORS__DATA_TYPE);

		service_APIEClass = createEClass(SERVICE_API);

		electric_VehiculeEClass = createEClass(ELECTRIC_VEHICULE);
		createEAttribute(electric_VehiculeEClass, ELECTRIC_VEHICULE__VENDOR);
		createEReference(electric_VehiculeEClass, ELECTRIC_VEHICULE__EVSE);

		mobileEClass = createEClass(MOBILE);
		createEReference(mobileEClass, MOBILE__APK);
		createEAttribute(mobileEClass, MOBILE__OS);
		createEReference(mobileEClass, MOBILE__BROWSER);

		clearing_HouseEClass = createEClass(CLEARING_HOUSE);
		createEReference(clearing_HouseEClass, CLEARING_HOUSE__EMSP);
		createEReference(clearing_HouseEClass, CLEARING_HOUSE__CSO);

		eMSPEClass = createEClass(EMSP);
		createEReference(eMSPEClass, EMSP__CSO);
		createEReference(eMSPEClass, EMSP__SERVICE_API);
		createEReference(eMSPEClass, EMSP__WEB_APPLICATION);
		createEReference(eMSPEClass, EMSP__CLEARING_HOUSE);

		apkEClass = createEClass(APK);

		app_to_from_Battery_healthEClass = createEClass(APP_TO_FROM_BATTERY_HEALTH);
		createEAttribute(app_to_from_Battery_healthEClass, APP_TO_FROM_BATTERY_HEALTH__DATA_TYPE);

		cS_manag_sys_to_from_CS_ControllerEClass = createEClass(CS_MANAG_SYS_TO_FROM_CS_CONTROLLER);
		createEAttribute(cS_manag_sys_to_from_CS_ControllerEClass, CS_MANAG_SYS_TO_FROM_CS_CONTROLLER__DATA_TYPE);

		energy_Transfer_ElementEClass = createEClass(ENERGY_TRANSFER_ELEMENT);

		eV_User_ElementEClass = createEClass(EV_USER_ELEMENT);

		web_ApplicationEClass = createEClass(WEB_APPLICATION);

		eMobility_DataEClass = createEClass(EMOBILITY_DATA);

		administratorEClass = createEClass(ADMINISTRATOR);
		createEReference(administratorEClass, ADMINISTRATOR__CSMS);

		communicationEClass = createEClass(COMMUNICATION);
		createEAttribute(communicationEClass, COMMUNICATION__INFO_PROTOCOL);
		createEReference(communicationEClass, COMMUNICATION__SOURCE);
		createEReference(communicationEClass, COMMUNICATION__DESTINATION);
		createEAttribute(communicationEClass, COMMUNICATION__COMM_PROTOCOL);
		createEReference(communicationEClass, COMMUNICATION__EMOBILITY_DATA);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__EMOBILITYELEMENT);
		createEReference(domainEClass, DOMAIN__COMMUNICATION);

		securityControlEClass = createEClass(SECURITY_CONTROL);
		createEAttribute(securityControlEClass, SECURITY_CONTROL__TYPE);

		threatEClass = createEClass(THREAT);
		createEAttribute(threatEClass, THREAT__ID);
		createEAttribute(threatEClass, THREAT__LIKELIHOOD);
		createEReference(threatEClass, THREAT__ASSET);
		createEAttribute(threatEClass, THREAT__RISK_LEVEL);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__AVAILABILITY);
		createEAttribute(assetEClass, ASSET__INTEGRITY);
		createEAttribute(assetEClass, ASSET__CONFIDENTIALITY);
		createEReference(assetEClass, ASSET__SECURITYCONTROL);

		// Create enums
		app_to_from_CS_operator_system_CatEEnum = createEEnum(APP_TO_FROM_CS_OPERATOR_SYSTEM_CAT);
		app_to_Battery_health_CatEEnum = createEEnum(APP_TO_BATTERY_HEALTH_CAT);
		app_to_from_from_Route_Planning_CatEEnum = createEEnum(APP_TO_FROM_FROM_ROUTE_PLANNING_CAT);
		app_to_from_Energy_information_CatEEnum = createEEnum(APP_TO_FROM_ENERGY_INFORMATION_CAT);
		cS_manag_sys_to_from_CS_Controller_CatEEnum = createEEnum(CS_MANAG_SYS_TO_FROM_CS_CONTROLLER_CAT);
		cS_operator_sys_to_from_CS_manag_sys_CatEEnum = createEEnum(CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS_CAT);
		mOS_typeEEnum = createEEnum(MOS_TYPE);
		battery_health_to_from_Sensors_CatEEnum = createEEnum(BATTERY_HEALTH_TO_FROM_SENSORS_CAT);
		information_ProtocolEEnum = createEEnum(INFORMATION_PROTOCOL);
		vendor_TypeEEnum = createEEnum(VENDOR_TYPE);
		oS_TypeEEnum = createEEnum(OS_TYPE);
		communication_ProtocolEEnum = createEEnum(COMMUNICATION_PROTOCOL);
		security_ControlsEEnum = createEEnum(SECURITY_CONTROLS);
		ciA_LevelEEnum = createEEnum(CIA_LEVEL);
		threat_CategoryEEnum = createEEnum(THREAT_CATEGORY);
		likelihood_LevelEEnum = createEEnum(LIKELIHOOD_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cS_operator_sys_to_from_CS_manag_sysEClass.getESuperTypes().add(this.getEMobility_Data());
		app_to_from_Route_PlanningEClass.getESuperTypes().add(this.getEMobility_Data());
		csoEClass.getESuperTypes().add(this.getEnergy_Transfer_Element());
		cS_ControllerEClass.getESuperTypes().add(this.getEnergy_Transfer_Element());
		energy_Conversion_ElementEClass.getESuperTypes().add(this.getEMobilityElement());
		eMobilityElementEClass.getESuperTypes().add(this.getAsset());
		csmsEClass.getESuperTypes().add(this.getEnergy_Transfer_Element());
		eV_UserEClass.getESuperTypes().add(this.getEV_User_Element());
		dsoEClass.getESuperTypes().add(this.getEnergy_Conversion_Element());
		serverEClass.getESuperTypes().add(this.getEnergy_Transfer_Element());
		evseEClass.getESuperTypes().add(this.getEnergy_Transfer_Element());
		energy_SupplierEClass.getESuperTypes().add(this.getEnergy_Conversion_Element());
		laptopEClass.getESuperTypes().add(this.getEV_User_Element());
		app_to_from_CS_operator_systemEClass.getESuperTypes().add(this.getEMobility_Data());
		browserEClass.getESuperTypes().add(this.getEV_User_Element());
		app_to_Energy_informationEClass.getESuperTypes().add(this.getEMobility_Data());
		battery_health_to_from_SensorsEClass.getESuperTypes().add(this.getEMobility_Data());
		service_APIEClass.getESuperTypes().add(this.getEV_User_Element());
		electric_VehiculeEClass.getESuperTypes().add(this.getEMobilityElement());
		mobileEClass.getESuperTypes().add(this.getEV_User_Element());
		clearing_HouseEClass.getESuperTypes().add(this.getEV_User_Element());
		eMSPEClass.getESuperTypes().add(this.getEV_User_Element());
		apkEClass.getESuperTypes().add(this.getEV_User_Element());
		app_to_from_Battery_healthEClass.getESuperTypes().add(this.getEMobility_Data());
		cS_manag_sys_to_from_CS_ControllerEClass.getESuperTypes().add(this.getEMobility_Data());
		energy_Transfer_ElementEClass.getESuperTypes().add(this.getEMobilityElement());
		eV_User_ElementEClass.getESuperTypes().add(this.getEMobilityElement());
		web_ApplicationEClass.getESuperTypes().add(this.getEV_User_Element());
		eMobility_DataEClass.getESuperTypes().add(this.getAsset());
		administratorEClass.getESuperTypes().add(this.getEnergy_Transfer_Element());
		communicationEClass.getESuperTypes().add(this.getEMobilityElement());
		domainEClass.getESuperTypes().add(this.getEMobilityElement());
		securityControlEClass.getESuperTypes().add(this.getEMobilityElement());
		threatEClass.getESuperTypes().add(this.getEMobilityElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(cS_operator_sys_to_from_CS_manag_sysEClass, CS_operator_sys_to_from_CS_manag_sys.class, "CS_operator_sys_to_from_CS_manag_sys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCS_operator_sys_to_from_CS_manag_sys_Data_type(), this.getCS_operator_sys_to_from_CS_manag_sys_Cat(), "data_type", null, 0, 1, CS_operator_sys_to_from_CS_manag_sys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(app_to_from_Route_PlanningEClass, App_to_from_Route_Planning.class, "App_to_from_Route_Planning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApp_to_from_Route_Planning_Data_type(), this.getApp_to_from_from_Route_Planning_Cat(), "data_type", null, 0, 1, App_to_from_Route_Planning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csoEClass, emobility.CSO.class, "CSO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSO_Emsp(), this.geteMSP(), this.geteMSP_Cso(), "emsp", null, 0, 1, emobility.CSO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSO_Clearing_house(), this.getClearing_House(), this.getClearing_House_Cso(), "clearing_house", null, 0, 1, emobility.CSO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cS_ControllerEClass, CS_Controller.class, "CS_Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCS_Controller_Evse(), this.getEVSE(), null, "evse", null, 0, -1, CS_Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energy_Conversion_ElementEClass, Energy_Conversion_Element.class, "Energy_Conversion_Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eMobilityElementEClass, EMobilityElement.class, "EMobilityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMobilityElement_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, EMobilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMobilityElement_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, EMobilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csmsEClass, emobility.CSMS.class, "CSMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSMS_Cs_controller(), this.getCS_Controller(), null, "cs_controller", null, 0, -1, emobility.CSMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMS_Server(), this.getServer(), null, "server", null, 0, 1, emobility.CSMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eV_UserEClass, EV_User.class, "EV_User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEV_User_Laptop(), this.getLaptop(), null, "laptop", null, 0, 1, EV_User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEV_User_Mobile(), this.getMobile(), null, "mobile", null, 0, 1, EV_User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eMobilityArchitectureEClass, EMobilityArchitecture.class, "EMobilityArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMobilityArchitecture_Emobilityelement(), this.getEMobilityElement(), null, "emobilityelement", null, 0, -1, EMobilityArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsoEClass, emobility.DSO.class, "DSO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_Os_type(), this.getOS_Type(), "os_type", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evseEClass, emobility.EVSE.class, "EVSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEVSE_Electric_vehicule(), this.getElectric_Vehicule(), this.getElectric_Vehicule_Evse(), "electric_vehicule", null, 0, 1, emobility.EVSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energy_SupplierEClass, Energy_Supplier.class, "Energy_Supplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(laptopEClass, Laptop.class, "Laptop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLaptop_Browser(), this.getBrowser(), null, "browser", null, 0, -1, Laptop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(app_to_from_CS_operator_systemEClass, App_to_from_CS_operator_system.class, "App_to_from_CS_operator_system", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApp_to_from_CS_operator_system_Data_type(), this.getApp_to_from_CS_operator_system_Cat(), "data_type", null, 0, 1, App_to_from_CS_operator_system.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(browserEClass, Browser.class, "Browser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(app_to_Energy_informationEClass, App_to_Energy_information.class, "App_to_Energy_information", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApp_to_Energy_information_Data_type(), this.getApp_to_from_Energy_information_Cat(), "data_type", null, 0, 1, App_to_Energy_information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(battery_health_to_from_SensorsEClass, Battery_health_to_from_Sensors.class, "Battery_health_to_from_Sensors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBattery_health_to_from_Sensors_Data_type(), this.getBattery_health_to_from_Sensors_Cat(), "data_type", null, 0, 1, Battery_health_to_from_Sensors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(service_APIEClass, Service_API.class, "Service_API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(electric_VehiculeEClass, Electric_Vehicule.class, "Electric_Vehicule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectric_Vehicule_Vendor(), this.getVendor_Type(), "vendor", null, 0, 1, Electric_Vehicule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElectric_Vehicule_Evse(), this.getEVSE(), this.getEVSE_Electric_vehicule(), "evse", null, 0, 1, Electric_Vehicule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobileEClass, Mobile.class, "Mobile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobile_Apk(), this.getAPK(), null, "apk", null, 0, -1, Mobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobile_OS(), this.getmOS_type(), "OS", null, 0, 1, Mobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobile_Browser(), this.getBrowser(), null, "browser", null, 0, -1, Mobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearing_HouseEClass, Clearing_House.class, "Clearing_House", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearing_House_Emsp(), this.geteMSP(), this.geteMSP_Clearing_house(), "emsp", null, 0, 1, Clearing_House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClearing_House_Cso(), this.getCSO(), this.getCSO_Clearing_house(), "cso", null, 0, 1, Clearing_House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eMSPEClass, eMSP.class, "eMSP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(geteMSP_Cso(), this.getCSO(), this.getCSO_Emsp(), "cso", null, 0, 1, eMSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(geteMSP_Service_api(), this.getService_API(), null, "service_api", null, 0, 1, eMSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(geteMSP_Web_application(), this.getWeb_Application(), null, "web_application", null, 0, 1, eMSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(geteMSP_Clearing_house(), this.getClearing_House(), this.getClearing_House_Emsp(), "clearing_house", null, 0, 1, eMSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apkEClass, emobility.APK.class, "APK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(app_to_from_Battery_healthEClass, App_to_from_Battery_health.class, "App_to_from_Battery_health", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApp_to_from_Battery_health_Data_type(), this.getApp_to_Battery_health_Cat(), "data_type", null, 0, 1, App_to_from_Battery_health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cS_manag_sys_to_from_CS_ControllerEClass, CS_manag_sys_to_from_CS_Controller.class, "CS_manag_sys_to_from_CS_Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCS_manag_sys_to_from_CS_Controller_Data_type(), this.getCS_manag_sys_to_from_CS_Controller_Cat(), "data_type", null, 0, 1, CS_manag_sys_to_from_CS_Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energy_Transfer_ElementEClass, Energy_Transfer_Element.class, "Energy_Transfer_Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eV_User_ElementEClass, EV_User_Element.class, "EV_User_Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(web_ApplicationEClass, Web_Application.class, "Web_Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eMobility_DataEClass, EMobility_Data.class, "EMobility_Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(administratorEClass, Administrator.class, "Administrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdministrator_Csms(), this.getCSMS(), null, "csms", null, 0, 1, Administrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationEClass, Communication.class, "Communication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunication_Info_protocol(), this.getInformation_Protocol(), "info_protocol", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_Source(), this.getEMobilityElement(), null, "source", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_Destination(), this.getEMobilityElement(), null, "destination", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunication_Comm_protocol(), this.getCommunication_Protocol(), "comm_protocol", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_Emobility_data(), this.getEMobility_Data(), null, "emobility_data", null, 0, -1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Emobilityelement(), this.getEMobilityElement(), null, "emobilityelement", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Communication(), this.getCommunication(), null, "communication", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityControlEClass, SecurityControl.class, "SecurityControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityControl_Type(), this.getSecurity_Controls(), "type", null, 0, 1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threatEClass, Threat.class, "Threat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreat_Id(), theXMLTypePackage.getIntObject(), "id", null, 0, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_Likelihood(), this.getLikelihood_Level(), "likelihood", null, 0, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreat_Asset(), this.getAsset(), null, "asset", null, 0, -1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_Risk_level(), theXMLTypePackage.getInteger(), "risk_level", null, 0, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_Availability(), this.getCIA_Level(), "Availability", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_Integrity(), this.getCIA_Level(), "Integrity", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_Confidentiality(), this.getCIA_Level(), "Confidentiality", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Securitycontrol(), this.getSecurityControl(), null, "securitycontrol", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(app_to_from_CS_operator_system_CatEEnum, App_to_from_CS_operator_system_Cat.class, "App_to_from_CS_operator_system_Cat");
		addEEnumLiteral(app_to_from_CS_operator_system_CatEEnum, App_to_from_CS_operator_system_Cat.GPS_COORDINATES_OF_AMIDDLE_POINT_ON_THE_TRIP);
		addEEnumLiteral(app_to_from_CS_operator_system_CatEEnum, App_to_from_CS_operator_system_Cat.RADIUS_VALUE_FOR_CHARGING_STATIONS_FILTERING);
		addEEnumLiteral(app_to_from_CS_operator_system_CatEEnum, App_to_from_CS_operator_system_Cat.GPS_COORDINATES);
		addEEnumLiteral(app_to_from_CS_operator_system_CatEEnum, App_to_from_CS_operator_system_Cat.CHARGING_STATION_ID);

		initEEnum(app_to_Battery_health_CatEEnum, App_to_Battery_health_Cat.class, "App_to_Battery_health_Cat");
		addEEnumLiteral(app_to_Battery_health_CatEEnum, App_to_Battery_health_Cat.PARKING_SO_CNAMBIENT_TEMP);
		addEEnumLiteral(app_to_Battery_health_CatEEnum, App_to_Battery_health_Cat.DRIVING_SO_CDISCHARGE_RATE_NAMBIENT_TEMP);
		addEEnumLiteral(app_to_Battery_health_CatEEnum, App_to_Battery_health_Cat.TEXTUAL_DESCRIPTION);
		addEEnumLiteral(app_to_Battery_health_CatEEnum, App_to_Battery_health_Cat.RATIONALE);
		addEEnumLiteral(app_to_Battery_health_CatEEnum, App_to_Battery_health_Cat.WEIGHING_FACTOR_FOR_PRIORITIES);

		initEEnum(app_to_from_from_Route_Planning_CatEEnum, App_to_from_from_Route_Planning_Cat.class, "App_to_from_from_Route_Planning_Cat");
		addEEnumLiteral(app_to_from_from_Route_Planning_CatEEnum, App_to_from_from_Route_Planning_Cat.GPS_COORDINATES_SOURCE_NDESTINATION);
		addEEnumLiteral(app_to_from_from_Route_Planning_CatEEnum, App_to_from_from_Route_Planning_Cat.LIST_OF_GPS_COORDINATES_NEEDED_FOR_NAVIGATION);
		addEEnumLiteral(app_to_from_from_Route_Planning_CatEEnum, App_to_from_from_Route_Planning_Cat.TRAFFIC_INFORMATION);

		initEEnum(app_to_from_Energy_information_CatEEnum, App_to_from_Energy_information_Cat.class, "App_to_from_Energy_information_Cat");
		addEEnumLiteral(app_to_from_Energy_information_CatEEnum, App_to_from_Energy_information_Cat.COUNTRY_CODE);
		addEEnumLiteral(app_to_from_Energy_information_CatEEnum, App_to_from_Energy_information_Cat.START_NEND_TIMES);
		addEEnumLiteral(app_to_from_Energy_information_CatEEnum, App_to_from_Energy_information_Cat.PERCENT_OF_RENEWABLES);
		addEEnumLiteral(app_to_from_Energy_information_CatEEnum, App_to_from_Energy_information_Cat.ENERGY_MARKET_PRICE);

		initEEnum(cS_manag_sys_to_from_CS_Controller_CatEEnum, CS_manag_sys_to_from_CS_Controller_Cat.class, "CS_manag_sys_to_from_CS_Controller_Cat");
		addEEnumLiteral(cS_manag_sys_to_from_CS_Controller_CatEEnum, CS_manag_sys_to_from_CS_Controller_Cat.CHARGING_STATION_ID);
		addEEnumLiteral(cS_manag_sys_to_from_CS_Controller_CatEEnum, CS_manag_sys_to_from_CS_Controller_Cat.CONNECTOR_ID);
		addEEnumLiteral(cS_manag_sys_to_from_CS_Controller_CatEEnum, CS_manag_sys_to_from_CS_Controller_Cat.STATUS_INFORMATION);

		initEEnum(cS_operator_sys_to_from_CS_manag_sys_CatEEnum, CS_operator_sys_to_from_CS_manag_sys_Cat.class, "CS_operator_sys_to_from_CS_manag_sys_Cat");
		addEEnumLiteral(cS_operator_sys_to_from_CS_manag_sys_CatEEnum, CS_operator_sys_to_from_CS_manag_sys_Cat.CONNECTOR_ID_TYPE_NSTANDARD);
		addEEnumLiteral(cS_operator_sys_to_from_CS_manag_sys_CatEEnum, CS_operator_sys_to_from_CS_manag_sys_Cat.MAXIMUM_CAPACITY);
		addEEnumLiteral(cS_operator_sys_to_from_CS_manag_sys_CatEEnum, CS_operator_sys_to_from_CS_manag_sys_Cat.CHARGING_STATION_ID);

		initEEnum(mOS_typeEEnum, mOS_type.class, "mOS_type");
		addEEnumLiteral(mOS_typeEEnum, mOS_type.ANDROID);
		addEEnumLiteral(mOS_typeEEnum, mOS_type.IOS);

		initEEnum(battery_health_to_from_Sensors_CatEEnum, Battery_health_to_from_Sensors_Cat.class, "Battery_health_to_from_Sensors_Cat");
		addEEnumLiteral(battery_health_to_from_Sensors_CatEEnum, Battery_health_to_from_Sensors_Cat.VEHICLE_IDENTIFICATION_NUMBER);
		addEEnumLiteral(battery_health_to_from_Sensors_CatEEnum, Battery_health_to_from_Sensors_Cat.STATE_OF_CHARGE);
		addEEnumLiteral(battery_health_to_from_Sensors_CatEEnum, Battery_health_to_from_Sensors_Cat.REMAINING_RANGE);

		initEEnum(information_ProtocolEEnum, Information_Protocol.class, "Information_Protocol");
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.ISO_IEC_15118);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.ISO_61851);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.OCPP);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.OSCP);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.OPEN_ADR);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.OCPI);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.OCHP_DIRECT);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.OIPC);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.OCHP);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.EMIP);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.OASIS_EMIX);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.ENERGY_INTEROP);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.IEC_62325);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.EN_6232_301_351_ENTSO_EMADES);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.IEEE_2023_5);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.IEC_61850);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.XDLMS_COSEM);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.IEC_61850_90_8);
		addEEnumLiteral(information_ProtocolEEnum, Information_Protocol.API_REST);

		initEEnum(vendor_TypeEEnum, Vendor_Type.class, "Vendor_Type");
		addEEnumLiteral(vendor_TypeEEnum, Vendor_Type.TESLA);
		addEEnumLiteral(vendor_TypeEEnum, Vendor_Type.BMW);
		addEEnumLiteral(vendor_TypeEEnum, Vendor_Type.RENAULT_NISSAN_MITSUBISHI);
		addEEnumLiteral(vendor_TypeEEnum, Vendor_Type.MERCERDES_BENZ);
		addEEnumLiteral(vendor_TypeEEnum, Vendor_Type.GEELY_AUTO_GROUP);
		addEEnumLiteral(vendor_TypeEEnum, Vendor_Type.HYUNDAI);
		addEEnumLiteral(vendor_TypeEEnum, Vendor_Type.STELLANTIS);
		addEEnumLiteral(vendor_TypeEEnum, Vendor_Type.VOLKSWAGEN);
		addEEnumLiteral(vendor_TypeEEnum, Vendor_Type.BYD);

		initEEnum(oS_TypeEEnum, OS_Type.class, "OS_Type");
		addEEnumLiteral(oS_TypeEEnum, OS_Type.LINUX);
		addEEnumLiteral(oS_TypeEEnum, OS_Type.WINDOWS);

		initEEnum(communication_ProtocolEEnum, Communication_Protocol.class, "Communication_Protocol");
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.HTTP);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.HTTPS);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.TCP_IP);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.CAN);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.FLEXRAY);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.ETHERNET);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.TCP_IP_XML);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.PWM);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.CAN_CH_ADE_MO);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.ASN_1MMS);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.EN_13321);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.HBES_KNX);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.ETHERNET_WIFI);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.IEC_61968_100_ENERGY_MARKETS);
		addEEnumLiteral(communication_ProtocolEEnum, Communication_Protocol.EN_62325_450_451_MARKETPLACE);

		initEEnum(security_ControlsEEnum, Security_Controls.class, "Security_Controls");
		addEEnumLiteral(security_ControlsEEnum, Security_Controls.ENCRYPTION);
		addEEnumLiteral(security_ControlsEEnum, Security_Controls.WAF);
		addEEnumLiteral(security_ControlsEEnum, Security_Controls.IP_FILTERING);
		addEEnumLiteral(security_ControlsEEnum, Security_Controls.ANTIMALWARE);
		addEEnumLiteral(security_ControlsEEnum, Security_Controls.IPS_IDS);
		addEEnumLiteral(security_ControlsEEnum, Security_Controls.AUTHENTICATION);
		addEEnumLiteral(security_ControlsEEnum, Security_Controls.API_MANAGEMENT);

		initEEnum(ciA_LevelEEnum, CIA_Level.class, "CIA_Level");
		addEEnumLiteral(ciA_LevelEEnum, CIA_Level.L1);
		addEEnumLiteral(ciA_LevelEEnum, CIA_Level.L2);
		addEEnumLiteral(ciA_LevelEEnum, CIA_Level.L3);
		addEEnumLiteral(ciA_LevelEEnum, CIA_Level.L4);

		initEEnum(threat_CategoryEEnum, Threat_Category.class, "Threat_Category");
		addEEnumLiteral(threat_CategoryEEnum, Threat_Category.SPOOFING);
		addEEnumLiteral(threat_CategoryEEnum, Threat_Category.TAMPERING);
		addEEnumLiteral(threat_CategoryEEnum, Threat_Category.REPUDIATION);
		addEEnumLiteral(threat_CategoryEEnum, Threat_Category.INFORMATION_DISCLOSURE);
		addEEnumLiteral(threat_CategoryEEnum, Threat_Category.DENIAL_OF_SERVICE);
		addEEnumLiteral(threat_CategoryEEnum, Threat_Category.ELEVATION_OF_PRIVILEGE);

		initEEnum(likelihood_LevelEEnum, Likelihood_Level.class, "Likelihood_Level");
		addEEnumLiteral(likelihood_LevelEEnum, Likelihood_Level.L3);
		addEEnumLiteral(likelihood_LevelEEnum, Likelihood_Level.L4);
		addEEnumLiteral(likelihood_LevelEEnum, Likelihood_Level.L1);
		addEEnumLiteral(likelihood_LevelEEnum, Likelihood_Level.L2);

		// Create resource
		createResource(eNS_URI);
	}

} //EmobilityPackageImpl
