/**
 */
package emobility;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Domain#getEmobilityelement <em>Emobilityelement</em>}</li>
 *   <li>{@link emobility.Domain#getCommunication <em>Communication</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EMobilityElement {
	/**
	 * Returns the value of the '<em><b>Emobilityelement</b></em>' containment reference list.
	 * The list contents are of type {@link emobility.EMobilityElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emobilityelement</em>' containment reference list.
	 * @see emobility.EmobilityPackage#getDomain_Emobilityelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<EMobilityElement> getEmobilityelement();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link emobility.Communication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see emobility.EmobilityPackage#getDomain_Communication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Communication> getCommunication();

} // Domain
