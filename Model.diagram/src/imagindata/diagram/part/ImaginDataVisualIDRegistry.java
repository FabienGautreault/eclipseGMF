package imagindata.diagram.part;

import imagindata.Anchor;
import imagindata.diagram.edit.parts.Anchor2EditPart;
import imagindata.diagram.edit.parts.AnchorEditPart;
import imagindata.diagram.edit.parts.ConditionConditionEditPart;
import imagindata.diagram.edit.parts.ConditionEditPart;
import imagindata.diagram.edit.parts.Diagram2EditPart;
import imagindata.diagram.edit.parts.DiagramEditPart;
import imagindata.diagram.edit.parts.DiagramNameEditPart;
import imagindata.diagram.edit.parts.HistoricEditPart;
import imagindata.diagram.edit.parts.InitExitEditPart;
import imagindata.diagram.edit.parts.ObjectEditPart;
import imagindata.diagram.edit.parts.RegionEditPart;
import imagindata.diagram.edit.parts.StateEditPart;
import imagindata.diagram.edit.parts.StateNameEditPart;
import imagindata.diagram.edit.parts.StateObjectsCompartmentEditPart;
import imagindata.diagram.edit.parts.TransitionEditPart;
import imagindata.diagram.edit.parts.TransitionEffectEditPart;
import imagindata.diagram.edit.parts.TransitionGuardEditPart;
import imagindata.diagram.edit.parts.TransitionSignalEditPart;

import imagindata.diagram.expressions.ImaginDataAbstractExpression;
import imagindata.diagram.expressions.ImaginDataOCLFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ImaginDataVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "Model.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return imagindata.diagram.part.ImaginDataVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ImaginDataDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (imagindata.imagindataPackage.eINSTANCE.getDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((imagindata.Diagram) domainElement)) {
			return DiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = imagindata.diagram.part.ImaginDataVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = imagindata.diagram.part.ImaginDataVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case RegionEditPart.VISUAL_ID:
			if (imagindata.imagindataPackage.eINSTANCE.getState()
					.isSuperTypeOf(domainElement.eClass())) {
				return StateEditPart.VISUAL_ID;
			}
			if (imagindata.imagindataPackage.eINSTANCE.getInitExit()
					.isSuperTypeOf(domainElement.eClass())) {
				return InitExitEditPart.VISUAL_ID;
			}
			if (imagindata.imagindataPackage.eINSTANCE.getDiagram()
					.isSuperTypeOf(domainElement.eClass())) {
				return Diagram2EditPart.VISUAL_ID;
			}
			if (imagindata.imagindataPackage.eINSTANCE.getCondition()
					.isSuperTypeOf(domainElement.eClass())) {
				return ConditionEditPart.VISUAL_ID;
			}
			if (imagindata.imagindataPackage.eINSTANCE.getAnchor()
					.isSuperTypeOf(domainElement.eClass())) {
				return Anchor2EditPart.VISUAL_ID;
			}
			break;
		case Diagram2EditPart.VISUAL_ID:
			if (imagindata.imagindataPackage.eINSTANCE.getHistoric()
					.isSuperTypeOf(domainElement.eClass())) {
				return HistoricEditPart.VISUAL_ID;
			}
			if (imagindata.imagindataPackage.eINSTANCE.getAnchor()
					.isSuperTypeOf(domainElement.eClass())) {
				return AnchorEditPart.VISUAL_ID;
			}
			break;
		case StateObjectsCompartmentEditPart.VISUAL_ID:
			if (imagindata.imagindataPackage.eINSTANCE.getObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ObjectEditPart.VISUAL_ID;
			}
			break;
		case DiagramEditPart.VISUAL_ID:
			if (imagindata.imagindataPackage.eINSTANCE.getRegion()
					.isSuperTypeOf(domainElement.eClass())) {
				return RegionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = imagindata.diagram.part.ImaginDataVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = imagindata.diagram.part.ImaginDataVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case RegionEditPart.VISUAL_ID:
			if (StateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitExitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Diagram2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Anchor2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateEditPart.VISUAL_ID:
			if (StateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateObjectsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Diagram2EditPart.VISUAL_ID:
			if (DiagramNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HistoricEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnchorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionEditPart.VISUAL_ID:
			if (ConditionConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateObjectsCompartmentEditPart.VISUAL_ID:
			if (ObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiagramEditPart.VISUAL_ID:
			if (RegionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransitionEditPart.VISUAL_ID:
			if (TransitionSignalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransitionGuardEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransitionEffectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (imagindata.imagindataPackage.eINSTANCE.getTransition()
				.isSuperTypeOf(domainElement.eClass())) {
			return TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(imagindata.Diagram element) {
		return true;
	}

}
