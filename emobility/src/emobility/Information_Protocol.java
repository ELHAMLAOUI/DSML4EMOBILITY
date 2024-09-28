/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Information Protocol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getInformation_Protocol()
 * @model
 * @generated
 */
public enum Information_Protocol implements Enumerator {
	/**
	 * The '<em><b>ISO IEC 15118</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_IEC_15118_VALUE
	 * @generated
	 * @ordered
	 */
	ISO_IEC_15118(0, "ISO_IEC_15118", "ISO_IEC_15118"),

	/**
	 * The '<em><b>ISO 61851</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_61851_VALUE
	 * @generated
	 * @ordered
	 */
	ISO_61851(1, "ISO_61851", "ISO_61851"),

	/**
	 * The '<em><b>OCPP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCPP_VALUE
	 * @generated
	 * @ordered
	 */
	OCPP(2, "OCPP", "OCPP"),

	/**
	 * The '<em><b>OSCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSCP_VALUE
	 * @generated
	 * @ordered
	 */
	OSCP(3, "OSCP", "OSCP"),

	/**
	 * The '<em><b>OPEN ADR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_ADR_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_ADR(4, "OPEN_ADR", "OPEN_ADR"),

	/**
	 * The '<em><b>OCPI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCPI_VALUE
	 * @generated
	 * @ordered
	 */
	OCPI(5, "OCPI", "OCPI"),

	/**
	 * The '<em><b>OCHP Direct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCHP_DIRECT_VALUE
	 * @generated
	 * @ordered
	 */
	OCHP_DIRECT(6, "OCHPDirect", "OCHPDirect"),

	/**
	 * The '<em><b>OIPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIPC_VALUE
	 * @generated
	 * @ordered
	 */
	OIPC(7, "OIPC", "OIPC"),

	/**
	 * The '<em><b>OCHP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCHP_VALUE
	 * @generated
	 * @ordered
	 */
	OCHP(8, "OCHP", "OCHP"),

	/**
	 * The '<em><b>EMIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMIP_VALUE
	 * @generated
	 * @ordered
	 */
	EMIP(10, "eMIP", "eMIP"),

	/**
	 * The '<em><b>OASIS EMIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OASIS_EMIX_VALUE
	 * @generated
	 * @ordered
	 */
	OASIS_EMIX(11, "OASIS_EMIX", "OASIS_EMIX"),

	/**
	 * The '<em><b>Energy Interop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_INTEROP_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_INTEROP(11, "EnergyInterop", "EnergyInterop"),

	/**
	 * The '<em><b>IEC 62325</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_62325_VALUE
	 * @generated
	 * @ordered
	 */
	IEC_62325(12, "IEC_62325", "IEC_62325"),

	/**
	 * The '<em><b>EN 6232 301 351 Entso eMADES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_6232_301_351_ENTSO_EMADES_VALUE
	 * @generated
	 * @ordered
	 */
	EN_6232_301_351_ENTSO_EMADES(13, "EN_6232_301_351_Entso_e_MADES", "EN_6232_301_351_Entso_e_MADES"),

	/**
	 * The '<em><b>IEEE 2023 5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE_2023_5_VALUE
	 * @generated
	 * @ordered
	 */
	IEEE_2023_5(14, "IEEE_2023_5", "IEEE_2023_5"),

	/**
	 * The '<em><b>IEC 61850</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_61850_VALUE
	 * @generated
	 * @ordered
	 */
	IEC_61850(15, "IEC_61850", "IEC_61850"),

	/**
	 * The '<em><b>XDLMS COSEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDLMS_COSEM_VALUE
	 * @generated
	 * @ordered
	 */
	XDLMS_COSEM(16, "xDLMS_COSEM", "xDLMS_COSEM"),

	/**
	 * The '<em><b>IEC 61850 90 8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_61850_90_8_VALUE
	 * @generated
	 * @ordered
	 */
	IEC_61850_90_8(17, "IEC_61850_90_8", "IEC_61850_90_8"),

	/**
	 * The '<em><b>API REST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_REST_VALUE
	 * @generated
	 * @ordered
	 */
	API_REST(18, "API_REST", "API_REST");

	/**
	 * The '<em><b>ISO IEC 15118</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_IEC_15118
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISO_IEC_15118_VALUE = 0;

	/**
	 * The '<em><b>ISO 61851</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_61851
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISO_61851_VALUE = 1;

	/**
	 * The '<em><b>OCPP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCPP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCPP_VALUE = 2;

	/**
	 * The '<em><b>OSCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSCP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OSCP_VALUE = 3;

	/**
	 * The '<em><b>OPEN ADR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_ADR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_ADR_VALUE = 4;

	/**
	 * The '<em><b>OCPI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCPI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCPI_VALUE = 5;

	/**
	 * The '<em><b>OCHP Direct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCHP_DIRECT
	 * @model name="OCHPDirect"
	 * @generated
	 * @ordered
	 */
	public static final int OCHP_DIRECT_VALUE = 6;

	/**
	 * The '<em><b>OIPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OIPC_VALUE = 7;

	/**
	 * The '<em><b>OCHP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCHP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCHP_VALUE = 8;

	/**
	 * The '<em><b>EMIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMIP
	 * @model name="eMIP"
	 * @generated
	 * @ordered
	 */
	public static final int EMIP_VALUE = 10;

	/**
	 * The '<em><b>OASIS EMIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OASIS_EMIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OASIS_EMIX_VALUE = 11;

	/**
	 * The '<em><b>Energy Interop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_INTEROP
	 * @model name="EnergyInterop"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_INTEROP_VALUE = 11;

	/**
	 * The '<em><b>IEC 62325</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_62325
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IEC_62325_VALUE = 12;

	/**
	 * The '<em><b>EN 6232 301 351 Entso eMADES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_6232_301_351_ENTSO_EMADES
	 * @model name="EN_6232_301_351_Entso_e_MADES"
	 * @generated
	 * @ordered
	 */
	public static final int EN_6232_301_351_ENTSO_EMADES_VALUE = 13;

	/**
	 * The '<em><b>IEEE 2023 5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE_2023_5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IEEE_2023_5_VALUE = 14;

	/**
	 * The '<em><b>IEC 61850</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_61850
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IEC_61850_VALUE = 15;

	/**
	 * The '<em><b>XDLMS COSEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDLMS_COSEM
	 * @model name="xDLMS_COSEM"
	 * @generated
	 * @ordered
	 */
	public static final int XDLMS_COSEM_VALUE = 16;

	/**
	 * The '<em><b>IEC 61850 90 8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_61850_90_8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IEC_61850_90_8_VALUE = 17;

	/**
	 * The '<em><b>API REST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_REST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int API_REST_VALUE = 18;

	/**
	 * An array of all the '<em><b>Information Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Information_Protocol[] VALUES_ARRAY =
		new Information_Protocol[] {
			ISO_IEC_15118,
			ISO_61851,
			OCPP,
			OSCP,
			OPEN_ADR,
			OCPI,
			OCHP_DIRECT,
			OIPC,
			OCHP,
			EMIP,
			OASIS_EMIX,
			ENERGY_INTEROP,
			IEC_62325,
			EN_6232_301_351_ENTSO_EMADES,
			IEEE_2023_5,
			IEC_61850,
			XDLMS_COSEM,
			IEC_61850_90_8,
			API_REST,
		};

	/**
	 * A public read-only list of all the '<em><b>Information Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Information_Protocol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Information Protocol</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Information_Protocol get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Information_Protocol result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Information Protocol</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Information_Protocol getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Information_Protocol result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Information Protocol</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Information_Protocol get(int value) {
		switch (value) {
			case ISO_IEC_15118_VALUE: return ISO_IEC_15118;
			case ISO_61851_VALUE: return ISO_61851;
			case OCPP_VALUE: return OCPP;
			case OSCP_VALUE: return OSCP;
			case OPEN_ADR_VALUE: return OPEN_ADR;
			case OCPI_VALUE: return OCPI;
			case OCHP_DIRECT_VALUE: return OCHP_DIRECT;
			case OIPC_VALUE: return OIPC;
			case OCHP_VALUE: return OCHP;
			case EMIP_VALUE: return EMIP;
			case OASIS_EMIX_VALUE: return OASIS_EMIX;
			case IEC_62325_VALUE: return IEC_62325;
			case EN_6232_301_351_ENTSO_EMADES_VALUE: return EN_6232_301_351_ENTSO_EMADES;
			case IEEE_2023_5_VALUE: return IEEE_2023_5;
			case IEC_61850_VALUE: return IEC_61850;
			case XDLMS_COSEM_VALUE: return XDLMS_COSEM;
			case IEC_61850_90_8_VALUE: return IEC_61850_90_8;
			case API_REST_VALUE: return API_REST;
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
	private Information_Protocol(int value, String name, String literal) {
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
	
} //Information_Protocol
