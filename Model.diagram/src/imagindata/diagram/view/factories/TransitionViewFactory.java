package imagindata.diagram.view.factories;

import imagindata.diagram.edit.parts.TransitionEditPart;
import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.gmf.runtime.lite.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.FillStyle;
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
public class TransitionViewFactory implements IViewDecorator {
	/**
	 * @generated
	 */
	public static TransitionViewFactory INSTANCE = new TransitionViewFactory();

	/**
	 * @generated
	 */
	public void decorateView(View view) {
		if (view.eIsSet(NotationPackage.eINSTANCE.getView_Type())) {
			return;
		}
		view.setType(ImaginDataVisualIDRegistry
				.getType(TransitionEditPart.VISUAL_ID));
		FontStyle fontStyle = NotationFactory.eINSTANCE.createFontStyle();
		FontData defaultFontData = PreferenceConverter.getFontData(
				ImaginDataDiagramEditorPlugin.getInstance()
						.getPreferenceStore(),
				IPreferenceConstants.DEFAULT_FONT);
		fontStyle.setFontName(defaultFontData.getName());
		fontStyle.setFontHeight(defaultFontData.getHeight());
		fontStyle.setBold((defaultFontData.getStyle() & SWT.BOLD) != 0);
		fontStyle.setItalic((defaultFontData.getStyle() & SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB defaultFontColor = PreferenceConverter
				.getColor(ImaginDataDiagramEditorPlugin.getInstance()
						.getPreferenceStore(), IPreferenceConstants.FONT_COLOR);
		fontStyle.setFontColor((defaultFontColor.blue << 16)
				| (defaultFontColor.green << 8) | defaultFontColor.red);
		view.getStyles().add(fontStyle);
		FillStyle fillStyle = NotationFactory.eINSTANCE.createFillStyle();
		org.eclipse.swt.graphics.RGB defaultFillColor = PreferenceConverter
				.getColor(ImaginDataDiagramEditorPlugin.getInstance()
						.getPreferenceStore(), IPreferenceConstants.FILL_COLOR);
		fillStyle.setFillColor((defaultFillColor.blue << 16)
				| (defaultFillColor.green << 8) | defaultFillColor.red);
		view.getStyles().add(fillStyle);
		create6001Label(view);
		create6002Label(view);
		create6003Label(view);
	}

	/**
	 * @generated
	 */
	private void create6001Label(View view) {
		Node label = NotationFactory.eINSTANCE.createNode();
		view.getPersistedChildren().add(label);
		TransitionSignalViewFactory.INSTANCE.decorateView(label);
	}

	/**
	 * @generated
	 */
	private void create6002Label(View view) {
		Node label = NotationFactory.eINSTANCE.createNode();
		view.getPersistedChildren().add(label);
		TransitionGuardViewFactory.INSTANCE.decorateView(label);
	}

	/**
	 * @generated
	 */
	private void create6003Label(View view) {
		Node label = NotationFactory.eINSTANCE.createNode();
		view.getPersistedChildren().add(label);
		TransitionEffectViewFactory.INSTANCE.decorateView(label);
	}
}
