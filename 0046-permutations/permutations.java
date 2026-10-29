class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
       
        permutation(nums,result,0);
        return result;
        }

    private void permutation(int[] nums, List<List<Integer>> result, int i  ){

        if(i == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num : nums) temp.add(num);
            result.add(temp);
            return;
        }

        // result.add(path);
        

        for(int j = i;j<nums.length;j++ ){
            swap(nums,i,j);
            permutation(nums,result,i+1);
            swap(nums,i,j);
        }
    }

    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    }
