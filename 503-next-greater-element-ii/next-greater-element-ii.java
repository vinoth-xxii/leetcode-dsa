class Solution {

    public int getNextMax(int index, int[] arr){ //O(N)

        int size = arr.length;
        int curr =  (index + 1) % size;   //i need this to be next
        int max = -1;

        while(curr != index){
            if(arr[curr] > arr[index]){
                max = arr[curr];
                return max;
            }
            curr =  (curr + 1) % size;
        }
        return max;
    }

    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length]; //O(N)
        for(int i = 0; i < nums.length; i++){ //O(N)
            result[i] = getNextMax(i, nums);
        }
        return result;
    }
}