/**
 */
package emobility.impl;

import emobility.Communication;
import emobility.Domain;
import emobility.EMobilityElement;
import emobility.EmobilityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.DomainImpl#getEmobilityelement <em>Emobilityelement</em>}</li>
 *   <li>{@link emobility.impl.DomainImpl#getCommunication <em>Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends EMobilityElementImpl implements Domain {
	/**
	 * The cached value of the '{@link #getEmobilityelement() <em>Emobilityelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmobilityelement()
	 * @generated
	 * @ordered
	 */
	protected EList<EMobilityElement> emobilityelement;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<Communication> communication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMobilityElement> getEmobilityelement() {
		if (emobilityelement == null) {
			emobilityelement = new EObjectContainmentEList<EMobilityElement>(EMobilityElement.class, this, EmobilityPackage.DOMAIN__EMOBILITYELEMENT);
		}
		return emobilityelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Communication> getCommunication() {
		if (communication == null) {
			communication = new EObjectContainmentEList<Communication>(Communication.class, this, EmobilityPackage.DOMAIN__COMMUNICATION);
		}
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmobilityPackage.DOMAIN__EMOBILITYELEMENT:
				return ((InternalEList<?>)getEmobilityelement()).basicRemove(otherEnd, msgs);
			case EmobilityPackage.DOMAIN__COMMUNICATION:
				return ((InternalEList<?>)getCommunication()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmobilityPackage.DOMAIN__EMOBILITYELEMENT:
				return getEmobilityelement();
			case EmobilityPackage.DOMAIN__COMMUNICATION:
				return getCommunication();
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
			case EmobilityPackage.DOMAIN__EMOBILITYELEMENT:
				getEmobilityelement().clear();
				getEmobilityelement().addAll((Collection<? extends EMobilityElement>)newValue);
				return;
			case EmobilityPackage.DOMAIN__COMMUNICATION:
				getCommunication().clear();
				getCommunication().addAll((Collection<? extends Communication>)newValue);
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
			case EmobilityPackage.DOMAIN__EMOBILITYELEMENT:
				getEmobilityelement().clear();
				return;
			case EmobilityPackage.DOMAIN__COMMUNICATION:
				getCommunication().clear();
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
			case EmobilityPackage.DOMAIN__EMOBILITYELEMENT:
				return emobilityelement != null && !emobilityelement.isEmpty();
			case EmobilityPackage.DOMAIN__COMMUNICATION:
				return communication != null && !communication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
