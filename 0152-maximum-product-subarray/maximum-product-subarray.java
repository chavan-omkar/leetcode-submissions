class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int maxSoFar = nums[0];

        for(int i = 1;i<n;i++){
            int num = nums[i];
            int temp = max;

            max = Math.max(num, Math.max(max * num, min * num));
            min = Math.min(num,Math.min(temp * num, min * num));

            maxSoFar = Math.max(maxSoFar,max);
        }
        return maxSoFar;
    }
}
