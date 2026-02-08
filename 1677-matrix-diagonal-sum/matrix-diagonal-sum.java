class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            sum+=mat[i][i];
        }
        for(int j = mat.length - 1; j > -1; j--){
            sum+=mat[j][mat.length -1 - j];
        }
        if(mat.length % 2 !=0){
            int index = mat.length / 2;
            sum-=mat[index][index];
        }
        return sum;
    }
}