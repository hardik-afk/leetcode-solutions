/*
 * Problem: Insert Interval
 * Problem ID: 57
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 46.9 MB
 * Synced From: LeetCode
 * Date: 2026-08-11
 */

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;

        List<int[]> res = new ArrayList<>();

        int i = 0;

        // 1. Add all non-overlapping intervals before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }

        // 2. Merge all overlapping intervals with newInterval
        int start = newInterval[0];
        int end = newInterval[1];

        while (i < n && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }

        res.add(new int[]{start, end});

        // 3. Add all remaining intervals
        while (i < n) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}