/*
 * Problem: Happy Number
 * Problem ID: 202
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.2 MB
 * Synced From: LeetCode
 * Date: 2026-07-13
 */

class Solution {
    int sqsum(int x ){
           int sum = 0;
            while(x > 0){
                
                int d = x % 10;
                x = x / 10; 
                
                sum = sum + d*d;
                
                   }
                   return sum;}

    public boolean isHappy(int n) {
        
        

                              

        int slow = n;
        int fast = n;

        while( true){

            slow = sqsum(slow);
            fast = sqsum(fast);
            fast = sqsum(fast);

            if( fast == 1){
                return true;
            }
        if( slow == fast )
            {return false;}

        }
    }

}

        
