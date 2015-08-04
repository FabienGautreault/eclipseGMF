package imagindata.diagram.view.factories;

import imagindata.diagram.edit.parts.Diagram2EditPart;
import imagindata.diagram.edit.parts.DiagramEditPart;
import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.gmf.runtime.lite.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.DiagramStyle;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

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
