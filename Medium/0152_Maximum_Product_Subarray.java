/*
 * Problem: Maximum Product Subarray
 * Problem ID: 152
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms
 * Memory: 47.3 MB
 * Synced From: LeetCode
 * Date: 2026-07-14
 */

class Solution {
    public int maxProduct(int[] nums) {        // we will do this with kadanes algo
        
        int n = nums.length;
        
        int max_ending = nums[0];
        int min_ending = nums[0];
        int res = nums[0];
        

        for( int i = 1; i < n; i++){

            int v1 = nums[i];
            int v2 = min_ending * nums[i];
            int v3 = max_ending * nums[i];

            max_ending = Math.max(v1, Math.max(v2, v3));
            min_ending = Math.min(v1, Math.min(v2, v3));

            res = Math.max( res , Math.max( max_ending, min_ending));

        }
        return res;
    }
}