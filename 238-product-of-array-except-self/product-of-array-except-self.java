class Solution {
    public int[] productExceptSelf(int[] nums) {
        //mentioned O(n); 2 * O(n) is valid
        int[] preProd, postProd;
        preProd = nums.clone();
        postProd = nums.clone();
        
        for(int i = 1; i < preProd.length; i++){
            preProd[i] *= preProd[i-1];
        }

        for(int j = postProd.length - 1; j > 0; j--){
            postProd[j-1] *= postProd[j];
        }

        for(int k = 0; k < nums.length; k++){
            if(k == 0) nums[k] = postProd[k+1];
            else if(k == nums.length - 1) nums[k] = preProd[k-1];
            else nums[k] = preProd[k-1] * postProd[k+1];
        }

        return nums;
    }
}