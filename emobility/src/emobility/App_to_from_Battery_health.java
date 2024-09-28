/**
 */
package emobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App to from Battery health</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.App_to_from_Battery_health#getData_type <em>Data type</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getApp_to_from_Battery_health()
 * @model
 * @generated
 */
public interface App_to_from_Battery_health extends EMobility_Data {
	/**
	 * Returns the value of the '<em><b>Data type</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.App_to_Battery_health_Cat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data type</em>' attribute.
	 * @see emobility.App_to_Battery_health_Cat
	 * @see #setData_type(App_to_Battery_health_Cat)
	 * @see emobility.EmobilityPackage#getApp_to_from_Battery_health_Data_type()
	 * @model
	 * @generated
	 */
	App_to_Battery_health_Cat getData_type();

	/**
	 * Sets the value of the '{@link emobility.App_to_from_Battery_health#getData_type <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data type</em>' attribute.
	 * @see emobility.App_to_Battery_health_Cat
	 * @see #getData_type()
	 * @generated
	 */
	void setData_type(App_to_Battery_health_Cat value);

} // App_to_from_Battery_health
