class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int slow = nums[0];
        int slow2 = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        

        while(slow != slow2){
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return slow;
        

        

        // for(int i =0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(nums[i] == nums[j]){
        //             return nums[j];
        //         }
        //     }
        // }

        // return -1;
    }
}
