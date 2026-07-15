/*
 * Problem: Maximum Subarray Sum with One Deletion
 * Problem ID: 1288
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms
 * Memory: 56.2 MB
 * Synced From: LeetCode
 * Date: 2026-07-15
 */

class Solution {
    public int maximumSum(int[] arr) {

        int noDeletion = arr[0];
        int oneDeletion = 0;
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            oneDeletion = Math.max(noDeletion, oneDeletion + arr[i]);

            noDeletion = Math.max(arr[i], noDeletion + arr[i]);

            ans = Math.max(ans, Math.max(noDeletion, oneDeletion));
        }

        return ans;
    }
}