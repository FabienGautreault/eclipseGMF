package application;







import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
 
class CustomOptionPaneQuestion extends JDialog
{
  
	private JLabel label = new JLabel();
	private int actionPerformed = -1;
	
	public CustomOptionPaneQuestion(int x, int y,String pathIcon,String message,String title,Dimension d){
		//On pourra récupérer le résultat des actionPerformed
		setModal(true);
		//Initialisation de la fenetre
		initialize(x, y, pathIcon, message, title,d);
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
		c.gridheight = 1;
		panel.add(label,c);
		JLabel fake = new JLabel("             ");
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 4;
		panel.add(fake,c);
		//
		JLabel fake1 = new JLabel("                ");
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		panel.add(fake1,c);
		//Ajout du bouton OK
		CustomButton btnOK = new CustomButton("../Boutons/EnabledT.png","      OK      ",70,30,13);
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				actionPerformed = 1;
				dispose();
			}
		});
		panel.add(btnOK,c);
		//Ajout du bouton Cancel
		CustomButton btnCancel = new CustomButton("../Boutons/EnabledT.png","  Annuler  ",70,30,13);
		c.gridx = 2;
		c.gridy =2;
		c.gridwidth = 1;
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				actionPerformed = -1;
				dispose();
			}
		});
		panel.add(btnCancel,c);
		//
		JLabel fake2 = new JLabel("                  ");
		c.gridx = 3;
		c.gridy = 2;
		c.gridwidth = 1;
		panel.add(fake2,c);
		this.add(panel);
		setVisible(true);
	}
	
	public int showInputDialog(){
		return actionPerformed;
	}
	
	public void initialize(int x, int y,String pathIcon,String message,String title,Dimension d){
		label.setText(message);
		setTitle(title);
		setLocation(x, y);
		setSize(d);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(pathIcon));
	}
}