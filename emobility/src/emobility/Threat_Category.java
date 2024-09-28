/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Threat Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getThreat_Category()
 * @model
 * @generated
 */
public enum Threat_Category implements Enumerator {
	/**
	 * The '<em><b>Spoofing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOOFING_VALUE
	 * @generated
	 * @ordered
	 */
	SPOOFING(0, "Spoofing", "Spoofing"),

	/**
	 * The '<em><b>Tampering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAMPERING_VALUE
	 * @generated
	 * @ordered
	 */
	TAMPERING(1, "Tampering", "Tampering"),

	/**
	 * The '<em><b>Repudiation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPUDIATION_VALUE
	 * @generated
	 * @ordered
	 */
	REPUDIATION(2, "Repudiation", "Repudiation"),

	/**
	 * The '<em><b>Information Disclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_DISCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION_DISCLOSURE(2, "Information_Disclosure", "Information_Disclosure"),

	/**
	 * The '<em><b>Denial of Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENIAL_OF_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DENIAL_OF_SERVICE(2, "Denial_of_Service", "Denial_of_Service"),

	/**
	 * The '<em><b>Elevation of Privilege</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATION_OF_PRIVILEGE_VALUE
	 * @generated
	 * @ordered
	 */
	ELEVATION_OF_PRIVILEGE(5, "Elevation_of_Privilege", "Elevation_of_Privilege");

	/**
	 * The '<em><b>Spoofing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOOFING
	 * @model name="Spoofing"
	 * @generated
	 * @ordered
	 */
	public static final int SPOOFING_VALUE = 0;

	/**
	 * The '<em><b>Tampering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAMPERING
	 * @model name="Tampering"
	 * @generated
	 * @ordered
	 */
	public static final int TAMPERING_VALUE = 1;

	/**
	 * The '<em><b>Repudiation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPUDIATION
	 * @model name="Repudiation"
	 * @generated
	 * @ordered
	 */
	public static final int REPUDIATION_VALUE = 2;

	/**
	 * The '<em><b>Information Disclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_DISCLOSURE
	 * @model name="Information_Disclosure"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION_DISCLOSURE_VALUE = 2;

	/**
	 * The '<em><b>Denial of Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENIAL_OF_SERVICE
	 * @model name="Denial_of_Service"
	 * @generated
	 * @ordered
	 */
	public static final int DENIAL_OF_SERVICE_VALUE = 2;

	/**
	 * The '<em><b>Elevation of Privilege</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATION_OF_PRIVILEGE
	 * @model name="Elevation_of_Privilege"
	 * @generated
	 * @ordered
	 */
	public static final int ELEVATION_OF_PRIVILEGE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Threat Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Threat_Category[] VALUES_ARRAY =
		new Threat_Category[] {
			SPOOFING,
			TAMPERING,
			REPUDIATION,
			INFORMATION_DISCLOSURE,
			DENIAL_OF_SERVICE,
			ELEVATION_OF_PRIVILEGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Threat Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Threat_Category> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Threat Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Threat_Category get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Threat_Category result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Threat Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Threat_Category getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Threat_Category result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Threat Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Threat_Category get(int value) {
		switch (value) {
			case SPOOFING_VALUE: return SPOOFING;
			case TAMPERING_VALUE: return TAMPERING;
			case REPUDIATION_VALUE: return REPUDIATION;
			case ELEVATION_OF_PRIVILEGE_VALUE: return ELEVATION_OF_PRIVILEGE;
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
	private Threat_Category(int value, String name, String literal) {
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
	
} //Threat_Category
