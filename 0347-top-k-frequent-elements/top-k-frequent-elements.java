class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> counts = new HashMap<>();
     

        int[] res = new int[k];

        for(int i : nums){
            counts.put(i,counts.getOrDefault(i, 0)+1);
        }
PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(counts::get));
        for( int key : counts.keySet()){
            minHeap.add(key);
            while(minHeap.size()> k){
                minHeap.poll();
            }
        }

        for(int i = 0;i<k;i++){
            res[i] = minHeap.poll();
        }
        return res;
    }
}
