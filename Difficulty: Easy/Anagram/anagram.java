class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int[] freq=new int[26];
        for(char c:s1.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:s2.toCharArray()){
            freq[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}