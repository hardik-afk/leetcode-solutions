/*
 * Problem: Linked List Cycle II
 * Problem ID: 142
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 46.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-11
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {  // detecting a cycle

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {      // agar cycle mil gayi, then searching for a start pt.

                
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }
}