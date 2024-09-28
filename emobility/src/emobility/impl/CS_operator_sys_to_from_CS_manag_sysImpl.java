/**
 */
package emobility.impl;

import emobility.CS_operator_sys_to_from_CS_manag_sys;
import emobility.CS_operator_sys_to_from_CS_manag_sys_Cat;
import emobility.EmobilityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CS operator sys to from CS manag sys</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.CS_operator_sys_to_from_CS_manag_sysImpl#getData_type <em>Data type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CS_operator_sys_to_from_CS_manag_sysImpl extends EMobility_DataImpl implements CS_operator_sys_to_from_CS_manag_sys {
	/**
	 * The default value of the '{@link #getData_type() <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_type()
	 * @generated
	 * @ordered
	 */
	protected static final CS_operator_sys_to_from_CS_manag_sys_Cat DATA_TYPE_EDEFAULT = CS_operator_sys_to_from_CS_manag_sys_Cat.CONNECTOR_ID_TYPE_NSTANDARD;

	/**
	 * The cached value of the '{@link #getData_type() <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_type()
	 * @generated
	 * @ordered
	 */
	protected CS_operator_sys_to_from_CS_manag_sys_Cat data_type = DATA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CS_operator_sys_to_from_CS_manag_sysImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS_operator_sys_to_from_CS_manag_sys_Cat getData_type() {
		return data_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_type(CS_operator_sys_to_from_CS_manag_sys_Cat newData_type) {
		CS_operator_sys_to_from_CS_manag_sys_Cat oldData_type = data_type;
		data_type = newData_type == null ? DATA_TYPE_EDEFAULT : newData_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__DATA_TYPE, oldData_type, data_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmobilityPackage.CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__DATA_TYPE:
				return getData_type();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmobilityPackage.CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__DATA_TYPE:
				setData_type((CS_operator_sys_to_from_CS_manag_sys_Cat)newValue);
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
			case EmobilityPackage.CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__DATA_TYPE:
				setData_type(DATA_TYPE_EDEFAULT);
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
			case EmobilityPackage.CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS__DATA_TYPE:
				return data_type != DATA_TYPE_EDEFAULT;
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
		result.append(" (data_type: ");
		result.append(data_type);
		result.append(')');
		return result.toString();
	}

} //CS_operator_sys_to_from_CS_manag_sysImpl
