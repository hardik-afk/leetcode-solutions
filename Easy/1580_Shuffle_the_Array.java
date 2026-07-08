/*
 * Problem: Shuffle the Array
 * Problem ID: 1580
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 46.3 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {

        int [] ans = new int[2 * n];
        int x = 0;
        
        for( int i = 0; i < n; i++){

            ans[x++] = nums[i];         // shuffle kr rahe hai with post increment.
            ans[x++] = nums[i + n];
        }
       return ans; 
    }
}