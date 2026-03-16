public class minSumSubArray {
 // leetcode 209. Minimum Size Subarray Sum
public int minSubArrayLen(int target, int[] nums) {
      int left = 0 ;
      int sum = 0 ;
      int n = nums.length;
      int minLength = Integer.MAX_VALUE;

      for (int right = 0 ; right < n ; right ++){
        sum = sum + nums[right];
      
    // shring the window 
    while(sum >= target){
        minLength = Math.min(minLength, right - left + 1);;
        sum = sum - nums[left];
        left++;
    }
      }
     return (minLength == Integer.MAX_VALUE) ? 0 : minLength;

    }
}


