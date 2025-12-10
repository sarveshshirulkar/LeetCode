class Solution {
    static int memoFun(int n, int m, String s, String t, int[][] dp){
        if(n < 0 || m < 0) return 0;
        if(dp[n][m] != -1) return dp[n][m];
        int take = 0, notTake = 0;
        if(s.charAt(n) == t.charAt(m)){
            take = 1 + memoFun(n-1, m-1, s, t, dp);
        }else{
            notTake = Math.max(memoFun(n-1, m, s, t, dp), memoFun(n, m-1, s, t, dp));
        }
        return dp[n][m] = Math.max(take, notTake);
    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String t = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[n][n];
        for(int[] row : dp) Arrays.fill(row, -1);
        return memoFun(n-1, n-1, s, t, dp);
    }
}