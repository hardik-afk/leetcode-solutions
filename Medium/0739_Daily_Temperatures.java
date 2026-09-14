/*
 * Problem: Daily Temperatures
 * Problem ID: 739
 * Difficulty: Medium
 * Language: Java
 * Runtime: 62 ms
 * Memory: 107.6 MB
 * Synced From: LeetCode
 * Date: 2026-09-14
 */

import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        // Answer array
        // ans[i] = kitne days baad warmer temperature milega
        int[] ans = new int[n];

        // Stack mein temperatures nahi,
        // unke INDEX store karenge
        Stack<Integer> stack = new Stack<>();

        // Traverse temperatures from left to right
        for (int i = 0; i < n; i++) {

            // Current temperature
            int curr = temperatures[i];

            // Check karo ki current temperature
            // stack ke top wale index ke temperature se greater hai
            while (!stack.isEmpty() &&
                   curr > temperatures[stack.peek()]) {

                // Previous day ka index nikaalo
                int prevIndex = stack.pop();

                // Kitne days baad warmer temperature mila
                ans[prevIndex] = i - prevIndex;
            }

            // Current index ko stack mein daal do
            // kyunki iska warmer temperature future mein mil sakta hai
            stack.push(i);
        }

        // Jo indices stack mein bach gaye,
        // unke baad koi warmer temperature nahi mila.
        // Default value already 0 hai, so kuch karne ki zarurat nahi.

        return ans;
    }
}