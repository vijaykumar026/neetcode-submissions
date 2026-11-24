class TimeMap {
    HashMap<String ,List<Pair<Integer,String>>>timeMap;
    public TimeMap() {
        timeMap= new HashMap<>() ;
    }
    
    public void set(String key, String value, int timestamp) {
        timeMap.putIfAbsent(key,new ArrayList<>()) ;
        timeMap.get(key).add(new Pair<>(timestamp,value)) ;
    }
    
    public String get(String key, int timestamp) {
        if(!timeMap.containsKey(key)){
            return "" ;
        }
        
        List<Pair<Integer,String>> list = timeMap.get(key) ;

        int left = 0 ;
        int right = list.size()-1 ;
        String ans = "" ;

        while(left <= right){
            int mid = left+(right-left)/2 ;
            int time = list.get(mid).getKey() ;
            if(time <= timestamp){
                ans = list.get(mid).getValue() ;
                left = mid+1 ;
            }
            else{
                right = mid-1 ;
            }
        }
        return ans ;
    }
}
