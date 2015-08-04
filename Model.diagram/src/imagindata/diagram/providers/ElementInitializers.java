package imagindata.diagram.providers;

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
import imagindata.InitExit;
import imagindata.ListBox;
import imagindata.ListBoxDefaultState;
import imagindata.ProgressBar;
import imagindata.Region;
import imagindata.State;
import imagindata.Transition;
import imagindata.diagram.expressions.ImaginDataAbstractExpression;
import imagindata.diagram.expressions.ImaginDataOCLFactory;
import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {
	/**
	 * @generated NOT
	 * Permet d'initialiser la région avec une entrée, un état d'init et une transition entre les 2
	 */
	public static void init_Region_2007(Region instance) {
		try {
			//définit dans le gmfmap
			InitExit instanceInit = imagindata.imagindataFactory.eINSTANCE
					.createInitExit();
			instance.getStateObjects().add(instanceInit);
			Object value_0_0_0 = ImaginDataOCLFactory.getExpression(
					"ExitInitType::Init",
					imagindata.imagindataPackage.eINSTANCE.getInitExit())
					.evaluate(instanceInit);

			value_0_0_0 = ImaginDataAbstractExpression.performCast(value_0_0_0,
					imagindata.imagindataPackage.eINSTANCE.getExitInitType());
			instanceInit.setType((ExitInitType) value_0_0_0);

			//définit dans le gmfmap
			State instanceState = imagindata.imagindataFactory.eINSTANCE
					.createState();
			instance.getStateObjects().add(instanceState);
			Object value_0_1_0 = ImaginDataOCLFactory.getExpression(
					"\'DefaultStateName\'",
					imagindata.imagindataPackage.eINSTANCE.getState())
					.evaluate(instanceState);
			instanceState.setName((String) value_0_1_0);

			//Ajouté car on ne connait l'instance des objets précédents qu'ici
			//Ajout d'une transition Signal Guard Effect, les pattern rajouterons la notaion UML
			Transition instanceTransition = imagindata.imagindataFactory.eINSTANCE
					.createTransition();
			instance.getTransitions().add(instanceTransition);
			Object value_0 = ImaginDataOCLFactory.getExpression("\'Signal\'",
					imagindata.imagindataPackage.eINSTANCE.getTransition())
					.evaluate(instanceTransition);
			instanceTransition.setSignal((String) value_0);
			Object value_1 = ImaginDataOCLFactory.getExpression("\'Guard\'",
					imagindata.imagindataPackage.eINSTANCE.getTransition())
					.evaluate(instanceTransition);
			instanceTransition.setGuard((String) value_1);
			Object value_2 = ImaginDataOCLFactory.getExpression("\'Effect\'",
					imagindata.imagindataPackage.eINSTANCE.getTransition())
					.evaluate(instanceTransition);
			instanceTransition.setEffect((String) value_2);

			//Lien de la transition avec les entrée/sortie des objets Init et Etat
			instanceTransition.setStart(instanceInit);
			instanceTransition.setEnd(instanceState);
			instanceInit.getExit().set(0, instanceTransition);
			instanceState.getEnter().set(0, instanceTransition);

			//Ajout de la transition à la région
			instanceTransition.setRegion(instance);

		} catch (RuntimeException e) {
			ImaginDataDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_State_3004(State instance) {
		try {
			Object value_0 = ImaginDataOCLFactory.getExpression(
					"\'DefaultStateName\'",
					imagindata.imagindataPackage.eINSTANCE.getState())
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ImaginDataDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated NOT
	 */
	public static void init_Object_3002(imagindata.Object instance,
			String[] properties) {
		try {
			//Permet de mettre le standard 'name' attendu par le getExpression
			String convertName = "\'" + properties[0] + "\'";
			//On regarde le type de l'instance pour créer le bon objet avec le bon état
			if (instance instanceof CheckBox) {
				Object value_0 = ImaginDataOCLFactory.getExpression(
						convertName,
						imagindata.imagindataPackage.eINSTANCE.getObject())
						.evaluate(instance);
				if (properties[2].equals("Unticked")) {
					((CheckBox) instance)
							.setState(CheckBoxDefaultState.UNTICKED);
				} else if (properties[2].equals("Ticked")){
					((CheckBox) instance).setState(CheckBoxDefaultState.TICKED);
				}
				instance.setName((String) value_0);
			} else if (instance instanceof Button) {
				Object value_0 = ImaginDataOCLFactory.getExpression(
						convertName,
						imagindata.imagindataPackage.eINSTANCE.getObject())
						.evaluate(instance);
				if (properties[2].equals("Disabled")) {
					((Button) instance).setState(ButtonDefaultState.DISABLED);
				} else if (properties[2].equals("Enabled")) {
					((Button) instance).setState(ButtonDefaultState.ENABLED);
				} else if (properties[2].equals("Invisible")){
					((Button) instance).setState(ButtonDefaultState.INVISIBLE);
				}
				instance.setName((String) value_0);
			} else if (instance instanceof EditableField) {
				Object value_0 = ImaginDataOCLFactory.getExpression(
						convertName,
						imagindata.imagindataPackage.eINSTANCE.getObject())
						.evaluate(instance);
				if (properties[2].equals("Empty")) {
					((EditableField) instance)
							.setState(EditableFieldDefaultState.EMPTY);
				} else {
					((EditableField) instance)
							.setState(EditableFieldDefaultState.NOT_EMPTY);
				}
				instance.setName((String) value_0);
			} else if (instance instanceof ListBox) {
				Object value_0 = ImaginDataOCLFactory.getExpression(
						convertName,
						imagindata.imagindataPackage.eINSTANCE.getObject())
						.evaluate(instance);
				if (properties[2].equals("Empty")) {
					((ListBox) instance).setState(ListBoxDefaultState.EMPTY);
				} else {
					((ListBox) instance).setState(ListBoxDefaultState.CHOICE);
				}
				instance.setName((String) value_0);
			} else if (instance instanceof ProgressBar) {
				Object value_0 = ImaginDataOCLFactory.getExpression(
						convertName,
						imagindata.imagindataPackage.eINSTANCE.getObject())
						.evaluate(instance);
				if (properties[2].equals("Standard1")) {
					((ProgressBar) instance).setStandard("Standard 1");
				} else {
					((ProgressBar) instance).setStandard("Standard 2");
				}
				instance.setName((String) value_0);
			}

		} catch (RuntimeException e) {
			ImaginDataDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_InitExit_3005(InitExit instance) {
		try {
			Object value_0 = ImaginDataOCLFactory.getExpression(
					"ExitInitType::Init",
					imagindata.imagindataPackage.eINSTANCE.getInitExit())
					.evaluate(instance);

			value_0 = ImaginDataAbstractExpression.performCast(value_0,
					imagindata.imagindataPackage.eINSTANCE.getExitInitType());
			instance.setType((ExitInitType) value_0);
		} catch (RuntimeException e) {
			ImaginDataDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated NOT
	 */
	public static void init_Diagram_3006(Diagram instance) {
		try {
			//définit dans le gmfmap
			Region newInstance_0_0 = imagindata.imagindataFactory.eINSTANCE
					.createRegion();
			instance.getRegions().add(newInstance_0_0);

			InitExit newInstance_0_0_0_0 = imagindata.imagindataFactory.eINSTANCE
					.createInitExit();
			newInstance_0_0.getStateObjects().add(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = ImaginDataOCLFactory.getExpression(
					"ExitInitType::Init",
					imagindata.imagindataPackage.eINSTANCE.getInitExit())
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = ImaginDataAbstractExpression.performCast(
					value_0_0_0_0_0, imagindata.imagindataPackage.eINSTANCE
							.getExitInitType());
			newInstance_0_0_0_0.setType((ExitInitType) value_0_0_0_0_0);

			State newInstance_0_0_0_1 = imagindata.imagindataFactory.eINSTANCE
					.createState();
			newInstance_0_0.getStateObjects().add(newInstance_0_0_0_1);
			Object value_0_0_0_1_0 = ImaginDataOCLFactory.getExpression(
					"\'DefaultStateName\'",
					imagindata.imagindataPackage.eINSTANCE.getState())
					.evaluate(newInstance_0_0_0_1);
			newInstance_0_0_0_1.setName((String) value_0_0_0_1_0);

			Object value_1 = ImaginDataOCLFactory.getExpression(
					"\'DefaultSubDiagramName\'",
					imagindata.imagindataPackage.eINSTANCE.getDiagram())
					.evaluate(instance);
			instance.setName((String) value_1);

			//Ajout de la transition
			Transition newInstance_0_2 = imagindata.imagindataFactory.eINSTANCE
					.createTransition();
			newInstance_0_0.getTransitions().add(newInstance_0_2);
			Object value_0 = ImaginDataOCLFactory.getExpression("\'Signal\'",
					imagindata.imagindataPackage.eINSTANCE.getTransition())
					.evaluate(newInstance_0_2);
			newInstance_0_2.setSignal((String) value_0);
			Object value_0_1 = ImaginDataOCLFactory.getExpression("\'Guard\'",
					imagindata.imagindataPackage.eINSTANCE.getTransition())
					.evaluate(newInstance_0_2);
			newInstance_0_2.setGuard((String) value_0_1);
			Object value_2 = ImaginDataOCLFactory.getExpression("\'Effect\'",
					imagindata.imagindataPackage.eINSTANCE.getTransition())
					.evaluate(newInstance_0_2);
			newInstance_0_2.setEffect((String) value_2);

			//Lien de la transition aux objets précédents
			newInstance_0_2.setStart(newInstance_0_0_0_0);
			newInstance_0_2.setEnd(newInstance_0_0_0_1);
			newInstance_0_0_0_0.getExit().set(0, newInstance_0_2);
			newInstance_0_0_0_1.getEnter().set(0, newInstance_0_2);

			//Ajout de la transition a la région
			newInstance_0_2.setRegion(newInstance_0_0);

		} catch (RuntimeException e) {
			ImaginDataDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated NOT
	 */
	public static void init_Condition_3007(Condition instance) {
		try {
			Object value_0 = ImaginDataOCLFactory.getExpression(
					"\'DefaultConditionName\'",
					imagindata.imagindataPackage.eINSTANCE.getCondition())
					.evaluate(instance);
			instance.setCondition((String) value_0);
			instance.setType(ContitionType.BOOLEAN);
		} catch (RuntimeException e) {
			ImaginDataDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Transition_4001(Transition instance) {
		try {
			Object value_0 = ImaginDataOCLFactory.getExpression("\'Signal\'",
					imagindata.imagindataPackage.eINSTANCE.getTransition())
					.evaluate(instance);
			instance.setSignal((String) value_0);
			Object value_1 = ImaginDataOCLFactory.getExpression("\'Guard\'",
					imagindata.imagindataPackage.eINSTANCE.getTransition())
					.evaluate(instance);
			instance.setGuard((String) value_1);
			Object value_2 = ImaginDataOCLFactory.getExpression("\'Effect\'",
					imagindata.imagindataPackage.eINSTANCE.getTransition())
					.evaluate(instance);
			instance.setEffect((String) value_2);
		} catch (RuntimeException e) {
			ImaginDataDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
