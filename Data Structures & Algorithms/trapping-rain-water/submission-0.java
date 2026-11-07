class Solution {
    public int trap(int[] height) {
        int ans = 0 ;
        int i=0 , j = height.length-1 ;
        int leftMax = 0 ;
        int rightMax = 0 ;
        while(i<j){
            if(height[i]<=height[j]){
                leftMax = Math.max(leftMax,height[i]) ;
                ans += leftMax-height[i] ;
                i++ ;
            }
            else{
                rightMax = Math.max(rightMax,height[j]) ;
                ans += rightMax-height[j] ; 
                j-- ;
            }
        }
        return ans ;
    }
}
