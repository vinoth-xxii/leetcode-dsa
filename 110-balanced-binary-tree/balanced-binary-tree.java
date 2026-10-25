/* From stack overflow:
 2. Depth: Imagine measuring depth of a sea, we do it from earth's surface to ocean bed (root to leaf). – Yesh  Commented Nov 20, 2016 at 2:39

 in this case we have 9, 15, 7 as leaves, and for another test case we have 4, 4, 3, and 2.
 so, we have calculate depth for each subtrees(how far to reach a leaf)

 i initaill thought set 1 or count 1 and then go increment each level,
 then i thought why should i do that at first itself as we don't how far it will go
 and how to modify them/track them back. 

 'back?' so why not return the count or something after the recursuive calls?

 what values to pass back? i initaill thought i could simply compare the height of
 just the left and right subtree from root, truns out, the quesion says we need to 
 for every node in the tree.

 so i will get the height of left and right subtrees of a particular node, compare them
 and set the max value as the height of the node.
*/
class Solution {
    //is it similar to postorder traversal?
    public int helper(TreeNode node){
        int leftHeight = 0;
        int rightHeight = 0;
        if(node == null){
            return 0;
        }
        leftHeight += helper(node.left);
        rightHeight += helper(node.right);
        if(leftHeight != -1 && rightHeight != -1){
            if(Math.abs(leftHeight - rightHeight) <= 1){
                return Math.max(leftHeight, rightHeight) + 1;
            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if(helper(root) != -1){
            return true;
        }
        return false;
    }
}