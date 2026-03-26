class Solution {
    public int[] sieve(int n) {
       boolean[] isp=new boolean[n+1];
       for(int i=2;i*i<=n;i++){
           if(isp[i]==false){
               for(int j=i*i;j<=n;j+=i){
                   isp[j]=true;
               }
           }
       }
       int c=0;
       for(int i=2;i<=n;i++){
           if(!isp[i])c++;
       }
    int[] a=new int[c];
    int k=0;
    for(int i=2;i<=n;i++){
        if(!isp[i]){
            a[k++]=i;
        }
    }
    return a;
    }
}