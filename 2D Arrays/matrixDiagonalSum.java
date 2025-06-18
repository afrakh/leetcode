class Solution {
    public int diagonalSum(int[][] mat) {
        //brute force

        // int sum = 0;
        // int n = mat.length;

        // for (int i = 0; i < n; i++){
        //     for (int j = 0; j < n; j++){
        //         if (i == j){
        //             sum += mat[i][j];
        //         } else if (i + j == n - 1){
        //             sum += mat[i][j];
        //         }
        //     }
        // }
        // return sum;



        //optimal solution

        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++){
            sum += mat[i][i];
            if (i != n - 1 - i)
            sum += mat[i][n - 1 - i];
        }

        return sum;
    }
}
