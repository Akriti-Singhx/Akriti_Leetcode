class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high= 0;

        // high sabse maximum wala hoga . ye loop high ko sabse bada element allot krnen k liye h.
        for(int pile: piles){
            high = Math.max(high, pile);
        }

        // ab hame ek ans nam ka variable lena hoga jisko hum last me return karenge aur isko abhi hum high allot kr dete hai .
        int ans = high;

        // binary search
        while(low<= high){
            int mid= low+(high- low)/2;

            // hours find krna hai 
            long hours =0;

            // ab mid nikalne k bad hame dekhna hai ki khane me kitne hours lagenge at speed of mid.
            for(int pile: piles){

                // saare banana khane me ise kitne time lagenge , toh hum jo mid nikalenge uske hisab se total hour calculate karenge 
                hours += (pile+ mid-1)/mid;
            }
            
            if(hours<=h){
                ans = mid;
                high= mid-1;
            }else{
                low= mid+1;
            }

        }
        return ans;

    }
}