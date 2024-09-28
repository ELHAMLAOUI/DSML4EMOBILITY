/**
 */
package emobility.impl;

import emobility.Asset;
import emobility.EmobilityPackage;
import emobility.Likelihood_Level;
import emobility.Threat;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.ThreatImpl#getId <em>Id</em>}</li>
 *   <li>{@link emobility.impl.ThreatImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link emobility.impl.ThreatImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link emobility.impl.ThreatImpl#getRisk_level <em>Risk level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatImpl extends EMobilityElementImpl implements Threat {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final Likelihood_Level LIKELIHOOD_EDEFAULT = Likelihood_Level.L3;

	/**
	 * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected Likelihood_Level likelihood = LIKELIHOOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> asset;

	/**
	 * The default value of the '{@link #getRisk_level() <em>Risk level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk_level()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RISK_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRisk_level() <em>Risk level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk_level()
	 * @generated
	 * @ordered
	 */
	protected BigInteger risk_level = RISK_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.THREAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Integer newId) {
		Integer oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.THREAT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Likelihood_Level getLikelihood() {
		return likelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLikelihood(Likelihood_Level newLikelihood) {
		Likelihood_Level oldLikelihood = likelihood;
		likelihood = newLikelihood == null ? LIKELIHOOD_EDEFAULT : newLikelihood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.THREAT__LIKELIHOOD, oldLikelihood, likelihood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAsset() {
		if (asset == null) {
			asset = new EObjectResolvingEList<Asset>(Asset.class, this, EmobilityPackage.THREAT__ASSET);
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRisk_level() {
		return risk_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisk_level(BigInteger newRisk_level) {
		BigInteger oldRisk_level = risk_level;
		//risk_level = newRisk_level;
		risk_level=BigInteger.valueOf(2);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.THREAT__RISK_LEVEL, oldRisk_level, risk_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmobilityPackage.THREAT__ID:
				return getId();
			case EmobilityPackage.THREAT__LIKELIHOOD:
				return getLikelihood();
			case EmobilityPackage.THREAT__ASSET:
				return getAsset();
			case EmobilityPackage.THREAT__RISK_LEVEL:
				return getRisk_level();
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
			case EmobilityPackage.THREAT__ID:
				setId((Integer)newValue);
				return;
			case EmobilityPackage.THREAT__LIKELIHOOD:
				setLikelihood((Likelihood_Level)newValue);
				return;
			case EmobilityPackage.THREAT__ASSET:
				getAsset().clear();
				getAsset().addAll((Collection<? extends Asset>)newValue);
				return;
			case EmobilityPackage.THREAT__RISK_LEVEL:
				setRisk_level((BigInteger)newValue);
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
			case EmobilityPackage.THREAT__ID:
				setId(ID_EDEFAULT);
				return;
			case EmobilityPackage.THREAT__LIKELIHOOD:
				setLikelihood(LIKELIHOOD_EDEFAULT);
				return;
			case EmobilityPackage.THREAT__ASSET:
				getAsset().clear();
				return;
			case EmobilityPackage.THREAT__RISK_LEVEL:
				setRisk_level(RISK_LEVEL_EDEFAULT);
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
			case EmobilityPackage.THREAT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EmobilityPackage.THREAT__LIKELIHOOD:
				return likelihood != LIKELIHOOD_EDEFAULT;
			case EmobilityPackage.THREAT__ASSET:
				return asset != null && !asset.isEmpty();
			case EmobilityPackage.THREAT__RISK_LEVEL:
				return RISK_LEVEL_EDEFAULT == null ? risk_level != null : !RISK_LEVEL_EDEFAULT.equals(risk_level);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", likelihood: ");
		result.append(likelihood);
		result.append(", risk_level: ");
		result.append(risk_level);
		result.append(')');
		return result.toString();
	}

} //ThreatImpl
