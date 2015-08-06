package imagindata.diagram.edit.parts;

import imagindata.Activator;
import imagindata.Anchor;
import imagindata.diagram.edit.policies.Anchor2ItemSemanticEditPolicy;
import imagindata.diagram.providers.ImaginDataElementTypes;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class Anchor2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3010;

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
	public Anchor2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Anchor2ItemSemanticEditPolicy());
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
	 * @generated NOT
	 * Permet de récupérer la figure et d'y appliquer l'image svg
	 * Utilsiation de l'activator pour éviter les problèmes d'export
	 */
	protected IFigure createNodeShape() {
		Anchor test = (Anchor) ((Node) Anchor2EditPart.this.getModel())
				.getElement();
		URL url = null;
		if (test.getType().getLiteral().equals("Entry")) {
			url = FileLocator.find(Activator.getInstance().getBundle(),
					new Path("SVGImages/EntryPortRegion.svg"), null); //$NON-NLS-1$
		} else if (test.getType().getLiteral().equals("Exit")) {
			url = FileLocator.find(Activator.getInstance().getBundle(),
					new Path("SVGImages/ExitPortRegion.svg"), null); //$NON-NLS-1$
		}
		return new ScalableImageFigure(RenderedImageFactory.getInstance(url),
				true, true, true);
	}

	/**
	 * @generated
	 */
	public ScalableImageFigure getPrimaryShape() {
		return (ScalableImageFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 * redéfinition de la forme de la figure, par défaut le rectangle englobant
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(15, 15) {
			//Permet de définir la shape et d'implanter les transitions sur celle cie et non sur le rectangle englobant
			public PointList getPolygonPoints() {
				PointList points = new PointList(17);
				//Angle en haut à gauche du rectangle
				Rectangle anchRect = getHandleBounds();
				//Coordonnées du centre de la shape
				int radius = anchRect.width / 2;
				int CenterX = anchRect.x + radius;
				int CenterY = anchRect.y + radius;

				//Ajout des points du cercle
				points.addPoint(CenterX, anchRect.y);
				points
						.addPoint((int) (CenterX + radius
								* Math.cos(-67 * Math.PI / 180)),
								(int) (CenterY + radius
										* Math.sin(-67 * Math.PI / 180)));
				points
						.addPoint((int) (CenterX + radius
								* Math.cos(-45 * Math.PI / 180)),
								(int) (CenterY + radius
										* Math.sin(-45 * Math.PI / 180)));
				points
						.addPoint((int) (CenterX + radius
								* Math.cos(-22 * Math.PI / 180)),
								(int) (CenterY + radius
										* Math.sin(-22 * Math.PI / 180)));
				points.addPoint(anchRect.x + anchRect.width, CenterY);
				points
						.addPoint((int) (CenterX + radius
								* Math.cos(22 * Math.PI / 180)),
								(int) (CenterY + radius
										* Math.sin(22 * Math.PI / 180)));
				points
						.addPoint((int) (CenterX + radius
								* Math.cos(45 * Math.PI / 180)),
								(int) (CenterY + radius
										* Math.sin(45 * Math.PI / 180)));
				points
						.addPoint((int) (CenterX + radius
								* Math.cos(67 * Math.PI / 180)),
								(int) (CenterY + radius
										* Math.sin(67 * Math.PI / 180)));
				points.addPoint(CenterX, anchRect.y + anchRect.height);
				points
						.addPoint((int) (CenterX + radius
								* Math.cos(112 * Math.PI / 180)),
								(int) (CenterY + radius
										* Math.sin(112 * Math.PI / 180)));
				points
						.addPoint((int) (CenterX + radius
								* Math.cos(135 * Math.PI / 180)),
								(int) (CenterY + radius
										* Math.sin(135 * Math.PI / 180)));
				points
						.addPoint((int) (CenterX + radius
								* Math.cos(157 * Math.PI / 180)),
								(int) (CenterY + radius
										* Math.sin(157 * Math.PI / 180)));
				points.addPoint(anchRect.x, CenterY);
				points.addPoint((int) (CenterX + radius
						* Math.cos(-112 * Math.PI / 180)),
						(int) (CenterY + radius
								* Math.sin(-112 * Math.PI / 180)));
				points.addPoint((int) (CenterX + radius
						* Math.cos(-135 * Math.PI / 180)),
						(int) (CenterY + radius
								* Math.sin(-135 * Math.PI / 180)));
				points.addPoint((int) (CenterX + radius
						* Math.cos(-157 * Math.PI / 180)),
						(int) (CenterY + radius
								* Math.sin(-157 * Math.PI / 180)));
				points.addPoint(CenterX, anchRect.y);
				return points;
			}
		};
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
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
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(ImaginDataElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof imagindata.diagram.edit.parts.Anchor2EditPart) {
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

}
