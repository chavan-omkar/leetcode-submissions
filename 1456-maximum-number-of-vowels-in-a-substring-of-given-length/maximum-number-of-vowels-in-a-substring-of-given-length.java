class Solution {
    public int maxVowels(String s, int k) {

        String vowels = "aeiou";
        int[] window = new int[26];

        int vowelCnt = 0;
        int maxLen = 0;

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(vowels.contains(String.valueOf(c))){
                vowelCnt++;
            }

            if(i>=k){
                
                char outg = s.charAt(i-k);
                if(vowels.contains(String.valueOf(outg))){
                    vowelCnt--;
                }
                window[outg-'a']--;

            }

            if(i>=k-1){
                maxLen = Math.max(maxLen,vowelCnt);
            }
        }

        return maxLen;


        
    }
}
