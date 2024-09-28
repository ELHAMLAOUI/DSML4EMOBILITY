/**
 */
package emobility;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Mobile#getApk <em>Apk</em>}</li>
 *   <li>{@link emobility.Mobile#getOS <em>OS</em>}</li>
 *   <li>{@link emobility.Mobile#getBrowser <em>Browser</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getMobile()
 * @model
 * @generated
 */
public interface Mobile extends EV_User_Element {
	/**
	 * Returns the value of the '<em><b>Apk</b></em>' containment reference list.
	 * The list contents are of type {@link emobility.APK}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apk</em>' containment reference list.
	 * @see emobility.EmobilityPackage#getMobile_Apk()
	 * @model containment="true"
	 * @generated
	 */
	EList<APK> getApk();

	/**
	 * Returns the value of the '<em><b>OS</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.mOS_type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS</em>' attribute.
	 * @see emobility.mOS_type
	 * @see #setOS(mOS_type)
	 * @see emobility.EmobilityPackage#getMobile_OS()
	 * @model
	 * @generated
	 */
	mOS_type getOS();

	/**
	 * Sets the value of the '{@link emobility.Mobile#getOS <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS</em>' attribute.
	 * @see emobility.mOS_type
	 * @see #getOS()
	 * @generated
	 */
	void setOS(mOS_type value);

	/**
	 * Returns the value of the '<em><b>Browser</b></em>' containment reference list.
	 * The list contents are of type {@link emobility.Browser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browser</em>' containment reference list.
	 * @see emobility.EmobilityPackage#getMobile_Browser()
	 * @model containment="true"
	 * @generated
	 */
	EList<Browser> getBrowser();

} // Mobile
