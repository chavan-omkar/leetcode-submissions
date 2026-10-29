class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sortedKey = new String(c);
            if(!map.containsKey(sortedKey)){
                map.put(sortedKey,new ArrayList<>());
            }

            map.get(sortedKey).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
