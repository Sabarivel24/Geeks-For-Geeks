class Solution {
    public boolean kSubstr(String s, int k) {
        // code here
        int n=s.length();
        if(n%k!=0)return false;
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i=i+k){
            String res=s.substring(i,i+k);
            map.put(res,map.getOrDefault(res,0)+1);
        }
        if(map.size()==1)return true;
        if(map.size()>2)return false;
        
        int totalblock=n/k;
        for(int freq:map.values()){
            if(freq==1 || freq==totalblock-1){
                return true;
            }
        }
        return false;
    }
}