/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       // hame nodes ki copy banani hai , jiske liye hum hashmap ka use karenge 

       HashMap<Node, Node> map = new HashMap<>();
       Node curr = head;
       while(curr != null){
        // ek copy nam ka variable banega jisme current value store hogi
        Node copy = new Node(curr.val);
        // map me curr aur aopy wale nodes map hote jayenge
        map.put(curr, copy);
        curr = curr.next;
       }

       // ab hame next aur random pointer ko connect krna hai
       curr = head;

       while(curr != null){
        // currently jo original node hai uski copy node find karenge
        Node copy = map.get(curr);

        // ab copy k next pointer ko waise hi rakhenge jaise curr ka next h
        copy.next = map.get(curr.next);
        // copy ka random pointer waise hi rahega jaise curr ka random pointer h
        copy.random = map.get(curr.random);
        curr = curr.next;
       }
       return map.get(head);
     
    }
}