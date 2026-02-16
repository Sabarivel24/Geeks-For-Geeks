
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        //Without duplicates
        /*int m=a.length;
        int n=b.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<m;i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(!set.contains(b[i])){
                return false;
            }
        }
        return true;*/
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:a){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:b){
            if(!map.containsKey(n)||map.get(n)==0){
                return false;
            }
            map.put(n,map.get(n)-1);
        }
        return true;
    }
}
