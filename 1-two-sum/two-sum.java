class Solution {
    public int[] twoSum(int[] nums, int target) {
    //by using the 2nd hint, if i do subtract target - x = y
    //what will be time complexity of finding the y?
    //from example 2; 6 - 3's 3 and is not present(how to effectly find this)
    int arr_len = nums.length;

    HashMap<Integer, Integer> dict = new HashMap<>();
    for(int i = 0; i < arr_len; i++) dict.put(nums[i],i); //key, value ~ data,index
    
    for(int i = 0; i < arr_len; i++){
        int secondNum = target - nums[i];
        if(dict.containsKey(secondNum) && dict.get(secondNum) != i){ //checks secondNums index & curr index
            return new int[]{i, dict.get(secondNum)};
        }
    }
    return null;
    }
}