package application;







import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class CustomLabel extends JLabel {
	
	public CustomLabel(ImageIcon img, int w, int h) {
		super(img);
		setPreferredSize(new Dimension(w,h));
		setSize(w, h);
	}
	
	public void paintComponent(Graphics g) {
			g.drawImage(((ImageIcon) getIcon()).getImage(), 0, 0, getSize().width, getSize().height, this);
	}
} 