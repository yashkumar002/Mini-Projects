

// TETRIS GAME...

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collections;
// Created by Yash Kumar Banjare.....
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tetris extends JPanel {

	private static final long serialVersionUID = -8715353373678321308L;

	private final Point[][][] Tetraminos = {
			// I-Piece
			{
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3) },
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3) }
			},
			// Created by Yash Kumar Banjare.....
			// J-Piece
			{
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 0) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 2) },
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 2) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 0) }
			},// Created by Yash Kumar Banjare.....
			
			// L-Piece
			{
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 2) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 2) },
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 0) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 0) }
			},
			
			// O-Piece
			{
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) }
			},// Created by Yash Kumar Banjare.....
			
			// S-Piece
			{
				{ new Point(1, 0), new Point(2, 0), new Point(0, 1), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2) },
				{ new Point(1, 0), new Point(2, 0), new Point(0, 1), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2) }
			},
			// Created by Yash Kumar Banjare.....
			// T-Piece
			{
				{ new Point(0, 1), new Point(0, 1), new Point(1, 1), new Point(2, 1) },
				{ new Point(0, 1), new Point(0, 1), new Point(1, 1), new Point(1, 2) },
				{ new Point(1, 0), new Point(1, 1), new Point(2, 1), new Point(1, 2) },
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(1, 2) }
			},// Created by Yash Kumar Banjare.....
			
			// Z-Piece
			{
				{ new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1) },
				{ new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(0, 2) },
				{ new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1) },
				{ new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(0, 2) }
			}
	};// Created by Yash Kumar Banjare.....
	
	private final Color[] tetraminoColors = {
		Color.cyan, Color.blue, Color.orange, Color.yellow, Color.green, Color.pink, Color.red
	};
	
	private Point pieceOrigin;
	private int currentPiece;
	private int rotation;
	private ArrayList<Integer> nextPieces = new ArrayList<Integer>();
// Created by Yash Kumar Banjare.....
	private long score;
	private Color[][] well;
	
	// Creates a border around the well and initializes the dropping piece
	private void init() {
		well = new Color[12][24];
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 23; j++) {
				if (i == 0 || i == 11 || j == 22) {
					well[i][j] = Color.GRAY;
				} else {
					well[i][j] = Color.BLACK;
				}
			}// Created by Yash Kumar Banjare.....
		}
		newPiece();
	}
	
	// Put a new, random piece into the dropping position
	public void newPiece() {
		pieceOrigin = new Point(5, 2);
		rotation = 0;
		if (nextPieces.isEmpty()) {
			Collections.addAll(nextPieces, 0, 1, 2, 3, 4, 5, 6);
			Collections.shuffle(nextPieces);
		}
		currentPiece = nextPieces.get(0);
		nextPieces.remove(0);
	}// Created by Yash Kumar Banjare.....
	
	// Collision test for the dropping piece
	private boolean collidesAt(int x, int y, int rotation) {
		for (Point p : Tetraminos[currentPiece][rotation]) {
			if (well[p.x + x][p.y + y] != Color.BLACK) {
				return true;
			}
		}
		return false;
	}// Created by Yash Kumar Banjare.....
	
	// Rotate the piece clockwise or counterclockwise
	public void rotate(int i) {
		int newRotation = (rotation + i) % 4;
		if (newRotation < 0) {
			newRotation = 3;
		}
		if (!collidesAt(pieceOrigin.x, pieceOrigin.y, newRotation)) {
			rotation = newRotation;
		}
		repaint();
	}// Created by Yash Kumar Banjare.....
	
	// Move the piece left or right
	public void move(int i) {
		if (!collidesAt(pieceOrigin.x + i, pieceOrigin.y, rotation)) {
			pieceOrigin.x += i;	
		}
		repaint();
	}
	// Created by Yash Kumar Banjare.....
	// Drops the piece one line or fixes it to the well if it can't drop
	public void dropDown() {
		if (!collidesAt(pieceOrigin.x, pieceOrigin.y + 1, rotation)) {
			pieceOrigin.y += 1;
		} else {
			fixToWell();
		}	
		repaint();
	}// Created by Yash Kumar Banjare.....
	
	// Make the dropping piece part of the well, so it is available for
	// collision detection.
	public void fixToWell() {
		for (Point p : Tetraminos[currentPiece][rotation]) {
			well[pieceOrigin.x + p.x][pieceOrigin.y + p.y] = tetraminoColors[currentPiece];
		}
		clearRows();
		newPiece();
	}
	// Created by Yash Kumar Banjare.....
	public void deleteRow(int row) {
		for (int j = row-1; j > 0; j--) {
			for (int i = 1; i < 11; i++) {
				well[i][j+1] = well[i][j];
			}
		}
	}// Created by Yash Kumar Banjare.....
	
	// Clear completed rows from the field and award score according to
	// the number of simultaneously cleared rows.
	public void clearRows() {
		boolean gap;
		int numClears = 0;
		
		for (int j = 21; j > 0; j--) {
			gap = false;
			for (int i = 1; i < 11; i++) {
				if (well[i][j] == Color.BLACK) {
					gap = true;
					break;
				}// Created by Yash Kumar Banjare.....
			}
			if (!gap) {
				deleteRow(j);
				j += 1;
				numClears += 1;
			}
		}// Created by Yash Kumar Banjare.....
		
		switch (numClears) {
		case 1:
			score += 100;
			break;
		case 2:
			score += 300;
			break;
		case 3:// Created by Yash Kumar Banjare.....
			score += 500;
			break;
		case 4:
			score += 800;
			break;
		}
	}
	// Created by Yash Kumar Banjare.....
	// Draw the falling piece
	private void drawPiece(Graphics g) {		
		g.setColor(tetraminoColors[currentPiece]);
		for (Point p : Tetraminos[currentPiece][rotation]) {
			g.fillRect((p.x + pieceOrigin.x) * 26, 
					   (p.y + pieceOrigin.y) * 26, 
					   25, 25);
		}
	}
	// Created by Yash Kumar Banjare.....
	@Override 
	public void paintComponent(Graphics g)
	{
		// Paint the well
		g.fillRect(0, 0, 26*12, 26*23);
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 23; j++) {
				g.setColor(well[i][j]);
				g.fillRect(26*i, 26*j, 25, 25);
			}
		}// Created by Yash Kumar Banjare.....
		
		// Display the score
		g.setColor(Color.WHITE);
		g.drawString("" + score, 19*12, 25);
		
		// Draw the currently falling piece
		drawPiece(g);
	}
// Created by Yash Kumar Banjare.....
	public static void main(String[] args) {
		JFrame f = new JFrame("Tetris");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(12*26+10, 26*23+25);
		f.setVisible(true);
		// Created by Yash Kumar Banjare.....
		final Tetris game = new Tetris();
		game.init();
		f.add(game);
		// Created by Yash Kumar Banjare.....
		// Keyboard controls
		f.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			// Created by Yash Kumar Banjare.....
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					game.rotate(-1);
					break;
				case KeyEvent.VK_DOWN:
					game.rotate(+1);// Created by Yash Kumar Banjare.....
					break;
				case KeyEvent.VK_LEFT:
					game.move(-1);
					break;
				case KeyEvent.VK_RIGHT:
					game.move(+1);
					break;
				case KeyEvent.VK_SPACE:// Created by Yash Kumar Banjare.....
					game.dropDown();
					game.score += 1;
					break;// Created by Yash Kumar Banjare.....
				} 
			}
			
			public void keyReleased(KeyEvent e) {
			}// Created by Yash Kumar Banjare.....
		});
		
		// Make the falling piece drop every second
		new Thread() {
			@Override public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
						game.dropDown();// Created by Yash Kumar Banjare.....
					} catch ( InterruptedException e ) {}
				}
			}
		}.start();// Created by Yash Kumar Banjare.....
	}
}


// Created by Yash Kumar Banjare.....