package sudoku;
import java.util.*;
import java.awt.*;
import javax.swing.JTextField;
import java.awt.event.*;

public class Cell extends JTextField {
	private static final long serialVersionUID = 1L;
	
	/* Defines colours and Fonts based on CellStatus*/
	public static final Color BG_EXISTING_CELL = new Color(250, 250, 250); 
	public static final Color FG_EXISTING_CELL = Color.BLACK; //colour of the given numbers
	public static final Color FG_NOT_GIVEN = Color.GRAY;
	public static final Color BG_EMPTY_CELL = new Color(200, 200, 200);
	public static final Color BG_CORRECT_VALUE = new Color(0, 200, 0);
	public static final Color BG_WRONG_VALUE = new Color(200, 0, 0);
	public static final Font FONT_NUMBERS = new Font("OCR A Extended", Font.PLAIN, 25);
	
	int row, column; // defines the row and column number
	
	int cellNumber; // cell number 1 to 9 since we have 9 cells
	
	CellStatus status;
	
	
	public Cell(int row, int column) {
		super(); // JTextField
		this.row = row;
		this.column = column;
		
		
		super.setHorizontalAlignment(JTextField.CENTER);
		super.setFont(FONT_NUMBERS);
		
	}//constuctor
	
	public void newGame(int cellNumber, boolean isGiven) {
		this.cellNumber = cellNumber;
		status = isGiven ? CellStatus.EXISTING_CELL : CellStatus.EMPTY_CELL;
		paint(); 
		
	}
	
	
	public void paint() {
		if (status == CellStatus.EXISTING_CELL) {
			
			super.setText(cellNumber + "");
			super.setEditable(false);
			super.setBackground(BG_EXISTING_CELL);
			super.setForeground(FG_EXISTING_CELL); //displays properties
			
		} else if (status == CellStatus.EMPTY_CELL) {
			super.setText("");
			super.setEditable(true);
			super.setBackground(BG_EMPTY_CELL);
			super.setForeground(FG_NOT_GIVEN);
			
		} else if (status == CellStatus.CORRECT_VALUE){
			super.setBackground(BG_CORRECT_VALUE);
		
		} else if (status == CellStatus.WRONG_VALUE){
			super.setBackground(BG_WRONG_VALUE);
		
		}
	}
	
}
		
			