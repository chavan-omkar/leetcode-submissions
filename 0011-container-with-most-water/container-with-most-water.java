class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int min = 0;
        int maxWater = Integer.MIN_VALUE;

        while(l < r){
            
            int minHeight = Math.min(height[l],height[r]);

            int width = r -l;

            int currentWater = minHeight * width;

            maxWater = Math.max(maxWater,currentWater);
            if(height[l] < height[r]){
              l++;
            }else{
                r--;
            }
            
            
        }

        return maxWater;
        
    }
}
