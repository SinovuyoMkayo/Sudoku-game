package sudoku;
 
public class Puzzle{
     int[][] numbers= new int[SudokuConstants.gridsize][SudokuConstants.gridsize];
	 boolean[][] isGiven= new boolean [SudokuConstants.gridsize][SudokuConstants.gridsize];
	 
	 public Puzzle(){
		 super();
	 }
	 
	 public void newPuzzle (int cellsToGuess){
		  int[][] hardcodedNumbers =
                          {{9,1,7,4,8,2,3,5,6}, 
                           {4,6,3,5,7,1,2,8,9},
						               {2,5,8,6,3,9,1,7,4},
						               {6,9,4,2,5,7,8,1,3},
						               {7,8,2,1,6,3,4,9,5},
						               {5,3,1,9,4,8,7,6,2},
						               {1,2,5,7,9,4,6,3,8},
						               {3,7,9,8,2,6,5,4,1},
		                       {8,4,6,3,1,5,9,2,7}};

      
      for (int row = 0; row < SudokuConstants.gridsize; ++row) {
         for (int col = 0; col < SudokuConstants.gridsize; ++col){
			 numbers[row][col]= hardcodedNumbers[row][col];
		 }
	  }
	  
	  boolean[][] hardcodedIsGiven =
         {{true, true, true, true, true, false, true, true, true},
          {true, true, true, true, true, true, true, true, false},
          {true, true, true, true, true, true, true, true, true},
          {true, true, true, true, true, true, true, true, true},
          {true, true, true, true, true, true, true, true, true},
          {true, true, true, true, true, true, true, true, true},
          {true, true, true, true, true, true, true, true, true},
          {true, true, true, true, true, true, true, true, true},
          {true, true, true, true, true, true, true, true, true}};


      for (int row = 0; row < SudokuConstants.gridsize; ++row) {
         for (int col = 0; col < SudokuConstants.gridsize; ++col) {
            isGiven[row][col] = hardcodedIsGiven[row][col];
         }
      }
   }

  
   
}
