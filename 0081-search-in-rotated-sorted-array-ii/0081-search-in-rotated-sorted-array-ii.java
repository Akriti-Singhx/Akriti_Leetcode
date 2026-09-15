class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high= nums.length -1;

        while(low<= high){
            int mid= low+(high-low)/2;

            if(nums[mid] == target){
                return true;
            }

            // ab ahar duplicate aaya 
            if(nums[mid]== nums[low] && nums[high] == nums[mid]){
                low++;
                high--;
            }

            // left half sorted hai 
            else if(nums[low] <= nums[mid]){
                // target left half me hai 
                if(nums[low] <= target && target < nums[mid]){
                    high = mid-1;

                }else{
                    low= mid+1;
                }
            }

            // agar right half me hia 
            else{
                if(target >nums[mid] && target <= nums[high]){
                    low= mid+1;
                }
                else{
                    high= mid-1;
                }
            }
        }
        return false;
    }
}