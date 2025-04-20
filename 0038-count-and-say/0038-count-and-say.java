class Solution {
    public String countAndSay(int n) {
        StringBuilder str = new StringBuilder("1");
        if (n == 1) return str.toString();

        while (--n > 0) {
            StringBuilder temp = new StringBuilder();
            int cnt = 1;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    cnt++;
                } else {
                    temp.append(cnt).append(str.charAt(i - 1));
                    cnt = 1;
                }
            }
            temp.append(cnt).append(str.charAt(str.length() - 1));
            str = temp;
        }

        return str.toString();
    }
}