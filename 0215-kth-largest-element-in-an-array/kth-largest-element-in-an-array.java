class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> b-a);
        // for(int n : nums){
        //     pq.offer(n);
        // }

        // int count =0;
        // int result = -1;

        // while(!pq.isEmpty()){
        //     count++;
        //     int val = pq.poll();

        //     if(count == k){
        //         result = val;
        //         break;
        //     }
        // }

        // return result;

        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int num : nums){
            pq.offer(num);

            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
        
    }
}
