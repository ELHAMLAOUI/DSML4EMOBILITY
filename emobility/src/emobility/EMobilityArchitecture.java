/**
 */
package emobility;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMobility Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.EMobilityArchitecture#getEmobilityelement <em>Emobilityelement</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getEMobilityArchitecture()
 * @model
 * @generated
 */
public interface EMobilityArchitecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Emobilityelement</b></em>' containment reference list.
	 * The list contents are of type {@link emobility.EMobilityElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emobilityelement</em>' containment reference list.
	 * @see emobility.EmobilityPackage#getEMobilityArchitecture_Emobilityelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<EMobilityElement> getEmobilityelement();

} // EMobilityArchitecture
