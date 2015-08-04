/**
 * <copyright>
 * </copyright>
 *
 * $Id: Object.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.Object#getProject <em>Project</em>}</li>
 *   <li>{@link imagindata.Object#getSignal <em>Signal</em>}</li>
 *   <li>{@link imagindata.Object#getName <em>Name</em>}</li>
 *   <li>{@link imagindata.Object#getStateobject <em>Stateobject</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imagindata.Project#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see imagindata.imagindataPackage#getObject_Project()
	 * @see imagindata.Project#getObjects
	 * @model opposite="objects" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link imagindata.Object#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference list.
	 * The list contents are of type {@link imagindata.Signal}.
	 * It is bidirectional and its opposite is '{@link imagindata.Signal#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference list.
	 * @see imagindata.imagindataPackage#getObject_Signal()
	 * @see imagindata.Signal#getObject
	 * @model opposite="object"
	 * @generated
	 */
	EList<Signal> getSignal();

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
	 * @see imagindata.imagindataPackage#getObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link imagindata.Object#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stateobject</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imagindata.State#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateobject</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateobject</em>' container reference.
	 * @see #setStateobject(State)
	 * @see imagindata.imagindataPackage#getObject_Stateobject()
	 * @see imagindata.State#getObjects
	 * @model opposite="objects" required="true" transient="false"
	 * @generated
	 */
	State getStateobject();

	/**
	 * Sets the value of the '{@link imagindata.Object#getStateobject <em>Stateobject</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateobject</em>' container reference.
	 * @see #getStateobject()
	 * @generated
	 */
	void setStateobject(State value);

} // Object
