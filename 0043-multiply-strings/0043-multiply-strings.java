class Solution {
    public String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        int[] result = new int[num1.length() + num2.length()];

        //loop last se chalega 
        for(int i=num1.length()-1; i>= 0; i--){
            for(int j=num2.length()-1; j>= 0; j--){

                // digits ko alag karenge 
                int digit1= num1.charAt(i)- '0';
                int digit2= num2.charAt(j)- '0';

                int product= digit1* digit2;

                result[i+j+1] += product%10;
                result[i+j] += product/10;
            }
        }

        // handling carry 
        for (int i = result.length - 1; i > 0; i--) {

            result[i - 1] += result[i] / 10;
            result[i] = result[i] % 10;
        }

        // ye array ko string me convert karna 
        StringBuilder ans = new StringBuilder();
        int i =0;

        while( i<result.length && result[i]==0){
            i++;
        }

        while(i< result.length){
            ans.append(result[i]);
            i++;
        }

        return ans.toString();
    }
}