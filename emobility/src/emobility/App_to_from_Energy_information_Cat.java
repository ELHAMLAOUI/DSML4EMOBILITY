/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>App to from Energy information Cat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getApp_to_from_Energy_information_Cat()
 * @model
 * @generated
 */
public enum App_to_from_Energy_information_Cat implements Enumerator {
	/**
	 * The '<em><b>Country code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTRY_CODE(0, "Country_code", "Country_code"),

	/**
	 * The '<em><b>Start nend times</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_NEND_TIMES_VALUE
	 * @generated
	 * @ordered
	 */
	START_NEND_TIMES(1, "Start_n_end_times", "Start_n_end_times"),

	/**
	 * The '<em><b>Percent of renewables</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT_OF_RENEWABLES_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENT_OF_RENEWABLES(2, "Percent_of_renewables", "Percent_of_renewables"),

	/**
	 * The '<em><b>Energy market price</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_MARKET_PRICE_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_MARKET_PRICE(3, "Energy_market_price", "Energy_market_price");

	/**
	 * The '<em><b>Country code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY_CODE
	 * @model name="Country_code"
	 * @generated
	 * @ordered
	 */
	public static final int COUNTRY_CODE_VALUE = 0;

	/**
	 * The '<em><b>Start nend times</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_NEND_TIMES
	 * @model name="Start_n_end_times"
	 * @generated
	 * @ordered
	 */
	public static final int START_NEND_TIMES_VALUE = 1;

	/**
	 * The '<em><b>Percent of renewables</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT_OF_RENEWABLES
	 * @model name="Percent_of_renewables"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENT_OF_RENEWABLES_VALUE = 2;

	/**
	 * The '<em><b>Energy market price</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_MARKET_PRICE
	 * @model name="Energy_market_price"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_MARKET_PRICE_VALUE = 3;

	/**
	 * An array of all the '<em><b>App to from Energy information Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final App_to_from_Energy_information_Cat[] VALUES_ARRAY =
		new App_to_from_Energy_information_Cat[] {
			COUNTRY_CODE,
			START_NEND_TIMES,
			PERCENT_OF_RENEWABLES,
			ENERGY_MARKET_PRICE,
		};

	/**
	 * A public read-only list of all the '<em><b>App to from Energy information Cat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<App_to_from_Energy_information_Cat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>App to from Energy information Cat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_from_Energy_information_Cat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			App_to_from_Energy_information_Cat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>App to from Energy information Cat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_from_Energy_information_Cat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			App_to_from_Energy_information_Cat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>App to from Energy information Cat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static App_to_from_Energy_information_Cat get(int value) {
		switch (value) {
			case COUNTRY_CODE_VALUE: return COUNTRY_CODE;
			case START_NEND_TIMES_VALUE: return START_NEND_TIMES;
			case PERCENT_OF_RENEWABLES_VALUE: return PERCENT_OF_RENEWABLES;
			case ENERGY_MARKET_PRICE_VALUE: return ENERGY_MARKET_PRICE;
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
	private App_to_from_Energy_information_Cat(int value, String name, String literal) {
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
	
} //App_to_from_Energy_information_Cat
