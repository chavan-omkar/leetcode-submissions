class Solution {
    public int equalSubstring(String s, String t, int maxCost) {

        int left = 0;
        int right = 0;
        int n = s.length();

        int maxLen = 0;
        int tempCost = 0;
        while(right < n){
            char s1 = s.charAt(right);

            char t1 = t.charAt(right);

            tempCost  += Math.abs(s1-t1);

            while(tempCost > maxCost){
                tempCost -= Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }

            
                maxLen = Math.max(maxLen,right-left+1);
          

            right++;

        }

        return maxLen;
        
    }
}
