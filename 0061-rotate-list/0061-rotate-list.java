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
    public ListNode rotateRight(ListNode head, int k) {
        // sabse pahle edge case 
        if(head == null || head.next == null || k==0){
            return head;
        }

        // ab iss list ki head aur length ko find krenge 
        ListNode tail = head;
        int length =1;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        // ab k ko adjust  karemge jisse number of position ka pata kr paye 
        k = k% length;
        if(k == 0){
            return head;
        }
        
        // ab list no circular banayemge 
        tail.next = head;

        //ab hame naye wale tail ki position ko find krna hai jo ki rotation k bad ki hogi.
        int newTail = length-k;
        ListNode curr = head;


        for(int i=1; i<newTail; i++){
            curr= curr.next;
        }

        // ab hum next wale node ki reference ko save karenge taki newtail k bad listt terminate ho jaye aur usek next wala bhi save rahe 
        ListNode newHead= curr.next;
        curr.next = null;
        return newHead;
    }
}