class Solution {
    public int largestRectangleArea(int[] heights) {

//
           
        

        int maxArea = 0;
        int n = heights.length;
        int[] stack = new int[n+1];
        int top = -1;

        for(int i = 0;i<=n;i++){
            int currentHeight = i==n ? 0 : heights[i];

            while(top > -1 && heights[stack[top]] >= currentHeight){
                int height = heights[stack[top--]];

                int width = top == -1 ? i : i - stack[top]-1;

                int area = height * width;

                maxArea = Math.max(maxArea,area);

               

            }
            stack[++top] = i;
        }

        return maxArea;

        
        
    }
}
