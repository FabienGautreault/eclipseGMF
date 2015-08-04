/**
 * <copyright>
 * </copyright>
 *
 * $Id: HistoricImpl.java,v 1.5 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata.impl;

import imagindata.Diagram;
import imagindata.Historic;
import imagindata.imagindataPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imagindata.impl.HistoricImpl#getSubdiagram <em>Subdiagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoricImpl extends StateObjectImpl implements Historic {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return imagindataPackage.Literals.HISTORIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getSubdiagram() {
		if (eContainerFeatureID() != imagindataPackage.HISTORIC__SUBDIAGRAM) return null;
		return (Diagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubdiagram(Diagram newSubdiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSubdiagram, imagindataPackage.HISTORIC__SUBDIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubdiagram(Diagram newSubdiagram) {
		if (newSubdiagram != eInternalContainer() || (eContainerFeatureID() != imagindataPackage.HISTORIC__SUBDIAGRAM && newSubdiagram != null)) {
			if (EcoreUtil.isAncestor(this, newSubdiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubdiagram != null)
				msgs = ((InternalEObject)newSubdiagram).eInverseAdd(this, imagindataPackage.DIAGRAM__HISTO, Diagram.class, msgs);
			msgs = basicSetSubdiagram(newSubdiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.HISTORIC__SUBDIAGRAM, newSubdiagram, newSubdiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case imagindataPackage.HISTORIC__SUBDIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubdiagram((Diagram)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case imagindataPackage.HISTORIC__SUBDIAGRAM:
				return basicSetSubdiagram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case imagindataPackage.HISTORIC__SUBDIAGRAM:
				return eInternalContainer().eInverseRemove(this, imagindataPackage.DIAGRAM__HISTO, Diagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case imagindataPackage.HISTORIC__SUBDIAGRAM:
				return getSubdiagram();
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
			case imagindataPackage.HISTORIC__SUBDIAGRAM:
				setSubdiagram((Diagram)newValue);
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
			case imagindataPackage.HISTORIC__SUBDIAGRAM:
				setSubdiagram((Diagram)null);
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
			case imagindataPackage.HISTORIC__SUBDIAGRAM:
				return getSubdiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //HistoricImpl
