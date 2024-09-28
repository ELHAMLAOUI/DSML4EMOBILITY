/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Vendor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getVendor_Type()
 * @model
 * @generated
 */
public enum Vendor_Type implements Enumerator {
	/**
	 * The '<em><b>Tesla</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TESLA_VALUE
	 * @generated
	 * @ordered
	 */
	TESLA(0, "Tesla", "Tesla"),

	/**
	 * The '<em><b>BMW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BMW_VALUE
	 * @generated
	 * @ordered
	 */
	BMW(1, "BMW", "BMW"),

	/**
	 * The '<em><b>Renault Nissan Mitsubishi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENAULT_NISSAN_MITSUBISHI_VALUE
	 * @generated
	 * @ordered
	 */
	RENAULT_NISSAN_MITSUBISHI(2, "RenaultNissanMitsubishi", "RenaultNissanMitsubishi"),

	/**
	 * The '<em><b>Mercerdes Benz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERCERDES_BENZ_VALUE
	 * @generated
	 * @ordered
	 */
	MERCERDES_BENZ(3, "MercerdesBenz", "MercerdesBenz"),

	/**
	 * The '<em><b>Geely Auto Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEELY_AUTO_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	GEELY_AUTO_GROUP(4, "GeelyAutoGroup", "GeelyAutoGroup"),

	/**
	 * The '<em><b>Hyundai</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYUNDAI_VALUE
	 * @generated
	 * @ordered
	 */
	HYUNDAI(5, "Hyundai", "Hyundai"),

	/**
	 * The '<em><b>Stellantis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STELLANTIS_VALUE
	 * @generated
	 * @ordered
	 */
	STELLANTIS(6, "Stellantis", "Stellantis"),

	/**
	 * The '<em><b>Volkswagen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLKSWAGEN_VALUE
	 * @generated
	 * @ordered
	 */
	VOLKSWAGEN(7, "Volkswagen", "Volkswagen"),

	/**
	 * The '<em><b>BYD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYD_VALUE
	 * @generated
	 * @ordered
	 */
	BYD(8, "BYD", "BYD");

	/**
	 * The '<em><b>Tesla</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TESLA
	 * @model name="Tesla"
	 * @generated
	 * @ordered
	 */
	public static final int TESLA_VALUE = 0;

	/**
	 * The '<em><b>BMW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BMW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BMW_VALUE = 1;

	/**
	 * The '<em><b>Renault Nissan Mitsubishi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENAULT_NISSAN_MITSUBISHI
	 * @model name="RenaultNissanMitsubishi"
	 * @generated
	 * @ordered
	 */
	public static final int RENAULT_NISSAN_MITSUBISHI_VALUE = 2;

	/**
	 * The '<em><b>Mercerdes Benz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERCERDES_BENZ
	 * @model name="MercerdesBenz"
	 * @generated
	 * @ordered
	 */
	public static final int MERCERDES_BENZ_VALUE = 3;

	/**
	 * The '<em><b>Geely Auto Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEELY_AUTO_GROUP
	 * @model name="GeelyAutoGroup"
	 * @generated
	 * @ordered
	 */
	public static final int GEELY_AUTO_GROUP_VALUE = 4;

	/**
	 * The '<em><b>Hyundai</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYUNDAI
	 * @model name="Hyundai"
	 * @generated
	 * @ordered
	 */
	public static final int HYUNDAI_VALUE = 5;

	/**
	 * The '<em><b>Stellantis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STELLANTIS
	 * @model name="Stellantis"
	 * @generated
	 * @ordered
	 */
	public static final int STELLANTIS_VALUE = 6;

	/**
	 * The '<em><b>Volkswagen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLKSWAGEN
	 * @model name="Volkswagen"
	 * @generated
	 * @ordered
	 */
	public static final int VOLKSWAGEN_VALUE = 7;

	/**
	 * The '<em><b>BYD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYD_VALUE = 8;

	/**
	 * An array of all the '<em><b>Vendor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Vendor_Type[] VALUES_ARRAY =
		new Vendor_Type[] {
			TESLA,
			BMW,
			RENAULT_NISSAN_MITSUBISHI,
			MERCERDES_BENZ,
			GEELY_AUTO_GROUP,
			HYUNDAI,
			STELLANTIS,
			VOLKSWAGEN,
			BYD,
		};

	/**
	 * A public read-only list of all the '<em><b>Vendor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Vendor_Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vendor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Vendor_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Vendor_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vendor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Vendor_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Vendor_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vendor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Vendor_Type get(int value) {
		switch (value) {
			case TESLA_VALUE: return TESLA;
			case BMW_VALUE: return BMW;
			case RENAULT_NISSAN_MITSUBISHI_VALUE: return RENAULT_NISSAN_MITSUBISHI;
			case MERCERDES_BENZ_VALUE: return MERCERDES_BENZ;
			case GEELY_AUTO_GROUP_VALUE: return GEELY_AUTO_GROUP;
			case HYUNDAI_VALUE: return HYUNDAI;
			case STELLANTIS_VALUE: return STELLANTIS;
			case VOLKSWAGEN_VALUE: return VOLKSWAGEN;
			case BYD_VALUE: return BYD;
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
	private Vendor_Type(int value, String name, String literal) {
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
	
} //Vendor_Type
