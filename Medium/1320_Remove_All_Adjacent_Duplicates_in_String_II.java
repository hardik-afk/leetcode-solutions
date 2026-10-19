/*
 * Problem: Remove All Adjacent Duplicates in String II
 * Problem ID: 1320
 * Difficulty: Medium
 * Language: Java
 * Runtime: 39 ms
 * Memory: 47 MB
 * Synced From: LeetCode
 * Date: 2026-10-19
 */

class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        
        class pair{                // class bna di stack me (char,freq(num)) daalne ke liye 
            char ch;
            int num;

            pair( char ch, int num){
                this.ch = ch;
                this.num = num;
            }
        }
         Stack<pair> stack = new Stack<>();

         for( int i = 0; i < n; i ++){       // main logic
            char ch1  = s.charAt(i);

            if(stack.isEmpty()){
                stack.push(new pair(ch1,1));
                continue;
            }

            if(stack.peek().ch != ch1){
                stack.push(new pair(ch1,1));
            }
            else{
                if(stack.peek().num == k-1 ){
                    stack.pop();
                }
                else{
                   pair p =  stack.pop();
                    stack.push(new pair(p.ch, p.num +1));
                }
            }
            
         }

        StringBuilder sb = new StringBuilder(); //string builder se stack ko empty krke reverse and then rev

            while (!stack.isEmpty()) {
             pair p = stack.pop();

                 for (int j = 0; j < p.num; j++) {
                      sb.append(p.ch);
                 }      
                        }

            return sb.reverse().toString();
     
    }
}