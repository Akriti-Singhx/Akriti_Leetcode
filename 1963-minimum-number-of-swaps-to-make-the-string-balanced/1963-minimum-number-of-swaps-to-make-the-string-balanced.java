class Solution {
    public int minSwaps(String s) {
        int balance =0;
        int imbalance=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '['){
                balance++;
            }else{
                balance--;
            }
            imbalance = Math.max(imbalance, -balance);
        }
        return (imbalance+1)/2;
    }
}