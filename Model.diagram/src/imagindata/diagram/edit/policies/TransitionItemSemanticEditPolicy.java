package imagindata.diagram.edit.policies;

import imagindata.diagram.providers.ImaginDataElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class TransitionItemSemanticEditPolicy extends
		ImaginDataBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TransitionItemSemanticEditPolicy() {
		super(ImaginDataElementTypes.Transition_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
