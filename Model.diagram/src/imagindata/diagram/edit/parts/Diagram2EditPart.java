package imagindata.diagram.edit.parts;

import imagindata.diagram.edit.policies.Diagram2CanonicalEditPolicy;
import imagindata.diagram.edit.policies.Diagram2ItemSemanticEditPolicy;
import imagindata.diagram.edit.policies.OpenDiagramEditPolicy;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;
import imagindata.diagram.providers.ImaginDataElementTypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class Diagram2EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3006;

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
	public Diagram2EditPart(View view) {
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
				new Diagram2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new Diagram2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (ImaginDataVisualIDRegistry.getVisualID(childView)) {
				case HistoricEditPart.VISUAL_ID:
				case AnchorEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		SubDiagramFigure figure = new SubDiagramFigure();
		figure.setUseLocalCoordinates(true);
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public SubDiagramFigure getPrimaryShape() {
		return (SubDiagramFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DiagramNameEditPart) {
			((DiagramNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureSubDiagramNameFigure());
			return true;
		}
		if (childEditPart instanceof HistoricEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(
					((HistoricEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof AnchorEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(
					((AnchorEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DiagramNameEditPart) {
			return true;
		}
		if (childEditPart instanceof HistoricEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((HistoricEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AnchorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((AnchorEditPart) childEditPart).getFigure());
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
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(125, 125);
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
	protected NodeFigure createMainFigure() {
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
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
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
				.getType(DiagramNameEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof StateEditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof InitExitEditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof imagindata.diagram.edit.parts.Diagram2EditPart) {
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
	public class SubDiagramFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubDiagramNameFigure;

		/**
		 * @generated
		 */
		public SubDiagramFigure() {
			this.setLayoutManager(new XYLayout());
			this.setLineWidth(1);
			this.setForegroundColor(ColorConstants.black);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSubDiagramNameFigure = new WrappingLabel();
			fFigureSubDiagramNameFigure.setText("");

			this.add(fFigureSubDiagramNameFigure);

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
		public WrappingLabel getFigureSubDiagramNameFigure() {
			return fFigureSubDiagramNameFigure;
		}

	}

}
