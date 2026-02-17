class Solution {
    public void sort012(int[] arr) {
        // code here
        int c0=0;
        int c1=0;
        int c2=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        for(int j=0;j<c0;j++){
            arr[j]=0;
        }
        for(int j=c0;j<c0+c1;j++){
            arr[j]=1;
        }
        for(int j=c0+c1;j<n;j++){
            arr[j]=2;
        }
    }
}