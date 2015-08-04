/**
 * <copyright>
 * </copyright>
 *
 * $Id: Signal.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.Signal#getName <em>Name</em>}</li>
 *   <li>{@link imagindata.Signal#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends EObject {
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
	 * @see imagindata.imagindataPackage#getSignal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link imagindata.Signal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link imagindata.Object#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(imagindata.Object)
	 * @see imagindata.imagindataPackage#getSignal_Object()
	 * @see imagindata.Object#getSignal
	 * @model opposite="Signal" required="true"
	 * @generated
	 */
	imagindata.Object getObject();

	/**
	 * Sets the value of the '{@link imagindata.Signal#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(imagindata.Object value);

} // Signal
