class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int[] res = new int[nums.length];
        

        int equalCnt = 0;
        int lessCnt = 0;

        
        for(int num : nums){
            if(num < pivot){
lessCnt++;
            } else if(num == pivot){
                equalCnt++;
            }

        }

        int low = 0;
        int mid = lessCnt;
        int high = equalCnt+lessCnt ;


        for(int num : nums){
            if(num < pivot){
                res[low++] = num;
            }else if(num == pivot){
                res[mid++] = num;
            }else{
                res[high++] = num;
            }
        }
        return res;
        
    }
}
