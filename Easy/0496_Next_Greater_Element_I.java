/*
 * Problem: Next Greater Element I
 * Problem ID: 496
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms
 * Memory: 45.5 MB
 * Synced From: LeetCode
 * Date: 2026-09-12
 */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();

        int n1 = nums1.length;
        int n2 = nums2.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse nums2
        for (int i = 0; i < n2; i++) {

            // Find Next Greater Element
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {

                int ele = stack.pop();

                map.put(ele, nums2[i]);
            }

            // Current element goes into stack
            stack.push(nums2[i]);
        }

        // Remaining elements have no Next Greater Element
        while (!stack.isEmpty()) {

            int element = stack.pop();

            map.put(element, -1);
        }

        // Create answer for nums1
        int[] ans = new int[n1];

        for (int i = 0; i < n1; i++) {

            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}