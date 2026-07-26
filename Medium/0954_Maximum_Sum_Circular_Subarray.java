/*
 * Problem: Maximum Sum Circular Subarray
 * Problem ID: 954
 * Difficulty: Medium
 * Language: Java
 * Runtime: 11 ms
 * Memory: 51.4 MB
 * Synced From: LeetCode
 * Date: 2026-07-26
 */

class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int n = nums.length;
        int best_end = nums[0];
        int worst_end = nums[0];
        int max_sum = nums[0];
        int min_sum = nums[0];
        int res;

        for( int i = 1 ; i < n; i++ ){
           // max sum subarray nikal rahe hai yha pr
            best_end = Math.max( best_end + nums[i] , nums[i]);
            max_sum = Math.max( best_end, max_sum);

            // ab yha min sum subarray nikal rahe hai
            worst_end = Math.min(worst_end + nums[i] , nums[i]);
            min_sum = Math.min( worst_end , min_sum);


        }

        if( max_sum < 0){    // most imp condition for edge case that is ki agar poori ki poori 
            return max_sum;  // array ki negative numbers ki hui to total sum se minus krne pr
        }                    // empty aubarrya bachegi which isnt allowed, isliye ye check lgaya


        // poori array ka sum nikal lete hai ab 
        int sum = Arrays.stream(nums).sum();

        res = Math.max( max_sum, sum - min_sum);


          
    return res;
        
    }
}