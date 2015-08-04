package imagindata.diagram.part;

import imagindata.Anchor;
import imagindata.Condition;
import imagindata.Diagram;
import imagindata.Historic;
import imagindata.InitExit;
import imagindata.Object;
import imagindata.Region;
import imagindata.State;
import imagindata.StateObject;
import imagindata.Transition;
import imagindata.diagram.edit.parts.Anchor2EditPart;
import imagindata.diagram.edit.parts.AnchorEditPart;
import imagindata.diagram.edit.parts.ConditionEditPart;
import imagindata.diagram.edit.parts.Diagram2EditPart;
import imagindata.diagram.edit.parts.DiagramEditPart;
import imagindata.diagram.edit.parts.HistoricEditPart;
import imagindata.diagram.edit.parts.InitExitEditPart;
import imagindata.diagram.edit.parts.ObjectEditPart;
import imagindata.diagram.edit.parts.RegionEditPart;
import imagindata.diagram.edit.parts.StateEditPart;
import imagindata.diagram.edit.parts.StateObjectsCompartmentEditPart;
import imagindata.diagram.edit.parts.TransitionEditPart;
import imagindata.diagram.providers.ImaginDataElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ImaginDataDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (ImaginDataVisualIDRegistry.getVisualID(view)) {
		case RegionEditPart.VISUAL_ID:
			return getRegion_2007SemanticChildren(view);
		case Diagram2EditPart.VISUAL_ID:
			return getDiagram_3006SemanticChildren(view);
		case StateObjectsCompartmentEditPart.VISUAL_ID:
			return getStateObjectsCompartment_7003SemanticChildren(view);
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRegion_2007SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Region modelElement = (Region) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getStateObjects().iterator(); it
				.hasNext();) {
			StateObject childElement = (StateObject) it.next();
			int visualID = ImaginDataVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StateEditPart.VISUAL_ID) {
				result
						.add(new ImaginDataNodeDescriptor(childElement,
								visualID));
				continue;
			}
			if (visualID == InitExitEditPart.VISUAL_ID) {
				result
						.add(new ImaginDataNodeDescriptor(childElement,
								visualID));
				continue;
			}
			if (visualID == Diagram2EditPart.VISUAL_ID) {
				result
						.add(new ImaginDataNodeDescriptor(childElement,
								visualID));
				continue;
			}
			if (visualID == ConditionEditPart.VISUAL_ID) {
				result
						.add(new ImaginDataNodeDescriptor(childElement,
								visualID));
				continue;
			}
			if (visualID == Anchor2EditPart.VISUAL_ID) {
				result
						.add(new ImaginDataNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_3006SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Diagram modelElement = (Diagram) view.getElement();
		List result = new LinkedList();
		{
			Historic childElement = modelElement.getHisto();
			int visualID = ImaginDataVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HistoricEditPart.VISUAL_ID) {
				result
						.add(new ImaginDataNodeDescriptor(childElement,
								visualID));
			}
		}
		for (Iterator it = modelElement.getAnchors().iterator(); it.hasNext();) {
			Anchor childElement = (Anchor) it.next();
			int visualID = ImaginDataVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AnchorEditPart.VISUAL_ID) {
				result
						.add(new ImaginDataNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStateObjectsCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		State modelElement = (State) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = ImaginDataVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ObjectEditPart.VISUAL_ID) {
				result
						.add(new ImaginDataNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Diagram modelElement = (Diagram) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getRegions().iterator(); it.hasNext();) {
			Region childElement = (Region) it.next();
			int visualID = ImaginDataVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RegionEditPart.VISUAL_ID) {
				result
						.add(new ImaginDataNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (ImaginDataVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000ContainedLinks(view);
		case RegionEditPart.VISUAL_ID:
			return getRegion_2007ContainedLinks(view);
		case StateEditPart.VISUAL_ID:
			return getState_3004ContainedLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_3002ContainedLinks(view);
		case InitExitEditPart.VISUAL_ID:
			return getInitExit_3005ContainedLinks(view);
		case Diagram2EditPart.VISUAL_ID:
			return getDiagram_3006ContainedLinks(view);
		case HistoricEditPart.VISUAL_ID:
			return getHistoric_3008ContainedLinks(view);
		case AnchorEditPart.VISUAL_ID:
			return getAnchor_3009ContainedLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3007ContainedLinks(view);
		case Anchor2EditPart.VISUAL_ID:
			return getAnchor_3010ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (ImaginDataVisualIDRegistry.getVisualID(view)) {
		case RegionEditPart.VISUAL_ID:
			return getRegion_2007IncomingLinks(view);
		case StateEditPart.VISUAL_ID:
			return getState_3004IncomingLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_3002IncomingLinks(view);
		case InitExitEditPart.VISUAL_ID:
			return getInitExit_3005IncomingLinks(view);
		case Diagram2EditPart.VISUAL_ID:
			return getDiagram_3006IncomingLinks(view);
		case HistoricEditPart.VISUAL_ID:
			return getHistoric_3008IncomingLinks(view);
		case AnchorEditPart.VISUAL_ID:
			return getAnchor_3009IncomingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3007IncomingLinks(view);
		case Anchor2EditPart.VISUAL_ID:
			return getAnchor_3010IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (ImaginDataVisualIDRegistry.getVisualID(view)) {
		case RegionEditPart.VISUAL_ID:
			return getRegion_2007OutgoingLinks(view);
		case StateEditPart.VISUAL_ID:
			return getState_3004OutgoingLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_3002OutgoingLinks(view);
		case InitExitEditPart.VISUAL_ID:
			return getInitExit_3005OutgoingLinks(view);
		case Diagram2EditPart.VISUAL_ID:
			return getDiagram_3006OutgoingLinks(view);
		case HistoricEditPart.VISUAL_ID:
			return getHistoric_3008OutgoingLinks(view);
		case AnchorEditPart.VISUAL_ID:
			return getAnchor_3009OutgoingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3007OutgoingLinks(view);
		case Anchor2EditPart.VISUAL_ID:
			return getAnchor_3010OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRegion_2007ContainedLinks(View view) {
		Region modelElement = (Region) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getState_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getObject_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitExit_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHistoric_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnchor_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnchor_3010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTransition_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRegion_2007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getState_3004IncomingLinks(View view) {
		State modelElement = (State) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getObject_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitExit_3005IncomingLinks(View view) {
		InitExit modelElement = (InitExit) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_3006IncomingLinks(View view) {
		Diagram modelElement = (Diagram) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getHistoric_3008IncomingLinks(View view) {
		Historic modelElement = (Historic) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnchor_3009IncomingLinks(View view) {
		Anchor modelElement = (Anchor) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3007IncomingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnchor_3010IncomingLinks(View view) {
		Anchor modelElement = (Anchor) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransition_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRegion_2007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getState_3004OutgoingLinks(View view) {
		State modelElement = (State) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getObject_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitExit_3005OutgoingLinks(View view) {
		InitExit modelElement = (InitExit) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_3006OutgoingLinks(View view) {
		Diagram modelElement = (Diagram) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getHistoric_3008OutgoingLinks(View view) {
		Historic modelElement = (Historic) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnchor_3009OutgoingLinks(View view) {
		Anchor modelElement = (Anchor) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3007OutgoingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnchor_3010OutgoingLinks(View view) {
		Anchor modelElement = (Anchor) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransition_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Transition_4001(
			Region container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != ImaginDataVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			StateObject dst = link.getEnd();
			StateObject src = link.getStart();
			result.add(new ImaginDataLinkDescriptor(src, dst, link,
					ImaginDataElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Transition_4001(
			StateObject target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != imagindata.imagindataPackage.eINSTANCE
					.getTransition_End()
					|| false == setting.getEObject() instanceof Transition) {
				continue;
			}
			Transition link = (Transition) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != ImaginDataVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			StateObject src = link.getStart();
			result.add(new ImaginDataLinkDescriptor(src, target, link,
					ImaginDataElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Transition_4001(
			StateObject source) {
		Region container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Region) {
				container = (Region) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != ImaginDataVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			StateObject dst = link.getEnd();
			StateObject src = link.getStart();
			if (src != source) {
				continue;
			}
			result.add(new ImaginDataLinkDescriptor(src, dst, link,
					ImaginDataElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

}
