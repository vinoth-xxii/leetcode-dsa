class Solution {
    //using the logic from 'finding the third heighest'
    public int findNonMinOrMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int num : nums){
            if(num > first){
                third = second;
                second = first;
                first = num;
            }
            else if(num > second){
                third = second;
                second = num;
            }
            else if(num > third){
                third = num;
            }
        }

        if(third == Integer.MIN_VALUE){
            return -1;
        }
        else{
            return second;
        }
    }
}