class Solution {
    public static int findSum(int n) {
        // code here
                if(n==1)return n;
        
        return findSum(n-1)+n;

        
    }
}
