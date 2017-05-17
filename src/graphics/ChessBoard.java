package graphics;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class ChessBoard {
	
	private JPanel[][] square = new JPanel[8][8];
	private JPanel panel;
	int index = 0;
	
	public ChessBoard(JPanel panel){
		this.panel = panel;
		this.panel.setLayout(new GridLayout(8, 8));
	}
	
	public void initBoard(){
		for(int row=0; row<square.length; row++){
			for(int col=0; col<square[row].length; col++){
				square[row][col] = new JPanel();
				
				if(row%2 == 0 && col%2 == 0){
					square[row][col].setBackground(Color.WHITE);
					//System.out.println(row + " " + col + "white");

				}else if(row%2 == 0 && col%2 == 1){
					square[row][col].setBackground(new Color(255, 50, 50));
					//System.out.println(row + " " + col + "black");

				}else if(row%2 == 1 && col%2 == 0){
					square[row][col].setBackground(new Color(255, 50, 50));
					//System.out.println(row + " " + col + "black");

				}else{
					square[row][col].setBackground(Color.WHITE);
					//System.out.println(row + " " + col + "white");
				}
			this.panel.add(square[row][col]);
				


			}
		}
	}
	
	
	
	public JPanel getPanel() {
		return panel;
	}
	
	public JPanel getsquare(int row, int col) {
		return square[row][col];
	}



}
