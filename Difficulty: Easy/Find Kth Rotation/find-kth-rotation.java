class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int i;
        int index=0;
        int n=arr.length;
        int min=arr[0];
        for(i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
                break;
            }
        }
        return index;
    }
}