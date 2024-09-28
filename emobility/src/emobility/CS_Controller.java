/**
 */
package emobility;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.CS_Controller#getEvse <em>Evse</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getCS_Controller()
 * @model
 * @generated
 */
public interface CS_Controller extends Energy_Transfer_Element {
	/**
	 * Returns the value of the '<em><b>Evse</b></em>' reference list.
	 * The list contents are of type {@link emobility.EVSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evse</em>' reference list.
	 * @see emobility.EmobilityPackage#getCS_Controller_Evse()
	 * @model
	 * @generated
	 */
	EList<EVSE> getEvse();

} // CS_Controller
