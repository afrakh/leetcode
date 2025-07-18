class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> newMatrix = new ArrayList<>();

        int startRow = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        int startCol = 0;

        while (startRow <= endRow && startCol <= endCol){
            //top
            for (int j = startCol; j <= endCol; j++){
                newMatrix.add(matrix[startRow][j]);
            }

            //right
            for (int i = startRow + 1; i <= endRow; i++){
                newMatrix.add(matrix[i][endCol]);
            }

            //bottom
            for (int j = endCol - 1; j >= startCol; j--){
                if (startRow < endRow){
                    newMatrix.add(matrix[endRow][j]);
                }
            }

            
            //left
            for (int i = endRow - 1; i >= startRow + 1; i--){
                if (startCol < endCol){
                    newMatrix.add(matrix[i][startCol]);
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
        return newMatrix;
    }

    
}
