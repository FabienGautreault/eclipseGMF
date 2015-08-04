/**
 * <copyright>
 * </copyright>
 *
 * $Id: Project.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.Project#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends InterfaceContainer {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link imagindata.Object}.
	 * It is bidirectional and its opposite is '{@link imagindata.Object#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see imagindata.imagindataPackage#getProject_Objects()
	 * @see imagindata.Object#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<imagindata.Object> getObjects();

} // Project
