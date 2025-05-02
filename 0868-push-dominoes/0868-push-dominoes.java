class Solution {
    public String pushDominoes(String dom) {
        String s = "L" + dom + "R";
        StringBuilder res = new StringBuilder();
        int prev = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '.') continue;

            int span = i - prev - 1;

            if (prev > 0) {
                res.append(s.charAt(prev));
            }

            if (s.charAt(prev) == s.charAt(i)) {
                for (int j = 0; j < span; j++) {
                    res.append(s.charAt(prev));
                }
            } else if (s.charAt(prev) == 'L' && s.charAt(i) == 'R') {
                for (int j = 0; j < span; j++) {
                    res.append('.');
                }
            } else {
                int half = span / 2;
                for (int j = 0; j < half; j++) res.append('R');
                if (span % 2 == 1) res.append('.');
                for (int j = 0; j < half; j++) res.append('L');
            }

            prev = i;
        }

        return res.toString();
    }
}