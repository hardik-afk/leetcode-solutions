/*
 * Problem: Maximum Absolute Sum of Any Subarray
 * Problem ID: 1849
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms
 * Memory: 66.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-16
 */

class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxEnding = nums[0];
        int maxSum = nums[0];

        int minEnding = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Maximum subarray (Kadane)
            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            maxSum = Math.max(maxSum, maxEnding);

            // Minimum subarray (Reverse Kadane)
            minEnding = Math.min(nums[i], minEnding + nums[i]);
            minSum = Math.min(minSum, minEnding);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}