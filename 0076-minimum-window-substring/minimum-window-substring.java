class Solution {
    public String minWindow(String s, String t) {
         int n = s.length();
         int k = t.length(); 
        if(s == null || s.length() < t.length() || n < 1 || k > Math.pow(10,5)){
            return "";
        }

        // Map<Character,Integer> map = new HashMap<>();
        int[]tcharFreq = new int[128];
        for(char c : t.toCharArray()){
            // map.put(c,map.getOrDefault(c,0)+1);

            tcharFreq[c]++;
        }

        int uniqueChar = 0;

        for(int f : tcharFreq){
            if(f > 0){
              uniqueChar++;
            }
        }

        // Map<Character,Integer> window = new HashMap<>();
        int[] window = new int[128];

        int l = 0;
        int r = 0;
        int minLen = Integer.MAX_VALUE;
       
        int count = 0;
        int minStart=0;

        while(r < n){

            char c  = s.charAt(r);

            window[c]++;

            if(tcharFreq[c] > 0 && tcharFreq[c] == window[c]){
                count++;
            }

            while(count == uniqueChar){
                int currLen = r-l+1;
                if(currLen < minLen){
                    minLen = currLen;
                    minStart = l;
                }
                char leftChar = s.charAt(l);
            
                if(tcharFreq[leftChar] > 0 
                && tcharFreq[leftChar] == window[leftChar]) {
                    count--;
                }
                window[leftChar]--;
                l++;
            }
            
            r++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart+minLen);
    }
}
