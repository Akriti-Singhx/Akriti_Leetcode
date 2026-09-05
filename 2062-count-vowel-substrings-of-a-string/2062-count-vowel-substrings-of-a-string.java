class Solution {
    public int countVowelSubstrings(String word) {
    int count=0;

    for(int i=0; i<word.length(); i++){
    
    // ise yaha loop k andar isliye likh rahe hai kyuki agar loop break hua toh purane characters isme nh rhege. ye bhi reset ho jayega .
        Set<Character> set = new HashSet<>();

        for(int j=i; j<word.length(); j++){

            // character me change karenge
            char ch= word.charAt(j);

            // set me character add hone se pahle agar consonant aaya toh loop turant hi break ho jayega .

            if(!isVowel(ch)){
                break;
            }

            set.add(ch);

            if(set.size() == 5){
                count++;
            }
        }
    }
    return count;
    }
 private boolean isVowel(char ch) {

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}