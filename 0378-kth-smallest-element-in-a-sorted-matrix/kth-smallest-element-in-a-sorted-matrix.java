class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // int n = matrix.length;
        // PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0] - b[0]);
        // boolean[][] visitedMatrix = new boolean[n][n];

        // pq.offer(new int[]{matrix[0][0],0,0});
        // visitedMatrix[0][0] = true;
        // int counter = 0;
        // int result = -1;
        // while(!pq.isEmpty()){
        //     counter++;
        //      int[] curr = pq.poll();
        //      int val = curr[0];
        //      int row = curr[1];
        //      int col = curr[2];

        //     if(counter == k){
        //         result = val;
        //         break;
        //     }

        //     if(col+1 < n && !visitedMatrix[row][col+1]){
        //         pq.offer(new int[]{matrix[row][col+1],row,col+1});
        //         visitedMatrix[row][col+1] = true;

        //     }
        //     if(row+1 < n && !visitedMatrix[row+1][col]){
        //         pq.offer(new int[]{matrix[row+1][col],row+1,col});
        //         visitedMatrix[row+1][col] = true;

        //     }

        // }

        // return result;


        int m = matrix.length;
        int n = matrix[0].length;
        int left  = matrix[0][0];
        int  right = matrix[m-1][n-1];

        while(left < right){
            int mid = left+(right-left)/2;
            int count = helper(matrix,mid,m,n);
            if(count < k){
                left = mid+1;
            }else{
                right = mid;
            }

        }
        return left;
    }

    private int helper(int[][] matrix, int mid, int m, int n){
        int count = 0;
        int i = m-1;
        int j = 0;
        while(i>=0 && j <n){
            if(matrix[i][j]<= mid){
                count += i+1;
                j++;
            }else{
                i--;
            }
        }
        return count;
    }
}
