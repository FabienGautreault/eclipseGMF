/**
 * <copyright>
 * </copyright>
 *
 * $Id: DiagramImpl.java,v 1.5 2010/09/14 08:23:54 kf288526 Exp $
 */
package imagindata.impl;

import imagindata.Anchor;
import imagindata.Diagram;
import imagindata.Historic;
import imagindata.InterfaceContainer;
import imagindata.Region;
import imagindata.imagindataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imagindata.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link imagindata.impl.DiagramImpl#getIContainer <em>IContainer</em>}</li>
 *   <li>{@link imagindata.impl.DiagramImpl#getRegions <em>Regions</em>}</li>
 *   <li>{@link imagindata.impl.DiagramImpl#getHisto <em>Histo</em>}</li>
 *   <li>{@link imagindata.impl.DiagramImpl#getAnchors <em>Anchors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends StateObjectImpl implements Diagram {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> regions;

	/**
	 * The cached value of the '{@link #getHisto() <em>Histo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHisto()
	 * @generated
	 * @ordered
	 */
	protected Historic histo;

	/**
	 * The cached value of the '{@link #getAnchors() <em>Anchors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchors()
	 * @generated
	 * @ordered
	 */
	protected EList<Anchor> anchors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return imagindataPackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceContainer getIContainer() {
		if (eContainerFeatureID() != imagindataPackage.DIAGRAM__ICONTAINER) return null;
		return (InterfaceContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIContainer(InterfaceContainer newIContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIContainer, imagindataPackage.DIAGRAM__ICONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIContainer(InterfaceContainer newIContainer) {
		if (newIContainer != eInternalContainer() || (eContainerFeatureID() != imagindataPackage.DIAGRAM__ICONTAINER && newIContainer != null)) {
			if (EcoreUtil.isAncestor(this, newIContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIContainer != null)
				msgs = ((InternalEObject)newIContainer).eInverseAdd(this, imagindataPackage.INTERFACE_CONTAINER__DIAGRAMS, InterfaceContainer.class, msgs);
			msgs = basicSetIContainer(newIContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.DIAGRAM__ICONTAINER, newIContainer, newIContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegions() {
		if (regions == null) {
			regions = new EObjectContainmentWithInverseEList<Region>(Region.class, this, imagindataPackage.DIAGRAM__REGIONS, imagindataPackage.REGION__DIAGRAM);
		}
		return regions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Historic getHisto() {
		return histo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHisto(Historic newHisto, NotificationChain msgs) {
		Historic oldHisto = histo;
		histo = newHisto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, imagindataPackage.DIAGRAM__HISTO, oldHisto, newHisto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHisto(Historic newHisto) {
		if (newHisto != histo) {
			NotificationChain msgs = null;
			if (histo != null)
				msgs = ((InternalEObject)histo).eInverseRemove(this, imagindataPackage.HISTORIC__SUBDIAGRAM, Historic.class, msgs);
			if (newHisto != null)
				msgs = ((InternalEObject)newHisto).eInverseAdd(this, imagindataPackage.HISTORIC__SUBDIAGRAM, Historic.class, msgs);
			msgs = basicSetHisto(newHisto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.DIAGRAM__HISTO, newHisto, newHisto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Anchor> getAnchors() {
		if (anchors == null) {
			anchors = new EObjectContainmentWithInverseEList<Anchor>(Anchor.class, this, imagindataPackage.DIAGRAM__ANCHORS, imagindataPackage.ANCHOR__DIAGRAM);
		}
		return anchors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case imagindataPackage.DIAGRAM__ICONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIContainer((InterfaceContainer)otherEnd, msgs);
			case imagindataPackage.DIAGRAM__REGIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegions()).basicAdd(otherEnd, msgs);
			case imagindataPackage.DIAGRAM__HISTO:
				if (histo != null)
					msgs = ((InternalEObject)histo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - imagindataPackage.DIAGRAM__HISTO, null, msgs);
				return basicSetHisto((Historic)otherEnd, msgs);
			case imagindataPackage.DIAGRAM__ANCHORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnchors()).basicAdd(otherEnd, msgs);
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
			case imagindataPackage.DIAGRAM__ICONTAINER:
				return basicSetIContainer(null, msgs);
			case imagindataPackage.DIAGRAM__REGIONS:
				return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
			case imagindataPackage.DIAGRAM__HISTO:
				return basicSetHisto(null, msgs);
			case imagindataPackage.DIAGRAM__ANCHORS:
				return ((InternalEList<?>)getAnchors()).basicRemove(otherEnd, msgs);
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
			case imagindataPackage.DIAGRAM__ICONTAINER:
				return eInternalContainer().eInverseRemove(this, imagindataPackage.INTERFACE_CONTAINER__DIAGRAMS, InterfaceContainer.class, msgs);
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
			case imagindataPackage.DIAGRAM__NAME:
				return getName();
			case imagindataPackage.DIAGRAM__ICONTAINER:
				return getIContainer();
			case imagindataPackage.DIAGRAM__REGIONS:
				return getRegions();
			case imagindataPackage.DIAGRAM__HISTO:
				return getHisto();
			case imagindataPackage.DIAGRAM__ANCHORS:
				return getAnchors();
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
			case imagindataPackage.DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case imagindataPackage.DIAGRAM__ICONTAINER:
				setIContainer((InterfaceContainer)newValue);
				return;
			case imagindataPackage.DIAGRAM__REGIONS:
				getRegions().clear();
				getRegions().addAll((Collection<? extends Region>)newValue);
				return;
			case imagindataPackage.DIAGRAM__HISTO:
				setHisto((Historic)newValue);
				return;
			case imagindataPackage.DIAGRAM__ANCHORS:
				getAnchors().clear();
				getAnchors().addAll((Collection<? extends Anchor>)newValue);
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
			case imagindataPackage.DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case imagindataPackage.DIAGRAM__ICONTAINER:
				setIContainer((InterfaceContainer)null);
				return;
			case imagindataPackage.DIAGRAM__REGIONS:
				getRegions().clear();
				return;
			case imagindataPackage.DIAGRAM__HISTO:
				setHisto((Historic)null);
				return;
			case imagindataPackage.DIAGRAM__ANCHORS:
				getAnchors().clear();
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
			case imagindataPackage.DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case imagindataPackage.DIAGRAM__ICONTAINER:
				return getIContainer() != null;
			case imagindataPackage.DIAGRAM__REGIONS:
				return regions != null && !regions.isEmpty();
			case imagindataPackage.DIAGRAM__HISTO:
				return histo != null;
			case imagindataPackage.DIAGRAM__ANCHORS:
				return anchors != null && !anchors.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DiagramImpl
