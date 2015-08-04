package imagindata.diagram.edit.commands;

import imagindata.Region;
import imagindata.diagram.view.factories.DomainElementInitializer;
import imagindata.diagram.view.factories.RegionViewFactory;

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
public class CreateRegion2007Command extends AbstractCommand {
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
	public CreateRegion2007Command(View parent, CreateRequestEx request) {
		this(parent, request, null);
	}

	/**
	 * @generated
	 */
	public CreateRegion2007Command(View parent, CreateRequestEx request,
			Rectangle constraint) {
		Region createdDomainElement = imagindata.imagindataFactory.eINSTANCE
				.createRegion();
		DomainElementInitializer.init_Region_2007(createdDomainElement);
		TransactionalEditingDomain domainModelEditDomain = TransactionUtil
				.getEditingDomain(parent.getDiagram().getElement());
		domainModelAddCommand = AddCommand.create(domainModelEditDomain, parent
				.getElement(), imagindata.imagindataPackage.eINSTANCE
				.getDiagram_Regions(), createdDomainElement);
		if (constraint != null) {
			constraint.width = 1000;
			constraint.height = 500;
		}
		this.notationAddCommand = new CreateNotationalNodeCommand(parent,
				createdDomainElement, constraint, RegionViewFactory.INSTANCE);
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
