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
import java.util.*;

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (searchDepth(root) == -1){
            return false;
        }else{
        return true;    
        }

    }

    public int searchDepth(TreeNode movRoot){
        if (movRoot == null){
            return 0; 
        }
        int leftDepth = searchDepth(movRoot.left);
        int rightDepth = searchDepth(movRoot.right);        

        if (leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1){
            return -1;
        }
        return Math.max(leftDepth, rightDepth)+1;
    }    
        
    

}