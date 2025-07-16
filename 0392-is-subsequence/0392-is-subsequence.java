class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n == 0 && m == 0) return true;
        if(m == 0) return false;
        if(n == 0 ) return true;
        int index = 0;
        for(int i=0; i<m; i++){
            char c1 = s.charAt(index);
            char c2 = t.charAt(i);

            if(c1 == c2){
                index++;
            }
            if(index == n) return true;
        }
        return false;
    }
}