class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null ){
            return 0;
        }
        if(s.length()<=0){
            return 0;
        }
        
        
        int n = s.length();
        int maxLen = 1;
        int l = 0;
        int r = 0;
        // Set<Character>set = new HashSet<>();
        int[] lastSeen = new int[128];

        while(r < n){
            char c1 = s.charAt(r);

            lastSeen[c1]++;

            while(lastSeen[c1] > 1){
                lastSeen[s.charAt(l)]--;
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
            // lastSeen[r]++;
            r++;


            

        //    while(set.contains(s.charAt(r))){
        //     set.remove(s.charAt(l++));
        //    }

        //    set.add(s.charAt(r));
        //    maxLen = Math.max(maxLen,r-l+1);
        //    r++;
           

        }

        return  maxLen;
        
    }
}
