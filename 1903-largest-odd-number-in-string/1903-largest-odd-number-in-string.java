class Solution {
    public String largestOddNumber(String num) {

        for(int i = num.length() - 1; i >= 0; i--) {

            int digit = num.charAt(i) - '0'; // character ko integer me change karenge 

            if(digit % 2 == 1) {  // digit agar odd hai 
                return num.substring(0, i + 1);  // subsuring return hoga 
            }
        }

        return ""; // odd nhi mila toh kuch nhi return hoga .
    }
}