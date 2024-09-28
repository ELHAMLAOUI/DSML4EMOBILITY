/**
 */
package emobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clearing House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Clearing_House#getEmsp <em>Emsp</em>}</li>
 *   <li>{@link emobility.Clearing_House#getCso <em>Cso</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getClearing_House()
 * @model
 * @generated
 */
public interface Clearing_House extends EV_User_Element {
	/**
	 * Returns the value of the '<em><b>Emsp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emobility.eMSP#getClearing_house <em>Clearing house</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emsp</em>' reference.
	 * @see #setEmsp(eMSP)
	 * @see emobility.EmobilityPackage#getClearing_House_Emsp()
	 * @see emobility.eMSP#getClearing_house
	 * @model opposite="clearing_house"
	 * @generated
	 */
	eMSP getEmsp();

	/**
	 * Sets the value of the '{@link emobility.Clearing_House#getEmsp <em>Emsp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emsp</em>' reference.
	 * @see #getEmsp()
	 * @generated
	 */
	void setEmsp(eMSP value);

	/**
	 * Returns the value of the '<em><b>Cso</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emobility.CSO#getClearing_house <em>Clearing house</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cso</em>' reference.
	 * @see #setCso(CSO)
	 * @see emobility.EmobilityPackage#getClearing_House_Cso()
	 * @see emobility.CSO#getClearing_house
	 * @model opposite="clearing_house"
	 * @generated
	 */
	CSO getCso();

	/**
	 * Sets the value of the '{@link emobility.Clearing_House#getCso <em>Cso</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cso</em>' reference.
	 * @see #getCso()
	 * @generated
	 */
	void setCso(CSO value);

} // Clearing_House
