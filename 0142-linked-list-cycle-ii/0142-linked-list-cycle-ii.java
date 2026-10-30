/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // sabse pahle slow aur fast pointer banayenge jisme hum slow ko ek step aur fast ko do step chalayenge aur check karene ki slow ar fast kab milega 
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            // agar slow aur fast mile toh slow ko head pr point kara denge 
            if(slow == fast ){
                slow = head;

                // ab slow first position pr hai aur fast uss position pr hai jaha dono mile the 
                // ab dono ko ek ek step kr k aage badhayenge 
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}