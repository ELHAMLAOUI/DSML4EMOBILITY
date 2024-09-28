/**
 */
package emobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Administrator#getCsms <em>Csms</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getAdministrator()
 * @model
 * @generated
 */
public interface Administrator extends Energy_Transfer_Element {
	/**
	 * Returns the value of the '<em><b>Csms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csms</em>' reference.
	 * @see #setCsms(CSMS)
	 * @see emobility.EmobilityPackage#getAdministrator_Csms()
	 * @model
	 * @generated
	 */
	CSMS getCsms();

	/**
	 * Sets the value of the '{@link emobility.Administrator#getCsms <em>Csms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csms</em>' reference.
	 * @see #getCsms()
	 * @generated
	 */
	void setCsms(CSMS value);

} // Administrator
