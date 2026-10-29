class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> count = new HashMap<>();
        // int size = nums.length < nums2.length ? nums.length : nums2.length;
        // int[] count = new int[size];

        for(int num : nums1){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        List<Integer> result = new ArrayList<>();

        for(int num : nums2){

            int cnt = count.get(num) != null ? (int) count.get(num) : 0 ;
            if(cnt > 0){
                result.add(num);
                count.put(num,cnt-1);
            }
        }

        int[] arr = new int[result.size()];
        for(int i = 0;i<result.size();i++){
            arr[i] = result.get(i);
        }
        return arr;
        // return result.stream().mapToInt(i -> i).toArray();
        
    }
}
