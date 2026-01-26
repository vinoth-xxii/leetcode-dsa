class Solution {
    public int[] twoSum(int[] nums, int target) {
    //by using the 2nd hint, if i do subtract target - x = y
    //what will be time complexity of finding the y?
    //from example 2; 6 - 3's 3 and is not present(how to effectly find this)
    int arr_len = nums.length;

    HashMap<Integer, Integer> dict = new HashMap<>();
    for(int i = 0; i < arr_len; i++) dict.put(nums[i],i); //key, value ~ data,index
    int y;
    for(int i = 0; i<arr_len - 1; i++){
        y = target - nums[i];
        if(dict.containsKey(y) && dict.get(y) != i) return new int[]{dict.get(y),i}; 
    }
    return null;
    }
}