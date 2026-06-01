class Solution {
    public int maxArea(int[] height) {
        //the problem is asking to return the maximum possbile area
        //so, try calculating area for each iteration and compare it to max
        //explanation from here : https://leetcode.com/problems/container-with-most-water/description/comments/1568582/ helped tackle the problem
        //it's O(N) time and O(1) space

        int left = 0;
        int right = height.length - 1; //this will be considered as something inclusve/exclusive enpoint 

        if(height.length < 2){
            return height[0];
        }

        int length = 0;
        int breath = 0;
        int max_area = 0;

        while(left < right){
            length = right - left;
            breath = Math.min(height[left], height[right]);
            max_area = Math.max(max_area, length * breath);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
}