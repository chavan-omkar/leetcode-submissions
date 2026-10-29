class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>result = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates,target,result,new ArrayList<>(),0);
        return result;
    }

    private void backTrack(int[] candidates,int target,List<List<Integer>>result, List<Integer> curr, int startIndex){
        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = startIndex;i<candidates.length;i++){
            if(i > startIndex && candidates[i] == candidates[i-1]){
                continue;
            }

            if(candidates[i] > target){
                 break;
            }
            curr.add(candidates[i]);
            backTrack(candidates,target-candidates[i],result,curr,i+1);
            curr.remove(curr.size()-1);
        }
        return;
    }
}
