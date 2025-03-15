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
    HashSet<Integer> pool = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, k);
    }
    private boolean dfs(TreeNode node, int k){
        if (node == null){
            return false;
        }
        if (pool.contains(k - node.val)){
            return true;
        }
        pool.add(node.val);

        return dfs(node.right, k) || dfs(node.left, k);

    }
}