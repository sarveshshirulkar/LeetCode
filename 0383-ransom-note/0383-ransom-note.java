class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] targetString = new int[26];
        int[] magazineString = new int[26];

        for(int i=0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            targetString[ch - 'a']++;
        }
        for(int i=0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            magazineString[ch - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(magazineString[i] < targetString[i]) return false;
        }
        return true;
    }
}