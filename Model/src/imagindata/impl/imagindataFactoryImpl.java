/**
 * <copyright>
 * </copyright>
 *
 * $Id: imagindataFactoryImpl.java,v 1.5 2010/09/15 11:07:52 kf288526 Exp $
 */
package imagindata.impl;

import imagindata.Anchor;
import imagindata.AnchorType;
import imagindata.Button;
import imagindata.ButtonDefaultState;
import imagindata.CheckBox;
import imagindata.CheckBoxDefaultState;
import imagindata.Condition;
import imagindata.ContitionType;
import imagindata.Diagram;
import imagindata.EditableField;
import imagindata.EditableFieldDefaultState;
import imagindata.ExitInitType;
import imagindata.Historic;
import imagindata.InitExit;
import imagindata.InterfaceContainer;
import imagindata.InterruptibleRegion;
import imagindata.ListBox;
import imagindata.ListBoxDefaultState;
import imagindata.ProgressBar;
import imagindata.Project;
import imagindata.Region;
import imagindata.Signal;
import imagindata.State;
import imagindata.StateObject;
import imagindata.StateType;
import imagindata.Transition;
import imagindata.imagindataFactory;
import imagindata.imagindataPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class imagindataFactoryImpl extends EFactoryImpl implements imagindataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static imagindataFactory init() {
		try {
			imagindataFactory theimagindataFactory = (imagindataFactory)EPackage.Registry.INSTANCE.getEFactory("http://imagindata/1.0"); 
			if (theimagindataFactory != null) {
				return theimagindataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new imagindataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public imagindataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case imagindataPackage.PROJECT: return createProject();
			case imagindataPackage.INTERFACE_CONTAINER: return createInterfaceContainer();
			case imagindataPackage.REGION: return createRegion();
			case imagindataPackage.INTERRUPTIBLE_REGION: return createInterruptibleRegion();
			case imagindataPackage.DIAGRAM: return createDiagram();
			case imagindataPackage.HISTORIC: return createHistoric();
			case imagindataPackage.OBJECT: return createObject();
			case imagindataPackage.SIGNAL: return createSignal();
			case imagindataPackage.BUTTON: return createButton();
			case imagindataPackage.CHECK_BOX: return createCheckBox();
			case imagindataPackage.PROGRESS_BAR: return createProgressBar();
			case imagindataPackage.LIST_BOX: return createListBox();
			case imagindataPackage.STATE_OBJECT: return createStateObject();
			case imagindataPackage.TRANSITION: return createTransition();
			case imagindataPackage.STATE: return createState();
			case imagindataPackage.INIT_EXIT: return createInitExit();
			case imagindataPackage.CONDITION: return createCondition();
			case imagindataPackage.EDITABLE_FIELD: return createEditableField();
			case imagindataPackage.ANCHOR: return createAnchor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case imagindataPackage.CONTITION_TYPE:
				return createContitionTypeFromString(eDataType, initialValue);
			case imagindataPackage.STATE_TYPE:
				return createStateTypeFromString(eDataType, initialValue);
			case imagindataPackage.EXIT_INIT_TYPE:
				return createExitInitTypeFromString(eDataType, initialValue);
			case imagindataPackage.BUTTON_DEFAULT_STATE:
				return createButtonDefaultStateFromString(eDataType, initialValue);
			case imagindataPackage.CHECK_BOX_DEFAULT_STATE:
				return createCheckBoxDefaultStateFromString(eDataType, initialValue);
			case imagindataPackage.LIST_BOX_DEFAULT_STATE:
				return createListBoxDefaultStateFromString(eDataType, initialValue);
			case imagindataPackage.EDITABLE_FIELD_DEFAULT_STATE:
				return createEditableFieldDefaultStateFromString(eDataType, initialValue);
			case imagindataPackage.ANCHOR_TYPE:
				return createAnchorTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case imagindataPackage.CONTITION_TYPE:
				return convertContitionTypeToString(eDataType, instanceValue);
			case imagindataPackage.STATE_TYPE:
				return convertStateTypeToString(eDataType, instanceValue);
			case imagindataPackage.EXIT_INIT_TYPE:
				return convertExitInitTypeToString(eDataType, instanceValue);
			case imagindataPackage.BUTTON_DEFAULT_STATE:
				return convertButtonDefaultStateToString(eDataType, instanceValue);
			case imagindataPackage.CHECK_BOX_DEFAULT_STATE:
				return convertCheckBoxDefaultStateToString(eDataType, instanceValue);
			case imagindataPackage.LIST_BOX_DEFAULT_STATE:
				return convertListBoxDefaultStateToString(eDataType, instanceValue);
			case imagindataPackage.EDITABLE_FIELD_DEFAULT_STATE:
				return convertEditableFieldDefaultStateToString(eDataType, instanceValue);
			case imagindataPackage.ANCHOR_TYPE:
				return convertAnchorTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceContainer createInterfaceContainer() {
		InterfaceContainerImpl interfaceContainer = new InterfaceContainerImpl();
		return interfaceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleRegion createInterruptibleRegion() {
		InterruptibleRegionImpl interruptibleRegion = new InterruptibleRegionImpl();
		return interruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Historic createHistoric() {
		HistoricImpl historic = new HistoricImpl();
		return historic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public imagindata.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressBar createProgressBar() {
		ProgressBarImpl progressBar = new ProgressBarImpl();
		return progressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListBox createListBox() {
		ListBoxImpl listBox = new ListBoxImpl();
		return listBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateObject createStateObject() {
		StateObjectImpl stateObject = new StateObjectImpl();
		return stateObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitExit createInitExit() {
		InitExitImpl initExit = new InitExitImpl();
		return initExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditableField createEditableField() {
		EditableFieldImpl editableField = new EditableFieldImpl();
		return editableField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anchor createAnchor() {
		AnchorImpl anchor = new AnchorImpl();
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContitionType createContitionTypeFromString(EDataType eDataType, String initialValue) {
		ContitionType result = ContitionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType createStateTypeFromString(EDataType eDataType, String initialValue) {
		StateType result = StateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitInitType createExitInitTypeFromString(EDataType eDataType, String initialValue) {
		ExitInitType result = ExitInitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExitInitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonDefaultState createButtonDefaultStateFromString(EDataType eDataType, String initialValue) {
		ButtonDefaultState result = ButtonDefaultState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertButtonDefaultStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBoxDefaultState createCheckBoxDefaultStateFromString(EDataType eDataType, String initialValue) {
		CheckBoxDefaultState result = CheckBoxDefaultState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCheckBoxDefaultStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListBoxDefaultState createListBoxDefaultStateFromString(EDataType eDataType, String initialValue) {
		ListBoxDefaultState result = ListBoxDefaultState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListBoxDefaultStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditableFieldDefaultState createEditableFieldDefaultStateFromString(EDataType eDataType, String initialValue) {
		EditableFieldDefaultState result = EditableFieldDefaultState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEditableFieldDefaultStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnchorType createAnchorTypeFromString(EDataType eDataType, String initialValue) {
		AnchorType result = AnchorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnchorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public imagindataPackage getimagindataPackage() {
		return (imagindataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static imagindataPackage getPackage() {
		return imagindataPackage.eINSTANCE;
	}

} //imagindataFactoryImpl
