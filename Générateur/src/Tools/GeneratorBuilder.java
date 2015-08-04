package Tools;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;


public class GeneratorBuilder extends GeneratorTools{

	//Table de spec necessaire pour la Jtable a afficher
	private String[][] specTable;
	//HashMaps contenant le résultat du fichier parsé
	private ArrayList<HashMap<String, String>> myTransitions = new ArrayList<HashMap<String, String>>();
	private ArrayList<HashMap<String, String>> myStates = new ArrayList<HashMap<String, String>>();
	//Lignes et colonnes de la table de spec
	private int lines = 0;
	private int columns = 0;

	public GeneratorBuilder(ArrayList<HashMap<String, String>> states,ArrayList<HashMap<String, String>> transitions){
		this.myStates = states;
		this.myTransitions = transitions;
		this.lines = myStates.size()+1;
		this.columns = myTransitions.size()+1;
	}

	//Recherche de l'état d'arrivée de la transition
	private int matchStartState(String startState){
		for(int i=1;i<lines;i++){
			if(specTable[i][0].equals(startState)) return i;
		}
		return -1;
	}

	//Remplacement des id par les vrai noms des états
	private void replaceNames(){
		//Parcours de la liste d'états
		for(HashMap<String, String> state : myStates){
			//Parcours du tableau de spec
			for(int i=0;i<specTable.length;i++){
				for(int j=0;j<specTable[0].length;j++){
					if(specTable[i][j]!=null && specTable[i][j].equals(state.get("ID"))){
						specTable[i][j] = state.get("Name");
					}
				}
			}
		}
	}

	//Fait le lien entre le nom de l'état et son ID
	private String findNameState(String ID){
		for(HashMap<String, String> state : myStates){
			if (state.get("ID").equals(ID)) return state.get("Name");
		}
		return null;
	}

	//Permet de renvoyer l'indice d'une transition dans la table
	private int findTransitionIndexInTable(String description) {
		for(int i=1;i<specTable[0].length;i++){
			if(specTable[0][i].equals(description)) return i;
		}
		return -1;
	}

	@Override
	public Object getResult() {
		// TODO Auto-generated method stub
		return specTable;
	}

	//Retourne le true si le type de l'objet dont la transition part est une condition
	public boolean typeOfTransitionStartIsCondition(String ID){
		String[] splits;
		Pattern p = Pattern.compile(" ");
		for(HashMap <String,String> state : myStates){
			splits = p.split(state.get("ExitState"));
			for (int i = 0; i<splits.length;i++){
				if(splits[i].equals(ID)&&state.get("Type").equals("imagindata:Condition")){
					return true;
				}
			}
		}
		return false;
	}

	//Permet de construire la table de spec
	@Override
	public void useTool() {
		// TODO Auto-generated method stub
		//Spécification d'un pattern pour couper la chaîne caractère
		specTable = new String[lines][columns];
		int currentColumn = 0;
		int currentLine = 0;

		//Ajout des etats
		for(HashMap <String,String> state : myStates){
			//On ajoute l'ID et pas le nom car les transistion contiennent les ID des "Start & End State"
			if(!state.get("Type").equals("imagindata:Condition")){
				currentLine++;
				specTable[currentLine][0] = state.get("ID");
			}
			else {
				lines--;
			}
		}

		//Ajout des transistions et états finaux
		int index;
		int indexEndState;
		HashMap <String,String> signalTemp;
		String thisTransition;
		ArrayList<String> temp = new ArrayList<String>();
		for(HashMap<String, String> transitions : myTransitions){
			//Construction de la transition
			thisTransition = buildUMLTransition(transitions);
			//On regarde si la transition n'est pas juste une garde appartenant a un objet condition
			if((thisTransition.equals("["+transitions.get("Guard")+"]")||thisTransition.equals("["+transitions.get("Guard")+"]"+"/"+transitions.get("Effect")))&&typeOfTransitionStartIsCondition(transitions.get("ID"))){
				//Recherche l'objet condition correspondant à cette transition et récupération du signal d'entrée dans l'objet condition
				signalTemp = objectConditionEntrySignal(transitions);
				//Si le signal n'est pas dans la table on met la transition
				if(!temp.contains(signalTemp.get("Signal"))){
					temp.add(signalTemp.get("Signal")+thisTransition);
					currentColumn++;
					specTable[0][currentColumn] = signalTemp.get("Signal")+thisTransition;
					specTable[matchStartState(signalTemp.get("StartTrans"))][currentColumn] = findNameState(transitions.get("EndTrans"));
				}
				//Sinon il faut mettre la transition complète dans la table a la place du signal
				else {
					//On trouve l'index de la transition
					index = findTransitionIndexInTable(signalTemp.get("Signal"));
					//On trouve l'index de l'état d'arrivée
					indexEndState = matchStartState(signalTemp.get("StartTrans"));
					//On remplace la transition existante par la complete
					specTable[0][currentColumn] = signalTemp.get("Signal")+thisTransition;
					//On met a jour le nouvel etat d'arrivée
					specTable[indexEndState][index] = findNameState(transitions.get("EndTrans"));
					columns--;
					temp.remove(signalTemp.get("Signal"));
					temp.add(signalTemp.get("Signal")+thisTransition);
				}
			}
			//Ajout de la transistion si elle n'existe pas déjà
			//			if(temp.isEmpty() || !temp.contains(transitions.get("Description"))||transitions.get("Description").equals("AUTO")){
			else if(temp.isEmpty() || !temp.contains(thisTransition)){
				temp.add(thisTransition);
				currentColumn++;
				specTable[0][currentColumn] = thisTransition;
				//Recherche (matchStartState) et ajout de l'état d'arrivée
				specTable[matchStartState(transitions.get("StartTrans"))][currentColumn] = findNameState(transitions.get("EndTrans"));
			}
			//Sinon il faut retrouver cette transition dans la table de spec
			else{
				index = findTransitionIndexInTable(thisTransition);
				indexEndState = matchStartState(transitions.get("StartTrans"));

				//On vérifie qu'il n'y a pas déjà quelque chose dans la case
				if(specTable[indexEndState][index]==null){
					specTable[indexEndState][index] = findNameState(transitions.get("EndTrans"));
				}
				//Sinon cette transition arrive sur 2 états différents
				else{
					specTable[indexEndState][index] = specTable[indexEndState][index] +" & " +findNameState(transitions.get("EndTrans"));
				}
				columns--;
			}
		}

		//On reconstruit la specTable si certaines transitions étaient en double
		if(columns!=specTable[0].length){
			String[][] tempData = new String[lines][columns];
			currentLine = 0;
			//On prend chaque ligne de la specTable 
			for(String str[] : specTable)  {
				if (currentLine<lines){
					System.arraycopy(str, 0, tempData[currentLine], 0, columns);
					currentLine++;
				}
			}
			specTable = tempData;
		}
		//Remplacement des ID des états par les noms
		replaceNames();
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
}
