class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits == null || fruits.length <=0){
            return 0;
        }
        int n = fruits.length;
        int l = 0;
        int r = 0;
        Map<Integer,Integer> window = new HashMap<>();
        int maxLen = 0;
      while(r<n){
                         window.put(fruits[r],window.getOrDefault(fruits[r],0)+1);


            while(window.size() > 2){
                int key = fruits[l];
                window.put(key,window.get(key)-1);
                if(window.get(key) == 0){
                   window.remove(key);
                }
                l++;
               
            }
             maxLen = Math.max(maxLen, r-l+1);
             r++;
            
        }
        
        return maxLen;
    }
}
