class Solution {
    public void sortIt(int[] arr) {
        // code here
        
        int n= arr.length;
        
        Arrays.sort(arr);
        int[] ans= new int[n];
        int l=0;
        int r= n-1;
        
        for(int i= n-1; i >= 0; i--){
            
            int temp= arr[i];
            
            if(temp % 2== 0){
                ans[r]= temp;
                r--;
            }
            else{
                ans[l]= temp;
                l++;
            }
        }
        
        for(int i=0; i<n; i++){
           arr[i]= ans[i];
        }

    }
}
