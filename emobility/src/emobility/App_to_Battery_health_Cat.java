/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>App to Battery health Cat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getApp_to_Battery_health_Cat()
 * @model
 * @generated
 */
public enum App_to_Battery_health_Cat implements Enumerator {
	/**
	 * The '<em><b>Parking So Cnambient temp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARKING_SO_CNAMBIENT_TEMP_VALUE
	 * @generated
	 * @ordered
	 */
	PARKING_SO_CNAMBIENT_TEMP(0, "Parking_SoC_n_ambient_temp", "Parking_SoC_n_ambient_temp"),

	/**
	 * The '<em><b>Driving So Cdischarge rate nambient temp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRIVING_SO_CDISCHARGE_RATE_NAMBIENT_TEMP_VALUE
	 * @generated
	 * @ordered
	 */
	DRIVING_SO_CDISCHARGE_RATE_NAMBIENT_TEMP(1, "Driving_SoC_discharge_rate_n_ambient_temp", "Driving_SoC_discharge_rate_n_ambient_temp"),

	/**
	 * The '<em><b>Textual description</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTUAL_DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTUAL_DESCRIPTION(2, "Textual_description", "Textual_description"),

	/**
	 * The '<em><b>Rationale</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIONALE_VALUE
	 * @generated
	 * @ordered
	 */
	RATIONALE(3, "Rationale", "Rationale"),

	/**
	 * The '<em><b>Weighing factor for priorities</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHING_FACTOR_FOR_PRIORITIES_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHING_FACTOR_FOR_PRIORITIES(4, "Weighing_factor_for_priorities", "Weighing_factor_for_priorities");

	/**
	 * The '<em><b>Parking So Cnambient temp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARKING_SO_CNAMBIENT_TEMP
	 * @model name="Parking_SoC_n_ambient_temp"
	 * @generated
	 * @ordered
	 */
	public static final int PARKING_SO_CNAMBIENT_TEMP_VALUE = 0;

	/**
	 * The '<em><b>Driving So Cdischarge rate nambient temp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRIVING_SO_CDISCHARGE_RATE_NAMBIENT_TEMP
	 * @model name="Driving_SoC_discharge_rate_n_ambient_temp"
	 * @generated
	 * @ordered
	 */
	public static final int DRIVING_SO_CDISCHARGE_RATE_NAMBIENT_TEMP_VALUE = 1;

	/**
	 * The '<em><b>Textual description</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTUAL_DESCRIPTION
	 * @model name="Textual_description"
	 * @generated
	 * @ordered
	 */
	public static final int TEXTUAL_DESCRIPTION_VALUE = 2;

	/**
	 * The '<em><b>Rationale</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIONALE
	 * @model name="Rationale"
	 * @generated
	 * @ordered
	 */
	public static final int RATIONALE_VALUE = 3;

	/**
	 * The '<em><b>Weighing factor for priorities</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHING_FACTOR_FOR_PRIORITIES
	 * @model name="Weighing_factor_for_priorities"
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHING_FACTOR_FOR_PRIORITIES_VALUE = 4;

	/**
	 * An array of all the '<em><b>App to Battery health Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final App_to_Battery_health_Cat[] VALUES_ARRAY =
		new App_to_Battery_health_Cat[] {
			PARKING_SO_CNAMBIENT_TEMP,
			DRIVING_SO_CDISCHARGE_RATE_NAMBIENT_TEMP,
			TEXTUAL_DESCRIPTION,
			RATIONALE,
			WEIGHING_FACTOR_FOR_PRIORITIES,
		};

	/**
	 * A public read-only list of all the '<em><b>App to Battery health Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<App_to_Battery_health_Cat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>App to Battery health Cat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_Battery_health_Cat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			App_to_Battery_health_Cat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>App to Battery health Cat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_Battery_health_Cat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			App_to_Battery_health_Cat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>App to Battery health Cat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_Battery_health_Cat get(int value) {
		switch (value) {
			case PARKING_SO_CNAMBIENT_TEMP_VALUE: return PARKING_SO_CNAMBIENT_TEMP;
			case DRIVING_SO_CDISCHARGE_RATE_NAMBIENT_TEMP_VALUE: return DRIVING_SO_CDISCHARGE_RATE_NAMBIENT_TEMP;
			case TEXTUAL_DESCRIPTION_VALUE: return TEXTUAL_DESCRIPTION;
			case RATIONALE_VALUE: return RATIONALE;
			case WEIGHING_FACTOR_FOR_PRIORITIES_VALUE: return WEIGHING_FACTOR_FOR_PRIORITIES;
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
	private App_to_Battery_health_Cat(int value, String name, String literal) {
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
	
} //App_to_Battery_health_Cat
