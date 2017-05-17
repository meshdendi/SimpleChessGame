package Pieces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tower implements Piece {

	ImageIcon icon;
	int row;
	int col;
	JPanel panel;
	Color team;

	public Tower(JPanel panel, Color team) throws MalformedURLException {
		this.panel = panel;
		this.team = team;
		
		if(this.isWhite()){
			this.icon = new ImageIcon("W:\\Game Projects\\Chess\\src\\images\\white-tower.png");
		}else{
			this.icon = new ImageIcon("W:\\Game Projects\\Chess\\src\\images\\black-tower.png");
		}
		
		ImageIcon scaledImage = new ImageIcon(icon.getImage()
                .getScaledInstance(icon.getIconWidth() / 4,
                		icon.getIconHeight() / 4, Image.SCALE_SMOOTH));
		JLabel label = new JLabel("");
		label.setIcon(scaledImage);
		label.setSize(75,75);;
		this.panel.add(label, BorderLayout.SOUTH);
		
	}

	@Override
	public boolean isWhite() {
		if (this.team == Color.WHITE) {
			return true;
		}
		return false;
	}

	@Override
	public void move(MouseEvent arg0) {

	}

}
