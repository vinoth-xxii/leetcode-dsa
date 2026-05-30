class Solution {
    //O(N) space
    //O(N) Time
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = -1;
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i <= nums.length; i++){
            if(!set.contains(i)){
                result = i;
                break;
            }
        }
        return result;
    }
}