/**
 */
package emobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EV User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.EV_User#getLaptop <em>Laptop</em>}</li>
 *   <li>{@link emobility.EV_User#getMobile <em>Mobile</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getEV_User()
 * @model
 * @generated
 */
public interface EV_User extends EV_User_Element {
	/**
	 * Returns the value of the '<em><b>Laptop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laptop</em>' reference.
	 * @see #setLaptop(Laptop)
	 * @see emobility.EmobilityPackage#getEV_User_Laptop()
	 * @model
	 * @generated
	 */
	Laptop getLaptop();

	/**
	 * Sets the value of the '{@link emobility.EV_User#getLaptop <em>Laptop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laptop</em>' reference.
	 * @see #getLaptop()
	 * @generated
	 */
	void setLaptop(Laptop value);

	/**
	 * Returns the value of the '<em><b>Mobile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile</em>' reference.
	 * @see #setMobile(Mobile)
	 * @see emobility.EmobilityPackage#getEV_User_Mobile()
	 * @model
	 * @generated
	 */
	Mobile getMobile();

	/**
	 * Sets the value of the '{@link emobility.EV_User#getMobile <em>Mobile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile</em>' reference.
	 * @see #getMobile()
	 * @generated
	 */
	void setMobile(Mobile value);

} // EV_User
