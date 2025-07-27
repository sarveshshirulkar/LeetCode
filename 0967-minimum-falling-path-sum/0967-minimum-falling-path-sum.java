class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n+2];
        // for(int i=0; i< n; i++){
        //     dp[i][0] = Integer.MAX_VALUE;
        //     dp[i][n-1] = Integer.MAX_VALUE;
        // }
        for(int[] row : dp) Arrays.fill(row, Integer.MAX_VALUE);

        for(int i=0; i<n; i++) dp[0][i+1] = matrix[0][i];
        for(int i=1; i<m; i++){
            for(int j=1; j<=n; j++){
                dp[i][j] = matrix[i][j-1] + Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i-1][j+1]));
            }
        }
        int mini = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++) mini = Math.min(mini, dp[m-1][i]);
        return mini;
    }
}