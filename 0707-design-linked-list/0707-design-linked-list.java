class MyLinkedList {
    // sabse pahle to hum node banayenge jisme next aur value hoga .
        private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }      
    }
    private Node head;
    private int size;


    public MyLinkedList() {
        head= null;
        size = 0;
    }
        
    // pahle hum node k current position ko head pr point karenge , fir loop chaleaga first position se index tk , tb tk next jate rahenge , fir index ek pahuchne k bad uss value ko return kar denge . 
    public int get(int index) {
        if(index <0 || index >= size ){
            return -1;
        }
        Node curr= head;
        for(int i=0; i<index; i++){
            curr= curr.next;
        }
        return curr.val;
    }
    
    //sabse pahle naya node banayenge aur usme value put ar denge . fir newNode k next ko current bana denge aur 
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
        
    }
    
    // last me add krna hai 
    // jab tk current ka next null nhi ho jata tb tk current k next jate rahenge aur jab null aa jayega tb current k next me newNode laga denge 
    public void addAtTail(int val) {
    Node newNode = new Node(val);

    if (head == null) {
        head = newNode;
    } else {
        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    size++;
}


    //isme sabse pahle hum edge case check karenge ki agar index chota ya bada ho 
    //fir ek edge case check karenge ki agar index 0 hua toh head pr hi value daal denge.
    // fir loop chalega index -1 tk aur current k next jata rahrga . aur ek naya node bnayenge , aur uss naye node k next me current ka next daale denge aur current ko newnode bana denge .
    public void addAtIndex(int index, int val) {
    if (index < 0 || index > size) {
        return;
    }

    if (index == 0) {
        addAtHead(val);
        return;
    }

    Node curr = head;

    for (int i = 0; i < index - 1; i++) {
        curr = curr.next;
    }

    Node newNode = new Node(val);
    newNode.next = curr.next;
    curr.next = newNode;

    size++;
}
    

    
public void deleteAtIndex(int index) {
    if (index < 0 || index >= size) {
        return;
    }

    if (index == 0) {
        head = head.next;
        size--;
        return;
    }

    Node curr = head;

    for (int i = 0; i < index - 1; i++) {
        curr = curr.next;
    }

    curr.next = curr.next.next;
    size--;
}

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */