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
    public ListNode reverseBetween(ListNode head, int left, int right) {

     // dummmy ko initialize karnege
    ListNode dummy = new ListNode(0);
    dummy.next= head;

    // previous ko init alize karenge 
    ListNode prev= dummy;   

    // loop chalega 
    for(int i=1; i<left; i++){
        prev = prev.next;
    }

    ListNode curr= prev.next;
    // ab reverse karenge 
    for(int i=0; i<right-left;i++){
        // sabse pahle hamne next wale node ko save kiya 
        ListNode nextNode = curr.next;
        // ab reverse
        curr.next = nextNode.next;
        nextNode.next = prev.next;
        prev.next = nextNode;
    }
    return dummy.next;
    }
}