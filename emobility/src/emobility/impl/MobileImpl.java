/**
 */
package emobility.impl;

import emobility.APK;
import emobility.Browser;
import emobility.EmobilityPackage;
import emobility.Mobile;
import emobility.mOS_type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.MobileImpl#getApk <em>Apk</em>}</li>
 *   <li>{@link emobility.impl.MobileImpl#getOS <em>OS</em>}</li>
 *   <li>{@link emobility.impl.MobileImpl#getBrowser <em>Browser</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobileImpl extends EV_User_ElementImpl implements Mobile {
	/**
	 * The cached value of the '{@link #getApk() <em>Apk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApk()
	 * @generated
	 * @ordered
	 */
	protected EList<APK> apk;

	/**
	 * The default value of the '{@link #getOS() <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS()
	 * @generated
	 * @ordered
	 */
	protected static final mOS_type OS_EDEFAULT = mOS_type.ANDROID;

	/**
	 * The cached value of the '{@link #getOS() <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS()
	 * @generated
	 * @ordered
	 */
	protected mOS_type os = OS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBrowser() <em>Browser</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowser()
	 * @generated
	 * @ordered
	 */
	protected EList<Browser> browser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.MOBILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APK> getApk() {
		if (apk == null) {
			apk = new EObjectContainmentEList<APK>(APK.class, this, EmobilityPackage.MOBILE__APK);
		}
		return apk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mOS_type getOS() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS(mOS_type newOS) {
		mOS_type oldOS = os;
		os = newOS == null ? OS_EDEFAULT : newOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.MOBILE__OS, oldOS, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Browser> getBrowser() {
		if (browser == null) {
			browser = new EObjectContainmentEList<Browser>(Browser.class, this, EmobilityPackage.MOBILE__BROWSER);
		}
		return browser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmobilityPackage.MOBILE__APK:
				return ((InternalEList<?>)getApk()).basicRemove(otherEnd, msgs);
			case EmobilityPackage.MOBILE__BROWSER:
				return ((InternalEList<?>)getBrowser()).basicRemove(otherEnd, msgs);
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
			case EmobilityPackage.MOBILE__APK:
				return getApk();
			case EmobilityPackage.MOBILE__OS:
				return getOS();
			case EmobilityPackage.MOBILE__BROWSER:
				return getBrowser();
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
			case EmobilityPackage.MOBILE__APK:
				getApk().clear();
				getApk().addAll((Collection<? extends APK>)newValue);
				return;
			case EmobilityPackage.MOBILE__OS:
				setOS((mOS_type)newValue);
				return;
			case EmobilityPackage.MOBILE__BROWSER:
				getBrowser().clear();
				getBrowser().addAll((Collection<? extends Browser>)newValue);
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
			case EmobilityPackage.MOBILE__APK:
				getApk().clear();
				return;
			case EmobilityPackage.MOBILE__OS:
				setOS(OS_EDEFAULT);
				return;
			case EmobilityPackage.MOBILE__BROWSER:
				getBrowser().clear();
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
			case EmobilityPackage.MOBILE__APK:
				return apk != null && !apk.isEmpty();
			case EmobilityPackage.MOBILE__OS:
				return os != OS_EDEFAULT;
			case EmobilityPackage.MOBILE__BROWSER:
				return browser != null && !browser.isEmpty();
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
		result.append(" (OS: ");
		result.append(os);
		result.append(')');
		return result.toString();
	}

} //MobileImpl
