package imagindata.diagram.view.factories;

import imagindata.diagram.edit.parts.DiagramEditPart;

import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.DiagramStyle;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DiagramViewFactory implements IViewDecorator {
	/**
	 * @generated
	 */
	public static DiagramViewFactory INSTANCE = new DiagramViewFactory();

	/**
	 * @generated
	 */
	public void decorateView(View view) {
		if (view.eIsSet(NotationPackage.eINSTANCE.getView_Type())) {
			return;
		}
		view.setType(DiagramEditPart.MODEL_ID);
		DiagramStyle style = NotationFactory.eINSTANCE.createDiagramStyle();
		view.getStyles().add(style);
	}
}
