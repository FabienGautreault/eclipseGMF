/**
 * <copyright>
 * </copyright>
 *
 * $Id: Diagram.java,v 1.4 2010/09/14 08:23:54 kf288526 Exp $
 */
package imagindata;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imagindata.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link imagindata.Diagram#getIContainer <em>IContainer</em>}</li>
 *   <li>{@link imagindata.Diagram#getRegions <em>Regions</em>}</li>
 *   <li>{@link imagindata.Diagram#getHisto <em>Histo</em>}</li>
 *   <li>{@link imagindata.Diagram#getAnchors <em>Anchors</em>}</li>
 * </ul>
 * </p>
 *
 * @see imagindata.imagindataPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends StateObject {
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
	 * @see imagindata.imagindataPackage#getDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link imagindata.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>IContainer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imagindata.InterfaceContainer#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IContainer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IContainer</em>' container reference.
	 * @see #setIContainer(InterfaceContainer)
	 * @see imagindata.imagindataPackage#getDiagram_IContainer()
	 * @see imagindata.InterfaceContainer#getDiagrams
	 * @model opposite="diagrams" required="true" transient="false"
	 * @generated
	 */
	InterfaceContainer getIContainer();

	/**
	 * Sets the value of the '{@link imagindata.Diagram#getIContainer <em>IContainer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IContainer</em>' container reference.
	 * @see #getIContainer()
	 * @generated
	 */
	void setIContainer(InterfaceContainer value);

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link imagindata.Region}.
	 * It is bidirectional and its opposite is '{@link imagindata.Region#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see imagindata.imagindataPackage#getDiagram_Regions()
	 * @see imagindata.Region#getDiagram
	 * @model opposite="diagram" containment="true" required="true"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * Returns the value of the '<em><b>Histo</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link imagindata.Historic#getSubdiagram <em>Subdiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Histo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Histo</em>' containment reference.
	 * @see #setHisto(Historic)
	 * @see imagindata.imagindataPackage#getDiagram_Histo()
	 * @see imagindata.Historic#getSubdiagram
	 * @model opposite="Subdiagram" containment="true"
	 * @generated
	 */
	Historic getHisto();

	/**
	 * Sets the value of the '{@link imagindata.Diagram#getHisto <em>Histo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Histo</em>' containment reference.
	 * @see #getHisto()
	 * @generated
	 */
	void setHisto(Historic value);

	/**
	 * Returns the value of the '<em><b>Anchors</b></em>' containment reference list.
	 * The list contents are of type {@link imagindata.Anchor}.
	 * It is bidirectional and its opposite is '{@link imagindata.Anchor#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchors</em>' containment reference list.
	 * @see imagindata.imagindataPackage#getDiagram_Anchors()
	 * @see imagindata.Anchor#getDiagram
	 * @model opposite="Diagram" containment="true"
	 * @generated
	 */
	EList<Anchor> getAnchors();

} // Diagram
