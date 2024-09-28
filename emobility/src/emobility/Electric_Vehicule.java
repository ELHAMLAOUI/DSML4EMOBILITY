/**
 */
package emobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electric Vehicule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Electric_Vehicule#getVendor <em>Vendor</em>}</li>
 *   <li>{@link emobility.Electric_Vehicule#getEvse <em>Evse</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getElectric_Vehicule()
 * @model
 * @generated
 */
public interface Electric_Vehicule extends EMobilityElement {
	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.Vendor_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see emobility.Vendor_Type
	 * @see #setVendor(Vendor_Type)
	 * @see emobility.EmobilityPackage#getElectric_Vehicule_Vendor()
	 * @model
	 * @generated
	 */
	Vendor_Type getVendor();

	/**
	 * Sets the value of the '{@link emobility.Electric_Vehicule#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see emobility.Vendor_Type
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Vendor_Type value);

	/**
	 * Returns the value of the '<em><b>Evse</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emobility.EVSE#getElectric_vehicule <em>Electric vehicule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evse</em>' reference.
	 * @see #setEvse(EVSE)
	 * @see emobility.EmobilityPackage#getElectric_Vehicule_Evse()
	 * @see emobility.EVSE#getElectric_vehicule
	 * @model opposite="electric_vehicule"
	 * @generated
	 */
	EVSE getEvse();

	/**
	 * Sets the value of the '{@link emobility.Electric_Vehicule#getEvse <em>Evse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evse</em>' reference.
	 * @see #getEvse()
	 * @generated
	 */
	void setEvse(EVSE value);

} // Electric_Vehicule
