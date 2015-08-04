package imagindata.diagram.edit.parts;

import imagindata.diagram.edit.policies.TransitionItemSemanticEditPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TransitionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public TransitionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TransitionItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TransitionSignalEditPart) {
			((TransitionSignalEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionSignalNameFigure());
			return true;
		}
		if (childEditPart instanceof TransitionGuardEditPart) {
			((TransitionGuardEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionGuardNameFigure());
			return true;
		}
		if (childEditPart instanceof TransitionEffectEditPart) {
			((TransitionEffectEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionEffectNameFigure());
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
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TransitionSignalEditPart) {
			return true;
		}
		if (childEditPart instanceof TransitionGuardEditPart) {
			return true;
		}
		if (childEditPart instanceof TransitionEffectEditPart) {
			return true;
		}
		return false;
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
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new TransitionFigure();
	}

	/**
	 * @generated
	 */
	public TransitionFigure getPrimaryShape() {
		return (TransitionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class TransitionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionSignalNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionGuardNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionEffectNameFigure;

		/**
		 * @generated
		 */
		public TransitionFigure() {
			this.setLineWidth(1);
			this.setForegroundColor(ColorConstants.black);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTransitionSignalNameFigure = new WrappingLabel();
			fFigureTransitionSignalNameFigure.setText("");

			this.add(fFigureTransitionSignalNameFigure);

			fFigureTransitionGuardNameFigure = new WrappingLabel();
			fFigureTransitionGuardNameFigure.setText("");

			this.add(fFigureTransitionGuardNameFigure);

			fFigureTransitionEffectNameFigure = new WrappingLabel();
			fFigureTransitionEffectNameFigure.setText("");

			this.add(fFigureTransitionEffectNameFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(3);
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionSignalNameFigure() {
			return fFigureTransitionSignalNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionGuardNameFigure() {
			return fFigureTransitionGuardNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionEffectNameFigure() {
			return fFigureTransitionEffectNameFigure;
		}

	}

}
