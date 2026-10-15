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
    public ListNode removeElements(ListNode head, int val) {

        // isme sabse pahle ek dummy nam ka node banayemge jisse ki agar head ko nikalna ho toh nikalna easy ho jaye . 
        ListNode dummy = new ListNode(0);
        dummy.next= head;

        // dummy k next pointer ko head bana denge .
        ListNode curr = dummy;

        // while loop chalega jab tk last node tk na pahuch jaye .aur agar current ka next value uss given value k equal hui toh uss nodeko nikal denge .
        while(curr.next != null){
            if(curr.next.val == val){
                curr.next= curr.next.next;

            }
            else{
                curr= curr.next;
            }
        }
        return dummy.next;
    }
}