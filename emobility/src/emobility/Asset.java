/**
 */
package emobility;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Asset#getAvailability <em>Availability</em>}</li>
 *   <li>{@link emobility.Asset#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link emobility.Asset#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link emobility.Asset#getSecuritycontrol <em>Securitycontrol</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.CIA_Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see emobility.CIA_Level
	 * @see #setAvailability(CIA_Level)
	 * @see emobility.EmobilityPackage#getAsset_Availability()
	 * @model
	 * @generated
	 */
	CIA_Level getAvailability();

	/**
	 * Sets the value of the '{@link emobility.Asset#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see emobility.CIA_Level
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(CIA_Level value);

	/**
	 * Returns the value of the '<em><b>Integrity</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.CIA_Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrity</em>' attribute.
	 * @see emobility.CIA_Level
	 * @see #setIntegrity(CIA_Level)
	 * @see emobility.EmobilityPackage#getAsset_Integrity()
	 * @model
	 * @generated
	 */
	CIA_Level getIntegrity();

	/**
	 * Sets the value of the '{@link emobility.Asset#getIntegrity <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity</em>' attribute.
	 * @see emobility.CIA_Level
	 * @see #getIntegrity()
	 * @generated
	 */
	void setIntegrity(CIA_Level value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.CIA_Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see emobility.CIA_Level
	 * @see #setConfidentiality(CIA_Level)
	 * @see emobility.EmobilityPackage#getAsset_Confidentiality()
	 * @model
	 * @generated
	 */
	CIA_Level getConfidentiality();

	/**
	 * Sets the value of the '{@link emobility.Asset#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see emobility.CIA_Level
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(CIA_Level value);

	/**
	 * Returns the value of the '<em><b>Securitycontrol</b></em>' reference list.
	 * The list contents are of type {@link emobility.SecurityControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitycontrol</em>' reference list.
	 * @see emobility.EmobilityPackage#getAsset_Securitycontrol()
	 * @model
	 * @generated
	 */
	EList<SecurityControl> getSecuritycontrol();

} // Asset
