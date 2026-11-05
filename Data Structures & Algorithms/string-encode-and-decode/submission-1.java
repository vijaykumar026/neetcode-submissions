class Solution {

    public String encode(List<String> strs) {
        String str = "" ;
        for(String s : strs){
            str += s.length()+"#"+s ;
        }
        return str ;

    }

    public List<String> decode(String str) {
        int i=0 ;
        List<String> ans = new ArrayList<>() ;

        while(i<str.length()) {
            int j = str.indexOf('#',i) ;

            int len = Integer.parseInt(str.substring(i,j)) ;

            String s = str.substring(j+1,j+1+len) ;
            ans.add(s) ;
            i = j+1+len ;
        }
        return ans ;
    }
}
