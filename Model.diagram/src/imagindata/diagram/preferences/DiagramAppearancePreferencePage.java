package imagindata.diagram.preferences;

import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;

import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;
import org.eclipse.gmf.runtime.lite.preferences.ColorsAndFontsPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramAppearancePreferencePage extends AppearancePreferencePage {

	/**
	 * @generated
	 */
	public DiagramAppearancePreferencePage() {
		setPreferenceStore(ImaginDataDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
