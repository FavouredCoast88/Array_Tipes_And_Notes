import java.util.Arrays;

public class Array{
    public static void main(String[] args){
    
     /*   String[] fruits = {"apples", "orange", "banana", "coconut", "tomato"};
        
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
   */
     
     //2D array: is a array in a array
     //rows and columns
     // []= row []= column
     
 /*    String [][] numbers = new String [6][4];
     
     //Row 0
     numbers[0][0] = "1";
     numbers[0][1] = "2";
     numbers[0][2] = "3";
     numbers[0][3] = "4";
     
     //Row 1
      numbers[1][0] = "5";
      numbers[1][1] = "6";
      numbers[1][2] = "7";
      numbers[1][3] = "8";
      
      //Row 2
      numbers[2][0] = "9";
      numbers[2][1] = "10";
      numbers[2][2] = "11";
      numbers[2][3] = "12";
      
      //Row 3
      numbers[3][0] = "13";
      numbers[3][1] = "14";
      numbers[3][2] = "15";
      numbers[3][3] = "16";
      
      //Row 4
      numbers[4][0] = "17";
      numbers[4][1] = "18";
      numbers[4][2] = "19";
      numbers[4][3] = "20";
      
      //Row 5
      numbers[5][0] = "21";
      numbers[5][1] = "22";
      numbers[5][2] = "23";
      numbers[5][3] = "24";
      
      //Nested for loop
      for(int i=0; i< numbers.length;i++){// i = rows
          System.out.println();
          
          for(int j=0; j<numbers[i].length;j++){//j = columns
              System.out.print(numbers[i][j]+" ");
              
          }//end internal loop
      }//end external loop
  
     String [][] numbers = {
     {"1","2","3","4"},// row 0
     {"5","6","7","8"},// row 1
     {"9","10","11","12"},// row 2
     {"13","14","15","16"},// row 3
     {"17","18","19","20"},// row 4
     {"21","22","23","24"}// row 5
    };
     for(int i=0; i< numbers.length;i++){// i = rows
          System.out.println();
          
          for(int j=0; j<numbers[i].length;j++){//j = columns
              System.out.print(numbers[i][j]+" ");
              
          }//end internal loop
      }//end external loop
    
         //Jagged arrays= rows that don't have same amount of columns
          int number[][]  = new int[4][];
          number [0] = new int [3];
          number [1] = new int [2];
          number [2] = new int [4];
          number [3] = new int [1];
          
          //How to take input for this jagged array
          
          for(int i=0; i<number.length;i++){
              for(int j=0; j<number[i].length;j++){
                  System.out.print(number[i][j]+ " ");
                  
              }//end of inner for loop
              System.out.println();
          }//end of outer for loop
  
     //Binary search: is the search algorithm that finds the position of a target value within a sorted array
     // Half of the array in eliminated during each "step". This is efficient for large datasets
     //N: sets must be aranged in ascending order
    
     int array[] = new int[100];
     int target = 42;
     
     for(int i=0; i<array.length;i++){
         array[i] = i;
         
     }//end for
     int index = Arrays.binarySearch(array, target);
     if (index == -1){
         System.out.println( target + " not found");
     }//end if
     else{
         System.out.println("Element found at: "+ index);
     }//end else
  */
 
 //Binary search = is used to find a value in a sorted array
    //Instead of checking every value,it:
    //  Checks the middle element
    // If the number is smaller --> Search on the left side
    // If the number is bigger -> Search on the right side
    //   NB: The Array must be sorted first
  /*  
    int[] numbers = { 2, 5, 8, 12, 16, 23, 38};
    int target = 12;
    int index = Arrays.binarySearch(numbers, target);
    
    if(index >= 0){
        System.out.println("Target found at index: " + index);
    }//end if
    else{
        System.out.println("Number not found");
    }//end else

      //Create a program that :
      // stores numbers in an array
      //{3, 10, 12, 17, 15, 20, 19, 30}
      //Use Binary to solve this
      // find index at element 15
      int[] number = {3, 10, 12, 15, 17, 19, 20, 30};
      int target = 15;
      int index = Arrays.binarySearch(number, target);
      
      if(index >= 0){
          System.out.println("Target found at index: " + index);
      }//end if
      else{
         System.out.println("Number not found"); 
      }//end else
   
  // Find max value
     int[] numbers = {4, 9, 2, 15, 16};
     int largest = numbers[0];
     
      for(int i = 1; i < numbers.length; i++){
          if(numbers[i]> largest){
              largest = numbers[i];
          }//end if
      }//end for
        System.out.println("Largest number is: "+ largest);  
  
     //find smallest number in this array
     // {3, 4, 5, 9, 12, 13}
      int[] numbers = { 15, 6, 9, 4, 3, 2, 10};
      int smallest = numbers[0];
       
       for(int i = 1; i < numbers.length; i++){
           if( numbers[i] < smallest){
               smallest = numbers[i];
           }//end if
       }//end for
         System.out.println("Smallest number is: "+ smallest);
       
  // find sum value
    int[] numbers = {4, 9, 2, 15, 16};
     int sum =0;
     
      for(int i = 0; i < numbers.length; i++){
          
             sum=sum + numbers[i];
        
      }//end for
        System.out.println("The sum  is: "+ sum); 
    
  //Bubble Sort= works by repeatedly swapping adjacent elements if they are in the wrong order
  // example: 5 3 8 4  
     int[] numbers = {3, 2, 5, 6, 4};
      
     //nested loop
       for(int i=0; i < numbers.length -1; i++){
           for(int j = 0; j < numbers.length -i-1;j++){
               
               if(numbers[j] > numbers[j + 1]){
                   int temp = numbers[j];
                   numbers[j] = numbers[j+1];
                   numbers[j+1] = temp;
                   
               }//end if
               
           }//end internal loop
       }//end external loop
        for(int num : numbers){
            System.out.print(num + " ");
        }//end for
   */
       int[][] A = {
       {1, 2},
       {3, 4}       
       };
        int[][] B = {
       {5, 6},
       {7, 8}       
       };
          int[][] result = new int[2][2];
           for( int i =0; i< 2; i++){//rows of A
               for(int j=0;j<2;j++){// columns of B
                   for( int k=0;k<2;k++){//multiplication
                       result[i][j] += A[i][k]* B[k][j];
                   }//end for
               }//end internal loop
           }//end External loop
  
       for(int i =0; i< 2; i++){
           for(int j=0;j<2;j++){
               System.out.print(result[i][j] +" ");
           }//end internal
           System.out.println();
       }//end external
    }// end of main

}// end of class