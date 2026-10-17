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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr= head;

        while(curr != null){
            // next node ko save karenge 
            ListNode nextNode = curr.next;

            // prev ko hum sorted list k starting point pr rakhenge yani dummy pr 
            ListNode prev = dummy;

            // ab loop chalega jab tk current element previous se chota hai 
            while(prev.next != null && prev.next.val <curr.val){
                prev = prev.next;
            }

            // current ka next uss node kopoint karega jise prevoius ka next point kr raha hai  
            curr.next = prev.next;
            // aur previous ka next current ko point karega.
            prev.next = curr;

            curr = nextNode;
        }
        return dummy.next;
    }
}