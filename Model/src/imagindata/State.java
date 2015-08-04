/**
 * <copyright>
 * </copyright>
 *
 * $Id: State.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.State#getName <em>Name</em>}</li>
 *   <li>{@link imagindata.State#getType <em>Type</em>}</li>
 *   <li>{@link imagindata.State#getExterneSignal <em>Externe Signal</em>}</li>
 *   <li>{@link imagindata.State#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getState()
 * @model
 * @generated
 */
public interface State extends StateObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see imagindata.imagindataPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link imagindata.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link imagindata.StateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see imagindata.StateType
	 * @see #setType(StateType)
	 * @see imagindata.imagindataPackage#getState_Type()
	 * @model
	 * @generated
	 */
	StateType getType();

	/**
	 * Sets the value of the '{@link imagindata.State#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see imagindata.StateType
	 * @see #getType()
	 * @generated
	 */
	void setType(StateType value);

	/**
	 * Returns the value of the '<em><b>Externe Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externe Signal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externe Signal</em>' attribute.
	 * @see #setExterneSignal(String)
	 * @see imagindata.imagindataPackage#getState_ExterneSignal()
	 * @model
	 * @generated
	 */
	String getExterneSignal();

	/**
	 * Sets the value of the '{@link imagindata.State#getExterneSignal <em>Externe Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externe Signal</em>' attribute.
	 * @see #getExterneSignal()
	 * @generated
	 */
	void setExterneSignal(String value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link imagindata.Object}.
	 * It is bidirectional and its opposite is '{@link imagindata.Object#getStateobject <em>Stateobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see imagindata.imagindataPackage#getState_Objects()
	 * @see imagindata.Object#getStateobject
	 * @model opposite="stateobject" containment="true"
	 * @generated
	 */
	EList<imagindata.Object> getObjects();

} // State
