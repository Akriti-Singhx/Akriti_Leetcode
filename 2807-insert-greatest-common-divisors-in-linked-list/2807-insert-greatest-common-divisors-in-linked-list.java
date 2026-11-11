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

    public int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a= temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        // traversing 
        ListNode curr = head;
        while(curr != null && curr.next != null){
            // finding gcd using the function findGCD
            int gcd = findGCD(curr.val , curr.next.val);

            // makind a new node for gcd element
            ListNode newNode = new ListNode(gcd);

            // inserting the gcd new node
            newNode.next = curr.next;
            curr.next = newNode;

            // updating the pointer
            curr= newNode.next;
        }
        return head;
    }
}