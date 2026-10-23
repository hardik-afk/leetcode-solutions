/*
 * Problem: Longest Palindrome
 * Problem ID: 409
 * Difficulty: Easy
 * Language: Java
 * Runtime: 9 ms
 * Memory: 42.7 MB
 * Synced From: LeetCode
 * Date: 2026-10-23
 */


import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int count = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Store frequency of each character
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        // Step 2: Count all possible pairs
        boolean hasOdd = false;

        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                count += freq;
            } else {
                count += freq - 1;
                hasOdd = true;
            }
        }

        // Step 3: One odd-frequency character can go in the center
        if (hasOdd) {
            count++;
        }

        return count;
    }
}
