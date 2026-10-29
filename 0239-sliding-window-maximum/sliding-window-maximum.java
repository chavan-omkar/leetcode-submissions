class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>que = new ArrayDeque<>();
        int n = nums.length;
        int[] result = new int[n-k+1];
        int le = 0;

        for(int i =0;i<n;i++){
            if(!que.isEmpty() && que.peek() < i-k+1){
                que.poll();

            }

            while(!que.isEmpty() && nums[que.peekLast()] < nums[i] ){
                que.pollLast();
            }

            que.offer(i);

            if(i>=k-1){
                result[le++] = nums[que.peek()];
            }
        }
        return result;
    }
}
