/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransitionImpl.java,v 1.5 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata.impl;

import imagindata.Region;
import imagindata.StateObject;
import imagindata.Transition;
import imagindata.imagindataPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imagindata.impl.TransitionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link imagindata.impl.TransitionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link imagindata.impl.TransitionImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link imagindata.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link imagindata.impl.TransitionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link imagindata.impl.TransitionImpl#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EObjectImpl implements Transition {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected StateObject start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected StateObject end;

	/**
	 * The default value of the '{@link #getSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected String signal = SIGNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected String guard = GUARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return imagindataPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateObject getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (StateObject)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, imagindataPackage.TRANSITION__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateObject basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(StateObject newStart, NotificationChain msgs) {
		StateObject oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, imagindataPackage.TRANSITION__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(StateObject newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, imagindataPackage.STATE_OBJECT__EXIT, StateObject.class, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, imagindataPackage.STATE_OBJECT__EXIT, StateObject.class, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.TRANSITION__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateObject getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (StateObject)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, imagindataPackage.TRANSITION__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateObject basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(StateObject newEnd, NotificationChain msgs) {
		StateObject oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, imagindataPackage.TRANSITION__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(StateObject newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, imagindataPackage.STATE_OBJECT__ENTER, StateObject.class, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, imagindataPackage.STATE_OBJECT__ENTER, StateObject.class, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.TRANSITION__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(String newSignal) {
		String oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.TRANSITION__SIGNAL, oldSignal, signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(String newGuard) {
		String oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.TRANSITION__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(String newEffect) {
		String oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.TRANSITION__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion() {
		if (eContainerFeatureID() != imagindataPackage.TRANSITION__REGION) return null;
		return (Region)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(Region newRegion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRegion, imagindataPackage.TRANSITION__REGION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(Region newRegion) {
		if (newRegion != eInternalContainer() || (eContainerFeatureID() != imagindataPackage.TRANSITION__REGION && newRegion != null)) {
			if (EcoreUtil.isAncestor(this, newRegion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, imagindataPackage.REGION__TRANSITIONS, Region.class, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.TRANSITION__REGION, newRegion, newRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case imagindataPackage.TRANSITION__START:
				if (start != null)
					msgs = ((InternalEObject)start).eInverseRemove(this, imagindataPackage.STATE_OBJECT__EXIT, StateObject.class, msgs);
				return basicSetStart((StateObject)otherEnd, msgs);
			case imagindataPackage.TRANSITION__END:
				if (end != null)
					msgs = ((InternalEObject)end).eInverseRemove(this, imagindataPackage.STATE_OBJECT__ENTER, StateObject.class, msgs);
				return basicSetEnd((StateObject)otherEnd, msgs);
			case imagindataPackage.TRANSITION__REGION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRegion((Region)otherEnd, msgs);
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
			case imagindataPackage.TRANSITION__START:
				return basicSetStart(null, msgs);
			case imagindataPackage.TRANSITION__END:
				return basicSetEnd(null, msgs);
			case imagindataPackage.TRANSITION__REGION:
				return basicSetRegion(null, msgs);
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
			case imagindataPackage.TRANSITION__REGION:
				return eInternalContainer().eInverseRemove(this, imagindataPackage.REGION__TRANSITIONS, Region.class, msgs);
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
			case imagindataPackage.TRANSITION__START:
				if (resolve) return getStart();
				return basicGetStart();
			case imagindataPackage.TRANSITION__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case imagindataPackage.TRANSITION__SIGNAL:
				return getSignal();
			case imagindataPackage.TRANSITION__GUARD:
				return getGuard();
			case imagindataPackage.TRANSITION__EFFECT:
				return getEffect();
			case imagindataPackage.TRANSITION__REGION:
				return getRegion();
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
			case imagindataPackage.TRANSITION__START:
				setStart((StateObject)newValue);
				return;
			case imagindataPackage.TRANSITION__END:
				setEnd((StateObject)newValue);
				return;
			case imagindataPackage.TRANSITION__SIGNAL:
				setSignal((String)newValue);
				return;
			case imagindataPackage.TRANSITION__GUARD:
				setGuard((String)newValue);
				return;
			case imagindataPackage.TRANSITION__EFFECT:
				setEffect((String)newValue);
				return;
			case imagindataPackage.TRANSITION__REGION:
				setRegion((Region)newValue);
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
			case imagindataPackage.TRANSITION__START:
				setStart((StateObject)null);
				return;
			case imagindataPackage.TRANSITION__END:
				setEnd((StateObject)null);
				return;
			case imagindataPackage.TRANSITION__SIGNAL:
				setSignal(SIGNAL_EDEFAULT);
				return;
			case imagindataPackage.TRANSITION__GUARD:
				setGuard(GUARD_EDEFAULT);
				return;
			case imagindataPackage.TRANSITION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case imagindataPackage.TRANSITION__REGION:
				setRegion((Region)null);
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
			case imagindataPackage.TRANSITION__START:
				return start != null;
			case imagindataPackage.TRANSITION__END:
				return end != null;
			case imagindataPackage.TRANSITION__SIGNAL:
				return SIGNAL_EDEFAULT == null ? signal != null : !SIGNAL_EDEFAULT.equals(signal);
			case imagindataPackage.TRANSITION__GUARD:
				return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
			case imagindataPackage.TRANSITION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case imagindataPackage.TRANSITION__REGION:
				return getRegion() != null;
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
		result.append(" (Signal: ");
		result.append(signal);
		result.append(", Guard: ");
		result.append(guard);
		result.append(", Effect: ");
		result.append(effect);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
