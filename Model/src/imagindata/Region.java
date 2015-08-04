/**
 * <copyright>
 * </copyright>
 *
 * $Id: Region.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.Region#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link imagindata.Region#getStateObjects <em>State Objects</em>}</li>
 *   <li>{@link imagindata.Region#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends InterfaceContainer {
	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imagindata.Diagram#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(Diagram)
	 * @see imagindata.imagindataPackage#getRegion_Diagram()
	 * @see imagindata.Diagram#getRegions
	 * @model opposite="regions" required="true" transient="false"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link imagindata.Region#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>State Objects</b></em>' containment reference list.
	 * The list contents are of type {@link imagindata.StateObject}.
	 * It is bidirectional and its opposite is '{@link imagindata.StateObject#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Objects</em>' containment reference list.
	 * @see imagindata.imagindataPackage#getRegion_StateObjects()
	 * @see imagindata.StateObject#getRegion
	 * @model opposite="region" containment="true"
	 * @generated
	 */
	EList<StateObject> getStateObjects();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link imagindata.Transition}.
	 * It is bidirectional and its opposite is '{@link imagindata.Transition#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see imagindata.imagindataPackage#getRegion_Transitions()
	 * @see imagindata.Transition#getRegion
	 * @model opposite="region" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // Region
