/*
 * Problem: Find the Duplicate Number
 * Problem ID: 287
 * Difficulty: Medium
 * Language: Java
 * Runtime: 4 ms
 * Memory: 82.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-12
 */

class Solution {
    public int findDuplicate(int[] nums) {    // i m doing this with a slow and fast pointer.

        int slow = 0;
        int fast = 0;

        // Phase 1: Find the meeting point 
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }

        // Phase 2: Find the duplicate
        slow = 0;

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}