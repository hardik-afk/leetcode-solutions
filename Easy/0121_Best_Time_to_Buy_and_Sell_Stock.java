/*
 * Problem: Best Time to Buy and Sell Stock
 * Problem ID: 121
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 94.6 MB
 * Synced From: LeetCode
 * Date: 2026-08-13
 */

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }

            right++;
        }

        return maxProfit;
    }
}