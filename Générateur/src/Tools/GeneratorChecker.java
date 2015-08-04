package Tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;


public class GeneratorChecker extends GeneratorTools{

	private ArrayList<HashMap<String, String>> myActions = new ArrayList<HashMap<String, String>>();
	private ArrayList<HashMap<String, String>> myTransitions = new ArrayList<HashMap<String, String>>();
	private ArrayList<HashMap<String, String>> myStates = new ArrayList<HashMap<String, String>>();
	private ArrayList<String> warningMessages = new ArrayList<String>();
	private boolean messageFreeInitExitState;
	private boolean messageTransitionsExitState;
	private boolean messageTransitionsInitState;
	private boolean messageTransitionsInitPoint;
	
	public GeneratorChecker(ArrayList<HashMap<String, String>> states,ArrayList<HashMap<String, String>> transitions,ArrayList<HashMap<String, String>> actions){
		this.myStates = states;
		this.myTransitions = transitions;
		this.myActions = actions;
	}

	//Recherche des transitions et ajouts des warnings
	private String findTransition(String state, String action, String type, String diagram){
		boolean transitionFound = false;
		String messageCheckTable = null;
		String nameState = null;

		//Recherche de la transition
		for(HashMap<String, String> transitions : myTransitions){
			if (transitions.get("StartTrans").equals(state) && transitions.get("Signal").contains(action) && type.equals("imagindata:Button")){
				transitionFound = true;
			}
		}
		//Si on ne la trouve pas
		if(!transitionFound){
			//Recherche de l'état
			nameState = findNameState(state);
			//Ajout du warning
			messageCheckTable = new Message(warningMessages.size(), nameState, null, action, MessageType.ManqueTransition, diagram).getMessage();
		}
		return messageCheckTable;
	}

	//permet de trouver le nombre de transistions sortant d'un état
	//return le nombre de transition
	private int findNumberOfTransition(String state){
		int numberOfTransitions = 0;
		for(HashMap<String, String> transitions :  myTransitions){
			//On recherche l'état correspondant
			if(transitions.get("StartTrans").equals(state)){
				numberOfTransitions ++;
			}
		}
		return numberOfTransitions;
	}
	
	//Recherche l'objet condition correspondant à cette transition et renvoie le signal entrant dans l'objet
	private HashMap <String,String> objectConditionEntrySignal(HashMap<String, String> transitions) {
		// TODO Auto-generated method stub
		String signal = "";
		for(HashMap <String,String> state : myStates){
			if (state.get("Type").equals("imagindata:Condition") && transitions.get("StartTrans").equals(state.get("ID"))){
				signal = state.get("ID");
			}
		}
		for(HashMap <String,String> transition : myTransitions){
			if (transition.get("EndTrans").equals(signal)){
				return transition;
			}
		}
		return null;
	}
	
	public String getTypeEndTranstion(String endTrans){
		
		for(HashMap <String,String> state : myStates){
			if (endTrans.equals(state.get("ID"))){
				System.out.println(state.get("Type"));
				return state.get("Type");
			}
		}
		//Ne devrait jamais arriver
		return null;
		
	}
	
	//Permet de vérifier que 2 transitions n'ont pas le même StartState et le même EndState
	//Permet de vérifier que 2 transitions ont le même end state et le même nom
	private boolean findParallelTransitions(String param1, String param2, String param3, String IDTransition, String param4, String param5, MessageType message){
		String thisTransition;
		switch(message){
		case ParallelTransition :
			for(HashMap<String, String> transitions :  myTransitions){
				//On recherche la potentielle transition parallele
				if(!transitions.get("ID").equals(IDTransition) && transitions.get("StartTrans").equals(param1) && transitions.get("Signal").equals(param2)&& transitions.get("Guard").equals(param3) && transitions.get("Effect").equals(param4)){
					if (!(getTypeEndTranstion(transitions.get("EndTrans")).equals("imagindata:Diagram") && getTypeEndTranstion(param5).equals("imagindata:Diagram"))){
						return true;
					}
				}
			}
			break;
		case TransitionExitState :			
			for(HashMap<String, String> transitions :  myTransitions){
				thisTransition = buildUMLTransition(transitions);
				if(objectConditionEntrySignal(transitions)!=null){
					thisTransition = objectConditionEntrySignal(transitions).get("Signal") + thisTransition;
				}
				//On recherche la potentielle transition parallele
				if(!transitions.get("ID").equals(IDTransition) && !thisTransition.equals(param1) && transitions.get("EndTrans").equals(param2)){
					return true;
				}
			}
			break;
		case TransitionInitState :			
			for(HashMap<String, String> transitions :  myTransitions){
				thisTransition = buildUMLTransition(transitions);
				//On recherche la potentielle transition parallele
				if(!transitions.get("ID").equals(IDTransition) && !thisTransition.equals(param1) && transitions.get("StartTrans").equals(param2)){
					return true;
				}
			}
			break;
		case TransitionOtherState :			
			for(HashMap<String, String> transitions :  myTransitions){
				thisTransition = buildUMLTransition(transitions);
				//On recherche la potentielle transition parallele
				if(!transitions.get("ID").equals(IDTransition) && thisTransition.equals(param1) && transitions.get("StartTrans").equals(param2)){
					//On regarde si des gardes n'ont pas été spécifiées
					if(transitions.get("Guard")!= null && transitions.get("Guard").equals(param3)||transitions.get("Guard")== null){
						return true;
					}
				}
			}
			break;
		}
		return false;
	}

	//Permet de construire la transition avec le standard UML
	private String buildUMLTransition(HashMap<String, String> transitions) {
		// TODO Auto-generated method stub
		String thisTransition = "";
		//Construction de la transition
		if (!transitions.get("Signal").equals("")){
			thisTransition = transitions.get("Signal");
		}
		if (!transitions.get("Guard").equals("")){
			thisTransition += "["+transitions.get("Guard")+"]";
		}
		if (!transitions.get("Effect").equals("")){
			thisTransition += "/"+transitions.get("Effect");
		}
		if(thisTransition==""){
			thisTransition = "AUTO";
		}
		return thisTransition;
	}

	//Fait le lien entre le nom de l'état et son ID
	private String findNameState(String ID){
		for(HashMap<String, String> state : myStates){
			if (state.get("ID").equals(ID)) {
				return state.get("Name");
			}
		}
		return null;
	}

	//Fait le lien entre le type de l'état et son ID
	private String findTypeState(String ID){
		for(HashMap<String, String> state : myStates){
			if (state.get("ID").equals(ID)) return state.get("Type");
		}
		return null;
	}

	@Override
	public Object getResult() {
		// TODO Auto-generated method stub
		return warningMessages;
	}

	//permet de valider la table et de renvoyer des warnings
	@Override
	public void useTool() {
		String warning;
		String nameState = null;
		boolean stateFind = false;
		//Recherche de transition manquantes
		for(HashMap<String, String> actions : myActions){
			warning = findTransition(actions.get("State"), actions.get("Name"), actions.get("Type"), actions.get("Diagram"));
			//Vérification que la syntaxe est respectée
			if(actions.get("ObjectState")!=null){
				//Verification des bouton a Enabled ("E") et que la transition n'existe pas
				if(actions.get("Type").equals("imagindata:Button") && actions.get("ObjectState").equals("Enabled") && warning!=null){
					warningMessages.add(warning);
				}
				//Verification de Disabled et transition existe
				else if(!actions.get("ObjectState").equals("Enabled") && warning==null){
					nameState = findNameState(actions.get("State"));
					warningMessages.add(new Message(warningMessages.size(), nameState, null, actions.get("Name"), MessageType.TransitionSansBoutonEnabled,actions.get("Diagram")).getMessage());
				}
			}
		}
		//Recherche de boutons manquants, d'état inutiles et de transitions paralleles
		String thisTransition;
		boolean parallel;
		for(HashMap<String, String> transitions : myTransitions){
			//Construction de la transition
			thisTransition = buildUMLTransition(transitions);
			
			//Recherche des états inutiles (ex : transition auto depuis un état ne possédant qu'une seule transition)
			if (thisTransition.equals("AUTO")){
				if(findNumberOfTransition(transitions.get("StartTrans"))==1 && (findTypeState(transitions.get("StartTrans")).equals("imagindata:State")||findTypeState(transitions.get("StartTrans")).equals("imagindata:Diagram"))){
					warningMessages.add(new Message(warningMessages.size(), findNameState(transitions.get("StartTrans")), null, null, MessageType.StateInutile, transitions.get("Diagram")).getMessage());
				}
			}
			//Recherche de transitions paralleles
			//Pour une transition entre 2 états qui n'a pas déjà été spécifiée
			if (transitions.get("StartTrans")!=null && transitions.get("EndTrans")!=null){
				if (findParallelTransitions(transitions.get("StartTrans"), transitions.get("Signal"),transitions.get("Guard"),transitions.get("ID"), transitions.get("Effect"), transitions.get("EndTrans"), MessageType.ParallelTransition)){
					warningMessages.add(new Message(warningMessages.size(), findNameState(transitions.get("StartTrans")), thisTransition, null, MessageType.ParallelTransition, transitions.get("Diagram")).getMessage());
				}
			}
			//Recherche des transitions différentes arrivant sur un même ExitState
			if(findNameState(transitions.get("EndTrans")).equals("ExitState")&& !messageTransitionsExitState){
				if(objectConditionEntrySignal(transitions)!=null){
					thisTransition = objectConditionEntrySignal(transitions).get("Signal") + thisTransition;
				}
				if (findParallelTransitions(thisTransition, transitions.get("EndTrans"),null,transitions.get("ID"),null, null, MessageType.TransitionExitState)){
					warningMessages.add(new Message(warningMessages.size(), findNameState(transitions.get("EndTrans")), null, null, MessageType.TransitionExitState, transitions.get("Diagram")).getMessage());
					messageTransitionsExitState = true;
				}
			}
			//Recherche des transitions différentes partant d'un même InitState
			else if(findNameState(transitions.get("StartTrans")).equals("InitState")&&!messageTransitionsInitState){
				if (findParallelTransitions(thisTransition, transitions.get("StartTrans"),null,transitions.get("ID"),null, null, MessageType.TransitionInitState)){
					warningMessages.add(new Message(warningMessages.size(), findNameState(transitions.get("StartTrans")), null, null, MessageType.TransitionInitState, transitions.get("Diagram")).getMessage());
					messageTransitionsInitState = true;
				}
			}
			//Recherche des transitions différentes partant d'un même InitPoint
			else if(findNameState(transitions.get("StartTrans")).equals("InitPoint")&&!messageTransitionsInitPoint){
				if (findParallelTransitions(thisTransition, transitions.get("StartTrans"),null,transitions.get("ID"),null, null, MessageType.TransitionInitState)){
					warningMessages.add(new Message(warningMessages.size(), findNameState(transitions.get("StartTrans")), null, null, MessageType.TransitionInitState, transitions.get("Diagram")).getMessage());
					messageTransitionsInitPoint = true;
				}
			}
			//Recherche des transitions différentes arrivant sur un même ExitPoint
			else if(findNameState(transitions.get("EndTrans")).equals("ExitPoint")&& !messageTransitionsExitState){
				if(objectConditionEntrySignal(transitions)!=null){
					thisTransition = objectConditionEntrySignal(transitions).get("Signal") + thisTransition;
				}
				if (findParallelTransitions(thisTransition, transitions.get("EndTrans"),null,transitions.get("ID"),null, null, MessageType.TransitionExitState)){
					warningMessages.add(new Message(warningMessages.size(), findNameState(transitions.get("EndTrans")), null, null, MessageType.TransitionExitState, transitions.get("Diagram")).getMessage());
					messageTransitionsExitState = true;
				}
			}
			//Sinon pour tout autre état
			//Recherche des transitions identiques partant d'un même état
			else if(!findNameState(transitions.get("StartTrans")).equals("InitState")&&!findNameState(transitions.get("StartTrans")).equals("InitPoint")){
				parallel = findParallelTransitions(transitions.get("Signal"), transitions.get("StartTrans"),transitions.get("Guard"),transitions.get("ID"),null, null, MessageType.TransitionOtherState);
				//Si parallel sans guard
				if (parallel){
					warningMessages.add(new Message(warningMessages.size(), findNameState(transitions.get("StartTrans")), null, null, MessageType.TransitionOtherState, transitions.get("Diagram")).getMessage());
				}
			}
		}

		//Recherches de State childFree et parentLess
		//Recherche de condition avec une seule sortie
		for(HashMap<String, String> states : myStates){
			//Condition
			if(states.get("Type").equals("imagindata:Condition") && findNumberOfTransition(states.get("ID"))<2){
				warningMessages.add(new Message(warningMessages.size(), states.get("Name"), null, null, MessageType.ConditionFailed, states.get("Diagram")).getMessage());
			}
			//States
			if(!states.get("Type").equals("imagindata:State")){
				stateFind = true;
			}
			else {
				for(HashMap<String, String> actions : myActions){
					if(states.get("ID").equals(actions.get("State"))) {
						stateFind = true;
					}
				}
			}
			//Si on a un freeInitEndState et qu'on ne l'a pas déjà dit
			if(states.get("Name").equals("FreeInitEndState")&& !messageFreeInitExitState){
				warningMessages.add(new Message(warningMessages.size(), null, null, null, MessageType.FreeInitExitState, states.get("Diagram")).getMessage());
				messageFreeInitExitState = true;
			}
			//Sinon si on regarde les states childFree
			else if (states.get("Type").equals("imagindata:State") && states.get("EnterState")==null){
				warningMessages.add(new Message(warningMessages.size(), states.get("Name"), null, null, MessageType.TransitionEntrante, states.get("Diagram")).getMessage());
			}
			//Sinon on regarde les states parentLess
			else if (states.get("Type").equals("imagindata:State") && states.get("ExitState")==null){
				warningMessages.add(new Message(warningMessages.size(), states.get("Name"), null, null, MessageType.TransitionSortante,states.get("Diagram")).getMessage());
			}

			//Si aucun bouton ne correspond a cet état
			if(!stateFind){
				warningMessages.add(new Message(warningMessages.size(), states.get("Name"), null, null, MessageType.AucunBouton, states.get("Diagram")).getMessage());
			}
			stateFind = false;
		}
		
	}
	
}
