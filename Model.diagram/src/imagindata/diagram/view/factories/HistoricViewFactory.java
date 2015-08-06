package imagindata.diagram.view.factories;

import imagindata.diagram.edit.parts.HistoricEditPart;
import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

/**
 * @generated
 */
public class HistoricViewFactory implements IViewDecorator {
	/**
	 * @generated
	 */
	public static HistoricViewFactory INSTANCE = new HistoricViewFactory();

	/**
	 * @generated
	 */
	public void decorateView(View view) {
		if (view.eIsSet(NotationPackage.eINSTANCE.getView_Type())) {
			return;
		}
		view.setType(ImaginDataVisualIDRegistry
				.getType(HistoricEditPart.VISUAL_ID));
		ShapeStyle style = NotationFactory.eINSTANCE.createShapeStyle();
		FontData defaultFontData = PreferenceConverter.getFontData(
				ImaginDataDiagramEditorPlugin.getInstance()
						.getPreferenceStore(),
				IPreferenceConstants.PREF_DEFAULT_FONT);
		style.setFontName(defaultFontData.getName());
		style.setFontHeight(defaultFontData.getHeight());
		style.setBold((defaultFontData.getStyle() & SWT.BOLD) != 0);
		style.setItalic((defaultFontData.getStyle() & SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB defaultFontColor = PreferenceConverter
				.getColor(ImaginDataDiagramEditorPlugin.getInstance()
						.getPreferenceStore(), IPreferenceConstants.PREF_FONT_COLOR);
		style.setFontColor((defaultFontColor.blue << 16)
				| (defaultFontColor.green << 8) | defaultFontColor.red);
		org.eclipse.swt.graphics.RGB defaultLineColor = PreferenceConverter
				.getColor(ImaginDataDiagramEditorPlugin.getInstance()
						.getPreferenceStore(), IPreferenceConstants.PREF_LINE_COLOR);
		style.setLineColor((defaultLineColor.blue << 16)
				| (defaultLineColor.green << 8) | defaultLineColor.red);
		org.eclipse.swt.graphics.RGB defaultFillColor = PreferenceConverter
				.getColor(ImaginDataDiagramEditorPlugin.getInstance()
						.getPreferenceStore(), IPreferenceConstants.PREF_FILL_COLOR);
		style.setFillColor((defaultFillColor.blue << 16)
				| (defaultFillColor.green << 8) | defaultFillColor.red);
		view.getStyles().add(style);
	}
}
