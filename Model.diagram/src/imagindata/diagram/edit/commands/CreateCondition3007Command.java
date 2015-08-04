package imagindata.diagram.edit.commands;

import imagindata.Condition;
import imagindata.diagram.view.factories.ConditionViewFactory;
import imagindata.diagram.view.factories.DomainElementInitializer;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.lite.commands.CreateNotationalNodeCommand;
import org.eclipse.gmf.runtime.lite.requests.CreateRequestEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CreateCondition3007Command extends AbstractCommand {
	/**
	 * @generated
	 */
	private final CreateNotationalNodeCommand notationAddCommand;

	/**
	 * @generated
	 */
	private final Command domainModelAddCommand;

	/**
	 * @generated
	 */
	public CreateCondition3007Command(View parent, CreateRequestEx request) {
		this(parent, request, null);
	}

	/**
	 * @generated
	 */
	public CreateCondition3007Command(View parent, CreateRequestEx request,
			Rectangle constraint) {
		Condition createdDomainElement = imagindata.imagindataFactory.eINSTANCE
				.createCondition();
		DomainElementInitializer.init_Condition_3007(createdDomainElement);
		TransactionalEditingDomain domainModelEditDomain = TransactionUtil
				.getEditingDomain(parent.getDiagram().getElement());
		domainModelAddCommand = AddCommand.create(domainModelEditDomain, parent
				.getElement(), imagindata.imagindataPackage.eINSTANCE
				.getRegion_StateObjects(), createdDomainElement);
		if (constraint != null) {
			constraint.union(new Dimension(50, 50));
		}
		this.notationAddCommand = new CreateNotationalNodeCommand(parent,
				createdDomainElement, constraint, ConditionViewFactory.INSTANCE);
		request.setCreatedObject(notationAddCommand.getCreatedView());
	}

	/**
	 * @generated
	 */
	protected boolean prepare() {
		return domainModelAddCommand != null
				&& domainModelAddCommand.canExecute()
				&& notationAddCommand != null
				&& notationAddCommand.canExecute();
	}

	/**
	 * @generated
	 */
	public boolean canUndo() {
		return domainModelAddCommand != null && domainModelAddCommand.canUndo()
				&& notationAddCommand != null && notationAddCommand.canUndo();
	}

	/**
	 * @generated
	 */
	public void execute() {
		domainModelAddCommand.execute();
		notationAddCommand.execute();
	}

	/**
	 * @generated
	 */
	public void undo() {
		notationAddCommand.undo();
		domainModelAddCommand.undo();
	}

	/**
	 * @generated
	 */
	public void redo() {
		execute();
	}
}
