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
    public ListNode deleteMiddle(ListNode head) {
        
        // sabse pahle edge case
        if(head == null || head.next == null){
            return null;
        }
        // slow , fast , prev pointer ka use karenge 
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        // ab g=slow ko ek step chalayenge aur fast ko do step
        // aur prev slow k ek piche rahega 
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        //ab jaise prev slow k piche hai toh slow pointer uss node pr ja k ruk jayega jisko delete krna hai ..
        // toh ab hum prev k agle node jo ki slow hai use list se remove kr denge . 
        prev.next = slow.next;
        return head;
    }
}