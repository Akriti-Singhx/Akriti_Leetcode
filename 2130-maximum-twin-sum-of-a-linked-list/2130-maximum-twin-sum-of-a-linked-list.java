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
    public int pairSum(ListNode head) {
        // sabse pahle slow aur fast pointer se hum middle node find karege
        ListNode fast = head;
        ListNode slow = head;

        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow= slow.next;
        }

        // ab hum middle k bad wali list ko reverse karenge 
        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null){
            // next node ko save karenge 
            ListNode next = curr.next;
            // link reverse karenge 
            curr.next = prev;
            // pointer aage badayenge 
            prev =curr;
            curr = next;
        }

        // ab sum calculate karenge 
        ListNode first = head;
        ListNode second = prev;
        int maxSum = 0;

        while(second != null){

            int sum = first.val + second.val;
            
            maxSum = Math.max(maxSum, sum);

            first = first.next;
            second= second.next;
        }
        return maxSum;
    }
}