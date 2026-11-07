class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length] ;

        ans[0] = 1 ;
        for(int i=1 ; i<nums.length ; i++){
            ans[i] = ans[i-1]*nums[i-1] ;
        }

        int[] suf = new int[nums.length] ;

        suf[nums.length-1] = 1 ;
        for(int i=nums.length-2 ; i>=0 ; i--){
            suf[i] = suf[i+1]*nums[i+1] ;
            ans[i] = ans[i]*suf[i] ;
        }

        return ans ;
    }
}  
