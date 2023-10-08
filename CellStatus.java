package sudoku;

public enum CellStatus {
	EXISTING_CELL,          //A cell that already exist, cannot be changed
	EMPTY_YCELL,       //A cell that has not yet been atempted
	CORRECT_VALUE,  //A cell that has a correctly guessed value/ number
	INCORRECT_VALUE     //A cell that has an incorrectly guessed value/ number

}