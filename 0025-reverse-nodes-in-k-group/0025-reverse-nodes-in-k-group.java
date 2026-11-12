/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevEnd = dummy;

        while (true) {

            // Step 1: Find kth node
            ListNode kth = prevEnd;

            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }

            // If less than k nodes are available
            if (kth == null) {
                break;
            }

            // Step 2: Save next group's starting node
            ListNode nextStart = kth.next;

            // Step 3: Reverse current group
            ListNode prev = nextStart;
            ListNode curr = prevEnd.next;

            ListNode oldGroupStart = curr;

            while (curr != nextStart) {
                ListNode next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Step 4: Connect reversed group
            prevEnd.next = kth;

            // Step 5: Move to next group
            prevEnd = oldGroupStart;
        }

        return dummy.next;
    }
}