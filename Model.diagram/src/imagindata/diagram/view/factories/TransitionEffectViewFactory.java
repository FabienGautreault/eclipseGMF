package imagindata.diagram.view.factories;

import imagindata.diagram.edit.parts.TransitionEffectEditPart;
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
public class TransitionEffectViewFactory implements IViewDecorator {
	/**
	 * @generated
	 */
	public static TransitionEffectViewFactory INSTANCE = new TransitionEffectViewFactory();

	/**
	 * @generated
	 */
	public void decorateView(View view) {
		if (view.eIsSet(NotationPackage.eINSTANCE.getView_Type())) {
			return;
		}
		view.setType(ImaginDataVisualIDRegistry
				.getType(TransitionEffectEditPart.VISUAL_ID));
		Location location = NotationFactory.eINSTANCE.createLocation();

		location.setY(80);

		((Node) view).setLayoutConstraint(location);
	}
}
