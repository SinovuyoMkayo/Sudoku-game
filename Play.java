import java.util.Scanner;
   public class Play {


   public static void main(String args[]){

       BrainlyGrid i = new BrainlyGrid("begin");
       i.printMyBrainlyGrid();
       Scanner guess = new Scanner(System.in);

       int row, column, Number;
       String action;

       while(true){
           System.out.println("Enter I for insert or R for remove: ");
           action = guess.next();

           System.out.println("Enter Row Number: ");
           row = guess.nextInt();
           System.out.println("Enter Column Number: ");
           column= guess.nextInt();
           System.out.println("Enter Number: ");
           Number= guess.nextInt();

           if(action.equals("I")){
               if(i.insertNumber(row, column, Number)){
                   System.out.println("Great");
               }
               else System.out.println("Please Try Again ");
               i.printMyBrainlyGrid();
           }
           else{ i.removeNumber(row, column, Number);
           i.printMyBrainlyGrid();}
       }
   }
}