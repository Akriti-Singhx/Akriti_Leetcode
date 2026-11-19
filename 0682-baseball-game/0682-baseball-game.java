class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for(String op: operations){
            
            // sabse pahle c ko handle 
            if(op.equals("C")){
                st.pop();
            }

            // handling D
            else if(op.equals("D")){
                st.push(st.peek()*2);
            }

            // handling if + comes
            else if(op.equals("+")){
                int first= st.pop();
                int second = st.peek();

                st.push(first);
                st.push(first +second);

                // handling any integer value
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        // calculating sum
            int sum =0;
            while(!st.isEmpty()){
                sum = sum+st.pop();
            }
            return sum;    
    }
}