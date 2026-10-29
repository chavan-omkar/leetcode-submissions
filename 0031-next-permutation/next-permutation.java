class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;

        for(int i = nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        if(ind == -1){
            reverse(0,nums.length-1,nums);
            return;
        }

        for(int i = nums.length-1;i>ind;i--){
            if(nums[i] > nums[ind]){
                swap(i,ind,nums);
                break;
            }
        }

        reverse(ind+1,nums.length-1,nums);
        
    }

    public void reverse(int start,int end,int[] nums){
        while(start < end){
            swap(start,end,nums);
            start++;
            end--;
        }
    }

    public void swap(int first,int sec,int[] nums){
        int temp = nums[first];
        nums[first] = nums[sec];
        nums[sec] = temp;
    }
}
