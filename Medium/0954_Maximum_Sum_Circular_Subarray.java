/*
 * Problem: Maximum Sum Circular Subarray
 * Problem ID: 954
 * Difficulty: Medium
 * Language: Java
 * Runtime: 5 ms
 * Memory: 51 MB
 * Synced From: LeetCode
 * Date: 2026-07-17
 */

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int totalSum = 0;

        int maxEnding = nums[0], maxSum = nums[0];
        int minEnding = nums[0], minSum = nums[0];

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 1; i < nums.length; i++) {
            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(nums[i], minEnding + nums[i]);
            minSum = Math.min(minSum, minEnding);
        }

        // If all elements are negative, return the normal max subarray sum
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}