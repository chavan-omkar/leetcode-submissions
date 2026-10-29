class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int isLandCount = 0;
        int row = grid.length;
        int col = grid[0].length;

       

        for(int i = 0; i< row;i++){
            for(int j = 0;j<col;j++){
                if(grid[i][j] == '1'){
                    isLandCount++;
                    sunkIsland(grid,i,j);
                    
                }
            }
        }

        return isLandCount;

        
    }

    private void sunkIsland(char[][]grid, int row, int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') return;

         int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

        grid[row][col] = '0';

        for(int[] dir : directions){
            
            sunkIsland(grid,row+dir[0],col+dir[1]);
        }

    }
}
