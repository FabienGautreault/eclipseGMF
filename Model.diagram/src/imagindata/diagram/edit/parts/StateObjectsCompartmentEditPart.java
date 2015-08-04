package imagindata.diagram.edit.parts;

import imagindata.State;
import imagindata.diagram.edit.policies.StateObjectsCompartmentCanonicalEditPolicy;
import imagindata.diagram.edit.policies.StateObjectsCompartmentItemSemanticEditPolicy;
import imagindata.diagram.edit.policies.StateObjectsCompartmentLayoutEditPolicy;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;
import imagindata.diagram.part.Messages;

import imagindata.diagram.view.factories.ObjectViewFactory;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.Viewport;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.lite.commands.CreateNotationalElementCommand;
import org.eclipse.gmf.runtime.lite.commands.CreateNotationalNodeCommand;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.lite.edit.parts.update.IExternallyUpdatableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.IUpdatableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.RefreshersRegistry;
import org.eclipse.gmf.runtime.lite.edit.parts.update.TransactionalUpdateManager;
import org.eclipse.gmf.runtime.lite.edit.parts.update.UpdaterUtil;
import org.eclipse.gmf.runtime.lite.edit.parts.update.canonical.ChildNotationModelRefresher;
import org.eclipse.gmf.runtime.lite.edit.parts.update.canonical.ElementDescriptor;
import org.eclipse.gmf.runtime.lite.figures.CompartmentFigure;
import org.eclipse.gmf.runtime.lite.handles.CompartmentNameHandle;
import org.eclipse.gmf.runtime.notation.CanonicalStyle;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class StateObjectsCompartmentEditPart extends ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7003;

	/**
	 * @generated
	 */
	public StateObjectsCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.StateObjectsCompartmentEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new StateObjectsCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new StateObjectsCompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

}
