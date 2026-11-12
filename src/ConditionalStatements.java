//Conditional Statement allows a program to choose what to do based on a condition

//Traffic-stop Example

// if Green = Go
//else if Yellow = Slow down
//else Red = Stop
import java.util.Scanner;

public class ConditionalStatements {                   //if  - checks the condition
    public static void main(String[] args) {           //(age >= 18) - return boolean 
                                                       //{} -code run ONLY when true
     /* 
        int age = 18;                                   
      if(age >= 18){
          System.out.println("You can vote");
      }//end if
*/
      //Note: Conditions are checked from top to bottom
      
       Scanner mark1 = new Scanner(System.in);    
       
       System.out.println("Please enter your mark: ");
       int marks = mark1.nextInt();
      
     
      if(marks >= 75){
          System.out.println("Distinction");
      }//end if
      else if(marks >= 50){
          System.out.println("You passed");
      }//end if else
      else{
          System.out.println("You Failed sry");
      }//end else
      
      
      //for (initialization; condition; update)
   /*   
      for(int i = 1; i<=10; i++){ //int i = 1 (start)
          System.out.println();   // i <= 10 (condition)
                                  // i++ (increment)
      }//end for
     */
   
      //While (condition){
      // statement
      //update
      
    }//end main
   
}//end class ConditionalStatements
