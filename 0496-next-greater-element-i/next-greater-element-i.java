class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer,Integer> map = new HashMap<>();
        // Stack<Integer> stack = new Stack<>();
        int[] stack = new int[nums2.length+1];
        int top = -1;

        for(int num : nums2){
            // while(!stack.isEmpty() && stack.peek() < num ){
            //     map.put(stack.pop(),num);
            // }

            // stack.push(num);

            while(top != -1 && stack[top] < num ){
                map.put(stack[top--],num);
            }

            stack[++top] = num;
        }

        int[] result = new int[n];
        for(int i = 0;i<n;i++ ){
            result[i] = map.getOrDefault(nums1[i],-1);
        }
        
        return result;
    }
}
