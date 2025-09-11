class Solution {
    public void helper(int[][] image, int sr, int sc, int color, int orgColor, boolean[][] vis){
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || vis[sr][sc] || 
        image[sr][sc] != orgColor){
            return;
        }

        vis[sr][sc] = true;
        image[sr][sc] = color;

        // up
        helper(image, sr - 1, sc, color, orgColor, vis);

        // down
        helper(image, sr + 1, sc, color, orgColor, vis);

        // left
        helper(image, sr, sc - 1, color, orgColor, vis); 

        // right
        helper(image, sr, sc + 1, color, orgColor, vis); 

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgColor = image[sr][sc];
        if (orgColor == color) {
            return image;
        }
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, image[sr][sc], vis);
        return image;
    }
}
