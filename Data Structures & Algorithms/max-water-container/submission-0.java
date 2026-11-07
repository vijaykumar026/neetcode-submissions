class Solution {
    public int maxArea(int[] heights) {
        int ans = 0 ;
        int i=0 , j = heights.length-1 ;
        while(i<j){
            int l = Math.min(heights[i],heights[j]) ;
            int b = j-i ;
            int area = l*b ;
            ans = Math.max(area,ans) ;
            if(heights[i]<heights[j]){
                i++ ;
            }
            else{
                j-- ;
            }
        }
        return ans ;
    }
}
