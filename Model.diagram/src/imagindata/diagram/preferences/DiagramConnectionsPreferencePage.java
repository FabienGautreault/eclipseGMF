package imagindata.diagram.preferences;

import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(ImaginDataDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}

	/**
	 * @generated NOT
	 * Permet d'initialiser les préférences des connections à rectilinéar
	 */
	public static void initDefaults(IPreferenceStore preferenceStore) {
		preferenceStore.setDefault(IPreferenceConstants.PREF_LINE_STYLE,
				Routing.RECTILINEAR);
	}
}
