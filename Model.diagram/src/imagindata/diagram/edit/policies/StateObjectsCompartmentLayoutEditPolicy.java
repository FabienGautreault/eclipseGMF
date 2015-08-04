package imagindata.diagram.edit.policies;

import imagindata.diagram.edit.commands.AddObject3002Command;
import imagindata.diagram.edit.commands.CloneObject3002Command;
import imagindata.diagram.edit.commands.CreateObject3002Command;
import imagindata.diagram.edit.parts.DiagramEditPart;
import imagindata.diagram.edit.parts.ObjectEditPart;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.lite.edit.policies.ListLayoutEditPolicy;
import org.eclipse.gmf.runtime.lite.requests.CreateRequestEx;
import org.eclipse.gmf.runtime.notation.Node;

/**
 * @generated
 */
public class StateObjectsCompartmentLayoutEditPolicy extends
		ListLayoutEditPolicy {
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
				case ObjectEditPart.VISUAL_ID:
					result.append(new CreateObject3002Command((Node) getHost()
							.getModel(), requestEx));
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
				case ObjectEditPart.VISUAL_ID:
					command = new AddObject3002Command((Node) getHost()
							.getModel(), childNode, newVisualID, null);
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
				case ObjectEditPart.VISUAL_ID:
					command = new CloneObject3002Command((Node) getHost()
							.getModel(), childNode, null);
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
}
