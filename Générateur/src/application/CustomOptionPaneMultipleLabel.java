package application;







import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
 
class CustomOptionPaneMultipleLabel extends JDialog
{
  
	private JLabel label = new JLabel();
	JTextField textfield1 = new JTextField();
	JTextField textfield2 = new JTextField();
	private String[] actionPerformed = new String[3];
	
	public CustomOptionPaneMultipleLabel(int x, int y,String pathIcon,String message,String title,String label1, String label2,Dimension d){
		//On pourra récupérer le résultat des actionPerformed
		setModal(true);
		//Initialisation de la fenetre
		initialize(x, y, pathIcon, message, title, label1, label2,d);
		//Mise ne place du layout
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
	    GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(1,10,1,1);
		//Ajout du label
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 4;
		panel.add(label,c);
		//Ajout du premier textfield
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 4;
		panel.add(textfield1,c);
		//Ajout du second textfield
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 4;
		panel.add(textfield2,c);
		//
		JLabel fake1 = new JLabel("          ");
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		panel.add(fake1,c);
		//Ajout du bouton OK
		CustomButton btnOK = new CustomButton("../Boutons/EnabledT.png","      OK      ",40,40,13);
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				actionPerformed[0] = textfield1.getText();
				actionPerformed[1] = textfield2.getText();
				dispose();
			}
		});
		panel.add(btnOK,c);
		//Ajout du bouton CAncel
		CustomButton btnCancel = new CustomButton("../Boutons/EnabledT.png"," Annuler ",40,40,13);
		c.gridx = 2;
		c.gridy = 3;
		c.gridwidth = 1;
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		panel.add(btnCancel,c);
		//
		JLabel fake2 = new JLabel("          ");
		c.gridx = 3;
		c.gridy = 3;
		c.gridwidth = 1;
		panel.add(fake2,c);
		this.add(panel);
		setVisible(true);
	}
	
	public String[] showInputDialog(){
		return actionPerformed;
	}
	
	public void initialize(int x, int y,String pathIcon,String message,String title,String label1, String label2,Dimension d){
		label.setText(message);
		setTitle(title);
		textfield1.setText(label1);
		textfield2.setText(label2);
		setLocation(x, y);
		setSize(d);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(pathIcon));
	}
}