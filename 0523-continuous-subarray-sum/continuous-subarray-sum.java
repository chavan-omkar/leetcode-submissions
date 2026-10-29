class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int mod = k == 0 ? sum : sum % k;
            if (map.containsKey(mod)) {
                int prevIndex = map.get(mod);
                if (i - prevIndex >= 2)
                    return true;
            } else {
                map.put(mod, i);
            }

        }

        return false;

    }
}
