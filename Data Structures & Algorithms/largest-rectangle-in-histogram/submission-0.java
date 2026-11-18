class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length ;
        Stack<Integer> stack = new Stack<>() ;
        int left[] = new int[n] ;

        for(int i=0 ; i<n ; i++){
            while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop() ;
            }
            if(stack.isEmpty()){
                left[i] = -1 ;
            }
            else{
                left[i] = stack.peek() ;
            }
            stack.push(i) ;
        }

        while(!stack.isEmpty()){
            stack.pop() ;
        }

        int right[] = new int[n] ;

        for(int i=n-1 ; i>=0 ; i--){
            while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop() ;
            }
            if(stack.isEmpty()){
                right[i] = n ;
            }
            else{
                right[i] = stack.peek() ;
            }
            stack.push(i) ;

        }

        int max = 0 ;
        for(int i=0 ; i<n ; i++){
            int width = right[i] - left[i]-1 ;
            int area = heights[i] * width ;
            max = Math.max(max,area) ;
        }

        return max ;
    }
}
