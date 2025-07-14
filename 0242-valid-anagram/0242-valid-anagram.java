class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = new char[26];
        char[] tArr = new char[26];

        if(s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++){
            sArr[s.charAt(i) - 'a']++;
            tArr[t.charAt(i) - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(sArr[i] != tArr[i]) return false;
        }

        return true;
    }
}