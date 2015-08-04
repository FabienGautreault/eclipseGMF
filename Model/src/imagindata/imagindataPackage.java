/**
 * <copyright>
 * </copyright>
 *
 * $Id: imagindataPackage.java,v 1.7 2010/09/15 11:07:52 kf288526 Exp $
 */
package imagindata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see imagindata.imagindataFactory
 * @model kind="package"
 * @generated
 */
public interface imagindataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imagindata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://imagindata/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imagindata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	imagindataPackage eINSTANCE = imagindata.impl.imagindataPackageImpl.init();

	/**
	 * The meta object id for the '{@link imagindata.impl.InterfaceContainerImpl <em>Interface Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.InterfaceContainerImpl
	 * @see imagindata.impl.imagindataPackageImpl#getInterfaceContainer()
	 * @generated
	 */
	int INTERFACE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONTAINER__DIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Interface Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link imagindata.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.ProjectImpl
	 * @see imagindata.impl.imagindataPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DIAGRAMS = INTERFACE_CONTAINER__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OBJECTS = INTERFACE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = INTERFACE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imagindata.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.RegionImpl
	 * @see imagindata.impl.imagindataPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 2;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__DIAGRAMS = INTERFACE_CONTAINER__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__DIAGRAM = INTERFACE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__STATE_OBJECTS = INTERFACE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TRANSITIONS = INTERFACE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = INTERFACE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link imagindata.impl.InterruptibleRegionImpl <em>Interruptible Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.InterruptibleRegionImpl
	 * @see imagindata.impl.imagindataPackageImpl#getInterruptibleRegion()
	 * @generated
	 */
	int INTERRUPTIBLE_REGION = 3;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_REGION__DIAGRAMS = REGION__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_REGION__DIAGRAM = REGION__DIAGRAM;

	/**
	 * The feature id for the '<em><b>State Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_REGION__STATE_OBJECTS = REGION__STATE_OBJECTS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_REGION__TRANSITIONS = REGION__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_REGION__NAME = REGION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interrupt State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_REGION__INTERRUPT_STATE = REGION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interruptible Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_REGION_FEATURE_COUNT = REGION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imagindata.impl.StateObjectImpl <em>State Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.StateObjectImpl
	 * @see imagindata.impl.imagindataPackageImpl#getStateObject()
	 * @generated
	 */
	int STATE_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT__REGION = 0;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT__EXIT = 1;

	/**
	 * The feature id for the '<em><b>Enter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT__ENTER = 2;

	/**
	 * The number of structural features of the '<em>State Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link imagindata.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.DiagramImpl
	 * @see imagindata.impl.imagindataPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 4;

	/**
	 * The feature id for the '<em><b>Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__REGION = STATE_OBJECT__REGION;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__EXIT = STATE_OBJECT__EXIT;

	/**
	 * The feature id for the '<em><b>Enter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ENTER = STATE_OBJECT__ENTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = STATE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IContainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ICONTAINER = STATE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__REGIONS = STATE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Histo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__HISTO = STATE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ANCHORS = STATE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = STATE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link imagindata.impl.HistoricImpl <em>Historic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.HistoricImpl
	 * @see imagindata.impl.imagindataPackageImpl#getHistoric()
	 * @generated
	 */
	int HISTORIC = 5;

	/**
	 * The feature id for the '<em><b>Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIC__REGION = STATE_OBJECT__REGION;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIC__EXIT = STATE_OBJECT__EXIT;

	/**
	 * The feature id for the '<em><b>Enter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIC__ENTER = STATE_OBJECT__ENTER;

	/**
	 * The feature id for the '<em><b>Subdiagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIC__SUBDIAGRAM = STATE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Historic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIC_FEATURE_COUNT = STATE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imagindata.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.ObjectImpl
	 * @see imagindata.impl.imagindataPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SIGNAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Stateobject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__STATEOBJECT = 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link imagindata.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.SignalImpl
	 * @see imagindata.impl.imagindataPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link imagindata.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.ButtonImpl
	 * @see imagindata.impl.imagindataPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 8;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PROJECT = OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SIGNAL = OBJECT__SIGNAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Stateobject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STATEOBJECT = OBJECT__STATEOBJECT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STATE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imagindata.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.CheckBoxImpl
	 * @see imagindata.impl.imagindataPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 9;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__PROJECT = OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SIGNAL = OBJECT__SIGNAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Stateobject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__STATEOBJECT = OBJECT__STATEOBJECT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__STATE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imagindata.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.ProgressBarImpl
	 * @see imagindata.impl.imagindataPackageImpl#getProgressBar()
	 * @generated
	 */
	int PROGRESS_BAR = 10;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__PROJECT = OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__SIGNAL = OBJECT__SIGNAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Stateobject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__STATEOBJECT = OBJECT__STATEOBJECT;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__STANDARD = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Progress Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imagindata.impl.ListBoxImpl <em>List Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.ListBoxImpl
	 * @see imagindata.impl.imagindataPackageImpl#getListBox()
	 * @generated
	 */
	int LIST_BOX = 11;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__PROJECT = OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__SIGNAL = OBJECT__SIGNAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Stateobject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__STATEOBJECT = OBJECT__STATEOBJECT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__STATE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imagindata.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.TransitionImpl
	 * @see imagindata.impl.imagindataPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__END = 1;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SIGNAL = 2;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EFFECT = 4;

	/**
	 * The feature id for the '<em><b>Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REGION = 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link imagindata.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.StateImpl
	 * @see imagindata.impl.imagindataPackageImpl#getState()
	 * @generated
	 */
	int STATE = 14;

	/**
	 * The feature id for the '<em><b>Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REGION = STATE_OBJECT__REGION;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT = STATE_OBJECT__EXIT;

	/**
	 * The feature id for the '<em><b>Enter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTER = STATE_OBJECT__ENTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = STATE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TYPE = STATE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Externe Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXTERNE_SIGNAL = STATE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OBJECTS = STATE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = STATE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link imagindata.impl.InitExitImpl <em>Init Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.InitExitImpl
	 * @see imagindata.impl.imagindataPackageImpl#getInitExit()
	 * @generated
	 */
	int INIT_EXIT = 15;

	/**
	 * The feature id for the '<em><b>Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EXIT__REGION = STATE_OBJECT__REGION;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EXIT__EXIT = STATE_OBJECT__EXIT;

	/**
	 * The feature id for the '<em><b>Enter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EXIT__ENTER = STATE_OBJECT__ENTER;

	/**
	 * The feature id for the '<em><b>Diagram Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EXIT__DIAGRAM_NAME = STATE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EXIT__TYPE = STATE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EXIT__TRANSITION = STATE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Init Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EXIT_FEATURE_COUNT = STATE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link imagindata.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.ConditionImpl
	 * @see imagindata.impl.imagindataPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REGION = STATE_OBJECT__REGION;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXIT = STATE_OBJECT__EXIT;

	/**
	 * The feature id for the '<em><b>Enter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ENTER = STATE_OBJECT__ENTER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = STATE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TYPE = STATE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DESCRIPTION = STATE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = STATE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link imagindata.impl.EditableFieldImpl <em>Editable Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.EditableFieldImpl
	 * @see imagindata.impl.imagindataPackageImpl#getEditableField()
	 * @generated
	 */
	int EDITABLE_FIELD = 17;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_FIELD__PROJECT = OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_FIELD__SIGNAL = OBJECT__SIGNAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_FIELD__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Stateobject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_FIELD__STATEOBJECT = OBJECT__STATEOBJECT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_FIELD__STATE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Editable Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_FIELD_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imagindata.impl.AnchorImpl <em>Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.impl.AnchorImpl
	 * @see imagindata.impl.imagindataPackageImpl#getAnchor()
	 * @generated
	 */
	int ANCHOR = 18;

	/**
	 * The feature id for the '<em><b>Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__REGION = STATE_OBJECT__REGION;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__EXIT = STATE_OBJECT__EXIT;

	/**
	 * The feature id for the '<em><b>Enter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__ENTER = STATE_OBJECT__ENTER;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__TRANSITION = STATE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__DIAGRAM = STATE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__TYPE = STATE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FEATURE_COUNT = STATE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link imagindata.ContitionType <em>Contition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.ContitionType
	 * @see imagindata.impl.imagindataPackageImpl#getContitionType()
	 * @generated
	 */
	int CONTITION_TYPE = 19;

	/**
	 * The meta object id for the '{@link imagindata.StateType <em>State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.StateType
	 * @see imagindata.impl.imagindataPackageImpl#getStateType()
	 * @generated
	 */
	int STATE_TYPE = 20;

	/**
	 * The meta object id for the '{@link imagindata.ExitInitType <em>Exit Init Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.ExitInitType
	 * @see imagindata.impl.imagindataPackageImpl#getExitInitType()
	 * @generated
	 */
	int EXIT_INIT_TYPE = 21;

	/**
	 * The meta object id for the '{@link imagindata.ButtonDefaultState <em>Button Default State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.ButtonDefaultState
	 * @see imagindata.impl.imagindataPackageImpl#getButtonDefaultState()
	 * @generated
	 */
	int BUTTON_DEFAULT_STATE = 22;

	/**
	 * The meta object id for the '{@link imagindata.CheckBoxDefaultState <em>Check Box Default State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.CheckBoxDefaultState
	 * @see imagindata.impl.imagindataPackageImpl#getCheckBoxDefaultState()
	 * @generated
	 */
	int CHECK_BOX_DEFAULT_STATE = 23;

	/**
	 * The meta object id for the '{@link imagindata.ListBoxDefaultState <em>List Box Default State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.ListBoxDefaultState
	 * @see imagindata.impl.imagindataPackageImpl#getListBoxDefaultState()
	 * @generated
	 */
	int LIST_BOX_DEFAULT_STATE = 24;

	/**
	 * The meta object id for the '{@link imagindata.EditableFieldDefaultState <em>Editable Field Default State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.EditableFieldDefaultState
	 * @see imagindata.impl.imagindataPackageImpl#getEditableFieldDefaultState()
	 * @generated
	 */
	int EDITABLE_FIELD_DEFAULT_STATE = 25;


	/**
	 * The meta object id for the '{@link imagindata.AnchorType <em>Anchor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imagindata.AnchorType
	 * @see imagindata.impl.imagindataPackageImpl#getAnchorType()
	 * @generated
	 */
	int ANCHOR_TYPE = 26;


	/**
	 * Returns the meta object for class '{@link imagindata.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see imagindata.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link imagindata.Project#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see imagindata.Project#getObjects()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Objects();

	/**
	 * Returns the meta object for class '{@link imagindata.InterfaceContainer <em>Interface Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Container</em>'.
	 * @see imagindata.InterfaceContainer
	 * @generated
	 */
	EClass getInterfaceContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link imagindata.InterfaceContainer#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see imagindata.InterfaceContainer#getDiagrams()
	 * @see #getInterfaceContainer()
	 * @generated
	 */
	EReference getInterfaceContainer_Diagrams();

	/**
	 * Returns the meta object for class '{@link imagindata.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see imagindata.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the container reference '{@link imagindata.Region#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see imagindata.Region#getDiagram()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Diagram();

	/**
	 * Returns the meta object for the containment reference list '{@link imagindata.Region#getStateObjects <em>State Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Objects</em>'.
	 * @see imagindata.Region#getStateObjects()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_StateObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link imagindata.Region#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see imagindata.Region#getTransitions()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Transitions();

	/**
	 * Returns the meta object for class '{@link imagindata.InterruptibleRegion <em>Interruptible Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interruptible Region</em>'.
	 * @see imagindata.InterruptibleRegion
	 * @generated
	 */
	EClass getInterruptibleRegion();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.InterruptibleRegion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see imagindata.InterruptibleRegion#getName()
	 * @see #getInterruptibleRegion()
	 * @generated
	 */
	EAttribute getInterruptibleRegion_Name();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.InterruptibleRegion#getInterruptState <em>Interrupt State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interrupt State</em>'.
	 * @see imagindata.InterruptibleRegion#getInterruptState()
	 * @see #getInterruptibleRegion()
	 * @generated
	 */
	EAttribute getInterruptibleRegion_InterruptState();

	/**
	 * Returns the meta object for class '{@link imagindata.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see imagindata.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see imagindata.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the container reference '{@link imagindata.Diagram#getIContainer <em>IContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>IContainer</em>'.
	 * @see imagindata.Diagram#getIContainer()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_IContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link imagindata.Diagram#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see imagindata.Diagram#getRegions()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Regions();

	/**
	 * Returns the meta object for the containment reference '{@link imagindata.Diagram#getHisto <em>Histo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Histo</em>'.
	 * @see imagindata.Diagram#getHisto()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Histo();

	/**
	 * Returns the meta object for the containment reference list '{@link imagindata.Diagram#getAnchors <em>Anchors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anchors</em>'.
	 * @see imagindata.Diagram#getAnchors()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Anchors();

	/**
	 * Returns the meta object for class '{@link imagindata.Historic <em>Historic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historic</em>'.
	 * @see imagindata.Historic
	 * @generated
	 */
	EClass getHistoric();

	/**
	 * Returns the meta object for the container reference '{@link imagindata.Historic#getSubdiagram <em>Subdiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Subdiagram</em>'.
	 * @see imagindata.Historic#getSubdiagram()
	 * @see #getHistoric()
	 * @generated
	 */
	EReference getHistoric_Subdiagram();

	/**
	 * Returns the meta object for class '{@link imagindata.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see imagindata.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the container reference '{@link imagindata.Object#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see imagindata.Object#getProject()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Project();

	/**
	 * Returns the meta object for the reference list '{@link imagindata.Object#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signal</em>'.
	 * @see imagindata.Object#getSignal()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Signal();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see imagindata.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for the container reference '{@link imagindata.Object#getStateobject <em>Stateobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stateobject</em>'.
	 * @see imagindata.Object#getStateobject()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Stateobject();

	/**
	 * Returns the meta object for class '{@link imagindata.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see imagindata.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Signal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see imagindata.Signal#getName()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Name();

	/**
	 * Returns the meta object for the reference '{@link imagindata.Signal#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see imagindata.Signal#getObject()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_Object();

	/**
	 * Returns the meta object for class '{@link imagindata.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see imagindata.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Button#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see imagindata.Button#getState()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_State();

	/**
	 * Returns the meta object for class '{@link imagindata.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see imagindata.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.CheckBox#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see imagindata.CheckBox#getState()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_State();

	/**
	 * Returns the meta object for class '{@link imagindata.ProgressBar <em>Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Bar</em>'.
	 * @see imagindata.ProgressBar
	 * @generated
	 */
	EClass getProgressBar();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.ProgressBar#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard</em>'.
	 * @see imagindata.ProgressBar#getStandard()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_Standard();

	/**
	 * Returns the meta object for class '{@link imagindata.ListBox <em>List Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Box</em>'.
	 * @see imagindata.ListBox
	 * @generated
	 */
	EClass getListBox();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.ListBox#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see imagindata.ListBox#getState()
	 * @see #getListBox()
	 * @generated
	 */
	EAttribute getListBox_State();

	/**
	 * Returns the meta object for class '{@link imagindata.StateObject <em>State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Object</em>'.
	 * @see imagindata.StateObject
	 * @generated
	 */
	EClass getStateObject();

	/**
	 * Returns the meta object for the container reference '{@link imagindata.StateObject#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Region</em>'.
	 * @see imagindata.StateObject#getRegion()
	 * @see #getStateObject()
	 * @generated
	 */
	EReference getStateObject_Region();

	/**
	 * Returns the meta object for the reference list '{@link imagindata.StateObject#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exit</em>'.
	 * @see imagindata.StateObject#getExit()
	 * @see #getStateObject()
	 * @generated
	 */
	EReference getStateObject_Exit();

	/**
	 * Returns the meta object for the reference list '{@link imagindata.StateObject#getEnter <em>Enter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enter</em>'.
	 * @see imagindata.StateObject#getEnter()
	 * @see #getStateObject()
	 * @generated
	 */
	EReference getStateObject_Enter();

	/**
	 * Returns the meta object for class '{@link imagindata.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see imagindata.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link imagindata.Transition#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see imagindata.Transition#getStart()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Start();

	/**
	 * Returns the meta object for the reference '{@link imagindata.Transition#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see imagindata.Transition#getEnd()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_End();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Transition#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal</em>'.
	 * @see imagindata.Transition#getSignal()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Signal();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see imagindata.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Guard();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Transition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see imagindata.Transition#getEffect()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Effect();

	/**
	 * Returns the meta object for the container reference '{@link imagindata.Transition#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Region</em>'.
	 * @see imagindata.Transition#getRegion()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Region();

	/**
	 * Returns the meta object for class '{@link imagindata.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see imagindata.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see imagindata.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.State#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see imagindata.State#getType()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Type();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.State#getExterneSignal <em>Externe Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Externe Signal</em>'.
	 * @see imagindata.State#getExterneSignal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_ExterneSignal();

	/**
	 * Returns the meta object for the containment reference list '{@link imagindata.State#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see imagindata.State#getObjects()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Objects();

	/**
	 * Returns the meta object for class '{@link imagindata.InitExit <em>Init Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Exit</em>'.
	 * @see imagindata.InitExit
	 * @generated
	 */
	EClass getInitExit();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.InitExit#getDiagramName <em>Diagram Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram Name</em>'.
	 * @see imagindata.InitExit#getDiagramName()
	 * @see #getInitExit()
	 * @generated
	 */
	EAttribute getInitExit_DiagramName();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.InitExit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see imagindata.InitExit#getType()
	 * @see #getInitExit()
	 * @generated
	 */
	EAttribute getInitExit_Type();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.InitExit#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition</em>'.
	 * @see imagindata.InitExit#getTransition()
	 * @see #getInitExit()
	 * @generated
	 */
	EAttribute getInitExit_Transition();

	/**
	 * Returns the meta object for class '{@link imagindata.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see imagindata.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Condition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see imagindata.Condition#getCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Condition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see imagindata.Condition#getType()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Type();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Condition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see imagindata.Condition#getDescription()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Description();

	/**
	 * Returns the meta object for class '{@link imagindata.EditableField <em>Editable Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editable Field</em>'.
	 * @see imagindata.EditableField
	 * @generated
	 */
	EClass getEditableField();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.EditableField#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see imagindata.EditableField#getState()
	 * @see #getEditableField()
	 * @generated
	 */
	EAttribute getEditableField_State();

	/**
	 * Returns the meta object for class '{@link imagindata.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor</em>'.
	 * @see imagindata.Anchor
	 * @generated
	 */
	EClass getAnchor();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Anchor#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition</em>'.
	 * @see imagindata.Anchor#getTransition()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Transition();

	/**
	 * Returns the meta object for the container reference '{@link imagindata.Anchor#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see imagindata.Anchor#getDiagram()
	 * @see #getAnchor()
	 * @generated
	 */
	EReference getAnchor_Diagram();

	/**
	 * Returns the meta object for the attribute '{@link imagindata.Anchor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see imagindata.Anchor#getType()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Type();

	/**
	 * Returns the meta object for enum '{@link imagindata.ContitionType <em>Contition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contition Type</em>'.
	 * @see imagindata.ContitionType
	 * @generated
	 */
	EEnum getContitionType();

	/**
	 * Returns the meta object for enum '{@link imagindata.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Type</em>'.
	 * @see imagindata.StateType
	 * @generated
	 */
	EEnum getStateType();

	/**
	 * Returns the meta object for enum '{@link imagindata.ExitInitType <em>Exit Init Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exit Init Type</em>'.
	 * @see imagindata.ExitInitType
	 * @generated
	 */
	EEnum getExitInitType();

	/**
	 * Returns the meta object for enum '{@link imagindata.ButtonDefaultState <em>Button Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Button Default State</em>'.
	 * @see imagindata.ButtonDefaultState
	 * @generated
	 */
	EEnum getButtonDefaultState();

	/**
	 * Returns the meta object for enum '{@link imagindata.CheckBoxDefaultState <em>Check Box Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Check Box Default State</em>'.
	 * @see imagindata.CheckBoxDefaultState
	 * @generated
	 */
	EEnum getCheckBoxDefaultState();

	/**
	 * Returns the meta object for enum '{@link imagindata.ListBoxDefaultState <em>List Box Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Box Default State</em>'.
	 * @see imagindata.ListBoxDefaultState
	 * @generated
	 */
	EEnum getListBoxDefaultState();

	/**
	 * Returns the meta object for enum '{@link imagindata.EditableFieldDefaultState <em>Editable Field Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Editable Field Default State</em>'.
	 * @see imagindata.EditableFieldDefaultState
	 * @generated
	 */
	EEnum getEditableFieldDefaultState();

	/**
	 * Returns the meta object for enum '{@link imagindata.AnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Anchor Type</em>'.
	 * @see imagindata.AnchorType
	 * @generated
	 */
	EEnum getAnchorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	imagindataFactory getimagindataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link imagindata.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.ProjectImpl
		 * @see imagindata.impl.imagindataPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__OBJECTS = eINSTANCE.getProject_Objects();

		/**
		 * The meta object literal for the '{@link imagindata.impl.InterfaceContainerImpl <em>Interface Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.InterfaceContainerImpl
		 * @see imagindata.impl.imagindataPackageImpl#getInterfaceContainer()
		 * @generated
		 */
		EClass INTERFACE_CONTAINER = eINSTANCE.getInterfaceContainer();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONTAINER__DIAGRAMS = eINSTANCE.getInterfaceContainer_Diagrams();

		/**
		 * The meta object literal for the '{@link imagindata.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.RegionImpl
		 * @see imagindata.impl.imagindataPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__DIAGRAM = eINSTANCE.getRegion_Diagram();

		/**
		 * The meta object literal for the '<em><b>State Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__STATE_OBJECTS = eINSTANCE.getRegion_StateObjects();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TRANSITIONS = eINSTANCE.getRegion_Transitions();

		/**
		 * The meta object literal for the '{@link imagindata.impl.InterruptibleRegionImpl <em>Interruptible Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.InterruptibleRegionImpl
		 * @see imagindata.impl.imagindataPackageImpl#getInterruptibleRegion()
		 * @generated
		 */
		EClass INTERRUPTIBLE_REGION = eINSTANCE.getInterruptibleRegion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPTIBLE_REGION__NAME = eINSTANCE.getInterruptibleRegion_Name();

		/**
		 * The meta object literal for the '<em><b>Interrupt State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPTIBLE_REGION__INTERRUPT_STATE = eINSTANCE.getInterruptibleRegion_InterruptState();

		/**
		 * The meta object literal for the '{@link imagindata.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.DiagramImpl
		 * @see imagindata.impl.imagindataPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>IContainer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__ICONTAINER = eINSTANCE.getDiagram_IContainer();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__REGIONS = eINSTANCE.getDiagram_Regions();

		/**
		 * The meta object literal for the '<em><b>Histo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__HISTO = eINSTANCE.getDiagram_Histo();

		/**
		 * The meta object literal for the '<em><b>Anchors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__ANCHORS = eINSTANCE.getDiagram_Anchors();

		/**
		 * The meta object literal for the '{@link imagindata.impl.HistoricImpl <em>Historic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.HistoricImpl
		 * @see imagindata.impl.imagindataPackageImpl#getHistoric()
		 * @generated
		 */
		EClass HISTORIC = eINSTANCE.getHistoric();

		/**
		 * The meta object literal for the '<em><b>Subdiagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORIC__SUBDIAGRAM = eINSTANCE.getHistoric_Subdiagram();

		/**
		 * The meta object literal for the '{@link imagindata.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.ObjectImpl
		 * @see imagindata.impl.imagindataPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__PROJECT = eINSTANCE.getObject_Project();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SIGNAL = eINSTANCE.getObject_Signal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '<em><b>Stateobject</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__STATEOBJECT = eINSTANCE.getObject_Stateobject();

		/**
		 * The meta object literal for the '{@link imagindata.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.SignalImpl
		 * @see imagindata.impl.imagindataPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__OBJECT = eINSTANCE.getSignal_Object();

		/**
		 * The meta object literal for the '{@link imagindata.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.ButtonImpl
		 * @see imagindata.impl.imagindataPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__STATE = eINSTANCE.getButton_State();

		/**
		 * The meta object literal for the '{@link imagindata.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.CheckBoxImpl
		 * @see imagindata.impl.imagindataPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__STATE = eINSTANCE.getCheckBox_State();

		/**
		 * The meta object literal for the '{@link imagindata.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.ProgressBarImpl
		 * @see imagindata.impl.imagindataPackageImpl#getProgressBar()
		 * @generated
		 */
		EClass PROGRESS_BAR = eINSTANCE.getProgressBar();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__STANDARD = eINSTANCE.getProgressBar_Standard();

		/**
		 * The meta object literal for the '{@link imagindata.impl.ListBoxImpl <em>List Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.ListBoxImpl
		 * @see imagindata.impl.imagindataPackageImpl#getListBox()
		 * @generated
		 */
		EClass LIST_BOX = eINSTANCE.getListBox();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_BOX__STATE = eINSTANCE.getListBox_State();

		/**
		 * The meta object literal for the '{@link imagindata.impl.StateObjectImpl <em>State Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.StateObjectImpl
		 * @see imagindata.impl.imagindataPackageImpl#getStateObject()
		 * @generated
		 */
		EClass STATE_OBJECT = eINSTANCE.getStateObject();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_OBJECT__REGION = eINSTANCE.getStateObject_Region();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_OBJECT__EXIT = eINSTANCE.getStateObject_Exit();

		/**
		 * The meta object literal for the '<em><b>Enter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_OBJECT__ENTER = eINSTANCE.getStateObject_Enter();

		/**
		 * The meta object literal for the '{@link imagindata.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.TransitionImpl
		 * @see imagindata.impl.imagindataPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__START = eINSTANCE.getTransition_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__END = eINSTANCE.getTransition_End();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__SIGNAL = eINSTANCE.getTransition_Signal();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EFFECT = eINSTANCE.getTransition_Effect();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__REGION = eINSTANCE.getTransition_Region();

		/**
		 * The meta object literal for the '{@link imagindata.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.StateImpl
		 * @see imagindata.impl.imagindataPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TYPE = eINSTANCE.getState_Type();

		/**
		 * The meta object literal for the '<em><b>Externe Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__EXTERNE_SIGNAL = eINSTANCE.getState_ExterneSignal();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OBJECTS = eINSTANCE.getState_Objects();

		/**
		 * The meta object literal for the '{@link imagindata.impl.InitExitImpl <em>Init Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.InitExitImpl
		 * @see imagindata.impl.imagindataPackageImpl#getInitExit()
		 * @generated
		 */
		EClass INIT_EXIT = eINSTANCE.getInitExit();

		/**
		 * The meta object literal for the '<em><b>Diagram Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_EXIT__DIAGRAM_NAME = eINSTANCE.getInitExit_DiagramName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_EXIT__TYPE = eINSTANCE.getInitExit_Type();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_EXIT__TRANSITION = eINSTANCE.getInitExit_Transition();

		/**
		 * The meta object literal for the '{@link imagindata.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.ConditionImpl
		 * @see imagindata.impl.imagindataPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__TYPE = eINSTANCE.getCondition_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__DESCRIPTION = eINSTANCE.getCondition_Description();

		/**
		 * The meta object literal for the '{@link imagindata.impl.EditableFieldImpl <em>Editable Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.EditableFieldImpl
		 * @see imagindata.impl.imagindataPackageImpl#getEditableField()
		 * @generated
		 */
		EClass EDITABLE_FIELD = eINSTANCE.getEditableField();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITABLE_FIELD__STATE = eINSTANCE.getEditableField_State();

		/**
		 * The meta object literal for the '{@link imagindata.impl.AnchorImpl <em>Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.impl.AnchorImpl
		 * @see imagindata.impl.imagindataPackageImpl#getAnchor()
		 * @generated
		 */
		EClass ANCHOR = eINSTANCE.getAnchor();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__TRANSITION = eINSTANCE.getAnchor_Transition();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCHOR__DIAGRAM = eINSTANCE.getAnchor_Diagram();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__TYPE = eINSTANCE.getAnchor_Type();

		/**
		 * The meta object literal for the '{@link imagindata.ContitionType <em>Contition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.ContitionType
		 * @see imagindata.impl.imagindataPackageImpl#getContitionType()
		 * @generated
		 */
		EEnum CONTITION_TYPE = eINSTANCE.getContitionType();

		/**
		 * The meta object literal for the '{@link imagindata.StateType <em>State Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.StateType
		 * @see imagindata.impl.imagindataPackageImpl#getStateType()
		 * @generated
		 */
		EEnum STATE_TYPE = eINSTANCE.getStateType();

		/**
		 * The meta object literal for the '{@link imagindata.ExitInitType <em>Exit Init Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.ExitInitType
		 * @see imagindata.impl.imagindataPackageImpl#getExitInitType()
		 * @generated
		 */
		EEnum EXIT_INIT_TYPE = eINSTANCE.getExitInitType();

		/**
		 * The meta object literal for the '{@link imagindata.ButtonDefaultState <em>Button Default State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.ButtonDefaultState
		 * @see imagindata.impl.imagindataPackageImpl#getButtonDefaultState()
		 * @generated
		 */
		EEnum BUTTON_DEFAULT_STATE = eINSTANCE.getButtonDefaultState();

		/**
		 * The meta object literal for the '{@link imagindata.CheckBoxDefaultState <em>Check Box Default State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.CheckBoxDefaultState
		 * @see imagindata.impl.imagindataPackageImpl#getCheckBoxDefaultState()
		 * @generated
		 */
		EEnum CHECK_BOX_DEFAULT_STATE = eINSTANCE.getCheckBoxDefaultState();

		/**
		 * The meta object literal for the '{@link imagindata.ListBoxDefaultState <em>List Box Default State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.ListBoxDefaultState
		 * @see imagindata.impl.imagindataPackageImpl#getListBoxDefaultState()
		 * @generated
		 */
		EEnum LIST_BOX_DEFAULT_STATE = eINSTANCE.getListBoxDefaultState();

		/**
		 * The meta object literal for the '{@link imagindata.EditableFieldDefaultState <em>Editable Field Default State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.EditableFieldDefaultState
		 * @see imagindata.impl.imagindataPackageImpl#getEditableFieldDefaultState()
		 * @generated
		 */
		EEnum EDITABLE_FIELD_DEFAULT_STATE = eINSTANCE.getEditableFieldDefaultState();

		/**
		 * The meta object literal for the '{@link imagindata.AnchorType <em>Anchor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imagindata.AnchorType
		 * @see imagindata.impl.imagindataPackageImpl#getAnchorType()
		 * @generated
		 */
		EEnum ANCHOR_TYPE = eINSTANCE.getAnchorType();

	}

} //imagindataPackage
