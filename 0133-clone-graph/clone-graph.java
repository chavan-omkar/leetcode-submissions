/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {

        if(node == null){
            return node;
        }

        if(node.neighbors.isEmpty()){
            return new Node(node.val,new ArrayList<>(node.neighbors));
        }

        Queue<Node> que = new LinkedList<>();
        que.add(node);
        Map<Node,Node> map = new HashMap<>();
        map.put(node,new Node(node.val));

        while(!que.isEmpty()){
            
                Node originalNode = que.poll();
                for(Node neighborNode : originalNode.neighbors){

                    if(!map.containsKey(neighborNode)){
                            map.put(neighborNode,new Node(neighborNode.val));
                            que.add(neighborNode);
                    }

                    map.get(originalNode).neighbors.add(map.get(neighborNode));

                }
               
            } 
return map.get(node);
        }

        
        
    }
