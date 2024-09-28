/**
 */
package emobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>eMSP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.eMSP#getCso <em>Cso</em>}</li>
 *   <li>{@link emobility.eMSP#getService_api <em>Service api</em>}</li>
 *   <li>{@link emobility.eMSP#getWeb_application <em>Web application</em>}</li>
 *   <li>{@link emobility.eMSP#getClearing_house <em>Clearing house</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#geteMSP()
 * @model
 * @generated
 */
public interface eMSP extends EV_User_Element {
	/**
	 * Returns the value of the '<em><b>Cso</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emobility.CSO#getEmsp <em>Emsp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cso</em>' reference.
	 * @see #setCso(CSO)
	 * @see emobility.EmobilityPackage#geteMSP_Cso()
	 * @see emobility.CSO#getEmsp
	 * @model opposite="emsp"
	 * @generated
	 */
	CSO getCso();

	/**
	 * Sets the value of the '{@link emobility.eMSP#getCso <em>Cso</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cso</em>' reference.
	 * @see #getCso()
	 * @generated
	 */
	void setCso(CSO value);

	/**
	 * Returns the value of the '<em><b>Service api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service api</em>' reference.
	 * @see #setService_api(Service_API)
	 * @see emobility.EmobilityPackage#geteMSP_Service_api()
	 * @model
	 * @generated
	 */
	Service_API getService_api();

	/**
	 * Sets the value of the '{@link emobility.eMSP#getService_api <em>Service api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service api</em>' reference.
	 * @see #getService_api()
	 * @generated
	 */
	void setService_api(Service_API value);

	/**
	 * Returns the value of the '<em><b>Web application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web application</em>' reference.
	 * @see #setWeb_application(Web_Application)
	 * @see emobility.EmobilityPackage#geteMSP_Web_application()
	 * @model
	 * @generated
	 */
	Web_Application getWeb_application();

	/**
	 * Sets the value of the '{@link emobility.eMSP#getWeb_application <em>Web application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web application</em>' reference.
	 * @see #getWeb_application()
	 * @generated
	 */
	void setWeb_application(Web_Application value);

	/**
	 * Returns the value of the '<em><b>Clearing house</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emobility.Clearing_House#getEmsp <em>Emsp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearing house</em>' reference.
	 * @see #setClearing_house(Clearing_House)
	 * @see emobility.EmobilityPackage#geteMSP_Clearing_house()
	 * @see emobility.Clearing_House#getEmsp
	 * @model opposite="emsp"
	 * @generated
	 */
	Clearing_House getClearing_house();

	/**
	 * Sets the value of the '{@link emobility.eMSP#getClearing_house <em>Clearing house</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clearing house</em>' reference.
	 * @see #getClearing_house()
	 * @generated
	 */
	void setClearing_house(Clearing_House value);

} // eMSP
