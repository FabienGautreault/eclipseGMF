package imagindata.diagram.edit.policies;

import imagindata.diagram.edit.parts.ObjectEditPart;
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
public class StateObjectsCompartmentCanonicalEditPolicy extends
		CanonicalEditPolicy {

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
				.getStateObjectsCompartment_7003SemanticChildren(viewObject)
				.iterator(); it.hasNext();) {
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
		case ObjectEditPart.VISUAL_ID:
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
					.getState_Objects());
		}
		return myFeaturesToSynchronize;
	}

}
