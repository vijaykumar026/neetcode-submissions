class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0 ;
        int freq[] = new int[26] ;
        int j = 0 ;
        int maxFreq = 0 ;
        for(int i=0 ; i<s.length();i++){
            char ch = s.charAt(i) ;

            freq[ch-'A']++ ;
            maxFreq = Math.max(maxFreq, freq[ch-'A']) ;

            while((i-j+1)-maxFreq>k){

                freq[s.charAt(j)-'A']-- ;
                j++ ;
            }
            ans = Math.max(ans,(i-j+1)) ;
        }
        return ans ;
    }
}
