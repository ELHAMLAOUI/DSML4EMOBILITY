/**
 */
package emobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Server#getOs_type <em>Os type</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends Energy_Transfer_Element {
	/**
	 * Returns the value of the '<em><b>Os type</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.OS_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os type</em>' attribute.
	 * @see emobility.OS_Type
	 * @see #setOs_type(OS_Type)
	 * @see emobility.EmobilityPackage#getServer_Os_type()
	 * @model
	 * @generated
	 */
	OS_Type getOs_type();

	/**
	 * Sets the value of the '{@link emobility.Server#getOs_type <em>Os type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os type</em>' attribute.
	 * @see emobility.OS_Type
	 * @see #getOs_type()
	 * @generated
	 */
	void setOs_type(OS_Type value);

} // Server
