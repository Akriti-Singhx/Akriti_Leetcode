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
class Solution{
    public ListNode swapPairs(ListNode head) {
        
        // sabse pahle dummmy node banayege 
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // aur ab prev pointer ko initialize karnege 
        ListNode prev= dummy;;

        // ab loop aayega 
        while(prev.next != null && prev.next.next != null){
            // ab iske bad first aur second node initializekarenge 
            ListNode first = prev.next;
            ListNode second = first.next;

            //ab hum next wale node ko save karnee 
            ListNode nextPair= second.next;

            // ab hum link ko change karenge 
            prev.next = second;
            second.next = first;
            first.next = nextPair;
            prev = first;

            
        }
        return dummy.next;
    }
}