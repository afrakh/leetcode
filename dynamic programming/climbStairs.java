import java.util.*;
class Solution {
    public int returnWays(int ways[], int n){
        if (n == 0){
            return 1;
        }
        if (n < 0){
            return 0;
        }
        if (ways[n] != -1){
            return ways[n];
        } 
        ways[n] = returnWays(ways, n - 1) + returnWays(ways, n - 2);
        return ways[n];
    }
    public int climbStairs(int n) {
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        return returnWays(ways, n);
    }
}