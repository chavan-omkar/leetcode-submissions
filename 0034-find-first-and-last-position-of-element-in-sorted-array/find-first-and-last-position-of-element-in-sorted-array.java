class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[]{-1,-1};
        }

        int firstIndex = findBoundary(nums,target);
        if(firstIndex == nums.length || nums[firstIndex] != target){
            return new int[]{-1,-1};
        }
        int secondIndex = findBoundary(nums,target+1)-1;
        return new int[]{firstIndex,secondIndex};
    }

    private int findBoundary(int[]nums, int target){
        int low = 0;
        int high = nums.length;
        while(low < high){
            int mid = low + (high-low)/2;

            if(nums[mid] < target){
                low = mid+1;
            }else if(nums[mid] >= target){
                high = mid;
            }
        }
        return low;
    }
}
