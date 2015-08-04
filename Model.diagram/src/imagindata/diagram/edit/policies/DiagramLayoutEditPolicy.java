package imagindata.diagram.edit.policies;

import imagindata.diagram.edit.commands.AddRegion2007Command;
import imagindata.diagram.edit.commands.CloneRegion2007Command;
import imagindata.diagram.edit.commands.CreateRegion2007Command;
import imagindata.diagram.edit.parts.DiagramEditPart;
import imagindata.diagram.edit.parts.RegionEditPart;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.lite.edit.policies.XYLayoutEditPolicyEx;
import org.eclipse.gmf.runtime.lite.requests.CreateRequestEx;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;

/**
 * @generated
 */
public class DiagramLayoutEditPolicy extends XYLayoutEditPolicyEx {
	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateRequest request) {
		if (request instanceof CreateRequestEx) {
			CreateRequestEx requestEx = (CreateRequestEx) request;
			if (!DiagramEditPart.MODEL_ID.equals(requestEx.getModelID())) {
				return null;
			}
			int[] visualIds = requestEx.getVisualIds();
			CompoundCommand result = new CompoundCommand();
			for (int i = 0; i < visualIds.length; i++) {
				int nextVisualId = visualIds[i];
				switch (nextVisualId) {
				case RegionEditPart.VISUAL_ID:
					result.append(new CreateRegion2007Command(
							(Diagram) getHost().getModel(), requestEx,
							(Rectangle) getConstraintFor(request)));
					break;
				}
			}
			return new WrappingCommand(TransactionUtil
					.getEditingDomain(((Diagram) getHost().getModel())
							.getElement()), result);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command createAddCommand(EditPart child, Object constraint) {
		if (child.getModel() instanceof Node) {
			Node childNode = (Node) child.getModel();
			String modelID = ImaginDataVisualIDRegistry.getModelID(childNode);
			if (DiagramEditPart.MODEL_ID.equals(modelID)) {
				int newVisualID = ImaginDataVisualIDRegistry.getNodeVisualID(
						(Diagram) getHost().getModel(), childNode.getElement());
				org.eclipse.emf.common.command.Command command = null;
				switch (newVisualID) {
				case RegionEditPart.VISUAL_ID:
					command = new AddRegion2007Command((Diagram) getHost()
							.getModel(), childNode, newVisualID,
							(Rectangle) constraint);
					break;
				}
				if (command != null) {
					TransactionalEditingDomain editingDomain = TransactionUtil
							.getEditingDomain(childNode.getDiagram()
									.getElement());
					return new WrappingCommand(editingDomain, command);
				}
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command createCloneCommand(EditPart child, Object constraint) {
		if (child.getModel() instanceof Node) {
			Node childNode = (Node) child.getModel();
			String modelID = ImaginDataVisualIDRegistry.getModelID(childNode);
			if (DiagramEditPart.MODEL_ID.equals(modelID)) {
				int newVisualID = ImaginDataVisualIDRegistry.getNodeVisualID(
						(Diagram) getHost().getModel(), childNode.getElement());
				org.eclipse.emf.common.command.Command command = null;
				switch (newVisualID) {
				case RegionEditPart.VISUAL_ID:
					command = new CloneRegion2007Command((Diagram) getHost()
							.getModel(), childNode, (Rectangle) constraint);
					break;
				}
				if (command != null) {
					TransactionalEditingDomain editingDomain = TransactionUtil
							.getEditingDomain(childNode.getDiagram()
									.getElement());
					return new WrappingCommand(editingDomain, command);
				}
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected void showSizeOnDropFeedback(CreateRequest request) {
		IFigure feedback = getSizeOnDropFeedback(request);
		Rectangle rect = new Rectangle(request.getLocation(), request.getSize());
		getLayoutContainer().translateToRelative(rect);
		adjustConstraint(request, rect);
		getLayoutContainer().translateToAbsolute(rect);
		feedback.translateToRelative(rect);
		feedback.setBounds(rect.expand(getCreationFeedbackOffset(request)));
	}

	/**
	 * @generated
	 */
	protected void adjustConstraint(CreateRequest request, Rectangle constraint) {
		if (request instanceof CreateRequestEx) {
			CreateRequestEx requestEx = (CreateRequestEx) request;
			if (DiagramEditPart.MODEL_ID.equals(requestEx.getModelID())) {
				int[] visualIds = requestEx.getVisualIds();
				boolean adjusted = false;
				for (int i = 0; i < visualIds.length && !adjusted; i++) {
					int nextVisualId = visualIds[i];
					switch (nextVisualId) {
					case RegionEditPart.VISUAL_ID: {
						if (constraint != null) {
							constraint.width = 1000;
							constraint.height = 500;
						}
						adjusted = true;
						break;
					}
					}
				}
			}
		}
	}
}
