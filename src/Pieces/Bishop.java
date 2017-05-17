package Pieces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bishop implements Piece {
	
	ImageIcon icon;
	int row;
	int col;
	JPanel panel;
	Color team;
	
	public Bishop(JPanel panel, Color team){
		this.panel = panel;
		this.team = team;
		
		if(this.isWhite()){
			this.icon = new ImageIcon("W:\\Game Projects\\Chess\\src\\images\\white-bishop.png");
		}else{
			this.icon = new ImageIcon("W:\\Game Projects\\Chess\\src\\images\\black-bishop.png");
		}
		
		ImageIcon scaledImage = new ImageIcon(icon.getImage()
                .getScaledInstance(icon.getIconWidth() / 3,
                		icon.getIconHeight() / 3, Image.SCALE_SMOOTH));
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
	public void move(int rowSource, int colSource, int rowDestination, int colDestination) {
		
	}

}
