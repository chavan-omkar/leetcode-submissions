class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int col = matrix[0].length;
        boolean isFirstRowHasZero = false;
        boolean isFirstColHasZero = false;

        for (int i = 0; i < col; i++) {
            if (matrix[0][i] == 0) {
                isFirstRowHasZero = true;
                break;
            }
        }

        for(int j = 0;j<rows;j++){
            if(matrix[j][0] == 0){
                isFirstColHasZero = true;
                break;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < col; j++) {

                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;

                }
            }

        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isFirstRowHasZero) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }

        if (isFirstColHasZero) {
            for (int j = 0; j < rows; j++) {
                matrix[j][0] = 0;
            }
        }

    }
}
