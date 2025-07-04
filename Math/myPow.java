class Solution {
    public double myPow(double x, int n) {
        double ans = 1;

        long binForm = n;
        if (binForm < 0) {
            binForm = -binForm;
            x = 1 / x;
        }
        while (binForm > 0){
            if ((binForm & 1) != 0){
                ans = ans * x;
            }
            x = x * x;
            binForm = binForm >> 1;
        }
        return ans;
    }
}