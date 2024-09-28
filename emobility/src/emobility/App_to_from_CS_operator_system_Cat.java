/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>App to from CS operator system Cat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getApp_to_from_CS_operator_system_Cat()
 * @model
 * @generated
 */
public enum App_to_from_CS_operator_system_Cat implements Enumerator {
	/**
	 * The '<em><b>GPS coordinates of amiddle point on the trip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPS_COORDINATES_OF_AMIDDLE_POINT_ON_THE_TRIP_VALUE
	 * @generated
	 * @ordered
	 */
	GPS_COORDINATES_OF_AMIDDLE_POINT_ON_THE_TRIP(0, "GPS_coordinates_of_a_middle_point_on_the_trip", "GPS_coordinates_of_a_middle_point_on_the_trip"),

	/**
	 * The '<em><b>Radius value for Charging Stations filtering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIUS_VALUE_FOR_CHARGING_STATIONS_FILTERING_VALUE
	 * @generated
	 * @ordered
	 */
	RADIUS_VALUE_FOR_CHARGING_STATIONS_FILTERING(1, "Radius_value_for_Charging_Stations_filtering", "Radius_value_for_Charging_Stations_filtering"),

	/**
	 * The '<em><b>GPS coordinates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPS_COORDINATES_VALUE
	 * @generated
	 * @ordered
	 */
	GPS_COORDINATES(2, "GPS_coordinates", "GPS_coordinates"),

	/**
	 * The '<em><b>Charging Station ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGING_STATION_ID_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGING_STATION_ID(3, "Charging_Station_ID", "Charging_Station_ID");

	/**
	 * The '<em><b>GPS coordinates of amiddle point on the trip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPS_COORDINATES_OF_AMIDDLE_POINT_ON_THE_TRIP
	 * @model name="GPS_coordinates_of_a_middle_point_on_the_trip"
	 * @generated
	 * @ordered
	 */
	public static final int GPS_COORDINATES_OF_AMIDDLE_POINT_ON_THE_TRIP_VALUE = 0;

	/**
	 * The '<em><b>Radius value for Charging Stations filtering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIUS_VALUE_FOR_CHARGING_STATIONS_FILTERING
	 * @model name="Radius_value_for_Charging_Stations_filtering"
	 * @generated
	 * @ordered
	 */
	public static final int RADIUS_VALUE_FOR_CHARGING_STATIONS_FILTERING_VALUE = 1;

	/**
	 * The '<em><b>GPS coordinates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPS_COORDINATES
	 * @model name="GPS_coordinates"
	 * @generated
	 * @ordered
	 */
	public static final int GPS_COORDINATES_VALUE = 2;

	/**
	 * The '<em><b>Charging Station ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGING_STATION_ID
	 * @model name="Charging_Station_ID"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGING_STATION_ID_VALUE = 3;

	/**
	 * An array of all the '<em><b>App to from CS operator system Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final App_to_from_CS_operator_system_Cat[] VALUES_ARRAY =
		new App_to_from_CS_operator_system_Cat[] {
			GPS_COORDINATES_OF_AMIDDLE_POINT_ON_THE_TRIP,
			RADIUS_VALUE_FOR_CHARGING_STATIONS_FILTERING,
			GPS_COORDINATES,
			CHARGING_STATION_ID,
		};

	/**
	 * A public read-only list of all the '<em><b>App to from CS operator system Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<App_to_from_CS_operator_system_Cat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>App to from CS operator system Cat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_from_CS_operator_system_Cat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			App_to_from_CS_operator_system_Cat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>App to from CS operator system Cat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_from_CS_operator_system_Cat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			App_to_from_CS_operator_system_Cat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>App to from CS operator system Cat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_from_CS_operator_system_Cat get(int value) {
		switch (value) {
			case GPS_COORDINATES_OF_AMIDDLE_POINT_ON_THE_TRIP_VALUE: return GPS_COORDINATES_OF_AMIDDLE_POINT_ON_THE_TRIP;
			case RADIUS_VALUE_FOR_CHARGING_STATIONS_FILTERING_VALUE: return RADIUS_VALUE_FOR_CHARGING_STATIONS_FILTERING;
			case GPS_COORDINATES_VALUE: return GPS_COORDINATES;
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
	private App_to_from_CS_operator_system_Cat(int value, String name, String literal) {
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
	
} //App_to_from_CS_operator_system_Cat
