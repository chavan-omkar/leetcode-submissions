/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode node) {
                List<List<Integer>> result = new ArrayList<>();

        if(node == null){
            return result;
        }
        
        Queue<TreeNode> queueNodes = new LinkedList<>();
        queueNodes.add(node);
        
        boolean leftToRight = true;
        
        while(!queueNodes.isEmpty()){
            int n = queueNodes.size();
            List<Integer>rowOrder = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            
            TreeNode node1 = queueNodes.poll();
            
            // int index = leftToRight ? i : (n - 1 - i);
            
           if(leftToRight) {
        rowOrder.add(node1.val);
    } else {
        rowOrder.add(0, node1.val);  // Always add to front in right-to-left case
    }
            
            if(node1.left != null){
                queueNodes.add(node1.left);
            }
            
            if(node1.right != null){
                queueNodes.add(node1.right);
            }
        }
         leftToRight = !leftToRight;
         
         result.add(rowOrder);
        }
        
        
        return result;
    }
}
