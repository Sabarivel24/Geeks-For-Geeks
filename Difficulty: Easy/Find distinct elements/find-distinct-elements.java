// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        // code here
        Arrays.sort(arr);
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}