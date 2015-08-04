/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterruptibleRegionImpl.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata.impl;

import imagindata.InterruptibleRegion;
import imagindata.imagindataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptible Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imagindata.impl.InterruptibleRegionImpl#getName <em>Name</em>}</li>
 *   <li>{@link imagindata.impl.InterruptibleRegionImpl#getInterruptState <em>Interrupt State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterruptibleRegionImpl extends RegionImpl implements InterruptibleRegion {
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
	 * The default value of the '{@link #getInterruptState() <em>Interrupt State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptState()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERRUPT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterruptState() <em>Interrupt State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptState()
	 * @generated
	 * @ordered
	 */
	protected String interruptState = INTERRUPT_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptibleRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return imagindataPackage.Literals.INTERRUPTIBLE_REGION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.INTERRUPTIBLE_REGION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterruptState() {
		return interruptState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterruptState(String newInterruptState) {
		String oldInterruptState = interruptState;
		interruptState = newInterruptState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.INTERRUPTIBLE_REGION__INTERRUPT_STATE, oldInterruptState, interruptState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case imagindataPackage.INTERRUPTIBLE_REGION__NAME:
				return getName();
			case imagindataPackage.INTERRUPTIBLE_REGION__INTERRUPT_STATE:
				return getInterruptState();
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
			case imagindataPackage.INTERRUPTIBLE_REGION__NAME:
				setName((String)newValue);
				return;
			case imagindataPackage.INTERRUPTIBLE_REGION__INTERRUPT_STATE:
				setInterruptState((String)newValue);
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
			case imagindataPackage.INTERRUPTIBLE_REGION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case imagindataPackage.INTERRUPTIBLE_REGION__INTERRUPT_STATE:
				setInterruptState(INTERRUPT_STATE_EDEFAULT);
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
			case imagindataPackage.INTERRUPTIBLE_REGION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case imagindataPackage.INTERRUPTIBLE_REGION__INTERRUPT_STATE:
				return INTERRUPT_STATE_EDEFAULT == null ? interruptState != null : !INTERRUPT_STATE_EDEFAULT.equals(interruptState);
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
		result.append(", InterruptState: ");
		result.append(interruptState);
		result.append(')');
		return result.toString();
	}

} //InterruptibleRegionImpl
