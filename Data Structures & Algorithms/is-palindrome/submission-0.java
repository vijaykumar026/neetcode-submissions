class Solution {
    public boolean isPalindrome(String s) {
        String str = "" ;
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str += c ;
            }
        }
        int i=0 ;
        int j = str.length()-1 ;
        while(i<=j){
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false ;
            }
            i++ ;
            j-- ;
        }
        return true ;
    }
}
