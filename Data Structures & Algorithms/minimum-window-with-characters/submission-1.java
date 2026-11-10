class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "" ;
        }

        int freq[] = new int[128] ;
        for(char c : t.toCharArray()){
            freq[c]++ ;
        }

        int req = t.length() ;
        int start = 0 ;
        int minLen = Integer.MAX_VALUE ;
        int left = 0 ;

        for(int rig=0 ; rig<s.length() ;rig++){
            char ch = s.charAt(rig) ;
            if(freq[ch]>0){
                req-- ;
            }

            freq[ch]-- ;

            while(req == 0){
                
                if((rig-left+1)<minLen){
                    minLen = rig-left+1 ;
                    start = left ;
                }

                char leftCh = s.charAt(left) ;
                
                freq[leftCh]++ ;
                if(freq[leftCh]>0){
                    req++ ;
                }

                left++ ;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen) ;
    }
}
