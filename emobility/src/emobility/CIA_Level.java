/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CIA Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getCIA_Level()
 * @model
 * @generated
 */
public enum CIA_Level implements Enumerator {
	/**
	 * The '<em><b>L1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L1_VALUE
	 * @generated
	 * @ordered
	 */
	L1(1, "L1", "L1"),

	/**
	 * The '<em><b>L2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L2_VALUE
	 * @generated
	 * @ordered
	 */
	L2(2, "L2", "L2"),

	/**
	 * The '<em><b>L3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L3_VALUE
	 * @generated
	 * @ordered
	 */
	L3(3, "L3", "L3"),

	/**
	 * The '<em><b>L4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L4_VALUE
	 * @generated
	 * @ordered
	 */
	L4(4, "L4", "L4");

	/**
	 * The '<em><b>L1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int L1_VALUE = 1;

	/**
	 * The '<em><b>L2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int L2_VALUE = 2;

	/**
	 * The '<em><b>L3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int L3_VALUE = 3;

	/**
	 * The '<em><b>L4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int L4_VALUE = 4;

	/**
	 * An array of all the '<em><b>CIA Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CIA_Level[] VALUES_ARRAY =
		new CIA_Level[] {
			L1,
			L2,
			L3,
			L4,
		};

	/**
	 * A public read-only list of all the '<em><b>CIA Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CIA_Level> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CIA Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CIA_Level get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CIA_Level result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CIA Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CIA_Level getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CIA_Level result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CIA Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CIA_Level get(int value) {
		switch (value) {
			case L1_VALUE: return L1;
			case L2_VALUE: return L2;
			case L3_VALUE: return L3;
			case L4_VALUE: return L4;
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
	private CIA_Level(int value, String name, String literal) {
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
	
} //CIA_Level
