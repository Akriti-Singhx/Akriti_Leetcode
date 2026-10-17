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

    // iska approach ye hoga ki hum isme ek ans variable banayene jisme answer ko store karenge . aur shuru se start karenge , jab tk last node tk nhi pahuch jate tb tk hum traverse karenge .

    // ans me 2 ko multiply kr k usme current ki value add kr denge aur usko ans me store kr denge .ye formula use krna hai. 
    public int getDecimalValue(ListNode head) {
        
        int ans=0;
        ListNode curr= head;

        while(curr!= null){
            ans= ans*2 + curr.val;
            curr= curr.next;
        }
        return ans;
    }
}