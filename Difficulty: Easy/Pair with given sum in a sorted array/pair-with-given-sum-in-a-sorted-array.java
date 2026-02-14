// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int count=0;
        int l=0;
        int h=arr.length-1;
        while(l<h){
            if((arr[l]+arr[h])==target){
              if(arr[l]==arr[h]){
                  int n=h-l+1;
                  count+=(n*(n-1))/2;
                  break;
              }
              int x=arr[l];
              int y=arr[h];
              int cnt1=0;
              int cnt2=0;
              while(l<=h && arr[l]==x){
                  cnt1++;
                  l++;
              }
              while(l<=h && arr[h]==y){
                  cnt2++;
                  h--;
              }
              count+=cnt1*cnt2;
            }
            else if((arr[l]+arr[h])>target){
                h--;
            }
            else if((arr[l]+arr[h])<target){
                l++;
            }
        }
        return count;
    }
}
