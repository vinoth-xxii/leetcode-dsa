class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 2)
            return nums.length;

        int left, right;
        left = 2;
        right = 2;

        while (right < nums.length) {
            if (nums[left - 2] != nums[right]) {
                nums[left++] = nums[right++];
            } else
                right++;
        }
        return left;
    }
}