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
    public ListNode reverseList(ListNode head) {
        // shuruat hamari null se hogi 
        ListNode prev= null;
        // sabse pahle wale element k next element ko save karenge 
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            // current ka nxt pointer  previous wale ko bana denge 
            curr.next = prev;
            // current element ko previous bana denge 
            prev = curr;
            // next wala element jo save kiya gya hai wo current bn jayega 
            curr= next;


        }
        return prev;
    }
}