/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Communication Protocol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getCommunication_Protocol()
 * @model
 * @generated
 */
public enum Communication_Protocol implements Enumerator {
	/**
	 * The '<em><b>HTTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP(0, "HTTP", "HTTP"),

	/**
	 * The '<em><b>HTTPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPS_VALUE
	 * @generated
	 * @ordered
	 */
	HTTPS(1, "HTTPS", "HTTPS"),

	/**
	 * The '<em><b>TCP IP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCP_IP_VALUE
	 * @generated
	 * @ordered
	 */
	TCP_IP(2, "TCP_IP", "TCP_IP"),

	/**
	 * The '<em><b>CAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_VALUE
	 * @generated
	 * @ordered
	 */
	CAN(3, "CAN", "CAN"),

	/**
	 * The '<em><b>Flexray</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLEXRAY_VALUE
	 * @generated
	 * @ordered
	 */
	FLEXRAY(4, "Flexray", "Flexray"),

	/**
	 * The '<em><b>Ethernet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET(5, "Ethernet", "Ethernet"),

	/**
	 * The '<em><b>TCP IP XML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCP_IP_XML_VALUE
	 * @generated
	 * @ordered
	 */
	TCP_IP_XML(6, "TCP_IP_XML", "TCP_IP_XML"),

	/**
	 * The '<em><b>PWM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PWM_VALUE
	 * @generated
	 * @ordered
	 */
	PWM(7, "PWM", "PWM"),

	/**
	 * The '<em><b>CAN CH Ade MO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_CH_ADE_MO_VALUE
	 * @generated
	 * @ordered
	 */
	CAN_CH_ADE_MO(8, "CAN_CHAdeMO", "CAN_CHAdeMO"),

	/**
	 * The '<em><b>ASN 1MMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASN_1MMS_VALUE
	 * @generated
	 * @ordered
	 */
	ASN_1MMS(9, "ASN_1_MMS", "ASN_1_MMS"),

	/**
	 * The '<em><b>EN 13321</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_13321_VALUE
	 * @generated
	 * @ordered
	 */
	EN_13321(10, "EN_13321", "EN_13321"),

	/**
	 * The '<em><b>HBES KNX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HBES_KNX_VALUE
	 * @generated
	 * @ordered
	 */
	HBES_KNX(11, "HBES_KNX", "HBES_KNX"),

	/**
	 * The '<em><b>ETHERNET WIFI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET_WIFI_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET_WIFI(12, "ETHERNET_WIFI", "ETHERNET_WIFI"),

	/**
	 * The '<em><b>IEC 61968 100 Energy markets</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_61968_100_ENERGY_MARKETS_VALUE
	 * @generated
	 * @ordered
	 */
	IEC_61968_100_ENERGY_MARKETS(13, "IEC_61968_100_Energy_markets", "IEC_61968_100_Energy_markets"),

	/**
	 * The '<em><b>EN 62325 450 451 marketplace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_62325_450_451_MARKETPLACE_VALUE
	 * @generated
	 * @ordered
	 */
	EN_62325_450_451_MARKETPLACE(14, "EN_62325_450_451_marketplace", "EN_62325_450_451_marketplace");

	/**
	 * The '<em><b>HTTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_VALUE = 0;

	/**
	 * The '<em><b>HTTPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTPS_VALUE = 1;

	/**
	 * The '<em><b>TCP IP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCP_IP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TCP_IP_VALUE = 2;

	/**
	 * The '<em><b>CAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAN_VALUE = 3;

	/**
	 * The '<em><b>Flexray</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLEXRAY
	 * @model name="Flexray"
	 * @generated
	 * @ordered
	 */
	public static final int FLEXRAY_VALUE = 4;

	/**
	 * The '<em><b>Ethernet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET
	 * @model name="Ethernet"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET_VALUE = 5;

	/**
	 * The '<em><b>TCP IP XML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCP_IP_XML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TCP_IP_XML_VALUE = 6;

	/**
	 * The '<em><b>PWM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PWM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PWM_VALUE = 7;

	/**
	 * The '<em><b>CAN CH Ade MO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_CH_ADE_MO
	 * @model name="CAN_CHAdeMO"
	 * @generated
	 * @ordered
	 */
	public static final int CAN_CH_ADE_MO_VALUE = 8;

	/**
	 * The '<em><b>ASN 1MMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASN_1MMS
	 * @model name="ASN_1_MMS"
	 * @generated
	 * @ordered
	 */
	public static final int ASN_1MMS_VALUE = 9;

	/**
	 * The '<em><b>EN 13321</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_13321
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EN_13321_VALUE = 10;

	/**
	 * The '<em><b>HBES KNX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HBES_KNX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HBES_KNX_VALUE = 11;

	/**
	 * The '<em><b>ETHERNET WIFI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET_WIFI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET_WIFI_VALUE = 12;

	/**
	 * The '<em><b>IEC 61968 100 Energy markets</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_61968_100_ENERGY_MARKETS
	 * @model name="IEC_61968_100_Energy_markets"
	 * @generated
	 * @ordered
	 */
	public static final int IEC_61968_100_ENERGY_MARKETS_VALUE = 13;

	/**
	 * The '<em><b>EN 62325 450 451 marketplace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_62325_450_451_MARKETPLACE
	 * @model name="EN_62325_450_451_marketplace"
	 * @generated
	 * @ordered
	 */
	public static final int EN_62325_450_451_MARKETPLACE_VALUE = 14;

	/**
	 * An array of all the '<em><b>Communication Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Communication_Protocol[] VALUES_ARRAY =
		new Communication_Protocol[] {
			HTTP,
			HTTPS,
			TCP_IP,
			CAN,
			FLEXRAY,
			ETHERNET,
			TCP_IP_XML,
			PWM,
			CAN_CH_ADE_MO,
			ASN_1MMS,
			EN_13321,
			HBES_KNX,
			ETHERNET_WIFI,
			IEC_61968_100_ENERGY_MARKETS,
			EN_62325_450_451_MARKETPLACE,
		};

	/**
	 * A public read-only list of all the '<em><b>Communication Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Communication_Protocol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Communication Protocol</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Communication_Protocol get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Communication_Protocol result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Communication Protocol</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Communication_Protocol getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Communication_Protocol result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Communication Protocol</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Communication_Protocol get(int value) {
		switch (value) {
			case HTTP_VALUE: return HTTP;
			case HTTPS_VALUE: return HTTPS;
			case TCP_IP_VALUE: return TCP_IP;
			case CAN_VALUE: return CAN;
			case FLEXRAY_VALUE: return FLEXRAY;
			case ETHERNET_VALUE: return ETHERNET;
			case TCP_IP_XML_VALUE: return TCP_IP_XML;
			case PWM_VALUE: return PWM;
			case CAN_CH_ADE_MO_VALUE: return CAN_CH_ADE_MO;
			case ASN_1MMS_VALUE: return ASN_1MMS;
			case EN_13321_VALUE: return EN_13321;
			case HBES_KNX_VALUE: return HBES_KNX;
			case ETHERNET_WIFI_VALUE: return ETHERNET_WIFI;
			case IEC_61968_100_ENERGY_MARKETS_VALUE: return IEC_61968_100_ENERGY_MARKETS;
			case EN_62325_450_451_MARKETPLACE_VALUE: return EN_62325_450_451_MARKETPLACE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Communication_Protocol(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Communication_Protocol
