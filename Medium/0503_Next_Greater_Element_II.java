/*
 * Problem: Next Greater Element II
 * Problem ID: 503
 * Difficulty: Medium
 * Language: Java
 * Runtime: 9 ms
 * Memory: 48.4 MB
 * Synced From: LeetCode
 * Date: 2026-09-15
 */

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        
        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;       // 2 baar traverse kr rahe hai poori array ko 
            int curr = nums[index];

            while (!stack.isEmpty() && curr > nums[stack.peek()]) {

                int prevIndex = stack.pop();  // stack me indices store kare hai not indices ke elements
                ans[prevIndex] = curr;
            }

            if (i < n) {
                stack.push(index);
            }
        }

        return ans;
    }
}