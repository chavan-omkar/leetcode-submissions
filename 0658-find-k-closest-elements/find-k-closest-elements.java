class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>(k);
        int n = arr.length;
        int p1 = 0;
        int p2 = n-1;

        while((p2-p1 + 1) > k){

           if(Math.abs(arr[p1] - x) > Math.abs(arr[p2]-x)){
            p1++;
           }else{
            p2--;
           }
            
        }

        for(int i = p1;i<=p2;i++){
            res.add(arr[i]);
        }
        
        return res;
    }
}
