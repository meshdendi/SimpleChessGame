package Pieces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pawn implements Piece {

	ImageIcon icon;
	int row;
	int col;
	JPanel panel;
	Color team;

	public Pawn(JPanel panel, Color team) {
		this.panel = panel;
		this.team = team;

		if (this.isWhite()) {
			this.icon = new ImageIcon("W:\\Game Projects\\Chess\\src\\images\\white-pawn.png");
		} else {
			this.icon = new ImageIcon("W:\\Game Projects\\Chess\\src\\images\\black-pawn.png");
		}

		ImageIcon scaledImage = new ImageIcon(icon.getImage().getScaledInstance(icon.getIconWidth() / 3,
				icon.getIconHeight() / 3, Image.SCALE_SMOOTH));
		JLabel label = new JLabel("");
		label.setIcon(scaledImage);
		label.setSize(75, 75);
		;
		this.panel.add(label, BorderLayout.SOUTH);
		
		this.panel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("asdasdasdasd");				
			}
		});
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
