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

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int index = getIndex(nums1[i], nums2);
            int max = nums1[i];
            for(int k = index + 1; k < nums2.length; k++){
                int prev_temp = max;
                max = Math.max(max, nums2[k]);
                if(prev_temp != max){
                    break;
                }
            }
            ans[i] = (max == nums1[i]) ? -1 : max;
        }

        return ans;
    }
}