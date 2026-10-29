class Solution {
    public int[] applyOperations(int[] nums) {

        int slow=0;
        int fast = 0;
        int n = nums.length;

        for(int i = 0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }

        while(fast < n){

            int temp = nums[fast];

            if(temp != 0){
                nums[fast] = nums[slow];
                nums[slow] = temp;
                
                slow++;
            }

                
            fast++;
        }
        return nums;
        
    }
}
