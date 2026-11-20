class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length ;
        int c = matrix[0].length ;
        int i = 0 ; 
        int j = r*c - 1 ;
        while(i<=j){
            int mid = i+(j-i)/2 ;
            int row = mid/c ;
            int col = mid%c ;

            if(matrix[row][col] == target){
                return true ;
            }
            else if(matrix[row][col] < target){
                i = mid+1 ;
            }
            else{
                j = mid-1 ;
            }
        }
        return false ;
    }
}
