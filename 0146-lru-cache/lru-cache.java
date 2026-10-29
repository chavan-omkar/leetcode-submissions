class LRUCache {

    class Node{
        int key,val;
        Node next,prev;

        public Node(int key,int val){
            this.key = key;
            this.val = val;
            
        }
    }

    private HashMap<Integer,Node>map ;
    private int capacity;
    private Node head = new Node(0,0);
    private Node tail = new Node(0,0);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map =  new HashMap<>();
        head.next = tail;
        tail.prev = head;

    }
    
    public int get(int key) {

        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }else{
            return -1;
        }
        
    }
    
    public void put(int key, int value) {
       if(map.containsKey(key)){
        remove(map.get(key));
       }

       if(map.size() == capacity){
        remove(tail.prev);
       }
        insert(new Node(key,value));
    }

    private void insert(Node node){
        map.put(node.key,node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    private void remove(Node curr){
        map.remove(curr.key);
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
