/**
 * <copyright>
 * </copyright>
 *
 * $Id: EditableField.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editable Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.EditableField#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getEditableField()
 * @model
 * @generated
 */
public interface EditableField extends imagindata.Object {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link imagindata.EditableFieldDefaultState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see imagindata.EditableFieldDefaultState
	 * @see #setState(EditableFieldDefaultState)
	 * @see imagindata.imagindataPackage#getEditableField_State()
	 * @model
	 * @generated
	 */
	EditableFieldDefaultState getState();

	/**
	 * Sets the value of the '{@link imagindata.EditableField#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see imagindata.EditableFieldDefaultState
	 * @see #getState()
	 * @generated
	 */
	void setState(EditableFieldDefaultState value);

} // EditableField
