class Solution {
    public int maxProduct(int[] nums) {
        //Trying to solve it using 2nd largest element - O(n) time
        Integer first_max, second_max;
        first_max = null; second_max = null;
        for(Integer num : nums){
            if(first_max == null || num > first_max){
                second_max = first_max;
                first_max = num;
            }
            else if(second_max == null || num > second_max){
                second_max = num;
            }
        }
        return (first_max-1)*(second_max-1);
    }
}