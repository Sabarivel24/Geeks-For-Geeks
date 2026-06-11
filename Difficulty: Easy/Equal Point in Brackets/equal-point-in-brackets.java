class Solution {
    public int findIndex(String s) {
        // code here
        int s1=0;
        int s2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                s2++;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s1==s2){
                return i;
            }
            if(s.charAt(i)=='(')s1++;
            if(s.charAt(i)==')')s2--;
            
        }
        return s.length();
    }
}