class Solution {
    public static boolean isDivisible(int[] a,int m,int k){
        int sum=0;
        for(int x:a){
            sum+=(x+m-1)/m;
        }
        return sum<=k;
    }
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int low=1;
        int high=0;
        for(int x:arr){
            high=Math.max(x,high);
        }
        while(low<high){
            int mid=(low+high)/2;
            if(isDivisible(arr,mid,k)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}