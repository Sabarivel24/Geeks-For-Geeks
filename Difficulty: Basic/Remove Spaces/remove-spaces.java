// User function Template for Java
class Solution {

    String modify(String s) {
        // your code here
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(!Character.isWhitespace(c))
            {
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}