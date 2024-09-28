/**
 */
package emobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery health to from Sensors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Battery_health_to_from_Sensors#getData_type <em>Data type</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getBattery_health_to_from_Sensors()
 * @model
 * @generated
 */
public interface Battery_health_to_from_Sensors extends EMobility_Data {
	/**
	 * Returns the value of the '<em><b>Data type</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.Battery_health_to_from_Sensors_Cat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data type</em>' attribute.
	 * @see emobility.Battery_health_to_from_Sensors_Cat
	 * @see #setData_type(Battery_health_to_from_Sensors_Cat)
	 * @see emobility.EmobilityPackage#getBattery_health_to_from_Sensors_Data_type()
	 * @model
	 * @generated
	 */
	Battery_health_to_from_Sensors_Cat getData_type();

	/**
	 * Sets the value of the '{@link emobility.Battery_health_to_from_Sensors#getData_type <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data type</em>' attribute.
	 * @see emobility.Battery_health_to_from_Sensors_Cat
	 * @see #getData_type()
	 * @generated
	 */
	void setData_type(Battery_health_to_from_Sensors_Cat value);

} // Battery_health_to_from_Sensors
