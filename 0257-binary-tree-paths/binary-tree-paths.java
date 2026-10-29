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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null) return result;
        dfs(result, new StringBuilder(), root);
        return result;
    }

    private void dfs(List<String> result, StringBuilder sb, TreeNode root) {
        if (root == null)
            return;

        int len = sb.length();
        if (sb.length() > 0) {
            sb.append("->");
        }

        sb.append(root.val);

        if (root.left == null && root.right == null) {
            result.add(sb.toString());
        } else {
            dfs(result, sb, root.left);
            dfs(result, sb, root.right);
        }
        sb.setLength(len);
    }
}
