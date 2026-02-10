class Solution {
    public int maxProduct(int[] nums) {
        //Aren't asking to give us optimised sol, so O(n^2) quadratic time
        int max = Integer.MIN_VALUE;
        int temp;

        if(nums.length == 2){
            return (nums[0]-1)*(nums[1]-1);
        }
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                temp = (nums[i]-1)*(nums[j]-1);
                max = Integer.max(max, temp);
            }
        }
        return max;
    }
}