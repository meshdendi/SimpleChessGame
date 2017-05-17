package Pieces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import graphics.Board;
import graphics.ChessBoard;

public class Pawn implements Piece {

	private ImageIcon icon;
	private int row;
	private ChessBoard chessboard;
	private int col;
	private JPanel panel;
	private Color team;
	private JLabel label;
	
	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public Color getTeam() {
		return team;
	}

	public void setTeam(Color team) {
		this.team = team;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}


	public Pawn(JPanel panel, Color team, ChessBoard board) {
		this.panel = panel;
		this.team = team;
		this.chessboard = board;

		if (this.isWhite()) {
			this.icon = new ImageIcon("W:\\Game Projects\\Chess\\src\\images\\white-pawn.png");
		} else {
			this.icon = new ImageIcon("W:\\Game Projects\\Chess\\src\\images\\black-pawn.png");
		}

		ImageIcon scaledImage = new ImageIcon(icon.getImage().getScaledInstance(icon.getIconWidth() / 3,
				icon.getIconHeight() / 3, Image.SCALE_SMOOTH));
		label = new JLabel("");
		label.setIcon(scaledImage);
		label.setSize(75, 75);
		;
		this.panel.add(label, BorderLayout.SOUTH);
		
		
		this.panel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {}
			
			@Override
			public void mousePressed(MouseEvent arg0) {}
			
			@Override
			public void mouseExited(MouseEvent arg0) {}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				move(arg0);
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
	public void move(MouseEvent arg0) {
		
			this.panel.setBackground(this.panel.getBackground());
			this.panel.setBackground(new Color(0,0,255));
			this.chessboard.getsquare(this.row+1, this.col).setBackground(Color.BLUE);
			this.chessboard.getsquare(this.row+2, this.col).setBackground(Color.BLUE);
			System.out.println(this.row);
			System.out.println(this.col);


		
	}
	
	
}
