/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Battery health to from Sensors Cat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getBattery_health_to_from_Sensors_Cat()
 * @model
 * @generated
 */
public enum Battery_health_to_from_Sensors_Cat implements Enumerator {
	/**
	 * The '<em><b>Vehicle Identification Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEHICLE_IDENTIFICATION_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	VEHICLE_IDENTIFICATION_NUMBER(0, "Vehicle_Identification_Number", "Vehicle_Identification_Number"),

	/**
	 * The '<em><b>State of Charge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_OF_CHARGE_VALUE
	 * @generated
	 * @ordered
	 */
	STATE_OF_CHARGE(1, "State_of_Charge", "State_of_Charge"),

	/**
	 * The '<em><b>Remaining range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMAINING_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	REMAINING_RANGE(2, "Remaining_range", "Remaining_range");

	/**
	 * The '<em><b>Vehicle Identification Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEHICLE_IDENTIFICATION_NUMBER
	 * @model name="Vehicle_Identification_Number"
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE_IDENTIFICATION_NUMBER_VALUE = 0;

	/**
	 * The '<em><b>State of Charge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_OF_CHARGE
	 * @model name="State_of_Charge"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_OF_CHARGE_VALUE = 1;

	/**
	 * The '<em><b>Remaining range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMAINING_RANGE
	 * @model name="Remaining_range"
	 * @generated
	 * @ordered
	 */
	public static final int REMAINING_RANGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Battery health to from Sensors Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Battery_health_to_from_Sensors_Cat[] VALUES_ARRAY =
		new Battery_health_to_from_Sensors_Cat[] {
			VEHICLE_IDENTIFICATION_NUMBER,
			STATE_OF_CHARGE,
			REMAINING_RANGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Battery health to from Sensors Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Battery_health_to_from_Sensors_Cat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Battery health to from Sensors Cat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Battery_health_to_from_Sensors_Cat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Battery_health_to_from_Sensors_Cat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Battery health to from Sensors Cat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Battery_health_to_from_Sensors_Cat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Battery_health_to_from_Sensors_Cat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Battery health to from Sensors Cat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Battery_health_to_from_Sensors_Cat get(int value) {
		switch (value) {
			case VEHICLE_IDENTIFICATION_NUMBER_VALUE: return VEHICLE_IDENTIFICATION_NUMBER;
			case STATE_OF_CHARGE_VALUE: return STATE_OF_CHARGE;
			case REMAINING_RANGE_VALUE: return REMAINING_RANGE;
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
	private Battery_health_to_from_Sensors_Cat(int value, String name, String literal) {
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
	
} //Battery_health_to_from_Sensors_Cat
