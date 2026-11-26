class Solution {
    public String removeDuplicates(String s, int k) {
        // stack banayenge jo element k sath count bhi store kare
        Stack<int[]> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);

            // [0,1] -> pair of eleement and count
            //[0] -> element
            //[1] -> count
            if(!stack.isEmpty() && stack.peek()[0] == ch){
                stack.peek()[1]++; // count badhega
            }else{
                stack.push(new int[]{ch,1});
            }

            if(stack.peek()[1] == k){
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();

        for(int[] pair: stack){
            for(int j=0; j<pair[1]; j++){
                result.append((char) pair[0]);
            }
        }
        return result.toString();
    }
}