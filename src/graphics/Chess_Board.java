package graphics;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Chess_Board extends JPanel {

	private static final long serialVersionUID = 8780853282753725418L;

	private int dim = 75;
	int index = 0;

	private JLabel[] squares = new JLabel[65];

	public Chess_Board(int width, int height, JPanel panel) {
		this.setSize(new Dimension(width, height));
		initChessBoard(panel);
	}

	public void initChessBoard(JPanel panel) {

		Color black = new Color(0, 0, 0);
		Color white = new Color(255, 255, 255);
		GridLayout gridlayout = new GridLayout(8, 8);
		panel.setLayout(gridlayout);

		for (int i = 1; i <=8; i++) {
			for (int j = 1; j<=8; j++) {

				squares[index] = new JLabel();
				squares[index].setBorder(BorderFactory.createMatteBorder(
                        1, 5, 1, 1, Color.red));
				squares[index].setSize(new Dimension(dim, dim));

				// rows 1,3,5,7
				if (i % 2 == 1) {

					if (j % 2 == 0) {
						squares[index].setBackground(black);
						System.out.println("printing black impair");
						//panel.add(squares[index]);
					} else {
						squares[index].setBackground(white);
						System.out.println("printing white impair");
						//panel.add(squares[index]);
					}

				} else {

					if (j % 2 == 0) {
						squares[index].setBackground(white);
						System.out.println("printing white pair");
						//panel.add(squares[index]);
					} else {
						squares[index].setBackground(black);
						System.out.println("printing black pair");
						
					}
				}
				

				panel.add(squares[index]);
				index++;
				System.out.println(i + " " + j);
				System.out.println(squares.length);
				
				
			}
		}



	}

	public static void main(String[] args) {
		int size = 600;
		Color black = new Color(0, 0, 0);

		JFrame frame = new JFrame("");
		JPanel panel = new JPanel();
		frame.setSize(size, size);
		frame.add(panel);
		Chess_Board chessboard = new Chess_Board(600, 600, panel);
		chessboard.initChessBoard(panel);
		
		//frame.add(new Chess_Board(500, 500).initChessBoard());
		frame.setVisible(true);
	}

}
