class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        boolean isNegative = false;
        int index = 0;
        if(!s.isEmpty() && s.charAt(0) == '-') isNegative = true;
        if(!s.isEmpty() && s.charAt(0) == '+') index = 1;

        if(isNegative){
            index = 1;
        }

        int ans = 0;
        for(int i=index; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!Character.isDigit(ch)) break;
            if (ans > (Integer.MAX_VALUE - (ch - '0')) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans *= 10;
            ans += ch - '0';
        }
        return isNegative ? (-1)*ans : ans;
    }
}