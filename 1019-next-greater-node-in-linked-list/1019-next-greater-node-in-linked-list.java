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
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Store linked list values
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int n = list.size();
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        // Step 2: Traverse array
        for (int i = 0; i < n; i++) {

            // Step 3: Find next greater element
            while (!st.isEmpty() &&
                   list.get(i) > list.get(st.peek())) {

                int index = st.pop();
                ans[index] = list.get(i);
            }

            // Step 4: Store current index
            st.push(i);
        }

        // Remaining indexes have no greater element
        return ans;
    }
}
