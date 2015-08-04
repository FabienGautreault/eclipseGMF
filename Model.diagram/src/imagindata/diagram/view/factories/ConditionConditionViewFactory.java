package imagindata.diagram.view.factories;

import imagindata.diagram.edit.parts.ConditionConditionEditPart;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ConditionConditionViewFactory implements IViewDecorator {
	/**
	 * @generated
	 */
	public static ConditionConditionViewFactory INSTANCE = new ConditionConditionViewFactory();

	/**
	 * @generated
	 */
	public void decorateView(View view) {
		if (view.eIsSet(NotationPackage.eINSTANCE.getView_Type())) {
			return;
		}
		view.setType(ImaginDataVisualIDRegistry
				.getType(ConditionConditionEditPart.VISUAL_ID));
	}
}
