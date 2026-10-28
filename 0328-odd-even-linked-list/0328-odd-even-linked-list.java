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
    public ListNode oddEvenList(ListNode head) {
        
        // sabse pahle edge case
        if(head== null || head.next == null){
            return head;
        }

        // abb odd , even , evenHead pointer ko initialize karenge 
        ListNode odd= head;
        ListNode even = odd.next;
        ListNode evenHead = even;

        // ab logic likhenge jisme odd ko odd se jodna hoga aur even ko even se
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next= even.next.next;

            odd = odd.next;
            even= even.next;

        }
        // ab hum odd aur even dono ko jod denge 
        odd.next = evenHead;
        return head;
    }
}