class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        // multiplying the prefix values to answer
        for (int i = 1; i < n; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        // multiplying the suffix values
        for (int j = n - 2; j >= 0; j--){
            suffix *= nums[j + 1];
            ans[j] *= suffix;
        }

        return ans;
    }
}
