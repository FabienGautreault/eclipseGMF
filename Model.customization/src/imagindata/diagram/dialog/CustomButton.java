package imagindata.diagram.dialog;







import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CustomButton extends JButton {
	//Texture du Bouton
	private Image backGround = null;
	//Nom du bouton
	private String name;
	private boolean over = false;
	private float myFontSize;

	public CustomButton(String imageName, String buttonName, int Width, int Height,float fontSize) {
		this.setImage(imageName);
		this.name = buttonName;
		this.setText(buttonName);
		this.myFontSize = fontSize;
		setOpaque(false);
		setPreferredSize(new Dimension(Width,Height));
		//Intéraction sur le push
		addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent me) {
				if(isEnabled()){
					setImage("/Boutons/Push.png");
					over = true;
					repaint();
				}
			} 

			public void mouseReleased(MouseEvent me) { 
				over = false;
				if(isEnabled()){
					setImage("/Boutons/Enabled.png");
					repaint();
				}
			} 
			
		}); 
	}

	public void setImage(String imageName){
		this.backGround = new ImageIcon(getClass().getResource(imageName)).getImage();
		repaint();
	}

	public void paintComponent( Graphics g )
	{
		if ( backGround != null ){
			super.paintComponent( g );
			Font font = new Font("CharisSILB",Font.BOLD,12);
			//Chargement et création de la font
			//File fic = new File("fonts/CharisSILB.ttf");
			//Font font = Font.createFont(Font.TRUETYPE_FONT, fic);
			//font = font.deriveFont(Font.BOLD,myFontSize);
			//Permet de regarder la taille de la font pour la centrer dans le bouton
			FontMetrics metrics = g.getFontMetrics(font);
			g.setFont(font);

			//Shades
			//g.setColor(Color.black);
			//Compound
			//g.setColor(new Color(176,87,20));
			//Complémentaires
			//g.setColor(new Color(150,101,0));
			//Triad
			//On écrit en gris si le bouton est a disabled
			if(!this.isEnabled()){
				g.setColor(new Color(240,240,240));
			}
			else{
				g.setColor(new Color(200,200,200));
			}
			if(over){
				g.setColor(new Color(0,0,0));
			}

			g.drawImage(backGround, -metrics.stringWidth(name), 0, getWidth()+2*metrics.stringWidth(name), getHeight()+4, this);
			g.drawString(name, getWidth()/2-metrics.stringWidth(name)/2, getHeight()/2+5);

		}
	}
}