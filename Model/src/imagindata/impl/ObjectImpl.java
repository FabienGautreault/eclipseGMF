/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectImpl.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata.impl;

import imagindata.Project;
import imagindata.Signal;
import imagindata.State;
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
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imagindata.impl.ObjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link imagindata.impl.ObjectImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link imagindata.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link imagindata.impl.ObjectImpl#getStateobject <em>Stateobject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends EObjectImpl implements imagindata.Object {
	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signal;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return imagindataPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != imagindataPackage.OBJECT__PROJECT) return null;
		return (Project)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, imagindataPackage.OBJECT__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != imagindataPackage.OBJECT__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, imagindataPackage.PROJECT__OBJECTS, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.OBJECT__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignal() {
		if (signal == null) {
			signal = new EObjectWithInverseResolvingEList<Signal>(Signal.class, this, imagindataPackage.OBJECT__SIGNAL, imagindataPackage.SIGNAL__OBJECT);
		}
		return signal;
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
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateobject() {
		if (eContainerFeatureID() != imagindataPackage.OBJECT__STATEOBJECT) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateobject(State newStateobject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateobject, imagindataPackage.OBJECT__STATEOBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateobject(State newStateobject) {
		if (newStateobject != eInternalContainer() || (eContainerFeatureID() != imagindataPackage.OBJECT__STATEOBJECT && newStateobject != null)) {
			if (EcoreUtil.isAncestor(this, newStateobject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateobject != null)
				msgs = ((InternalEObject)newStateobject).eInverseAdd(this, imagindataPackage.STATE__OBJECTS, State.class, msgs);
			msgs = basicSetStateobject(newStateobject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.OBJECT__STATEOBJECT, newStateobject, newStateobject));
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
			case imagindataPackage.OBJECT__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case imagindataPackage.OBJECT__SIGNAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignal()).basicAdd(otherEnd, msgs);
			case imagindataPackage.OBJECT__STATEOBJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateobject((State)otherEnd, msgs);
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
			case imagindataPackage.OBJECT__PROJECT:
				return basicSetProject(null, msgs);
			case imagindataPackage.OBJECT__SIGNAL:
				return ((InternalEList<?>)getSignal()).basicRemove(otherEnd, msgs);
			case imagindataPackage.OBJECT__STATEOBJECT:
				return basicSetStateobject(null, msgs);
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
			case imagindataPackage.OBJECT__PROJECT:
				return eInternalContainer().eInverseRemove(this, imagindataPackage.PROJECT__OBJECTS, Project.class, msgs);
			case imagindataPackage.OBJECT__STATEOBJECT:
				return eInternalContainer().eInverseRemove(this, imagindataPackage.STATE__OBJECTS, State.class, msgs);
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
			case imagindataPackage.OBJECT__PROJECT:
				return getProject();
			case imagindataPackage.OBJECT__SIGNAL:
				return getSignal();
			case imagindataPackage.OBJECT__NAME:
				return getName();
			case imagindataPackage.OBJECT__STATEOBJECT:
				return getStateobject();
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
			case imagindataPackage.OBJECT__PROJECT:
				setProject((Project)newValue);
				return;
			case imagindataPackage.OBJECT__SIGNAL:
				getSignal().clear();
				getSignal().addAll((Collection<? extends Signal>)newValue);
				return;
			case imagindataPackage.OBJECT__NAME:
				setName((String)newValue);
				return;
			case imagindataPackage.OBJECT__STATEOBJECT:
				setStateobject((State)newValue);
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
			case imagindataPackage.OBJECT__PROJECT:
				setProject((Project)null);
				return;
			case imagindataPackage.OBJECT__SIGNAL:
				getSignal().clear();
				return;
			case imagindataPackage.OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case imagindataPackage.OBJECT__STATEOBJECT:
				setStateobject((State)null);
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
			case imagindataPackage.OBJECT__PROJECT:
				return getProject() != null;
			case imagindataPackage.OBJECT__SIGNAL:
				return signal != null && !signal.isEmpty();
			case imagindataPackage.OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case imagindataPackage.OBJECT__STATEOBJECT:
				return getStateobject() != null;
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

} //ObjectImpl
