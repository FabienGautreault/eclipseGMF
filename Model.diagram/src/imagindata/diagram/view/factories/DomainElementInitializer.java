package imagindata.diagram.view.factories;

import imagindata.Condition;
import imagindata.Diagram;
import imagindata.ExitInitType;
import imagindata.InitExit;
import imagindata.Region;
import imagindata.State;
import imagindata.Transition;
import imagindata.diagram.expressions.ImaginDataAbstractExpression;
import imagindata.diagram.expressions.ImaginDataOCLFactory;
import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class DomainElementInitializer {
	/**
	 * @generated
	 */
	public static void init_Region_2007(Region instance) {
		try {
			InitExit newInstance_0_0 = imagindata.imagindataFactory.eINSTANCE
					.createInitExit();
			instance.getStateObjects().add(newInstance_0_0);
			Object value_0_0_0 = ImaginDataOCLFactory.getExpression(
					"ExitInitType::Init",
					imagindata.imagindataPackage.eINSTANCE.getInitExit())
					.evaluate(newInstance_0_0);

			value_0_0_0 = ImaginDataAbstractExpression.performCast(value_0_0_0,
					imagindata.imagindataPackage.eINSTANCE.getExitInitType());
			newInstance_0_0.setType((ExitInitType) value_0_0_0);

			State newInstance_0_1 = imagindata.imagindataFactory.eINSTANCE
					.createState();
			instance.getStateObjects().add(newInstance_0_1);
			Object value_0_1_0 = ImaginDataOCLFactory.getExpression(
					"\'DefaultStateName\'",
					imagindata.imagindataPackage.eINSTANCE.getState())
					.evaluate(newInstance_0_1);
			newInstance_0_1.setName((java.lang.String) value_0_1_0);

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
			instance.setName((java.lang.String) value_0);
		} catch (RuntimeException e) {
			ImaginDataDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Object_3002(imagindata.Object instance) {
		try {
			Object value_0 = ImaginDataOCLFactory.getExpression(
					"\'DefaultObjectName\'",
					imagindata.imagindataPackage.eINSTANCE.getObject())
					.evaluate(instance);
			instance.setName((java.lang.String) value_0);
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
	 * @generated
	 */
	public static void init_Diagram_3006(Diagram instance) {
		try {
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
			newInstance_0_0_0_1.setName((java.lang.String) value_0_0_0_1_0);

			Object value_1 = ImaginDataOCLFactory.getExpression(
					"\'DefaultSubDiagramName\'",
					imagindata.imagindataPackage.eINSTANCE.getDiagram())
					.evaluate(instance);
			instance.setName((java.lang.String) value_1);
		} catch (RuntimeException e) {
			ImaginDataDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Condition_3007(Condition instance) {
		try {
			Object value_0 = ImaginDataOCLFactory.getExpression(
					"\'DefaultConditionName\'",
					imagindata.imagindataPackage.eINSTANCE.getCondition())
					.evaluate(instance);
			instance.setCondition((java.lang.String) value_0);
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
			instance.setSignal((java.lang.String) value_0);
			Object value_1 = ImaginDataOCLFactory.getExpression("\'Guard\'",
					imagindata.imagindataPackage.eINSTANCE.getTransition())
					.evaluate(instance);
			instance.setGuard((java.lang.String) value_1);
			Object value_2 = ImaginDataOCLFactory.getExpression("\'Effect\'",
					imagindata.imagindataPackage.eINSTANCE.getTransition())
					.evaluate(instance);
			instance.setEffect((java.lang.String) value_2);
		} catch (RuntimeException e) {
			ImaginDataDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		private static final String OPPOSITE_END_VAR = "oppositeEnd"; //$NON-NLS-1$

		/**
		 * @generated
		 */
		private static ImaginDataAbstractExpression Transition_4001_SourceExpression;
		/**
		 * @generated
		 */
		private static ImaginDataAbstractExpression Transition_4001_TargetExpression;

		/**
		 * @generated
		 */
		public static boolean canExistTransition_4001(EObject source,
				EObject target) {
			try {
				if (source == null) {
					return true;
				}
				if (Transition_4001_SourceExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							imagindata.imagindataPackage.eINSTANCE
									.getStateObject());
					Transition_4001_SourceExpression = ImaginDataOCLFactory
							.getExpression(
									"not oclIsKindOf(Historic)", imagindata.imagindataPackage.eINSTANCE.getStateObject(), env); //$NON-NLS-1$
				}
				Object sourceVal = Transition_4001_SourceExpression.evaluate(
						source, Collections.singletonMap(OPPOSITE_END_VAR,
								target));
				if (false == sourceVal instanceof Boolean
						|| !((Boolean) sourceVal).booleanValue()) {
					return false;
				} // else fall-through
				if (target == null) {
					return true;
				}
				if (Transition_4001_TargetExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							imagindata.imagindataPackage.eINSTANCE
									.getStateObject());
					Transition_4001_TargetExpression = ImaginDataOCLFactory
							.getExpression(
									"self <> oppositeEnd", imagindata.imagindataPackage.eINSTANCE.getStateObject(), env); //$NON-NLS-1$
				}
				Object targetVal = Transition_4001_TargetExpression.evaluate(
						target, Collections.singletonMap(OPPOSITE_END_VAR,
								source));
				if (false == targetVal instanceof Boolean
						|| !((Boolean) targetVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				ImaginDataDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}
	}

}
