package imagindata.diagram.edit.policies;

import imagindata.diagram.edit.commands.CreateTransition4001Command;
import imagindata.diagram.edit.commands.CreateTransition4001StartCommand;
import imagindata.diagram.edit.commands.ReconnectTransition4001SourceCommand;
import imagindata.diagram.edit.commands.ReconnectTransition4001TargetCommand;
import imagindata.diagram.edit.parts.DiagramEditPart;
import imagindata.diagram.edit.parts.TransitionEditPart;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.lite.requests.CreateConnectionRequestEx;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;

/**
 * @generated
 */
public class DiagramGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {
	/**
	 * @generated
	 */
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		if (request instanceof CreateConnectionRequestEx) {
			CreateConnectionRequestEx requestEx = (CreateConnectionRequestEx) request;
			if (!DiagramEditPart.MODEL_ID.equals(requestEx.getModelID())) {
				return null;
			}
			int[] visualIds = requestEx.getVisualIds();
			CompoundCommand result = new CompoundCommand();
			for (int i = 0; i < visualIds.length; i++) {
				int nextVisualId = visualIds[i];
				switch (nextVisualId) {
				case TransitionEditPart.VISUAL_ID:
					result
							.appendIfCanExecute(new CreateTransition4001StartCommand(
									requestEx));
					break;
				}
			}
			if (!result.canExecute()) {
				return null;
			}
			Command wrappedResult = new WrappingCommand(TransactionUtil
					.getEditingDomain(((Node) getHost().getModel())
							.getDiagram().getElement()), result);
			request.setStartCommand(wrappedResult);
			return wrappedResult;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		if (request instanceof CreateConnectionRequestEx) {
			if (request.getStartCommand() == null
					|| !request.getStartCommand().canExecute()) {
				return UnexecutableCommand.INSTANCE;
			}
			CreateConnectionRequestEx requestEx = (CreateConnectionRequestEx) request;
			if (!DiagramEditPart.MODEL_ID.equals(requestEx.getModelID())) {
				return null;
			}
			int[] visualIds = requestEx.getVisualIds();
			CompoundCommand result = new CompoundCommand();
			for (int i = 0; i < visualIds.length; i++) {
				int nextVisualId = visualIds[i];
				switch (nextVisualId) {
				case TransitionEditPart.VISUAL_ID:
					result.appendIfCanExecute(new CreateTransition4001Command(
							requestEx));
					break;
				}
			}
			if (result.getCommandList().size() != 1 || !result.canExecute()) {
				//Cannot create several connections at once.
				return UnexecutableCommand.INSTANCE;
			}
			return request.getStartCommand().chain(
					new WrappingCommand(TransactionUtil
							.getEditingDomain(((Node) getHost().getModel())
									.getDiagram().getElement()), result));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		ConnectionEditPart connection = request.getConnectionEditPart();
		if (connection.getModel() instanceof Edge == false) {
			return null;
		}
		Edge edge = (Edge) connection.getModel();
		String modelID = ImaginDataVisualIDRegistry.getModelID(edge);
		if (!DiagramEditPart.MODEL_ID.equals(modelID)) {
			return null;
		}
		org.eclipse.emf.common.command.Command result = null;
		int visualID = ImaginDataVisualIDRegistry.getVisualID(edge);
		switch (visualID) {
		case TransitionEditPart.VISUAL_ID:
			result = new ReconnectTransition4001SourceCommand(request);
			break;
		}
		if (result == null || !result.canExecute()) {
			return null;
		}
		return new WrappingCommand(TransactionUtil
				.getEditingDomain(((Node) getHost().getModel()).getDiagram()
						.getElement()), result);
	}

	/**
	 * @generated
	 */
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		ConnectionEditPart connection = request.getConnectionEditPart();
		if (connection.getModel() instanceof Edge == false) {
			return null;
		}
		Edge edge = (Edge) connection.getModel();
		String modelID = ImaginDataVisualIDRegistry.getModelID(edge);
		if (!DiagramEditPart.MODEL_ID.equals(modelID)) {
			return null;
		}
		org.eclipse.emf.common.command.Command result = null;
		int visualID = ImaginDataVisualIDRegistry.getVisualID(edge);
		switch (visualID) {
		case TransitionEditPart.VISUAL_ID:
			result = new ReconnectTransition4001TargetCommand(request);
			break;
		}
		if (result == null || !result.canExecute()) {
			return null;
		}
		return new WrappingCommand(TransactionUtil
				.getEditingDomain(((Node) getHost().getModel()).getDiagram()
						.getElement()), result);
	}
}
