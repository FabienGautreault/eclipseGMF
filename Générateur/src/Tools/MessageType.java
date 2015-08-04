package Tools;

//Enumération permettant d'expliciter le contexte de chaque message
public enum MessageType {
	TransitionSansBoutonEnabled, SyntaxeBoutonType, 
	StateInutile, FreeInitExitState, TransitionEntrante, 
	TransitionSortante, AucunBouton, ManqueBouton, ManqueTransition,
	ParallelTransition, TransitionSyntaxFailed, TransitionExitState,
	TransitionInitState, TransitionOtherState, ManqueBoutonEnd, ConditionFailed
}
