
class Solution {
    public static int overlapInt(int[][] arr) {
        // code here
        int n=arr.length;
        int[] s=new int[n];
        int[] e=new int[n];
        for(int i=0;i<n;i++){
            s[i]=arr[i][0];
            e[i]=arr[i][1];
        }
        Arrays.sort(s);
        Arrays.sort(e);
        int i=0;
        int j=0;
        int overlap=0;
        int max=0;
        while(i<n && j<n){
            if(s[i]<=e[j]){
                overlap++;
                max=Math.max(max,overlap);
                i++;
            }
            else{
                overlap--;
                j++;
            }
        }
        return max;
    }
}
