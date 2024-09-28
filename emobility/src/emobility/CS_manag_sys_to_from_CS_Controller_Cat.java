/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CS manag sys to from CS Controller Cat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getCS_manag_sys_to_from_CS_Controller_Cat()
 * @model
 * @generated
 */
public enum CS_manag_sys_to_from_CS_Controller_Cat implements Enumerator {
	/**
	 * The '<em><b>Charging Station ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGING_STATION_ID_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGING_STATION_ID(0, "Charging_Station_ID", "Charging_Station_ID"),

	/**
	 * The '<em><b>Connector ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_ID_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTOR_ID(1, "Connector_ID", "Connector_ID"),

	/**
	 * The '<em><b>Status Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS_INFORMATION(2, "Status_Information", "Status_Information");

	/**
	 * The '<em><b>Charging Station ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGING_STATION_ID
	 * @model name="Charging_Station_ID"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGING_STATION_ID_VALUE = 0;

	/**
	 * The '<em><b>Connector ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_ID
	 * @model name="Connector_ID"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR_ID_VALUE = 1;

	/**
	 * The '<em><b>Status Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_INFORMATION
	 * @model name="Status_Information"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_INFORMATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>CS manag sys to from CS Controller Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CS_manag_sys_to_from_CS_Controller_Cat[] VALUES_ARRAY =
		new CS_manag_sys_to_from_CS_Controller_Cat[] {
			CHARGING_STATION_ID,
			CONNECTOR_ID,
			STATUS_INFORMATION,
		};

	/**
	 * A public read-only list of all the '<em><b>CS manag sys to from CS Controller Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CS_manag_sys_to_from_CS_Controller_Cat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CS manag sys to from CS Controller Cat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CS_manag_sys_to_from_CS_Controller_Cat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CS_manag_sys_to_from_CS_Controller_Cat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CS manag sys to from CS Controller Cat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CS_manag_sys_to_from_CS_Controller_Cat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CS_manag_sys_to_from_CS_Controller_Cat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CS manag sys to from CS Controller Cat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CS_manag_sys_to_from_CS_Controller_Cat get(int value) {
		switch (value) {
			case CHARGING_STATION_ID_VALUE: return CHARGING_STATION_ID;
			case CONNECTOR_ID_VALUE: return CONNECTOR_ID;
			case STATUS_INFORMATION_VALUE: return STATUS_INFORMATION;
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
	private CS_manag_sys_to_from_CS_Controller_Cat(int value, String name, String literal) {
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
	
} //CS_manag_sys_to_from_CS_Controller_Cat
