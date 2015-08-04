package imagindata.diagram.part;

import imagindata.diagram.providers.ImaginDataElementTypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class ImaginDataPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createCommonTools1Group());
		paletteRoot.add(createHierachyTools2Group());
		paletteRoot.add(createAdditionnalTools3Group());
	}

	/**
	 * Creates "CommonTools" palette tool group
	 * @generated
	 */
	private PaletteContainer createCommonTools1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.CommonTools1Group_title);
		paletteContainer.setId("createCommonTools1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.CommonTools1Group_desc);
		paletteContainer.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/CommonTools.gif")); //$NON-NLS-1$
		paletteContainer.add(createInitExitState1CreationTool());
		paletteContainer.add(createState2CreationTool());
		paletteContainer.add(createTransition3CreationTool());
		paletteContainer.add(createObject4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Hierachy Tools" palette tool group
	 * @generated
	 */
	private PaletteContainer createHierachyTools2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.HierachyTools2Group_title);
		paletteContainer.setId("createHierachyTools2Group"); //$NON-NLS-1$
		paletteContainer.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/HierachyTools.gif")); //$NON-NLS-1$
		paletteContainer.add(createSubDiagram1CreationTool());
		paletteContainer.add(createRegion2CreationTool());
		paletteContainer.add(createAnchors3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Additionnal Tools" palette tool group
	 * @generated
	 */
	private PaletteContainer createAdditionnalTools3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.AdditionnalTools3Group_title);
		paletteContainer.setId("createAdditionnalTools3Group"); //$NON-NLS-1$
		paletteContainer.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/AdditionnalTools.gif")); //$NON-NLS-1$
		paletteContainer.add(createCondition1CreationTool());
		paletteContainer.add(createInterruptibleRegion2CreationTool());
		paletteContainer.add(createHistoric3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitExitState1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ImaginDataElementTypes.InitExit_3005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InitExitState1CreationTool_title, null, types);
		entry.setId("createInitExitState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/IEState.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/IEState.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createState2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ImaginDataElementTypes.State_3004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.State2CreationTool_title, null, types);
		entry.setId("createState2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/State.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/State.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ImaginDataElementTypes.Transition_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Transition3CreationTool_title, null, types);
		entry.setId("createTransition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Transition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Transition.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObject4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ImaginDataElementTypes.Object_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Object4CreationTool_title, null, types);
		entry.setId("createObject4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Object.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Object.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubDiagram1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ImaginDataElementTypes.Diagram_3006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SubDiagram1CreationTool_title,
				Messages.SubDiagram1CreationTool_desc, types);
		entry.setId("createSubDiagram1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/SubDiagram.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/SubDiagram.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegion2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ImaginDataElementTypes.Region_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Region2CreationTool_title, null, types);
		entry.setId("createRegion2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Region.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Region.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnchors3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(ImaginDataElementTypes.Anchor_3009);
		types.add(ImaginDataElementTypes.Anchor_3010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Anchors3CreationTool_title,
				Messages.Anchors3CreationTool_desc, types);
		entry.setId("createAnchors3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Anchor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Anchor.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCondition1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ImaginDataElementTypes.Condition_3007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Condition1CreationTool_title, null, types);
		entry.setId("createCondition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Condition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Condition.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterruptibleRegion2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.InterruptibleRegion2CreationTool_title, null, null,
				null) {
		};
		entry.setId("createInterruptibleRegion2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/InterruptibleRegion.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/InterruptibleRegion.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHistoric3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ImaginDataElementTypes.Historic_3008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Historic3CreationTool_title, null, types);
		entry.setId("createHistoric3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Historic.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ImaginDataDiagramEditorPlugin
				.findImageDescriptor("/Model/icons/Historic.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
