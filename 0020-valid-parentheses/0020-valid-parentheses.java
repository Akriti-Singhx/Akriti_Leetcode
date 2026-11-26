class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);

            // agar stack me opening bracket aaye toh push kr denge 
            if(ch=='(' || ch =='{' || ch== '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }

                char top = st.peek();

                if((ch==')' && top != '(') ||
                (ch == '}' && top != '{') ||
                (ch == ']' && top != '[')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}