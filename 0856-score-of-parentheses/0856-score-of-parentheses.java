class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentScore =0;

        for(int i=0; i<s.length(); i++){

            // sabse pahle opening bracket k liye ceck karenge
            if(s.charAt(i) == '('){
                stack.push(currentScore);
                currentScore =0;
            }else{
                if(s.charAt(i-1)== '('){
                    currentScore=1;
                }else{
                    currentScore = 2*currentScore;
                }

                currentScore +=stack.pop();
            }
        }
        return currentScore;
    }
}