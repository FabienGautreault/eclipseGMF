package imagindata.diagram.dialog;

 import javax.swing.*;
 import javax.swing.table.*;
 import java.util.Vector;
//Permet de créer ma propre table acceptant le row editor model
 public class JTableX extends JTable
{
	protected RowEditorModel myRowEditor;

	//Constructeurs
	public JTableX(TableModel model)
	{
		super(model);
		myRowEditor = null;
	}
	public JTableX(TableModel model, RowEditorModel rowEditor)
	{
		super(model,null,null);
		this.myRowEditor = rowEditor;
	}
	
	//Seteur et geteur du rowEditor
	public void setRowEditorModel(RowEditorModel rowEditor)
	{
		this.myRowEditor = rowEditor;
	}
	public RowEditorModel getRowEditorModel()
	{
		return myRowEditor;
	}

	//Permet d'avoir un editor spécifique pour une ligne
	public TableCellEditor getCellEditor(int row, int col)
	{
		TableCellEditor tmpEditor = null;
		if (myRowEditor!=null)
			tmpEditor = myRowEditor.getEditor(row);
		if (tmpEditor!=null)
			return tmpEditor;
		return super.getCellEditor(row,col);
	}
}
