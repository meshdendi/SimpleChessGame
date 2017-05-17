package graphics;

import java.awt.Color;
import java.awt.Dimension;

import java.net.MalformedURLException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Pieces.Bishop;
import Pieces.Horse;
import Pieces.King;
import Pieces.Pawn;
import Pieces.Queen;
import Pieces.Tower;

public class Application extends JFrame {

	private static final long serialVersionUID = -3615794052762158884L;

	private JPanel panel;

	public Application() throws MalformedURLException {
		panel = new JPanel();
		initUI();
	}

	public void initUI() throws MalformedURLException {

		// init the game board
		this.setTitle("Chess");
		this.setSize(new Dimension(600, 650));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// set the chess board black and white squares
		ChessBoard chessboard = new ChessBoard(panel);
		chessboard.initBoard();
		this.panel = chessboard.getPanel();
		this.add(panel);
		panel.setSize(new Dimension(600, 600));

		Tower whiteTower1 = new Tower(chessboard.getsquare(0, 0), Color.WHITE);
		Tower whiteTower2 = new Tower(chessboard.getsquare(0, 7), Color.WHITE);
		Tower blackTower1 = new Tower(chessboard.getsquare(7, 0), Color.BLACK);
		Tower blackTower2 = new Tower(chessboard.getsquare(7, 7), Color.BLACK);

		Horse whiteHorse1 = new Horse(chessboard.getsquare(0, 1), Color.WHITE);
		Horse whiteHorse2 = new Horse(chessboard.getsquare(0, 6), Color.WHITE);
		Horse blackHorse1 = new Horse(chessboard.getsquare(7, 1), Color.BLACK);
		Horse blackHorse2 = new Horse(chessboard.getsquare(7, 6), Color.BLACK);

		Bishop whiteBishop1 = new Bishop(chessboard.getsquare(0, 2), Color.WHITE);
		Bishop whiteBishop2 = new Bishop(chessboard.getsquare(0, 5), Color.WHITE);
		Bishop blackBishop1 = new Bishop(chessboard.getsquare(7, 2), Color.BLACK);
		Bishop blackBishop2 = new Bishop(chessboard.getsquare(7, 5), Color.BLACK);

		Pawn[] whitePawns = new Pawn[8];
		Pawn[] blackPawns = new Pawn[8];

		King blackKing = new King(chessboard.getsquare(7, 3), Color.BLACK);
		King whiteKing = new King(chessboard.getsquare(0, 4), Color.WHITE);

		Queen whiteQueen = new Queen(chessboard.getsquare(0, 3), Color.WHITE);
		Queen blackQueen = new Queen(chessboard.getsquare(7, 4), Color.BLACK);

		for (int i = 0; i < whitePawns.length; i++) {
			whitePawns[i] = new Pawn(chessboard.getsquare(1, i), Color.WHITE,chessboard);
		}

		for (int i = 0; i < blackPawns.length; i++) {
			blackPawns[i] = new Pawn(chessboard.getsquare(6, i), Color.BLACK,chessboard);
		}




	}

	public static void main(String[] args) throws MalformedURLException {
		Application app = new Application();
		app.setVisible(true);

	}

}
