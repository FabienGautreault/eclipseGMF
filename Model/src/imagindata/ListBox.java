/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListBox.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.ListBox#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getListBox()
 * @model
 * @generated
 */
public interface ListBox extends imagindata.Object {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link imagindata.ListBoxDefaultState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see imagindata.ListBoxDefaultState
	 * @see #setState(ListBoxDefaultState)
	 * @see imagindata.imagindataPackage#getListBox_State()
	 * @model
	 * @generated
	 */
	ListBoxDefaultState getState();

	/**
	 * Sets the value of the '{@link imagindata.ListBox#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see imagindata.ListBoxDefaultState
	 * @see #getState()
	 * @generated
	 */
	void setState(ListBoxDefaultState value);

} // ListBox
