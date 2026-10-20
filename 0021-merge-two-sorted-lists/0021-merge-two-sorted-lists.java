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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ek dummy node banayege aur current dummy pr kr denge 
    ListNode dummy = new ListNode(-1);
    ListNode curr= dummy;

    // list 1 aur list 2 ki values ko compare karenge . aur dono nodes unequal hai .
    while(list1 != null &&list2 != null){
        if(list1.val <= list2.val){
            curr.next = list1;
            list1 = list1.next;
        }else{
            curr.next= list2;
            list2 = list2.next;
        }
        curr= curr.next;
    }

    if(list1 != null){
        curr.next= list1;
    }else{
        curr.next = list2;
    }

    return dummy.next;
    }
}