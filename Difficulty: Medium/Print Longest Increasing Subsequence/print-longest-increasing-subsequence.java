class Solution {
    public ArrayList<Integer> getLIS(int arr[]) {
        // Code here
        int n=arr.length;
        int[] dp=new int[n];
        int[] prev=new int[n];
        
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        
        int maxi=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if((arr[j]<arr[i])&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                }
            }
            if(dp[i]>dp[maxi]){
                maxi=i;
            }
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=maxi;i!=-1;i=prev[i]){
            res.add(arr[i]);
        }
        Collections.reverse(res);
        return res;
    }
}
