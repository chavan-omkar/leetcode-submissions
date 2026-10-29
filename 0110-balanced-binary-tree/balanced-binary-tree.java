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
    public boolean isBalanced(TreeNode root) {
        
        if(root == null){
            return true;
        }
        
       boolean isBalanced = validate(root) == -1 ? Boolean.FALSE :Boolean.TRUE;
       return isBalanced;
    }

    private int validate(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = validate(root.left);
        if (leftHeight == -1)
            return -1;

        int rightHeight = validate(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return 1 + Math.max(leftHeight, rightHeight);

    }
}
