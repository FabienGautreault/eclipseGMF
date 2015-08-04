package imagindata.diagram.view.factories;

import imagindata.diagram.edit.parts.TransitionGuardEditPart;
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
public class TransitionGuardViewFactory implements IViewDecorator {
	/**
	 * @generated
	 */
	public static TransitionGuardViewFactory INSTANCE = new TransitionGuardViewFactory();

	/**
	 * @generated
	 */
	public void decorateView(View view) {
		if (view.eIsSet(NotationPackage.eINSTANCE.getView_Type())) {
			return;
		}
		view.setType(ImaginDataVisualIDRegistry
				.getType(TransitionGuardEditPart.VISUAL_ID));
		Location location = NotationFactory.eINSTANCE.createLocation();

		location.setY(60);

		((Node) view).setLayoutConstraint(location);
	}
}
