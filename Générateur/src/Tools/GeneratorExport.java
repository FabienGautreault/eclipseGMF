package Tools;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.read.biff.BiffException;
import jxl.write.Alignment;
import jxl.write.Label;
import jxl.write.VerticalAlignment;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class GeneratorExport extends GeneratorTools{

	private String path;
	private String[][] specTable;
	private String fichierCree;
	private String myAuthor = null;
	private String mySheetName = null;
	//Différentes fonts pour différentes données
	private enum fonts {
		Information, StateTransition, Data, None
	};
	private ArrayList<HashMap<String, String>> myActions = new ArrayList<HashMap<String, String>>();
	private ArrayList<HashMap<String, String>> myStates = new ArrayList<HashMap<String, String>>();

	public GeneratorExport(String thePath, String sheetName,String Author, String [][] specTable,ArrayList<HashMap<String, String>> actions,ArrayList<HashMap<String, String>> states){
		this.specTable = specTable;
		this.path = thePath;
		this.myAuthor = Author;
		this.mySheetName = sheetName;
		this.myActions = actions;
		this.myStates = states;
	}

	//Choix de la font en fonction de l'objet pour la table Excel
	@SuppressWarnings("deprecation")
	private Label selectFontLabel(fonts data, int line, int column, String sentence) throws WriteException{
		WritableFont font;
		WritableCellFormat format;

		Label label = new Label(0,0," init ");

		switch(data){
		case Information :
			font = new WritableFont(WritableFont.ARIAL, 10,WritableFont.BOLD, false, UnderlineStyle.DOUBLE,Colour.BLACK);
			format = new WritableCellFormat(font);
			format.setWrap(true);
			format.setAlignment(Alignment.CENTRE);
			format.setVerticalAlignment(VerticalAlignment.CENTRE);
			format.setBorder(Border.ALL, BorderLineStyle.THIN, Colour.BLACK);
			label = new Label(line+1,column+1,sentence,format);
			break;
		case StateTransition :
			font = new WritableFont(WritableFont.ARIAL, 10,WritableFont.NO_BOLD, true, UnderlineStyle.NO_UNDERLINE,Colour.BLACK);
			format = new WritableCellFormat(font);
			format.setWrap(true);
			format.setAlignment(Alignment.CENTRE);
			format.setVerticalAlignment(VerticalAlignment.CENTRE);
			format.setBorder(Border.ALL, BorderLineStyle.THIN, Colour.BLACK);
			label = new Label(line+1,column+1,sentence,format);
			break;
		case Data :
			font = new WritableFont(WritableFont.ARIAL, 8,WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,Colour.BLACK);
			format = new WritableCellFormat(font);
			format.setWrap(true);
			format.setAlignment(Alignment.CENTRE);
			format.setVerticalAlignment(VerticalAlignment.CENTRE);
			format.setBorder(Border.ALL, BorderLineStyle.THIN, Colour.BLACK);
			label = new Label(line+1,column+1,sentence,format);
			break;
		case None :
			font = new WritableFont(WritableFont.ARIAL, 8,WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE,Colour.GRAY_50);
			format = new WritableCellFormat(font);
			format.setWrap(true);
			format.setAlignment(Alignment.CENTRE);
			format.setVerticalAlignment(VerticalAlignment.CENTRE);
			format.setBorder(Border.ALL, BorderLineStyle.THIN, Colour.BLACK);
			label = new Label(line+1,column+1,sentence,format);
			break;
		}
		return label;
	}

	//Fait le lien entre le nom de l'état et son ID
	private String findNameState(String ID){
		for(HashMap<String, String> state : myStates){
			if (state.get("ID").equals(ID)) return state.get("Name");
		}
		return null;
	}
	
	@Override
	public Object getResult() {
		// TODO Auto-generated method stub
		return fichierCree;
	}

	//Permet d'exporter la table sous forme de fichier excel
	@Override
	public void useTool() {
		// TODO Auto-generated method stub
		try
		{
			//Création des classeurs
			WritableWorkbook workbook;
			Workbook w;
			WritableSheet sheet;
			
			//Création du fichier spécifié
			File fichier = new File(path);
			fichier.createNewFile();

			//Récupération du nom du fichier sans l'extension
			Pattern p = Pattern.compile(".xls");
			String splits[] = p.split(fichier.getName());
			
			//Création d'un classeur vide
			if(mySheetName.contains("Classeur")){
				workbook = Workbook.createWorkbook(new File(path));
				sheet = workbook.createSheet(mySheetName + " " +myAuthor, 1);
			}
			//Récupération d'un classeur existant et ajout dans le nouveau classeur
			else {
				w = Workbook.getWorkbook(new File(path));
				workbook = Workbook.createWorkbook(new File(path),w);
				sheet = workbook.createSheet("Classeur " +(w.getNumberOfSheets()+1)+" " + mySheetName + " " + myAuthor, (w.getNumberOfSheets()+1));
			}

			this.fichierCree = splits[0] + ".xls";
			Label label;
			boolean isButton = false;
			
			//Parcours de la table pour changer la fonte en fonction de l'objet (états, transistion, ...)
			//Création du classeur de la table Etats/Transition
			for(int i=0;i<specTable[0].length;i++){
				for(int j=0;j<specTable.length;j++){
					//Première case
					if (j==0 && i==0){
						label = selectFontLabel(fonts.Information,j,i,"Etats");
					}
					//Première colonne ou première ligne
					else if (j==0 || i==0){
						label = selectFontLabel(fonts.StateTransition,j,i,specTable[j][i]);
					}
					//Data null
					else if (specTable[j][i] == null){
						//On regarde si le bouton appartient à l'état
						for (HashMap<String, String> actions : myActions){
							if (findNameState(actions.get("State"))==specTable[j][0]&&specTable[0][i].contains(actions.get("Name"))){
								isButton = true;
							}
						}
						//S'il appartient et que data est null alors il n'y a pas de transition ou le bouton est a disabled
						if(isButton){
							label = selectFontLabel(fonts.None,j,i,"No action");
						}
						//Sinon cette donnée n'a pas lieu d'être
						else{
							label = selectFontLabel(fonts.None,j,i,"-");
						}
						isButton = false;
					}
					//Data
					else {
						label = selectFontLabel(fonts.Data,j,i,specTable[j][i]);
					}
					//Ajout cellule par cellule
					sheet.addCell(label);
				}
			}
			//Ajout d'un chanmp Link To
			sheet.addCell(selectFontLabel(fonts.Information,0 , specTable[0].length+1, "Link To : "));
			
			//Création de la table de définition des boutons en fonction des états
			WritableSheet sheet2;
			if(mySheetName.contains("Classeur")){
				p = Pattern.compile("Classeur 1 ");
				splits = p.split(mySheetName);
				sheet2 = workbook.createSheet("Classeur " +(workbook.getNumberOfSheets()+1)+" " + splits[1] + " " + myAuthor, (workbook.getNumberOfSheets()+1));
			}
			else{
				sheet2 = workbook.createSheet("Classeur " +(workbook.getNumberOfSheets()+1)+" " + mySheetName + " " + myAuthor, (workbook.getNumberOfSheets()+1));
			}
			ArrayList<String> states = new ArrayList<String>();
			ArrayList<String> buttons = new ArrayList<String>();
			for(HashMap<String, String> actions : myActions){
				//Si ni l'état ni le bouton n'est présent
				if(!states.contains(actions.get("State"))&&!buttons.contains(actions.get("Name"))){
					states.add(actions.get("State"));
					buttons.add(actions.get("Name"));
					sheet2.addCell(selectFontLabel(fonts.Data,states.size(),buttons.size(),actions.get("ObjectState")));
					sheet2.addCell(selectFontLabel(fonts.StateTransition,0, buttons.size(), actions.get("Name")));
					sheet2.addCell(selectFontLabel(fonts.StateTransition,states.size(),0 , findNameState(actions.get("State"))));
				}
				//Si le bouton seulement n'est pas présent
				else if(states.contains(actions.get("State"))&&!buttons.contains(actions.get("Name"))){
					buttons.add(actions.get("Name"));
					int i = states.indexOf(actions.get("State"));
					sheet2.addCell(selectFontLabel(fonts.Data,i+1 , buttons.size(), actions.get("ObjectState")));
					sheet2.addCell(selectFontLabel(fonts.StateTransition,0, buttons.size(), actions.get("Name")));
				}
				//Si l'état seulement n'est pas présent
				else if(!states.contains(actions.get("State"))&&buttons.contains(actions.get("Name"))){
					states.add(actions.get("State"));
					int i = buttons.indexOf(actions.get("Name"));
					sheet2.addCell(selectFontLabel(fonts.Data,states.size() , i+1, actions.get("ObjectState")));
					sheet2.addCell(selectFontLabel(fonts.StateTransition,states.size(),0 , findNameState(actions.get("State"))));
				}
				// Sinon c'est que les 2 sont déjà présents
				else{
					int j = buttons.indexOf(actions.get("Name"));
					int i = states.indexOf(actions.get("State"));
					sheet2.addCell(selectFontLabel(fonts.Data,i+1 , j+1, actions.get("ObjectState")));
				}
			}
			//Ajout d'un chanmp Link To
			sheet2.addCell(selectFontLabel(fonts.Information,0 , buttons.size()+2, "Link To : "));
			//Ecriture et fermeture
			workbook.write();
			workbook.close();

		} catch (RowsExceededException e1) {
			e1.printStackTrace();
		} catch (WriteException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

