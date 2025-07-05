class Solution {

    public boolean binSearchRow(int[] row, int target){
        int low = 0;
        int high = row.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (row[mid] == target) {
                return true;
            } else if (row[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        int mid;
        for (int row = 0; row < matrix.length; row++){
            while (low <= high){
                mid = (low + high) / 2;
                if (target <= matrix[mid][matrix[0].length - 1] && target >= matrix[mid][0]){
                    return binSearchRow(matrix[mid], target);
                } else if (target < matrix[mid][0]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

        }

        return false;
    }

}
