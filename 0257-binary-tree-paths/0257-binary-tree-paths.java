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
        List<String> list = new ArrayList<>();
        dfs(list, root, new StringBuilder());
        return list;
    }
    private void dfs(List <String> list, TreeNode node, StringBuilder s){
        if (node == null){
            return; 
        }
        int len = s.length();
        s.append(node.val);
        if (node.left == null && node.right == null){
            list.add(s.toString());
        }else{
            s.append("->");
        }
        dfs(list, node.left, s);
        dfs(list, node.right, s);
        s.setLength(len);
    }
}