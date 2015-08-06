package imagindata.diagram.edit.parts;

import imagindata.State;
import imagindata.diagram.edit.policies.StateItemSemanticEditPolicy;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;
import imagindata.diagram.providers.ImaginDataElementTypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class StateEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public StateEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new StateItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		StateFigure figure = new StateFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public StateFigure getPrimaryShape() {
		return (StateFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StateNameEditPart) {
			((StateNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureStateNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StateNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(75, 75);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ImaginDataVisualIDRegistry
				.getType(StateNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(ImaginDataElementTypes.Transition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof imagindata.diagram.edit.parts.StateEditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof InitExitEditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Diagram2EditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof HistoricEditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof AnchorEditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Anchor2EditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.State_3004);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.InitExit_3005);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.Diagram_3006);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.Historic_3008);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.Anchor_3009);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.Condition_3007);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.Anchor_3010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(ImaginDataElementTypes.Transition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.State_3004);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.InitExit_3005);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.Diagram_3006);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.Historic_3008);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.Anchor_3009);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.Condition_3007);
		}
		if (relationshipType == ImaginDataElementTypes.Transition_4001) {
			types.add(ImaginDataElementTypes.Anchor_3010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == ImaginDataElementTypes.Object_3002) {
				return getChildBySemanticHint(ImaginDataVisualIDRegistry
						.getType(StateObjectsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated NOT
	 * Permet de rafraichir la vue aux changements de propriétés
	 */
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof State) {
			//refresh graphique
			getPrimaryShape().updateFace();
		}
		//force le refresh de l'éditeur pour afficher toutes les transitions
		EditPart mainEditPart = (EditPart) (this.getRoot().getChildren().get(0));
		CanonicalEditPolicy cep = (CanonicalEditPolicy) mainEditPart
				.getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
		if (cep != null)
			cep.refresh();
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated
	 */
	public class StateFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStateNameFigure;

		/**
		 * @generated NOT
		 */
		public StateFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(1);
			//Ajout
			updateFace();

			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureStateNameFigure = new WrappingLabel();
			fFigureStateNameFigure.setText("");

			this.add(fFigureStateNameFigure);

			RectangleFigure objectCompartment0 = new RectangleFigure();
			objectCompartment0.setLineWidth(1);

			this.add(objectCompartment0);

		}

		/**
		 * @generated NOT
		 * Permet de changer le modèle graphique de la figure en fonction de son état
		 * Implémenté pour la démonstration mais doit être changer pour coller à la conception
		 */
		public void updateFace() {
			State state = (State) ((Node) StateEditPart.this.getModel())
					.getElement();

			//Permet de faire changer la figure en fonction de la propriété "type"
			if (state.getType().getLiteral().equals("Standard")) {
				this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
						getMapMode().DPtoLP(8)));
				this.setLineStyle(1);
				this
						.setForegroundColor(org.eclipse.draw2d.ColorConstants.black);
			} else if (state.getType().getLiteral().equals("Emission")) {
				this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(40),
						getMapMode().DPtoLP(40)));
				this.setLineStyle(2);
				this
						.setForegroundColor(org.eclipse.draw2d.ColorConstants.lightGray);
			} else {
				this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(40),
						getMapMode().DPtoLP(40)));
				this.setLineStyle(2);
				this
						.setForegroundColor(org.eclipse.draw2d.ColorConstants.lightGray);
			}

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStateNameFigure() {
			return fFigureStateNameFigure;
		}

	}

}
