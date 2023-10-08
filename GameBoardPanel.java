package sudoku;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameBoardPanel extends JPanel{
	private static final long serialVersionUID = 1L; //prevents serial warning
	
	/* Defining named constants for user interface sizez */
	public static final int CELL_SIZE = 60; //width and height of cell in pixels
	public static final int BOARD_WIDTH = CELL_SIZE * SudokuConstants.GRID_SIZE;
	public static final int BOARD_HEIGHT = CELL_SIZE * SudokuConstants.GRID_SIZE;
	
	/* Defining the game properties */
	private Cell[][] cells = new Cell[SudokuConstants.GRID_SIZE][SudokuConstants.GRID_SIZE]; //the board property of the game which has 9X9 cells
	private Puzzle puzzle = new Puzzle();               // the property of the game that contains a Puzzle with numbers array and isGiven array
	TextArea area;

	/* the Gameboard Contructor. */
	public GameBoardPanel() {
		super.setLayout(new GridLayout(SudokuConstants.GRID_SIZE, SudokuConstants.GRID_SIZE)); //JPanel
		
		for (int row = 0; row < SudokuConstants.GRID_SIZE; row++) {
			for (int col = 0; col < SudokuConstants.GRID_SIZE; col++){
				cells[row][col] = new Cell(row, col);
				super.add(cells[row][col]);
			}
		}
	
	
	    CellInputListener listener = new CellInputListener();
	
		for (int row = 0; row < SudokuConstants.GRID_SIZE; row++){
			for (int col = 0; col < SudokuConstants.GRID_SIZE; col++){
				if(cells[row][col].isEditable()) {
					cells[row][col].addActionListener(listener);   //targeted to all the editable rows and columns
				}
			}
		}
		
		super.setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
	}
	
	/* Function that generates a new puzzle and rests the gameboard based on the puzzle */
	public void newGame(){
		puzzle.newPuzzle(2); //generate a new puzzle
		
		/* Initialize all 9X9 cells, based on the puzzle */
		for (int row = 0; row < SudokuConstants.GRID_SIZE; row++) {
			for (int col = 0; col < SudokuConstants.GRID_SIZE; col++){
				cells[row][col].newGame(puzzle.numbers[row][col], puzzle.isGiven[row][col]);
			}
		}
		
	}
	
	/* function to return true when the puzzle is solved */
	public boolean isSolved(){
		for (int row = 0; row < SudokuConstants.GRID_SIZE; row++) {
			for (int col = 0; col < SudokuConstants.GRID_SIZE; col++){
				if (cells[row][col].status == CellStatus.TO_GUESS || cells[row][col].status == CellStatus.WRONG_GUESS) {
					return false;
				}
			}
		}
		return true;
	}

	
	private class CellInputListener implements ActionListener{
		//@Override
		public void actionPerformed(ActionEvent e){
			Cell sourceCell =  (Cell)e.getSource(); // gets the reference of the JTextField that triggers this action event
			int numberIn = Integer.parseInt(sourceCell.getText()); //retrieve the number entered by player
		
			/* -check the numberIn against sourceCell.number 
			   -Update the cell status of sourceCell.status,
			   -and re-paint the cell via sourceCell.paint().
			*/
			if(numberIn == sourceCell.number) {
				sourceCell.status = CellStatus.CORRECT_GUESS;
			} else {
				sourceCell.status = CellStatus.WRONG_GUESS;
			}
			sourceCell.paint();      //re-paint the cell based on its status
			
			if(isSolved()){
				JOptionPane.showMessageDialog(null, "Congratulation!");
			}
			
		}
	}


	
}
	