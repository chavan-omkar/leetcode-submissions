class Solution {

    private void rotate(int[]nums,int start,int end){
        int left = start;
        int right = end;
        while(left < right){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
       k = k%n;
        rotate(nums,0,n-k-1);
        rotate(nums,n-k,n-1);
        rotate(nums,0,n-1);
        
    }
}
