class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] seen = new boolean[26];

        // ab hum last index find karenge 
        for(int i=0; i<s.length(); i++){
            lastIndex[s.charAt(i)- 'a']= i;
        }

        Stack<Character> stack = new Stack<>();

        // ab loop banayenge 
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);

            // agar same character mila toh ignore kr k aage badh jayenge 
            if(seen[ch- 'a']){
                continue;
            }

            // agar character present nhi hai toh hum use simply push nhi kr sakte .usko pichle wale se compar  karenge aur uska lastIndex dekhenge ki wo fir se aayega ya nhi .
            while(!stack.isEmpty() && 
            ch < stack.peek() &&
            lastIndex[stack.peek() - 'a'] >i){
                char removed = stack.pop();
                seen[removed- 'a'] = false;
            }
            stack.push(ch);
            seen[ch- 'a'] = true;
        }

        StringBuilder ans= new StringBuilder();

        for( char ch: stack){
            ans.append(ch);
        }
        return ans.toString();
    }
}