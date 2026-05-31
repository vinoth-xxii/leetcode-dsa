class Solution {

    public double getAverage(int left, int right, int[] nums, double result) {
        if (result == Integer.MIN_VALUE) {
            result = 0;
            for (int i = left; i <= right; i++) {
                result += nums[i];
            }
        }
        else{
            result-=nums[left-1];
            result+=nums[right];
        }

        return result;

    }

    public double findMaxAverage(int[] nums, int k) {
        //how to achieve sliding in this problem
        int left = 0;
        int right = k - 1;
        double max_avg = Integer.MIN_VALUE;
        double avg = Integer.MIN_VALUE;

        while (right < nums.length) {
            avg = getAverage(left, right, nums, avg);
            max_avg = Math.max(max_avg, avg);
            left++;
            right++;
        }

        return max_avg / (right - left + 1);

    }
}