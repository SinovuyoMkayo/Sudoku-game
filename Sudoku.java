import java.util.Scanner;
class SudokuGridGenerator{

	public static void Easygrid(){
		
		int [][] easygrid={{6,2,4,1,5,7,8,3,9}, //easy
                           {8,5,9,3,4,2,6,7,1},
						   {1,7,3,9,6,8,2,4,5},
						   {3,9,5,7,2,1,4,6,8},
						   {4,8,2,6,3,9,1,5,7},
						   {7,6,2,4,8,5,3,9,2},
						   {5,3,8,2,9,6,7,1,4},
						   {9,1,6,8,7,4,5,2,3},
		                   {2,4,7,5,1,3,9,8,6}};
		for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(easygrid[row][col] + " ");
            }
            System.out.println();
        }
	}
    public static void Mediumgrid(){
		int[][] midgrid= { {1,2,4,6,9,7,8,5,3},  //Medium
                           {9,7,6,3,8,5,2,4,1},
						   {3,8,5,1,4,2,6,7,9},
						   {6,1,9,2,7,3,5,8,4},
						   {7,5,8,9,6,4,1,3,2},
						   {4,3,2,8,5,1,7,9,6},
						   {5,6,3,4,1,8,9,2,7},
						   {8,4,1,7,2,9,3,6,5},
		                   {2,9,7,5,3,6,4,1,8}};
						 
						 
   
      for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(midgrid[row][col] + " ");
            }
            System.out.println();
        }
	 }

     public static void Hardgrid(){
	  int [][] hardgrid=  {{9,1,7,4,8,2,3,5,6}, //hard
                           {4,6,3,5,7,1,2,8,9},
						   {2,5,8,6,3,9,1,7,4},
						   {6,9,4,2,5,7,8,1,3},
						   {7,8,2,1,6,3,4,9,5},
						   {5,3,1,9,4,8,7,6,2},
						   {1,2,5,7,9,4,6,3,8},
						   {3,7,9,8,2,6,5,4,1},
		                   {8,4,6,3,1,5,9,2,7}};
		 for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(hardgrid[row][col] + " ");
            }
            System.out.println();
        }
						   
	 }				
    
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.println("Which game level would you like to play (easy, medium, hard)?: ");
		String ans=input.nextLine();
		ans = ans.toLowerCase();
		printGrid(ans);
	}
		
	public static void printGrid(String ans){
			
		
		if (ans.equals("easy")){
			Easygrid();

		}
		else if(ans.equals("medium")){
			Mediumgrid();

		}
		else if(ans.equals("hard")){
			Hardgrid();

		}
		else{
			System.out.println("Please enter Easy, Medium or Hard");
			Scanner input = new Scanner(System.in);
			String answer =input.nextLine();
			printGrid(answer);
			
		}
	}
}
	
