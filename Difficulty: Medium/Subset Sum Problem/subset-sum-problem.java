class Solution {
  
   
    
static boolean func(int i,int arr[],int s,int dp[][]){
   
    if(i==arr.length){
        if(s==0)return true;
        return false;
    }
 
    if(s<0)return false;
      if(dp[i][s]!=-1)return dp[i][s]==1;
    boolean t=func(i+1,arr,s-arr[i],dp);
    boolean nt=func(i+1,arr,s,dp);
    dp[i][s]=(t||nt)?1:0;
    return dp[i][s]==1;
}
     static Boolean isSubsetSum(int arr[], int sum) {
       int n=arr.length;
       int dp[][]=new int[arr.length][sum+1];
       for(int i=0;i<arr.length;i++){
           Arrays.fill(dp[i],-1);
       }
       return func(0,arr,sum,dp);
     }
}