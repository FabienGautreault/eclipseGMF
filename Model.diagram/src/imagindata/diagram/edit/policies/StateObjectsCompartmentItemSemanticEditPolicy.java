package imagindata.diagram.edit.policies;

import imagindata.diagram.edit.commands.ObjectCreateCommand;
import imagindata.diagram.providers.ImaginDataElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateObjectsCompartmentItemSemanticEditPolicy extends
		ImaginDataBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateObjectsCompartmentItemSemanticEditPolicy() {
		super(ImaginDataElementTypes.State_3004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ImaginDataElementTypes.Object_3002 == req.getElementType()) {
			return getGEFWrapper(new ObjectCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
