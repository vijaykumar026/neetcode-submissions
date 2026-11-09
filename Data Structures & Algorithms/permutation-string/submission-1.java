class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false ;
        }

        int freq1[] = new int[26] ;
        int freq2[] = new int[26] ;

        for(char c : s1.toCharArray()){
            freq1[c-'a']++ ;
        }

        int j=0 ;
        for(int i=0 ; i<s2.length() ; i++){
            char c = s2.charAt(i) ;
            freq2[c-'a']++ ;

            if(i-j+1>s1.length()){
                freq2[s2.charAt(j)-'a']-- ;
                j++ ;
            }

            if(i-j+1 == s1.length()){
                if(Arrays.equals(freq1,freq2)){
                    return true ;
                }
            }
        }
        return false ; 
    }
}
