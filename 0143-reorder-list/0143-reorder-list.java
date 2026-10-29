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
    public void reorderList(ListNode head) {
        
        // Edge case
        if (head == null || head.next == null) {
            return;
        }

        // middle find karenge , slow aur fast pointer ki madad se
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // ab list ko split kaenge
        ListNode second = slow.next;
        slow.next = null;

        // ab second half ko reverse karenge 
        ListNode prev = null;
        ListNode curr = second;

        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        second = prev;

         // STEP 4: Merge both halves
        ListNode first = head;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}