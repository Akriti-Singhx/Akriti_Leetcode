class Solution {
    public int myAtoi(String s) {
        int i=0;

        while(i<s.length() && s.charAt(i) ==  ' '){
                i++;
            }

            int sign=1;
            if(i<s.length() && s.charAt(i)== '-'){
                sign= -1;
                i++;
            }

            else if(i<s.length() && s.charAt(i) == '+'){
                i++;
            }

            int num=0;
            while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){

            int digit= s.charAt(i) -'0';

            // overflow check krna hai 
            if(num> Integer.MAX_VALUE /10 ||
             (num==Integer.MAX_VALUE/10 && digit>7)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num= num*10 + digit;
            i++;
            }
        return num * sign;
    }
}