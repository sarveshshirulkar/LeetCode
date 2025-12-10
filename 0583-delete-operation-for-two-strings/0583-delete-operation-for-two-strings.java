class Solution {
    static int memoFun(String word1, String word2, int n, int m, int[][] dp){
        if(n < 0 || m < 0) return 0;
        if(dp[n][m] != -1) return dp[n][m];
        // int take = 0, notTake = 0;
        if(word1.charAt(n) == word2.charAt(m)){
            return dp[n][m] = 1 + memoFun(word1, word2, n-1, m-1, dp);
        }else{
            dp[n][m] = Math.max(memoFun(word1, word2, n-1, m, dp), memoFun(word1, word2, n, m-1, dp));
        }
        return dp[n][m];
      
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];
        for(int[] row : dp) Arrays.fill(row, -1);
        int lcs = memoFun(word1, word2, n-1, m-1, dp);
        return n+m - (2*lcs);
    }
}