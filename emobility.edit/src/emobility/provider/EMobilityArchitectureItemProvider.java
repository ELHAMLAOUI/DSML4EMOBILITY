/**
 */
package emobility.provider;


import emobility.EMobilityArchitecture;
import emobility.EmobilityFactory;
import emobility.EmobilityPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link emobility.EMobilityArchitecture} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMobilityArchitectureItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMobilityArchitectureItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EMobilityArchitecture.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMobilityArchitecture"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_EMobilityArchitecture_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EMobilityArchitecture.class)) {
			case EmobilityPackage.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createCSO()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createCS_Controller()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createCSMS()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createEV_User()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createDSO()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createServer()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createEVSE()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createEnergy_Supplier()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createLaptop()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createBrowser()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createService_API()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createElectric_Vehicule()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createMobile()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createClearing_House()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createeMSP()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createAPK()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createWeb_Application()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createAdministrator()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createDomain()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createSecurityControl()));

		newChildDescriptors.add
			(createChildParameter
				(EmobilityPackage.Literals.EMOBILITY_ARCHITECTURE__EMOBILITYELEMENT,
				 EmobilityFactory.eINSTANCE.createThreat()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EmobilityEditPlugin.INSTANCE;
	}

}
