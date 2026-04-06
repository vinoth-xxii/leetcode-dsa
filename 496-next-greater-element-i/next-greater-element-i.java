// I am going to find it's index, and find the next largest
// Time : O(n × m); Space : O(n)
class Solution {

    public int getIndex(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return arr.length - 1;
    }

    public int getMax(Stack<Integer> stack, int target){
        int res = -1;
        while(!stack.isEmpty()){
            int num = stack.pop();
            if(num > target){
                res = num;
            }            
        }
        return res;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int index = getIndex(nums1[i], nums2);
            Stack<Integer> stack = new Stack<>();
            for(int k = index + 1; k < nums2.length; k++){
                stack.push(nums2[k]);
            }
            int max = getMax(stack, nums1[i]);
            ans[i] = max;
        }

        return ans;
    }
}  