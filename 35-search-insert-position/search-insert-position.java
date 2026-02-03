class Solution {
    public int searchInsert(int[] nums, int target) {
        int left, right, mid;
        left = 0;
        right = nums.length - 1;
        while(left <= right){ 
            mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
            else if(target < nums[mid]) right = mid-1; // <= not required, handled above
            else left = mid + 1;
        }
        return left;
    }
}