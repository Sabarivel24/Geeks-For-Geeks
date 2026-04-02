class Solution {
    public static String removePair(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(st.isEmpty())st.push(c);
            else{
                char c1=st.peek();
                if(c==c1)st.pop();
                else
                st.push(c);
            }
        }
        String s1="";
        while(!st.isEmpty()){
            s1+=st.pop();
        }
        String rev=new StringBuilder(s1).reverse().toString();
        return rev;
    }
}