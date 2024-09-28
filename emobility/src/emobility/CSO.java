/**
 */
package emobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.CSO#getEmsp <em>Emsp</em>}</li>
 *   <li>{@link emobility.CSO#getClearing_house <em>Clearing house</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getCSO()
 * @model
 * @generated
 */
public interface CSO extends Energy_Transfer_Element {
	/**
	 * Returns the value of the '<em><b>Emsp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emobility.eMSP#getCso <em>Cso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emsp</em>' reference.
	 * @see #setEmsp(eMSP)
	 * @see emobility.EmobilityPackage#getCSO_Emsp()
	 * @see emobility.eMSP#getCso
	 * @model opposite="cso"
	 * @generated
	 */
	eMSP getEmsp();

	/**
	 * Sets the value of the '{@link emobility.CSO#getEmsp <em>Emsp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emsp</em>' reference.
	 * @see #getEmsp()
	 * @generated
	 */
	void setEmsp(eMSP value);

	/**
	 * Returns the value of the '<em><b>Clearing house</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emobility.Clearing_House#getCso <em>Cso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearing house</em>' reference.
	 * @see #setClearing_house(Clearing_House)
	 * @see emobility.EmobilityPackage#getCSO_Clearing_house()
	 * @see emobility.Clearing_House#getCso
	 * @model opposite="cso"
	 * @generated
	 */
	Clearing_House getClearing_house();

	/**
	 * Sets the value of the '{@link emobility.CSO#getClearing_house <em>Clearing house</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clearing house</em>' reference.
	 * @see #getClearing_house()
	 * @generated
	 */
	void setClearing_house(Clearing_House value);

} // CSO
