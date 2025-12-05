import java.util.Arrays;

public class twoSum {
   public static void main(String []args ){
      int [] arr = {15,7,11,2}; // {2,7,11,15}
      int target = 18;
      Twosum(arr, target);
    System.out.println("");
   } 
   // bruit force approch 
   //  static  void twosum (int [] arr , int target){
   //     for (int i = 0 ; i < arr.length;i++){
   //       for (int j = i+1; j < arr.length;j++){
   //          if (arr [i] + arr[j] == target){
   //             System.out.println("target found at index" + i + " and "  +j );
   //          }
   //       }
   //     }
   // }
   // optimal approches 
   static void Twosum(int [] arr , int target){

      Arrays.sort(arr);
    int i = 0;
    int j = arr.length-1;
    while(i < j ){
     int sum = arr[i] + arr[j];
      if (sum == target ){
         System.out.println("target found number " + arr[i] + " and "  +arr[j] );
         return;
      }else if (sum > target){
                   j--;
      }else if(sum < target){
         i++;
      }      
    }


    System.out.println("No pair found");
}     }