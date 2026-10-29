class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int k = p.length();
        int n = s.length();

        int[] freq = new int[26];
        int[] window = new int[26];

        for(int i = 0;i<k;i++){
            freq[p.charAt(i)-'a']++;
        }

        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            window[c-'a']++;

            if(i >= k){
                char outc = s.charAt(i-k);
                window[outc-'a']--;
            }

            if(i >= k-1){
                if(Arrays.equals(freq,window)){
                    result.add(i-k+1);
                    continue;
                   
                }
            }
        }

        return result;
    }
}
