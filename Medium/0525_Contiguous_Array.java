/*
 * Problem: Contiguous Array
 * Problem ID: 525
 * Difficulty: Medium
 * Language: Java
 * Runtime: 24 ms
 * Memory: 65.7 MB
 * Synced From: LeetCode
 * Date: 2026-08-08
 */

class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int zero = 0, one = 0;
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
         map.put(0, -1);
        
        for( int i = 0; i < n; i++){
            if (nums[i] == 0){ //  updating values of 0s and 1s while traversing array
                zero++;
            }
            else{
                one++;
            }

             int diff = zero - one;

             if( diff == 0){        // agar seedha hi eqaul zero or one mil gaye( ith index pe )
                res = Math.max( res, i+1);
                continue;
             }
             if( !map.containsKey(diff) ){
                map.put(diff , i);
             }
             else{      // iss conditiion me diff ki value update nhi krni hai,we want smallest
                int idx = map.get(diff);
                int len = i - idx;
                res = Math.max( len , res);
             }
        }
        return res;
    }
}