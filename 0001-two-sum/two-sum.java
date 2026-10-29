class Solution {
    public int[] twoSum(int[] nums, int target) {
        
//         int[] res = new int[2];
// int sum = 0;
//         for(int i=0;i<nums.length;i++){
//             for(int j = i+1;j<nums.length;j++){
//                 sum = nums[i] + nums[j];
//                 if(sum == target){
//                     res[0] = i;
//                     res[1] = j;
//                     return res;
//                 }
//             }
//         }

//         return res;

HashMap<Integer,Integer> map = new HashMap<>();
for(int i=0;i<nums.length;i++){
    int remaning = target - nums[i];
    if(map.containsKey(remaning)){
        return(new int[]{map.get(remaning),i});
    }
    map.put(nums[i],i);
}
return new int[0];
    }
}
