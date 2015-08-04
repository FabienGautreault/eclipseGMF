package imagindata.diagram.preferences;

import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.gmf.runtime.diagram.ui.preferences.DiagramsPreferencePage;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * @generated
 */
public class DiagramGeneralPreferencePage extends DiagramsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramGeneralPreferencePage() {
		setPreferenceStore(ImaginDataDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
