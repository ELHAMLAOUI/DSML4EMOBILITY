/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>App to from from Route Planning Cat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getApp_to_from_from_Route_Planning_Cat()
 * @model
 * @generated
 */
public enum App_to_from_from_Route_Planning_Cat implements Enumerator {
	/**
	 * The '<em><b>GPS coordinates source ndestination</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPS_COORDINATES_SOURCE_NDESTINATION_VALUE
	 * @generated
	 * @ordered
	 */
	GPS_COORDINATES_SOURCE_NDESTINATION(0, "GPS_coordinates_source_n_destination", "GPS_coordinates_source_n_destination"),

	/**
	 * The '<em><b>List of GPS coordinates needed for navigation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_OF_GPS_COORDINATES_NEEDED_FOR_NAVIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	LIST_OF_GPS_COORDINATES_NEEDED_FOR_NAVIGATION(1, "List_of_GPS_coordinates_needed_for_navigation", "List_of_GPS_coordinates_needed_for_navigation"),

	/**
	 * The '<em><b>Traffic Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAFFIC_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	TRAFFIC_INFORMATION(2, "Traffic_Information", "Traffic_Information");

	/**
	 * The '<em><b>GPS coordinates source ndestination</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPS_COORDINATES_SOURCE_NDESTINATION
	 * @model name="GPS_coordinates_source_n_destination"
	 * @generated
	 * @ordered
	 */
	public static final int GPS_COORDINATES_SOURCE_NDESTINATION_VALUE = 0;

	/**
	 * The '<em><b>List of GPS coordinates needed for navigation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_OF_GPS_COORDINATES_NEEDED_FOR_NAVIGATION
	 * @model name="List_of_GPS_coordinates_needed_for_navigation"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_OF_GPS_COORDINATES_NEEDED_FOR_NAVIGATION_VALUE = 1;

	/**
	 * The '<em><b>Traffic Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAFFIC_INFORMATION
	 * @model name="Traffic_Information"
	 * @generated
	 * @ordered
	 */
	public static final int TRAFFIC_INFORMATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>App to from from Route Planning Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final App_to_from_from_Route_Planning_Cat[] VALUES_ARRAY =
		new App_to_from_from_Route_Planning_Cat[] {
			GPS_COORDINATES_SOURCE_NDESTINATION,
			LIST_OF_GPS_COORDINATES_NEEDED_FOR_NAVIGATION,
			TRAFFIC_INFORMATION,
		};

	/**
	 * A public read-only list of all the '<em><b>App to from from Route Planning Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<App_to_from_from_Route_Planning_Cat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>App to from from Route Planning Cat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_from_from_Route_Planning_Cat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			App_to_from_from_Route_Planning_Cat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>App to from from Route Planning Cat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_from_from_Route_Planning_Cat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			App_to_from_from_Route_Planning_Cat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>App to from from Route Planning Cat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_from_from_Route_Planning_Cat get(int value) {
		switch (value) {
			case GPS_COORDINATES_SOURCE_NDESTINATION_VALUE: return GPS_COORDINATES_SOURCE_NDESTINATION;
			case LIST_OF_GPS_COORDINATES_NEEDED_FOR_NAVIGATION_VALUE: return LIST_OF_GPS_COORDINATES_NEEDED_FOR_NAVIGATION;
			case TRAFFIC_INFORMATION_VALUE: return TRAFFIC_INFORMATION;
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
	private App_to_from_from_Route_Planning_Cat(int value, String name, String literal) {
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
	
} //App_to_from_from_Route_Planning_Cat
