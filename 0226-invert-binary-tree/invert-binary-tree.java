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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(curr);

        while(!stack.isEmpty()){
            TreeNode c1 = stack.pop();

            if(c1.left != null) stack.push(c1.left);

            if(c1.right != null) stack.push(c1.right);

            TreeNode cleft = c1.left;
            c1.left = c1.right;
            c1.right = cleft;
        }

        return root;
        
    }
}
