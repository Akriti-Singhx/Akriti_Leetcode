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
    public int numComponents(ListNode head, int[] nums) {
        // elements ka count rkhne k loye hum sabse pahle hashset ka use karenge aur nums k sabhi elements pr traverse karenge 
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        // ab hum ek count variable bana k set me traverse karenge aur check karenge ki component hai ya  nhi 
        int count =0;

        while(head != null){
            if(set.contains(head.val)){
                if(head.next == null || !set.contains(head.next.val)){
                    count++;
                }
            }
            head = head.next;
        }
        return count;
    }
}