/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegionImpl.java,v 1.4 2010/09/15 11:07:52 kf288526 Exp $
 */
package imagindata.impl;

import imagindata.Anchor;
import imagindata.Diagram;
import imagindata.Region;
import imagindata.StateObject;
import imagindata.Transition;
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
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imagindata.impl.RegionImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link imagindata.impl.RegionImpl#getStateObjects <em>State Objects</em>}</li>
 *   <li>{@link imagindata.impl.RegionImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends InterfaceContainerImpl implements Region {
	/**
	 * The cached value of the '{@link #getStateObjects() <em>State Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<StateObject> stateObjects;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return imagindataPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		if (eContainerFeatureID() != imagindataPackage.REGION__DIAGRAM) return null;
		return (Diagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, imagindataPackage.REGION__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != imagindataPackage.REGION__DIAGRAM && newDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, imagindataPackage.DIAGRAM__REGIONS, Diagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.REGION__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateObject> getStateObjects() {
		if (stateObjects == null) {
			stateObjects = new EObjectContainmentWithInverseEList<StateObject>(StateObject.class, this, imagindataPackage.REGION__STATE_OBJECTS, imagindataPackage.STATE_OBJECT__REGION);
		}
		return stateObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, imagindataPackage.REGION__TRANSITIONS, imagindataPackage.TRANSITION__REGION);
		}
		return transitions;
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
			case imagindataPackage.REGION__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((Diagram)otherEnd, msgs);
			case imagindataPackage.REGION__STATE_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStateObjects()).basicAdd(otherEnd, msgs);
			case imagindataPackage.REGION__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
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
			case imagindataPackage.REGION__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case imagindataPackage.REGION__STATE_OBJECTS:
				return ((InternalEList<?>)getStateObjects()).basicRemove(otherEnd, msgs);
			case imagindataPackage.REGION__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case imagindataPackage.REGION__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, imagindataPackage.DIAGRAM__REGIONS, Diagram.class, msgs);
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
			case imagindataPackage.REGION__DIAGRAM:
				return getDiagram();
			case imagindataPackage.REGION__STATE_OBJECTS:
				return getStateObjects();
			case imagindataPackage.REGION__TRANSITIONS:
				return getTransitions();
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
			case imagindataPackage.REGION__DIAGRAM:
				setDiagram((Diagram)newValue);
				return;
			case imagindataPackage.REGION__STATE_OBJECTS:
				getStateObjects().clear();
				getStateObjects().addAll((Collection<? extends StateObject>)newValue);
				return;
			case imagindataPackage.REGION__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case imagindataPackage.REGION__DIAGRAM:
				setDiagram((Diagram)null);
				return;
			case imagindataPackage.REGION__STATE_OBJECTS:
				getStateObjects().clear();
				return;
			case imagindataPackage.REGION__TRANSITIONS:
				getTransitions().clear();
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
			case imagindataPackage.REGION__DIAGRAM:
				return getDiagram() != null;
			case imagindataPackage.REGION__STATE_OBJECTS:
				return stateObjects != null && !stateObjects.isEmpty();
			case imagindataPackage.REGION__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegionImpl
