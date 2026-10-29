class Trie {
    private class Node{
        Node[] child = new Node[26];
        boolean endOfWord;
    }

    private Node root;

    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node n1 = root;
        for(char c : word.toCharArray()){
            int index = c - 'a';
            if(n1.child[index] == null){
                n1.child[index] = new Node();
            } 

            n1 = n1.child[index] ;
        }

        n1.endOfWord = true;
        
    }
    
    public boolean search(String word) {
        Node node = find(word);
        return node != null && node.endOfWord;
        
    }
    
    public boolean startsWith(String prefix) {

        return find(prefix) != null;
        
    }

    private Node find(String wrd){
        Node n = root;
        for(char c : wrd.toCharArray()){
            int index = c - 'a';
            if(n.child[index] == null){
                return null;
            } 
            n = n.child[index];

        }

        return n;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
