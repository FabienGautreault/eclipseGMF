package imagindata.diagram.view.factories;

import imagindata.diagram.edit.parts.ConditionEditPart;
import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.FontStyle;
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
public class ConditionViewFactory implements IViewDecorator {
	/**
	 * @generated
	 */
	public static ConditionViewFactory INSTANCE = new ConditionViewFactory();

	/**
	 * @generated
	 */
	public void decorateView(View view) {
		if (view.eIsSet(NotationPackage.eINSTANCE.getView_Type())) {
			return;
		}
		view.setType(ImaginDataVisualIDRegistry
				.getType(ConditionEditPart.VISUAL_ID));
		FontStyle fontStyle = NotationFactory.eINSTANCE.createFontStyle();
		FontData defaultFontData = PreferenceConverter.getFontData(
				ImaginDataDiagramEditorPlugin.getInstance()
						.getPreferenceStore(),
				IPreferenceConstants.PREF_DEFAULT_FONT);
		fontStyle.setFontName(defaultFontData.getName());
		fontStyle.setFontHeight(defaultFontData.getHeight());
		fontStyle.setBold((defaultFontData.getStyle() & SWT.BOLD) != 0);
		fontStyle.setItalic((defaultFontData.getStyle() & SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB defaultFontColor = PreferenceConverter
				.getColor(ImaginDataDiagramEditorPlugin.getInstance()
						.getPreferenceStore(), IPreferenceConstants.PREF_FONT_COLOR);
		fontStyle.setFontColor((defaultFontColor.blue << 16)
				| (defaultFontColor.green << 8) | defaultFontColor.red);
		view.getStyles().add(fontStyle);
		create5008Label(view);
	}

	/**
	 * @generated
	 */
	private void create5008Label(View view) {
		Node label = NotationFactory.eINSTANCE.createNode();
		view.getPersistedChildren().add(label);
		ConditionConditionViewFactory.INSTANCE.decorateView(label);
	}
}
