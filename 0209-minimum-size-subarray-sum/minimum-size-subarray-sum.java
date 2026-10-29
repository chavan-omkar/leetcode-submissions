class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int maxLen = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            sum += nums[i];

            while(sum >= target){
                maxLen = Math.min(maxLen,i-left+1);
                sum -=nums[left];
                left++;
            }
        }

        return maxLen == Integer.MAX_VALUE ? 0:maxLen;
    }
}
