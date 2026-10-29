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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);
        return Math.max(maxLeft,maxRight)+1;
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);
        // int level = 0;
        // while(!queue.isEmpty()){
        //     int size = queue.size();
        //     for(int i = 0;i<size;i++){
        //         TreeNode front  = queue.poll();
        //         if(front.left != null){
        //             queue.add(front.left);
        //         }

        //         if(front.right != null){
        //             queue.add(front.right);
        //         }
        //     }
        //     level++;

        // }
        // return level;
    }
}
