class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            int num = nums[mid];

            if(num == 0){
                nums[mid] = nums[low];
                nums[low] = num;
                low++;
                mid++; 
            }else if(num == 1){
                mid++;
            }else {
                nums[mid] = nums[high];
                nums[high] = num;
                high--;
            }
        }


    }
}
