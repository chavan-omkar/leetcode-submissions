class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.length() < text2.length()){
            longestCommonSubsequence(text2, text1);
        }

    
            int[] dp = new int[text2.length()+1];

            for(char ch : text1.toCharArray() ){
                int prevDiag = 0;

                for(int j = 1;j < dp.length;j++){

                   int temp = dp[j];

                   if(ch == text2.charAt(j-1)){
                    dp[j] = 1+prevDiag;
                   }else{
                    dp[j] = Math.max(dp[j], dp[j-1]);
                   }

                   prevDiag = temp;

                }

            }

            return dp[text2.length()];
        // int m = text1.length();
        // int n = text2.length();
        // int[][]dp = new int[m+1][n+1];
        // // dp[0][0] = 0;

        // for(int i = 1;i<=m;i++){
        //     for(int j = 1;j<=n;j++){
        //         if(text1.charAt(i-1) == text2.charAt(j-1)){
        //             dp[i][j] = dp[i-1][j-1]+1;
        //         }else{
        //             dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        //         }
        //     }
        // }

        // return dp[m][n];
        
    }
}
