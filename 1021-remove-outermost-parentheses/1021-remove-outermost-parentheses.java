class Solution {
    public String removeOuterParentheses(String s) {
        // isme sabse pahle hum depth nam ka ek variable banayenge jo ki paranthesis ki count rakhega
        int depth =0;
        StringBuilder ans = new StringBuilder();

        for(char ch: s.toCharArray()){

            // ab opening brackets k liye 
            if(ch == '('){
                if(depth >0){ // yani ki ye wala outermost nhi hai
                ans.append(ch);
                }
                depth++;
            }else{
                depth--;
                if(depth>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}