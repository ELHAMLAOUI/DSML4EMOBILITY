/**
 */
package emobility;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Communication#getInfo_protocol <em>Info protocol</em>}</li>
 *   <li>{@link emobility.Communication#getSource <em>Source</em>}</li>
 *   <li>{@link emobility.Communication#getDestination <em>Destination</em>}</li>
 *   <li>{@link emobility.Communication#getComm_protocol <em>Comm protocol</em>}</li>
 *   <li>{@link emobility.Communication#getEmobility_data <em>Emobility data</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends EMobilityElement {
	/**
	 * Returns the value of the '<em><b>Info protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.Information_Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info protocol</em>' attribute.
	 * @see emobility.Information_Protocol
	 * @see #setInfo_protocol(Information_Protocol)
	 * @see emobility.EmobilityPackage#getCommunication_Info_protocol()
	 * @model
	 * @generated
	 */
	Information_Protocol getInfo_protocol();

	/**
	 * Sets the value of the '{@link emobility.Communication#getInfo_protocol <em>Info protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info protocol</em>' attribute.
	 * @see emobility.Information_Protocol
	 * @see #getInfo_protocol()
	 * @generated
	 */
	void setInfo_protocol(Information_Protocol value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EMobilityElement)
	 * @see emobility.EmobilityPackage#getCommunication_Source()
	 * @model
	 * @generated
	 */
	EMobilityElement getSource();

	/**
	 * Sets the value of the '{@link emobility.Communication#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EMobilityElement value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(EMobilityElement)
	 * @see emobility.EmobilityPackage#getCommunication_Destination()
	 * @model
	 * @generated
	 */
	EMobilityElement getDestination();

	/**
	 * Sets the value of the '{@link emobility.Communication#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(EMobilityElement value);

	/**
	 * Returns the value of the '<em><b>Comm protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.Communication_Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm protocol</em>' attribute.
	 * @see emobility.Communication_Protocol
	 * @see #setComm_protocol(Communication_Protocol)
	 * @see emobility.EmobilityPackage#getCommunication_Comm_protocol()
	 * @model
	 * @generated
	 */
	Communication_Protocol getComm_protocol();

	/**
	 * Sets the value of the '{@link emobility.Communication#getComm_protocol <em>Comm protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm protocol</em>' attribute.
	 * @see emobility.Communication_Protocol
	 * @see #getComm_protocol()
	 * @generated
	 */
	void setComm_protocol(Communication_Protocol value);

	/**
	 * Returns the value of the '<em><b>Emobility data</b></em>' reference list.
	 * The list contents are of type {@link emobility.EMobility_Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emobility data</em>' reference list.
	 * @see emobility.EmobilityPackage#getCommunication_Emobility_data()
	 * @model
	 * @generated
	 */
	EList<EMobility_Data> getEmobility_data();

} // Communication
