class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        
        //ye batayega ki kitna open bracket unmatched hai 
        int open = 0;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);

            if(ch == '('){
                open++;
                sb.append(ch);
            }else if(ch == ')'){
                if(open>0){
                    open--;
                    sb.append(ch);
                }
            }else{
                    sb.append(ch);
                }
        }
        int close =0;
        for(int i=sb.length()-1;i>= 0; i--){
            char ch= sb.charAt(i);

            if(ch == ')'){
                close++;
            }
            else if(ch == '('){
                if(close>0){
                    close--;
                }else{
                    sb.deleteCharAt(i);
                }
            }
        }
        return sb.toString();
    }
}