/*
 * Problem: First Unique Character in a String
 * Problem ID: 387
 * Difficulty: Easy
 * Language: Java
 * Runtime: 44 ms
 * Memory: 46.7 MB
 * Synced From: LeetCode
 * Date: 2026-10-20
 */

class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();

        for(int i = 0; i < n; i++){                
               if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
               }
               else{
                map.put(s.charAt(i), 1);
               }
        }
         for(int i = 0; i < n; i++ ){
            char ch = s.charAt(i);

            if ( map.get(ch) == 1){
                return i;
            }
         }
        return -1;
    }
}