class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        int p1 = 0, p2 = 0;
        if(sLen > tLen) return false;
        if(sLen == 0 || tLen == 0) return true;
        for(int i=0; i<tLen; i++){
            if(s.charAt(p1) == t.charAt(p2)){
                p1++;
                p2++;
            }else{
                p2++;
            }if(p1 >= sLen) return true;
        }
        return false;
    }
}