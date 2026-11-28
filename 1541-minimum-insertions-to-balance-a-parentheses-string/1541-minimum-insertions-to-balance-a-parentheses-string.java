class Solution {
    public int minInsertions(String s) {
      int open=0;
      int insertion=0;

      for(int i=0; i<s.length(); i++){
        if(s.charAt(i) == '('){
            open +=2;

            // agar ek ) bacha mtlb ye odd hua
            if(open %2 != 0){
                insertion++;
                open--;
            }
        }
        else{
            open--; // agar ek ) aaya toh open kam ho jayega

            // agar open 0 se kam hua ->  extra ) bacha
            if(open<0){
                open=1;
                insertion++;
            }
        }
      }  
      return insertion+ open;
    }
}