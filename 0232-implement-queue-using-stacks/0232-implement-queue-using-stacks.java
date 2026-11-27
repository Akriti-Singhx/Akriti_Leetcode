class MyQueue {

    Stack<Integer> inputStack;
    Stack<Integer> outputStack;

    public MyQueue() {
       inputStack= new Stack<>();
       outputStack = new Stack<>(); 
    }
    
    public void push(int x) {
        inputStack.push(x);
    }
    
    // output stack khali hua toh iputstack se pop krte jayenge aur output stck me push krte jayenge aur akhri me return kr denge pop
    public int pop() {
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }


    // agar outputstack empty hua toh inpu stack se eleemnt pop krke output stack me dalenge aur uska peek check krte rahenge 
    public int peek() {
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
        
    }
    
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */