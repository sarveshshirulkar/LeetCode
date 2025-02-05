class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return true;

        int firstMismatchIndex = -1, secondMismatchIndex = -1;
        int mismatches = 0;

        for(int i=0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 != c2){
                secondMismatchIndex = firstMismatchIndex;
                firstMismatchIndex = i;
                mismatches++;
            }
        }
        if(mismatches == 2 && s1.charAt(secondMismatchIndex) == s2.charAt(firstMismatchIndex)
                    && s1.charAt(firstMismatchIndex) == s2.charAt(secondMismatchIndex)){
            return true;
        }
        return false;
    }
}