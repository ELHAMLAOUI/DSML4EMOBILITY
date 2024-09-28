/**
 */
package emobility.impl;

import emobility.EMobilityArchitecture;
import emobility.EMobilityElement;
import emobility.EmobilityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMobility Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.EMobilityArchitectureImpl#getEmobilityelement <em>Emobilityelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMobilityArchitectureImpl extends MinimalEObjectImpl.Container implements EMobilityArchitecture {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMobilityArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMobilityElement> getEmobilityelement() {
		if (emobilityelement == null) {
			emobilityelement = new EObjectContainmentEList<EMobilityElement>(EMobilityElement.class, this, EmobilityPackage.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT);
		}
		return emobilityelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmobilityPackage.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT:
				return ((InternalEList<?>)getEmobilityelement()).basicRemove(otherEnd, msgs);
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
			case EmobilityPackage.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT:
				return getEmobilityelement();
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
			case EmobilityPackage.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT:
				getEmobilityelement().clear();
				getEmobilityelement().addAll((Collection<? extends EMobilityElement>)newValue);
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
			case EmobilityPackage.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT:
				getEmobilityelement().clear();
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
			case EmobilityPackage.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT:
				return emobilityelement != null && !emobilityelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EMobilityArchitectureImpl
