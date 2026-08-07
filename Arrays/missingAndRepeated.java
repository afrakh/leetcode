import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int missing_val = 0;
        int repeating_val = 0;
        int actual_sum = 0;
        int expected_sum = (n*n*((n*n) + 1)) / 2;
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                actual_sum += grid[i][j];
                if (!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                } else {
                    repeating_val = grid[i][j];
                }
            }
        }

        missing_val = expected_sum + repeating_val - actual_sum;

        int[] ans = {repeating_val, missing_val};
        return ans;

    }
}
