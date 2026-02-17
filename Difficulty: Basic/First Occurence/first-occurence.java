class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        for(int i=0;i<txt.length()-pat.length()+1;i++){
            if(txt.charAt(i)==pat.charAt(0)){
                if(txt.substring(i,pat.length()+i).equals(pat)){
                    return i;
                }
            }
        }
        return -1;
    }
}