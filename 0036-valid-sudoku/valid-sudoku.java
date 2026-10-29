class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashSet<Character>> rows = new ArrayList<>();
        ArrayList<HashSet<Character>> cols = new ArrayList<>();
        HashSet<Character>[][] sub_grid = new HashSet[3][3];

        int row = board.length;
        int col = board[0].length;

        for(int i =0;i<row;i++){
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
        }

        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                sub_grid[i][j] = new HashSet<>();
            }
        }

        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                char num = board[i][j];

                if(num == '.'){
                    continue;
                }

                if(rows.get(i).contains(num)){
                    return false;
                }

                if(cols.get(j).contains(num)){
                    return false;
                }

                if(sub_grid[i/3][j/3].contains(num)){
                    return false;
                }

               rows.get(i).add(num);
               cols.get(j).add(num);
               sub_grid[i/3][j/3].add(num);
            }
        }
        return true;
        
    }
}
