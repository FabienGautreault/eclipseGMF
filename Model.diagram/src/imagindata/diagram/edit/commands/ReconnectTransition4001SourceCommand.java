package imagindata.diagram.edit.commands;

import imagindata.Region;
import imagindata.diagram.view.factories.DomainElementInitializer;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.lite.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.lite.commands.ReconnectNotationalEdgeSourceCommand;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ReconnectTransition4001SourceCommand extends CommandWrapper {
	/**
	 * @generated
	 */
	private Edge edge;
	/**
	 * @generated
	 */
	private View newSource;
	/**
	 * @generated
	 */
	private View oldSource;

	/**
	 * @generated
	 */
	public ReconnectTransition4001SourceCommand(ReconnectRequest request) {
		this((Edge) request.getConnectionEditPart().getModel(), (View) request
				.getTarget().getModel());
	}

	/**
	 * @generated
	 */
	public ReconnectTransition4001SourceCommand(Edge edge, View newSource) {
		this.edge = edge;
		this.newSource = newSource;
		this.oldSource = edge.getSource();
	}

	/**
	 * @generated
	 */
	protected boolean prepare() {
		final boolean[] resultHolder = new boolean[1];
		//To validate the reconnection against constraints, the current link should be deleted. Of course, we must then undo its deletion.
		final TransactionalEditingDomain domainModelEditDomain = TransactionUtil
				.getEditingDomain(oldSource.getDiagram().getElement());
		Command command = new AbstractCommand() {
			private Command deleteCommand = createDomainModelRemoveCommand(domainModelEditDomain);

			public boolean canExecute() {
				return deleteCommand.canExecute();
			}

			public boolean canUndo() {
				return true;
			}

			public void redo() {
			}

			public void undo() {
			}

			public void execute() {
				deleteCommand.execute();
				try {
					resultHolder[0] = canReconnect();
				} finally {
					deleteCommand.undo();
				}
			}
		};
		if (!command.canExecute()) {
			return false;
		}
		new WrappingCommand(domainModelEditDomain, command).execute();
		if (!resultHolder[0]) {
			return false;
		}
		return super.prepare();
	}

	/**
	 * @generated
	 */
	private boolean canReconnect() {
		if (!DomainElementInitializer.LinkConstraints.canExistTransition_4001(
				newSource.getElement(), edge.getTarget().getElement())) {
			return false;
		}
		EObject containerEObj = getRelationshipContainer(
				newSource.getElement(), imagindata.imagindataPackage.eINSTANCE
						.getRegion());
		Region container = (Region) containerEObj;
		if (container == null) {
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected Command createCommand() {
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(oldSource.getDiagram().getElement());
		CompoundCommand result = new CompoundCommand();
		result
				.append(new ReconnectNotationalEdgeSourceCommand(edge,
						newSource));
		EObject container = getRelationshipContainer(newSource.getElement(),
				imagindata.imagindataPackage.eINSTANCE.getRegion());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		EObject oldContainer = edge.getElement().eContainer();
		if (oldContainer == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (oldContainer != container) {
			result.append(RemoveCommand.create(editingDomain, oldContainer,
					imagindata.imagindataPackage.eINSTANCE
							.getRegion_Transitions(), edge.getElement()));
			result.append(AddCommand.create(editingDomain, container,
					imagindata.imagindataPackage.eINSTANCE
							.getRegion_Transitions(), edge.getElement()));
		}
		result.append(SetCommand.create(editingDomain, edge.getElement(),
				imagindata.imagindataPackage.eINSTANCE.getTransition_Start(),
				newSource.getElement()));
		return result;
	}

	/**
	 * Finds container element for the relationship of the specified type.
	 * Default implementation goes up by containment hierarchy starting from
	 * the specified element and returns the first element that is instance of
	 * the specified container class.
	 * @generated
	 */
	protected EObject getRelationshipContainer(EObject element,
			EClass containerClass) {
		for (; element != null; element = element.eContainer()) {
			if (containerClass.isSuperTypeOf(element.eClass())) {
				return element;
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	private Command createDomainModelRemoveCommand(
			TransactionalEditingDomain editingDomain) {
		return DestroyElementCommand.create(editingDomain, edge.getElement());
	}
}
