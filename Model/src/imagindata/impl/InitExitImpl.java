/**
 * <copyright>
 * </copyright>
 *
 * $Id: InitExitImpl.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata.impl;

import imagindata.ExitInitType;
import imagindata.InitExit;
import imagindata.imagindataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Exit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imagindata.impl.InitExitImpl#getDiagramName <em>Diagram Name</em>}</li>
 *   <li>{@link imagindata.impl.InitExitImpl#getType <em>Type</em>}</li>
 *   <li>{@link imagindata.impl.InitExitImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitExitImpl extends StateObjectImpl implements InitExit {
	/**
	 * The default value of the '{@link #getDiagramName() <em>Diagram Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramName() <em>Diagram Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramName()
	 * @generated
	 * @ordered
	 */
	protected String diagramName = DIAGRAM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ExitInitType TYPE_EDEFAULT = ExitInitType.INIT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ExitInitType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected String transition = TRANSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitExitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return imagindataPackage.Literals.INIT_EXIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramName() {
		return diagramName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramName(String newDiagramName) {
		String oldDiagramName = diagramName;
		diagramName = newDiagramName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.INIT_EXIT__DIAGRAM_NAME, oldDiagramName, diagramName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitInitType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ExitInitType newType) {
		ExitInitType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.INIT_EXIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(String newTransition) {
		String oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, imagindataPackage.INIT_EXIT__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case imagindataPackage.INIT_EXIT__DIAGRAM_NAME:
				return getDiagramName();
			case imagindataPackage.INIT_EXIT__TYPE:
				return getType();
			case imagindataPackage.INIT_EXIT__TRANSITION:
				return getTransition();
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
			case imagindataPackage.INIT_EXIT__DIAGRAM_NAME:
				setDiagramName((String)newValue);
				return;
			case imagindataPackage.INIT_EXIT__TYPE:
				setType((ExitInitType)newValue);
				return;
			case imagindataPackage.INIT_EXIT__TRANSITION:
				setTransition((String)newValue);
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
			case imagindataPackage.INIT_EXIT__DIAGRAM_NAME:
				setDiagramName(DIAGRAM_NAME_EDEFAULT);
				return;
			case imagindataPackage.INIT_EXIT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case imagindataPackage.INIT_EXIT__TRANSITION:
				setTransition(TRANSITION_EDEFAULT);
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
			case imagindataPackage.INIT_EXIT__DIAGRAM_NAME:
				return DIAGRAM_NAME_EDEFAULT == null ? diagramName != null : !DIAGRAM_NAME_EDEFAULT.equals(diagramName);
			case imagindataPackage.INIT_EXIT__TYPE:
				return type != TYPE_EDEFAULT;
			case imagindataPackage.INIT_EXIT__TRANSITION:
				return TRANSITION_EDEFAULT == null ? transition != null : !TRANSITION_EDEFAULT.equals(transition);
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
		result.append(" (DiagramName: ");
		result.append(diagramName);
		result.append(", Type: ");
		result.append(type);
		result.append(", Transition: ");
		result.append(transition);
		result.append(')');
		return result.toString();
	}

} //InitExitImpl
