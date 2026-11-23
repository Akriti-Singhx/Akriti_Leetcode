class CustomStack {
    int[] stack;
    int maxSize;
    int top;
    public CustomStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[maxSize];
        top= -1;
    }

    // agar stack empty hai toh wqhi return ho jayega . aur agar empty nhi ha toh top ek aage badh jayeg aur uss position pr element push ho jayega 
    public void push(int x) {
        if(top == maxSize-1){
            return;
        }
        top++;
        stack[top] = x;
        
    }
    
    // stack ka top agar empty hai toh -1 return ho jayega . agar empty nhi hai toh top k valye ko hu ek variable x me stor kr denge aur top ko ek position piche kr denge , aur removed element ki value return kr denge .
    public int pop() {
        if(top == -1){
            return -1;
        }
        int x = stack[top];
        top--;
        return x;
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, top+1);

        for(int i=0; i<limit; i++){
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */