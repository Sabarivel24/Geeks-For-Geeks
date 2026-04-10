class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int hash1[]=new int[26];
       
        if(s1.length()!=s2.length())return false;
     
        for(char x:s1.toCharArray()){
            hash1[x-'a']++;
        }
        for(char x:s2.toCharArray()){
            hash1[x-'a']--;
        }
        
      for(char x:s1.toCharArray()){
          if(hash1[x-'a']!=0)return false;
      }
      return true;
    }
}