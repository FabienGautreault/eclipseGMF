package imagindata.diagram.edit.commands;

import imagindata.Region;
import imagindata.Transition;
import imagindata.diagram.view.factories.DomainElementInitializer;
import imagindata.diagram.view.factories.TransitionViewFactory;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.lite.requests.CreateConnectionRequestEx;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CreateTransition4001Command extends AbstractCommand {
	/**
	 * @generated
	 */
	private final View source;

	/**
	 * @generated
	 */
	private final View target;

	/**
	 * @generated
	 */
	private final Edge createdEdge;

	/**
	 * @generated
	 */
	private Command domainModelAddCommand;

	/**
	 * @generated
	 */
	public CreateTransition4001Command(CreateConnectionRequestEx requestEx) {
		if (requestEx.getSourceEditPart().getModel() instanceof View) {
			source = (View) requestEx.getSourceEditPart().getModel();
		} else {
			source = null;
		}
		if (requestEx.getTargetEditPart().getModel() instanceof View) {
			target = (View) requestEx.getTargetEditPart().getModel();
		} else {
			target = null;
		}
		if (source == null || target == null) {
			createdEdge = null;
			return;
		}
		createdEdge = NotationFactory.eINSTANCE.createEdge();
		Transition createdDomainElement = imagindata.imagindataFactory.eINSTANCE
				.createTransition();
		createdEdge.setElement(createdDomainElement);
		DomainElementInitializer.init_Transition_4001(createdDomainElement);
		TransitionViewFactory.INSTANCE.decorateView(createdEdge);
	}

	/**
	 * @generated
	 */
	protected boolean prepare() {
		if (source == null || target == null || createdEdge == null) {
			return false;
		}
		if (!DomainElementInitializer.LinkConstraints.canExistTransition_4001(
				source.getElement(), target.getElement())) {
			return false;
		}
		domainModelAddCommand = initializeDomainModelCommand();
		if (domainModelAddCommand == null
				|| !domainModelAddCommand.canExecute()) {
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	private Command initializeDomainModelCommand() {
		EObject containerEObj = getRelationshipContainer(source.getElement(),
				imagindata.imagindataPackage.eINSTANCE.getRegion());
		Region container = (Region) containerEObj;
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (((Transition) createdEdge.getElement()).getStart() != null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (((Transition) createdEdge.getElement()).getEnd() != null) {
			return UnexecutableCommand.INSTANCE;
		}
		TransactionalEditingDomain domainModelEditDomain = TransactionUtil
				.getEditingDomain(source.getDiagram().getElement());
		CompoundCommand addLinkEndsCommand = new CompoundCommand();
		addLinkEndsCommand.append(AddCommand.create(domainModelEditDomain,
				container, imagindata.imagindataPackage.eINSTANCE
						.getRegion_Transitions(), createdEdge.getElement()));
		addLinkEndsCommand.append(SetCommand.create(domainModelEditDomain,
				createdEdge.getElement(),
				imagindata.imagindataPackage.eINSTANCE.getTransition_Start(),
				source.getElement()));
		addLinkEndsCommand.append(SetCommand.create(domainModelEditDomain,
				createdEdge.getElement(),
				imagindata.imagindataPackage.eINSTANCE.getTransition_End(),
				target.getElement()));
		return addLinkEndsCommand;
	}

	/**
	 * @generated
	 */
	public boolean canUndo() {
		return source != null && target != null && createdEdge != null
				&& domainModelAddCommand != null
				&& domainModelAddCommand.canUndo();
	}

	/**
	 * @generated
	 */
	public void execute() {
		domainModelAddCommand.execute();
		source.getDiagram().insertEdge(createdEdge);
		createdEdge.setSource(source);
		createdEdge.setTarget(target);
	}

	/**
	 * @generated
	 */
	public void undo() {
		domainModelAddCommand.undo();
		source.getDiagram().removeEdge(createdEdge);
		createdEdge.setSource(null);
		createdEdge.setTarget(null);
	}

	/**
	 * @generated
	 */
	public void redo() {
		execute();
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
}
