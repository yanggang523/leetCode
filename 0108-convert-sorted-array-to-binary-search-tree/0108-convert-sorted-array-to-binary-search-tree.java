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
    public TreeNode sortedArrayToBST(int[] nums) {
        return mkTree(nums);
    }
    private TreeNode mkTree(int[] nums){
        // 숫자가 1개인지 체크 (2개여도 괜찮을듯. 근데 일단 1개로 짜기)
        if (nums.length > 1){
            // 반을 자른다.
            int[] left = Arrays.copyOfRange(nums, 0, nums.length / 2 );
            int[] right = Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length);
            TreeNode root = new TreeNode(nums[nums.length / 2]);
            root.left = mkTree(left);
            root.right = mkTree(right);
            return root;
        }else if(nums.length == 1){
            TreeNode bottom = new TreeNode(nums[0]);
            return bottom;
        }else{
            return null;
        }
    }


}