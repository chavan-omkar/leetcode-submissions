class Solution {
    public int search(int[] nums, int target) {

        if(nums == null || nums.length <=0){
            return -1;
        }

        int n = nums.length;

        int left = 0;
        int right = n-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(nums[mid] == target) return mid;

            if(nums[left] <= nums[mid]){
                    // left half is smaller

                    if(target >= nums[left] && target <= nums[mid]){
                        right = mid-1;
                    }else{
                        left = mid +1;
                    }
            }else{
                    //right half is gretaer

                    if(target <= nums[right] && target > nums[mid]){
                        left  = mid+1;
                    }else{
                        right = mid -1;
                    }
            }
        }

        return -1;

       
    }
}
