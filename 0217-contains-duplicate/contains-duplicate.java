class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length <=1) return false;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
            
        }
        return false;
    }
}
