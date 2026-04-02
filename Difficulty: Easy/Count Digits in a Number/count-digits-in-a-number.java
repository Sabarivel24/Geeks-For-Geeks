class Solution {
    public static int countDigits(int n) {
    if(n==0)return n;
    return 1+countDigits(n/10);
     
        
    }
}