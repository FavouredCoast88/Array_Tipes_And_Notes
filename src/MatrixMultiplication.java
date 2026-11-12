import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Input dimensions for first matrix
        System.out.print("Enter rows for matrix A: ");
       int rowsA = sc.nextInt();
        System.out.print("Enter columns for matrix A: ");
       int colsA = sc.nextInt();
       
        //Input dimensions for second matrix
         System.out.print("Enter rows for matrix B: ");
       int rowsB = sc.nextInt();
        System.out.print("Enter columns for matrix B: ");
       int colsB = sc.nextInt();
        
        //Check if multiplication is possible
       if(colsA != rowsB){
           System.out.println("Matrix multiplication not possible!");
          return;
        } 
       int[][] A = new int[rowsA][colsA];
       int[][] B = new int[rowsB][colsB];
       int[][] C = new int[rowsA][colsB];
       
         //Input matrix A
         System.out.println("Enter elements of matrix A:");
        for(int i = 0; i < rowsA; i++){
            for(int j = 0; j < colsA; j++){
                A[i][j] = sc.nextInt();
            }
        }
         //Input matrix B
         System.out.println("Enter elements of matrix B:");
        for(int i = 0; i < rowsB; i++){
            for(int j = 0; j < colsB; j++){
                B[i][j] = sc.nextInt();
            }
        } 
         //Matrix multiplication
        for(int i = 0; i < rowsA; i++){
            for(int j = 0; j < colsB; j++){
                C[i][j] = 0;
                for(int k = 0; k < colsA; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
         //Display result
         System.out.println("Resultant matrix C:");
        for(int i = 0; i < rowsA; i++){
            for(int j = 0; j < colsB; j++){
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        } 
        
        sc.close();
    }
  
}
