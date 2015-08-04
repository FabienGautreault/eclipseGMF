package imagindata.diagram.edit.commands;

import imagindata.Region;
import imagindata.StateObject;
import imagindata.Transition;
import imagindata.diagram.edit.policies.ImaginDataBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class TransitionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public TransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Transition) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof StateObject && newEnd instanceof StateObject)) {
			return false;
		}
		StateObject target = getLink().getEnd();
		if (!(getLink().eContainer() instanceof Region)) {
			return false;
		}
		Region container = (Region) getLink().eContainer();
		return ImaginDataBaseItemSemanticEditPolicy.LinkConstraints
				.canExistTransition_4001(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof StateObject && newEnd instanceof StateObject)) {
			return false;
		}
		StateObject source = getLink().getStart();
		if (!(getLink().eContainer() instanceof Region)) {
			return false;
		}
		Region container = (Region) getLink().eContainer();
		return ImaginDataBaseItemSemanticEditPolicy.LinkConstraints
				.canExistTransition_4001(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setStart(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setEnd(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Transition getLink() {
		return (Transition) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected StateObject getOldSource() {
		return (StateObject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected StateObject getNewSource() {
		return (StateObject) newEnd;
	}

	/**
	 * @generated
	 */
	protected StateObject getOldTarget() {
		return (StateObject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected StateObject getNewTarget() {
		return (StateObject) newEnd;
	}
}
