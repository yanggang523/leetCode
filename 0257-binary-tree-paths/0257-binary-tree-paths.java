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
    List<String> aa = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, ""+root.val);
        return aa;
    }

    private void dfs(TreeNode node, String s){
        if (node.left == null && node.right == null){
            aa.add(s);
        }
        if (node.left != null){
            String k = s + "->" + node.left.val;
            dfs(node.left, k);
        }
        if (node.right != null){
            String k = s + "->" + node.right.val;
            dfs(node.right, k);
        }
        // return s;
        
    }
}