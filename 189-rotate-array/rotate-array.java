class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];      //o(n) space
        for (int i = 0; i < nums.length; i++) { //o(n) time
            temp[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) nums[i] = temp[i]; //o(n) time
    }
}