class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures == null || temperatures.length <=0){
            return new int[0];
        }


        int size = temperatures.length;

        int[] stack = new int[size];
        // Stack<Integer> stack = new Stack<>();
        int[] result = new int[size];
        int top = -1;

        for(int i = 0;i<size;i++){
            // while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
            //     int prevIndex = stack.pop();
            //     // int prevTemp = temperatures[prevIndex];
            //     result[prevIndex] = i-prevIndex;
            // }
            // stack.push(i);

            while(top >=0 && temperatures[stack[top]] < temperatures[i] ){
                int prevIndex = stack[top--];
                result[prevIndex] = i - prevIndex;
            }
            stack[++top] = i;
        }

        return result;
        
    }
}
