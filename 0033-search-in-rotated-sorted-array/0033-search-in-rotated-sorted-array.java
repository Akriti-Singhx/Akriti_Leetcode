class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high= nums.length-1;

        while(low<= high){
            int mid= low+(high-low)/ 2;

            if(nums[mid] == target){
                return mid;
            }
            // left half sorted hai 
            if(nums[mid] >= nums[low]){

                // target left half me hai
                if(nums[low] <= target && target <nums[mid]){
                    high= mid-1;
                }
                else{
                    low= mid+1;
                }
            }
            else{
            // Target right sorted half mein hai
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                }
                // Target left half mein hai
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}