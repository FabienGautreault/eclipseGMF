package imagindata.diagram.view.factories;

import imagindata.diagram.edit.parts.StateObjectsCompartmentEditPart;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class StateObjectsCompartmentViewFactory implements IViewDecorator {
	/**
	 * @generated
	 */
	public static StateObjectsCompartmentViewFactory INSTANCE = new StateObjectsCompartmentViewFactory();

	/**
	 * @generated
	 */
	public void decorateView(View view) {
		if (view.eIsSet(NotationPackage.eINSTANCE.getView_Type())) {
			return;
		}
		view.setType(ImaginDataVisualIDRegistry
				.getType(StateObjectsCompartmentEditPart.VISUAL_ID));
		DrawerStyle drawerStyle = NotationFactory.eINSTANCE.createDrawerStyle();
		view.getStyles().add(drawerStyle);
		TitleStyle titleStyle = NotationFactory.eINSTANCE.createTitleStyle();
		view.getStyles().add(titleStyle);
	}
}
