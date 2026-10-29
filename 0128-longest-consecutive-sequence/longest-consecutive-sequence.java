class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        // Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int longestConset = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num;
                int currentLong = 1;

                while(set.contains(curr + 1)){
                    curr++;
                    currentLong++;
                }
                longestConset = Math.max(longestConset,currentLong);
            }
        }
        return longestConset;
    }
}
