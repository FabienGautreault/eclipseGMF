package Tools;

//Contient les diff�rents messages lanc�s par le g�n�rateur concernant la syntaxe du diagramme, des transitions ou des boutons manquant(e)s
public class Message {
	
	private String myMessage;
	
	public Message(){
		this.myMessage = "<Font color=\"00AA00\">"+"La table semble compl�te"+"</Font>"+"<br>";
	}
	public Message(int numero, String state, String transition, String nameButton, MessageType message, String diagram){
		this.setMessage(numero,state,transition,nameButton,message,diagram);
	}
	
	//Permet de cr�er les messages en fonction du contexte
	//Les balises html permettent l'affichage dans des couleurs diff�rentes selon l'importance et le sens du message
	private void setMessage(int numero, String state, String transition, String nameButton, MessageType message, String diagram){
		switch(message){
		case TransitionSansBoutonEnabled : 
			myMessage = "<Font color=\"000000\">"+numero+") ["+diagram+"] Une transition depuis \""+state+"\" avec le bouton \"" + nameButton +"\" est pr�sente alors qu'il est a Disabled.\n"+"</Font>"+"<br>";
			break;
		case SyntaxeBoutonType :
			myMessage = "<Font color=\"ff0000\">"+numero+") ["+diagram+"] ATTENTION : La syntaxe du bouton \""+nameButton+"\" n'est pas respect�e.\n"+"</Font>"+"<br>";
			break;
		case StateInutile :
			myMessage = "<Font color=\"CCCCCC\">"+numero + ") ["+diagram+"] Warning : L'�tat \"" + state+"\" semble inutile car poss�de seulement une transition \"AUTO\".\n"+"</Font>"+"<br>";
			break;
		case FreeInitExitState :
			myMessage = "<Font color=\"ff0000\">"+numero +") ["+diagram+"] ATTENTION : \"FreeInitEndStates\". Certaines entr�es/sorties sont mal d�finies.\n"+"</Font>"+"<br>";
			break;
		case TransitionEntrante : 
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : L'�tat \""+state+"\" ne poss�de pas de transistion entrantes.\n"+"</Font>"+"<br>";
			break;
		case TransitionSortante :
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : L'�tat \""+state+"\" ne poss�de pas de transistion sortantes.\n"+"</Font>"+"<br>";
			break;
		case AucunBouton :
			myMessage = "<Font color=\"CCCCCC\">"+numero + ") ["+diagram+"] Warning : L'�tat \""+state+"\" ne poss�de aucun boutons.\n"+"</Font>"+"<br>";
			break;
		case ManqueBouton :
			myMessage = "<Font color=\"000000\">"+numero + ") ["+diagram+"] Il manque un bouton nomm� \"" + nameButton + "\" dans l'�tat \"" + state+"\".\n"+"</Font>"+"<br>";
			break;
		case ManqueTransition :
			myMessage = "<Font color=\"000000\">"+numero + ") ["+diagram+"] Il manque peut �tre une transition depuis l'�tat \"" + state +"\" avec le bouton \""+ nameButton+"\".\n"+"</Font>"+"<br>";
			break;
		case ParallelTransition :
			myMessage = "<Font color=\"000000\">"+numero + ") ["+diagram+"] La transition \""+transition+"\" depuis l'�tat \""+state+"\" poss�de une ou plusieurs transition(s) parall�le(s).\n"+"</Font>"+"<br>";
			break;
		case TransitionSyntaxFailed :
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : La transition \""+transition+"\" depuis l'�tat \""+state+"\" ne respecte pas la syntaxe.\n"+"</Font>"+"<br>";
			break;
		case TransitionExitState :
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : Un �tat \""+state+"\" re�oit des transitions diff�rentes.\n"+"</Font>"+"<br>";
			break;
		case TransitionInitState :
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : Plusieurs transitions diff�rentes partent d'un m�me �tat \""+state+"\".\n"+"</Font>"+"<br>";
			break;
		case TransitionOtherState :
			myMessage = "<Font color=\"ff0000\">"+numero + ") ["+diagram+"] ATTENTION : Plusieurs transitions identiques partent de l'�tat \""+state+"\" , " +
					"vous devez mettre des [gardes] pour les diff�rencier. Si c'est le cas alors vos gardes sont identiques."+"</Font>"+"<br>";
			break;
		case ManqueBoutonEnd :
			myMessage = "<Font color=\"000000\">"+numero + ") ["+diagram+"] Il manque une information pr�cisant l'�tat du bouton \"" + nameButton + "\" dans l'�tat d'arriv�e \"" + state+"\".\n"+"</Font>"+"<br>";
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
