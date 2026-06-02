class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Arrays.sort() modifies the original array directly and returns void. It cannot be assigned to a new variable
        //int[] sorted = Arrays.sort(nums);
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}