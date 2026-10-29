class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return recurssion(nums, 0,dp);

        
        
    }

    private int recurssion(int[]nums,int startIndex,int[] dp){
        if(startIndex >= nums.length){
            return 0;
        }

        if(dp[startIndex] != -1) return dp[startIndex];

        int robCurrent = nums[startIndex] + recurssion(nums,startIndex+2,dp);
        int skipCurrent = recurssion(nums,startIndex+1,dp);

        dp[startIndex] = Math.max(robCurrent,skipCurrent);
        return dp[startIndex];
    }
}
