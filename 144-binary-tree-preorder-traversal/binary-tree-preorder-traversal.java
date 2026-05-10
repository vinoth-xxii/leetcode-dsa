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
    public List<Integer> preorderTraversal(TreeNode root) {
        /* traverse through left subtree and then move to right subtree*/
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        //use stack only for maintain track/path not for print values
        if(root == null){
            return result;
        }

        result.add(root.val);
        TreeNode current = root;
        stack.push(current);
        //above is just preparation

        while(!stack.isEmpty()){
            if(current.left != null){
                current = current.left;
                result.add(current.val);
                stack.push(current);
                //it's like we are pushing the left subtree itself
            }
            else{
                while(!stack.isEmpty()){
                    TreeNode node = stack.pop();
                    if(node.right != null){
                        current = node.right;
                        result.add(current.val);
                        stack.push(current);
                        break;
                    }
                    // else{
                    //     current = stack.pop();
                    // }
                }
            }
        }
        return result;
    }
}