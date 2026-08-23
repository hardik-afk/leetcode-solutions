/*
 * Problem: Remove All Adjacent Duplicates In String
 * Problem ID: 1128
 * Difficulty: Easy
 * Language: Java
 * Runtime: 26 ms
 * Memory: 47.2 MB
 * Synced From: LeetCode
 * Date: 2026-08-23
 */

class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> stack = new Stack<>();

        int n = s.length(); 
  
        for( int i = 0; i < n; i++){
            if( stack.isEmpty()){      // agar stack empty hai to 
                stack.push(s.charAt(i));
                continue;
            }
            if( stack.peek() == s.charAt(i)){    //agar stack me recent and string ka current ele same ho
                stack.pop();  
            }
            else{
                stack.push(s.charAt(i));    // agar same nhi ho 
            }
        }
        StringBuilder ans = new StringBuilder();

            for (char c : stack) {
                ans.append(c);
                        }

            return ans.toString();
    }
}