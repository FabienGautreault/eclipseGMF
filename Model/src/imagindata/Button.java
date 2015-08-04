/**
 * <copyright>
 * </copyright>
 *
 * $Id: Button.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.Button#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends imagindata.Object {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link imagindata.ButtonDefaultState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see imagindata.ButtonDefaultState
	 * @see #setState(ButtonDefaultState)
	 * @see imagindata.imagindataPackage#getButton_State()
	 * @model
	 * @generated
	 */
	ButtonDefaultState getState();

	/**
	 * Sets the value of the '{@link imagindata.Button#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see imagindata.ButtonDefaultState
	 * @see #getState()
	 * @generated
	 */
	void setState(ButtonDefaultState value);

} // Button
