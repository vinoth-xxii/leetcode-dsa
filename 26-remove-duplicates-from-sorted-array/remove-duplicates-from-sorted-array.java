class Solution {
    public int removeDuplicates(int[] nums) {
        //we will approach using two pointers
        int left, right, count;
        left = 0; right = 1; count = 1;
        while(right < nums.length){
            if(nums[left] != nums[right]){
                nums[++left] = nums[right];
                count++;
                right++;
            }
            else{
                right++;
            }
        }
        return count;
    }
}