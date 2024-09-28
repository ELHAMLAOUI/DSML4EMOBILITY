/**
 */
package emobility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see emobility.EmobilityFactory
 * @model kind="package"
 * @generated
 */
public interface EmobilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emobility";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/emobility";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emobility";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmobilityPackage eINSTANCE = emobility.impl.EmobilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link emobility.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.AssetImpl
	 * @see emobility.impl.EmobilityPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 35;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__AVAILABILITY = 0;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__INTEGRITY = 1;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CONFIDENTIALITY = 2;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__SECURITYCONTROL = 3;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emobility.impl.EMobility_DataImpl <em>EMobility Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.EMobility_DataImpl
	 * @see emobility.impl.EmobilityPackageImpl#getEMobility_Data()
	 * @generated
	 */
	int EMOBILITY_DATA = 29;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_DATA__AVAILABILITY = ASSET__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_DATA__INTEGRITY = ASSET__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_DATA__CONFIDENTIALITY = ASSET__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_DATA__SECURITYCONTROL = ASSET__SECURITYCONTROL;

	/**
	 * The number of structural features of the '<em>EMobility Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_DATA_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EMobility Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_DATA_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.CS_operator_sys_to_from_CS_manag_sysImpl <em>CS operator sys to from CS manag sys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.CS_operator_sys_to_from_CS_manag_sysImpl
	 * @see emobility.impl.EmobilityPackageImpl#getCS_operator_sys_to_from_CS_manag_sys()
	 * @generated
	 */
	int CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS = 0;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__AVAILABILITY = EMOBILITY_DATA__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__INTEGRITY = EMOBILITY_DATA__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__CONFIDENTIALITY = EMOBILITY_DATA__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__SECURITYCONTROL = EMOBILITY_DATA__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Data type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__DATA_TYPE = EMOBILITY_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CS operator sys to from CS manag sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS_FEATURE_COUNT = EMOBILITY_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CS operator sys to from CS manag sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS_OPERATION_COUNT = EMOBILITY_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.App_to_from_Route_PlanningImpl <em>App to from Route Planning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.App_to_from_Route_PlanningImpl
	 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_Route_Planning()
	 * @generated
	 */
	int APP_TO_FROM_ROUTE_PLANNING = 1;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_ROUTE_PLANNING__AVAILABILITY = EMOBILITY_DATA__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_ROUTE_PLANNING__INTEGRITY = EMOBILITY_DATA__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_ROUTE_PLANNING__CONFIDENTIALITY = EMOBILITY_DATA__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_ROUTE_PLANNING__SECURITYCONTROL = EMOBILITY_DATA__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Data type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_ROUTE_PLANNING__DATA_TYPE = EMOBILITY_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>App to from Route Planning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_ROUTE_PLANNING_FEATURE_COUNT = EMOBILITY_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>App to from Route Planning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_ROUTE_PLANNING_OPERATION_COUNT = EMOBILITY_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.EMobilityElementImpl <em>EMobility Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.EMobilityElementImpl
	 * @see emobility.impl.EmobilityPackageImpl#getEMobilityElement()
	 * @generated
	 */
	int EMOBILITY_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_ELEMENT__AVAILABILITY = ASSET__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_ELEMENT__INTEGRITY = ASSET__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_ELEMENT__CONFIDENTIALITY = ASSET__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_ELEMENT__SECURITYCONTROL = ASSET__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_ELEMENT__NAME = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_ELEMENT__DESCRIPTION = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMobility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_ELEMENT_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EMobility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_ELEMENT_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.Energy_Transfer_ElementImpl <em>Energy Transfer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.Energy_Transfer_ElementImpl
	 * @see emobility.impl.EmobilityPackageImpl#getEnergy_Transfer_Element()
	 * @generated
	 */
	int ENERGY_TRANSFER_ELEMENT = 26;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSFER_ELEMENT__AVAILABILITY = EMOBILITY_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSFER_ELEMENT__INTEGRITY = EMOBILITY_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSFER_ELEMENT__CONFIDENTIALITY = EMOBILITY_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSFER_ELEMENT__SECURITYCONTROL = EMOBILITY_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSFER_ELEMENT__NAME = EMOBILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSFER_ELEMENT__DESCRIPTION = EMOBILITY_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Energy Transfer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT = EMOBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Energy Transfer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_TRANSFER_ELEMENT_OPERATION_COUNT = EMOBILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.CSOImpl <em>CSO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.CSOImpl
	 * @see emobility.impl.EmobilityPackageImpl#getCSO()
	 * @generated
	 */
	int CSO = 2;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSO__AVAILABILITY = ENERGY_TRANSFER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSO__INTEGRITY = ENERGY_TRANSFER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSO__CONFIDENTIALITY = ENERGY_TRANSFER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSO__SECURITYCONTROL = ENERGY_TRANSFER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSO__NAME = ENERGY_TRANSFER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSO__DESCRIPTION = ENERGY_TRANSFER_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Emsp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSO__EMSP = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clearing house</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSO__CLEARING_HOUSE = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CSO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSO_FEATURE_COUNT = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CSO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSO_OPERATION_COUNT = ENERGY_TRANSFER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.CS_ControllerImpl <em>CS Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.CS_ControllerImpl
	 * @see emobility.impl.EmobilityPackageImpl#getCS_Controller()
	 * @generated
	 */
	int CS_CONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONTROLLER__AVAILABILITY = ENERGY_TRANSFER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONTROLLER__INTEGRITY = ENERGY_TRANSFER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONTROLLER__CONFIDENTIALITY = ENERGY_TRANSFER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONTROLLER__SECURITYCONTROL = ENERGY_TRANSFER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONTROLLER__NAME = ENERGY_TRANSFER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONTROLLER__DESCRIPTION = ENERGY_TRANSFER_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Evse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONTROLLER__EVSE = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CS Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONTROLLER_FEATURE_COUNT = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CS Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONTROLLER_OPERATION_COUNT = ENERGY_TRANSFER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.Energy_Conversion_ElementImpl <em>Energy Conversion Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.Energy_Conversion_ElementImpl
	 * @see emobility.impl.EmobilityPackageImpl#getEnergy_Conversion_Element()
	 * @generated
	 */
	int ENERGY_CONVERSION_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONVERSION_ELEMENT__AVAILABILITY = EMOBILITY_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONVERSION_ELEMENT__INTEGRITY = EMOBILITY_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONVERSION_ELEMENT__CONFIDENTIALITY = EMOBILITY_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONVERSION_ELEMENT__SECURITYCONTROL = EMOBILITY_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONVERSION_ELEMENT__NAME = EMOBILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONVERSION_ELEMENT__DESCRIPTION = EMOBILITY_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Energy Conversion Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONVERSION_ELEMENT_FEATURE_COUNT = EMOBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Energy Conversion Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONVERSION_ELEMENT_OPERATION_COUNT = EMOBILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.CSMSImpl <em>CSMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.CSMSImpl
	 * @see emobility.impl.EmobilityPackageImpl#getCSMS()
	 * @generated
	 */
	int CSMS = 6;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMS__AVAILABILITY = ENERGY_TRANSFER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMS__INTEGRITY = ENERGY_TRANSFER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMS__CONFIDENTIALITY = ENERGY_TRANSFER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMS__SECURITYCONTROL = ENERGY_TRANSFER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMS__NAME = ENERGY_TRANSFER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMS__DESCRIPTION = ENERGY_TRANSFER_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cs controller</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMS__CS_CONTROLLER = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMS__SERVER = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CSMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMS_FEATURE_COUNT = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CSMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMS_OPERATION_COUNT = ENERGY_TRANSFER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.EV_User_ElementImpl <em>EV User Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.EV_User_ElementImpl
	 * @see emobility.impl.EmobilityPackageImpl#getEV_User_Element()
	 * @generated
	 */
	int EV_USER_ELEMENT = 27;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER_ELEMENT__AVAILABILITY = EMOBILITY_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER_ELEMENT__INTEGRITY = EMOBILITY_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER_ELEMENT__CONFIDENTIALITY = EMOBILITY_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER_ELEMENT__SECURITYCONTROL = EMOBILITY_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER_ELEMENT__NAME = EMOBILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER_ELEMENT__DESCRIPTION = EMOBILITY_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>EV User Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER_ELEMENT_FEATURE_COUNT = EMOBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EV User Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER_ELEMENT_OPERATION_COUNT = EMOBILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.EV_UserImpl <em>EV User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.EV_UserImpl
	 * @see emobility.impl.EmobilityPackageImpl#getEV_User()
	 * @generated
	 */
	int EV_USER = 7;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER__AVAILABILITY = EV_USER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER__INTEGRITY = EV_USER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER__CONFIDENTIALITY = EV_USER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER__SECURITYCONTROL = EV_USER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER__NAME = EV_USER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER__DESCRIPTION = EV_USER_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Laptop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER__LAPTOP = EV_USER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mobile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER__MOBILE = EV_USER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EV User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER_FEATURE_COUNT = EV_USER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EV User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_USER_OPERATION_COUNT = EV_USER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.EMobilityArchitectureImpl <em>EMobility Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.EMobilityArchitectureImpl
	 * @see emobility.impl.EmobilityPackageImpl#getEMobilityArchitecture()
	 * @generated
	 */
	int EMOBILITY_ARCHITECTURE = 8;

	/**
	 * The feature id for the '<em><b>Emobilityelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT = 0;

	/**
	 * The number of structural features of the '<em>EMobility Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_ARCHITECTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EMobility Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOBILITY_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emobility.impl.DSOImpl <em>DSO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.DSOImpl
	 * @see emobility.impl.EmobilityPackageImpl#getDSO()
	 * @generated
	 */
	int DSO = 9;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSO__AVAILABILITY = ENERGY_CONVERSION_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSO__INTEGRITY = ENERGY_CONVERSION_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSO__CONFIDENTIALITY = ENERGY_CONVERSION_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSO__SECURITYCONTROL = ENERGY_CONVERSION_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSO__NAME = ENERGY_CONVERSION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSO__DESCRIPTION = ENERGY_CONVERSION_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>DSO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSO_FEATURE_COUNT = ENERGY_CONVERSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DSO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSO_OPERATION_COUNT = ENERGY_CONVERSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.ServerImpl
	 * @see emobility.impl.EmobilityPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 10;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__AVAILABILITY = ENERGY_TRANSFER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__INTEGRITY = ENERGY_TRANSFER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONFIDENTIALITY = ENERGY_TRANSFER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SECURITYCONTROL = ENERGY_TRANSFER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = ENERGY_TRANSFER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DESCRIPTION = ENERGY_TRANSFER_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Os type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OS_TYPE = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = ENERGY_TRANSFER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.EVSEImpl <em>EVSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.EVSEImpl
	 * @see emobility.impl.EmobilityPackageImpl#getEVSE()
	 * @generated
	 */
	int EVSE = 11;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVSE__AVAILABILITY = ENERGY_TRANSFER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVSE__INTEGRITY = ENERGY_TRANSFER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVSE__CONFIDENTIALITY = ENERGY_TRANSFER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVSE__SECURITYCONTROL = ENERGY_TRANSFER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVSE__NAME = ENERGY_TRANSFER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVSE__DESCRIPTION = ENERGY_TRANSFER_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Electric vehicule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVSE__ELECTRIC_VEHICULE = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EVSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVSE_FEATURE_COUNT = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EVSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVSE_OPERATION_COUNT = ENERGY_TRANSFER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.Energy_SupplierImpl <em>Energy Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.Energy_SupplierImpl
	 * @see emobility.impl.EmobilityPackageImpl#getEnergy_Supplier()
	 * @generated
	 */
	int ENERGY_SUPPLIER = 12;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SUPPLIER__AVAILABILITY = ENERGY_CONVERSION_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SUPPLIER__INTEGRITY = ENERGY_CONVERSION_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SUPPLIER__CONFIDENTIALITY = ENERGY_CONVERSION_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SUPPLIER__SECURITYCONTROL = ENERGY_CONVERSION_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SUPPLIER__NAME = ENERGY_CONVERSION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SUPPLIER__DESCRIPTION = ENERGY_CONVERSION_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Energy Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SUPPLIER_FEATURE_COUNT = ENERGY_CONVERSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Energy Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SUPPLIER_OPERATION_COUNT = ENERGY_CONVERSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.LaptopImpl <em>Laptop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.LaptopImpl
	 * @see emobility.impl.EmobilityPackageImpl#getLaptop()
	 * @generated
	 */
	int LAPTOP = 13;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__AVAILABILITY = EV_USER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__INTEGRITY = EV_USER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__CONFIDENTIALITY = EV_USER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__SECURITYCONTROL = EV_USER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__NAME = EV_USER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__DESCRIPTION = EV_USER_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Browser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__BROWSER = EV_USER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Laptop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP_FEATURE_COUNT = EV_USER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Laptop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP_OPERATION_COUNT = EV_USER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.App_to_from_CS_operator_systemImpl <em>App to from CS operator system</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.App_to_from_CS_operator_systemImpl
	 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_CS_operator_system()
	 * @generated
	 */
	int APP_TO_FROM_CS_OPERATOR_SYSTEM = 14;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_CS_OPERATOR_SYSTEM__AVAILABILITY = EMOBILITY_DATA__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_CS_OPERATOR_SYSTEM__INTEGRITY = EMOBILITY_DATA__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_CS_OPERATOR_SYSTEM__CONFIDENTIALITY = EMOBILITY_DATA__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_CS_OPERATOR_SYSTEM__SECURITYCONTROL = EMOBILITY_DATA__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Data type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_CS_OPERATOR_SYSTEM__DATA_TYPE = EMOBILITY_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>App to from CS operator system</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_CS_OPERATOR_SYSTEM_FEATURE_COUNT = EMOBILITY_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>App to from CS operator system</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_CS_OPERATOR_SYSTEM_OPERATION_COUNT = EMOBILITY_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.BrowserImpl <em>Browser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.BrowserImpl
	 * @see emobility.impl.EmobilityPackageImpl#getBrowser()
	 * @generated
	 */
	int BROWSER = 15;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__AVAILABILITY = EV_USER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__INTEGRITY = EV_USER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__CONFIDENTIALITY = EV_USER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__SECURITYCONTROL = EV_USER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__NAME = EV_USER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__DESCRIPTION = EV_USER_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Browser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_FEATURE_COUNT = EV_USER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Browser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_OPERATION_COUNT = EV_USER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.App_to_Energy_informationImpl <em>App to Energy information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.App_to_Energy_informationImpl
	 * @see emobility.impl.EmobilityPackageImpl#getApp_to_Energy_information()
	 * @generated
	 */
	int APP_TO_ENERGY_INFORMATION = 16;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_ENERGY_INFORMATION__AVAILABILITY = EMOBILITY_DATA__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_ENERGY_INFORMATION__INTEGRITY = EMOBILITY_DATA__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_ENERGY_INFORMATION__CONFIDENTIALITY = EMOBILITY_DATA__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_ENERGY_INFORMATION__SECURITYCONTROL = EMOBILITY_DATA__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Data type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_ENERGY_INFORMATION__DATA_TYPE = EMOBILITY_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>App to Energy information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_ENERGY_INFORMATION_FEATURE_COUNT = EMOBILITY_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>App to Energy information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_ENERGY_INFORMATION_OPERATION_COUNT = EMOBILITY_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.Battery_health_to_from_SensorsImpl <em>Battery health to from Sensors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.Battery_health_to_from_SensorsImpl
	 * @see emobility.impl.EmobilityPackageImpl#getBattery_health_to_from_Sensors()
	 * @generated
	 */
	int BATTERY_HEALTH_TO_FROM_SENSORS = 17;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_HEALTH_TO_FROM_SENSORS__AVAILABILITY = EMOBILITY_DATA__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_HEALTH_TO_FROM_SENSORS__INTEGRITY = EMOBILITY_DATA__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_HEALTH_TO_FROM_SENSORS__CONFIDENTIALITY = EMOBILITY_DATA__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_HEALTH_TO_FROM_SENSORS__SECURITYCONTROL = EMOBILITY_DATA__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Data type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_HEALTH_TO_FROM_SENSORS__DATA_TYPE = EMOBILITY_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Battery health to from Sensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_HEALTH_TO_FROM_SENSORS_FEATURE_COUNT = EMOBILITY_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Battery health to from Sensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_HEALTH_TO_FROM_SENSORS_OPERATION_COUNT = EMOBILITY_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.Service_APIImpl <em>Service API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.Service_APIImpl
	 * @see emobility.impl.EmobilityPackageImpl#getService_API()
	 * @generated
	 */
	int SERVICE_API = 18;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_API__AVAILABILITY = EV_USER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_API__INTEGRITY = EV_USER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_API__CONFIDENTIALITY = EV_USER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_API__SECURITYCONTROL = EV_USER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_API__NAME = EV_USER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_API__DESCRIPTION = EV_USER_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Service API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_API_FEATURE_COUNT = EV_USER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_API_OPERATION_COUNT = EV_USER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.Electric_VehiculeImpl <em>Electric Vehicule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.Electric_VehiculeImpl
	 * @see emobility.impl.EmobilityPackageImpl#getElectric_Vehicule()
	 * @generated
	 */
	int ELECTRIC_VEHICULE = 19;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_VEHICULE__AVAILABILITY = EMOBILITY_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_VEHICULE__INTEGRITY = EMOBILITY_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_VEHICULE__CONFIDENTIALITY = EMOBILITY_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_VEHICULE__SECURITYCONTROL = EMOBILITY_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_VEHICULE__NAME = EMOBILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_VEHICULE__DESCRIPTION = EMOBILITY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_VEHICULE__VENDOR = EMOBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Evse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_VEHICULE__EVSE = EMOBILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Electric Vehicule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_VEHICULE_FEATURE_COUNT = EMOBILITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Electric Vehicule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_VEHICULE_OPERATION_COUNT = EMOBILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.MobileImpl <em>Mobile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.MobileImpl
	 * @see emobility.impl.EmobilityPackageImpl#getMobile()
	 * @generated
	 */
	int MOBILE = 20;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__AVAILABILITY = EV_USER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__INTEGRITY = EV_USER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__CONFIDENTIALITY = EV_USER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__SECURITYCONTROL = EV_USER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__NAME = EV_USER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__DESCRIPTION = EV_USER_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Apk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__APK = EV_USER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__OS = EV_USER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Browser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__BROWSER = EV_USER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_FEATURE_COUNT = EV_USER_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_OPERATION_COUNT = EV_USER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.Clearing_HouseImpl <em>Clearing House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.Clearing_HouseImpl
	 * @see emobility.impl.EmobilityPackageImpl#getClearing_House()
	 * @generated
	 */
	int CLEARING_HOUSE = 21;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARING_HOUSE__AVAILABILITY = EV_USER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARING_HOUSE__INTEGRITY = EV_USER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARING_HOUSE__CONFIDENTIALITY = EV_USER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARING_HOUSE__SECURITYCONTROL = EV_USER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARING_HOUSE__NAME = EV_USER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARING_HOUSE__DESCRIPTION = EV_USER_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Emsp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARING_HOUSE__EMSP = EV_USER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cso</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARING_HOUSE__CSO = EV_USER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clearing House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARING_HOUSE_FEATURE_COUNT = EV_USER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clearing House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARING_HOUSE_OPERATION_COUNT = EV_USER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.eMSPImpl <em>eMSP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.eMSPImpl
	 * @see emobility.impl.EmobilityPackageImpl#geteMSP()
	 * @generated
	 */
	int EMSP = 22;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP__AVAILABILITY = EV_USER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP__INTEGRITY = EV_USER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP__CONFIDENTIALITY = EV_USER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP__SECURITYCONTROL = EV_USER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP__NAME = EV_USER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP__DESCRIPTION = EV_USER_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cso</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP__CSO = EV_USER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP__SERVICE_API = EV_USER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Web application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP__WEB_APPLICATION = EV_USER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clearing house</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP__CLEARING_HOUSE = EV_USER_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>eMSP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP_FEATURE_COUNT = EV_USER_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>eMSP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMSP_OPERATION_COUNT = EV_USER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.APKImpl <em>APK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.APKImpl
	 * @see emobility.impl.EmobilityPackageImpl#getAPK()
	 * @generated
	 */
	int APK = 23;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APK__AVAILABILITY = EV_USER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APK__INTEGRITY = EV_USER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APK__CONFIDENTIALITY = EV_USER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APK__SECURITYCONTROL = EV_USER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APK__NAME = EV_USER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APK__DESCRIPTION = EV_USER_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>APK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APK_FEATURE_COUNT = EV_USER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>APK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APK_OPERATION_COUNT = EV_USER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.App_to_from_Battery_healthImpl <em>App to from Battery health</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.App_to_from_Battery_healthImpl
	 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_Battery_health()
	 * @generated
	 */
	int APP_TO_FROM_BATTERY_HEALTH = 24;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_BATTERY_HEALTH__AVAILABILITY = EMOBILITY_DATA__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_BATTERY_HEALTH__INTEGRITY = EMOBILITY_DATA__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_BATTERY_HEALTH__CONFIDENTIALITY = EMOBILITY_DATA__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_BATTERY_HEALTH__SECURITYCONTROL = EMOBILITY_DATA__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Data type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_BATTERY_HEALTH__DATA_TYPE = EMOBILITY_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>App to from Battery health</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_BATTERY_HEALTH_FEATURE_COUNT = EMOBILITY_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>App to from Battery health</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_TO_FROM_BATTERY_HEALTH_OPERATION_COUNT = EMOBILITY_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.CS_manag_sys_to_from_CS_ControllerImpl <em>CS manag sys to from CS Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.CS_manag_sys_to_from_CS_ControllerImpl
	 * @see emobility.impl.EmobilityPackageImpl#getCS_manag_sys_to_from_CS_Controller()
	 * @generated
	 */
	int CS_MANAG_SYS_TO_FROM_CS_CONTROLLER = 25;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_MANAG_SYS_TO_FROM_CS_CONTROLLER__AVAILABILITY = EMOBILITY_DATA__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_MANAG_SYS_TO_FROM_CS_CONTROLLER__INTEGRITY = EMOBILITY_DATA__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_MANAG_SYS_TO_FROM_CS_CONTROLLER__CONFIDENTIALITY = EMOBILITY_DATA__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_MANAG_SYS_TO_FROM_CS_CONTROLLER__SECURITYCONTROL = EMOBILITY_DATA__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Data type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_MANAG_SYS_TO_FROM_CS_CONTROLLER__DATA_TYPE = EMOBILITY_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CS manag sys to from CS Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_MANAG_SYS_TO_FROM_CS_CONTROLLER_FEATURE_COUNT = EMOBILITY_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CS manag sys to from CS Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_MANAG_SYS_TO_FROM_CS_CONTROLLER_OPERATION_COUNT = EMOBILITY_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.Web_ApplicationImpl <em>Web Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.Web_ApplicationImpl
	 * @see emobility.impl.EmobilityPackageImpl#getWeb_Application()
	 * @generated
	 */
	int WEB_APPLICATION = 28;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__AVAILABILITY = EV_USER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__INTEGRITY = EV_USER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__CONFIDENTIALITY = EV_USER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__SECURITYCONTROL = EV_USER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__NAME = EV_USER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__DESCRIPTION = EV_USER_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FEATURE_COUNT = EV_USER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_OPERATION_COUNT = EV_USER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.AdministratorImpl <em>Administrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.AdministratorImpl
	 * @see emobility.impl.EmobilityPackageImpl#getAdministrator()
	 * @generated
	 */
	int ADMINISTRATOR = 30;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__AVAILABILITY = ENERGY_TRANSFER_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__INTEGRITY = ENERGY_TRANSFER_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__CONFIDENTIALITY = ENERGY_TRANSFER_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__SECURITYCONTROL = ENERGY_TRANSFER_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__NAME = ENERGY_TRANSFER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__DESCRIPTION = ENERGY_TRANSFER_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Csms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__CSMS = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_FEATURE_COUNT = ENERGY_TRANSFER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_OPERATION_COUNT = ENERGY_TRANSFER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.CommunicationImpl
	 * @see emobility.impl.EmobilityPackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 31;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__AVAILABILITY = EMOBILITY_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__INTEGRITY = EMOBILITY_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__CONFIDENTIALITY = EMOBILITY_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__SECURITYCONTROL = EMOBILITY_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__NAME = EMOBILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__DESCRIPTION = EMOBILITY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Info protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__INFO_PROTOCOL = EMOBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__SOURCE = EMOBILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__DESTINATION = EMOBILITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comm protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__COMM_PROTOCOL = EMOBILITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Emobility data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__EMOBILITY_DATA = EMOBILITY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = EMOBILITY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OPERATION_COUNT = EMOBILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.DomainImpl
	 * @see emobility.impl.EmobilityPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 32;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__AVAILABILITY = EMOBILITY_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__INTEGRITY = EMOBILITY_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CONFIDENTIALITY = EMOBILITY_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SECURITYCONTROL = EMOBILITY_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = EMOBILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DESCRIPTION = EMOBILITY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Emobilityelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__EMOBILITYELEMENT = EMOBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__COMMUNICATION = EMOBILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = EMOBILITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = EMOBILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.SecurityControlImpl <em>Security Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.SecurityControlImpl
	 * @see emobility.impl.EmobilityPackageImpl#getSecurityControl()
	 * @generated
	 */
	int SECURITY_CONTROL = 33;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__AVAILABILITY = EMOBILITY_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__INTEGRITY = EMOBILITY_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__CONFIDENTIALITY = EMOBILITY_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__SECURITYCONTROL = EMOBILITY_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__NAME = EMOBILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__DESCRIPTION = EMOBILITY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__TYPE = EMOBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_FEATURE_COUNT = EMOBILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_OPERATION_COUNT = EMOBILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.impl.ThreatImpl
	 * @see emobility.impl.EmobilityPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 34;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__AVAILABILITY = EMOBILITY_ELEMENT__AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__INTEGRITY = EMOBILITY_ELEMENT__INTEGRITY;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__CONFIDENTIALITY = EMOBILITY_ELEMENT__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Securitycontrol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__SECURITYCONTROL = EMOBILITY_ELEMENT__SECURITYCONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__NAME = EMOBILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__DESCRIPTION = EMOBILITY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ID = EMOBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__LIKELIHOOD = EMOBILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ASSET = EMOBILITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Risk level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__RISK_LEVEL = EMOBILITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = EMOBILITY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = EMOBILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emobility.App_to_from_CS_operator_system_Cat <em>App to from CS operator system Cat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.App_to_from_CS_operator_system_Cat
	 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_CS_operator_system_Cat()
	 * @generated
	 */
	int APP_TO_FROM_CS_OPERATOR_SYSTEM_CAT = 36;

	/**
	 * The meta object id for the '{@link emobility.App_to_Battery_health_Cat <em>App to Battery health Cat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.App_to_Battery_health_Cat
	 * @see emobility.impl.EmobilityPackageImpl#getApp_to_Battery_health_Cat()
	 * @generated
	 */
	int APP_TO_BATTERY_HEALTH_CAT = 37;

	/**
	 * The meta object id for the '{@link emobility.App_to_from_from_Route_Planning_Cat <em>App to from from Route Planning Cat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.App_to_from_from_Route_Planning_Cat
	 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_from_Route_Planning_Cat()
	 * @generated
	 */
	int APP_TO_FROM_FROM_ROUTE_PLANNING_CAT = 38;

	/**
	 * The meta object id for the '{@link emobility.App_to_from_Energy_information_Cat <em>App to from Energy information Cat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.App_to_from_Energy_information_Cat
	 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_Energy_information_Cat()
	 * @generated
	 */
	int APP_TO_FROM_ENERGY_INFORMATION_CAT = 39;

	/**
	 * The meta object id for the '{@link emobility.CS_manag_sys_to_from_CS_Controller_Cat <em>CS manag sys to from CS Controller Cat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.CS_manag_sys_to_from_CS_Controller_Cat
	 * @see emobility.impl.EmobilityPackageImpl#getCS_manag_sys_to_from_CS_Controller_Cat()
	 * @generated
	 */
	int CS_MANAG_SYS_TO_FROM_CS_CONTROLLER_CAT = 40;

	/**
	 * The meta object id for the '{@link emobility.CS_operator_sys_to_from_CS_manag_sys_Cat <em>CS operator sys to from CS manag sys Cat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.CS_operator_sys_to_from_CS_manag_sys_Cat
	 * @see emobility.impl.EmobilityPackageImpl#getCS_operator_sys_to_from_CS_manag_sys_Cat()
	 * @generated
	 */
	int CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS_CAT = 41;

	/**
	 * The meta object id for the '{@link emobility.mOS_type <em>mOS type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.mOS_type
	 * @see emobility.impl.EmobilityPackageImpl#getmOS_type()
	 * @generated
	 */
	int MOS_TYPE = 42;

	/**
	 * The meta object id for the '{@link emobility.Battery_health_to_from_Sensors_Cat <em>Battery health to from Sensors Cat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.Battery_health_to_from_Sensors_Cat
	 * @see emobility.impl.EmobilityPackageImpl#getBattery_health_to_from_Sensors_Cat()
	 * @generated
	 */
	int BATTERY_HEALTH_TO_FROM_SENSORS_CAT = 43;

	/**
	 * The meta object id for the '{@link emobility.Information_Protocol <em>Information Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.Information_Protocol
	 * @see emobility.impl.EmobilityPackageImpl#getInformation_Protocol()
	 * @generated
	 */
	int INFORMATION_PROTOCOL = 44;

	/**
	 * The meta object id for the '{@link emobility.Vendor_Type <em>Vendor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.Vendor_Type
	 * @see emobility.impl.EmobilityPackageImpl#getVendor_Type()
	 * @generated
	 */
	int VENDOR_TYPE = 45;

	/**
	 * The meta object id for the '{@link emobility.OS_Type <em>OS Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.OS_Type
	 * @see emobility.impl.EmobilityPackageImpl#getOS_Type()
	 * @generated
	 */
	int OS_TYPE = 46;

	/**
	 * The meta object id for the '{@link emobility.Communication_Protocol <em>Communication Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.Communication_Protocol
	 * @see emobility.impl.EmobilityPackageImpl#getCommunication_Protocol()
	 * @generated
	 */
	int COMMUNICATION_PROTOCOL = 47;


	/**
	 * The meta object id for the '{@link emobility.Security_Controls <em>Security Controls</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.Security_Controls
	 * @see emobility.impl.EmobilityPackageImpl#getSecurity_Controls()
	 * @generated
	 */
	int SECURITY_CONTROLS = 48;

	/**
	 * The meta object id for the '{@link emobility.CIA_Level <em>CIA Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.CIA_Level
	 * @see emobility.impl.EmobilityPackageImpl#getCIA_Level()
	 * @generated
	 */
	int CIA_LEVEL = 49;

	/**
	 * The meta object id for the '{@link emobility.Threat_Category <em>Threat Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.Threat_Category
	 * @see emobility.impl.EmobilityPackageImpl#getThreat_Category()
	 * @generated
	 */
	int THREAT_CATEGORY = 50;

	/**
	 * The meta object id for the '{@link emobility.Likelihood_Level <em>Likelihood Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emobility.Likelihood_Level
	 * @see emobility.impl.EmobilityPackageImpl#getLikelihood_Level()
	 * @generated
	 */
	int LIKELIHOOD_LEVEL = 51;


	/**
	 * Returns the meta object for class '{@link emobility.CS_operator_sys_to_from_CS_manag_sys <em>CS operator sys to from CS manag sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS operator sys to from CS manag sys</em>'.
	 * @see emobility.CS_operator_sys_to_from_CS_manag_sys
	 * @generated
	 */
	EClass getCS_operator_sys_to_from_CS_manag_sys();

	/**
	 * Returns the meta object for the attribute '{@link emobility.CS_operator_sys_to_from_CS_manag_sys#getData_type <em>Data type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data type</em>'.
	 * @see emobility.CS_operator_sys_to_from_CS_manag_sys#getData_type()
	 * @see #getCS_operator_sys_to_from_CS_manag_sys()
	 * @generated
	 */
	EAttribute getCS_operator_sys_to_from_CS_manag_sys_Data_type();

	/**
	 * Returns the meta object for class '{@link emobility.App_to_from_Route_Planning <em>App to from Route Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App to from Route Planning</em>'.
	 * @see emobility.App_to_from_Route_Planning
	 * @generated
	 */
	EClass getApp_to_from_Route_Planning();

	/**
	 * Returns the meta object for the attribute '{@link emobility.App_to_from_Route_Planning#getData_type <em>Data type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data type</em>'.
	 * @see emobility.App_to_from_Route_Planning#getData_type()
	 * @see #getApp_to_from_Route_Planning()
	 * @generated
	 */
	EAttribute getApp_to_from_Route_Planning_Data_type();

	/**
	 * Returns the meta object for class '{@link emobility.CSO <em>CSO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSO</em>'.
	 * @see emobility.CSO
	 * @generated
	 */
	EClass getCSO();

	/**
	 * Returns the meta object for the reference '{@link emobility.CSO#getEmsp <em>Emsp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emsp</em>'.
	 * @see emobility.CSO#getEmsp()
	 * @see #getCSO()
	 * @generated
	 */
	EReference getCSO_Emsp();

	/**
	 * Returns the meta object for the reference '{@link emobility.CSO#getClearing_house <em>Clearing house</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clearing house</em>'.
	 * @see emobility.CSO#getClearing_house()
	 * @see #getCSO()
	 * @generated
	 */
	EReference getCSO_Clearing_house();

	/**
	 * Returns the meta object for class '{@link emobility.CS_Controller <em>CS Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS Controller</em>'.
	 * @see emobility.CS_Controller
	 * @generated
	 */
	EClass getCS_Controller();

	/**
	 * Returns the meta object for the reference list '{@link emobility.CS_Controller#getEvse <em>Evse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evse</em>'.
	 * @see emobility.CS_Controller#getEvse()
	 * @see #getCS_Controller()
	 * @generated
	 */
	EReference getCS_Controller_Evse();

	/**
	 * Returns the meta object for class '{@link emobility.Energy_Conversion_Element <em>Energy Conversion Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Conversion Element</em>'.
	 * @see emobility.Energy_Conversion_Element
	 * @generated
	 */
	EClass getEnergy_Conversion_Element();

	/**
	 * Returns the meta object for class '{@link emobility.EMobilityElement <em>EMobility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMobility Element</em>'.
	 * @see emobility.EMobilityElement
	 * @generated
	 */
	EClass getEMobilityElement();

	/**
	 * Returns the meta object for the attribute '{@link emobility.EMobilityElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emobility.EMobilityElement#getName()
	 * @see #getEMobilityElement()
	 * @generated
	 */
	EAttribute getEMobilityElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link emobility.EMobilityElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see emobility.EMobilityElement#getDescription()
	 * @see #getEMobilityElement()
	 * @generated
	 */
	EAttribute getEMobilityElement_Description();

	/**
	 * Returns the meta object for class '{@link emobility.CSMS <em>CSMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSMS</em>'.
	 * @see emobility.CSMS
	 * @generated
	 */
	EClass getCSMS();

	/**
	 * Returns the meta object for the reference list '{@link emobility.CSMS#getCs_controller <em>Cs controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cs controller</em>'.
	 * @see emobility.CSMS#getCs_controller()
	 * @see #getCSMS()
	 * @generated
	 */
	EReference getCSMS_Cs_controller();

	/**
	 * Returns the meta object for the reference '{@link emobility.CSMS#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see emobility.CSMS#getServer()
	 * @see #getCSMS()
	 * @generated
	 */
	EReference getCSMS_Server();

	/**
	 * Returns the meta object for class '{@link emobility.EV_User <em>EV User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EV User</em>'.
	 * @see emobility.EV_User
	 * @generated
	 */
	EClass getEV_User();

	/**
	 * Returns the meta object for the reference '{@link emobility.EV_User#getLaptop <em>Laptop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Laptop</em>'.
	 * @see emobility.EV_User#getLaptop()
	 * @see #getEV_User()
	 * @generated
	 */
	EReference getEV_User_Laptop();

	/**
	 * Returns the meta object for the reference '{@link emobility.EV_User#getMobile <em>Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mobile</em>'.
	 * @see emobility.EV_User#getMobile()
	 * @see #getEV_User()
	 * @generated
	 */
	EReference getEV_User_Mobile();

	/**
	 * Returns the meta object for class '{@link emobility.EMobilityArchitecture <em>EMobility Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMobility Architecture</em>'.
	 * @see emobility.EMobilityArchitecture
	 * @generated
	 */
	EClass getEMobilityArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link emobility.EMobilityArchitecture#getEmobilityelement <em>Emobilityelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emobilityelement</em>'.
	 * @see emobility.EMobilityArchitecture#getEmobilityelement()
	 * @see #getEMobilityArchitecture()
	 * @generated
	 */
	EReference getEMobilityArchitecture_Emobilityelement();

	/**
	 * Returns the meta object for class '{@link emobility.DSO <em>DSO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSO</em>'.
	 * @see emobility.DSO
	 * @generated
	 */
	EClass getDSO();

	/**
	 * Returns the meta object for class '{@link emobility.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see emobility.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Server#getOs_type <em>Os type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os type</em>'.
	 * @see emobility.Server#getOs_type()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Os_type();

	/**
	 * Returns the meta object for class '{@link emobility.EVSE <em>EVSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EVSE</em>'.
	 * @see emobility.EVSE
	 * @generated
	 */
	EClass getEVSE();

	/**
	 * Returns the meta object for the reference '{@link emobility.EVSE#getElectric_vehicule <em>Electric vehicule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Electric vehicule</em>'.
	 * @see emobility.EVSE#getElectric_vehicule()
	 * @see #getEVSE()
	 * @generated
	 */
	EReference getEVSE_Electric_vehicule();

	/**
	 * Returns the meta object for class '{@link emobility.Energy_Supplier <em>Energy Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Supplier</em>'.
	 * @see emobility.Energy_Supplier
	 * @generated
	 */
	EClass getEnergy_Supplier();

	/**
	 * Returns the meta object for class '{@link emobility.Laptop <em>Laptop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Laptop</em>'.
	 * @see emobility.Laptop
	 * @generated
	 */
	EClass getLaptop();

	/**
	 * Returns the meta object for the containment reference list '{@link emobility.Laptop#getBrowser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Browser</em>'.
	 * @see emobility.Laptop#getBrowser()
	 * @see #getLaptop()
	 * @generated
	 */
	EReference getLaptop_Browser();

	/**
	 * Returns the meta object for class '{@link emobility.App_to_from_CS_operator_system <em>App to from CS operator system</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App to from CS operator system</em>'.
	 * @see emobility.App_to_from_CS_operator_system
	 * @generated
	 */
	EClass getApp_to_from_CS_operator_system();

	/**
	 * Returns the meta object for the attribute '{@link emobility.App_to_from_CS_operator_system#getData_type <em>Data type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data type</em>'.
	 * @see emobility.App_to_from_CS_operator_system#getData_type()
	 * @see #getApp_to_from_CS_operator_system()
	 * @generated
	 */
	EAttribute getApp_to_from_CS_operator_system_Data_type();

	/**
	 * Returns the meta object for class '{@link emobility.Browser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browser</em>'.
	 * @see emobility.Browser
	 * @generated
	 */
	EClass getBrowser();

	/**
	 * Returns the meta object for class '{@link emobility.App_to_Energy_information <em>App to Energy information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App to Energy information</em>'.
	 * @see emobility.App_to_Energy_information
	 * @generated
	 */
	EClass getApp_to_Energy_information();

	/**
	 * Returns the meta object for the attribute '{@link emobility.App_to_Energy_information#getData_type <em>Data type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data type</em>'.
	 * @see emobility.App_to_Energy_information#getData_type()
	 * @see #getApp_to_Energy_information()
	 * @generated
	 */
	EAttribute getApp_to_Energy_information_Data_type();

	/**
	 * Returns the meta object for class '{@link emobility.Battery_health_to_from_Sensors <em>Battery health to from Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery health to from Sensors</em>'.
	 * @see emobility.Battery_health_to_from_Sensors
	 * @generated
	 */
	EClass getBattery_health_to_from_Sensors();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Battery_health_to_from_Sensors#getData_type <em>Data type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data type</em>'.
	 * @see emobility.Battery_health_to_from_Sensors#getData_type()
	 * @see #getBattery_health_to_from_Sensors()
	 * @generated
	 */
	EAttribute getBattery_health_to_from_Sensors_Data_type();

	/**
	 * Returns the meta object for class '{@link emobility.Service_API <em>Service API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service API</em>'.
	 * @see emobility.Service_API
	 * @generated
	 */
	EClass getService_API();

	/**
	 * Returns the meta object for class '{@link emobility.Electric_Vehicule <em>Electric Vehicule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electric Vehicule</em>'.
	 * @see emobility.Electric_Vehicule
	 * @generated
	 */
	EClass getElectric_Vehicule();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Electric_Vehicule#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see emobility.Electric_Vehicule#getVendor()
	 * @see #getElectric_Vehicule()
	 * @generated
	 */
	EAttribute getElectric_Vehicule_Vendor();

	/**
	 * Returns the meta object for the reference '{@link emobility.Electric_Vehicule#getEvse <em>Evse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evse</em>'.
	 * @see emobility.Electric_Vehicule#getEvse()
	 * @see #getElectric_Vehicule()
	 * @generated
	 */
	EReference getElectric_Vehicule_Evse();

	/**
	 * Returns the meta object for class '{@link emobility.Mobile <em>Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile</em>'.
	 * @see emobility.Mobile
	 * @generated
	 */
	EClass getMobile();

	/**
	 * Returns the meta object for the containment reference list '{@link emobility.Mobile#getApk <em>Apk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apk</em>'.
	 * @see emobility.Mobile#getApk()
	 * @see #getMobile()
	 * @generated
	 */
	EReference getMobile_Apk();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Mobile#getOS <em>OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS</em>'.
	 * @see emobility.Mobile#getOS()
	 * @see #getMobile()
	 * @generated
	 */
	EAttribute getMobile_OS();

	/**
	 * Returns the meta object for the containment reference list '{@link emobility.Mobile#getBrowser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Browser</em>'.
	 * @see emobility.Mobile#getBrowser()
	 * @see #getMobile()
	 * @generated
	 */
	EReference getMobile_Browser();

	/**
	 * Returns the meta object for class '{@link emobility.Clearing_House <em>Clearing House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clearing House</em>'.
	 * @see emobility.Clearing_House
	 * @generated
	 */
	EClass getClearing_House();

	/**
	 * Returns the meta object for the reference '{@link emobility.Clearing_House#getEmsp <em>Emsp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emsp</em>'.
	 * @see emobility.Clearing_House#getEmsp()
	 * @see #getClearing_House()
	 * @generated
	 */
	EReference getClearing_House_Emsp();

	/**
	 * Returns the meta object for the reference '{@link emobility.Clearing_House#getCso <em>Cso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cso</em>'.
	 * @see emobility.Clearing_House#getCso()
	 * @see #getClearing_House()
	 * @generated
	 */
	EReference getClearing_House_Cso();

	/**
	 * Returns the meta object for class '{@link emobility.eMSP <em>eMSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>eMSP</em>'.
	 * @see emobility.eMSP
	 * @generated
	 */
	EClass geteMSP();

	/**
	 * Returns the meta object for the reference '{@link emobility.eMSP#getCso <em>Cso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cso</em>'.
	 * @see emobility.eMSP#getCso()
	 * @see #geteMSP()
	 * @generated
	 */
	EReference geteMSP_Cso();

	/**
	 * Returns the meta object for the reference '{@link emobility.eMSP#getService_api <em>Service api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service api</em>'.
	 * @see emobility.eMSP#getService_api()
	 * @see #geteMSP()
	 * @generated
	 */
	EReference geteMSP_Service_api();

	/**
	 * Returns the meta object for the reference '{@link emobility.eMSP#getWeb_application <em>Web application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web application</em>'.
	 * @see emobility.eMSP#getWeb_application()
	 * @see #geteMSP()
	 * @generated
	 */
	EReference geteMSP_Web_application();

	/**
	 * Returns the meta object for the reference '{@link emobility.eMSP#getClearing_house <em>Clearing house</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clearing house</em>'.
	 * @see emobility.eMSP#getClearing_house()
	 * @see #geteMSP()
	 * @generated
	 */
	EReference geteMSP_Clearing_house();

	/**
	 * Returns the meta object for class '{@link emobility.APK <em>APK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APK</em>'.
	 * @see emobility.APK
	 * @generated
	 */
	EClass getAPK();

	/**
	 * Returns the meta object for class '{@link emobility.App_to_from_Battery_health <em>App to from Battery health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App to from Battery health</em>'.
	 * @see emobility.App_to_from_Battery_health
	 * @generated
	 */
	EClass getApp_to_from_Battery_health();

	/**
	 * Returns the meta object for the attribute '{@link emobility.App_to_from_Battery_health#getData_type <em>Data type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data type</em>'.
	 * @see emobility.App_to_from_Battery_health#getData_type()
	 * @see #getApp_to_from_Battery_health()
	 * @generated
	 */
	EAttribute getApp_to_from_Battery_health_Data_type();

	/**
	 * Returns the meta object for class '{@link emobility.CS_manag_sys_to_from_CS_Controller <em>CS manag sys to from CS Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS manag sys to from CS Controller</em>'.
	 * @see emobility.CS_manag_sys_to_from_CS_Controller
	 * @generated
	 */
	EClass getCS_manag_sys_to_from_CS_Controller();

	/**
	 * Returns the meta object for the attribute '{@link emobility.CS_manag_sys_to_from_CS_Controller#getData_type <em>Data type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data type</em>'.
	 * @see emobility.CS_manag_sys_to_from_CS_Controller#getData_type()
	 * @see #getCS_manag_sys_to_from_CS_Controller()
	 * @generated
	 */
	EAttribute getCS_manag_sys_to_from_CS_Controller_Data_type();

	/**
	 * Returns the meta object for class '{@link emobility.Energy_Transfer_Element <em>Energy Transfer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Transfer Element</em>'.
	 * @see emobility.Energy_Transfer_Element
	 * @generated
	 */
	EClass getEnergy_Transfer_Element();

	/**
	 * Returns the meta object for class '{@link emobility.EV_User_Element <em>EV User Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EV User Element</em>'.
	 * @see emobility.EV_User_Element
	 * @generated
	 */
	EClass getEV_User_Element();

	/**
	 * Returns the meta object for class '{@link emobility.Web_Application <em>Web Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Application</em>'.
	 * @see emobility.Web_Application
	 * @generated
	 */
	EClass getWeb_Application();

	/**
	 * Returns the meta object for class '{@link emobility.EMobility_Data <em>EMobility Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMobility Data</em>'.
	 * @see emobility.EMobility_Data
	 * @generated
	 */
	EClass getEMobility_Data();

	/**
	 * Returns the meta object for class '{@link emobility.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator</em>'.
	 * @see emobility.Administrator
	 * @generated
	 */
	EClass getAdministrator();

	/**
	 * Returns the meta object for the reference '{@link emobility.Administrator#getCsms <em>Csms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Csms</em>'.
	 * @see emobility.Administrator#getCsms()
	 * @see #getAdministrator()
	 * @generated
	 */
	EReference getAdministrator_Csms();

	/**
	 * Returns the meta object for class '{@link emobility.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see emobility.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Communication#getInfo_protocol <em>Info protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info protocol</em>'.
	 * @see emobility.Communication#getInfo_protocol()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_Info_protocol();

	/**
	 * Returns the meta object for the reference '{@link emobility.Communication#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see emobility.Communication#getSource()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Source();

	/**
	 * Returns the meta object for the reference '{@link emobility.Communication#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see emobility.Communication#getDestination()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Destination();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Communication#getComm_protocol <em>Comm protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comm protocol</em>'.
	 * @see emobility.Communication#getComm_protocol()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_Comm_protocol();

	/**
	 * Returns the meta object for the reference list '{@link emobility.Communication#getEmobility_data <em>Emobility data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emobility data</em>'.
	 * @see emobility.Communication#getEmobility_data()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Emobility_data();

	/**
	 * Returns the meta object for class '{@link emobility.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see emobility.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link emobility.Domain#getEmobilityelement <em>Emobilityelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emobilityelement</em>'.
	 * @see emobility.Domain#getEmobilityelement()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Emobilityelement();

	/**
	 * Returns the meta object for the containment reference list '{@link emobility.Domain#getCommunication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication</em>'.
	 * @see emobility.Domain#getCommunication()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Communication();

	/**
	 * Returns the meta object for class '{@link emobility.SecurityControl <em>Security Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Control</em>'.
	 * @see emobility.SecurityControl
	 * @generated
	 */
	EClass getSecurityControl();

	/**
	 * Returns the meta object for the attribute '{@link emobility.SecurityControl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see emobility.SecurityControl#getType()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EAttribute getSecurityControl_Type();

	/**
	 * Returns the meta object for class '{@link emobility.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see emobility.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Threat#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see emobility.Threat#getId()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Id();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Threat#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Likelihood</em>'.
	 * @see emobility.Threat#getLikelihood()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Likelihood();

	/**
	 * Returns the meta object for the reference list '{@link emobility.Threat#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset</em>'.
	 * @see emobility.Threat#getAsset()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Asset();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Threat#getRisk_level <em>Risk level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk level</em>'.
	 * @see emobility.Threat#getRisk_level()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Risk_level();

	/**
	 * Returns the meta object for class '{@link emobility.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see emobility.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Asset#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability</em>'.
	 * @see emobility.Asset#getAvailability()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Availability();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Asset#getIntegrity <em>Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity</em>'.
	 * @see emobility.Asset#getIntegrity()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Integrity();

	/**
	 * Returns the meta object for the attribute '{@link emobility.Asset#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see emobility.Asset#getConfidentiality()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Confidentiality();

	/**
	 * Returns the meta object for the reference list '{@link emobility.Asset#getSecuritycontrol <em>Securitycontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Securitycontrol</em>'.
	 * @see emobility.Asset#getSecuritycontrol()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Securitycontrol();

	/**
	 * Returns the meta object for enum '{@link emobility.App_to_from_CS_operator_system_Cat <em>App to from CS operator system Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>App to from CS operator system Cat</em>'.
	 * @see emobility.App_to_from_CS_operator_system_Cat
	 * @generated
	 */
	EEnum getApp_to_from_CS_operator_system_Cat();

	/**
	 * Returns the meta object for enum '{@link emobility.App_to_Battery_health_Cat <em>App to Battery health Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>App to Battery health Cat</em>'.
	 * @see emobility.App_to_Battery_health_Cat
	 * @generated
	 */
	EEnum getApp_to_Battery_health_Cat();

	/**
	 * Returns the meta object for enum '{@link emobility.App_to_from_from_Route_Planning_Cat <em>App to from from Route Planning Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>App to from from Route Planning Cat</em>'.
	 * @see emobility.App_to_from_from_Route_Planning_Cat
	 * @generated
	 */
	EEnum getApp_to_from_from_Route_Planning_Cat();

	/**
	 * Returns the meta object for enum '{@link emobility.App_to_from_Energy_information_Cat <em>App to from Energy information Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>App to from Energy information Cat</em>'.
	 * @see emobility.App_to_from_Energy_information_Cat
	 * @generated
	 */
	EEnum getApp_to_from_Energy_information_Cat();

	/**
	 * Returns the meta object for enum '{@link emobility.CS_manag_sys_to_from_CS_Controller_Cat <em>CS manag sys to from CS Controller Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CS manag sys to from CS Controller Cat</em>'.
	 * @see emobility.CS_manag_sys_to_from_CS_Controller_Cat
	 * @generated
	 */
	EEnum getCS_manag_sys_to_from_CS_Controller_Cat();

	/**
	 * Returns the meta object for enum '{@link emobility.CS_operator_sys_to_from_CS_manag_sys_Cat <em>CS operator sys to from CS manag sys Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CS operator sys to from CS manag sys Cat</em>'.
	 * @see emobility.CS_operator_sys_to_from_CS_manag_sys_Cat
	 * @generated
	 */
	EEnum getCS_operator_sys_to_from_CS_manag_sys_Cat();

	/**
	 * Returns the meta object for enum '{@link emobility.mOS_type <em>mOS type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>mOS type</em>'.
	 * @see emobility.mOS_type
	 * @generated
	 */
	EEnum getmOS_type();

	/**
	 * Returns the meta object for enum '{@link emobility.Battery_health_to_from_Sensors_Cat <em>Battery health to from Sensors Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Battery health to from Sensors Cat</em>'.
	 * @see emobility.Battery_health_to_from_Sensors_Cat
	 * @generated
	 */
	EEnum getBattery_health_to_from_Sensors_Cat();

	/**
	 * Returns the meta object for enum '{@link emobility.Information_Protocol <em>Information Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Information Protocol</em>'.
	 * @see emobility.Information_Protocol
	 * @generated
	 */
	EEnum getInformation_Protocol();

	/**
	 * Returns the meta object for enum '{@link emobility.Vendor_Type <em>Vendor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vendor Type</em>'.
	 * @see emobility.Vendor_Type
	 * @generated
	 */
	EEnum getVendor_Type();

	/**
	 * Returns the meta object for enum '{@link emobility.OS_Type <em>OS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS Type</em>'.
	 * @see emobility.OS_Type
	 * @generated
	 */
	EEnum getOS_Type();

	/**
	 * Returns the meta object for enum '{@link emobility.Communication_Protocol <em>Communication Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Protocol</em>'.
	 * @see emobility.Communication_Protocol
	 * @generated
	 */
	EEnum getCommunication_Protocol();

	/**
	 * Returns the meta object for enum '{@link emobility.Security_Controls <em>Security Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Controls</em>'.
	 * @see emobility.Security_Controls
	 * @generated
	 */
	EEnum getSecurity_Controls();

	/**
	 * Returns the meta object for enum '{@link emobility.CIA_Level <em>CIA Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CIA Level</em>'.
	 * @see emobility.CIA_Level
	 * @generated
	 */
	EEnum getCIA_Level();

	/**
	 * Returns the meta object for enum '{@link emobility.Threat_Category <em>Threat Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Threat Category</em>'.
	 * @see emobility.Threat_Category
	 * @generated
	 */
	EEnum getThreat_Category();

	/**
	 * Returns the meta object for enum '{@link emobility.Likelihood_Level <em>Likelihood Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Likelihood Level</em>'.
	 * @see emobility.Likelihood_Level
	 * @generated
	 */
	EEnum getLikelihood_Level();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmobilityFactory getEmobilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link emobility.impl.CS_operator_sys_to_from_CS_manag_sysImpl <em>CS operator sys to from CS manag sys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.CS_operator_sys_to_from_CS_manag_sysImpl
		 * @see emobility.impl.EmobilityPackageImpl#getCS_operator_sys_to_from_CS_manag_sys()
		 * @generated
		 */
		EClass CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS = eINSTANCE.getCS_operator_sys_to_from_CS_manag_sys();

		/**
		 * The meta object literal for the '<em><b>Data type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__DATA_TYPE = eINSTANCE.getCS_operator_sys_to_from_CS_manag_sys_Data_type();

		/**
		 * The meta object literal for the '{@link emobility.impl.App_to_from_Route_PlanningImpl <em>App to from Route Planning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.App_to_from_Route_PlanningImpl
		 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_Route_Planning()
		 * @generated
		 */
		EClass APP_TO_FROM_ROUTE_PLANNING = eINSTANCE.getApp_to_from_Route_Planning();

		/**
		 * The meta object literal for the '<em><b>Data type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_TO_FROM_ROUTE_PLANNING__DATA_TYPE = eINSTANCE.getApp_to_from_Route_Planning_Data_type();

		/**
		 * The meta object literal for the '{@link emobility.impl.CSOImpl <em>CSO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.CSOImpl
		 * @see emobility.impl.EmobilityPackageImpl#getCSO()
		 * @generated
		 */
		EClass CSO = eINSTANCE.getCSO();

		/**
		 * The meta object literal for the '<em><b>Emsp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSO__EMSP = eINSTANCE.getCSO_Emsp();

		/**
		 * The meta object literal for the '<em><b>Clearing house</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSO__CLEARING_HOUSE = eINSTANCE.getCSO_Clearing_house();

		/**
		 * The meta object literal for the '{@link emobility.impl.CS_ControllerImpl <em>CS Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.CS_ControllerImpl
		 * @see emobility.impl.EmobilityPackageImpl#getCS_Controller()
		 * @generated
		 */
		EClass CS_CONTROLLER = eINSTANCE.getCS_Controller();

		/**
		 * The meta object literal for the '<em><b>Evse</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONTROLLER__EVSE = eINSTANCE.getCS_Controller_Evse();

		/**
		 * The meta object literal for the '{@link emobility.impl.Energy_Conversion_ElementImpl <em>Energy Conversion Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.Energy_Conversion_ElementImpl
		 * @see emobility.impl.EmobilityPackageImpl#getEnergy_Conversion_Element()
		 * @generated
		 */
		EClass ENERGY_CONVERSION_ELEMENT = eINSTANCE.getEnergy_Conversion_Element();

		/**
		 * The meta object literal for the '{@link emobility.impl.EMobilityElementImpl <em>EMobility Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.EMobilityElementImpl
		 * @see emobility.impl.EmobilityPackageImpl#getEMobilityElement()
		 * @generated
		 */
		EClass EMOBILITY_ELEMENT = eINSTANCE.getEMobilityElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOBILITY_ELEMENT__NAME = eINSTANCE.getEMobilityElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOBILITY_ELEMENT__DESCRIPTION = eINSTANCE.getEMobilityElement_Description();

		/**
		 * The meta object literal for the '{@link emobility.impl.CSMSImpl <em>CSMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.CSMSImpl
		 * @see emobility.impl.EmobilityPackageImpl#getCSMS()
		 * @generated
		 */
		EClass CSMS = eINSTANCE.getCSMS();

		/**
		 * The meta object literal for the '<em><b>Cs controller</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSMS__CS_CONTROLLER = eINSTANCE.getCSMS_Cs_controller();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSMS__SERVER = eINSTANCE.getCSMS_Server();

		/**
		 * The meta object literal for the '{@link emobility.impl.EV_UserImpl <em>EV User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.EV_UserImpl
		 * @see emobility.impl.EmobilityPackageImpl#getEV_User()
		 * @generated
		 */
		EClass EV_USER = eINSTANCE.getEV_User();

		/**
		 * The meta object literal for the '<em><b>Laptop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EV_USER__LAPTOP = eINSTANCE.getEV_User_Laptop();

		/**
		 * The meta object literal for the '<em><b>Mobile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EV_USER__MOBILE = eINSTANCE.getEV_User_Mobile();

		/**
		 * The meta object literal for the '{@link emobility.impl.EMobilityArchitectureImpl <em>EMobility Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.EMobilityArchitectureImpl
		 * @see emobility.impl.EmobilityPackageImpl#getEMobilityArchitecture()
		 * @generated
		 */
		EClass EMOBILITY_ARCHITECTURE = eINSTANCE.getEMobilityArchitecture();

		/**
		 * The meta object literal for the '<em><b>Emobilityelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT = eINSTANCE.getEMobilityArchitecture_Emobilityelement();

		/**
		 * The meta object literal for the '{@link emobility.impl.DSOImpl <em>DSO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.DSOImpl
		 * @see emobility.impl.EmobilityPackageImpl#getDSO()
		 * @generated
		 */
		EClass DSO = eINSTANCE.getDSO();

		/**
		 * The meta object literal for the '{@link emobility.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.ServerImpl
		 * @see emobility.impl.EmobilityPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Os type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OS_TYPE = eINSTANCE.getServer_Os_type();

		/**
		 * The meta object literal for the '{@link emobility.impl.EVSEImpl <em>EVSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.EVSEImpl
		 * @see emobility.impl.EmobilityPackageImpl#getEVSE()
		 * @generated
		 */
		EClass EVSE = eINSTANCE.getEVSE();

		/**
		 * The meta object literal for the '<em><b>Electric vehicule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVSE__ELECTRIC_VEHICULE = eINSTANCE.getEVSE_Electric_vehicule();

		/**
		 * The meta object literal for the '{@link emobility.impl.Energy_SupplierImpl <em>Energy Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.Energy_SupplierImpl
		 * @see emobility.impl.EmobilityPackageImpl#getEnergy_Supplier()
		 * @generated
		 */
		EClass ENERGY_SUPPLIER = eINSTANCE.getEnergy_Supplier();

		/**
		 * The meta object literal for the '{@link emobility.impl.LaptopImpl <em>Laptop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.LaptopImpl
		 * @see emobility.impl.EmobilityPackageImpl#getLaptop()
		 * @generated
		 */
		EClass LAPTOP = eINSTANCE.getLaptop();

		/**
		 * The meta object literal for the '<em><b>Browser</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAPTOP__BROWSER = eINSTANCE.getLaptop_Browser();

		/**
		 * The meta object literal for the '{@link emobility.impl.App_to_from_CS_operator_systemImpl <em>App to from CS operator system</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.App_to_from_CS_operator_systemImpl
		 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_CS_operator_system()
		 * @generated
		 */
		EClass APP_TO_FROM_CS_OPERATOR_SYSTEM = eINSTANCE.getApp_to_from_CS_operator_system();

		/**
		 * The meta object literal for the '<em><b>Data type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_TO_FROM_CS_OPERATOR_SYSTEM__DATA_TYPE = eINSTANCE.getApp_to_from_CS_operator_system_Data_type();

		/**
		 * The meta object literal for the '{@link emobility.impl.BrowserImpl <em>Browser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.BrowserImpl
		 * @see emobility.impl.EmobilityPackageImpl#getBrowser()
		 * @generated
		 */
		EClass BROWSER = eINSTANCE.getBrowser();

		/**
		 * The meta object literal for the '{@link emobility.impl.App_to_Energy_informationImpl <em>App to Energy information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.App_to_Energy_informationImpl
		 * @see emobility.impl.EmobilityPackageImpl#getApp_to_Energy_information()
		 * @generated
		 */
		EClass APP_TO_ENERGY_INFORMATION = eINSTANCE.getApp_to_Energy_information();

		/**
		 * The meta object literal for the '<em><b>Data type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_TO_ENERGY_INFORMATION__DATA_TYPE = eINSTANCE.getApp_to_Energy_information_Data_type();

		/**
		 * The meta object literal for the '{@link emobility.impl.Battery_health_to_from_SensorsImpl <em>Battery health to from Sensors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.Battery_health_to_from_SensorsImpl
		 * @see emobility.impl.EmobilityPackageImpl#getBattery_health_to_from_Sensors()
		 * @generated
		 */
		EClass BATTERY_HEALTH_TO_FROM_SENSORS = eINSTANCE.getBattery_health_to_from_Sensors();

		/**
		 * The meta object literal for the '<em><b>Data type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_HEALTH_TO_FROM_SENSORS__DATA_TYPE = eINSTANCE.getBattery_health_to_from_Sensors_Data_type();

		/**
		 * The meta object literal for the '{@link emobility.impl.Service_APIImpl <em>Service API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.Service_APIImpl
		 * @see emobility.impl.EmobilityPackageImpl#getService_API()
		 * @generated
		 */
		EClass SERVICE_API = eINSTANCE.getService_API();

		/**
		 * The meta object literal for the '{@link emobility.impl.Electric_VehiculeImpl <em>Electric Vehicule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.Electric_VehiculeImpl
		 * @see emobility.impl.EmobilityPackageImpl#getElectric_Vehicule()
		 * @generated
		 */
		EClass ELECTRIC_VEHICULE = eINSTANCE.getElectric_Vehicule();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_VEHICULE__VENDOR = eINSTANCE.getElectric_Vehicule_Vendor();

		/**
		 * The meta object literal for the '<em><b>Evse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRIC_VEHICULE__EVSE = eINSTANCE.getElectric_Vehicule_Evse();

		/**
		 * The meta object literal for the '{@link emobility.impl.MobileImpl <em>Mobile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.MobileImpl
		 * @see emobility.impl.EmobilityPackageImpl#getMobile()
		 * @generated
		 */
		EClass MOBILE = eINSTANCE.getMobile();

		/**
		 * The meta object literal for the '<em><b>Apk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBILE__APK = eINSTANCE.getMobile_Apk();

		/**
		 * The meta object literal for the '<em><b>OS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE__OS = eINSTANCE.getMobile_OS();

		/**
		 * The meta object literal for the '<em><b>Browser</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBILE__BROWSER = eINSTANCE.getMobile_Browser();

		/**
		 * The meta object literal for the '{@link emobility.impl.Clearing_HouseImpl <em>Clearing House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.Clearing_HouseImpl
		 * @see emobility.impl.EmobilityPackageImpl#getClearing_House()
		 * @generated
		 */
		EClass CLEARING_HOUSE = eINSTANCE.getClearing_House();

		/**
		 * The meta object literal for the '<em><b>Emsp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEARING_HOUSE__EMSP = eINSTANCE.getClearing_House_Emsp();

		/**
		 * The meta object literal for the '<em><b>Cso</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEARING_HOUSE__CSO = eINSTANCE.getClearing_House_Cso();

		/**
		 * The meta object literal for the '{@link emobility.impl.eMSPImpl <em>eMSP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.eMSPImpl
		 * @see emobility.impl.EmobilityPackageImpl#geteMSP()
		 * @generated
		 */
		EClass EMSP = eINSTANCE.geteMSP();

		/**
		 * The meta object literal for the '<em><b>Cso</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMSP__CSO = eINSTANCE.geteMSP_Cso();

		/**
		 * The meta object literal for the '<em><b>Service api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMSP__SERVICE_API = eINSTANCE.geteMSP_Service_api();

		/**
		 * The meta object literal for the '<em><b>Web application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMSP__WEB_APPLICATION = eINSTANCE.geteMSP_Web_application();

		/**
		 * The meta object literal for the '<em><b>Clearing house</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMSP__CLEARING_HOUSE = eINSTANCE.geteMSP_Clearing_house();

		/**
		 * The meta object literal for the '{@link emobility.impl.APKImpl <em>APK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.APKImpl
		 * @see emobility.impl.EmobilityPackageImpl#getAPK()
		 * @generated
		 */
		EClass APK = eINSTANCE.getAPK();

		/**
		 * The meta object literal for the '{@link emobility.impl.App_to_from_Battery_healthImpl <em>App to from Battery health</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.App_to_from_Battery_healthImpl
		 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_Battery_health()
		 * @generated
		 */
		EClass APP_TO_FROM_BATTERY_HEALTH = eINSTANCE.getApp_to_from_Battery_health();

		/**
		 * The meta object literal for the '<em><b>Data type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_TO_FROM_BATTERY_HEALTH__DATA_TYPE = eINSTANCE.getApp_to_from_Battery_health_Data_type();

		/**
		 * The meta object literal for the '{@link emobility.impl.CS_manag_sys_to_from_CS_ControllerImpl <em>CS manag sys to from CS Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.CS_manag_sys_to_from_CS_ControllerImpl
		 * @see emobility.impl.EmobilityPackageImpl#getCS_manag_sys_to_from_CS_Controller()
		 * @generated
		 */
		EClass CS_MANAG_SYS_TO_FROM_CS_CONTROLLER = eINSTANCE.getCS_manag_sys_to_from_CS_Controller();

		/**
		 * The meta object literal for the '<em><b>Data type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_MANAG_SYS_TO_FROM_CS_CONTROLLER__DATA_TYPE = eINSTANCE.getCS_manag_sys_to_from_CS_Controller_Data_type();

		/**
		 * The meta object literal for the '{@link emobility.impl.Energy_Transfer_ElementImpl <em>Energy Transfer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.Energy_Transfer_ElementImpl
		 * @see emobility.impl.EmobilityPackageImpl#getEnergy_Transfer_Element()
		 * @generated
		 */
		EClass ENERGY_TRANSFER_ELEMENT = eINSTANCE.getEnergy_Transfer_Element();

		/**
		 * The meta object literal for the '{@link emobility.impl.EV_User_ElementImpl <em>EV User Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.EV_User_ElementImpl
		 * @see emobility.impl.EmobilityPackageImpl#getEV_User_Element()
		 * @generated
		 */
		EClass EV_USER_ELEMENT = eINSTANCE.getEV_User_Element();

		/**
		 * The meta object literal for the '{@link emobility.impl.Web_ApplicationImpl <em>Web Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.Web_ApplicationImpl
		 * @see emobility.impl.EmobilityPackageImpl#getWeb_Application()
		 * @generated
		 */
		EClass WEB_APPLICATION = eINSTANCE.getWeb_Application();

		/**
		 * The meta object literal for the '{@link emobility.impl.EMobility_DataImpl <em>EMobility Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.EMobility_DataImpl
		 * @see emobility.impl.EmobilityPackageImpl#getEMobility_Data()
		 * @generated
		 */
		EClass EMOBILITY_DATA = eINSTANCE.getEMobility_Data();

		/**
		 * The meta object literal for the '{@link emobility.impl.AdministratorImpl <em>Administrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.AdministratorImpl
		 * @see emobility.impl.EmobilityPackageImpl#getAdministrator()
		 * @generated
		 */
		EClass ADMINISTRATOR = eINSTANCE.getAdministrator();

		/**
		 * The meta object literal for the '<em><b>Csms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATOR__CSMS = eINSTANCE.getAdministrator_Csms();

		/**
		 * The meta object literal for the '{@link emobility.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.CommunicationImpl
		 * @see emobility.impl.EmobilityPackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Info protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__INFO_PROTOCOL = eINSTANCE.getCommunication_Info_protocol();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__SOURCE = eINSTANCE.getCommunication_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__DESTINATION = eINSTANCE.getCommunication_Destination();

		/**
		 * The meta object literal for the '<em><b>Comm protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__COMM_PROTOCOL = eINSTANCE.getCommunication_Comm_protocol();

		/**
		 * The meta object literal for the '<em><b>Emobility data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__EMOBILITY_DATA = eINSTANCE.getCommunication_Emobility_data();

		/**
		 * The meta object literal for the '{@link emobility.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.DomainImpl
		 * @see emobility.impl.EmobilityPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Emobilityelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__EMOBILITYELEMENT = eINSTANCE.getDomain_Emobilityelement();

		/**
		 * The meta object literal for the '<em><b>Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__COMMUNICATION = eINSTANCE.getDomain_Communication();

		/**
		 * The meta object literal for the '{@link emobility.impl.SecurityControlImpl <em>Security Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.SecurityControlImpl
		 * @see emobility.impl.EmobilityPackageImpl#getSecurityControl()
		 * @generated
		 */
		EClass SECURITY_CONTROL = eINSTANCE.getSecurityControl();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTROL__TYPE = eINSTANCE.getSecurityControl_Type();

		/**
		 * The meta object literal for the '{@link emobility.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.ThreatImpl
		 * @see emobility.impl.EmobilityPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__ID = eINSTANCE.getThreat_Id();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__LIKELIHOOD = eINSTANCE.getThreat_Likelihood();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__ASSET = eINSTANCE.getThreat_Asset();

		/**
		 * The meta object literal for the '<em><b>Risk level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__RISK_LEVEL = eINSTANCE.getThreat_Risk_level();

		/**
		 * The meta object literal for the '{@link emobility.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.impl.AssetImpl
		 * @see emobility.impl.EmobilityPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__AVAILABILITY = eINSTANCE.getAsset_Availability();

		/**
		 * The meta object literal for the '<em><b>Integrity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__INTEGRITY = eINSTANCE.getAsset_Integrity();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__CONFIDENTIALITY = eINSTANCE.getAsset_Confidentiality();

		/**
		 * The meta object literal for the '<em><b>Securitycontrol</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__SECURITYCONTROL = eINSTANCE.getAsset_Securitycontrol();

		/**
		 * The meta object literal for the '{@link emobility.App_to_from_CS_operator_system_Cat <em>App to from CS operator system Cat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.App_to_from_CS_operator_system_Cat
		 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_CS_operator_system_Cat()
		 * @generated
		 */
		EEnum APP_TO_FROM_CS_OPERATOR_SYSTEM_CAT = eINSTANCE.getApp_to_from_CS_operator_system_Cat();

		/**
		 * The meta object literal for the '{@link emobility.App_to_Battery_health_Cat <em>App to Battery health Cat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.App_to_Battery_health_Cat
		 * @see emobility.impl.EmobilityPackageImpl#getApp_to_Battery_health_Cat()
		 * @generated
		 */
		EEnum APP_TO_BATTERY_HEALTH_CAT = eINSTANCE.getApp_to_Battery_health_Cat();

		/**
		 * The meta object literal for the '{@link emobility.App_to_from_from_Route_Planning_Cat <em>App to from from Route Planning Cat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.App_to_from_from_Route_Planning_Cat
		 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_from_Route_Planning_Cat()
		 * @generated
		 */
		EEnum APP_TO_FROM_FROM_ROUTE_PLANNING_CAT = eINSTANCE.getApp_to_from_from_Route_Planning_Cat();

		/**
		 * The meta object literal for the '{@link emobility.App_to_from_Energy_information_Cat <em>App to from Energy information Cat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.App_to_from_Energy_information_Cat
		 * @see emobility.impl.EmobilityPackageImpl#getApp_to_from_Energy_information_Cat()
		 * @generated
		 */
		EEnum APP_TO_FROM_ENERGY_INFORMATION_CAT = eINSTANCE.getApp_to_from_Energy_information_Cat();

		/**
		 * The meta object literal for the '{@link emobility.CS_manag_sys_to_from_CS_Controller_Cat <em>CS manag sys to from CS Controller Cat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.CS_manag_sys_to_from_CS_Controller_Cat
		 * @see emobility.impl.EmobilityPackageImpl#getCS_manag_sys_to_from_CS_Controller_Cat()
		 * @generated
		 */
		EEnum CS_MANAG_SYS_TO_FROM_CS_CONTROLLER_CAT = eINSTANCE.getCS_manag_sys_to_from_CS_Controller_Cat();

		/**
		 * The meta object literal for the '{@link emobility.CS_operator_sys_to_from_CS_manag_sys_Cat <em>CS operator sys to from CS manag sys Cat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.CS_operator_sys_to_from_CS_manag_sys_Cat
		 * @see emobility.impl.EmobilityPackageImpl#getCS_operator_sys_to_from_CS_manag_sys_Cat()
		 * @generated
		 */
		EEnum CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS_CAT = eINSTANCE.getCS_operator_sys_to_from_CS_manag_sys_Cat();

		/**
		 * The meta object literal for the '{@link emobility.mOS_type <em>mOS type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.mOS_type
		 * @see emobility.impl.EmobilityPackageImpl#getmOS_type()
		 * @generated
		 */
		EEnum MOS_TYPE = eINSTANCE.getmOS_type();

		/**
		 * The meta object literal for the '{@link emobility.Battery_health_to_from_Sensors_Cat <em>Battery health to from Sensors Cat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.Battery_health_to_from_Sensors_Cat
		 * @see emobility.impl.EmobilityPackageImpl#getBattery_health_to_from_Sensors_Cat()
		 * @generated
		 */
		EEnum BATTERY_HEALTH_TO_FROM_SENSORS_CAT = eINSTANCE.getBattery_health_to_from_Sensors_Cat();

		/**
		 * The meta object literal for the '{@link emobility.Information_Protocol <em>Information Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.Information_Protocol
		 * @see emobility.impl.EmobilityPackageImpl#getInformation_Protocol()
		 * @generated
		 */
		EEnum INFORMATION_PROTOCOL = eINSTANCE.getInformation_Protocol();

		/**
		 * The meta object literal for the '{@link emobility.Vendor_Type <em>Vendor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.Vendor_Type
		 * @see emobility.impl.EmobilityPackageImpl#getVendor_Type()
		 * @generated
		 */
		EEnum VENDOR_TYPE = eINSTANCE.getVendor_Type();

		/**
		 * The meta object literal for the '{@link emobility.OS_Type <em>OS Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.OS_Type
		 * @see emobility.impl.EmobilityPackageImpl#getOS_Type()
		 * @generated
		 */
		EEnum OS_TYPE = eINSTANCE.getOS_Type();

		/**
		 * The meta object literal for the '{@link emobility.Communication_Protocol <em>Communication Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.Communication_Protocol
		 * @see emobility.impl.EmobilityPackageImpl#getCommunication_Protocol()
		 * @generated
		 */
		EEnum COMMUNICATION_PROTOCOL = eINSTANCE.getCommunication_Protocol();

		/**
		 * The meta object literal for the '{@link emobility.Security_Controls <em>Security Controls</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.Security_Controls
		 * @see emobility.impl.EmobilityPackageImpl#getSecurity_Controls()
		 * @generated
		 */
		EEnum SECURITY_CONTROLS = eINSTANCE.getSecurity_Controls();

		/**
		 * The meta object literal for the '{@link emobility.CIA_Level <em>CIA Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.CIA_Level
		 * @see emobility.impl.EmobilityPackageImpl#getCIA_Level()
		 * @generated
		 */
		EEnum CIA_LEVEL = eINSTANCE.getCIA_Level();

		/**
		 * The meta object literal for the '{@link emobility.Threat_Category <em>Threat Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.Threat_Category
		 * @see emobility.impl.EmobilityPackageImpl#getThreat_Category()
		 * @generated
		 */
		EEnum THREAT_CATEGORY = eINSTANCE.getThreat_Category();

		/**
		 * The meta object literal for the '{@link emobility.Likelihood_Level <em>Likelihood Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emobility.Likelihood_Level
		 * @see emobility.impl.EmobilityPackageImpl#getLikelihood_Level()
		 * @generated
		 */
		EEnum LIKELIHOOD_LEVEL = eINSTANCE.getLikelihood_Level();

	}

} //EmobilityPackage
