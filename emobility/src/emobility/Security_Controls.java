/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Security Controls</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getSecurity_Controls()
 * @model
 * @generated
 */
public enum Security_Controls implements Enumerator {
	/**
	 * The '<em><b>Encryption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCRYPTION_VALUE
	 * @generated
	 * @ordered
	 */
	ENCRYPTION(0, "Encryption", "Encryption"),

	/**
	 * The '<em><b>WAF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAF_VALUE
	 * @generated
	 * @ordered
	 */
	WAF(1, "WAF", "WAF"),

	/**
	 * The '<em><b>IP Filtering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_FILTERING_VALUE
	 * @generated
	 * @ordered
	 */
	IP_FILTERING(2, "IP_Filtering", "IP_Filtering"),

	/**
	 * The '<em><b>Antimalware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTIMALWARE_VALUE
	 * @generated
	 * @ordered
	 */
	ANTIMALWARE(3, "Antimalware", "Antimalware"),

	/**
	 * The '<em><b>IPS IDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPS_IDS_VALUE
	 * @generated
	 * @ordered
	 */
	IPS_IDS(4, "IPS_IDS", "IPS_IDS"),

	/**
	 * The '<em><b>Authentication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHENTICATION(5, "Authentication", "Authentication"),

	/**
	 * The '<em><b>API Management</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	API_MANAGEMENT(6, "API_Management", "API_Management");

	/**
	 * The '<em><b>Encryption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCRYPTION
	 * @model name="Encryption"
	 * @generated
	 * @ordered
	 */
	public static final int ENCRYPTION_VALUE = 0;

	/**
	 * The '<em><b>WAF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAF_VALUE = 1;

	/**
	 * The '<em><b>IP Filtering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_FILTERING
	 * @model name="IP_Filtering"
	 * @generated
	 * @ordered
	 */
	public static final int IP_FILTERING_VALUE = 2;

	/**
	 * The '<em><b>Antimalware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTIMALWARE
	 * @model name="Antimalware"
	 * @generated
	 * @ordered
	 */
	public static final int ANTIMALWARE_VALUE = 3;

	/**
	 * The '<em><b>IPS IDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPS_IDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPS_IDS_VALUE = 4;

	/**
	 * The '<em><b>Authentication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION
	 * @model name="Authentication"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHENTICATION_VALUE = 5;

	/**
	 * The '<em><b>API Management</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_MANAGEMENT
	 * @model name="API_Management"
	 * @generated
	 * @ordered
	 */
	public static final int API_MANAGEMENT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Security Controls</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Security_Controls[] VALUES_ARRAY =
		new Security_Controls[] {
			ENCRYPTION,
			WAF,
			IP_FILTERING,
			ANTIMALWARE,
			IPS_IDS,
			AUTHENTICATION,
			API_MANAGEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Security Controls</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Security_Controls> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Security Controls</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Security_Controls get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Security_Controls result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Controls</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Security_Controls getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Security_Controls result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Controls</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Security_Controls get(int value) {
		switch (value) {
			case ENCRYPTION_VALUE: return ENCRYPTION;
			case WAF_VALUE: return WAF;
			case IP_FILTERING_VALUE: return IP_FILTERING;
			case ANTIMALWARE_VALUE: return ANTIMALWARE;
			case IPS_IDS_VALUE: return IPS_IDS;
			case AUTHENTICATION_VALUE: return AUTHENTICATION;
			case API_MANAGEMENT_VALUE: return API_MANAGEMENT;
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
	private Security_Controls(int value, String name, String literal) {
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
	
} //Security_Controls
