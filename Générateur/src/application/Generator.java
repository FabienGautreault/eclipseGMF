package application;







import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import javax.swing.JTable;

import Tools.ActionTools;
import Tools.GeneratorBuilder;
import Tools.GeneratorChecker;
import Tools.GeneratorExport;
import Tools.GeneratorRequirementsExportPOI;
import Tools.GeneratorTools;
import Tools.Message;

import jxl.write.Alignment;
import jxl.write.VerticalAlignment;


public class Generator {
	//Chemin et nom du fichier a parser
	private String filePath;
	private String fileName;
	//Premet de détecter l'appartenance a un diagram
	private boolean closeRegion = false;
	//Etat courant dans le fichier necessaire pour associer les boutons aux états
	private String currentState = null;
	//Table de spec necessaire pour la Jtable a afficher
	private String[][] specTable;
	//HashMaps contenant le résultat du fichier parsé
	private ArrayList<HashMap<String, String>> myActions = new ArrayList<HashMap<String, String>>();
	private ArrayList<HashMap<String, String>> myTransitions = new ArrayList<HashMap<String, String>>();
	private ArrayList<HashMap<String, String>> myStates = new ArrayList<HashMap<String, String>>();
	//Liste des warnings
	private ArrayList<String> warningMessages = new ArrayList<String>();
	//Liste des noms des diagrammes
	private ArrayList<String> diagrams = new ArrayList<String>();
	//Objet du diagram ciblé
	private enum diagramObject {
		STATE, TRANSITION, OBJECTS
	};
	//Règles de traduction des balises du fichier parsé
	private HashMap<String,String> regles= new HashMap<String, String>();

	//Constructeur qui construit la table de règles pour traduire le fichier reçu
	public Generator(String path,String name){
		this.filePath = path;
		this.fileName = name;

		regles.put("ID", " xmi:id=");
		regles.put("EnterState", " Enter=");
		regles.put("ExitState", " Exit=");
		regles.put("StartTrans", " Start=");
		regles.put("EndTrans", " End=");
		regles.put("Name", " Name=");
		regles.put("Type", " xmi:type=");
		regles.put("Signal", " Signal=");
		regles.put("Guard", " Guard=");
		regles.put("Effect", " Effect=");
		regles.put("ObjectState", "State=");
		regles.put("Standard", "Standard=");
		regles.put("Condition", "Condition=");
	}

	//Utilise les outils adequate pour réalise le traitement spécifié
	public Object notifyActionTools(ActionTools action, String[] params){
		switch(action){
		case Parse :
			init();
			Pattern p = Pattern.compile(".diagram");
			String splits[] = p.split(fileName);
			diagrams.add(splits[0]);
			try {
				parseFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//displayHashMaps();
			break;
		case BuildTable : 
			//On construit la table
			GeneratorTools myGeneratorBuilder = new GeneratorBuilder(myStates, myTransitions);
			myGeneratorBuilder.useTool();
			specTable = (String[][]) myGeneratorBuilder.getResult();
			return buildJtable();
			//displaySpecTableau();
		case CheckTable :
			GeneratorTools myGeneratorChecker = new GeneratorChecker(myStates, myTransitions, myActions);
			myGeneratorChecker.useTool();
			warningMessages = (ArrayList<String>) myGeneratorChecker.getResult();
			if(warningMessages.isEmpty()){
				warningMessages.add(new Message().getMessage());
			}
			return warningMessages;
		case Save :
			GeneratorTools myGeneratorExport = new GeneratorExport(params[2],params[1],params[0],specTable,myActions,myStates);
			myGeneratorExport.useTool();
			return myGeneratorExport.getResult();
		case WriteSpec : 
			GeneratorTools myGeneratorExportSpec = new GeneratorRequirementsExportPOI(params[0],params[1],params[2]);
			myGeneratorExportSpec.useTool();
			return myGeneratorExportSpec.getResult();
		}
		return null;
	}

	//Permet de renvoyer a la vue la Jtable a afficher
	public JTable buildJtable(){
		//Noms des colonnes de la JTable correspondant aux transitions
		String[] names = new String[specTable[0].length];
		//Data de la JTable correspondant aux états initiaux et finaux
		String[][] data = new String[specTable.length-1][specTable[0].length];
		names[0]="Etats";
		int currentLine = 0;
		//On prend chaque ligne de la specTable 
		for(String str[] : specTable)  {
			//On copie la première pour l'entete
			if(currentLine == 0){
				System.arraycopy(str, 1, names, 1, specTable[0].length-1);
				currentLine ++;
			}
			//On copie le reste dans les datas
			else{
				System.arraycopy(str, 0, data[currentLine-1], 0, specTable[0].length);
				currentLine++;
			}
		}
		//On construit la JTable
		JTable displayTable = new JTable(data,names);
		return displayTable;
	}

	//Permet de charger le fichier PDE et de le parser selon les balises "états/transitions/actions"
	private void parseFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line = null;
		while ((line = reader.readLine()) != null) {
			//On n'ajoute que les lignes contenant les bonnes balises
			containBalise(line);
		}
	}

	//Permet de trouver le nom de l'élément cherché ex : search="name", return "State n°1" ...
	private String returnString(String line, String search){
		Pattern p = Pattern.compile("\"");
		String []splits = p.split(line);
		for(int i = 0;i<splits.length;i++){
			if(splits[i].contains(search)) return splits[i+1]; 
		}
		return null;
	}

	//Permet de savoir si la ligne contient la bonne balise et de la nouvelle phrase dans la bonne HashMap
	private void containBalise(String line){
		//Partage des état-transition et des actions
		if (line.contains("<stateObjects")) {
			if(line.contains("imagindata:Diagram")){
				diagrams.add(returnString(line, "Name"));
				buildStatesTransistionsActionsHashMaps(diagramObject.STATE,line);
			}else{
				buildStatesTransistionsActionsHashMaps(diagramObject.STATE,line);
			}
		}
		else if (line.contains("<transitions")){
			buildStatesTransistionsActionsHashMaps(diagramObject.TRANSITION,line);
		}
		else if (line.contains("<objects")){
			buildStatesTransistionsActionsHashMaps(diagramObject.OBJECTS,line);
		}
		else if (line.contains("<histo")){
			buildStatesTransistionsActionsHashMaps(diagramObject.STATE,line);
		}
		else if (line.contains("<Anchors")){
			buildStatesTransistionsActionsHashMaps(diagramObject.STATE,line);
		}
		else if (line.contains("</regions>")) {
			closeRegion = true;
		}
		else if (line.contains("</stateObjects") && closeRegion){
			diagrams.remove(diagrams.size()-1);
		}

	}

	//Permet de construire les HashMap pour identifier facilement les objets des phrases
	private void buildStatesTransistionsActionsHashMaps(diagramObject obj,String line){
		HashMap<String, String> temp = new HashMap<String, String>();
		String []splits = null;
		String type;
		switch(obj){
		case STATE :
			//Pour connaitre l'appartenance a un diagramme particulier
			temp.put("Diagram", diagrams.get(diagrams.size()-1));
			//StateObjects de la forme "Type" "ID" "Exit" "Enter" "Name"
			type = returnString(line,regles.get("ID"));
			//Récupère l'objet courant
			currentState = type;
			temp.put("ID", type);
			type = returnString(line, regles.get("Type"));
			temp.put("Type", type);
			//Si on a un état
			if(type.equals("imagindata:State")){
				type = returnString(line,regles.get("Name"));
				temp.put("Name", type);
				if (returnString(line, regles.get("EnterState"))!=null){
					type = returnString(line,regles.get("EnterState"));
					temp.put("EnterState", type);
				}
				else{
					temp.put("EnterState", "");
				}
				if (returnString(line, regles.get("ExitState"))!=null){
					type = returnString(line,regles.get("ExitState"));
					temp.put("ExitState", type);
				}
				else{
					temp.put("ExitState", "");
				}
			} 
			//Si on a un INIT
			else if (type.equals("imagindata:InitExit") && returnString(line, regles.get("ExitState"))!=null && returnString(line, regles.get("EnterState"))==null){
				temp.put("Name", "InitState");
				temp.put("EnterState", "");
				type = returnString(line,regles.get("ExitState"));
				temp.put("ExitState", type);
			} 
			//Si on a un Exit
			else if (type.equals("imagindata:InitExit") && returnString(line, regles.get("EnterState"))!=null && returnString(line, regles.get("ExitState"))==null){
				temp.put("Name", "ExitState");
				type = returnString(line,regles.get("EnterState"));
				temp.put("EnterState", type);
				temp.put("ExitState", "");
			}
			//Si on a une condition
			else if(type.equals("imagindata:Condition")){
				type = returnString(line,regles.get("Condition"));
				temp.put("Name", type);
				if (returnString(line, regles.get("EnterState"))!=null){
					type = returnString(line,regles.get("EnterState"));
					temp.put("EnterState", type);
				}
				else{
					temp.put("EnterState", "");
				}
				if (returnString(line, regles.get("ExitState"))!=null){
					type = returnString(line,regles.get("ExitState"));
					temp.put("ExitState", type);
				}
				else{
					temp.put("ExitState", "");
				}
			}
			//Si on a une entrée secondaire
			else if (type.equals("imagindata:Anchor") && returnString(line, regles.get("ExitState"))!=null && returnString(line, regles.get("EnterState"))==null){
				if (!closeRegion){
					temp.put("Name", "InitPoint");
				}
				else{
					temp.put("Name", "SubInitPoint");
				}
				temp.put("EnterState", "");
				type = returnString(line,regles.get("ExitState"));
				temp.put("ExitState", type);
			} 
			//Si on a une sortie secondaire
			else if (type.equals("imagindata:Anchor") && returnString(line, regles.get("EnterState"))!=null && returnString(line, regles.get("ExitState"))==null){
				if (!closeRegion){
					temp.put("Name", "ExitPoint");
				}
				else{
					temp.put("Name", "SubExitPoint");
				}
				type = returnString(line,regles.get("EnterState"));
				temp.put("EnterState", type);
				temp.put("ExitState", "");
			} 
			//Si on a un diagram
			else if(type.equals("imagindata:Diagram")){
				type = returnString(line,regles.get("Name"));
				temp.put("Name", type);
				if (returnString(line, regles.get("EnterState"))!=null){
					type = returnString(line,regles.get("EnterState"));
					temp.put("EnterState", type);
				}
				else{
					temp.put("EnterState", "");
				}
				if (returnString(line, regles.get("ExitState"))!=null){
					type = returnString(line,regles.get("ExitState"));
					temp.put("ExitState", type);
				}
				else{
					temp.put("ExitState", "");
				}
			} 
			//Si on a un Historic
			else if(type.equals("imagindata:Historic")){
				temp.put("Name", "Historic");
				type = returnString(line,regles.get("EnterState"));
				temp.put("EnterState", type);
				temp.put("ExitState", "");
			} 
			//Sinon erreur de modélisation (ex : Init avec entrée et sortie)
			else if (type.equals("imagindata:InitExit")||type.equals("imagindata:Anchor")){
				temp.put("Name", "FreeInitEndState");
				temp.put("EnterState", "");
				temp.put("ExitState", "");
			}

			myStates.add(temp);
			break;
		case TRANSITION :
			//Pour connaitre l'appartenance a un diagramme particulier
			temp.put("Diagram", diagrams.get(diagrams.size()-1));
			//Transitions de la forme "type" "id" "start" "end" "Signal" "Guard" "Effect"
			type = returnString(line,regles.get("ID"));
			temp.put("ID", type);
			//Etat dont la transition sort
			type = returnString(line,regles.get("StartTrans"));
			temp.put("StartTrans", type);
			//Etat dans lequel la transition entre
			type = returnString(line,regles.get("EndTrans"));
			temp.put("EndTrans", type);
			//Si "Signal" est encore marqué alors on ne le note pas
			//Equivaut à l'enlever SUPPR
			type = returnString(line,regles.get("Signal"));
			if (type.equals("Signal")){
				temp.put("Signal", "");
			}
			else {
				temp.put("Signal", type);
			}
			//De même
			type = returnString(line,regles.get("Guard"));
			if (type.equals("Guard")){
				temp.put("Guard", "");
			}
			else {
				temp.put("Guard", type);
			}
			//De même
			type = returnString(line,regles.get("Effect"));
			if (type.equals("Effect")){
				temp.put("Effect", "");
			}
			else {
				temp.put("Effect", type);
			}
			myTransitions.add(temp);
			break;
		case OBJECTS :
			//Pour connaitre l'appartenance a un diagramme particulier
			temp.put("Diagram", diagrams.get(diagrams.size()-1));
			//Objets de la formes "type" "id" "name" "State"
			type = returnString(line, regles.get("Type"));
			temp.put("Type", type);
			//Etat courant == état contenant l'objet
			temp.put("State", currentState);
			//Nom de l'objet
			type = returnString(line,regles.get("Name"));
			temp.put("Name", type);
			//Etat de l'objet
			//S'il est renseigné
			type = returnString(line, regles.get("ObjectState"));
			if(type!=null){
				temp.put("ObjectState", type);
			}
			//Sinon c'est l'état par défaut non renseigné lors de la sérialisation ou un standard de progressbar
			else{
				type = returnString(line, regles.get("Type"));
				if(type.equals("imagindata:Button")){
					temp.put("ObjectState", "Invisible");
				}
				else if(type.equals("imagindata:CheckBox")){
					temp.put("ObjectState", "Unticked");
				}
				else if(type.equals("imagindata:EditableField")){
					temp.put("ObjectState", "Empty");
				}
				else if(type.equals("imagindata:ListBox")){
					temp.put("ObjectState", "Empty");
				}
				else {
					type = returnString(line, regles.get("Standard"));
					temp.put("ObjectState", type);
				}
			}

			myActions.add(temp);
			break;
		}
	}

	//Réinitialisation du générateur
	private void init(){
		currentState = null;
		specTable = new String[0][0];
		myActions.clear();
		myTransitions.clear();
		myStates.clear();
		warningMessages.clear();
		diagrams.clear();
		closeRegion = false;
	}

	//Affichage debug de la table
	private void displaySpecTableau(){
		for(int i=0;i<specTable.length;i++){
			for(int j=0;j<specTable[0].length;j++){
				System.out.println(specTable[j][i]);
			}
			System.out.println("\n");
		}
	}

	//Affichage des hashMaps
	private void displayHashMaps(){
		for(HashMap<String, String> h : myActions){
			Set entries = h.entrySet();
			Iterator it = entries.iterator();
			while (it.hasNext()) {
				Map.Entry entry = (Map.Entry) it.next();
				System.out.println(entry.getKey() + "-->" + entry.getValue());
			}
		}
	}

}

