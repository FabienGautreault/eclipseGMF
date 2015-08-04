/**
 * <copyright>
 * </copyright>
 *
 * $Id: Transition.java,v 1.6 2010/08/02 12:15:13 kf288526 Exp $
 */
package imagindata;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.Transition#getStart <em>Start</em>}</li>
 *   <li>{@link imagindata.Transition#getEnd <em>End</em>}</li>
 *   <li>{@link imagindata.Transition#getSignal <em>Signal</em>}</li>
 *   <li>{@link imagindata.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link imagindata.Transition#getEffect <em>Effect</em>}</li>
 *   <li>{@link imagindata.Transition#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link imagindata.StateObject#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(StateObject)
	 * @see imagindata.imagindataPackage#getTransition_Start()
	 * @see imagindata.StateObject#getExit
	 * @model opposite="Exit" required="true"
	 * @generated
	 */
	StateObject getStart();

	/**
	 * Sets the value of the '{@link imagindata.Transition#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(StateObject value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link imagindata.StateObject#getEnter <em>Enter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(StateObject)
	 * @see imagindata.imagindataPackage#getTransition_End()
	 * @see imagindata.StateObject#getEnter
	 * @model opposite="Enter" required="true"
	 * @generated
	 */
	StateObject getEnd();

	/**
	 * Sets the value of the '{@link imagindata.Transition#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(StateObject value);

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' attribute.
	 * @see #setSignal(String)
	 * @see imagindata.imagindataPackage#getTransition_Signal()
	 * @model ordered="false"
	 * @generated
	 */
	String getSignal();

	/**
	 * Sets the value of the '{@link imagindata.Transition#getSignal <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' attribute.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(String value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see #setGuard(String)
	 * @see imagindata.imagindataPackage#getTransition_Guard()
	 * @model ordered="false"
	 * @generated
	 */
	String getGuard();

	/**
	 * Sets the value of the '{@link imagindata.Transition#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(String value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see imagindata.imagindataPackage#getTransition_Effect()
	 * @model ordered="false"
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link imagindata.Transition#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imagindata.Region#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' container reference.
	 * @see #setRegion(Region)
	 * @see imagindata.imagindataPackage#getTransition_Region()
	 * @see imagindata.Region#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link imagindata.Transition#getRegion <em>Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' container reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

} // Transition
