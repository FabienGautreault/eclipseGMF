package imagindata.diagram.edit.commands;

import imagindata.Diagram;
import imagindata.Historic;
import imagindata.diagram.view.factories.HistoricViewFactory;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.lite.commands.CreateNotationalNodeCommand;
import org.eclipse.gmf.runtime.lite.requests.CreateRequestEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CreateHistoric3008Command extends AbstractCommand {
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
	public CreateHistoric3008Command(View parent, CreateRequestEx request) {
		this(parent, request, null);
	}

	/**
	 * @generated
	 */
	public CreateHistoric3008Command(View parent, CreateRequestEx request,
			Rectangle constraint) {
		Historic createdDomainElement = imagindata.imagindataFactory.eINSTANCE
				.createHistoric();
		if (((Diagram) parent.getElement()).getHisto() != null) {
			domainModelAddCommand = null;
			notationAddCommand = null;
			return;
		}
		TransactionalEditingDomain domainModelEditDomain = TransactionUtil
				.getEditingDomain(parent.getDiagram().getElement());
		domainModelAddCommand = SetCommand.create(domainModelEditDomain, parent
				.getElement(), imagindata.imagindataPackage.eINSTANCE
				.getDiagram_Histo(), createdDomainElement);
		if (constraint != null) {
			constraint.width = 15;
			constraint.height = 15;
		}
		this.notationAddCommand = new CreateNotationalNodeCommand(parent,
				createdDomainElement, constraint, HistoricViewFactory.INSTANCE);
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
