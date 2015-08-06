package imagindata.diagram.edit.policies;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.lite.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.lite.commands.RemoveNotationalElementCommand;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.notation.CanonicalStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RegionComponentEditPolicy extends ComponentEditPolicy {
	/**
	 * @generated
	 */
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(getDiagramNode().getDiagram().getElement());
		CompoundCommand cc = new CompoundCommand();
		cc.append(createDomainModelRemoveCommand(editingDomain));
		cc.append(new RemoveNotationalElementCommand((View) getDiagramNode()
				.eContainer(), getDiagramNode()));
		return new WrappingCommand(editingDomain, cc);
	}

	/**
	 * @generated
	 */
	protected Command getDeleteViewCommand(GroupRequest deleteRequest,
			boolean isForced) {
		if (!isForced && !canDeleteView()) {
			return UnexecutableCommand.INSTANCE;
		}
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(getDiagramNode().getDiagram().getElement());
		CompoundCommand cc = new CompoundCommand();
		cc.append(new RemoveNotationalElementCommand((View) getDiagramNode()
				.eContainer(), getDiagramNode()));
		return new WrappingCommand(editingDomain, cc);
	}

	/**
	 * @generated
	 */
	private boolean canDeleteView() {
		if (getDiagramNode().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			return true;
		}
		View parentView = (View) getDiagramNode().eContainer();
		if (parentView == null) {
			return true;
		}
		CanonicalStyle canonicalStyle = (CanonicalStyle) parentView
				.getStyle(NotationPackage.eINSTANCE.getCanonicalStyle());
		if (canonicalStyle != null) {
			return !canonicalStyle.isCanonical();
		}
		return false;
	}

	/**
	 * @generated
	 */
	private org.eclipse.emf.common.command.Command createDomainModelRemoveCommand(
			TransactionalEditingDomain editingDomain) {
		return DestroyElementCommand.create(editingDomain, getDiagramNode()
				.getElement());
	}

	/**
	 * @generated
	 */
	protected Node getDiagramNode() {
		return (Node) getHost().getModel();
	}
}
