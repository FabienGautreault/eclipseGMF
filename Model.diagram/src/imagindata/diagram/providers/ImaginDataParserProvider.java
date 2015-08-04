package imagindata.diagram.providers;

import imagindata.diagram.edit.parts.ConditionConditionEditPart;
import imagindata.diagram.edit.parts.DiagramNameEditPart;
import imagindata.diagram.edit.parts.ObjectEditPart;
import imagindata.diagram.edit.parts.StateNameEditPart;
import imagindata.diagram.edit.parts.TransitionEffectEditPart;
import imagindata.diagram.edit.parts.TransitionGuardEditPart;
import imagindata.diagram.edit.parts.TransitionSignalEditPart;
import imagindata.diagram.parsers.MessageFormatMessageFormatParser;
import imagindata.diagram.parsers.MessageFormatParser;
import imagindata.diagram.part.ImaginDataVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ImaginDataParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser stateName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5006Parser() {
		if (stateName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getState_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getState_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			stateName_5006Parser = parser;
		}
		return stateName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser object_3002Parser;

	/**
	 * @generated
	 */
	private IParser getObject_3002Parser() {
		if (object_3002Parser == null) {
			EAttribute[] features = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getObject_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			object_3002Parser = parser;
		}
		return object_3002Parser;
	}

	/**
	 * @generated
	 */
	private IParser diagramName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getDiagramName_5007Parser() {
		if (diagramName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getDiagram_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getDiagram_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			diagramName_5007Parser = parser;
		}
		return diagramName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionCondition_5008Parser;

	/**
	 * @generated
	 */
	private IParser getConditionCondition_5008Parser() {
		if (conditionCondition_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getCondition_Condition() };
			EAttribute[] editableFeatures = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getCondition_Condition() };
			MessageFormatMessageFormatParser parser = new MessageFormatMessageFormatParser(
					features, editableFeatures);
			conditionCondition_5008Parser = parser;
		}
		return conditionCondition_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionSignal_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionSignal_6001Parser() {
		if (transitionSignal_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getTransition_Signal() };
			EAttribute[] editableFeatures = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getTransition_Signal() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			transitionSignal_6001Parser = parser;
		}
		return transitionSignal_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionGuard_6002Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionGuard_6002Parser() {
		if (transitionGuard_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getTransition_Guard() };
			EAttribute[] editableFeatures = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getTransition_Guard() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("[{0}]"); //$NON-NLS-1$
			parser.setEditorPattern("[{0}]"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			transitionGuard_6002Parser = parser;
		}
		return transitionGuard_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionEffect_6003Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionEffect_6003Parser() {
		if (transitionEffect_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getTransition_Effect() };
			EAttribute[] editableFeatures = new EAttribute[] { imagindata.imagindataPackage.eINSTANCE
					.getTransition_Effect() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("/{0}"); //$NON-NLS-1$
			parser.setEditorPattern("/{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			transitionEffect_6003Parser = parser;
		}
		return transitionEffect_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StateNameEditPart.VISUAL_ID:
			return getStateName_5006Parser();
		case ObjectEditPart.VISUAL_ID:
			return getObject_3002Parser();
		case DiagramNameEditPart.VISUAL_ID:
			return getDiagramName_5007Parser();
		case ConditionConditionEditPart.VISUAL_ID:
			return getConditionCondition_5008Parser();
		case TransitionSignalEditPart.VISUAL_ID:
			return getTransitionSignal_6001Parser();
		case TransitionGuardEditPart.VISUAL_ID:
			return getTransitionGuard_6002Parser();
		case TransitionEffectEditPart.VISUAL_ID:
			return getTransitionEffect_6003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ImaginDataVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ImaginDataVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ImaginDataElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
