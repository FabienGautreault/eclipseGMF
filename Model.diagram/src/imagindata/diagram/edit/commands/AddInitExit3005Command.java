package imagindata.diagram.edit.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.lite.commands.ExpandDrawerCommand;
import org.eclipse.gmf.runtime.lite.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AddInitExit3005Command extends CommandWrapper {
	/**
	 * @generated
	 */
	private final View parentView;
	/**
	 * @generated
	 */
	private final Node childNode;
	/**
	 * @generated
	 */
	private final Rectangle constraint;

	/**
	 * @generated
	 */
	public AddInitExit3005Command(View parentView, Node childNode,
			int newVisualID, Rectangle constraint) {
		this.parentView = parentView;
		this.childNode = childNode;
		this.constraint = constraint;
	}

	/**
	 * @generated
	 */
	protected Command createCommand() {
		CompoundCommand result = new CompoundCommand();
		EObject element = childNode.getElement();
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(parentView.getDiagram().getElement());
		result.append(RemoveCommand
				.create(editingDomain, element.eContainer(),
						imagindata.imagindataPackage.eINSTANCE
								.getRegion_StateObjects(), element));
		result.append(AddCommand
				.create(editingDomain, parentView.getElement(),
						imagindata.imagindataPackage.eINSTANCE
								.getRegion_StateObjects(), element));
		result.append(RemoveCommand.create(editingDomain, childNode
				.eContainer(), childNode.eContainmentFeature(), childNode));
		result.append(new ExpandDrawerCommand(parentView));
		result.append(AddCommand.create(editingDomain, parentView,
				NotationPackage.eINSTANCE.getView_PersistedChildren(),
				childNode));
		result.append(new SetBoundsCommand(childNode, constraint));
		return result;
	}
}
