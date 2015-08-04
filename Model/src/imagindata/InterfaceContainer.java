/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterfaceContainer.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.InterfaceContainer#getDiagrams <em>Diagrams</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getInterfaceContainer()
 * @model
 * @generated
 */
public interface InterfaceContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link imagindata.Diagram}.
	 * It is bidirectional and its opposite is '{@link imagindata.Diagram#getIContainer <em>IContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see imagindata.imagindataPackage#getInterfaceContainer_Diagrams()
	 * @see imagindata.Diagram#getIContainer
	 * @model opposite="IContainer" containment="true"
	 * @generated
	 */
	EList<Diagram> getDiagrams();

} // InterfaceContainer
