class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = (n * (n + 1) / 2);
        int sum2 = 0;
        int left = 0;
        int right = nums.length - 1;

        for (int x : nums) {
            sum2 += x;
        }

        return sum1 - sum2;

    }
}
