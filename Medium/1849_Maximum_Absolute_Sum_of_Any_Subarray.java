/*
 * Problem: Maximum Absolute Sum of Any Subarray
 * Problem ID: 1849
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms
 * Memory: 66.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-26
 */

class Solution {
    public int maxAbsoluteSum(int[] nums) { // maxm sum subarrya and minm susm subarry nikal ke 
                                            // minm ka absoule krlenge or fir dono ka maxm nikal
        int n = nums.length;                // lenge.

        int best_end = nums[0];
        int maxSum = nums[0];

        int worst_end = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < n; i++) {

            // Maximum Sum nikal rahe hai  Kadane se
            best_end = Math.max(best_end + nums[i], nums[i]);
            maxSum = Math.max(maxSum, best_end);

            // Minimum Sum nikal rahe hai  Kadane se
            worst_end = Math.min(worst_end + nums[i], nums[i]);
            minSum = Math.min(minSum, worst_end);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}