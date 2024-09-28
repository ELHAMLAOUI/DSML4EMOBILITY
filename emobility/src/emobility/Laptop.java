/**
 */
package emobility;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Laptop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Laptop#getBrowser <em>Browser</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getLaptop()
 * @model
 * @generated
 */
public interface Laptop extends EV_User_Element {
	/**
	 * Returns the value of the '<em><b>Browser</b></em>' containment reference list.
	 * The list contents are of type {@link emobility.Browser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browser</em>' containment reference list.
	 * @see emobility.EmobilityPackage#getLaptop_Browser()
	 * @model containment="true"
	 * @generated
	 */
	EList<Browser> getBrowser();

} // Laptop
