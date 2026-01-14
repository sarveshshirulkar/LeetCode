class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "").trim();
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)) return false;
        }
        return true;
    }
}