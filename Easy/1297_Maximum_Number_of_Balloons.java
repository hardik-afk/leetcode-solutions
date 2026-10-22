/*
 * Problem: Maximum Number of Balloons
 * Problem ID: 1297
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms
 * Memory: 42.9 MB
 * Synced From: LeetCode
 * Date: 2026-10-22
 */


class Solution {
    public int maxNumberOfBalloons(String text) {

        int[] freq = new int[26];

        // Count frequency of each character in text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch - 'a']++;
        }

        // Required characters: balloon
        String str = "balloon";

        int ans = Integer.MAX_VALUE;

        // Check how many times each character is available
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int required = 1;

            // 'l' and 'o' are required twice
            if (ch == 'l' || ch == 'o') {
                required = 2;
            }

            int count = freq[ch - 'a'] / required;

            ans = Math.min(ans, count);
        }

        return ans;
    }
}
