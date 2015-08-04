package imagindata.diagram.edit.policies;

import imagindata.diagram.edit.parts.Anchor2EditPart;
import imagindata.diagram.edit.parts.ConditionEditPart;
import imagindata.diagram.edit.parts.Diagram2EditPart;
import imagindata.diagram.edit.parts.InitExitEditPart;
import imagindata.diagram.edit.parts.StateEditPart;
import imagindata.diagram.part.ImaginDataDiagramUpdater;
import imagindata.diagram.part.ImaginDataNodeDescriptor;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RegionCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = ImaginDataDiagramUpdater
				.getRegion_2007SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result
					.add(((ImaginDataNodeDescriptor) it.next())
							.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = ImaginDataVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case StateEditPart.VISUAL_ID:
		case InitExitEditPart.VISUAL_ID:
		case Diagram2EditPart.VISUAL_ID:
		case ConditionEditPart.VISUAL_ID:
		case Anchor2EditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(imagindata.imagindataPackage.eINSTANCE
					.getRegion_StateObjects());
		}
		return myFeaturesToSynchronize;
	}

}
