class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null){
            return new int[0];
        }

        int n1 = nums1.length;
        int n2 = nums2.length;
        int size = n1 <= n2 ? n1 : n2;

      
        Set<Integer> result = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for(int num : nums1){
           result.add(num);
        }
        
        for(int num2 : nums2){
            if(result.contains(num2)){
                res.add(num2);
            }
        }

        return res.stream().mapToInt(i->i).toArray();

        
        
    }
}
