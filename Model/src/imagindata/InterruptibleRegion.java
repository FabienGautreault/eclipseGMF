/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterruptibleRegion.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interruptible Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.InterruptibleRegion#getName <em>Name</em>}</li>
 *   <li>{@link imagindata.InterruptibleRegion#getInterruptState <em>Interrupt State</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getInterruptibleRegion()
 * @model
 * @generated
 */
public interface InterruptibleRegion extends Region {
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
	 * @see imagindata.imagindataPackage#getInterruptibleRegion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link imagindata.InterruptibleRegion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interrupt State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupt State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupt State</em>' attribute.
	 * @see #setInterruptState(String)
	 * @see imagindata.imagindataPackage#getInterruptibleRegion_InterruptState()
	 * @model
	 * @generated
	 */
	String getInterruptState();

	/**
	 * Sets the value of the '{@link imagindata.InterruptibleRegion#getInterruptState <em>Interrupt State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupt State</em>' attribute.
	 * @see #getInterruptState()
	 * @generated
	 */
	void setInterruptState(String value);

} // InterruptibleRegion
