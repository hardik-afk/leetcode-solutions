/*
 * Problem: Middle of the Linked List
 * Problem ID: 908
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.1 MB
 * Synced From: LeetCode
 * Date: 2026-07-09
 */


class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;        // listnode class hai
        ListNode fast = head;

        while( fast != null && fast.next != null){         // most imp condition 
            slow = slow.next;
            fast = fast.next.next;



        }

            return slow;


        
    }
}