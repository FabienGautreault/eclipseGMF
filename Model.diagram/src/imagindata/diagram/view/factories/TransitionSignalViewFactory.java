package imagindata.diagram.view.factories;

import imagindata.diagram.edit.parts.TransitionSignalEditPart;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TransitionSignalViewFactory implements IViewDecorator {
	/**
	 * @generated
	 */
	public static TransitionSignalViewFactory INSTANCE = new TransitionSignalViewFactory();

	/**
	 * @generated
	 */
	public void decorateView(View view) {
		if (view.eIsSet(NotationPackage.eINSTANCE.getView_Type())) {
			return;
		}
		view.setType(ImaginDataVisualIDRegistry
				.getType(TransitionSignalEditPart.VISUAL_ID));
		Location location = NotationFactory.eINSTANCE.createLocation();

		location.setY(40);

		((Node) view).setLayoutConstraint(location);
	}
}
