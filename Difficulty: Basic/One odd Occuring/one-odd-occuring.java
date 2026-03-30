class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
  int res=0;
  for(int x:arr){
      res^=x;
  }
      return res;  
    }
}