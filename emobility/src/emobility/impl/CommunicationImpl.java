/**
 */
package emobility.impl;

import emobility.Communication;
import emobility.Communication_Protocol;
import emobility.EMobilityElement;
import emobility.EMobility_Data;
import emobility.EmobilityPackage;
import emobility.Information_Protocol;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.CommunicationImpl#getInfo_protocol <em>Info protocol</em>}</li>
 *   <li>{@link emobility.impl.CommunicationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link emobility.impl.CommunicationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link emobility.impl.CommunicationImpl#getComm_protocol <em>Comm protocol</em>}</li>
 *   <li>{@link emobility.impl.CommunicationImpl#getEmobility_data <em>Emobility data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends EMobilityElementImpl implements Communication {
	/**
	 * The default value of the '{@link #getInfo_protocol() <em>Info protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo_protocol()
	 * @generated
	 * @ordered
	 */
	protected static final Information_Protocol INFO_PROTOCOL_EDEFAULT = Information_Protocol.ISO_IEC_15118;

	/**
	 * The cached value of the '{@link #getInfo_protocol() <em>Info protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo_protocol()
	 * @generated
	 * @ordered
	 */
	protected Information_Protocol info_protocol = INFO_PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EMobilityElement source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected EMobilityElement destination;

	/**
	 * The default value of the '{@link #getComm_protocol() <em>Comm protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComm_protocol()
	 * @generated
	 * @ordered
	 */
	protected static final Communication_Protocol COMM_PROTOCOL_EDEFAULT = Communication_Protocol.HTTP;

	/**
	 * The cached value of the '{@link #getComm_protocol() <em>Comm protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComm_protocol()
	 * @generated
	 * @ordered
	 */
	protected Communication_Protocol comm_protocol = COMM_PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmobility_data() <em>Emobility data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmobility_data()
	 * @generated
	 * @ordered
	 */
	protected EList<EMobility_Data> emobility_data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information_Protocol getInfo_protocol() {
		return info_protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo_protocol(Information_Protocol newInfo_protocol) {
		Information_Protocol oldInfo_protocol = info_protocol;
		info_protocol = newInfo_protocol == null ? INFO_PROTOCOL_EDEFAULT : newInfo_protocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.COMMUNICATION__INFO_PROTOCOL, oldInfo_protocol, info_protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMobilityElement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (EMobilityElement)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.COMMUNICATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMobilityElement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EMobilityElement newSource) {
		EMobilityElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.COMMUNICATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMobilityElement getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (EMobilityElement)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.COMMUNICATION__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMobilityElement basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(EMobilityElement newDestination) {
		EMobilityElement oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.COMMUNICATION__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication_Protocol getComm_protocol() {
		return comm_protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComm_protocol(Communication_Protocol newComm_protocol) {
		Communication_Protocol oldComm_protocol = comm_protocol;
		comm_protocol = newComm_protocol == null ? COMM_PROTOCOL_EDEFAULT : newComm_protocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.COMMUNICATION__COMM_PROTOCOL, oldComm_protocol, comm_protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMobility_Data> getEmobility_data() {
		if (emobility_data == null) {
			emobility_data = new EObjectResolvingEList<EMobility_Data>(EMobility_Data.class, this, EmobilityPackage.COMMUNICATION__EMOBILITY_DATA);
		}
		return emobility_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmobilityPackage.COMMUNICATION__INFO_PROTOCOL:
				return getInfo_protocol();
			case EmobilityPackage.COMMUNICATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case EmobilityPackage.COMMUNICATION__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case EmobilityPackage.COMMUNICATION__COMM_PROTOCOL:
				return getComm_protocol();
			case EmobilityPackage.COMMUNICATION__EMOBILITY_DATA:
				return getEmobility_data();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmobilityPackage.COMMUNICATION__INFO_PROTOCOL:
				setInfo_protocol((Information_Protocol)newValue);
				return;
			case EmobilityPackage.COMMUNICATION__SOURCE:
				setSource((EMobilityElement)newValue);
				return;
			case EmobilityPackage.COMMUNICATION__DESTINATION:
				setDestination((EMobilityElement)newValue);
				return;
			case EmobilityPackage.COMMUNICATION__COMM_PROTOCOL:
				setComm_protocol((Communication_Protocol)newValue);
				return;
			case EmobilityPackage.COMMUNICATION__EMOBILITY_DATA:
				getEmobility_data().clear();
				getEmobility_data().addAll((Collection<? extends EMobility_Data>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmobilityPackage.COMMUNICATION__INFO_PROTOCOL:
				setInfo_protocol(INFO_PROTOCOL_EDEFAULT);
				return;
			case EmobilityPackage.COMMUNICATION__SOURCE:
				setSource((EMobilityElement)null);
				return;
			case EmobilityPackage.COMMUNICATION__DESTINATION:
				setDestination((EMobilityElement)null);
				return;
			case EmobilityPackage.COMMUNICATION__COMM_PROTOCOL:
				setComm_protocol(COMM_PROTOCOL_EDEFAULT);
				return;
			case EmobilityPackage.COMMUNICATION__EMOBILITY_DATA:
				getEmobility_data().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmobilityPackage.COMMUNICATION__INFO_PROTOCOL:
				return info_protocol != INFO_PROTOCOL_EDEFAULT;
			case EmobilityPackage.COMMUNICATION__SOURCE:
				return source != null;
			case EmobilityPackage.COMMUNICATION__DESTINATION:
				return destination != null;
			case EmobilityPackage.COMMUNICATION__COMM_PROTOCOL:
				return comm_protocol != COMM_PROTOCOL_EDEFAULT;
			case EmobilityPackage.COMMUNICATION__EMOBILITY_DATA:
				return emobility_data != null && !emobility_data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (info_protocol: ");
		result.append(info_protocol);
		result.append(", comm_protocol: ");
		result.append(comm_protocol);
		result.append(')');
		return result.toString();
	}

} //CommunicationImpl
