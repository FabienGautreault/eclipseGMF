package imagindata.diagram.edit.parts;

import imagindata.Activator;
import imagindata.diagram.edit.policies.HistoricGraphicalNodeEditPolicy;
import imagindata.diagram.edit.policies.HistoricItemSemanticEditPolicy;
import imagindata.diagram.part.ImaginDataDiagramEditorPlugin;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;
import imagindata.diagram.providers.ImaginDataElementTypes;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.DragTracker;
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
import org.eclipse.gef.tools.DragEditPartsTracker;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.edit.parts.decorations.IDecoratableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.decorations.IDecorationManager;
import org.eclipse.gmf.runtime.lite.edit.parts.decorations.PaneDecorationManager;
import org.eclipse.gmf.runtime.lite.edit.parts.tree.BaseTreeEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.IExternallyUpdatableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.IUpdatableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.RefreshersRegistry;
import org.eclipse.gmf.runtime.lite.edit.parts.update.TransactionalUpdateManager;
import org.eclipse.gmf.runtime.lite.edit.parts.update.UpdaterUtil;
import org.eclipse.gmf.runtime.lite.edit.policies.SideAffixedDragEditPolicy;
import org.eclipse.gmf.runtime.lite.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.lite.figures.ExternalChildPositionTracker;
import org.eclipse.gmf.runtime.lite.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.ColorDescriptor;
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
public class HistoricEditPart extends AbstractBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3008;

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
	public HistoricEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new HistoricItemSemanticEditPolicy());
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
	 * permet de récupérer le figure et de lui appliquer l'image SVG
	 * Utilisation de l'activator pour éviter les problèmes d'export
	 */
	protected IFigure createNodeShape() {
		URL url = FileLocator.find(Activator.getInstance().getBundle(),
				new Path("SVGImages/HistoricSVGFigure.svg"), null); //$NON-NLS-1$
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
	 * redfinition de la forme de la figure, par défaut le rectangle englobant
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

				//Ajout des points décrivant le cercle
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

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
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
		if (targetEditPart instanceof imagindata.diagram.edit.parts.HistoricEditPart) {
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

}
