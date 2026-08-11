/*
 * Problem: Interval List Intersections
 * Problem ID: 1028
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 47.4 MB
 * Synced From: LeetCode
 * Date: 2026-08-11
 */

// will also use 2 pointers in this 

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        int n = firstList.length;
        int m = secondList.length;
        List<int[]> res = new ArrayList<>(); 

        int x = 0;
        int y = 0;

        while( x < n && y < m){
            int start1 = firstList[x][0];
            int end1 = firstList[x][1];

            int start2 = secondList[y][0];
            int end2 = secondList[y][1];

            if( start1 < start2){
                if( end1 >= start2){
                    int s = Math.max(start1,start2);
                    int t = Math.min(end1, end2);
                    res.add(new int[]{s,t});
                }
               
                }
                else{
                    if(end2 >= start1){
                        int s = Math.max(start1, start2);
                        int t = Math.min(end1, end2);
                        res.add( new int[]{s,t});
                    }

                }
                if( end1 <= end2){
                    x++;
                    }
                    else{
                        y++;
                    }
        
        }
       
             return res.toArray(new int[res.size()][]);
    }
}