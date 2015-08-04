/**
 * <copyright>
 * </copyright>
 *
 * $Id: InitExit.java,v 1.4 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.InitExit#getDiagramName <em>Diagram Name</em>}</li>
 *   <li>{@link imagindata.InitExit#getType <em>Type</em>}</li>
 *   <li>{@link imagindata.InitExit#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getInitExit()
 * @model
 * @generated
 */
public interface InitExit extends StateObject {
	/**
	 * Returns the value of the '<em><b>Diagram Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Name</em>' attribute.
	 * @see #setDiagramName(String)
	 * @see imagindata.imagindataPackage#getInitExit_DiagramName()
	 * @model ordered="false"
	 * @generated
	 */
	String getDiagramName();

	/**
	 * Sets the value of the '{@link imagindata.InitExit#getDiagramName <em>Diagram Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Name</em>' attribute.
	 * @see #getDiagramName()
	 * @generated
	 */
	void setDiagramName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link imagindata.ExitInitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see imagindata.ExitInitType
	 * @see #setType(ExitInitType)
	 * @see imagindata.imagindataPackage#getInitExit_Type()
	 * @model ordered="false"
	 * @generated
	 */
	ExitInitType getType();

	/**
	 * Sets the value of the '{@link imagindata.InitExit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see imagindata.ExitInitType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExitInitType value);

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
	 * @see imagindata.imagindataPackage#getInitExit_Transition()
	 * @model ordered="false"
	 * @generated
	 */
	String getTransition();

	/**
	 * Sets the value of the '{@link imagindata.InitExit#getTransition <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' attribute.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(String value);

} // InitExit
