class Solution {
    public int missingNumber(int[] arr) {
       Arrays.sort(arr);
       int exp=1;
       for(int i=0;i<arr.length;i++){
           if(arr[i]<=0)continue;
           if(arr[i]==exp){
               exp++;
           }else if(arr[i]>exp){
               return exp;
           }
           
           }
           return exp;
       }
    }