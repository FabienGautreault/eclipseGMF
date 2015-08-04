/**
 * <copyright>
 * </copyright>
 *
 * $Id: Anchor.java,v 1.2 2010/09/15 11:07:52 kf288526 Exp $
 */
package imagindata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.Anchor#getTransition <em>Transition</em>}</li>
 *   <li>{@link imagindata.Anchor#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link imagindata.Anchor#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getAnchor()
 * @model
 * @generated
 */
public interface Anchor extends StateObject {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' attribute.
	 * @see #setTransition(String)
	 * @see imagindata.imagindataPackage#getAnchor_Transition()
	 * @model
	 * @generated
	 */
	String getTransition();

	/**
	 * Sets the value of the '{@link imagindata.Anchor#getTransition <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' attribute.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(String value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imagindata.Diagram#getAnchors <em>Anchors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(Diagram)
	 * @see imagindata.imagindataPackage#getAnchor_Diagram()
	 * @see imagindata.Diagram#getAnchors
	 * @model opposite="Anchors" required="true" transient="false"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link imagindata.Anchor#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link imagindata.AnchorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see imagindata.AnchorType
	 * @see #setType(AnchorType)
	 * @see imagindata.imagindataPackage#getAnchor_Type()
	 * @model
	 * @generated
	 */
	AnchorType getType();

	/**
	 * Sets the value of the '{@link imagindata.Anchor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see imagindata.AnchorType
	 * @see #getType()
	 * @generated
	 */
	void setType(AnchorType value);

} // Anchor
