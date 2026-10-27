/**
    1. We must calculate height from left subtree and right subtree
    i.e calculating length from THE LEAVES. There's no confusion there.

    2. From the recursive calls, which we do to reach the leaves,
    we calculate the left and right's height.
    We sum both heights against current sum, then we return 
    max(left, right) for previous recursive calls to calculate.

    think of it like, max_diameter should be kept updaing somewhere,
    but we have to return the height for each recursive calls.
 */


/**
get the current calculated length, update it require and then pass */
class Solution {
    //[length, height]
    public int[] helper(TreeNode node){ //we are passing node, and expecting array result
        if(node == null){
            return new int[]{0, 0};
        }
        int[] left = helper(node.left);
        int[] right = helper(node.right);
        
        int height = Math.max(left[1], right[1]) + 1;
        int length = left[1] + right[1];
        length = Math.max(length, Math.max(left[0], right[0]));

        return new int[]{length, height};


    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int[] result = helper(root);
        return result[0];
    }
}