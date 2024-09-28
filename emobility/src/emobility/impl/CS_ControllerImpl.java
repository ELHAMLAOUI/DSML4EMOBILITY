/**
 */
package emobility.impl;

import emobility.CS_Controller;
import emobility.EVSE;
import emobility.EmobilityPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CS Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.CS_ControllerImpl#getEvse <em>Evse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CS_ControllerImpl extends Energy_Transfer_ElementImpl implements CS_Controller {
	/**
	 * The cached value of the '{@link #getEvse() <em>Evse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvse()
	 * @generated
	 * @ordered
	 */
	protected EList<EVSE> evse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CS_ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.CS_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EVSE> getEvse() {
		if (evse == null) {
			evse = new EObjectResolvingEList<EVSE>(EVSE.class, this, EmobilityPackage.CS_CONTROLLER__EVSE);
		}
		return evse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmobilityPackage.CS_CONTROLLER__EVSE:
				return getEvse();
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
			case EmobilityPackage.CS_CONTROLLER__EVSE:
				getEvse().clear();
				getEvse().addAll((Collection<? extends EVSE>)newValue);
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
			case EmobilityPackage.CS_CONTROLLER__EVSE:
				getEvse().clear();
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
			case EmobilityPackage.CS_CONTROLLER__EVSE:
				return evse != null && !evse.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CS_ControllerImpl
