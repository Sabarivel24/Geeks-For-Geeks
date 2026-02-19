// User function Template for Java

class Solution {
    boolean isDivisible(String s) {
        // code here
        int n=s.length();
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                if((n-i-1)%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        return Math.abs(odd-even)%3==0;
    }
}