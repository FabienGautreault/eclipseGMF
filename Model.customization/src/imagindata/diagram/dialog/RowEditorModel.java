package imagindata.diagram.dialog;

import javax.swing.table.*;
import java.util.*;
public class RowEditorModel
{
	//M�moire des rowEditor en place
	private Hashtable data;
	
	//Constructeur
	public RowEditorModel()
	{
		data = new Hashtable();
	}
	
	//Ajout d'un rowEditor dans la m�moire
	public void addEditorForRow(int row, TableCellEditor e )
	{
		data.put(new Integer(row), e);
	}
	
	//Retrait d'un rowEditeur de la m�moire
	public void removeEditorForRow(int row)
	{
		data.remove(new Integer(row));
	}
	
	//Pour r�cup�rer le row Editor sp�cifique de la ligne
	public TableCellEditor getEditor(int row)
	{
		return (TableCellEditor)data.get(new Integer(row));
	}
}
