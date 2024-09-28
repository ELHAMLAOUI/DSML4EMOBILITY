/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CS operator sys to from CS manag sys Cat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getCS_operator_sys_to_from_CS_manag_sys_Cat()
 * @model
 * @generated
 */
public enum CS_operator_sys_to_from_CS_manag_sys_Cat implements Enumerator {
	/**
	 * The '<em><b>Connector ID type nstandard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_ID_TYPE_NSTANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTOR_ID_TYPE_NSTANDARD(0, "Connector_ID_type_n_standard", "Connector_ID_type_n_standard"),

	/**
	 * The '<em><b>Maximum capacity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_CAPACITY_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM_CAPACITY(1, "Maximum_capacity", "Maximum_capacity"),

	/**
	 * The '<em><b>Charging Station ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGING_STATION_ID_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGING_STATION_ID(2, "Charging_Station_ID", "Charging_Station_ID");

	/**
	 * The '<em><b>Connector ID type nstandard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_ID_TYPE_NSTANDARD
	 * @model name="Connector_ID_type_n_standard"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR_ID_TYPE_NSTANDARD_VALUE = 0;

	/**
	 * The '<em><b>Maximum capacity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_CAPACITY
	 * @model name="Maximum_capacity"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_CAPACITY_VALUE = 1;

	/**
	 * The '<em><b>Charging Station ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGING_STATION_ID
	 * @model name="Charging_Station_ID"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGING_STATION_ID_VALUE = 2;

	/**
	 * An array of all the '<em><b>CS operator sys to from CS manag sys Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CS_operator_sys_to_from_CS_manag_sys_Cat[] VALUES_ARRAY =
		new CS_operator_sys_to_from_CS_manag_sys_Cat[] {
			CONNECTOR_ID_TYPE_NSTANDARD,
			MAXIMUM_CAPACITY,
			CHARGING_STATION_ID,
		};

	/**
	 * A public read-only list of all the '<em><b>CS operator sys to from CS manag sys Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CS_operator_sys_to_from_CS_manag_sys_Cat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CS operator sys to from CS manag sys Cat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CS_operator_sys_to_from_CS_manag_sys_Cat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CS_operator_sys_to_from_CS_manag_sys_Cat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CS operator sys to from CS manag sys Cat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CS_operator_sys_to_from_CS_manag_sys_Cat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CS_operator_sys_to_from_CS_manag_sys_Cat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CS operator sys to from CS manag sys Cat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CS_operator_sys_to_from_CS_manag_sys_Cat get(int value) {
		switch (value) {
			case CONNECTOR_ID_TYPE_NSTANDARD_VALUE: return CONNECTOR_ID_TYPE_NSTANDARD;
			case MAXIMUM_CAPACITY_VALUE: return MAXIMUM_CAPACITY;
			case CHARGING_STATION_ID_VALUE: return CHARGING_STATION_ID;
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
	private CS_operator_sys_to_from_CS_manag_sys_Cat(int value, String name, String literal) {
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
	
} //CS_operator_sys_to_from_CS_manag_sys_Cat
