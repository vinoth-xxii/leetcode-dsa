class Solution {

    private int[] shiftRight(int[] arr, int m, int left) { //mind m could lead to indexOutOfBound
        for (int i = m; i > left; i--) {
            arr[i] = arr[i - 1];
        }
        return arr;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left, right;
        left = 0;
        right = 0;
        while (right < n) {
            if (left < m) {
                if (nums1[left] < nums2[right]) {
                    left++;
                } else { //i have to update m, as to maintain the while loop
                    nums1 = shiftRight(nums1, m, left);
                    nums1[left++] = nums2[right++];
                    m++;
                }
            }
            else{ //(left < nums1.length)
                nums1[left++] = nums2[right++];
            }
        }

        }
    }