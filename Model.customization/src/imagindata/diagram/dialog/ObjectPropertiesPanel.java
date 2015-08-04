package imagindata.diagram.dialog;

import imagindata.Activator;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.table.*;
import javax.swing.border.*;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
public class ObjectPropertiesPanel extends JDialog
{

	//Table a remplir
	private JTableX table;
	//Modele de données sous jacent
	private DefaultTableModel model;
	//Noms des colonnes de la table
	private String[] col_names = {"Name","Value"};
	//Noms des différents attributs des différentes comboBox
	private String[] type_values = { "Button", "CheckBox", "EditableField","ListBox", "ProgressBar"};
	private String[] button_values = { "Enabled", "Disabled", "Invisible"};
	private String[] checkBox_values = { "Ticked", "Unticked"};
	private String[] editableField_values = { "Empty", "Not Empty"};
	private String[] listBox_values = { "Empty", "Choice"};
	private String[] progressBar_values = { "Standard1", "Standard2"};
	//Indice de la dernière ligne insérée dans la table 
	private int lastRowAdded = 3;
	//Données retournées lors de la validation de la fenêtre
	private String[][] data;

	@SuppressWarnings("serial")
	public ObjectPropertiesPanel()
	{
		setLayout(new BorderLayout());

		//On pourra récupérer le résultat des actionPerformed
		setModal(true);

		//Différentes comboBox ajoutées à la table en fonction des choix de l'utilisateur
		final JComboBox comboBox = new JComboBox(type_values);
		final JComboBox button = new JComboBox(button_values);
		final JComboBox editableField = new JComboBox(editableField_values);
		final JComboBox checkBox = new JComboBox(checkBox_values);
		final JComboBox listBox = new JComboBox(listBox_values);
		final JComboBox progressBar = new JComboBox(progressBar_values);

		//Model de données
		model = new DefaultTableModel(col_names,3)
		{
			public ArrayList<String> prop_names = new ArrayList<String>(){{add("Name");add("Type");add("State");}};

			public Object getValueAt(int row, int col)
			{
				if (col==0)
					return prop_names.get(row);
				return super.getValueAt(row,col);
			}
			public boolean isCellEditable(int row, int col)
			{
				if (col==0){
					return false;
				}
				if((row+1)%4==0){
					return false;
				}
				return true;
			}
			@Override
			public void addRow(Object[] values) {
				// TODO Auto-generated method stub
				super.addRow(values);
				prop_names.add((String)values[0]);
			}
			@Override
			public void removeRow(int lastRow) {
				// TODO Auto-generated method stub
				super.removeRow(lastRow);
			}

		};
		
		//Panel haut
		JPanel intro = new JPanel();
		intro.setPreferredSize(new Dimension(100,90));
		intro.setLayout(new BorderLayout());
		intro.setBackground(Color.white);
		//Texte de l'intro
		JLabel texte = new JLabel(" Choose an object, select its state and name.");
		intro.add(texte, BorderLayout.WEST);
		//Image de l'intro
		ImageIcon image = new ImageIcon(this.getClass().getResource("/MenuObject.gif"));
		CustomLabel test = new CustomLabel(image, 75, 66);
		intro.add(test, BorderLayout.EAST);
		
		//Table
		table = new JTableX(model);
		table.setRowSelectionAllowed(false);
		table.setColumnSelectionAllowed(false);

		//Scrollpane contenant la table
		JScrollPane scrollPane = new JScrollPane(table);

		//RowEditor pour gérer les combobox multiples
		final RowEditorModel rowEditor = new RowEditorModel();
		table.setRowEditorModel(rowEditor);

		//Panel pour les boutons add et remove
		JPanel addRemoveButton = new JPanel(new BorderLayout());
		
		//Bouton remove pour retirer des lignes au tableau
		final CustomButton removeButton = new CustomButton("/Boutons/Disabled.png","Remove",80,25,12);
		removeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for(int i = 0;i<4;i++){
					model.removeRow(lastRowAdded-1);
					lastRowAdded--;
				}
				if(lastRowAdded==3){
					removeButton.setEnabled(false);
					removeButton.setImage("/Boutons/Disabled.png");
				}
			}
		});
		
		//Bouton Add pour ajouter des lignes pour un nouvel objet
		CustomButton addButton = new CustomButton("/Boutons/enabled.png","Add",80,25,12);
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Remplissage des 4 nouvelles lignes 
				if(table.getValueAt(lastRowAdded-1, 1)!=null){
					//Ligne 1 " ", séparation des objets
					Object[] test = new Object[]{""};
					model.addRow(test);
					//Ligne 2 "Name" "DefaultName"
					test = new Object[]{"Name"};
					model.addRow(test);
					table.setValueAt("DefaultName", lastRowAdded+1, 1);
					//ligne 3 "Type" "Button"
					test = new Object[]{"Type"};
					model.addRow(test);
					//renseignement du rowEditor que pour cette ligne précise il doit utiliser
					//la combobox de "type_values"
					DefaultCellEditor cellEditor = new DefaultCellEditor(comboBox);
					rowEditor.addEditorForRow(lastRowAdded+2,cellEditor);
					table.setValueAt("Button", lastRowAdded+2, 1);
					//ligne 4 "State" "Enabled"
					test = new Object[]{"State"};
					model.addRow(test);
					//renseignement du rowEditor que pour cette ligne précise il doit utiliser
					//la combobox de "button_values"
					cellEditor = new DefaultCellEditor(button);
					rowEditor.addEditorForRow(lastRowAdded+3,cellEditor);
					table.setValueAt("Enabled", lastRowAdded+3, 1);
					//Nombre de ligne de la table
					lastRowAdded+=4;
					removeButton.setEnabled(true);
					removeButton.setImage("/Boutons/Enabled.png");
					
				}
			}

		});
		
		removeButton.setEnabled(false);
		addRemoveButton.add(addButton,BorderLayout.WEST);
		addRemoveButton.add(removeButton,BorderLayout.EAST);
		

		//Action listener pour changer la comboBox utilisée pour la ligne suivante 
		//en fonction du type d'objet choisi (button, checkbox, ...)
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (table.getValueAt(1, 1)!=null && table.getSelectedRow()!=-1){
					//On regarde le type choisit
					if(table.getValueAt(table.getSelectedRow(), 1).equals("Button")){
						//on change le cell editor
						DefaultCellEditor cellEditor = new DefaultCellEditor(button);
						//on informe le rowEditor de la combobox a utilisé pour la ligne suivante
						rowEditor.addEditorForRow(table.getSelectedRow()+1,cellEditor);
						//on informe la table sur la ligne mise a jour
						table.setValueAt("Enabled", table.getSelectedRow()+1, 1);
					}
					//Rebelotte...
					else if(table.getValueAt(table.getSelectedRow(), 1).equals("CheckBox")){
						DefaultCellEditor cellEditor = new DefaultCellEditor(checkBox);
						rowEditor.addEditorForRow(table.getSelectedRow()+1,cellEditor);
						table.setValueAt("Ticked", table.getSelectedRow()+1, 1);
					}
					else if(table.getValueAt(table.getSelectedRow(), 1).equals("EditableField")){
						DefaultCellEditor cellEditor = new DefaultCellEditor(editableField);
						rowEditor.addEditorForRow(table.getSelectedRow()+1,cellEditor);
						table.setValueAt("Empty", table.getSelectedRow()+1, 1);
					}
					else if(table.getValueAt(table.getSelectedRow(), 1).equals("ListBox")){
						DefaultCellEditor cellEditor = new DefaultCellEditor(listBox);
						rowEditor.addEditorForRow(table.getSelectedRow()+1,cellEditor);
						table.setValueAt("Empty", table.getSelectedRow()+1, 1);
					}
					else if(table.getValueAt(table.getSelectedRow(), 1).equals("ProgressBar")){
						DefaultCellEditor cellEditor = new DefaultCellEditor(progressBar);
						rowEditor.addEditorForRow(table.getSelectedRow()+1,cellEditor);
						table.setValueAt("Standard1", table.getSelectedRow()+1, 1);
					}
				}
			}
		});
		//combobox des "type_values" pour la ligne 1 par défaut
		DefaultCellEditor cellEditor = new DefaultCellEditor(comboBox);
		rowEditor.addEditorForRow(1,cellEditor);

		//combobox des "button_values" pour la ligne de 2 par défaut
		cellEditor = new DefaultCellEditor(button);
		rowEditor.addEditorForRow(2,cellEditor);

		//Remplir les valeurs de la table par défaut
		table.setValueAt("DefaultName", 0, 1);
		table.setValueAt("Button", 1, 1);
		table.setValueAt("Enabled", 2, 1);

		//Panel des boutons
		JPanel buttons_Panel = new JPanel(new BorderLayout());
		//Bouton OK
		JButton ok = new CustomButton("/Boutons/enabled.png","Ok",80,25,12);
		//Action listener pour récupérer les données enregistrées 
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String[][] temp = new String[10][3];
				// TODO Auto-generated method stub
				int j = 0, k=0;
				for(int i = 0; i < lastRowAdded;i++){
					if((i+1)%4!=0){
						temp[j][k] = (String) table.getValueAt(i, 1);
						k++;
					}
					else {
						j++;
						k=0;
					}
				}
				data = new String[j+1][3];
				for(int i = 0; i<data.length;i++){
					for(int l = 0; l< data[0].length;l++)
					data[i][l] = temp[i][l];
				}
				dispose();
			}
		});
		
		//Bouton cancel pour fermer la fenetre
		JButton cancel = new CustomButton("/Boutons/enabled.png","Cancel",80,25,12);
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
			}
		});

		//Ajout des boutons OK et Cancel au paneau de boutons
		buttons_Panel.add(ok,BorderLayout.WEST);
		buttons_Panel.add(cancel,BorderLayout.EAST);

		//Ajout du bouton add, du scrolpane contenant la table et du panneau de bouton
		add(intro, BorderLayout.NORTH);
		intro.add(addRemoveButton, BorderLayout.SOUTH);
		add(buttons_Panel,BorderLayout.SOUTH);
		add(scrollPane);

		
		//init et visibilité
		setSize(350, 400);
		setTitle("Objects properties menu");
		setLocationRelativeTo(this.getParent());
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/ObjectPref.gif")));
		setVisible(true);
	}
	
	//Permet de retourner les données enregistrées
	public String[][] getDatas(){
		return data;
	}
	
	public static void main(String[] args) {
		ObjectPropertiesPanel test = new ObjectPropertiesPanel();
		String[][] data = test.getDatas();
		for(int i = 0; i<data.length;i++){
			for(int j = 0; j< data[0].length;j++)
			System.out.println(data[i][j]);
		}
	}
}

