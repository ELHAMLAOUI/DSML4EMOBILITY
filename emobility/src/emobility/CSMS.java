/**
 */
package emobility;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.CSMS#getCs_controller <em>Cs controller</em>}</li>
 *   <li>{@link emobility.CSMS#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getCSMS()
 * @model
 * @generated
 */
public interface CSMS extends Energy_Transfer_Element {
	/**
	 * Returns the value of the '<em><b>Cs controller</b></em>' reference list.
	 * The list contents are of type {@link emobility.CS_Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs controller</em>' reference list.
	 * @see emobility.EmobilityPackage#getCSMS_Cs_controller()
	 * @model
	 * @generated
	 */
	EList<CS_Controller> getCs_controller();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(Server)
	 * @see emobility.EmobilityPackage#getCSMS_Server()
	 * @model
	 * @generated
	 */
	Server getServer();

	/**
	 * Sets the value of the '{@link emobility.CSMS#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Server value);

} // CSMS
