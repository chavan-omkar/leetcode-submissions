class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row*col-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            int midValue = matrix[mid/col][mid%col];

            if(midValue == target){
                return true;
            }else if(midValue < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }

    // private boolean dfs(int[][] matrix,int target, int row, int col){
    //     if(col < 0 || col >= matrix[0].length){
    //         return false;
    //     }

    //     if(matrix[row][col] == target){
    //         return true;
    //     }

    //     return dfs(matrix,target,row,col+1);


    // }
}
