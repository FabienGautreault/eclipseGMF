package imagindata.diagram.view.factories;

import imagindata.diagram.edit.parts.DiagramNameEditPart;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DiagramNameViewFactory implements IViewDecorator {
	/**
	 * @generated
	 */
	public static DiagramNameViewFactory INSTANCE = new DiagramNameViewFactory();

	/**
	 * @generated
	 */
	public void decorateView(View view) {
		if (view.eIsSet(NotationPackage.eINSTANCE.getView_Type())) {
			return;
		}
		view.setType(ImaginDataVisualIDRegistry
				.getType(DiagramNameEditPart.VISUAL_ID));
	}
}
