class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>() ;

        for(int i=0 ; i<9 ; i++){
            for(int j=0 ; j<9 ; j++){
                char a  = board[i][j] ;

                if(a=='.'){
                    continue ;
                }
                String row = a + " row - " + i ;
                String col = a + " col - " + j ;
                String box = a + " box - " + (i/3) + "-" + (j/3) ;

                if(set.contains(row) || set.contains(col) || set.contains(box)){
                    return false ;
                }

                set.add(row) ;
                set.add(col) ;
                set.add(box) ;
            }

        }
        return true ;
    }
}
