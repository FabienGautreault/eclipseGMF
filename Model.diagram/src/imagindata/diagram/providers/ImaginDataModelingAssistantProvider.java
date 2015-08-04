package imagindata.diagram.providers;

import imagindata.diagram.edit.parts.Anchor2EditPart;
import imagindata.diagram.edit.parts.AnchorEditPart;
import imagindata.diagram.edit.parts.ConditionEditPart;
import imagindata.diagram.edit.parts.Diagram2EditPart;
import imagindata.diagram.edit.parts.DiagramEditPart;
import imagindata.diagram.edit.parts.HistoricEditPart;
import imagindata.diagram.edit.parts.InitExitEditPart;
import imagindata.diagram.edit.parts.RegionEditPart;
import imagindata.diagram.edit.parts.StateEditPart;
import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;
import imagindata.diagram.part.Messages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class ImaginDataModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof RegionEditPart) {
			ArrayList types = new ArrayList(5);
			types.add(ImaginDataElementTypes.State_3004);
			types.add(ImaginDataElementTypes.InitExit_3005);
			types.add(ImaginDataElementTypes.Diagram_3006);
			types.add(ImaginDataElementTypes.Condition_3007);
			types.add(ImaginDataElementTypes.Anchor_3010);
			return types;
		}
		if (editPart instanceof StateEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ImaginDataElementTypes.Object_3002);
			return types;
		}
		if (editPart instanceof Diagram2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ImaginDataElementTypes.Historic_3008);
			types.add(ImaginDataElementTypes.Anchor_3009);
			return types;
		}
		if (editPart instanceof DiagramEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ImaginDataElementTypes.Region_2007);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StateEditPart) {
			return ((StateEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InitExitEditPart) {
			return ((InitExitEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Diagram2EditPart) {
			return ((Diagram2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof HistoricEditPart) {
			return ((HistoricEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AnchorEditPart) {
			return ((AnchorEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ConditionEditPart) {
			return ((ConditionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Anchor2EditPart) {
			return ((Anchor2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof StateEditPart) {
			return ((StateEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InitExitEditPart) {
			return ((InitExitEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Diagram2EditPart) {
			return ((Diagram2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof HistoricEditPart) {
			return ((HistoricEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AnchorEditPart) {
			return ((AnchorEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ConditionEditPart) {
			return ((ConditionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Anchor2EditPart) {
			return ((Anchor2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StateEditPart) {
			return ((StateEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InitExitEditPart) {
			return ((InitExitEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Diagram2EditPart) {
			return ((Diagram2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof HistoricEditPart) {
			return ((HistoricEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AnchorEditPart) {
			return ((AnchorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ConditionEditPart) {
			return ((ConditionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Anchor2EditPart) {
			return ((Anchor2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof StateEditPart) {
			return ((StateEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InitExitEditPart) {
			return ((InitExitEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Diagram2EditPart) {
			return ((Diagram2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof HistoricEditPart) {
			return ((HistoricEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AnchorEditPart) {
			return ((AnchorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			return ((ConditionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Anchor2EditPart) {
			return ((Anchor2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StateEditPart) {
			return ((StateEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InitExitEditPart) {
			return ((InitExitEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Diagram2EditPart) {
			return ((Diagram2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof HistoricEditPart) {
			return ((HistoricEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AnchorEditPart) {
			return ((AnchorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ConditionEditPart) {
			return ((ConditionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Anchor2EditPart) {
			return ((Anchor2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				ImaginDataDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.ImaginDataModelingAssistantProviderMessage);
		dialog.setTitle(Messages.ImaginDataModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
