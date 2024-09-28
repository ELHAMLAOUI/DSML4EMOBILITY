/**
 */
package emobility;

import java.math.BigInteger;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Threat#getId <em>Id</em>}</li>
 *   <li>{@link emobility.Threat#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link emobility.Threat#getAsset <em>Asset</em>}</li>
 *   <li>{@link emobility.Threat#getRisk_level <em>Risk level</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getThreat()
 * @model
 * @generated
 */
public interface Threat extends EMobilityElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see emobility.EmobilityPackage#getThreat_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link emobility.Threat#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.Likelihood_Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likelihood</em>' attribute.
	 * @see emobility.Likelihood_Level
	 * @see #setLikelihood(Likelihood_Level)
	 * @see emobility.EmobilityPackage#getThreat_Likelihood()
	 * @model
	 * @generated
	 */
	Likelihood_Level getLikelihood();

	/**
	 * Sets the value of the '{@link emobility.Threat#getLikelihood <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' attribute.
	 * @see emobility.Likelihood_Level
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(Likelihood_Level value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference list.
	 * The list contents are of type {@link emobility.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference list.
	 * @see emobility.EmobilityPackage#getThreat_Asset()
	 * @model
	 * @generated
	 */
	EList<Asset> getAsset();

	/**
	 * Returns the value of the '<em><b>Risk level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk level</em>' attribute.
	 * @see #setRisk_level(BigInteger)
	 * @see emobility.EmobilityPackage#getThreat_Risk_level()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" derived="true"
	 * @generated
	 */
	BigInteger getRisk_level();

	/**
	 * Sets the value of the '{@link emobility.Threat#getRisk_level <em>Risk level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk level</em>' attribute.
	 * @see #getRisk_level()
	 * @generated
	 */
	void setRisk_level(BigInteger value);

} // Threat
