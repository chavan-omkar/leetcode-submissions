class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0 ){
            return 0;
        }

        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]>que = new LinkedList<>();
        int freshOrangeCount = 0;
        for(int i = 0; i<row;i++){
            for(int j = 0; j < col;j++){
                if(grid[i][j] == 1){
                    freshOrangeCount++;
                }else if(grid[i][j] == 2){
                    que.offer(new int[]{i,j});
                }
            }
        }

        if(freshOrangeCount == 0) return 0;

        int minute = 0;
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

        while(!que.isEmpty() && freshOrangeCount > 0){
            minute++;
            int n = que.size();
            for(int i = 0;i<n;i++){
                int[] curr = que.poll();

                for(int[] dir : directions){
                    int nextRow = curr[0] + dir[0];
                    int nextCol = curr[1] + dir[1];

                    if(nextRow >= 0 && nextRow < row && nextCol >= 0 && nextCol < col &&
                    grid[nextRow][nextCol] == 1){
                        grid[nextRow][nextCol] = 2;
                        que.offer(new int[]{nextRow,nextCol});
                        freshOrangeCount--;
                    }
                }

            }

        }

        return freshOrangeCount == 0 ? minute : -1;
        
    }
}
