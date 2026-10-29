class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
         backtracking(nums,n,result,new ArrayList<>(),0);
         return result;
    }

    private void backtracking(int[]nums,int n,List<List<Integer>> result,List<Integer> temp, int i){
        result.add(new ArrayList<>(temp));


        for(int j = i;j<n;j++){
            temp.add(nums[j]);
            backtracking(nums,n,result,temp,j+1);
            temp.remove(temp.size()-1);
        }
    }
}
