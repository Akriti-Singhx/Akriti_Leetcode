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
    public ListNode middleNode(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
}
// iska ye approach hai ki do pointer banayenge fast and slow , fast wala do step chalega aur slow wala ek step . jab tk fast ka next null nhi ho jata aur jab tk fast null nhi  hota tb tk ye chiz hoti rahegi aur jab fast ka next ya fast null ho jayega tab slow return ho jayega kyuki tb slow middle position pr rahega .