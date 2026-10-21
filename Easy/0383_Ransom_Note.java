/*
 * Problem: Ransom Note
 * Problem ID: 383
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms
 * Memory: 45.5 MB
 * Synced From: LeetCode
 * Date: 2026-10-21
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();             // we can also do this with hashmap and with freq array also

        int[] freq = new int[26];              // freq array maintain krenge ek 

        for( int i = 0; i < m; i++){           // freq array me maintain kr rahe hai freq of magazines char
           int ch = magazine.charAt(i);
           freq[ch - 'a']++;
        }

        for( int i = 0; i < n; i ++){          // minus kr rahe freq aray me se of char jo ransom me bhi hai
            int ch1 = ransomNote.charAt(i);
            freq[ch1 - 'a']--;
        }
     
        for( int i = 0; i < 26; i ++){        // agar after this freq array contains -ve count then will 
            if(freq[i] < 0){                  // return false 
                return false;    
            }
        }
        return true;                           // if not then true 
        }
}