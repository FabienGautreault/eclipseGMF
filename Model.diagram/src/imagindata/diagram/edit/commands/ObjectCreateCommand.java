package imagindata.diagram.edit.commands;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import imagindata.Button;
import imagindata.CheckBox;
import imagindata.EditableField;
import imagindata.ListBox;
import imagindata.Object;
import imagindata.ProgressBar;
import imagindata.State;
import imagindata.diagram.providers.ImaginDataElementTypes;
import imagindata.diagram.dialog.*;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ObjectCreateCommand extends EditElementCommand {

	/**
	 * @generated NOT
	 */
	private String[][] objectProperties;

	/**
	 * @generated
	 */
	public ObjectCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}

	/**
	 * @generated NOT
	 * S'interface avec l'utilisateur pour créer le bon objet et l'ajouter dans l'état
	 */
	protected CommandResult doExecuteWithResult(final IProgressMonitor monitor,
			final IAdaptable info) throws ExecutionException {

		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				//"Invoque" un panel (qui attaque avec une boule de feu :))
				@Override
				public void run() {
					//Récupère les données (name/type/state)
					objectProperties = new ObjectPropertiesPanel().getDatas();
				}
			});
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Choisit la bonne instance de l'objet
		Object newElement = chooseObject(objectProperties[0][1]);

		//Ajoute l'objet a l'état
		State owner = (State) getElementToEdit();
		owner.getObjects().add(newElement);

		//Initialise l'objet avec le bon nom et le bon état
		ImaginDataElementTypes
				.init_Object_3002(newElement, objectProperties[0]);

		try {
			doConfigure(newElement, monitor, info);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		((CreateElementRequest) getRequest()).setNewElement(newElement);

		//créer les autres objets si nécessaire
		for (int i = 1; i < objectProperties.length; i++) {
			myDoExecuteWithResult(monitor, info, i);
		}

		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated NOT
	 * Permet d'ajouter plusieurs objets
	 * Cette fonction n'est lancée que si l'utilisateur a insérer plusieurs objets
	 */
	protected CommandResult myDoExecuteWithResult(
			final IProgressMonitor monitor, final IAdaptable info, int ind)
			throws ExecutionException {

		//Choisit la bonne instance de l'objet
		Object newElement = chooseObject(objectProperties[ind][1]);

		//Ajoute l'objet a l'état
		State owner = (State) getElementToEdit();
		owner.getObjects().add(newElement);

		//Initialise l'objet avec le bon nom et le bon état
		ImaginDataElementTypes.init_Object_3002(newElement,
				objectProperties[ind]);

		try {
			doConfigure(newElement, monitor, info);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		((CreateElementRequest) getRequest()).setNewElement(newElement);

		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(Object newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	 * @generated NOT
	 * Retourne la bonne instance d'objet en fonction du type sélectionné par l'utilisateur
	 */
	protected Object chooseObject(String type) {
		Object newElement;
		if (type.equals("CheckBox")) {
			newElement = (CheckBox) imagindata.imagindataFactory.eINSTANCE
					.createCheckBox();
		} else if (type.equals("Button")) {
			newElement = (Button) imagindata.imagindataFactory.eINSTANCE
					.createButton();
		} else if (type.equals("EditableField")) {
			newElement = (EditableField) imagindata.imagindataFactory.eINSTANCE
					.createEditableField();
		} else if (type.equals("ListBox")) {
			newElement = (ListBox) imagindata.imagindataFactory.eINSTANCE
					.createListBox();
		} else if (type.equals("ProgressBar")) {
			newElement = (ProgressBar) imagindata.imagindataFactory.eINSTANCE
					.createProgressBar();
		} else {
			newElement = imagindata.imagindataFactory.eINSTANCE.createObject();
		}

		return newElement;
	}

}
