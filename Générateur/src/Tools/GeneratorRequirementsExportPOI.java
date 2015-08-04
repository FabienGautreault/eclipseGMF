package Tools;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

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


public class GeneratorRequirementsExportPOI extends GeneratorTools{

	private String myPath;
	private String fichierCree;
	private String myAutor;
	private String myPrefix;
	//Différentes fonts pour différentes données
	private enum fonts {
		Information, StateTransition, Data, None
	};

	public GeneratorRequirementsExportPOI(String autor, String prefix,String path){

		this.myPath = path;
		//Renseignement des préfixes et auteur
		this.myAutor = autor;
		this.myPrefix = prefix;
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

	@Override
	public Object getResult() {
		// TODO Auto-generated method stub
		return fichierCree;
	}

	@Override
	public void useTool() {
		// TODO Auto-generated method stub
		try
		{		
			//Récupération de la date du jour
			String format = "dd/MM/yyyy";
			java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format );
			java.util.Date date = new java.util.Date(); 

			ArrayList<String> sentences = new ArrayList<String>();
			sentences.add("Voila la première phrase que je veux voir dans la spec");
			sentences.add("Voila la deuxième phrase que je veux voir dans la spec");
			sentences.add("Voila la troisième phrase que je veux voir dans la spec");
			sentences.add("Voila la quatrième phrase que je veux voir dans la spec");
			sentences.add("Voila la cinquième phrase que je veux voir dans la spec");
			sentences.add("Voila la sixième phrase que je veux voir dans la spec");
			sentences.add("Voila la septième phrase que je veux voir dans la spec");
			sentences.add("Voila la huitième phrase que je veux voir dans la spec");
			sentences.add("Voila la neuvième phrase que je veux voir dans la spec");
			sentences.add("Voila la dixième phrase que je veux voir dans la spec");
			sentences.add("Voila la onzième phrase que je veux voir dans la spec");
			
			//Création du fichier spécifié
			File fichier = new File(myPath);
			fichier.createNewFile();

			//Récupération du nom du fichier sans l'extension
			Pattern p = Pattern.compile(".xls");
			String splits[] = p.split(fichier.getName());

			//Récupération d'un classeur existant et ajout dans le nouveau classeur
			Workbook w = Workbook.getWorkbook(new File(myPath));
			WritableWorkbook workbook = Workbook.createWorkbook(new File(myPath),w);
			WritableSheet sheet = workbook.createSheet("Classeur " +(w.getNumberOfSheets()+1)+" " + "Sentences" + " " + myAutor, (w.getNumberOfSheets()+1));

			this.fichierCree = splits[0] + ".xls";
			Label label;
			int i = 1;
			String numeroReq;

			//Configuration du fichier 
			sheet.addCell(selectFontLabel(fonts.StateTransition,0 , 0, "Prefix"));
			sheet.addCell(selectFontLabel(fonts.StateTransition,1 , 0, "Number Req"));
			sheet.addCell(selectFontLabel(fonts.StateTransition,2 , 0, "Author"));
			sheet.addCell(selectFontLabel(fonts.StateTransition,3 , 0, "Date"));
			sheet.addCell(selectFontLabel(fonts.StateTransition,4 , 0, "Sentence"));
			
			for(String s : sentences){
				if(i<10)numeroReq = "00"+i;
				else if(i<100)numeroReq = "0"+i;
				else numeroReq = ""+i;
				sheet.addCell(selectFontLabel(fonts.StateTransition,0 , i, myPrefix));
				sheet.addCell(selectFontLabel(fonts.StateTransition,1 , i, numeroReq));
				sheet.addCell(selectFontLabel(fonts.StateTransition,2 , i, myAutor));
				sheet.addCell(selectFontLabel(fonts.StateTransition,3 , i, formater.format(date)));
				sheet.addCell(selectFontLabel(fonts.StateTransition,4 , i, s));
				i++;
			}

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
