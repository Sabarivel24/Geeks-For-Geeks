class Solution {
    public static boolean matSearch(int arr[][], int x) {
        boolean p=false;
        int c=0;
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               res.add(arr[i][j]);
               c++;
            }
        }
        int s=0;
        int e=c-1;
        while(s<=e){
            if(res.get(s)==x ||res.get(e)==x){
            p=true;
            return p;
            }
            s++;
            e--;
        }
        return p;
        
    }
}