/*
 * Problem: Merge Intervals
 * Problem ID: 56
 * Difficulty: Medium
 * Language: Java
 * Runtime: 11 ms
 * Memory: 49.2 MB
 * Synced From: LeetCode
 * Date: 2026-08-10
 */

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]); //2D array sort kr rahe hai based on 1st ele
       
        List<int[]> res = new ArrayList<>(); //list bna rahe hai 

        int start = intervals[0][0];
        int end = intervals[0][1];

        for( int i = 1; i < n; i++){ 
            if(intervals[i][0] <= end){   // overlapping condition
                end = Math.max(end, intervals[i][1]);
            }
            else{                      // non overlapping comdition
                res.add(new int[]{start,end});   // storing in result 
                start = intervals[i][0];
                end = intervals[i][1];
            }

        }
        res.add(new int[]{start,end});

        return res.toArray(new int[res.size()][]); // returning ans
    }
}