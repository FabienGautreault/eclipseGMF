package imagindata.diagram.dialog;

import javax.swing.table.*;
import java.util.*;
public class RowEditorModel
{
	//Mémoire des rowEditor en place
	private Hashtable data;
	
	//Constructeur
	public RowEditorModel()
	{
		data = new Hashtable();
	}
	
	//Ajout d'un rowEditor dans la mémoire
	public void addEditorForRow(int row, TableCellEditor e )
	{
		data.put(new Integer(row), e);
	}
	
	//Retrait d'un rowEditeur de la mémoire
	public void removeEditorForRow(int row)
	{
		data.remove(new Integer(row));
	}
	
	//Pour récupérer le row Editor spécifique de la ligne
	public TableCellEditor getEditor(int row)
	{
		return (TableCellEditor)data.get(new Integer(row));
	}
}
