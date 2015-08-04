/**
 * <copyright>
 * </copyright>
 *
 * $Id: Historic.java,v 1.5 2010/07/27 13:14:40 kf288526 Exp $
 */
package imagindata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.Historic#getSubdiagram <em>Subdiagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getHistoric()
 * @model
 * @generated
 */
public interface Historic extends StateObject {
	/**
	 * Returns the value of the '<em><b>Subdiagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imagindata.Diagram#getHisto <em>Histo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subdiagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdiagram</em>' container reference.
	 * @see #setSubdiagram(Diagram)
	 * @see imagindata.imagindataPackage#getHistoric_Subdiagram()
	 * @see imagindata.Diagram#getHisto
	 * @model opposite="histo" required="true" transient="false"
	 * @generated
	 */
	Diagram getSubdiagram();

	/**
	 * Sets the value of the '{@link imagindata.Historic#getSubdiagram <em>Subdiagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdiagram</em>' container reference.
	 * @see #getSubdiagram()
	 * @generated
	 */
	void setSubdiagram(Diagram value);

} // Historic
