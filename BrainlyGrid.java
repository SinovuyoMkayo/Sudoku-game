public class BrainlyGrid {
    public int[][] gameGrid;

    BrainlyGrid(){
        gameGrid = new int[9][9]; //empty
    }

    BrainlyGrid(String begin){  
        gameGrid = new int[9][9];
        for(int x = 0; x <9; x++){
            for(int y =0; y<9; y++){
                gameGrid[x][y] = 0;
            }
        }

        gameGrid[0][0] = 5; //top left most
        gameGrid[0][1] = 3;
        gameGrid[0][4] = 7;
        gameGrid[1][0] = 6;
        gameGrid[1][3] = 1;
        gameGrid[1][4] = 9;
        gameGrid[1][5] = 5;
        gameGrid[2][1] = 9;
        gameGrid[2][2] = 8;
        gameGrid[2][7] = 6;
        gameGrid[3][0] = 8;
        gameGrid[3][4] = 6;
        gameGrid[3][8] = 3;
        gameGrid[4][0] = 4;
        gameGrid[4][3] = 8;
        gameGrid[4][5] = 3;
        gameGrid[4][8] = 1;
        gameGrid[5][0] = 7;
        gameGrid[5][4] = 2;
        gameGrid[5][8] = 6;
        gameGrid[6][1] = 6;
        gameGrid[6][6] = 2;
        gameGrid[6][7] = 8;
        gameGrid[7][3] = 4;
        gameGrid[7][4] = 1;
        gameGrid[7][5] = 9;
        gameGrid[7][8] = 5;
        gameGrid[8][4] = 8;
        gameGrid[8][7] = 7;
        gameGrid[8][8] = 9; //bottom right most

    }

    public void printMyBrainlyGrid(){
        for (int i = 0; i < 9; ++i) {
            if (i % 3 == 0)
                System.out.println(" -----------------------");
            for (int j = 0; j < 9; ++j) {
                if (j % 3 == 0) System.out.print("| ");
                System.out.print(gameGrid[i][j] == 0
                        ? " "
                                : Integer.toString(gameGrid[i][j]));

                System.out.print(' ');
            }
            System.out.println("|");
        }
        System.out.println(" -----------------------");
    }

    public boolean insertNumber(int row, int column, int myNumber){
        System.out.println("Entered insertNumber " + "row " + row + " " + "column " + column + " myNumber " + myNumber);
        if(checkRow(row, column, myNumber) == false) 
            return false;

        if(checkColumn(row, column, myNumber) == false)
            return false;

        if(checkBox(row, column, myNumber) == false) 
            return false;

        gameGrid[row][column] = myNumber;


        return true;

    }

    public boolean removeNumber(int row, int column, int myNumber) {
        gameGrid[row][column] = 0;

        return true;
    }

    private boolean checkRow(int row, int column, int myNumber) {
        for (int a = 0; a < 9; ++a)  // row
            if (myNumber == gameGrid[row][a]){
                System.out.println(myNumber + " Already in Row: " + row);
                return false;
            }
        return true;

    }
    private boolean checkColumn(int row, int column, int myNumber) {
        for (int b = 0; b < 9; ++b)  // column
            if (myNumber == gameGrid[b][column]){
                System.out.println(myNumber + " Already in Column: " + column);  
                return false;
            }
        return true;

    }

    private boolean checkBox(int row, int column, int myNumber) {
        int boxRowOffset = (row / 3)*3;
        int boxColOffset = (column / 3)*3;
        for (int c = 0; c < 3; ++c) // box
            for (int d = 0; d < 3; ++d)
                if (myNumber == gameGrid[boxRowOffset+c][boxColOffset+d]){
                    System.out.println(myNumber + " Already in Box " );
                     return false;
                }
        return true;

    }
}