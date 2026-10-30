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
    public ListNode partition(ListNode head, int x) {
        
        // sabse pahle do dummy list banayege 
        ListNode lessDummy = new ListNode(0);
        ListNode greaterDummy = new ListNode(0);

        ListNode less = lessDummy ;
        ListNode greater = greaterDummy;

        // ab hame jo list di gayi hai usme traverse kr k donoo alag list me greater aru less wale element dalenge 
        // sabse pahle current pointer banayemge jo list ko traverse karega
        ListNode curr = head;
        while(curr != null){
            if(curr.val <x){
                less.next = curr;
                less = less.next;
            }else{
                greater.next = curr;
                greater =greater.next; 
            }
            curr = curr.next;
        }

        // ab hum less aur greater wale list ko jod denge 
        greater.next = null;
        less.next= greaterDummy.next;
        return lessDummy.next;
    }
}