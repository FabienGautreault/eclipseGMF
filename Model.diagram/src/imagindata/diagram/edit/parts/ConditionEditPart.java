package imagindata.diagram.edit.parts;

import imagindata.diagram.edit.policies.ConditionGraphicalNodeEditPolicy;
import imagindata.diagram.edit.policies.ConditionItemSemanticEditPolicy;
import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;
import imagindata.diagram.providers.ImaginDataElementTypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.TreeEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.edit.parts.decorations.IDecoratableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.decorations.IDecorationManager;
import org.eclipse.gmf.runtime.lite.edit.parts.decorations.PaneDecorationManager;
import org.eclipse.gmf.runtime.lite.edit.parts.labels.ILabelTextDisplayer;
import org.eclipse.gmf.runtime.lite.edit.parts.tree.BaseTreeEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.IExternallyUpdatableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.IUpdatableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.RefreshersRegistry;
import org.eclipse.gmf.runtime.lite.edit.parts.update.TransactionalUpdateManager;
import org.eclipse.gmf.runtime.lite.edit.parts.update.UpdaterUtil;
import org.eclipse.gmf.runtime.lite.edit.policies.DelegatingDirectEditPolicy;
import org.eclipse.gmf.runtime.lite.edit.policies.LabelDirectEditPolicy;
import org.eclipse.gmf.runtime.lite.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Widget;

/**
 * @generated
 */
public class ConditionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3007;

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
	public ConditionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ConditionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
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
		ConditionFigure figure = new ConditionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ConditionFigure getPrimaryShape() {
		return (ConditionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConditionConditionEditPart) {
			((ConditionConditionEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureConditionNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConditionConditionEditPart) {
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
	 * @generated NOT
	 * Permet de définir la forme de la figure, par défaut le rectangle englobant
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			//Permet de définir la shape et d'implanter les transitions sur celle cie et non sur le rectangle englobant
			public PointList getPolygonPoints() {
				PointList points = new PointList(5);
				//Angle en haut à gauche du rectangle
				Rectangle anchRect = getHandleBounds();

				//Ajout des points définissant le losange
				points.addPoint(anchRect.x + anchRect.width / 2, anchRect.y);//(w/2,0)
				points.addPoint(anchRect.x + anchRect.width, anchRect.y
						+ anchRect.height / 2);//(w,h/2)
				points.addPoint(anchRect.x + anchRect.width / 2, anchRect.y
						+ anchRect.height);//(w/2,h)
				points.addPoint(anchRect.x, anchRect.y + anchRect.height / 2);//(0,h/2)
				points.addPoint(anchRect.x + anchRect.width / 2, anchRect.y);//(w/2,0)
				return points;
			}
		
		};
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
				.getType(ConditionConditionEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof Diagram2EditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof HistoricEditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof AnchorEditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof imagindata.diagram.edit.parts.ConditionEditPart) {
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
	public class ConditionFigure extends Shape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConditionNameFigure;

		/**
		 * @generated
		 */
		public ConditionFigure() {
			this.setLayoutManager(new StackLayout());
			this.addPoint(new Point(getMapMode().DPtoLP(50), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(100), getMapMode()
					.DPtoLP(50)));
			this.addPoint(new Point(getMapMode().DPtoLP(50), getMapMode()
					.DPtoLP(100)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(50)));
			this.setFill(true);
			this.setLineWidth(1);
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(ColorConstants.white);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureConditionNameFigure = new WrappingLabel();
			fFigureConditionNameFigure.setText("");

			this.add(fFigureConditionNameFigure);

		}

		/**
		 * @generated
		 */
		private final PointList myTemplate = new PointList();
		/**
		 * @generated
		 */
		private Rectangle myTemplateBounds;

		/**
		 * @generated
		 */
		public void addPoint(Point point) {
			myTemplate.addPoint(point);
			myTemplateBounds = null;
		}

		/**
		 * @generated
		 */
		protected void fillShape(Graphics graphics) {
			Rectangle bounds = getBounds();
			graphics.pushState();
			graphics.translate(bounds.x, bounds.y);
			graphics.fillPolygon(scalePointList());
			graphics.popState();
		}

		/**
		 * @generated
		 */
		protected void outlineShape(Graphics graphics) {
			Rectangle bounds = getBounds();
			graphics.pushState();
			graphics.translate(bounds.x, bounds.y);
			graphics.drawPolygon(scalePointList());
			graphics.popState();
		}

		/**
		 * @generated
		 */
		private Rectangle getTemplateBounds() {
			if (myTemplateBounds == null) {
				myTemplateBounds = myTemplate.getBounds().getCopy().union(0, 0);
				//just safety -- we are going to use this as divider 
				if (myTemplateBounds.width < 1) {
					myTemplateBounds.width = 1;
				}
				if (myTemplateBounds.height < 1) {
					myTemplateBounds.height = 1;
				}
			}
			return myTemplateBounds;
		}

		/**
		 * @generated
		 */
		private int[] scalePointList() {
			Rectangle pointsBounds = getTemplateBounds();
			Rectangle actualBounds = getBounds();

			float xScale = ((float) actualBounds.width) / pointsBounds.width;
			float yScale = ((float) actualBounds.height) / pointsBounds.height;

			if (xScale == 1 && yScale == 1) {
				return myTemplate.toIntArray();
			}
			int[] scaled = (int[]) myTemplate.toIntArray().clone();
			for (int i = 0; i < scaled.length; i += 2) {
				scaled[i] = (int) Math.floor(scaled[i] * xScale);
				scaled[i + 1] = (int) Math.floor(scaled[i + 1] * yScale);
			}
			return scaled;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConditionNameFigure() {
			return fFigureConditionNameFigure;
		}

	}

}
