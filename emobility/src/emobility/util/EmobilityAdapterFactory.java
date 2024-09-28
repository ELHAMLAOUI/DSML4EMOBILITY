/**
 */
package emobility.util;

import emobility.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage
 * @generated
 */
public class EmobilityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmobilityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmobilityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EmobilityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmobilitySwitch<Adapter> modelSwitch =
		new EmobilitySwitch<Adapter>() {
			@Override
			public Adapter caseCS_operator_sys_to_from_CS_manag_sys(CS_operator_sys_to_from_CS_manag_sys object) {
				return createCS_operator_sys_to_from_CS_manag_sysAdapter();
			}
			@Override
			public Adapter caseApp_to_from_Route_Planning(App_to_from_Route_Planning object) {
				return createApp_to_from_Route_PlanningAdapter();
			}
			@Override
			public Adapter caseCSO(CSO object) {
				return createCSOAdapter();
			}
			@Override
			public Adapter caseCS_Controller(CS_Controller object) {
				return createCS_ControllerAdapter();
			}
			@Override
			public Adapter caseEnergy_Conversion_Element(Energy_Conversion_Element object) {
				return createEnergy_Conversion_ElementAdapter();
			}
			@Override
			public Adapter caseEMobilityElement(EMobilityElement object) {
				return createEMobilityElementAdapter();
			}
			@Override
			public Adapter caseCSMS(CSMS object) {
				return createCSMSAdapter();
			}
			@Override
			public Adapter caseEV_User(EV_User object) {
				return createEV_UserAdapter();
			}
			@Override
			public Adapter caseEMobilityArchitecture(EMobilityArchitecture object) {
				return createEMobilityArchitectureAdapter();
			}
			@Override
			public Adapter caseDSO(DSO object) {
				return createDSOAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseEVSE(EVSE object) {
				return createEVSEAdapter();
			}
			@Override
			public Adapter caseEnergy_Supplier(Energy_Supplier object) {
				return createEnergy_SupplierAdapter();
			}
			@Override
			public Adapter caseLaptop(Laptop object) {
				return createLaptopAdapter();
			}
			@Override
			public Adapter caseApp_to_from_CS_operator_system(App_to_from_CS_operator_system object) {
				return createApp_to_from_CS_operator_systemAdapter();
			}
			@Override
			public Adapter caseBrowser(Browser object) {
				return createBrowserAdapter();
			}
			@Override
			public Adapter caseApp_to_Energy_information(App_to_Energy_information object) {
				return createApp_to_Energy_informationAdapter();
			}
			@Override
			public Adapter caseBattery_health_to_from_Sensors(Battery_health_to_from_Sensors object) {
				return createBattery_health_to_from_SensorsAdapter();
			}
			@Override
			public Adapter caseService_API(Service_API object) {
				return createService_APIAdapter();
			}
			@Override
			public Adapter caseElectric_Vehicule(Electric_Vehicule object) {
				return createElectric_VehiculeAdapter();
			}
			@Override
			public Adapter caseMobile(Mobile object) {
				return createMobileAdapter();
			}
			@Override
			public Adapter caseClearing_House(Clearing_House object) {
				return createClearing_HouseAdapter();
			}
			@Override
			public Adapter caseeMSP(eMSP object) {
				return createeMSPAdapter();
			}
			@Override
			public Adapter caseAPK(APK object) {
				return createAPKAdapter();
			}
			@Override
			public Adapter caseApp_to_from_Battery_health(App_to_from_Battery_health object) {
				return createApp_to_from_Battery_healthAdapter();
			}
			@Override
			public Adapter caseCS_manag_sys_to_from_CS_Controller(CS_manag_sys_to_from_CS_Controller object) {
				return createCS_manag_sys_to_from_CS_ControllerAdapter();
			}
			@Override
			public Adapter caseEnergy_Transfer_Element(Energy_Transfer_Element object) {
				return createEnergy_Transfer_ElementAdapter();
			}
			@Override
			public Adapter caseEV_User_Element(EV_User_Element object) {
				return createEV_User_ElementAdapter();
			}
			@Override
			public Adapter caseWeb_Application(Web_Application object) {
				return createWeb_ApplicationAdapter();
			}
			@Override
			public Adapter caseEMobility_Data(EMobility_Data object) {
				return createEMobility_DataAdapter();
			}
			@Override
			public Adapter caseAdministrator(Administrator object) {
				return createAdministratorAdapter();
			}
			@Override
			public Adapter caseCommunication(Communication object) {
				return createCommunicationAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseSecurityControl(SecurityControl object) {
				return createSecurityControlAdapter();
			}
			@Override
			public Adapter caseThreat(Threat object) {
				return createThreatAdapter();
			}
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link emobility.CS_operator_sys_to_from_CS_manag_sys <em>CS operator sys to from CS manag sys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.CS_operator_sys_to_from_CS_manag_sys
	 * @generated
	 */
	public Adapter createCS_operator_sys_to_from_CS_manag_sysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.App_to_from_Route_Planning <em>App to from Route Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.App_to_from_Route_Planning
	 * @generated
	 */
	public Adapter createApp_to_from_Route_PlanningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.CSO <em>CSO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.CSO
	 * @generated
	 */
	public Adapter createCSOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.CS_Controller <em>CS Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.CS_Controller
	 * @generated
	 */
	public Adapter createCS_ControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Energy_Conversion_Element <em>Energy Conversion Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Energy_Conversion_Element
	 * @generated
	 */
	public Adapter createEnergy_Conversion_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.EMobilityElement <em>EMobility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.EMobilityElement
	 * @generated
	 */
	public Adapter createEMobilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.CSMS <em>CSMS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.CSMS
	 * @generated
	 */
	public Adapter createCSMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.EV_User <em>EV User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.EV_User
	 * @generated
	 */
	public Adapter createEV_UserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.EMobilityArchitecture <em>EMobility Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.EMobilityArchitecture
	 * @generated
	 */
	public Adapter createEMobilityArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.DSO <em>DSO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.DSO
	 * @generated
	 */
	public Adapter createDSOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.EVSE <em>EVSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.EVSE
	 * @generated
	 */
	public Adapter createEVSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Energy_Supplier <em>Energy Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Energy_Supplier
	 * @generated
	 */
	public Adapter createEnergy_SupplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Laptop <em>Laptop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Laptop
	 * @generated
	 */
	public Adapter createLaptopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.App_to_from_CS_operator_system <em>App to from CS operator system</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.App_to_from_CS_operator_system
	 * @generated
	 */
	public Adapter createApp_to_from_CS_operator_systemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Browser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Browser
	 * @generated
	 */
	public Adapter createBrowserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.App_to_Energy_information <em>App to Energy information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.App_to_Energy_information
	 * @generated
	 */
	public Adapter createApp_to_Energy_informationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Battery_health_to_from_Sensors <em>Battery health to from Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Battery_health_to_from_Sensors
	 * @generated
	 */
	public Adapter createBattery_health_to_from_SensorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Service_API <em>Service API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Service_API
	 * @generated
	 */
	public Adapter createService_APIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Electric_Vehicule <em>Electric Vehicule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Electric_Vehicule
	 * @generated
	 */
	public Adapter createElectric_VehiculeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Mobile <em>Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Mobile
	 * @generated
	 */
	public Adapter createMobileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Clearing_House <em>Clearing House</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Clearing_House
	 * @generated
	 */
	public Adapter createClearing_HouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.eMSP <em>eMSP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.eMSP
	 * @generated
	 */
	public Adapter createeMSPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.APK <em>APK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.APK
	 * @generated
	 */
	public Adapter createAPKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.App_to_from_Battery_health <em>App to from Battery health</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.App_to_from_Battery_health
	 * @generated
	 */
	public Adapter createApp_to_from_Battery_healthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.CS_manag_sys_to_from_CS_Controller <em>CS manag sys to from CS Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.CS_manag_sys_to_from_CS_Controller
	 * @generated
	 */
	public Adapter createCS_manag_sys_to_from_CS_ControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Energy_Transfer_Element <em>Energy Transfer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Energy_Transfer_Element
	 * @generated
	 */
	public Adapter createEnergy_Transfer_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.EV_User_Element <em>EV User Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.EV_User_Element
	 * @generated
	 */
	public Adapter createEV_User_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Web_Application <em>Web Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Web_Application
	 * @generated
	 */
	public Adapter createWeb_ApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.EMobility_Data <em>EMobility Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.EMobility_Data
	 * @generated
	 */
	public Adapter createEMobility_DataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Administrator
	 * @generated
	 */
	public Adapter createAdministratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Communication
	 * @generated
	 */
	public Adapter createCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.SecurityControl <em>Security Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.SecurityControl
	 * @generated
	 */
	public Adapter createSecurityControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Threat
	 * @generated
	 */
	public Adapter createThreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emobility.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emobility.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EmobilityAdapterFactory
