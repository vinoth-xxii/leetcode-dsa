class Solution {
    public int thirdMax(int[] nums) {
        Integer first, second, third;
        first = null; second = null; third = null;
        for(Integer num : nums){

            // if(first == num || second == num || third == num) continue; null == num X
            //if(first.equals(num) || second.equals(num) || third.equals(num)) continue;
            if(num.equals(first) || num.equals(second) || num.equals(third)) continue;
            
            if(first == null || num > first){
                third = second;
                second = first;
                first = num;
                continue;
            }
            if(second == null || num > second && first != num){
                third = second;
                second = num;
                continue;
            }

            if(third == null || num > third && first != num && second != num){
                third = num;
                continue;
            }
        }
        if(third != null) return third;
        return first;
    }
}