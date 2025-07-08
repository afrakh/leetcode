class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0, width, currArea, hgt;
        int left = 0, right = n - 1;

        while (left < right) {
            hgt = Math.min(height[left], height[right]);
            width = right - left;
            currArea = width * hgt;
            maxArea = Math.max(currArea, maxArea);

            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
