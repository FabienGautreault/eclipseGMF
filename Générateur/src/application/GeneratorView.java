package application;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

import Tools.ActionTools;



public class GeneratorView extends JFrame{

	private Generator myGen;
	private JFileChooser fc = new JFileChooser(".");
	private JTable displayTable = new JTable();
	private HashMap<String, Object> colors = new HashMap<String, Object>();
	private String[] params = new String[3];
	private String pathTable;

	public GeneratorView() throws IOException, FontFormatException{
		super();
		initialize();

		//Couleurs utilisées compound
		//colors.put("elements", new Color(176,87,20));
		//colors.put("background", new Color(240,240,240));
		//colors.put("button",".\\Boutons\\Enabled.png");

		//Couleurs shades
		//colors.put("elements", new Color(0,74,201));
		//colors.put("background", new Color(240,240,240));
		//colors.put("button",".\\Boutons\\EnabledS.png");

		//Couleurs complémentaires
		//colors.put("elements", new Color(150,101,0));
		//colors.put("background", new Color(240,240,240));
		//colors.put("button",".\\Boutons\\EnabledC.png");

		//Couleurs triad
		colors.put("elements", new Color(30,30,30));
		colors.put("background", new Color(240,240,240));
		colors.put("button","../Boutons/Enabled.png");

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		try {
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/fonts/CharisSILB.ttf")));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Font font = new Font("CharisSILB",Font.PLAIN,13);

		//Ajout des extensions du filtre
		FileFilter xls = new ExtensionFilter("Fichier Microsoft Excel",".xls");
		fc.addChoosableFileFilter(xls);
		FileFilter diagram = new ExtensionFilter("Fichier Imagin",".diagram");
		fc.addChoosableFileFilter(diagram);

		//Configuration du panneau de ../Boutons et messages
		JPanel panelBouton = new JPanel();
		panelBouton.setBackground((Color) colors.get("background"));
		panelBouton.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0,3,0,0);
		this.add(panelBouton,BorderLayout.NORTH);

		//Configuration du jscroll qui contiendra la jtable
		final JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder((Color)colors.get("elements")), 
				"Table : ", TitledBorder.LEFT, TitledBorder.TOP,
				font, (Color)colors.get("elements")));
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 4;
		c.gridheight = 2;
		c.ipady = 100;
		c.weightx = 16;
		
		scrollPane2.setPreferredSize(new Dimension(getWidth()-10, 30));
		panelBouton.add(scrollPane2,c);


		//Configuration du textArea affichant les transitions manquantes
		final JTextPane checkTable = new JTextPane();
		JScrollPane zoneScrolable=new JScrollPane(checkTable);
		zoneScrolable.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder((Color)colors.get("elements")), 
				"Messages : ", TitledBorder.LEFT, TitledBorder.TOP,
				font, (Color)colors.get("elements")));
		checkTable.setEditable(false);
		checkTable.setBackground(Color.white);
		checkTable.setPreferredSize(new Dimension(6,1));
		//Permet d'écrire en couleur
		checkTable.setContentType("text/html");
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 4;
		c.gridheight = 1;
		c.ipady = 0;
		c.weightx = 16;
		zoneScrolable.setPreferredSize(new Dimension(getWidth()-10, 200));
		panelBouton.add(zoneScrolable,c);

		//Configuration du label guidant l'utilisateur
		final Label path = new Label("Etape n°1 : Choisissez un fichier Imagin");
		path.setForeground(Color.darkGray);
		path.setFont(new Font("Verdana",Font.PLAIN,13));
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.weightx = 9;
		panelBouton.add(path,c);

		//Icon de validation ou d'erreur
		ImageIcon iconErreur= new ImageIcon(this.getClass().getResource("/img/Warning.png"));
		final CustomLabel labelErreur = new CustomLabel(iconErreur,getWidth()/80,getHeight()/24);
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.weightx = 0.6;
		panelBouton.add(labelErreur,c);


		//Ajout d'un icone de parcourir
		ImageIcon iconParcourir= new ImageIcon(this.getClass().getResource("/img/Parcourir.png"));
		CustomLabel labelParcourir = new CustomLabel(iconParcourir,getWidth()/200,getHeight()/12);
		labelParcourir.setVisible(true);
		c.gridx = 3;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.8;
		panelBouton.add(labelParcourir,c);


		//Configuration du bouton d'écriture des req
		final CustomButton writeReq = new CustomButton("../Boutons/Disabled.png","Ecrire les spécifications textuelles",40,45,16);
		writeReq.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	

				File file = new File(pathTable);
				if (file.exists ()) {
					params = catchAuthorAndPrefix();
					params[2] = pathTable;
					//Si on a cliqué une fois sur annuler
					if(params[0]==null){
						labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/Warning.png")));
						path.setText("Attention : L'écriture des spécifications n'a pas été effectuée");
					}
					//Sinon on ecrit les spec
					else {
						String fileName = (String) myGen.notifyActionTools(ActionTools.WriteSpec,params);
						labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/OK.png")));
						path.setText("Succès : L'écriture des spécifications a été effectuée dans "+fileName);
						writeReq.setEnabled(false);
						writeReq.setImage("../Boutons/Disabled.png");
					}
				}
				//Sinon si le fichier a été supprimé ou déplacer entre temps
				else {
					labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/NOK.png")));
					path.setText("Echec : Le fichier n'existe plus, veuillez sauvegarder la table de nouveau");
					writeReq.setEnabled(false);
					writeReq.setImage("../Boutons/Disabled.png");
				}
			}				
		});
		writeReq.setEnabled(false);
		c.gridx = 0;
		c.gridy = 7;
		c.gridwidth = 3;
		c.weightx = 14;
		panelBouton.add(writeReq,c);

		//Ajout d'un icone de write req
		ImageIcon iconWriteReq= new ImageIcon(this.getClass().getResource("/img/write.png"));
		CustomLabel labelWriteReq = new CustomLabel(iconWriteReq,getWidth()/200,getHeight()/12);
		c.gridx = 3;
		c.gridy = 7;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.8;
		panelBouton.add(labelWriteReq,c);

		//Configuration du bouton save, ouverture du filechooser, ...
		final CustomButton saveTableSpec = new CustomButton("../Boutons/Disabled.png","Sauvegarder la table",40,45,16);
		saveTableSpec.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				//Remplissage du champs de choix du fichier
				fc.setSelectedFile(new File("fichier.xls"));

				//Ouverture de la fenêtre windows
				int returnVal = fc.showSaveDialog(GeneratorView.this);

				//Si l'on clic sur OK
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					//Verification que l'on a choisit un fichier
					if (file.exists ()) {
						//Demande d'écrasement du fichier
						int response = catchAnswer(file.getName());
						//Si on ne veut pas l'écraser
						if (response == -1){
							labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/warning.png")));
							path.setText("Attention : La sauvegarde n'a pas été effectuée");
						}
						//On regarde si l'on veut bien ajouter au fichier excel et on sauvegarde
						else if (file.getAbsolutePath().endsWith(".xls")){				
							params = catchAuthorAndSheetName();
							if(params[0]!=null){
								params[2] = file.getAbsolutePath();
								String fileName = (String) myGen.notifyActionTools(ActionTools.Save,params);
								labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/OK.png")));
								path.setText("Succès : La sauvegarde a été effectuée dans "+fileName);
								writeReq.setEnabled(true);
								writeReq.setImage((String) colors.get("button"));
								pathTable = file.getAbsolutePath();
							}
						}
						//On ne sauvegarde pas car ce n'est pas un fichier excel
						else {
							labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/NOK.png")));
							path.setText("Echec : Veuillez choisir un fichier Excel");
						}
					}
					//Sinon on verifie que l'on a ecrit le nom d'un fichier .xls et on sauvegarde
					else if (file.getAbsolutePath().endsWith(".xls")){
						params = catchAuthorAndSheetName();
						if(params[0]!=null){
							params[1] = "Classeur 1 " + params[1];
							params[2] = file.getAbsolutePath();
							String fileName = (String) myGen.notifyActionTools(ActionTools.Save,params);
							labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/OK.png")));
							path.setText("Succès : La sauvegarde a été effectuée dans "+fileName);
							writeReq.setEnabled(true);
							writeReq.setImage((String) colors.get("button"));
							pathTable = file.getAbsolutePath();
						}
					}
					//Sinon on rajoute l'extension et on sauvegarde
					else {
						//On regarde d'abord si le fichier existe
						file = new File(file.getAbsolutePath()+".xls");
						if (file.exists ()) {
							//Demande d'écrasement du fichier
							int response = catchAnswer(file.getName());
							//Si on ne veut pas l'écraser
							if (response == -1){
								labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/warning.png")));
								path.setText("Attention : La sauvegarde n'a pas été effectuée");
							}
							//Sinon on enregistre avec l'extension .xls
							else{
								params = catchAuthorAndSheetName();
								if(params[0]!=null){
									params[2] = file.getAbsolutePath();
									String fileName = (String) myGen.notifyActionTools(ActionTools.Save,params);
									labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/OK.png")));
									path.setText("Succès : La sauvegarde a été effectuée dans "+fileName);
									writeReq.setEnabled(true);
									writeReq.setImage((String) colors.get("button"));
									pathTable = file.getAbsolutePath();
								}
							}				
						}
						//Sinon on enregistre
						else{
							params = catchAuthorAndSheetName();
							if(params[0]!=null){
								params[1] = "Classeur 1 " + params[1];
								params[2] = file.getAbsolutePath();
								String fileName = (String) myGen.notifyActionTools(ActionTools.Save,params);
								labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/OK.png")));
								path.setText("Succès : La sauvegarde a été effectuée dans "+fileName);
								writeReq.setEnabled(true);
								writeReq.setImage((String) colors.get("button"));
								pathTable = file.getAbsolutePath();
							}
						}
					}
				} 
				//Si on a cliquer sur Annuler
				else{
					labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/Warning.png")));
					path.setText("Attention : La sauvegarde n'a pas été effectuée");	
				}
				params = new String[3];
			}				
		});
		saveTableSpec.setEnabled(false);
		c.gridx = 0;
		c.gridy = 6;
		c.gridwidth = 3;
		c.weightx = 14;
		panelBouton.add(saveTableSpec,c);

		//Ajout d'un icone de Save
		ImageIcon iconSave= new ImageIcon(this.getClass().getResource("/img/Save.png"));
		CustomLabel labelSave = new CustomLabel(iconSave,getWidth()/200,getHeight()/12);
		c.gridx = 3;
		c.gridy = 6;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.8;
		panelBouton.add(labelSave,c);

		//Configuration du bouton de refresh de la table
		final CustomButton refresh = new CustomButton("../Boutons/Disabled.png","Rafraîchir",20,45,16);
		refresh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//On reparse le nouveau fichier dont on connait déjà le path
				myGen.notifyActionTools(ActionTools.Parse, null);
				if (checkTable.getText().contains("<font color=")){
					checkTable.setText("");
					//On recharge les warnings
					ArrayList<String> messages = (ArrayList<String>) myGen.notifyActionTools(ActionTools.CheckTable, null);
					String warnings = "";
					if (!messages.isEmpty()){
						//Affichage de tous les nouveaux messages sans override
						for(String mess : messages){
							warnings += mess;
						}
						//Si le seul message est pour les doublons alors ce n'est pas important
						if(warnings.contains("Certaines transitions sont définies en double")&& messages.size()==1 || warnings.contains("La table semble complète")){
							labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/OK.png")));
							path.setText("Succès : La table semble complète");	
						}
						else{
							labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/warning.png")));
							path.setText("Attention : La table ne semble pas complète");	
						}	
					}
					else{
						labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/OK.png")));
						path.setText("Etape n°3 : Sauvegardez la table");
					}

					//On affiche les warnings
					checkTable.setText(warnings);
				}

				if(!displayTable.isEnabled()){
					//On recharge la JTable et on l'affiche
					displayTable = (JTable) myGen.notifyActionTools(ActionTools.BuildTable, null);
					displayTable.setEnabled(false);
					scrollPane2.add(displayTable);
					scrollPane2.setViewportView(displayTable);
					scrollPane2.setBounds(2, 0,getWidth()-10, 135);
				}
			}				
		});
		refresh.setEnabled(false);
		c.gridx = 2;
		c.gridy = 4;
		c.gridwidth = 1;
		c.weightx = 4;
		panelBouton.add(refresh,c);



		//Configuration du bouton de construction de la table
		final CustomButton buildSpec = new CustomButton("../Boutons/Disabled.png","Construire la table",30,45,16);
		buildSpec.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				//On récupère la JTable et on l'affiche
				displayTable = (JTable) myGen.notifyActionTools(ActionTools.BuildTable,null);
				displayTable.setEnabled(false);
				scrollPane2.add(displayTable);
				scrollPane2.setViewportView(displayTable);
				scrollPane2.setBounds(2, 0,getWidth()-10, 135);

				//On change de step
				saveTableSpec.setEnabled(true);
				saveTableSpec.setImage((String) colors.get("button"));
				refresh.setEnabled(true);
				refresh.setImage("../Boutons/Enabled.png");
				buildSpec.setEnabled(false);
				buildSpec.setImage("../Boutons/Disabled.png");	
				labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/warning.png")));
				path.setText("Etape n°3 : Sauvegardez la table ou validez le modèle");
			}				
		});
		buildSpec.setEnabled(false);
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 2;
		c.weightx = 10;
		panelBouton.add(buildSpec,c);

		//Configuration du bouton de construction de la table
		final CustomButton checkModel = new CustomButton("../Boutons/Disabled.png","Valider le modèle",40,45,16);
		checkModel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//On construit et récupère les message de la vérification
				ArrayList<String> messages = (ArrayList<String>) myGen.notifyActionTools(ActionTools.CheckTable, null);

				//S'il y a des warnings
				String warnings = "";
				if (!messages.isEmpty()){
					//Affichage de tous les nouveaux messages sans override
					for(String mess : messages){
						warnings += mess;
					}
					//Si le seul message est pour les doublons alors ce n'est pas important
					if(warnings.contains("Certaines transitions sont définies en double")&& messages.size()==1 || warnings.contains("La table semble complète")){
						labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/OK.png")));
						path.setText("Succès : La table semble complète");	
					}
					else{
						labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/warning.png")));
						path.setText("Attention : La table ne semble pas complète");	
					}
				}
				else{
					labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/OK.png")));
					path.setText("Etape n°3 : Sauvegardez la table");
				}

				//On affiche les warnings
				checkTable.setText(warnings);
				refresh.setEnabled(true);
				refresh.setImage("../Boutons/Enabled.png");	
				checkModel.setEnabled(false);
				checkModel.setImage("../Boutons/Disabled.png");
			}				
		});
		checkModel.setEnabled(false);
		c.gridx = 0;
		c.gridy = 5;
		c.gridwidth = 3;
		c.weightx = 14;
		panelBouton.add(checkModel,c);

		//Ajout d'un icone de Validation du modèle
		ImageIcon iconCheck= new ImageIcon(this.getClass().getResource("/img/check.png"));
		CustomLabel labelCheck = new CustomLabel(iconCheck,getWidth()/200,getHeight()/12);
		c.gridx = 3;
		c.gridy = 5;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.8;
		panelBouton.add(labelCheck,c);

		//Ajout d'un icone de Build
		ImageIcon iconBuild= new ImageIcon(this.getClass().getResource("/img/Build.png"));
		CustomLabel labelBuild = new CustomLabel(iconBuild,getWidth()/200,getHeight()/12);
		c.gridx = 3;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.8;
		panelBouton.add(labelBuild,c);

		//Configuration du bouton de choix du fichier PDE
		JButton getPath = new CustomButton((String) colors.get("button"), "Parcourir",20,45,16);
		getPath.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				fc.setSelectedFile(new File("fichier.diagram"));

				//Ouverture de la fenêtre windows d'ouverture de fichier
				int returnVal = fc.showOpenDialog(GeneratorView.this);

				//Si l'on a cliquer sur OK
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					//On récupère le fichier
					File file = fc.getSelectedFile();
					checkTable.setText("");

					//Clear de la table
					displayTable.setModel(new DefaultTableModel());
					DefaultTableModel dm = (DefaultTableModel)displayTable.getModel();
					dm.getDataVector().removeAllElements();	
					displayTable.repaint();

					//On verifie qu'un fichier valide a été choisi
					if(file.exists() && file.getAbsolutePath().endsWith(".diagram")){
						labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/OK.png")));
						path.setText("Etape n°2 : Construisez la table ou validez le modèle");
						//On charge le fichier dans le générateur
						myGen = new Generator(file.getAbsolutePath(),file.getName());
						myGen.notifyActionTools(ActionTools.Parse, null);
						saveTableSpec.setEnabled(false);
						saveTableSpec.setImage("../Boutons/Disabled.png");
						buildSpec.setEnabled(true);
						buildSpec.setImage((String) colors.get("button"));
						checkModel.setEnabled(true);
						checkModel.setImage((String) colors.get("button"));
						refresh.setEnabled(false);
						refresh.setImage("../Boutons/Disabled.png");

					}
					//Sinon on averti l'utilisateur qu'il n'a pas choisi un fichier pde valide
					else {
						labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/NOK.png")));
						path.setText("Echec : Veuillez choisir un fichier Imagin valide");
						buildSpec.setEnabled(false);
						buildSpec.setImage("../Boutons/Disabled.png");
						checkModel.setEnabled(false);
						checkModel.setImage("../Boutons/Disabled.png");
						writeReq.setEnabled(false);
						writeReq.setImage("../Boutons/Disabled.png");
						refresh.setEnabled(false);
						refresh.setImage("../Boutons/Disabled.png");
						saveTableSpec.setEnabled(false);
						saveTableSpec.setImage("../Boutons/Disabled.png");
					}
				}
				//Si on a cliquer sur annuler
				else{
					labelErreur.setIcon(new ImageIcon(this.getClass().getResource("/img/warning.png")));
					path.setText("Attention : Aucun fichier n'a été chargé");
				}
			}				
		});
		c.gridx = 2;
		c.gridy = 3;
		c.gridwidth = 1;
		c.weightx = 4;
		//Ajout du panneau de bouton à la frame
		panelBouton.add(getPath,c);

	}

	//Permet de récupérer le nom de l'auteur et le prefix necessaire pour les req
	private String[] catchAuthorAndPrefix(){
		String[] answer = new String[3];
		//Demande du nom de l'auteur
		answer = new CustomOptionPaneMultipleLabel(this.getWidth()/2+this.getLocation().x-150,this.getHeight()/2+this.getLocation().y-65,
				"img/info.png","Entrez le nom de l'auteur et le préfixe"
				,"Additionnal information","(Author)","(Co)-(Team)(DocId)(Author)",new Dimension(300,130)).showInputDialog();

		return answer;
	}

	private String[] catchAuthorAndSheetName(){
		String[] answer = new String[3];
		//Demande du nom de l'auteur
		answer = new CustomOptionPaneMultipleLabel(this.getWidth()/2+this.getLocation().x-160,this.getHeight()/2+this.getLocation().y-65,
				"img/info.png","Entrez le nom de l'auteur et le nom du classeur"
				,"Additionnal information","(Author)","(SheetName)",new Dimension(320,130)).showInputDialog();

		return answer;
	}	

	private int catchAnswer(String filename){
		int answer = -1;
		//Demande du nom de l'auteur
		answer = new CustomOptionPaneQuestion(this.getWidth()/2+this.getLocation().x-160,this.getHeight()/2+this.getLocation().y-65,
				"img/question.png","Voulez vous l'ajouter au fichier : \""+filename+"\" ?"
				,"Confirm overwrite",new Dimension(320,130)).showInputDialog(); 

		return answer;
	}

	public static void main(String[] args) throws FontFormatException{

		GeneratorView gen;
		try {
			gen = new GeneratorView();
			gen.setVisible(true);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	//Adapte la font à tous les éléments de la frame
	public static void setUIFont
	(javax.swing.plaf.FontUIResource f)
	{
		java.util.Enumeration keys = UIManager.getDefaults
		().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			if (UIManager.get(key) instanceof 
					javax.swing.plaf.FontUIResource)
				UIManager.put(key, f);
		}
	}

	//Initialisation de la frame
	private void initialize() {
		this.setTitle(" IMAGIN ");
		this.setSize(700,618);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/img/Build.png")));
		this.setLayout(new BorderLayout());
	}
}
