package imagindata.diagram.edit.policies;

import imagindata.diagram.edit.parts.DiagramEditPart;
import imagindata.diagram.edit.parts.Diagram2EditPart.SubDiagramFigure;
import imagindata.diagram.part.ImaginDataDiagramEditor;
import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;
import imagindata.diagram.part.ImaginDataDiagramEditorUtil;
import imagindata.diagram.part.Messages;

import java.awt.Window;
import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Matcher;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.graphics.Pattern;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * @generated
 */
public class OpenDiagramEditPolicy extends OpenEditPolicy {

	/**
	 * @generated NOT
	 */
	private String subDiagramName;

	/**
	 * @generated NOT
	 */
	protected Command getOpenCommand(Request request) {
		EditPart targetEditPart = getTargetEditPart(request);
		if (false == targetEditPart.getModel() instanceof View) {
			return null;
		}
		View view = (View) targetEditPart.getModel();
		Style link = view.getStyle(NotationPackage.eINSTANCE
				.getHintedDiagramLinkStyle());
		//Recherche du nom du diagram qui va matcher ce pattern
		java.util.regex.Pattern p = java.util.regex.Pattern
				.compile(("(.*?)*: (.*?)\\).*?"));

		String s = view.getElement().toString();
		Matcher m = p.matcher(s);

		while (m.find()) {
			subDiagramName = m.group(2);
		}

		if (false == link instanceof HintedDiagramLinkStyle) {
			return null;
		}
		return new ICommandProxy(new OpenDiagramCommand(
				(HintedDiagramLinkStyle) link, subDiagramName));
	}

	/**
	 * @generated
	 */
	private static class OpenDiagramCommand extends
			AbstractTransactionalCommand {

		/**
		 * @generated
		 */
		private final HintedDiagramLinkStyle diagramFacet;

		/**
		 * @generated NOT
		 */
		private String subDiagramName;

		/**
		 * @generated
		 */
		OpenDiagramCommand(HintedDiagramLinkStyle linkStyle) {
			// editing domain is taken for original diagram, 
			// if we open diagram from another file, we should use another editing domain
			super(TransactionUtil.getEditingDomain(linkStyle),
					Messages.CommandName_OpenDiagram, null);
			diagramFacet = linkStyle;
		}

		/**
		 * @generated NOT
		 */
		OpenDiagramCommand(HintedDiagramLinkStyle linkStyle,
				String subDiagramName) {
			// editing domain is taken for original diagram, 
			// if we open diagram from another file, we should use another editing domain
			super(TransactionUtil.getEditingDomain(linkStyle),
					Messages.CommandName_OpenDiagram, null);
			diagramFacet = linkStyle;
			this.subDiagramName = subDiagramName;
		}

		// FIXME canExecute if  !(readOnly && getDiagramToOpen == null), i.e. open works on ro diagrams only when there's associated diagram already

		/**
		 * @generated NOT
		 */
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			try {
				Diagram diagram = getDiagramToOpen();
				if (diagram == null) {
					diagram = intializeNewDiagram();
				}
				URI uri = EcoreUtil.getURI(diagram);
				//String editorName = uri.lastSegment()
				//+ "#" + diagram.eResource().getContents().indexOf(diagram); //$NON-NLS-1$
				//Mise à jour du nom du diagramme et de l'extension
				String editorName = subDiagramName + "." + uri.fileExtension();
				IEditorInput editorInput = new URIEditorInput(uri, editorName);
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				page.openEditor(editorInput, getEditorID());
				return CommandResult.newOKCommandResult();
			} catch (Exception ex) {
				throw new ExecutionException("Can't open diagram", ex);
			}
		}

		/**
		 * @generated
		 */
		protected Diagram getDiagramToOpen() {
			return diagramFacet.getDiagramLink();
		}

		/**
		 * @generated
		 */
		protected Diagram intializeNewDiagram() throws ExecutionException {
			Diagram d = ViewService.createDiagram(getDiagramDomainElement(),
					getDiagramKind(), getPreferencesHint());
			if (d == null) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind");
			}
			diagramFacet.setDiagramLink(d);
			assert diagramFacet.eResource() != null;
			diagramFacet.eResource().getContents().add(d);
			EObject container = diagramFacet.eContainer();
			while (container instanceof View) {
				((View) container).persist();
				container = container.eContainer();
			}
			try {
				for (Iterator it = diagramFacet.eResource().getResourceSet()
						.getResources().iterator(); it.hasNext();) {
					Resource nextResource = (Resource) it.next();
					if (nextResource.isLoaded()
							&& !getEditingDomain().isReadOnly(nextResource)) {
						nextResource.save(ImaginDataDiagramEditorUtil
								.getSaveOptions());
					}
				}
			} catch (IOException ex) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind", ex);
			}
			return d;
		}

		/**
		 * @generated
		 */
		protected EObject getDiagramDomainElement() {
			// use same element as associated with EP
			return ((View) diagramFacet.eContainer()).getElement();
		}

		/**
		 * @generated
		 */
		protected PreferencesHint getPreferencesHint() {
			// XXX prefhint from target diagram's editor?
			return ImaginDataDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
		}

		/**
		 * @generated
		 */
		protected String getDiagramKind() {
			return DiagramEditPart.MODEL_ID;
		}

		/**
		 * @generated
		 */
		protected String getEditorID() {
			return ImaginDataDiagramEditor.ID;
		}
	}

}
