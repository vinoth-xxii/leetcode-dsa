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
    public List<Integer> inorderTraversal(TreeNode root) {

        if(root == null){
            return new ArrayList<Integer>();
        }

        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        stack.push(current);
        while(!stack.isEmpty()){
            if(current.left != null){
                current = current.left;
                stack.push(current);
            }
            else{
                while(!stack.isEmpty()){
                    TreeNode node = stack.pop();
                    result.add(node.val);
                    if(node.right != null) {
                        current = node.right;
                        stack.push(current);
                        break;
                    }
                }
            }
        }
        return result;
    }
}