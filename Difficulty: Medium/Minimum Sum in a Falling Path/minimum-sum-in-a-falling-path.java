class Solution {
    public int minFallingPathSum(int[][] mat) {
        // code here
        int n=mat.length;
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<n;i++){
            dp[0][i]=mat[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    dp[i][j]=mat[i][j]+Math.min(dp[i-1][j],dp[i-1][j+1]);;
                }
                else if(j==n-1){
                    dp[i][j]=mat[i][j]+Math.min(dp[i-1][j],dp[i-1][j-1]);
                }else{
                    int ld=Math.min(dp[i-1][j],dp[i-1][j-1]);
                    int rd=Math.min(dp[i-1][j],dp[i-1][j+1]);
                    int min=Math.min(ld,rd);
                   dp[i][j]=mat[i][j]+min; 
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,dp[n-1][i]);
        }
        return ans;
        
    }
}
