class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n = nums.size();
        int[] dp = new int[target+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for(int num : nums){
            for(int j = target;j>=num;j--){
                if(dp[j-num] != -1){
                    dp[j] = Math.max(dp[j], dp[j-num]+1);
                }
            }
        }

        return dp[target];
        // int[][] dp = new int[n+1][target+1];
        // for(int i = 0;i<=n;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        
        // dp[0][0] = 0;

        // for(int i = 1;i<=n;i++){
        //     int num = nums.get(i-1);
        //     for(int j=0;j<= target;j++){
        //         dp[i][j] = dp[i-1][j];

        //         if(j >= num && dp[i-1][j-num] != -1){
        //             dp[i][j] = Math.max(dp[i][j], dp[i-1][j-num]+1);
        //         }
        //     }
        // }
        
        // return dp[n][target];
    }
}
