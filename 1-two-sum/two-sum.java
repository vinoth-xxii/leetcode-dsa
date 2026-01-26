class Solution {
    public int[] twoSum(int[] nums, int target) {
        //let just try first with brute force
        int arr_len = nums.length;
        for(int i = 0; i < arr_len - 1; i++) { //don't want to check last
            for(int j = i + 1; j < arr_len; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}