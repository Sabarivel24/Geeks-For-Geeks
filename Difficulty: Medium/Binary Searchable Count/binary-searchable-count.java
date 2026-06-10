class Solution {
    public boolean bs(int x,int[] a){
        int l=0;
        int r=a.length-1;
        //int m=(l+r)/2;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){
                return true;
            }
            else if(a[m]<x){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return false;
    }
    public int binarySearchable(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(bs(arr[i],arr)){
                count++;
            }
        }
        
        return count;
    }
}