class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int trappedRainWater = 0;
        int waterLevel;
        int leftMaxBoundary[] = new int[n];
        int rightMaxBoundary[] = new int[n];

        // form left max boundary

        leftMaxBoundary[0] = height[0];
        for (int i = 1; i <= n - 1; i++){
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i - 1]);
        }

        // form right max boundary

        rightMaxBoundary[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--){
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i + 1]);
        }

        //loop

        for (int i = 0; i <= n - 1; i++){
            //calculate water level
            waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]) - height[i];

            //calculate trapped rain water
            trappedRainWater += waterLevel;
        }

        return trappedRainWater;
    }
}
