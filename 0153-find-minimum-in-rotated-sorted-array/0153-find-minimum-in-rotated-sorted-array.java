class Solution {
    public int findMin(int[] nums) {
       int low=0;
       int high= nums.length-1;

       while(low< high){
        int mid= low+(high-low)/2;

        if(nums[mid] > nums[high]){
            // minimum right side me hai isliye low aage badh jayega
            low= mid+1;

        }
        else{
            // agar mid less hai high se toh mid ko high bna denge kyuki mid khud bhi minimum ho sakta hai 
            high= mid;
        }
       } 
       return nums[low];
    }
}