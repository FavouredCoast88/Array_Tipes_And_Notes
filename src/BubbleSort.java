
public class BubbleSort {
  public static void bubbleSort(int[] arr){
      int n = arr.length;
      //Outer loop for passes
       for(int i = 0; i < n - 1; i++){
          //Inner loop for comparisons and swaps in each pass
          for(int j = 0; j < n - i - 1; j++){
              //Compare adjacent elements
              if(arr[j] > arr[j + 1]){
                  //Swap if the current element is greater than the next
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
              }
          }
       }
  } 
  public static void main(String[] args){
      int[] data = {64, 34, 25, 12, 22, 11, 90};
      System.out.println("Array before sorting:");
      for(int num : data){
          System.out.println( num + " ");
      }//end for
      System.out.println();
      
      bubbleSort(data);
      
      System.out.println("Array after sorting:");
      for(int num : data){
          System.out.print(num + " ");
      }
      System.out.println();
  }//end main
}//end class
