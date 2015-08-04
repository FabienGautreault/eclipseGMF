/**
 * <copyright>
 * </copyright>
 *
 * $Id: StateObject.java,v 1.5 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.StateObject#getRegion <em>Region</em>}</li>
 *   <li>{@link imagindata.StateObject#getExit <em>Exit</em>}</li>
 *   <li>{@link imagindata.StateObject#getEnter <em>Enter</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getStateObject()
 * @model
 * @generated
 */
public interface StateObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imagindata.Region#getStateObjects <em>State Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' container reference.
	 * @see #setRegion(Region)
	 * @see imagindata.imagindataPackage#getStateObject_Region()
	 * @see imagindata.Region#getStateObjects
	 * @model opposite="stateObjects" required="true" transient="false"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link imagindata.StateObject#getRegion <em>Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' container reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference list.
	 * The list contents are of type {@link imagindata.Transition}.
	 * It is bidirectional and its opposite is '{@link imagindata.Transition#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' reference list.
	 * @see imagindata.imagindataPackage#getStateObject_Exit()
	 * @see imagindata.Transition#getStart
	 * @model opposite="Start"
	 * @generated
	 */
	EList<Transition> getExit();

	/**
	 * Returns the value of the '<em><b>Enter</b></em>' reference list.
	 * The list contents are of type {@link imagindata.Transition}.
	 * It is bidirectional and its opposite is '{@link imagindata.Transition#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enter</em>' reference list.
	 * @see imagindata.imagindataPackage#getStateObject_Enter()
	 * @see imagindata.Transition#getEnd
	 * @model opposite="End"
	 * @generated
	 */
	EList<Transition> getEnter();

} // StateObject
