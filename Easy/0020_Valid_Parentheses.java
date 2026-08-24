/*
 * Problem: Valid Parentheses
 * Problem ID: 20
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms
 * Memory: 43.7 MB
 * Synced From: LeetCode
 * Date: 2026-08-24
 */

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '[' || // agar opening bracket mile to stack me push kro 
                s.charAt(i) == '(' || 
                s.charAt(i) == '{') {

                stack.push(s.charAt(i));
            }
            else {             // nhi to 

                if (stack.isEmpty()) { // agar closing milla or stack already empty hai to invalid
                    return false;
                }

                if ((s.charAt(i) == '}' && stack.peek() == '{') || //agar closing milla and uska 
                    (s.charAt(i) == ']' && stack.peek() == '[') || // opening pair bhi mil gya 
                    (s.charAt(i) == ')' && stack.peek() == '(')) { // to opening ko pop krenge

                    stack.pop();
                }
                else {
                    return false;    // closing milla and stack ke top pr unmatched bracket hai
                }
            }
        }

        return stack.isEmpty();   //  if stack is empty after loop, valid parenthesis
    }
}