class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        /* previously you weere discussing about overall sum right?
        for the statement "is overall less than zero, then we drop it
        what if all the numbers in the array are negative? 
        is that's case image it adding -ve's will make the sum smaller
        but having them individually will hold greate value. So sum <= 0 rule will also apply even if all the numbers are negative" 
        */

        for(int i = 0; i < nums.length; i++){
            sum+=nums[i]; //1st we will calculate the sum
            /* if you worry about comparing sum = 0 with max, don't be
            sum+=num[i] will take current value or one elment subarray so to say
            */
            max = Math.max(sum, max);
            if (sum < 0) sum = 0;
        }

        return max;

    }
}