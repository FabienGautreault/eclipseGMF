package imagindata.diagram.edit.commands;

import imagindata.Region;
import imagindata.diagram.view.factories.DomainElementInitializer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.lite.commands.VetoCommand;
import org.eclipse.gmf.runtime.lite.requests.CreateConnectionRequestEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CreateTransition4001StartCommand extends VetoCommand {
	/**
	 * @generated
	 */
	private View source;

	/**
	 * @generated
	 */
	public CreateTransition4001StartCommand(CreateConnectionRequestEx requestEx) {
		//Until the mouse button is pressed, the source of the connection is in request.getTargetEditPart(), not in request.getSourceEditPart().
		source = (View) requestEx.getTargetEditPart().getModel();
	}

	/**
	 * @generated
	 */
	protected boolean shouldExecute() {
		if (source == null) {
			return false;
		}
		if (!DomainElementInitializer.LinkConstraints.canExistTransition_4001(
				source.getElement(), null)) {
			return false;
		}
		EObject containerEObj = getRelationshipContainer(source.getElement(),
				imagindata.imagindataPackage.eINSTANCE.getRegion());
		Region container = (Region) containerEObj;
		if (container == null) {
			return false;
		}
		return true;
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
