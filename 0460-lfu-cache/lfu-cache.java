class LFUCache {

    private int capacity;
    private int minFreq = 0;
    private Map<Integer,Integer> keyToVal = new HashMap<>();
    private Map<Integer,Integer> keyToFreq = new HashMap<>();
    private Map<Integer, LinkedHashSet<Integer>> freqToKey = new HashMap<>();
    


    public LFUCache(int capacity) {
        this.capacity = capacity;
        
    }
    
    public int get(int key) {

        if(!keyToVal.containsKey(key)){
           return -1;
        }
        updateFreq(key);
        return keyToVal.get(key);
        
    }

    private void updateFreq(int key){
        int freq = keyToFreq.get(key);
        keyToFreq.put(key,freq+1);
        freqToKey.get(freq).remove(key);

        if(freq == minFreq && freqToKey.get(freq).isEmpty()){
            minFreq++;
        }

        freqToKey.computeIfAbsent(freq+1,k-> new LinkedHashSet<>()).add(key);
    }

    
    
    public void put(int key, int value) {

        if(capacity <=0) return;

        if(keyToVal.containsKey(key)){
            keyToVal.put(key,value);
            updateFreq(key);
            return;
        }

        if(keyToVal.size() >= capacity){
            int keyToRemove = freqToKey.get(minFreq).iterator().next();

            freqToKey.get(minFreq).remove(keyToRemove);
            keyToVal.remove(keyToRemove);
            keyToFreq.remove(keyToRemove);
        }

        keyToVal.put(key,value);
        keyToFreq.put(key,1);
        minFreq = 1;
        freqToKey.computeIfAbsent(1,k-> new LinkedHashSet<>()).add(key);
        
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
