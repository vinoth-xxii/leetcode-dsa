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

/* it simply has to swap left and right childred */
class Solution {

    public TreeNode helper(TreeNode node){
        if(node == null) return node;

        //hold the left node
        helper(node.left);
        //hold the right node
        helper(node.right);

        //swaping right and left
        TreeNode temp = new TreeNode();
        temp = node.right;
        node.right = node.left;
        node.left = temp;

        return node;
    }

    public TreeNode invertTree(TreeNode root) {
        root = helper(root);
        return root;
    }
}