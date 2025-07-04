class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int array[] = new int[2];
        long sum = 0;
        long sumSquare = 0;
        long n = grid.length * grid.length;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
                sumSquare += (long)grid[i][j] * (long)grid[i][j];  // long * long 
            }
        }

        long expectedSum = n * (n + 1) / 2;
        long expectedSquareSum = n * (n + 1) * (2 * n + 1) / 6;

        long val1 = sum - expectedSum;              // x - y
        long val2 = sumSquare - expectedSquareSum;  // x^2 - y^2

        long xPlusY = val2 / val1;                  // x + y
        long repeated = (val1 + xPlusY) / 2;        // x
        long missing = repeated - val1;             // y

        array[0] = (int) repeated;
        array[1] = (int) missing;

        return array;
    }
}
