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
    public ListNode deleteDuplicates(ListNode head) {
        // isme sabsepahle dummy node banayemge uske bad pointer banayenge 
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        // ab loop chalega aur duplicate check hoga
        while(curr != null){
            if(curr.next != null && curr.val == curr.next.val){
                int duplicate = curr.val;

                //ab duplicate remove hoga agar curr ka value duplicate k barabar hai
                while(curr != null && curr.val == duplicate){
                    curr= curr.next;
                }
                prev.next = curr;
            }else{
                prev= curr;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}