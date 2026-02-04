class Solution {
    public int[] searchRange(int[] nums, int target) {
        //O(n) time approach
        for(int i = 0; i < nums.length; i++){  //O(n) time
            if(nums[i] == target){
                List<Integer> list = new ArrayList<>(); //O(n) space
                list.add(i++);
                while(i < nums.length && nums[i] == target){ //O(n) time
                    list.add(i++);
                }
                //they are just asking the first and last indeces
                return new int[]{list.get(0), list.get(list.size()-1)}; //O(1)
            }
        }
        return new int[]{-1,-1};
    }
}