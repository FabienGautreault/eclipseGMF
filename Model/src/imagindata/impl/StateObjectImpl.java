/**
 * <copyright>
 * </copyright>
 *
 * $Id: StateObjectImpl.java,v 1.5 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata.impl;

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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imagindata.impl.StateObjectImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link imagindata.impl.StateObjectImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link imagindata.impl.StateObjectImpl#getEnter <em>Enter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateObjectImpl extends EObjectImpl implements StateObject {
	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> exit;

	/**
	 * The cached value of the '{@link #getEnter() <em>Enter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnter()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> enter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return imagindataPackage.Literals.STATE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion() {
		if (eContainerFeatureID() != imagindataPackage.STATE_OBJECT__REGION) return null;
		return (Region)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(Region newRegion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRegion, imagindataPackage.STATE_OBJECT__REGION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(Region newRegion) {
		if (newRegion != eInternalContainer() || (eContainerFeatureID() != imagindataPackage.STATE_OBJECT__REGION && newRegion != null)) {
			if (EcoreUtil.isAncestor(this, newRegion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, imagindataPackage.REGION__STATE_OBJECTS, Region.class, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.STATE_OBJECT__REGION, newRegion, newRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getExit() {
		if (exit == null) {
			exit = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, imagindataPackage.STATE_OBJECT__EXIT, imagindataPackage.TRANSITION__START);
		}
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getEnter() {
		if (enter == null) {
			enter = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, imagindataPackage.STATE_OBJECT__ENTER, imagindataPackage.TRANSITION__END);
		}
		return enter;
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
			case imagindataPackage.STATE_OBJECT__REGION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRegion((Region)otherEnd, msgs);
			case imagindataPackage.STATE_OBJECT__EXIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExit()).basicAdd(otherEnd, msgs);
			case imagindataPackage.STATE_OBJECT__ENTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnter()).basicAdd(otherEnd, msgs);
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
			case imagindataPackage.STATE_OBJECT__REGION:
				return basicSetRegion(null, msgs);
			case imagindataPackage.STATE_OBJECT__EXIT:
				return ((InternalEList<?>)getExit()).basicRemove(otherEnd, msgs);
			case imagindataPackage.STATE_OBJECT__ENTER:
				return ((InternalEList<?>)getEnter()).basicRemove(otherEnd, msgs);
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
			case imagindataPackage.STATE_OBJECT__REGION:
				return eInternalContainer().eInverseRemove(this, imagindataPackage.REGION__STATE_OBJECTS, Region.class, msgs);
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
			case imagindataPackage.STATE_OBJECT__REGION:
				return getRegion();
			case imagindataPackage.STATE_OBJECT__EXIT:
				return getExit();
			case imagindataPackage.STATE_OBJECT__ENTER:
				return getEnter();
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
			case imagindataPackage.STATE_OBJECT__REGION:
				setRegion((Region)newValue);
				return;
			case imagindataPackage.STATE_OBJECT__EXIT:
				getExit().clear();
				getExit().addAll((Collection<? extends Transition>)newValue);
				return;
			case imagindataPackage.STATE_OBJECT__ENTER:
				getEnter().clear();
				getEnter().addAll((Collection<? extends Transition>)newValue);
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
			case imagindataPackage.STATE_OBJECT__REGION:
				setRegion((Region)null);
				return;
			case imagindataPackage.STATE_OBJECT__EXIT:
				getExit().clear();
				return;
			case imagindataPackage.STATE_OBJECT__ENTER:
				getEnter().clear();
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
			case imagindataPackage.STATE_OBJECT__REGION:
				return getRegion() != null;
			case imagindataPackage.STATE_OBJECT__EXIT:
				return exit != null && !exit.isEmpty();
			case imagindataPackage.STATE_OBJECT__ENTER:
				return enter != null && !enter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateObjectImpl
