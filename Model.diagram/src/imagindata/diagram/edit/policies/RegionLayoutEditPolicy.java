package imagindata.diagram.edit.policies;

import imagindata.diagram.edit.commands.AddCondition3007Command;
import imagindata.diagram.edit.commands.AddDiagram3006Command;
import imagindata.diagram.edit.commands.AddInitExit3005Command;
import imagindata.diagram.edit.commands.AddState3004Command;
import imagindata.diagram.edit.commands.CloneCondition3007Command;
import imagindata.diagram.edit.commands.CloneDiagram3006Command;
import imagindata.diagram.edit.commands.CloneInitExit3005Command;
import imagindata.diagram.edit.commands.CloneState3004Command;
import imagindata.diagram.edit.commands.CreateCondition3007Command;
import imagindata.diagram.edit.commands.CreateDiagram3006Command;
import imagindata.diagram.edit.commands.CreateInitExit3005Command;
import imagindata.diagram.edit.commands.CreateState3004Command;
import imagindata.diagram.edit.parts.ConditionEditPart;
import imagindata.diagram.edit.parts.Diagram2EditPart;
import imagindata.diagram.edit.parts.DiagramEditPart;
import imagindata.diagram.edit.parts.InitExitEditPart;
import imagindata.diagram.edit.parts.StateEditPart;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
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
import org.eclipse.gmf.runtime.notation.Node;

/**
 * @generated
 */
public class RegionLayoutEditPolicy extends XYLayoutEditPolicyEx {
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
				case StateEditPart.VISUAL_ID:
					result.append(new CreateState3004Command((Node) getHost()
							.getModel(), requestEx,
							(Rectangle) getConstraintFor(request)));
					break;
				case InitExitEditPart.VISUAL_ID:
					result.append(new CreateInitExit3005Command(
							(Node) getHost().getModel(), requestEx,
							(Rectangle) getConstraintFor(request)));
					break;
				case Diagram2EditPart.VISUAL_ID:
					result.append(new CreateDiagram3006Command((Node) getHost()
							.getModel(), requestEx,
							(Rectangle) getConstraintFor(request)));
					break;
				case ConditionEditPart.VISUAL_ID:
					result.append(new CreateCondition3007Command(
							(Node) getHost().getModel(), requestEx,
							(Rectangle) getConstraintFor(request)));
					break;
				}
			}
			return new WrappingCommand(TransactionUtil
					.getEditingDomain(((Node) getHost().getModel())
							.getDiagram().getElement()), result);
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
						(Node) getHost().getModel(), childNode.getElement());
				org.eclipse.emf.common.command.Command command = null;
				switch (newVisualID) {
				case StateEditPart.VISUAL_ID:
					command = new AddState3004Command((Node) getHost()
							.getModel(), childNode, newVisualID,
							(Rectangle) constraint);
					break;
				case InitExitEditPart.VISUAL_ID:
					command = new AddInitExit3005Command((Node) getHost()
							.getModel(), childNode, newVisualID,
							(Rectangle) constraint);
					break;
				case Diagram2EditPart.VISUAL_ID:
					command = new AddDiagram3006Command((Node) getHost()
							.getModel(), childNode, newVisualID,
							(Rectangle) constraint);
					break;
				case ConditionEditPart.VISUAL_ID:
					command = new AddCondition3007Command((Node) getHost()
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
						(Node) getHost().getModel(), childNode.getElement());
				org.eclipse.emf.common.command.Command command = null;
				switch (newVisualID) {
				case StateEditPart.VISUAL_ID:
					command = new CloneState3004Command((Node) getHost()
							.getModel(), childNode, (Rectangle) constraint);
					break;
				case InitExitEditPart.VISUAL_ID:
					command = new CloneInitExit3005Command((Node) getHost()
							.getModel(), childNode, (Rectangle) constraint);
					break;
				case Diagram2EditPart.VISUAL_ID:
					command = new CloneDiagram3006Command((Node) getHost()
							.getModel(), childNode, (Rectangle) constraint);
					break;
				case ConditionEditPart.VISUAL_ID:
					command = new CloneCondition3007Command((Node) getHost()
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
					case StateEditPart.VISUAL_ID: {
						if (constraint != null) {
							constraint.union(new Dimension(75, 75));
						}
						adjusted = true;
						break;
					}
					case InitExitEditPart.VISUAL_ID: {
						if (constraint != null) {
							constraint.width = 40;
							constraint.height = 40;
						}
						adjusted = true;
						break;
					}
					case Diagram2EditPart.VISUAL_ID: {
						if (constraint != null) {
							constraint.union(new Dimension(125, 125));
						}
						adjusted = true;
						break;
					}
					case ConditionEditPart.VISUAL_ID: {
						if (constraint != null) {
							constraint.union(new Dimension(50, 50));
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
