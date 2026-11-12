
public class SumCalculator {
 public static long calculateSum(int[] arr){
   if(arr == null || arr.length == 0){
       return 0; //Or handle error appropriatly
   }
   long sum = 0;//use long to prevent overflow for large sums
   
for(int element : arr) {
    sum += element;
} 
return sum;
 }
}
//not work needs a main method idk