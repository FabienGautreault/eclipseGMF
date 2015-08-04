package imagindata.diagram.providers;

import imagindata.State;
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
import imagindata.diagram.edit.parts.TransitionEditPart;
import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ImaginDataElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private ImaginDataElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;
	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;
	/**
	 * @generated
	 */
	public static final IElementType Diagram_1000 = getElementType("Model.diagram.Diagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Region_2007 = getElementType("Model.diagram.Region_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType State_3004 = getElementType("Model.diagram.State_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Object_3002 = getElementType("Model.diagram.Object_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitExit_3005 = getElementType("Model.diagram.InitExit_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Diagram_3006 = getElementType("Model.diagram.Diagram_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Historic_3008 = getElementType("Model.diagram.Historic_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Anchor_3009 = getElementType("Model.diagram.Anchor_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3007 = getElementType("Model.diagram.Condition_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Anchor_3010 = getElementType("Model.diagram.Anchor_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_4001 = getElementType("Model.diagram.Transition_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ImaginDataDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Diagram_1000, imagindata.imagindataPackage.eINSTANCE
					.getDiagram());

			elements.put(Region_2007, imagindata.imagindataPackage.eINSTANCE
					.getRegion());

			elements.put(State_3004, imagindata.imagindataPackage.eINSTANCE
					.getState());

			elements.put(Object_3002, imagindata.imagindataPackage.eINSTANCE
					.getObject());

			elements.put(InitExit_3005, imagindata.imagindataPackage.eINSTANCE
					.getInitExit());

			elements.put(Diagram_3006, imagindata.imagindataPackage.eINSTANCE
					.getDiagram());

			elements.put(Historic_3008, imagindata.imagindataPackage.eINSTANCE
					.getHistoric());

			elements.put(Anchor_3009, imagindata.imagindataPackage.eINSTANCE
					.getAnchor());

			elements.put(Condition_3007, imagindata.imagindataPackage.eINSTANCE
					.getCondition());

			elements.put(Anchor_3010, imagindata.imagindataPackage.eINSTANCE
					.getAnchor());

			elements.put(Transition_4001,
					imagindata.imagindataPackage.eINSTANCE.getTransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Diagram_1000);
			KNOWN_ELEMENT_TYPES.add(Region_2007);
			KNOWN_ELEMENT_TYPES.add(State_3004);
			KNOWN_ELEMENT_TYPES.add(Object_3002);
			KNOWN_ELEMENT_TYPES.add(InitExit_3005);
			KNOWN_ELEMENT_TYPES.add(Diagram_3006);
			KNOWN_ELEMENT_TYPES.add(Historic_3008);
			KNOWN_ELEMENT_TYPES.add(Anchor_3009);
			KNOWN_ELEMENT_TYPES.add(Condition_3007);
			KNOWN_ELEMENT_TYPES.add(Anchor_3010);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DiagramEditPart.VISUAL_ID:
			return Diagram_1000;
		case RegionEditPart.VISUAL_ID:
			return Region_2007;
		case StateEditPart.VISUAL_ID:
			return State_3004;
		case ObjectEditPart.VISUAL_ID:
			return Object_3002;
		case InitExitEditPart.VISUAL_ID:
			return InitExit_3005;
		case Diagram2EditPart.VISUAL_ID:
			return Diagram_3006;
		case HistoricEditPart.VISUAL_ID:
			return Historic_3008;
		case AnchorEditPart.VISUAL_ID:
			return Anchor_3009;
		case ConditionEditPart.VISUAL_ID:
			return Condition_3007;
		case Anchor2EditPart.VISUAL_ID:
			return Anchor_3010;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		}
		return null;
	}

}
