package Tools;

//Contient les différents messages lancés par le générateur concernant la syntaxe du diagramme, des transitions ou des boutons manquant(e)s
public class Message {
	
	private String myMessage;
	
	public Message(){
		this.myMessage = "<Font color=\"00AA00\">"+"La table semble complète"+"</Font>"+"<br>";
	}
	public Message(int numero, String state, String transition, String nameButton, MessageType message, String diagram){
		this.setMessage(numero,state,transition,nameButton,message,diagram);
	}
	
	//Permet de créer les messages en fonction du contexte
	//Les balises html permettent l'affichage dans des couleurs différentes selon l'importance et le sens du message
	private void setMessage(int numero, String state, String transition, String nameButton, MessageType message, String diagram){
		switch(message){
		case TransitionSansBoutonEnabled : 
			myMessage = "<Font color=\"000000\">"+numero+") ["+diagram+"] Une transition depuis \""+state+"\" avec le bouton \"" + nameButton +"\" est présente alors qu'il est a Disabled.\n"+"</Font>"+"<br>";
			break;
		case SyntaxeBoutonType :
			myMessage = "<Font color=\"ff0000\">"+numero+") ["+diagram+"] ATTENTION : La syntaxe du bouton \""+nameButton+"\" n'est pas respectée.\n"+"</Font>"+"<br>";
			break;
		case StateInutile :
			myMessage = "<Font color=\"CCCCCC\">"+numero + ") ["+diagram+"] Warning : L'état \"" + state+"\" semble inutile car possède seulement une transition \"AUTO\".\n"+"</Font>"+"<br>";
			break;
		case FreeInitExitState :
			myMessage = "<Font color=\"ff0000\">"+numero +") ["+diagram+"] ATTENTION : \"FreeInitEndStates\". Certaines entrées/sorties sont mal définies.\n"+"</Font>"+"<br>";
			break;
		case TransitionEntrante : 
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : L'état \""+state+"\" ne possède pas de transistion entrantes.\n"+"</Font>"+"<br>";
			break;
		case TransitionSortante :
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : L'état \""+state+"\" ne possède pas de transistion sortantes.\n"+"</Font>"+"<br>";
			break;
		case AucunBouton :
			myMessage = "<Font color=\"CCCCCC\">"+numero + ") ["+diagram+"] Warning : L'état \""+state+"\" ne possède aucun boutons.\n"+"</Font>"+"<br>";
			break;
		case ManqueBouton :
			myMessage = "<Font color=\"000000\">"+numero + ") ["+diagram+"] Il manque un bouton nommé \"" + nameButton + "\" dans l'état \"" + state+"\".\n"+"</Font>"+"<br>";
			break;
		case ManqueTransition :
			myMessage = "<Font color=\"000000\">"+numero + ") ["+diagram+"] Il manque peut être une transition depuis l'état \"" + state +"\" avec le bouton \""+ nameButton+"\".\n"+"</Font>"+"<br>";
			break;
		case ParallelTransition :
			myMessage = "<Font color=\"000000\">"+numero + ") ["+diagram+"] La transition \""+transition+"\" depuis l'état \""+state+"\" possède une ou plusieurs transition(s) parallèle(s).\n"+"</Font>"+"<br>";
			break;
		case TransitionSyntaxFailed :
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : La transition \""+transition+"\" depuis l'état \""+state+"\" ne respecte pas la syntaxe.\n"+"</Font>"+"<br>";
			break;
		case TransitionExitState :
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : Un état \""+state+"\" reçoit des transitions différentes.\n"+"</Font>"+"<br>";
			break;
		case TransitionInitState :
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : Plusieurs transitions différentes partent d'un même état \""+state+"\".\n"+"</Font>"+"<br>";
			break;
		case TransitionOtherState :
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : Plusieurs transitions identiques partent de l'état \""+state+"\" , " +
					"vous devez mettre des [gardes] pour les différencier. Si c'est le cas alors vos gardes sont identiques."+"</Font>"+"<br>";
			break;
		case ManqueBoutonEnd :
			myMessage = "<Font color=\"000000\">"+numero + ") ["+diagram+"] Il manque une information précisant l'état du bouton \"" + nameButton + "\" dans l'état d'arrivée \"" + state+"\".\n"+"</Font>"+"<br>";
			break;
		case ConditionFailed :
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : La condition \""+state+"\" doit avoir au moins 2 sorties.\n"+"</Font>"+"<br>";
			break;
		}
		
	}
	
	public String getMessage(){
		return myMessage;
	}
}
