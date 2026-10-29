class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] window = new int[26];

        for(char c : s1.toCharArray()){
            freq[c-'a']++;
        }

        int k = s1.length();

        for(int i = 0;i<s2.length();i++){
            char inc = s2.charAt(i);
            window[inc-'a']++;

            if(i>=k){
                char outg = s2.charAt(i-k);
                window[outg-'a']--;
            }

            if(i>=k-1){
                if(Arrays.equals(freq,window)){
                    return true;
                }
            }
        }

        return false;
        
    }
}
