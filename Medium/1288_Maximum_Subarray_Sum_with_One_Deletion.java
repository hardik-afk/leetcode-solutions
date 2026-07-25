/*
 * Problem: Maximum Subarray Sum with One Deletion
 * Problem ID: 1288
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms
 * Memory: 55.9 MB
 * Synced From: LeetCode
 * Date: 2026-07-25
 */

class Solution {
    public int maximumSum(int[] arr) {

        int n = arr.length;

        int nodelete = arr[0]; // maximum sum ending here without deletion
        int onedelete = Integer.MIN_VALUE; // maximum sum ending here with one deletion

        int res = arr[0];

        for (int i = 1; i < n; i++) {

            int prev_nodelete = nodelete;
            int prev_onedelete = onedelete;

            // no deletion case
            nodelete = Math.max(prev_nodelete + arr[i], arr[i]);

            // one deletion case
            int v2;
            if (prev_onedelete == Integer.MIN_VALUE) {
                v2 = Integer.MIN_VALUE;
            } else {
                v2 = prev_onedelete + arr[i];
            }

            onedelete = Math.max(prev_nodelete, v2);

            // update answer
            res = Math.max(res, Math.max(nodelete, onedelete));
        }

        return res;
    }
}