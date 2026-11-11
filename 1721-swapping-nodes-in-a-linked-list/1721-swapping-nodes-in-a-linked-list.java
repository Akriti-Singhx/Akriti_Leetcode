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
    public ListNode swapNodes(ListNode head, int k) {
        // hamne first nam ka ek variable banaya jisko hum k-1 position pr le jayenge 
        ListNode first = head;
        for(int i=1; i<k; i++){
            first = first.next;
            // hamne first ko k-1 position pr pahucha diya 
        }
        // ab ending se node ko find krna hai 
        ListNode slow= head;
        ListNode fast = first;

        while(fast.next != null){
            slow = slow.next;
            fast= fast.next;
        }

        // ab swap hoga 
        int temp = first.val; 
        first.val = slow.val;
        slow.val = temp;

        return head;
    }
}