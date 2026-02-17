// User function Template for Java

class Solution {
    public int longestCommonPrefix(String s1, String s2) {
        // code here
        int n=s1.length();
        for(int i=n;i>0;i--){
            String ans=s1.substring(0,i);
            if(s2.contains(ans)){
                return i;
            }
        }
        return 0;
    }
}