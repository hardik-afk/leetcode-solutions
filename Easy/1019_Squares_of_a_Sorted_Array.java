/*
 * Problem: Squares of a Sorted Array
 * Problem ID: 1019
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 47.4 MB
 * Synced From: LeetCode
 * Date: 2026-08-08
 */

class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }

            pos--;
        }

        return result;
    }
}