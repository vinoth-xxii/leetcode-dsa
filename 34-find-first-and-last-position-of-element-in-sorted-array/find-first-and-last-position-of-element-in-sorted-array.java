class Solution {
    // Just tried with divide and conquer approach - no time improvement
    int min = Integer.MAX_VALUE;
    int max = -1;
    int target;
    int arr[];

    public void setMinMax(int left, int right) {
        if (left > right)
            return;

        if (left == right) {
            if (arr[left] == target) {
                if (left < min)
                    min = left;
                if (right > max)
                    max = right;
                return;
            }
            return;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) { //might be optimal compared to previous once
            setMinMax(left, mid);
            setMinMax(mid + 1, right);
        }
        else if(arr[mid] < target)  setMinMax(mid + 1, right);
        else  setMinMax(left, mid);

    }

    public int[] searchRange(int[] nums, int target) {
        this.target = target;
        this.arr = nums;
        int left = 0;
        int right = nums.length - 1;
        setMinMax(left, right);
        if (min == Integer.MAX_VALUE)
            return new int[] { -1, -1 };
        return new int[] { min, max };
    }
}