/**
 * <copyright>
 * </copyright>
 *
 * $Id: CheckBox.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.CheckBox#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getCheckBox()
 * @model
 * @generated
 */
public interface CheckBox extends imagindata.Object {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link imagindata.CheckBoxDefaultState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see imagindata.CheckBoxDefaultState
	 * @see #setState(CheckBoxDefaultState)
	 * @see imagindata.imagindataPackage#getCheckBox_State()
	 * @model
	 * @generated
	 */
	CheckBoxDefaultState getState();

	/**
	 * Sets the value of the '{@link imagindata.CheckBox#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see imagindata.CheckBoxDefaultState
	 * @see #getState()
	 * @generated
	 */
	void setState(CheckBoxDefaultState value);

} // CheckBox
