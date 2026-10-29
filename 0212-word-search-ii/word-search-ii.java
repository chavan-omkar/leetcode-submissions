class Solution {
    private static class TrieNode{
        TrieNode[] children = new TrieNode[26];
        String word = null;
    }

    private TrieNode buildTrie(String[] words){
        TrieNode node = new TrieNode();
        for(String word : words){
           TrieNode curr = node;
           for(char c : word.toCharArray()){
            int index = c-'a';

            if(curr.children[index] == null){
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];

           }
           curr.word = word;
        }
        return node;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        TrieNode root = buildTrie(words);
        int row = board.length;
        int col = board[0].length;

        for(int i = 0; i <row;i++ ){
            for(int j = 0;j<col;j++){
                dfs(board,i,j,result,root);
            }
        }

        return result;
        
    }

    private void dfs(char[][] board, int row, int col,List<String>result, TrieNode node){
        char c = board[row][col];

        if(c == '#' || node.children[c-'a'] == null) return;

        node = node.children[c-'a'];

        if(node.word != null){
            result.add(node.word);
            node.word = null;
        }

        board[row][col] = '#';

        if(row > 0) dfs(board,row-1,col,result,node);
        if(col > 0) dfs(board,row,col-1,result,node);
        if(row < board.length-1) dfs(board,row+1,col,result,node);
        if(col < board[0].length-1) dfs(board,row,col+1,result,node);

        board[row][col] = c;

    }
}
