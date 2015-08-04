package application;







import java.io.File;
import javax.swing.filechooser.FileFilter;



//Classe permettant de filtrer les extension des fichiers dans windows
public class ExtensionFilter extends FileFilter{

	private String extension;
	private String description;
	
	public ExtensionFilter (String theDescrition, String theExtension){	
		this.extension = theExtension; 
		this.description = theDescrition;
	}
	
	//Fonction qui accepte les fichier de l'extension spécifiée
	public boolean accept(File file){
		if(file.isDirectory()){
			return true;
		}
		String nomFichier = file.getName().toLowerCase();
		
		return nomFichier.endsWith(extension);
	}
	
	//Retourne la description
	public String getDescription(){
		return description;
	}
}
